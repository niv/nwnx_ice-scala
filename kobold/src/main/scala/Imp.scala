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

	def listen(event: Event) = event match {
		case EStartup() => {
			log.info("Factoring areas ..")
			log.info("Done: " + Area.all.size + " areas in module")
			log.info("Factoring players ..")
			log.info("Done: " + Player.all.size + " players online")
		}

		case EModuleHB() => {

			log.info("")
			log.info("  Factory statistics:")
			CoreEvents.factories.foreach(f => {
				val invalid = f.getCache.filter(v => v._2.valid == false).toList
				invalid.foreach(x => f.invalidate(x._1))
				val invalidated = invalid.size
				if (invalidated > 0 || f.getCache.size > 0)
					log.info("    %s: %d objects (%d invalidated)".format(f.getClass.getName.toString, f.getCache.size, invalidated))
			})
			log.info("")
		}

		case _ =>
	}
}
