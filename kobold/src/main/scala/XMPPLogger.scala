package es.elv.kobold.log

import org.apache.log4j
import org.jivesoftware.smack

class XMPPAppender extends log4j.AppenderSkeleton with smack.MessageListener {
	override def requiresLayout = true
	override def close() = closed = true

	@reflect.BeanProperty private var host = ""
	@reflect.BeanProperty private var port = 5222
	@reflect.BeanProperty private var service = ""
	@reflect.BeanProperty private var useTLS = true
	@reflect.BeanProperty private var forcePlain = true

	@reflect.BeanProperty private var username = ""
	@reflect.BeanProperty private var password = ""
	@reflect.BeanProperty private var resource = ""
	@reflect.BeanProperty private var presenceMode = smack.packet.Presence.Mode.dnd
	@reflect.BeanProperty private var presenceModePriority = 0
	@reflect.BeanProperty private var presenceModeMessage = "log4j notify, will not answer messages"

	@reflect.BeanProperty private var logTarget = ""

	private var isSetup = false
	private var chats: List[smack.Chat] = List()
	private var connection: smack.XMPPConnection = null

	private def setup {
		val connectionConfiguration = new smack.ConnectionConfiguration(host, port, service)
		if (!useTLS)
			connectionConfiguration setSecurityMode smack.ConnectionConfiguration.SecurityMode.disabled
		if (forcePlain)
			smack.SASLAuthentication supportSASLMechanism("PLAIN", 0)
		connectionConfiguration setSendPresence false

		connection = new smack.XMPPConnection(connectionConfiguration)

		connection.connect
		connection.login(username, password, resource)
		connection.sendPacket(new smack.packet.Presence(smack.packet.Presence.Type.unavailable,
			presenceModeMessage, presenceModePriority, presenceMode))

		chats = logTarget.split(",").map(t => connection.getChatManager.createChat(t, this)).toList
		isSetup = true
	}

	override def append(what: log4j.spi.LoggingEvent) {
		if (!isSetup)
			setup

		if (!connection.isConnected)
			return

		val msg = layout.format(what).trim

		for (c <- chats)
			c sendMessage msg
	}

	override def processMessage(c: smack.Chat, m: smack.packet.Message) {
		Kobold.log.debug("XMPPAppender: Message from " + c.getParticipant + ": " + m.getBody)
	}
}
