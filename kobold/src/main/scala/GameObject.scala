package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._
		
	object G {

		def apply(o: NWObject): G[_] = {
			def isPC(o: NWObject) = R.proxy.getIsPC(o) &&
				!R.proxy.getIsDMPossessed(o) &&
				!R.proxy.getIsPossessedFamiliar(o)

			o.id match {
				case 0 => Module()
				case 0x7f000000 => Invalid()
				case _ => R.proxy.getObjectType(o) match {
					case ObjectType.Creature => if (isPC(o))
						Player(o) else NonPlayer(o)
					case ObjectType.Item => Item(o)
					case ObjectType.Trigger => Trigger(o)
					case ObjectType.Store => Store(o)
					case ObjectType.Placeable => Placeable(o)
					case ObjectType.Door => Door(o)
					case ObjectType.Waypoint => Waypoint(o)
					case ObjectType.Encounter => Encounter(o)
					case ObjectType.AOE => AOE(o)
					case ObjectType.InvalidObject => R.proxy.getWeather(o) match {
							case Weather.ClearWeather => Area(o)
							case Weather.RainWeather => Area(o)
							case Weather.SnowWeather => Area(o)
							case Weather.AreaDefaultsWeather => Area(o)
							case Weather.InvalidWeather => Invalid(o)
					}
					case ObjectType.All => R.proxy.getResRef(o) match {
						case "" => Sound(o)
					}
				}
			}
		}
		
		def byTag[T](tag: String): G[T] =
			G(R.proxy.getObjectByTag(tag, 0)).asInstanceOf[G[T]]

	}

	trait G[K] extends Wrapped[NWObject, K] with cachedproperty.CachedProperties[G[K]] {
		this: K =>

		import cachedproperty.CachePolicy._
		import cachedproperty._

		val createdAt = new java.util.Date

		val objectType = R.proxy.getObjectType(this)


		def ensureObjectType(o: ObjectType*) {
			val m = (o contains objectType) || (objectType == ObjectType.InvalidObject)

			require(m, "creating something, expected: " + o.toString + ", got: " + objectType.toString)
		}

		val resref = P( Indef, () => R.proxy.getResRef(this) )
		val tag = P( () => R.proxy.getTag(this) )

		def valid: Boolean = {
			if (this == Module())
				return false

			val ret = R.proxy.getIsObjectValid(this)
			if (!ret) invalidate()
			ret
		}

		val name: RWCachedProperty[String, G[K]] = P(() => R.proxy.getName(this, false), (n: String) => { R.proxy.setName(this, n); this.name.clear() })
		val originalName = P(() => R.proxy.getName(this, true))

		def copy(toLocation: Location, toInventory: G[_]): K =
			G(R.proxy.copyObject(this, toLocation, toInventory, "")).asInstanceOf[K] // classOf[K]]

		def destroy: Unit = destroy(0.0)
		def destroy(delay: Double): Unit =
			R.proxy.destroyObject(this, delay)


		def li(key: String) = R.proxy.getLocalInt(this, key)
		def li(key: String, value: Int) = R.proxy.setLocalInt(this, key, value)
		def ls(key: String) = R.proxy.getLocalString(this, key)
		def ls(key: String, value: String) = R.proxy.setLocalString(this, key, value)
		def lf(key: String) = R.proxy.getLocalFloat(this, key)
		def lf(key: String, value: Float) = R.proxy.setLocalFloat(this, key, value)
		def lo(key: String) = G(R.proxy.getLocalObject(this, key))
		def lo(key: String, value: G[_]) = R.proxy.setLocalObject(this, key, value)

		protected def toStringProperties = List("ref=" + resref(), "tag=" + tag(), "name=" + name())
		override def toString = getClass.getName.toString + "(" + (wrapped.id.toHexString :: toStringProperties).mkString(",") + ")"
	}
}
