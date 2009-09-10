package es.elv.kobold

import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

package events {

/**
	Fires for each Creature that hears another Creature talking.
*/
case class OnChatTalkHeard(talker: Creature, listener: Creature, text: String) extends GameEvent

/**
	Fires for each Creature that hears another Creature whispering.
*/
case class OnChatWhisperHeard(talker: Creature, listener: Creature, text: String) extends GameEvent

}

package ext {

/**
	Listens for Chat events and distributes Creature-targeted specific events.
	Overhead should be minor.
*/
object ChatListener extends Plugin {
	def listen(event: Event) = event match {

		case OnChatTalk(talker: Creature, text: String) => {
			talker.near(SoundDistance.TalkVolume, NWN.ObjectType.Creature, classOf[Creature]) filter (talker hears _) foreach (listener =>
				if (listener.alive) EventSource send OnChatTalkHeard(talker, listener, text))
		}
		
		case OnChatWhisper(talker: Creature, text: String) =>
			talker.near(SoundDistance.WhisperVolume, NWN.ObjectType.Creature, classOf[Creature]) filter (talker hears _) foreach (listener =>
				if (listener.alive) EventSource send OnChatWhisperHeard(talker, listener, text))

		case _ =>
	}
}

}
