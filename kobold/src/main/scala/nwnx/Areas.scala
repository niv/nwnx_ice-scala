package es.elv.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

package events {
}

package nwnx {

object Areas extends Core("AREAS") {
	private val log = Kobold.logger

	import scala.collection._

	/**
		Load the given resref from your resource manager, and
		create an area from it. See nwnx_areas for details.
		Returns the newly created area, or Invalid()
	*/
	def loadArea(resref: String): G = {
		set(Module(), "CREATE_AREA", resref)
		Area.all.clear
		G[G](getObject(Module(), "GET_LAST_AREA_ID"))
	}

	/**
		Destroy the given area.
	*/
	def destroyArea(area: Area) {
		if (PlayerCreature.all().filter(_.area() == area).size < 1) {
			set(Module(), "DESTROY_AREA", "%x".format(area))
			Area.all.clear
		} else
			log.error("tried to destroy areas with players: " + area)
	}
}

}
