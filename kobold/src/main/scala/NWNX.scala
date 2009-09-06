package es.elv.kobold.nwnx {
	import NWN._
	import Implicits._

	object Core {
		def set(obj: NWObject, lib: String, key: String, value: String) =
			R.proxy.setLocalString(obj, "NWNX!" + lib + "!" + key, value)
		def get(obj: NWObject, lib: String, key: String, buf: Int) =
			setGet(obj, lib, key, " " * buf)

		def getInt(obj: NWObject, lib: String, key: String) =
			get(obj, lib, key, 12).toInt

		def setGet(obj: NWObject, lib: String, key: String, init: String) = {
			R.proxy.setLocalString(obj, "NWNX!" + lib + "!" + key,
				init)
			R.proxy.getLocalString(obj, "NWNX!" + lib + "!" + key)
		}

		def getObject(obj: NWObject, lib: String, key: String) =
			R.proxy.getLocalObject(obj, "NWNX!" + lib + "!" + key)

	}

	abstract class Core(val nwnxKey: String) {
		def get(obj: NWObject, key: String, buf: Int) =
			Core.setGet(obj, nwnxKey, key, " " * buf)
		def set(obj: NWObject, key: String, value: String) =
			Core.set(obj, nwnxKey, key, value)
		def getObject(obj: NWObject, key: String) =
			Core.getObject(obj, nwnxKey, key)
	}

}
