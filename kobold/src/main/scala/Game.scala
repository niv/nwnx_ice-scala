package es.elv.kobold {
	import NWN._
	import Implicits._
	import events._


	trait ActionQueue {
		this: G =>

		def assign(what: => Unit) {
			R assign (this, what)
		}

		def after(delay: Long, what: => Unit) {
			R delay (this, delay / 1000, what)
		}

		def clearActions: Unit = clearActions(true)
		def clearActions(combatToo: Boolean) = assign {
			R.proxy.clearAllActions(combatToo)
		}

		def doWait(msec: Long) = assign {
			R.proxy.actionWait(msec / 1000)
		}

		def currentAction = R.proxy.getCurrentAction(this)
		def idle = !busy
		def busy = currentAction != Action.InvalidAction

		def doLock(what: G with Lock) = assign {
			R.proxy.actionLockObject(what)
		}
	}

	trait Language extends ActionQueue {
		this: G =>

		def speak(channel: TalkVolume, text: String) = assign {
			R.proxy.speakString(text, channel)
		}

		def say(text: String) = speak(TalkVolume.TalkVol, text)
		def shout(text: String) = speak(TalkVolume.ShoutVol, text)
		def whisper(text: String) = speak(TalkVolume.WhisperVol, text)
		def sayParty(text: String) = nwnx.Chat.speakToChannel(this, 6, text, Invalid())
	}

	trait Inventory extends ActionQueue {
		this: G =>

		def hasInventory = R.proxy.allInInventory(this)
		def allInInventory: List[Item] = R.proxy.allInInventory(this).toList.map(G[Item](_))

		def createItem(resref: String,  stacksize: Int): Item = {
			require(stacksize > 0)
			G[Item](R.proxy.createItemOnObject(resref, this, stacksize, ""))
		}

		def giveItem(item: Item, to: G with Inventory) = assign {
			R.proxy.actionGiveItem(item, to)
		}
	}

	trait Equipped extends ActionQueue {
		this: G =>

		def getEquipped: NWCreatureEquipped = R.proxy.allEquipped(this)
		def isEquipped(item: Item) = getEquipped.all contains item

		def equipItem(item: Item, slot: InventorySlot) = assign {
			R.proxy.actionEquipItem(item, slot)
		}

		def unequipItem(item: Item) = assign {
			R.proxy.actionUnequipItem(item)
		}
		def unequipItem(slot: InventorySlot) = assign {
			val item = R.proxy.getItemInSlot(slot, this)
			R.proxy.actionUnequipItem(item)
		}
	}

	trait Position {
		this: G =>

		val location = P(() => R.proxy.getLocation(this) : Location, (n: Location) => R.proxy.jumpToLocation(n))
		val facing = P(() => location().facing, (n: Float) => R.proxy.setFacing(n))
		val area = P(() => location().area : Area)

		/** Returns a List[G] objects in the given radius. */
		def near(radius: Float): List[G] = near(radius, ObjectType.All)

		/** Returns a List[G] of objects matching oType in the given radius. */
		def near(radius: Float, oType: ObjectType): List[G] = R.proxy.allInShape(ShapeType.SphereShape, radius,
			location(), false, oType, Vector.origin) map(x => G[G](x)) filter(x => x != this) toList

		/** Returns a List[G] of VALID objects which klasses match the given types. */
		def near(radius: Float, klasses: Class[G]*): List[G] = R.proxy.allInShape(ShapeType.SphereShape,
			radius, location(), false, ObjectType.All, Vector.origin) map (x => G[G](x)) filter
				(x => klasses.exists(kk => kk.isAssignableFrom(x.getClass))) toList

		/** Returns a List[G] of VALID objects which klasses match the given ObjectType and class types. */
		def near(radius: Float, oType: ObjectType, klasses: Class[G]*): List[G] = R.proxy.allInShape(ShapeType.SphereShape,
			radius, location(), false, oType, Vector.origin) map (x => G[G](x)) filter
				(x => klasses.exists(kk => kk.isAssignableFrom(x.getClass))) toList

		/** Returns a List[T] of VALID objects of a specific class type T &lt;: G in the given radius. */
		def near[T <: G](radius: Float, klass: Class[T]): List[T] = R.proxy.allInShape(ShapeType.SphereShape,
			radius, location(), false, ObjectType.All, Vector.origin) map (x => G[G](x)) filter
				(x => klass.isAssignableFrom(x.getClass)) map (x => x.asInstanceOf[T]) toList

		/** Returns a List[T] of VALID objects of a specific ObjectType and class type T &lt;: G in the given radius. */
		def near[T <: G](radius: Float, mapType: ObjectType, klass: Class[T]): List[T] = R.proxy.allInShape(ShapeType.SphereShape,
			radius, location(), false, mapType, Vector.origin) map (x => G[G](x)) filter
				(x => klass.isAssignableFrom(x.getClass)) map (x => x.asInstanceOf[T]) toList
	}

	trait Movement extends Position with ActionQueue {
		this: G =>

		def walk(to: Location) = assign { R.proxy.actionMoveToLocation(to, false) }
		def run(to: Location) = assign { R.proxy.actionMoveToLocation(to, true) }
		def randomWalk(to: Location) = assign { R.proxy.actionRandomWalk }
		def walkFrom(from: G, range: Float) =
			assign { R.proxy.actionMoveAwayFromObject(from, false, range) }
		def runFrom(from: G, range: Float) =
			assign { R.proxy.actionMoveAwayFromObject(from, true, range) }

		def follow(toFollow: G, followDistance: Float) = assign {
			R.proxy.actionForceFollowObject(toFollow, followDistance)
		}
	}

	trait Trap {
		this: G =>

		def trapDetected(by: G with Creature) = R.proxy.getTrapDetectedBy(this, by)
		def trapDetected(by: G with Creature, status: Boolean) = R.proxy.setTrapDetectedBy(this, by, status)

		val trapped = P(() => R.proxy.getIsTrapped(this))

		val trapType = P(() => R.proxy.getTrapBaseType(this))
		val trapCreator = P(() => R.proxy.getTrapCreator(this))
		val trapFlagged = P(() => R.proxy.getTrapFlagged(this))

		val trapActive = P(() => R.proxy.getTrapActive(this), (b: Boolean) => R.proxy.setTrapActive(this, b))
		val trapDetectDC = P(() => R.proxy.getTrapDetectDC(this), (b: Int) => R.proxy.setTrapDetectDC(this, b))
		val trapDetectable = P(() => R.proxy.getTrapDetectable(this), (b: Boolean) => R.proxy.setTrapDetectable(this, b))
		val trapDisarmDC = P(() => R.proxy.getTrapDisarmDC(this), (b: Int) => R.proxy.setTrapDisarmDC(this, b))
		val trapDisarmable = P(() => R.proxy.getTrapDisarmable(this), (b: Boolean) => R.proxy.setTrapDisarmable(this, b))
		val trapKeyTag = P(() => R.proxy.getTrapKeyTag(this), (b: String) => R.proxy.setTrapKeyTag(this, b))
		val trapOneShot = P(() => R.proxy.getTrapOneShot(this), (b: Boolean) => R.proxy.setTrapOneShot(this, b))
		val trapRecoverable = P(() => R.proxy.getTrapRecoverable(this), (b: Boolean) => R.proxy.setTrapRecoverable(this, b))

	}
	trait Lock {
		this: G =>

		val locked = P(() => R.proxy.getLocked(this), (locked: Boolean) => R.proxy.setLocked(this, locked))
		val lockKeyRequired = P(() => R.proxy.getLockKeyRequired(this), (required: Boolean) => R.proxy.setLockKeyRequired(this, required))
		val lockKeyTag = P(() => R.proxy.getLockKeyTag(this), (tag: String) => R.proxy.setLockKeyTag(this, tag))
		val lockable = P(() => R.proxy.getLockLockable(this), (lockable: Boolean) => R.proxy.setLockLockable(this, lockable))
		val lockDC = P(() => R.proxy.getLockLockDC(this), (dc: Int) => R.proxy.setLockLockDC(this, dc))
		val unlockDC = P(() => R.proxy.getLockUnlockDC(this), (dc: Int) => R.proxy.setLockUnlockDC(this, dc))
	}

	trait SpellCasting extends ActionQueue {
		this: G =>

		def doCounterSpell(o: G) = assign {
			R.proxy.actionCounterSpell(o)
		}
	}
}
