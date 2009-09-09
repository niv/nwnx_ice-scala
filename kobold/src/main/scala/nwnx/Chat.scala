package es.elv.kobold

import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

package events {
	case class OnChatTalk(val speaker: G, val text: String) extends GameEvent
	case class OnChatShout(val speaker: G, val text: String) extends GameEvent
	case class OnChatWhisper(val speaker: G, val text: String) extends GameEvent
	case class OnChatPrivate(val speaker: G, val to: G, val text: String) extends GameEvent
	case class OnChatServer(val speaker: G, val text: String) extends GameEvent
	case class OnChatParty(val speaker: G, val text: String) extends GameEvent
	case class OnChatSilentShout(val speaker: G, val text: String) extends GameEvent
	case class OnChatDM(val speaker: G, val text: String) extends GameEvent
}

package nwnx {

object Chat extends Core("CHAT") with Plugin {
	def speakToChannel(speaker: G, channel: Int, text: String, to: G): Unit = {
		if (!speaker.valid)
			return

		if (channel == 4 && !to.valid)
			return

		val t = List(speaker.wrapped.id.toHexString,
			to.wrapped.id.toHexString, channel, text).mkString("¬")

		set(speaker, "SPEAK", t)
	}

	def suppress(o: G) = set(o, "SUPRESS", "1")

	private def pcIn(o: G) {
		val id = get(o, "GETID", 10).trim.toInt
		if (id != -1) {
			R.proxy.setLocalObject(Module(), "chatPC_" + id, o)
			R.proxy.setLocalInt(o, "chatID", id)
		}
	}
	private def pcOut(o: G) {
		val id = R.proxy.getLocalInt(o, "chatID")
		R.proxy.deleteLocalInt(o, "chatID")
		R.proxy.deleteLocalObject(Module(), "chatPC_" + id)
	}

	private def getPC(id: Int): G = {
		G(R.proxy.getLocalObject(Module(), "chatPC_" + id))
	}


	def listen(event: Event) = event match {
		case OnPlayerEnter(p: G) =>
			pcIn(p)
		case OnPlayerLeave(p: G) =>
			pcOut(p)

		case RawEvent(self, t) => t match {
			case "nwnx_chat" => {
				/*
				MSG_TALK = 1,
				MSG_SHOUT = 2,
				MSG_WHISPER = 3,
				MSG_PRIVATE = 4,
				MSG_SERVER = 5,
				MSG_PARTY = 6,
				MSG_SILENT_SHOUT = 13,
				MSG_DM = 14,
				MSG_MODE_DM = 16;
				*/
				val allText = get(self, "TEXT", 1024)
				val modeWithDM = allText.substring(0, 2).trim.toInt
				val mode = if (modeWithDM > 16) modeWithDM - 16 else modeWithDM
				val toId = allText.substring(2, 12).trim.toInt
				val text = allText.substring(12)
				val to = if (mode == 4) getPC(toId) else Invalid()

				mode match {
					case  1 => EventSource send new OnChatTalk(G(self), text)
					case  2 => EventSource send new OnChatShout(G(self), text)
					case  3 => EventSource send new OnChatWhisper(G(self), text)
					case  4 => EventSource send new OnChatPrivate(G(self), to, text)
					case  5 => EventSource send new OnChatServer(G(self), text)
					case  6 => EventSource send new OnChatParty(G(self), text)
					case 13 => EventSource send new OnChatSilentShout(G(self), text)
					case 14 => EventSource send new OnChatDM(G(self), text)
				}

				R.setRawEventHandled
			}
			case _ =>
		}

		case _ =>
	}
}

}
