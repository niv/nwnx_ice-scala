package es.elv.kobold.log

import org.apache.log4j

class IngameAppender extends log4j.AppenderSkeleton {
	override def requiresLayout = true
	override def close() {}

	override def append(what: log4j.spi.LoggingEvent) {
		val col = what.getLevel match {
			case log4j.Level.FATAL => color.Red
			case log4j.Level.ERROR => color.Red
			case log4j.Level.WARN => color.Pink
			case log4j.Level.INFO => color.Bisque
			case _ => color.Mistyrose
		}
		
		val text = col.toString + layout.format(what).trim

		if (R.getContextDepth == 0)
			return

		for (p <- Player.all) {
			// Warnings and errors to all players, no matter what.
			if (what.getLevel.toInt >= log4j.Level.WARN.toInt)
				p.message(text)
			
			val wantLogLevel = p.li("logLevel")

			if (wantLogLevel > 0 && what.getLevel.toInt >= wantLogLevel)
				p.message(text)
		}

		true
	}
}
