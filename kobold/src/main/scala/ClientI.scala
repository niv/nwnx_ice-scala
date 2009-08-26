package es.elv.kobold {
	import NWN._
	import scala.collection._
	import net.lag._
	import scala.actors._
	import scala._
	import scala.concurrent._
	import events._

	object R extends _ClientDisp {
		private val log = logging.Logger.get

		private val delayedThunks = new mutable.Queue[() => Unit]
		private val storedTokens: mutable.Map[Long, () => Unit] = mutable.Map()
		private var tokenCounter = 0

		private var cachedProxy: NWScriptPrx = null
		private var objectSelf: NWObject = null
		private var contextDepth = 0

		def proxy = cachedProxy

		def getObjectSelf = objectSelf

		private def nextToken() = {
			tokenCounter = tokenCounter + 1
			tokenCounter
		}

		def schedule(block: () => Unit) {
			delayedThunks += block
		}

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

		def token(p: NWScriptPrx, self: NWObject, tk: String, current: Ice.Current) {
			objectSelf = self
			cachedProxy = p

			val start = System.currentTimeMillis

			val token = tk.toLong

			if (storedTokens.contains(token)) {
				storedTokens(token)()
				storedTokens -= token
			} else {
				log.error("  Wanted to execute token " + tk + " but not found")
			}
			
			log.info("t %08x %-20s %8d ms (cache: %d)".format(
				self.id, "   " * contextDepth + tk, System.currentTimeMillis - start,
				storedTokens.size
			))
		}

		def event(p: NWScriptPrx, self: NWObject, ev: String, current: Ice.Current): ClientResult = {
			objectSelf = self
			cachedProxy = p

			contextDepth += 1

			val start = System.currentTimeMillis

			val e = EventSource send new events.RawEvent(self, ev)

			while (!delayedThunks.isEmpty && System.currentTimeMillis - start < 400)
				delayedThunks.dequeue()()
			if (delayedThunks.size > 0)
				log.warning(delayedThunks.size + " thunks remaining")
			
			contextDepth -= 1

			log.info("e %08x %-20s %8d ms".format(self.id, "   " * contextDepth + ev, System.currentTimeMillis - start))
			
			if (e.suppressed)
				return ClientResult.Suppress
			if (e.stopped)
				return ClientResult.Stop
			return ClientResult.Continue
		}
	}
}
