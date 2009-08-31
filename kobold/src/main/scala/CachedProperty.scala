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

	class CachedProperty[T, V] (val cachePolicy: CachePolicy, getter: () => T) {
		protected var value: Option[T] = None

		def apply() = cachePolicy match {
			case CachePolicy.None => getter()
			case _ => {
				if (value.isEmpty)
					value = Some(getter())
				value.get
			}
		}

		def clear() { value = None }

		override def toString() = "CachedProperty(" + cachePolicy + ", " + apply().toString + ")"
	}

	class RWCachedProperty[T, V] (
		policy: CachePolicy,
		getter: () => T,
		setter: (T) => Unit
	) extends CachedProperty[T, V](policy, getter) {
		def update(what: T) {
			setter(what)
			value = Some(what)
		}

		override def toString() = "RWCachedProperty(" + cachePolicy + ", " + apply().toString + ")"
	}

	trait CachedProperties[V] {
		this: V =>

		private var cachedProperties: List[CachedProperty[_,V]] = List()

		protected object P {

			def apply[T](getter: () => T): CachedProperty[T, V] =
				apply(CachePolicy.Event, getter)
			def apply[T](getter: () => T, setter: (T) => Unit): RWCachedProperty[T, V] =
				apply(CachePolicy.Event, getter, setter)

			def apply[T](policy: CachePolicy, getter: () => T) = {
				val v = new CachedProperty[T, V](policy, getter)
				cachedProperties = v :: cachedProperties
				v
			}
			def apply[T](policy: CachePolicy, getter: () => T, setter: (T) => Unit) = {
				val v = new RWCachedProperty[T, V](policy, getter, setter)
				cachedProperties = v :: cachedProperties
				v
			}

		}

		final private[kobold] def clearCachedPropertiesByPolicy(p: CachePolicy) {
			for (field <- cachedProperties)
				if (field.cachePolicy == p)
					field.clear()
		}
	}
}
