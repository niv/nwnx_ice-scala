package es.elv.kobold {
	import NWN._
	import Implicits._

	object G {
		private val log = Kobold.logger()

		private val cache: collection.mutable.Map[NWObject, G] =
			collection.mutable.Map()

		def getCache = cache
		def invalidate(o: NWObject) = if (cache.contains(o)) cache -= o

		private var objectClasses: List[(NWObject, =>ObjectType, =>String, =>String) => Option[G]] = List()

		/**
			Register a factory that produces instances of G.
			You need to be as specific as possible in your matching, or you will break something.
			Return Some(your G) if you want to handle this NWObject with your class.
			Return None if the given NWObject does not match your custom class.
			The parameters passed in are: NWObject, ObjectType, ResRef, Tag
		*/
		def registerCustomClass(factory: (NWObject, =>ObjectType, =>String, =>String) => Option[G]) =
			objectClasses = factory :: objectClasses

		private def registerObjectClass(factory: (NWObject, =>ObjectType, =>String, =>String) => Option[G]) =
			objectClasses = objectClasses ::: List(factory)

		registerObjectClass((o, t, r, ta) => if (o.id == 0) Some(Module()) else None)
		registerObjectClass((o, t, r, ta) => if (o.id == 0x7f000000) Some(Invalid()) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.Item) Some(new Item(o)) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.Store) Some(new Store(o)) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.Item) Some(new Item(o)) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.Trigger) Some(new Trigger(o)) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.Store) Some(new Store(o)) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.Placeable) Some(new Placeable(o)) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.Door) Some(new Door(o)) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.Waypoint) Some(new Waypoint(o)) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.Encounter) Some(new Encounter(o)) else None)
		registerObjectClass((o, t, r, ta) => if (t == ObjectType.AOE) Some(new AOE(o)) else None)

		registerObjectClass((o, t, r, ta) => R.proxy.getWeather(o) match {
			case Weather.InvalidWeather => None
			case _ => Some(new Area(o))
		})

		/* TRUE if oCreature is a DM (Dungeon Master) avatar. Returns FALSE for
			everything else, including creatures controlled by the DM.  */
		registerObjectClass((o, t, r, ta) => if (R.proxy.getIsDM(o)) Some(new DM(o)) else None)

		/* Returns TRUE if the creature oCreature is currently possessed by a DM character. */
		/* Note: GetIsDMPossessed() will return FALSE if oCreature is the DM character. */
		registerObjectClass((o, t, r, ta) => if (R.proxy.getIsDMPossessed(o)) Some(new NonPlayer(o)) else None)

		/* Returns ASSOCIATE_TYPE_NONE if the creature is not the associate of anyone. */
		registerObjectClass((o, t, r, ta) => R.proxy.getAssociateType(o) match {
			case AssociateType.AnimalCompanionAssociate => Some(new AnimalCompanion(o))
			case AssociateType.FamiliarAssociate        => Some(new Familiar(o))
			case AssociateType.DominatedAssociate       => Some(new NonPlayer(o))
			case AssociateType.HenchmanAssociate        => Some(new NonPlayer(o))
			case AssociateType.SummonedAssociate        => Some(new Summon(o))
			case AssociateType.NoAssociate              => None
		})

		/* Resref is always "" for player characters. */
		/* A player controlled character is treated as one of the following: a PC, DM avatars,
			familiars possessed by PCs, monsters possessed by DMs. */
		registerObjectClass((o, t, r, ta) => if (r == "" && R.proxy.getIsPC(o)) Some(new Player(o)) else None)

		registerObjectClass((o, t, r, ta) => if (r != "" && t == ObjectType.Creature) Some(new NonPlayer(o)) else None)

		registerObjectClass((o, t, r, ta) => if (t == ObjectType.All) r match {
			case "" => Some(new Sound(o))
		} else None)

		registerObjectClass((o, t, r, ta) => if (t == ObjectType.InvalidObject) Some(new Invalid(o)) else None)

		def apply[K <: G](n: Long): K =
			apply[K](new NWObject(n))

		def apply[K <: G](o: NWObject): K = {
			if (!cache.contains(o)) {
				lazy val objectType = R.proxy.getObjectType(o)
				lazy val resRef = R.proxy.getResRef(o)
				lazy val tag = R.proxy.getTag(o)

				def selectClass(facList: List[ (NWObject, =>ObjectType, =>String, =>String) => Option[G] ]): Option[G] = {
					for (fact <- facList)
						fact(o, objectType, resRef, tag) match {
							case Some(g) => return Some(g)
							case None =>
						}
					return None
				}

				val kk: G = selectClass(objectClasses) match {
					case Some(g) => g
					case None => throw new Exception("Cannot produce a class for %08x=%s ref=%s tag=%s".format(o.id, objectType, resRef, tag))
				}

				log.debug("%08x=%s ref=%s tag=%s -> %s".format(o.id, objectType.toString, resRef, tag, kk.toString))

				if (kk.cacheClassInstances)
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

		/** override this to false in your custom classes to prevent Kobold from caching
			them. Usually not needed. */
		val cacheClassInstances = true

		val createdAt = System.currentTimeMillis

		val objectType = R.proxy.getObjectType(this)

		def ensureObjectType(o: ObjectType*) {
			val m = (o contains objectType) || (objectType == ObjectType.InvalidObject)

			require(m, "expect one of " + o.toString + ", got: " + objectType.toString)
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
