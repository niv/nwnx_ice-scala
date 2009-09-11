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
		def allObjects: List[G] =
			R.proxy.allInArea(this).toList.map(G(_))

		ensureObjectType()
		// XXX why npe?
		// require(Weather.InvalidWeather != weather())

		val weather = P(() => R.proxy.getWeather(this), (weather: Weather) => R.proxy.setWeather(this, weather))
	}

}
