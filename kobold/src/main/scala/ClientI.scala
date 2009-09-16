package es.elv.kobold {
	import NWN._
	import scala.collection._
	import scala.actors._
	import scala._
	import scala.concurrent._
	import events._

	package events {
		final case class RawEvent(val self: NWObject, val event: String) extends Event
		final case class TokenEvent(val self: NWObject, val token: Long) extends Event
	}

	object R extends _ClientDisp {
		private val log = Kobold.logger()

		private val delayedThunks = new mutable.Queue[() => Unit]
		private val storedTokens: mutable.Map[Long, () => Unit] = mutable.Map()
		private var tokenCounter = 0

		private var cachedProxy: NWScriptPrx = null
		private var objectSelf: NWObject = null
		private var contextDepth = 0
		private var rawEventHandled = false


		def setRawEventHandled = rawEventHandled = true

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
		def schedule(block: => Unit) {
			delayedThunks += (() => {block})
		}

		/**
			Assign a block of code to be executed on a
			specific object.
		*/
		def assign(obj: NWObject, block: => Unit) {
			val token = nextToken()

			storedTokens(token) = () => { block }

			val mod = new NWObject(0)
			proxy.setLocalString(mod, "ice_token", token.toString)
			proxy.executeScript("ice_token", obj)
		}

		/**
			Assign a block of code to be executed after the
			given time on a specific object. Do not reference
			effects from the outer scope in the given block -
			they will not be valid anymore.
		*/
		def delay(obj: NWObject, delay: Float, block: => Unit) {
			val token = nextToken()
			storedTokens(token) = () => { block }

			val mod = new NWObject(0)
			proxy.setLocalString(mod, "ice_token", token.toString)
			proxy.setLocalFloat(mod, "ice_delay", if (delay < 0.0) 0.0f else delay)
			proxy.executeScript("ice_schedule", obj)
		}


		def token(p: NWScriptPrx, self: NWObject, tk: String, current: Ice.Current) {
			objectSelf = self
			cachedProxy = p

			contextDepth += 1

			val start = System.currentTimeMillis

			val token = tk.toLong

			handleScheduled

			EventSource send events.TokenEvent(self, token)

			if (storedTokens.contains(token)) {
				try { storedTokens(token)() } catch {
					case p => {
						log.error("while handling token: " + tk, p)
						System.exit(1)
					}
				}
				storedTokens -= token
			} else {
				if (token > tokenCounter + 10)
					log.info("  Lost token due to restart: " + tk)
				else
					log.error("  Wanted to execute token " + tk + " but not found")
			}

			val instr: Long = p.getInstructionCount()

			log.debug("%08x %4d %4d ms - %s (cache: %d)".format(
				self.id, instr,  System.currentTimeMillis - start, tk, storedTokens.size))
			contextDepth -= 1
		}


		def event(p: NWScriptPrx, self: NWObject, ev: String, current: Ice.Current): ClientResult = {
			objectSelf = self
			cachedProxy = p

			contextDepth += 1

			val start = System.currentTimeMillis

			handleScheduled

			val ret = if (Kobold.config.getStringArray("ignoreEvents") contains ev) {
				log.debug("%08x  (ignored)   - %s".format(self.id, ev))
				ClientResult.Continue

			} else {
				val ret: ClientResult = try {
					rawEventHandled = false
					val e: Event = EventSource send events.RawEvent(self, ev)
					if (!rawEventHandled)
						log.warn("Unhandled event received: %s (on %08x)".format(ev, self.id))
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

				val instr: Long = p.getInstructionCount()

				log.debug("%08x %4d %4d ms - %s".format(self.id, instr, System.currentTimeMillis - start, ev))

				ret
			}

			contextDepth -= 1
			ret
		}

		private def handleScheduled {
			val start = System.currentTimeMillis

			while (!delayedThunks.isEmpty && System.currentTimeMillis - start < 400)
				delayedThunks.dequeue()()
			if (delayedThunks.size > 0)
				log.warn(delayedThunks.size + " thunks remaining")
		}
	}
}
