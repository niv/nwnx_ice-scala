package es.elv.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

/**
	The Imp takes care of invalidating objects that are not
	referenced anymore anywhere, and does some housekeeping.
	This is a core plugin, so try not to unload it unless
	you know what you are doing.
*/
object Imp extends Plugin {
	private var lastcount = 0

	def listen(event: Event) = event match {
		case OnStartup() => {
			log.info("Factoring areas ..")
			log.info("Done: " + Area.all().size + " areas in module")
			log.info("Factoring players ..")
			log.info("Done: " + Player.all.size + " players online")

			val lastEventAt = Module().ll("koboldLastEventAt")
			val sec = (System.currentTimeMillis - lastEventAt).toDouble / 1000
			if (sec > 6.0 && lastEventAt > 0L)
				log.warn("reload: The kobold made you wait %.1f seconds.".format(sec - 6.0))
		}

		case OnModuleLoad() => {
			log.info("Clearing cache.")
			G.getCache.clear
		}

		case RawEvent(o, e) => {
			Module().ll("koboldLastEventAt") = System.currentTimeMillis
			G.getCache.foreach((k) =>
				k._2.clearCachedPropertiesByPolicy(cachedproperty.CachePolicy.Event)
			)
		}

		case x =>
	}
}
