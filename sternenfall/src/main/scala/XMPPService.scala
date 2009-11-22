package org.sternenfall.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._
import org.jivesoftware.smack

package events {
	case class XMPPEvent() extends Event
	case class OnXMPPCommand(val chat: smack.Chat, val command: String, val arguments: String) extends XMPPEvent
}

object XMPPService extends Plugin with smack.MessageListener with smack.ChatManagerListener {
	def listen(event: Event) {}

	private val charset = config.getString("charset", "ISO-8859-15")

	private val connectionConfiguration = new smack.ConnectionConfiguration(
		config.getString("host"), config.getInt("port"), config.getString("service"))
	if (!config.getBoolean("useTLS"))
		connectionConfiguration setSecurityMode smack.ConnectionConfiguration.SecurityMode.disabled
	if (config.getBoolean("forcePlain"))
		smack.SASLAuthentication supportSASLMechanism("PLAIN", 0)
	connectionConfiguration setSendPresence false

	private val connection = new smack.XMPPConnection(connectionConfiguration)
	connection.connect

	connection.login(
		config.getString("username"), config.getString("password"), config.getString("resource"))
	connection.sendPacket(new smack.packet.Presence(smack.packet.Presence.Type.available,
		config.getString("presenceModeMessage"), config.getInt("presenceModePriority"),
		smack.packet.Presence.Mode.available))
	
	connection.getChatManager addChatListener this

	override def chatCreated(c: smack.Chat, lo: Boolean) =
		if (!lo) c.addMessageListener(this)

	/** Send a message to a jid, with or without resource. */
	def sendMessage(jid: String, message: String) =
		connection.getChatManager.createChat(jid, this).
			sendMessage(new String(message.getBytes(charset), charset)
		)

	/** All registered commands. */
	val commands: collection.mutable.Map[String, (String, String, (smack.Chat, String) => Unit, List[String])] =
		collection.mutable.Map()

	/** Register a new XMPP command. Error messages will be passed on to the user,
		so catch them if you don't want to show them - but you can use this to add
		checks without much effort (.toInt will throw the Exceptions traight back at the user ..)
	*/
	def registerCommand(command: String, shortHelp: String, longHelp: String, body: (smack.Chat, String) => Unit, aliases: String*) =
		commands(command) = ((shortHelp, longHelp, body, aliases.toList))

	private def getCommand(command: String): Option[(smack.Chat, String) => Unit] =
		if (commands.contains(command))
			Some(commands(command)._3)
		else
			commands.values.find(whatever =>
				if (whatever._4.contains(command)) true else false
			) match {
				case Some(whatever) => Some(whatever._3)
				case None => None
			}

	override def processMessage(c: smack.Chat, m: smack.packet.Message) {
		val from = c.getParticipant
		val jid  = from.split("/")(0)
		val text = m.getBody
		if (null == text) return

		val (command, arguments) = text.split(" +", 2).toList match {
			case x :: Nil => (x, "")
			case x :: xs => (x, xs(0))
			case Nil => ("", "")
		}

		try {
			if (!(EventSource send(events.OnXMPPCommand(c, command, arguments))).stopped)
				getCommand(command) match {
					case Some(what) => what(c, arguments)
					case None => if (-1 == jid.toLowerCase.indexOf(config.getString("jid").toLowerCase))
						c sendMessage config.getString("unhandledCommandMessage")
				}
		} catch {
			case p => {
				c sendMessage "Error in command: " + p.getMessage
				log.error("while handling: " + text, p)
			}
		}
	}
}
