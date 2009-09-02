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
class Imp extends Plugin {
	private var lastcount = 0

	def listen(event: Event) = event match {
		case OnStartup() => {
			log.info("Factoring areas ..")
			log.info("Done: " + Area.all.size + " areas in module")
			log.info("Factoring players ..")
			log.info("Done: " + Player.all.size + " players online")
		}

		case OnModuleLoad() => {
			log.info("  Clearing cache.")
			G.getCache.clear
		}

		case OnModuleHB() => {
			val szBeforeInvalidation = G.getCache.size

			val added = szBeforeInvalidation - lastcount

			val invalid = G.getCache.filter(v => v._2.valid == false).toList
			invalid.foreach(x => G.invalidate(x._1))
			val invalidated = invalid.size

			val szAfterInvalidation = G.getCache.size
			lastcount = szAfterInvalidation

			log.info("  Cache statistics: %d (%d +/- %d) = %d".format(szBeforeInvalidation, added, invalidated, szAfterInvalidation))
		}

		case RawEvent(o, e) => {
			G.getCache.foreach((k) =>
				k._2.clearCachedPropertiesByPolicy(cachedproperty.CachePolicy.Event)
			)
		}

		case x =>
	}
}
