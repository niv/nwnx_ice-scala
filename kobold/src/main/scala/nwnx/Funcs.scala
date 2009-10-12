package es.elv.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

package events {
}

package nwnx {

object Funcs extends Core("FUNCS") {
	import scala.collection._

	def getInt(obj: NWObject, key: String, args: Int*) =
		setGet(obj, key, args map(_ toString) mkString(" ") + " " * 10).toInt

	def allAreas: List[Area] = {
		var all = new mutable.ListBuffer[Area]
		var area: G = G(getObject(Module(), "GETFIRSTAREA"))
		while (area.valid()) {
			all += area.asInstanceOf[Area]
			area = G(getObject(Module(), "GETNEXTAREA"))
		}
		all.toList
	}

	def setTag(o: G, newTag: String) =
		set(o, "SETTAG", newTag)

	def groundHeightAt(where: Location): Float = where.area match {
		case NoArea => 0.0f
		case _ => setGet(where.area, "GETGROUNDHEIGHT",
			List(where.x, where.y, where.z).mkString("¬") + " " * 12).toFloat
	}

	def walkable(where: Location): Boolean = where.area match {
		case NoArea => false
		case _ => setGet(where.area, "GETISWALKABLE", vectorToString(where.position) + " " * 12) == "1"
	}

	def getFactionId(o: Creature): Int =
		setGet(o, "GETFACTIONID", " " * 8).toInt

	def setFactionId(o: Creature, factionId: Int): Unit =
		setGet(o, "SETFACTIONID", factionId + " " * 8)
}
}
