package es.elv.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._

/**
	A core plugin allowing scheduling of repeating events.
*/
object Schedule extends Plugin {

	private class StopSchedulingSignal extends RuntimeException

	private case class SchedEv(ms: Long, count: Option[Long], last: Long, code: () => Unit)

	private var schedList: List[SchedEv] = List()

	/**
		Execute the given code block roughly every ms milliseconds,
		if nwscript context is available.
		Call Schedule.stop to prevent further scheduling.
	*/
	def every(ms: Long, what: => Unit) =
		schedList = SchedEv(ms, None, 0, () => {what}) :: schedList

	/**
		Execute the given code block in NWN context roughly every
		ms milliseconds, up to count times.
		Call Schedule.stop to prevent further scheduling.
	*/
	def every(ms: Long, count: Long, what: => Unit) =
		schedList = SchedEv(ms, Some(count), 0, () => {what}) :: schedList

	/**
		Stop scheduling the event the caller is currently processing.
		Undefined behaviour when not inside a SchedEv
	*/
	def stop = throw new StopSchedulingSignal

	def listen(event: Event) = event match {
		case OnNWNContext(self, contextDepth) => {
			val n = System.currentTimeMillis

			val (runnables, nonrunnables) = schedList partition (x => n >= (x.last + x.ms))
			val reassign = runnables map (run =>
				try {
					run.code()

					run count match {
						case Some(1) => None
						case None => Some(SchedEv(run.ms, None, n, run.code))
						case Some(c) => Some(SchedEv(run.ms, Some(c - 1), n, run.code))
					}
				} catch {
					case x: StopSchedulingSignal => None
					case n => {
						log.error("Exception in SchedEv", n)
						None
					}
				}
			) filter (x => x.isDefined) map (x => x.get)

			schedList = reassign ::: nonrunnables
		}
		case _ =>
	}
}


