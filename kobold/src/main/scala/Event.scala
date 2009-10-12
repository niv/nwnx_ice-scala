package es.elv.kobold.events
import scala.collection._

trait Observer {
	def listen(event: Event)
}

trait Event {
	/** override this to false to disable event stopping. */
	val stoppable = true

	/** override this to false to stop profiling this event in EventSource. */
	val profile = true

	private var _stopped = false
	def stop() = synchronized { if (stoppable)
			_stopped = true
		else
			EventSource.log.error("tried to stop non-stoppable event: " + this)
	}
	def stopped = _stopped
}

object EventSource {
	private[events] val log = Kobold.logger()

	private val observers: mutable.ArrayBuffer[Observer] = new mutable.ArrayBuffer()

	private def eventTimeWarnThreshold = Kobold.config.getLong("eventTimeWarnThreshold")
	private def eventAllTimeWarnThreshold = Kobold.config.getLong("eventAllTimeWarnThreshold")

	def register(observer: Observer) {
		if (!observers.contains(observer))
			observers += observer
		log.info("Added observer: " + observer)
	}

	def unregister(observer: Observer) {
		observers -= observer
		log.info("Removed observer: " + observer)
	}

	def send(e: Event): Event = {
		log.debug(e.toString)
		val aa = System.currentTimeMillis
		for (o <- observers) {
			try {
				val a = System.currentTimeMillis
				o listen e
				val b = System.currentTimeMillis
				if (e.profile && eventTimeWarnThreshold > 0 &&  b - a > eventTimeWarnThreshold)
					log.warn(o + " took " + (b-a) + " for " + e)
			} catch {
				case p => {
					log.error("while sending " + e + " to " + o, p)
					throw p
				}
			}
		}
		val bb = System.currentTimeMillis
		if (e.profile && eventAllTimeWarnThreshold > 0 &&  bb - aa > eventAllTimeWarnThreshold)
			log.warn((bb-aa) + " for " + e)

		e
	}
}
