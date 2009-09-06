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
		Core.setGet(obj, "FUNCS", key, args map(_ toString) mkString(" ") + " " * 10).toInt

	def allAreas: List[Area] = {
		var all = new mutable.ListBuffer[Area]
		var area: G = G(getObject(Module(), "GETFIRSTAREA"))
		while (area.valid) {
			all += area.asInstanceOf[Area]
			area = G(getObject(Module(), "GETNEXTAREA"))
		}
		all.toList
	}
}

}
