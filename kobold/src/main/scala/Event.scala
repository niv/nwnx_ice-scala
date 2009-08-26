package es.elv.kobold.events {
	import net.lag.logging._
	import scala.collection._

	trait Observer {
		def listen(event: Event)
	}

	trait Event {
		private var _suppressed = false
		def suppress() = synchronized { _suppressed = true }
		def suppressed = _suppressed

		private var _stopped = false
		def stop() = synchronized { _stopped = true }
		def stopped = _stopped
	}

	object EventSource {
		private val log = Logger.get

		private val observers: mutable.Set[Observer] = mutable.Set()

		def register(observer: Observer) {
			if (!observers.contains(observer))
				observers += observer
			log.info("Added observer: " + observer)
		}
		
		def unregister(observer: Observer) {
			observers -= observer
			log.info("Removed observer: " + observer)
		}

		def send(e: Event): Event = {
			observers.foreach(_ listen e)
			e
		}
	}
}
