package es.elv.kobold.events {
	import net.lag.logging._
	import scala.collection._

	trait Observer {
		def listen(event: Event)
	}

	trait Event {
		private var _stopped = false
		def stop() = synchronized { _stopped = true }
		def stopped = _stopped
	}

	object EventSource {
		private val log = Kobold.logger()

		private val observers: mutable.ArrayBuffer[Observer] = new mutable.ArrayBuffer()

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
			for (o <- observers) {
				if (!e.stopped)
					try { o listen e } catch {
						case p => {
							log.error("while sending " + e + " to " + o, p)
							throw p
						}
					}
			}

			e
		}
	}
}
