package es.elv.kobold {
	import NWN._
	import Implicits._

	package events {
		/** Sent out whenever a GameObject gets added to the cache. */
		case class OnCached(o: G) extends Event

		/** Sent out whenever a GameObject gets invalidated in the cache. */
		case class OnInvalidated(o: G) extends Event
	}

	abstract class GSelector[K <: G] {
	}

	abstract class GFactory[K <: G](val objectType: ObjectType) extends GSelector[K] {
		protected def create(resref: String, where: Location, useAnimation: Boolean, newTag: String) = {
			val r = G[G](R.proxy.createObject(objectType, resref, where, useAnimation, newTag))
			if (r.valid()) {
				r.ll("koboldCreatedAt") = System.currentTimeMillis
				postCreate(r.asInstanceOf[K])
			}
			r
		}

		def apply(resref: String, where: Location): G =
			apply(resref, where, false, "")
		def apply(resref: String, where: Location, useAnimation: Boolean): G =
			apply(resref, where, useAnimation, "")
		def apply(resref: String, where: Location, useAnimation: Boolean, newTag: String): G =
			create(resref, where, useAnimation, newTag)

		/** Override this for post-creation hook. Note that this will not fire if instanciation fails. */
		protected def postCreate(o: K) {}
	}

	abstract class GRefFactory[K <: G](objectType: ObjectType, val resref: String)
			extends GFactory[K](objectType) {

		def apply(where: Location): G =
			apply(where, false, "")
		def apply(where: Location, useAnimation: Boolean): G =
			apply(where, useAnimation, "")
		def apply(where: Location, useAnimation: Boolean, newTag: String): G =
			create(resref, where, useAnimation, newTag)
	}

	abstract class GRefTagFactory[K <: G](objectType: ObjectType, resref: String, val tag: String)
			extends GRefFactory[K](objectType, resref) {

		override def create(resref: String, where: Location, useAnimation: Boolean, newTag: String) =
			super.create(resref, where, useAnimation, tag)
	}

	object G {
		private val log = Kobold.logger()

		private val cache: collection.mutable.Map[Long, G] =
			collection.mutable.Map()

		private val invalidationTime = Kobold.config.getLong("G.invalidateInvalidAfter")

		def getCache = cache

		private var objectClasses: List[(NWObject, Boolean, ObjectType, String, String) => Option[G]] = List()

		/**
			Register a factory that produces instances of G.
			You need to be as specific as possible in your matching, or you will break something.
			Return Some(your G) if you want to handle this NWObject with your class.
			Return None if the given NWObject does not match your custom class.
			The parameters passed in are: NWObject, getIsObjectValid, ObjectType, ResRef, Tag
		*/
		def registerCustomClass(factory: (NWObject, Boolean, ObjectType, String, String) => Option[G]) =
			objectClasses = factory :: objectClasses

		private def registerObjectClass(factory: (NWObject, Boolean, ObjectType, String, String) => Option[G]) =
			objectClasses = objectClasses ::: List(factory)

		registerObjectClass((o, v, t, r, ta) => if (o.id == 0) Some(Module()) else None)
		registerObjectClass((o, v, t, r, ta) => if (o.id == 0x7f000000) Some(Invalid()) else None)
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Store) Some(new Store(o)) else None)
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Trigger) Some(new Trigger(o)) else None)
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Store) Some(new Store(o)) else None)
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Placeable) Some(new Placeable(o)) else None)
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Door) Some(new Door(o)) else None)
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Waypoint) Some(new Waypoint(o)) else None)
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Encounter) Some(new Encounter(o)) else None)
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.AOE) Some(new AOE(o)) else None)

		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Item) Some(R.proxy.getBaseItemType(o) match {
			case BaseItem.CreatureBludgeonWeapon => new CreatureBludgeonWeapon(o)
			case BaseItem.CreaturePierceWeapon => new CreaturePierceWeapon(o)
			case BaseItem.CreatureItem => new CreatureItem(o)
			case BaseItem.CreatureSlashWeapon => new CreatureSlashWeapon(o)
			case BaseItem.CreatureSlashPierceWeapon => new CreatureSlashPierceWeapon(o)

			case BaseItem.Amulet => new Amulet(o)
			case BaseItem.Armor => new Armor(o)
			case BaseItem.Arrow => new Arrow(o)
			case BaseItem.BastardSword => new BastardSword(o)
			case BaseItem.Battleaxe => new Battleaxe(o)
			case BaseItem.Belt => new Belt(o)
			case BaseItem.BlankMagicWand => new BlankMagicWand(o)
			case BaseItem.BlankScroll => new BlankScroll(o)
			case BaseItem.Bolt => new Bolt(o)
			case BaseItem.Book => new Book(o)
			case BaseItem.Boots => new Boots(o)
			case BaseItem.Bracer => new Bracer(o)
			case BaseItem.Bullet => new Bullet(o)
			case BaseItem.Cloak => new Cloak(o)
			case BaseItem.Club => new Club(o)
			case BaseItem.CraftBase => new CraftBase(o)
			case BaseItem.CraftCompBase => new CraftCompBase(o)
			case BaseItem.CraftCompSmall => new CraftCompSmall(o)
			case BaseItem.CraftedMagicWand => new CraftedMagicWand(o)
			case BaseItem.CraftedPotion => new CraftedPotion(o)
			case BaseItem.CraftedScroll => new CraftedScroll(o)
			case BaseItem.Dagger => new Dagger(o)
			case BaseItem.Dart => new Dart(o)
			case BaseItem.DireMace => new DireMace(o)
			case BaseItem.DoubleAxe => new DoubleAxe(o)
			case BaseItem.DwarvenWaraxe => new DwarvenWaraxe(o)
			case BaseItem.EmptyPotion => new EmptyPotion(o)
			case BaseItem.Encampment => new Encampment(o)
			case BaseItem.Gem => new Gem(o)
			case BaseItem.Gloves => new Gloves(o)
			case BaseItem.Gold => new Gold(o)
			case BaseItem.Greataxe => new Greataxe(o)
			case BaseItem.GreatSword => new GreatSword(o)
			case BaseItem.Grenade => new Grenade(o)
			case BaseItem.Halberd => new Halberd(o)
			case BaseItem.Handaxe => new Handaxe(o)
			case BaseItem.HealersKit => new HealersKit(o)
			case BaseItem.HeavyCrossbow => new HeavyCrossbow(o)
			case BaseItem.HeavyFlail => new HeavyFlail(o)
			case BaseItem.Helmet => new Helmet(o)
			case BaseItem.Kama => new Kama(o)
			case BaseItem.Katana => new Katana(o)
			case BaseItem.Key => new Key(o)
			case BaseItem.Kukri => new Kukri(o)
			case BaseItem.Lance => new Lance(o)
			case BaseItem.LargeBox => new LargeBox(o)
			case BaseItem.LargeShield => new LargeShield(o)
			case BaseItem.LightCrossbow => new LightCrossbow(o)
			case BaseItem.LightFlail => new LightFlail(o)
			case BaseItem.LightHammer => new LightHammer(o)
			case BaseItem.LightMace => new LightMace(o)
			case BaseItem.Longbow => new Longbow(o)
			case BaseItem.Longsword => new Longsword(o)
			case BaseItem.MagicRod => new MagicRod(o)
			case BaseItem.MagicStaff => new MagicStaff(o)
			case BaseItem.MagicWand => new MagicWand(o)
			case BaseItem.MiscLarge => new MiscLarge(o)
			case BaseItem.MiscMedium => new MiscMedium(o)
			case BaseItem.MiscSmall => new MiscSmall(o)
			case BaseItem.MiscThin => new MiscThin(o)
			case BaseItem.MoonOnAStick => new MoonOnAStick(o)
			case BaseItem.Morningstar => new Morningstar(o)
			case BaseItem.Potion => new Potion(o)
			case BaseItem.Quarterstaff => new Quarterstaff(o)
			case BaseItem.Rapier => new Rapier(o)
			case BaseItem.Ring => new Ring(o)
			case BaseItem.Scimitar => new Scimitar(o)
			case BaseItem.Scythe => new Scythe(o)
			case BaseItem.Shortbow => new Shortbow(o)
			case BaseItem.ShortSpear => new ShortSpear(o)
			case BaseItem.ShortSword => new ShortSword(o)
			case BaseItem.Shuriken => new Shuriken(o)
			case BaseItem.Sickle => new Sickle(o)
			case BaseItem.Sling => new Sling(o)
			case BaseItem.SmallShield => new SmallShield(o)
			case BaseItem.SpellScroll => new SpellScroll(o)
			case BaseItem.ThievesTools => new ThievesTools(o)
			case BaseItem.ThrowingAxe => new ThrowingAxe(o)
			case BaseItem.Torch => new Torch(o)
			case BaseItem.TowerShield => new TowerShield(o)
			case BaseItem.TrapKit => new TrapKit(o)
			case BaseItem.Trident => new Trident(o)
			case BaseItem.Trumpet => new Trumpet(o)
			case BaseItem.TwobladedSword => new TwobladedSword(o)
			case BaseItem.Warhammer => new Warhammer(o)
			case BaseItem.Whip => new Whip(o)

			case _ => new UnclassifiedItem(o)
		}) else None)

		registerObjectClass((o, v, t, r, ta) => R.proxy.getWeather(o) match {
			case Weather.InvalidWeather => None
			case _ => Some(new Area(o))
		})

		/* There seems to be a bug/undocumented feature in nwserver that sometimes spawns
			an object at the location just where a player logged out, of type ALL
			and with resref = "", tag = "" and name of the player. */
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.All && r == "" && ta == "" &&
				R.proxy.getName(o, true) != "" && R.proxy.getDescription(o, true, true) == "") {
			Some(new UFO(o))
		} else None)

		/* TRUE if oCreature is a DM (Dungeon Master) avatar. Returns FALSE for
			everything else, including creatures controlled by the DM.  */
		registerObjectClass((o, v, t, r, ta) => if (R.proxy.getIsDM(o)) Some(new DM(o)) else None)

		/* Returns ASSOCIATE_TYPE_NONE if the creature is not the associate of anyone. */
		registerObjectClass((o, v, t, r, ta) => R.proxy.getAssociateType(o) match {
			case AssociateType.AnimalCompanionAssociate => Some(new AnimalCompanion(o))
			case AssociateType.FamiliarAssociate        => Some(new Familiar(o))
			case AssociateType.DominatedAssociate       => Some(new NPC(o))
			case AssociateType.HenchmanAssociate        => Some(new NPC(o))
			case AssociateType.SummonedAssociate        => Some(new Summon(o)) // XXX: summons are only flagged AFTER onCreate
			case AssociateType.NoAssociate              => None
		})

		/* Returns TRUE if the creature oCreature is currently possessed by a DM character. */
		/* Note: GetIsDMPossessed() will return FALSE if oCreature is the DM character. */
		registerObjectClass((o, v, t, r, ta) => if (R.proxy.getIsDMPossessed(o)) Some(new NPC(o)) else None)

		/* Resref is always "" for player characters. */
		/* A player controlled character is treated as one of the following: a PC, DM avatars,
			familiars possessed by PCs, monsters possessed by DMs. */
		registerObjectClass((o, v, t, r, ta) => if (r == "" && R.proxy.getIsPC(o)) Some(new Player(o)) else None)

		/* Empty resref: copy of player.  Non-empty: created from template. */
		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Creature) Some(new NPC(o)) else None)

		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.All) r match {
			case "" => Some(new Sound(o))
		} else None)

		registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.InvalidObject) Some(new Invalid(o)) else None)

		/** Invalidate a GameObject and send out an event saying so. */
		private def invalidate(l: Long) = if (cache.contains(l)) {
			val o = cache(l)
			events.EventSource send events.OnInvalidated(o)
			cache -= l
		}

		/**
			Purge the whole cache, removing invalid objects.
			This is a potentially expensive operation.
			Not needed for normal usage.
		*/
		def purgeCache = for ((l,g) <- cache)
			if (g.objAge > invalidationTime && !g.valid())
				invalidate(l)

		/**
			Unconditionally clears out the whole cache.
		*/
		def clearCache = for ((l,g) <- cache)
			invalidate(l)

		def clearCachedProperties(p: cachedproperty.CachePolicy.CachePolicy) =
			cache.foreach((k) => k._2.clearCachedPropertiesByPolicy(p))

		def apply[K <: G](n: Long): K =
			apply[K](new NWObject(n))

		def apply[K <: G](o: NWObject): K = {
			if (cache.contains(o.id) && cache(o.id).objAge > invalidationTime
					&& !cache(o.id).valid())
				invalidate(o.id)

			if (!cache.contains(o.id)) {
				val valid = R.proxy.getIsObjectValid(o)
				val objectType = R.proxy.getObjectType(o)
				val resRef = R.proxy.getResRef(o)
				val tag = R.proxy.getTag(o)

				def selectClass(facList: List[ (NWObject, Boolean, ObjectType, String, String) => Option[G] ]): Option[G] = {
					for (fact <- facList)
						try {
							fact(o, valid, objectType, resRef, tag) match {
								case Some(g) => return Some(g)
								case None =>
							}
						} catch {
							case p: IllegalArgumentException => {
								log.error("while trying to produce: %08x=%s valid=%s ref=%s tag=%s".format(o.id, valid.toString, objectType, resRef, tag), p)
								throw p
							}
						}
					return None
				}

				val kk: G = selectClass(objectClasses) match {
					case Some(g) => g
					case None => throw new Exception("Cannot produce for %08x=%s valid=%s ref=%s tag=%s".format(o.id, valid.toString, objectType, resRef, tag))
				}

				log.debug("%08x=%s valid=%s ref=%s tag=%s -> %s".format(o.id, valid.toString, objectType.toString, resRef, tag, kk.toString))

				kk.valid setNoUpdate valid
				kk.objectType setNoUpdate objectType
				kk.resref setNoUpdate resRef
				kk.tag setNoUpdate tag

				if (kk.cacheClassInstances) {
					events.EventSource send events.OnCached(kk)
					cache(o.id) = kk
				}

				kk.asInstanceOf[K]
			} else {
				cache(o.id).asInstanceOf[K]
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

	abstract case class G private[kobold] (wrapped: NWObject) extends cachedproperty.CachedProperties with ActionQueue {
		import cachedproperty.CachePolicy._
		import cachedproperty._

		/** override this to false in your custom classes to prevent Kobold from caching
			them. Usually not needed. */
		val cacheClassInstances = true

		val objCreatedAt = System.currentTimeMillis
		def objAge = System.currentTimeMillis - objCreatedAt

		lazy val koboldCreatedAt = ll("koboldCreatedAt")

		val objectType = P(Indef, () => R.proxy.getObjectType(this))

		def ensureObjectType(o: ObjectType*) {
			val m = (o contains objectType()) || (objectType() == ObjectType.InvalidObject)

			require(m, "expect one of " + o.toString + ", got: " + objectType().toString)
		}

		val resref = P(Indef, () => R.proxy.getResRef(this))
		val tag: RWCachedProperty[String] = P(Indef, () => R.proxy.getTag(this), (t: String) => { nwnx.Funcs.setTag(this, t); this.tag.clear() })

		val valid = P( () => R.proxy.getIsObjectValid(this) )

		val name: RWCachedProperty[String] = P(() => R.proxy.getName(this, false), (n: String) => { R.proxy.setName(this, n); this.name.clear() })
		val originalName = P(() => R.proxy.getName(this, true))

		def copy(toLocation: Location, toInventory: G): G =
			G(R.proxy.copyObject(this, toLocation, toInventory, ""))

		def destroy: Unit = destroy(0f)
		def destroy(delay: Float): Unit =
			R.proxy.destroyObject(this, delay)

		val ls   = P(new LocalStringMap(this))
		val li   = P(new LocalIntMap(this))
		val ll   = P(new LocalLongMap(this))
		val lb   = P(new LocalBoolMap(this))
		val lo   = P(new LocalObjectMap(this))
		val lf   = P(new LocalFloatMap(this))
		val lv   = P(new LocalVectorMap(this))
		val llo  = P(new LocalLocationMap(this))

		protected def toStringProperties = List(if (valid()) "valid" else "invalid", "ref=" + resref(), "tag=" + tag())
		override def toString = getClass.getName.toString + "(" + (wrapped.id.toHexString :: "name=" + name() :: toStringProperties).mkString(",") + ")"
	}
}
