package es.elv.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

package events {
	/**
		A tick is a event called at one seconds interval. This
		is not a fixed value, and prone to drift if load gets high.
		It also includes network latency.
		The calculated drift is not corrected for, but provided for
		reference. This means that each tick roughly equates one
		"ingame second", for engine purposes.

		tickCounter starts at 0 at startup/restart, and increments
		for each tick issued.
	*/
	case class OnTick(val drift: Long, val tickCounter: Long, val tickInterval: Long) extends GameEvent
}

/**
	The Imp takes care of invalidating objects that are not
	referenced anymore anywhere, and does some housekeeping.
	This is a core plugin, so try not to unload it unless
	you know what you are doing.
*/
object Imp extends Plugin {
	private var lastcount = 0

	private var lastTickAt = 0L

	private def tickEnabled = Kobold.config.getBoolean("tickEnabled")
	private def tickInterval = Kobold.config.getLong("tickInterval")
	private def tickDriftWarn = Kobold.config.getLong("tickDriftWarn")

	def listen(event: Event) = event match {
		case OnStartup() => {
			log.info("Factoring areas ..")
			log.info("Done: " + Area.all().size + " areas in module")
			log.info("Factoring players ..")
			log.info("Done: " + PlayerCreature.all().size + " players online")

			val lastEventAt = Module().ll("koboldLastEventAt")
			val sec = (System.currentTimeMillis - lastEventAt).toDouble / 1000
			if (sec > 6.0 && lastEventAt > 0L)
				log.warn("reload: The kobold made you wait %.1f seconds.".format(sec - 6.0))
		}

		case OnModuleLoad() => {
			log.info("Clearing cache.")
			G.getCache.clear
		}

		case OnModuleHB() =>
			G purgeCache

		case OnTick(_, lastTick, _) => {
			val timerDrift = System.currentTimeMillis - lastTickAt - tickInterval
			lastTickAt = System.currentTimeMillis

			if (tickDriftWarn > 0 && timerDrift > tickDriftWarn)
				log.warn("tick drift: " + timerDrift + " ms")

			log.trace("tick, drift " + timerDrift)

			if (tickEnabled)
				Module() after (tickInterval, EventSource send OnTick(timerDrift, lastTick + 1, tickInterval))
		}

		case RawEvent(o, e) => {
			if (lastTickAt == 0)
				lastTickAt = System.currentTimeMillis

			if (tickEnabled && (System.currentTimeMillis - lastTickAt) > (tickInterval + 5000)) {
				log.warn("lost tick timer, restarting.")
				lastTickAt = System.currentTimeMillis
				Module() after (tickInterval, EventSource send OnTick(0, 0, tickInterval))
			}

			Module().ll("koboldLastEventAt") = System.currentTimeMillis
			G.getCache.foreach((k) =>
				k._2.clearCachedPropertiesByPolicy(cachedproperty.CachePolicy.Event)
			)
		}
		
		case TokenEvent(o, e) => {
			G.getCache.foreach((k) =>
				k._2.clearCachedPropertiesByPolicy(cachedproperty.CachePolicy.Event)
			)
		}

		case x =>
	}
}
