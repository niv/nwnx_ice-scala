package es.elv.kobold.log

import org.apache.log4j

class IngameAppender extends log4j.AppenderSkeleton with Configurable {
	override def requiresLayout = true
	override def close() {}

	@reflect.BeanProperty private var toAllPlayers = true
	@reflect.BeanProperty private var toDMChannel = false

	override def append(what: log4j.spi.LoggingEvent) {
		if (R.getContextDepth == 0)
			return

		val text = (what.getLevel match {
			case log4j.Level.FATAL => config.getString("fatal")
			case log4j.Level.ERROR => config.getString("error")
			case log4j.Level.WARN => config.getString("warn")
			case log4j.Level.INFO => config.getString("info")
			case _ => config.getString("other")
		}).format(layout.format(what)).trim

		if (toDMChannel)
			R.proxy.sendMessageToAllDMs(text)

		if (toAllPlayers)
			for (p <- PlayerCreature.all()) p.message(text)

		true
	}
}
