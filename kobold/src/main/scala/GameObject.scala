package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._
		
	object G {

		def apply(n: Long): G[_] =
			apply(new NWObject(n))

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
		
		/**
			Returns the first object with the given tag.
		*/
		def byTag(tag: String): G[_] = byTag(tag, 0)

		/**
			Returns the nth object with the given tag.
		*/
		def byTag(tag: String, index: Int): G[_] =
			G(R.proxy.getObjectByTag(tag, index))
		
		/**
			Returns a list of all objects with the given tag.
		*/
		def allByTag(tag: String): List[G[_]] =
			R.proxy.allByTag(tag).map(G(_)).toList

	}

	abstract class G[K](wrapped: NWObject, factory: Option[WrappedFactory[NWObject, K]]) extends Wrapped[NWObject, K](wrapped, factory)
			with cachedproperty.CachedProperties[G[K]] {
		this: K =>

		override def equals(what: Any) = what match {
			case o: G[K] => o.wrapped.id == this.wrapped.id
			case _ => false
		}

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
				return true

			R.proxy.getIsObjectValid(this)
		}

		val name: RWCachedProperty[String, G[K]] = P(() => R.proxy.getName(this, false), (n: String) => { R.proxy.setName(this, n); this.name.clear() })
		val originalName = P(() => R.proxy.getName(this, true))

		def copy(toLocation: Location, toInventory: G[_]): G[_] =
			G(R.proxy.copyObject(this, toLocation, toInventory, ""))

		def destroy: Unit = destroy(0.0)
		def destroy(delay: Double): Unit =
			R.proxy.destroyObject(this, delay)

		lazy val ls   = new LocalStringMap(this)
		lazy val li   = new LocalIntMap(this)
		lazy val lb   = new LocalBoolMap(this)
		lazy val lo   = new LocalObjectMap(this)
		lazy val lf   = new LocalFloatMap(this)

		protected def toStringProperties = List(if (valid) "valid" else "invalid", "ref=" + resref(), "tag=" + tag(), "name=" + name())
		override def toString = getClass.getName.toString + "(" + (wrapped.id.toHexString :: toStringProperties).mkString(",") + ")"
	}
}
