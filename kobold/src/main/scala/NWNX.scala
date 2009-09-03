package es.elv.kobold.nwnx {
	import NWN._
	import scala.collection._
	import net.lag._
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
		protected lazy val log = Kobold.logger()

		def get(obj: NWObject, key: String, buf: Int) =
			Core.setGet(obj, nwnxKey, key, " " * buf)
		def set(obj: NWObject, key: String, value: String) =
			Core.set(obj, nwnxKey, key, value)
		def getObject(obj: NWObject, key: String) =
			Core.getObject(obj, nwnxKey, key)
	}

	object Funcs extends Core("FUNCS") {
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

	object Structs extends Core("STRUCTS") {
		def setEffectSpellId(obj: NWObject, effect: Effect, spell: Int) =
			set(Module(), "SETSPELLID", spell.toString)
	}

	object Events extends Core("EVENTS") {
		def suppress(o: G) = set(o, "BYPASS", "1")
	}
	
	object Chat extends Core("CHAT") {
		def speakToChannel(speaker: G, channel: Int, text: String, to: G): Unit = {
			if (!speaker.valid)
				return

			if (channel == 4 && !to.valid)
				return

			val t = List(speaker.wrapped.id.toHexString,
				to.wrapped.id.toHexString, channel, text).mkString("¬")

			set(speaker, "SPEAK", t)
		}

		def pcIn(o: G) {
			val id = get(o, "GETID", 10).trim.toInt
			if (id != -1) {
				R.proxy.setLocalObject(Module(), "chatPC_" + id, o)
				R.proxy.setLocalInt(o, "chatID", id)
			}
		}
		def pcOut(o: G) {
			val id = R.proxy.getLocalInt(o, "chatID")
			R.proxy.deleteLocalInt(o, "chatID")
			R.proxy.deleteLocalObject(Module(), "chatPC_" + id)
		}

		def getPC(id: Int): G = {
			G(R.proxy.getLocalObject(Module(), "chatPC_" + id))
		}

		def suppress(o: G) = set(o, "SUPRESS", "1")
	}

}
