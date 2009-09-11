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

	def groundHeightAt(where: Location): Float = where.area match {
		case NoArea => 0.0f
		case _ => setGet(where.area, "GETGROUNDHEIGHT",
			List(where.x, where.y, where.z).mkString("¬") + "                     ").toFloat
	}
}

}
