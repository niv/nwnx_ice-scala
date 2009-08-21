
package es.elv.kobold {
	import net.lag._
	import scala.collection._

	abstract case class Wrapped[K, V](val wrapped: K, val factory: Option[WrappedFactory[K, V]]) {
		val canInvalidate = factory.isDefined

		def invalidate() {
			if (factory.isEmpty)
				error("Cannot invalidate " + this + ", no factory defined.")

			factory.get.invalidate(this.wrapped)
		}
	}

	abstract class WrappedFactory[K, V](private val constructor: (K) => V) {
		private val cache: mutable.Map[K, V] = mutable.Map()

		def apply(key: K): V = synchronized {
			if (!cache.contains(key)) {
				cache(key) = constructor(key)
			}
			cache(key)
		}
		def invalidate(key: K) = synchronized {
			if (!cache.contains(key))
				error("Damnit, key not found on " + this)
			cache -= key
		}

		def getCache = synchronized { cache }
	}
}
