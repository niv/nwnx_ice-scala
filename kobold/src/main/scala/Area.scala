package es.elv.kobold {
	import NWN._
	import Implicits._

	object Area extends cachedproperty.CachedProperties {
		import cachedproperty.CachePolicy._

		val all = P(Indef, () => nwnx.Funcs.allAreas)
	}

	/** A special area object for creatures currently in transition. */
	object NoArea extends Area(new NWObject(0x7f000000)) {
		def apply() = this
		override val valid = P(() => false)
	}

	class Area (wrapped: NWObject) extends G(wrapped) {

		ensureObjectType()
		// XXX why npe?
		// require(Weather.InvalidWeather != weather())

		/** Returns a List[G] objects in this area.
			Note: This is a rather expensive operation.
			Use the ObjectType-parametrized version if possible.
		*/
		def all: List[G] = R.proxy allInArea(this) map (g => G[G](g)) toList

		/** Returns a List[G] of objects matching oType in this area. */
		def all(oType: ObjectType): List[G] =
			R.proxy allInAreaOfType(this, oType) map (g => G[G](g)) toList

		/** Returns a List[G] of VALID objects of a specific class type T &lt;: G in this area.
			Note: This is a rather expensive operation.
			Use the ObjectType-parametrized version if possible.
		*/
		def all(klasses: Class[G]*): List[G] =
			all filter (x => klasses.exists(kk => kk.isAssignableFrom(x.getClass)))

		/** Returns a List[G] of VALID objects of a specific class type T &lt;: G in this area. */
		def all(oType: ObjectType, klasses: Class[G]*): List[G] =
			all(oType) filter (x => klasses.exists(kk => kk.isAssignableFrom(x.getClass)))

		/** Returns a List[T] of VALID objects of a specific class type T &lt;: G in this area.
			Note: This is a rather expensive operation.
			Use the ObjectType-parametrized version if possible.
		*/
		def all[T <: G](klass: Class[T]): List[T] =
			all filter (x => klass.isAssignableFrom(x.getClass)) map (x => x.asInstanceOf[T])

		/** Returns a List[T] of VALID objects of a specific class type T &lt;: G in this area. */
		def all[T <: G](mapType: ObjectType, klass: Class[T]): List[T] =
			all(mapType) filter (x => klass.isAssignableFrom(x.getClass)) map (x => x.asInstanceOf[T])

		val weather = P(() => R.proxy.getWeather(this), (weather: Weather) => R.proxy.setWeather(this, weather))
	}

}
