package es.elv.kobold.log

import org.apache.log4j

class IngameAppender extends log4j.AppenderSkeleton {
	override def requiresLayout = true
	override def close() {}

	@reflect.BeanProperty private var toAllPlayers = true
	@reflect.BeanProperty private var toDMChannel = false

	override def append(what: log4j.spi.LoggingEvent) {
		if (R.getContextDepth == 0)
			return

		val col = what.getLevel match {
			case log4j.Level.FATAL => color.Red
			case log4j.Level.ERROR => color.Red
			case log4j.Level.WARN => color.Pink
			case log4j.Level.INFO => color.Bisque
			case _ => color.Mistyrose
		}
		
		val text = col.toString + layout.format(what).trim

		if (toDMChannel)
			R.proxy.sendMessageToAllDMs(text)

		if (toAllPlayers)
			for (p <- Player.all) p.message(text)

		true
	}
}
