package es.elv.kobold {
	import NWN._
	import Implicits._
		
	object G {
		private val cache: collection.mutable.Map[NWObject, G] =
			collection.mutable.Map()

		def invalidate(o: NWObject) {
			if (cache.contains(o))
				cache -= o
		}

		def getCache = cache

		def apply[K <: G](n: Long): K =
			apply[K](new NWObject(n))

		def apply[K <: G](o: NWObject): K = {
			if (!cache.contains(o)) {
				lazy val isPC = R.proxy.getIsPC(o) &&
					!R.proxy.getIsDMPossessed(o) &&
					!R.proxy.getIsPossessedFamiliar(o)

				val kk = o.id match {
					case 0 => Module()
					case 0x7f000000 => Invalid()
					case _ => R.proxy.getObjectType(o) match {
						case ObjectType.Creature => if (isPC)
							new Player(o) else new NonPlayer(o)
						case ObjectType.Item => new Item(o)
						case ObjectType.Trigger => new Trigger(o)
						case ObjectType.Store => new Store(o)
						case ObjectType.Placeable => new Placeable(o)
						case ObjectType.Door => new Door(o)
						case ObjectType.Waypoint => new Waypoint(o)
						case ObjectType.Encounter => new Encounter(o)
						case ObjectType.AOE => new AOE(o)
						case ObjectType.InvalidObject => R.proxy.getWeather(o) match {
								case Weather.InvalidWeather => new Invalid(o)
								case _ => new Area(o)
						}
						case ObjectType.All => R.proxy.getResRef(o) match {
							case "" => new Sound(o)
						}
					}
				}
				if (!kk.isInstanceOf[Invalid])
					cache(o) = kk
				kk.asInstanceOf[K]
			} else {
				cache(o).asInstanceOf[K]
			}
		}
		
		/**
			Returns the first object with the given tag.
		*/
		def byTag(tag: String): G = byTag(tag, 0)

		/**
			Returns the nth object with the given tag.
		*/
		def byTag(tag: String, index: Int): G =
			G(R.proxy.getObjectByTag(tag, index))
		
		/**
			Returns a list of all objects with the given tag.
		*/
		def allByTag(tag: String): List[G] =
			R.proxy.allByTag(tag).map(G(_)).toList

	}

	abstract case class G private[kobold] (wrapped: NWObject) extends cachedproperty.CachedProperties[G] {
		import cachedproperty.CachePolicy._
		import cachedproperty._

		val createdAt = System.currentTimeMillis

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

		val name: RWCachedProperty[String, G] = P(() => R.proxy.getName(this, false), (n: String) => { R.proxy.setName(this, n); this.name.clear() })
		val originalName = P(() => R.proxy.getName(this, true))

		def copy(toLocation: Location, toInventory: G): G =
			G(R.proxy.copyObject(this, toLocation, toInventory, ""))

		def destroy: Unit = destroy(0.0)
		def destroy(delay: Double): Unit =
			R.proxy.destroyObject(this, delay)

		lazy val ls   = new LocalStringMap(this)
		lazy val li   = new LocalIntMap(this)
		lazy val ll   = new LocalLongMap(this)
		lazy val lb   = new LocalBoolMap(this)
		lazy val lo   = new LocalObjectMap(this)
		lazy val lf   = new LocalFloatMap(this)
		lazy val lv   = new LocalVectorMap(this)
		lazy val llo  = new LocalLocationMap(this)

		protected def toStringProperties = List(if (valid) "valid" else "invalid", "ref=" + resref(), "tag=" + tag(), "name=" + name())
		override def toString = getClass.getName.toString + "(" + (wrapped.id.toHexString :: toStringProperties).mkString(",") + ")"
	}
}
