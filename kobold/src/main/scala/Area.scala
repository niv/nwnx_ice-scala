package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Area extends WrappedFactory[NWObject, Area]((wrapped) => new Area(wrapped))

	class Area private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Area](wrapped, Some(Area)) with G[Area] {
		def allObjects: List[G[_]] =
			R.proxy.allInArea(this).toList.map(G(_))

		ensureObjectType()
		// XXX why npe?
		// require(Weather.InvalidWeather != weather())

		val weather = P(() => R.proxy.getWeather(this), (weather: Weather) => R.proxy.setWeather(this, weather))
	}
}
