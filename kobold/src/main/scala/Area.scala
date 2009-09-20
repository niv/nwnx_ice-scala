package es.elv.kobold
import NWN._
import Implicits._

object Area extends cachedproperty.CachedProperties {
	import cachedproperty.CachePolicy._

	val all = P(Indef, () => nwnx.Funcs.allAreas)

	val TileSize = 10f
}

/** A special area object for creatures currently in transition. */
object NoArea extends Area(new NWObject(0x7f000000)) {
	def apply() = this
	override val valid = P(() => false)
}

class Area (wrapped: NWObject) extends G(wrapped) {
	import cachedproperty.CachePolicy._

	ensureObjectType()
	// XXX why npe?
	// require(Weather.InvalidWeather != weather())

	case class Tile(val area: Area, val x: Int, val y: Int) extends cachedproperty.CachedProperties {
		import cachedproperty.CachePolicy._

		private val location = Location(area, Vector(x, y, 0), 0)

		val lightMain1: cachedproperty.RWCachedProperty[TileMainLightColor] = P(() =>
			R.proxy.getTileMainLight1Color(location),
			(c: TileMainLightColor) => R.proxy.setTileMainLightColor(location, c, lightMain2())
		)
		val lightMain2: cachedproperty.RWCachedProperty[TileMainLightColor] = P(() =>
			R.proxy.getTileMainLight2Color(location),
			(c: TileMainLightColor) => R.proxy.setTileMainLightColor(location, lightMain1(), c)
		)

		val lightSource1: cachedproperty.RWCachedProperty[TileSourceLightColor] = P(() =>
			R.proxy.getTileSourceLight1Color(location),
			(c: TileSourceLightColor) => R.proxy.setTileSourceLightColor(location, c, lightSource2())
		)
		val lightSource2: cachedproperty.RWCachedProperty[TileSourceLightColor] = P(() =>
			R.proxy.getTileSourceLight2Color(location),
			(c: TileSourceLightColor) => R.proxy.setTileSourceLightColor(location, lightSource1(), c)
		)

		private val startX = Area.TileSize * x
		private val endX   = Area.TileSize * (x + 1)
		private val startY = Area.TileSize * y
		private val endY   = Area.TileSize * (y + 1)

		/** Returns a List[T] of all objects within this tile. */
		def all[T <: G with Position](mapType: ObjectType, klass: Class[T]) = area.all(mapType, klass) filter (v =>
			v.location().position.x >= startX && v.location().position.x < endX &&
			v.location().position.y >= startY && v.location().position.y < endY)
	}

	// Width: 1, Height: 0
	/** The area size in tiles. */
	def size = P(Indef,() => (R.proxy.getAreaSize(1, this), R.proxy.getAreaSize(0, this)))

	/** A List[Til]e of all tiles in this area. */
	def tiles = P(Indef, () => for (x <- 0 until size()._1 ; y <- 0 until size()._2) yield Tile(this, x, y))

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
	def all[T <: G with Position](klass: Class[T]): List[T] =
		all filter (x => klass.isAssignableFrom(x.getClass)) map (x => x.asInstanceOf[T])

	/** Returns a List[T] of VALID objects of a specific class type T &lt;: G in this area. */
	def all[T <: G with Position](mapType: ObjectType, klass: Class[T]): List[T] =
		all(mapType) filter (x => klass.isAssignableFrom(x.getClass)) map (x => x.asInstanceOf[T])

	val aboveGround = P(Indef, () => R.proxy.getIsAreaAboveGround(this))
	val natural =  P(Indef, () => R.proxy.getIsAreaNatural(this))

	val weather = P(() => R.proxy.getWeather(this), (weather: Weather) => R.proxy.setWeather(this, weather))
	val skybox = P(() => R.proxy.getSkyBox(this), (s: Int) => R.proxy.setSkyBox(s, this))
	val fogSunColor   = P(() => R.proxy.getFogColor(1, this), (n: Int) => R.proxy.setFogColor(1, n, this))
	val fogMoonColor  = P(() => R.proxy.getFogColor(2, this), (n: Int) => R.proxy.setFogColor(2, n, this))
	val fogSunAmount  = P(() => R.proxy.getFogAmount(1, this), (n: Int) => R.proxy.setFogAmount(1, n, this))
	val fogMoonAmount = P(() => R.proxy.getFogAmount(2, this), (n: Int) => R.proxy.setFogAmount(2, n, this))

	val tileset = P(Indef, () => R.proxy.getTilesetResRef(this))
}
