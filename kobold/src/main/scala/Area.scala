package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Area {
		lazy val all = nwnx.Funcs.allAreas
	}

	class Area private[kobold] (wrapped: NWObject) extends G(wrapped) {
		def allObjects: List[G] =
			R.proxy.allInArea(this).toList.map(G(_))

		ensureObjectType()
		// XXX why npe?
		// require(Weather.InvalidWeather != weather())

		val weather = P(() => R.proxy.getWeather(this), (weather: Weather) => R.proxy.setWeather(this, weather))
	}
}
