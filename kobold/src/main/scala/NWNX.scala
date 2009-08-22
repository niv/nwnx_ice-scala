package es.elv.kobold.nwnx {
	import NWN._
	import scala.collection._
	import net.lag._
	import Implicits._

	object Core {
		def get(obj: NWObject, lib: String, key: String, buf: Int) = {
			R.proxy.setLocalString(obj, "NWNX!" + lib + "!" + key,
				" " * buf)
			R.proxy.getLocalString(obj, "NWNX!" + lib + "!" + key)
		}
		def getObject(obj: NWObject, lib: String, key: String) =
			R.proxy.getLocalObject(obj, "NWNX!" + lib + "!" + key)

	}

	object Chat {
		def speakToChannel(speaker: GameObject[_], channel: Int, text: String, to: GameObject[_]): Unit = {
			if (!speaker.valid)
				return

			if (channel == 4 && !to.valid)
				return

			val t = List(speaker.wrapped.id.toHexString,
				to.wrapped.id.toHexString, channel, text).mkString("¬")

			// R.proxy.setLocalInt(speaker, "ice_chat_message_ignore", 1)
			R.proxy.setLocalString(speaker, "NWNX!CHAT!SPEAK", t)
		}

		def pcIn(o: Player) {
			val id = Core.get(o, "CHAT", "GETID", 10).trim.toInt
			if (id != -1) {
				R.proxy.setLocalObject(Module(), "chatPC_" + id, o)
				R.proxy.setLocalInt(o, "chatID", id)
			}
		}
		def pcOut(o: Player) {
			val id = R.proxy.getLocalInt(o, "chatID")
			R.proxy.deleteLocalInt(o, "chatID")
			R.proxy.deleteLocalObject(Module(), "chatPC_" + id)
		}
		def getPC(id: Int): Player = {
			Player(R.proxy.getLocalObject(Module(), "chatPC_" + id))
		}

	}

}
