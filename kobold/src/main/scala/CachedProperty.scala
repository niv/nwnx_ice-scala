package es.elv.kobold.cachedproperty {

	object CachePolicy extends Enumeration {
		type CachePolicy = Value
		/* Cache policies: */
		// Indef: Cache until containing instance is destroyed or cleared
		// Event: Cache until end of event (this is the default)
		// None:  Do not cache at all
		val Indef, Event, None = Value
	}

	import CachePolicy.CachePolicy
	
	trait Cacheable {
		var cachePolicy = CachePolicy.Event

		def clear()
	}

	class CachedProperty[T] (getter: () => T) extends Cacheable {
		protected var value: Option[T] = None

		/** Set this CachedPropertys value without calling a getter/setter. */
		def setNoUpdate(v: T){ value = Some(v) }

		def clear() { value = None }

		def apply() = cachePolicy match {
			case CachePolicy.None => getter()
			case _ => {
				if (value.isEmpty)
					setNoUpdate(getter())
				value.get
			}
		}

		override def toString() = "CachedProperty(" + cachePolicy + ", " + apply().toString + ")"
	}

	class RWCachedProperty[T] (
		getter: () => T,
		setter: (T) => Unit
	) extends CachedProperty[T](getter) {
		def update(what: T) {
			setter(what)
			setNoUpdate(what)
		}

		override def toString() = "RWCachedProperty(" + cachePolicy + ", " + apply().toString + ")"
	}

	trait CachedProperties {
		private var cachedProperties: List[Cacheable] = List()

		protected object P {

			def apply[T](getter: () => T): CachedProperty[T] =
				apply(CachePolicy.Event, getter)
			def apply[T](getter: () => T, setter: (T) => Unit): RWCachedProperty[T] =
				apply(CachePolicy.Event, getter, setter)
			def apply[T](policy: CachePolicy, getter: () => T) = {
				val v = new CachedProperty[T](getter)
				v.cachePolicy = policy
				cachedProperties = v :: cachedProperties
				v
			}
			def apply[T](policy: CachePolicy, getter: () => T, setter: (T) => Unit) = {
				val v = new RWCachedProperty[T](getter, setter)
				v.cachePolicy = policy
				cachedProperties = v :: cachedProperties
				v
			}

			/** Register a Cacheable to be handled. Returns p for easy assignment. */
			def apply[T <: Cacheable](p: T): T = {
				cachedProperties = p :: cachedProperties
				p
			}

		}

		final private[kobold] def clearCachedPropertiesByPolicy(p: CachePolicy) {
			for (field <- cachedProperties if field.cachePolicy == p)
				field.clear()
		}
	}
}
