package es.elv.kobold

class IngameLogHandler extends net.lag.logging.Handler(new net.lag.logging.GenericFormatter("%.3s %s: ")) {
	private var closed = false

	private var bufferedMessages: collection.mutable.SynchronizedQueue[java.util.logging.LogRecord] =
		new collection.mutable.SynchronizedQueue()

	override def close {
		closed = true
	}
	override def flush {}

	override def publish(what: java.util.logging.LogRecord): Unit = {
		if (closed)
			return

		if (bufferedMessages.size > 100)
			println("(warning: IngameLogger message buffer: " + bufferedMessages.size + ")")
		else
			bufferedMessages += what

		if (R.getContextDepth > 0) while (!bufferedMessages.isEmpty) {
			val o = bufferedMessages.dequeue
			if (!myPublish(o))
				println("failed to send: " + o)
		}
	}

	private def myPublish(what: java.util.logging.LogRecord): Boolean = {
		val col = what.getLevel match {
			case java.util.logging.Level.SEVERE => color.Red
			case java.util.logging.Level.WARNING => color.Pink
			case java.util.logging.Level.INFO => color.Bisque
			case _ => color.Mistyrose
		}
		
		val text = col.toString + getFormatter().format(what).trim
		
		try {
			for (p <- Player.all) {
				// Warnings and errors to all players, no matter what.
				if (what.getLevel.intValue >= java.util.logging.Level.WARNING.intValue)
					p.message(text)
				
				val wantLogLevel = p.li("logLevel")

				if (wantLogLevel > 0 && what.getLevel.intValue >= wantLogLevel)
					p.message(text)
			}

			true

		} catch {
			case v: NWN.NotInContextException => {
				println("(Not in context, cannot publish message to NWN)")
				false
			}
		}
	}
}
