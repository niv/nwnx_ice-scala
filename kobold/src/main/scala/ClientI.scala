package es.elv.kobold {
	import NWN._
	import scala.collection._
	import net.lag._
	import scala.actors._
	import scala._
	import scala.concurrent._
	import events._

	object R extends _ClientDisp {
		private val log = Kobold.logger()

		private val delayedThunks = new mutable.Queue[() => Unit]
		private val storedTokens: mutable.Map[Long, () => Unit] = mutable.Map()
		private var tokenCounter = 0

		private var cachedProxy: NWScriptPrx = null
		private var objectSelf: NWObject = null
		private var contextDepth = 0

		def proxy = cachedProxy

		def getObjectSelf = objectSelf

		def getContextDepth = contextDepth

		private def nextToken() = {
			tokenCounter = tokenCounter + 1
			tokenCounter
		}

		/**
			Schedule a block of code to be executed
			with NWN context after the next available event.
		*/
		def schedule(block: () => Unit) {
			delayedThunks += block
		}

		/**
			Assign a block of code to be executed on a
			specific object.
		*/
		def assign(obj: NWObject, block: => Unit) {
			// This saves us a round trip, because we're already on the correct object.
			if (obj == objectSelf) {
				block

			} else {
				val token = nextToken()

				storedTokens(token) = () => { block }

				val mod = new NWObject(0)
				proxy.setLocalString(mod, "ice_token", token.toString)
				proxy.executeScript("ice_token", obj)
			}
		}

		/**
			Assign a block of code to be executed after the
			given time on a specific object. Do not reference
			effects from the outer scope in the given block -
			they will not be valid anymore.
		*/
		def delay(obj: NWObject, delay: Double, block: => Unit) {
			val token = nextToken()
			storedTokens(token) = () => { block }

			val mod = new NWObject(0)
			proxy.setLocalString(mod, "ice_token", token.toString)
			proxy.setLocalFloat(mod, "ice_delay", if (delay < 0.0) 0.0 else delay)
			proxy.executeScript("ice_schedule", obj)
		}


		def token(p: NWScriptPrx, self: NWObject, tk: String, current: Ice.Current) {
			objectSelf = self
			cachedProxy = p

			contextDepth += 1

			val start = System.currentTimeMillis

			val token = tk.toLong

			if (storedTokens.contains(token)) {
				try { storedTokens(token)() } catch {
					case p => {
						log.error("while handling token: " + tk, p)
						System.exit(1)
					}
				}
				storedTokens -= token
			} else {
				log.error("  Wanted to execute token " + tk + " but not found")
			}

			log.debug("t %08x %-20s %8d ms (cache: %d)".format(
				self.id, "   " * contextDepth + tk, System.currentTimeMillis - start,
				storedTokens.size
			))
			contextDepth -= 1
		}


		def event(p: NWScriptPrx, self: NWObject, ev: String, current: Ice.Current): ClientResult = {
			objectSelf = self
			cachedProxy = p

			contextDepth += 1

			val start = System.currentTimeMillis

			while (!delayedThunks.isEmpty && System.currentTimeMillis - start < 400)
				delayedThunks.dequeue()()
			if (delayedThunks.size > 0)
				log.warn(delayedThunks.size + " thunks remaining")

			val ret: ClientResult = try {
				val e: Event = EventSource send new events.RawEvent(self, ev)
				if (e.stopped)
					ClientResult.Stop
				else
					ClientResult.Continue

			} catch {
				case p => {
					log.error("while distributing event: " + ev + " on " + self.id, p)
					System.exit(1)
					ClientResult.Error
				}
			}

			log.debug("e %08x %-20s %8d ms".format(self.id, "   " * contextDepth + ev, System.currentTimeMillis - start))

			contextDepth -= 1
			ret
		}
	}
}
