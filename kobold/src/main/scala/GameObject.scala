package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._
		
	object Invalid {
		class InvalidInstance extends Wrapped[NWObject, InvalidInstance](new NWObject(0x7f000000), None)
			with GameObject[InvalidInstance] {
			override def toStringProperties = List()
		}
		val instance = new InvalidInstance
	}

	object GameObject {

		def apply(o: NWObject): GameObject[_] = {
			o.id match {
				case 0 => Module.instance
				case 0x7f000000 => Invalid.instance
				case _ => R.proxy.getObjectType(o) match {
					case ObjectType.Creature => if (
							R.proxy.getIsPC(o) &&
							!R.proxy.getIsDMPossessed(o) &&
							!R.proxy.getIsPossessedFamiliar(o)
						) Player(o) else Creature(o)
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
					}
					case ObjectType.All => R.proxy.getResRef(o) match {
						case "" => Sound(o)
					}
				}
			}
		}
		
		def byTag[T](tag: String): GameObject[T] =
			GameObject(R.proxy.getObjectByTag(tag, 0)).asInstanceOf[GameObject[T]]

	}

	trait GameObject[K] extends Wrapped[NWObject, K] with cachedproperty.CachedProperties[GameObject[K]] {
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
			if (this == Module.instance)
				return false

			val ret = R.proxy.getIsObjectValid(this)
			if (!ret) invalidate()
			ret
		}

		val name: RWCachedProperty[String, GameObject[K]] = P(() => R.proxy.getName(this, false), (n: String) => { R.proxy.setName(this, n); this.name.clear() })
		val originalName = P(() => R.proxy.getName(this, true))

		def copy(toLocation: Location, toInventory: GameObject[_]): K =
			GameObject(R.proxy.copyObject(this, toLocation, toInventory, "")).asInstanceOf[K] // classOf[K]]

		def destroy: Unit = destroy(0.0)
		def destroy(delay: Double): Unit =
			R.proxy.destroyObject(this, delay)


		private def getLV(key: String, funCall: String) = 1

		def apply(key: String) =
			R.proxy.getLocalString(this, key)
		def apply_=(key: String, value: String) =
			R.proxy.setLocalString(this, key, value)

		protected def toStringProperties = List("ref=" + resref(), "tag=" + tag(), "name=" + name())
		override def toString = getClass.getName.toString + "(" + (wrapped.id.toHexString :: toStringProperties).mkString(",") + ")"
	}
}
