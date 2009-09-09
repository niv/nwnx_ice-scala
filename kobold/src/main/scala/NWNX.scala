package es.elv.kobold.nwnx {
	import NWN._
	import Implicits._

	abstract class Core(val nwnxKey: String) {

		def get(obj: NWObject, key: String, buf: Int) =
			setGet(obj, key, " " * buf)
		def set(obj: NWObject, key: String, value: String) =
			R.proxy.setLocalString(obj, "NWNX!" + nwnxKey + "!" + key, value)
		def setGet(obj: NWObject, key: String, init: String) = {
			R.proxy.setLocalString(obj, "NWNX!" + nwnxKey + "!" + key, init)
			R.proxy.getLocalString(obj, "NWNX!" + nwnxKey + "!" + key)
		}
		def getObject(obj: NWObject, key: String) =
			R.proxy.getLocalObject(obj, "NWNX!" + nwnxKey + "!" + key)

		def vectorToString(v: Vector) =
			List(v.x, v.y, v.z).map(_.toString).mkString("¬")

		def stringToVector(v: String) = try {
			val sp = v.split("¬").map(_.toFloat)
			Vector(sp(0), sp(1), sp(2))
		} catch {
			case p => {
				Kobold.log.error("stringToVector: " + v, p)
				Vector.origin
			}
		}

	}

}
