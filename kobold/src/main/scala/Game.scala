package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._
	import events._


	trait ActionQueue {
		this: GameObject[_] =>

		def assign(what: => Unit) {
			R assign (this, what)
		}

		def clearActions: Unit = clearActions(true)
		def clearActions(combatToo: Boolean) = assign {
			R.proxy.clearAllActions(combatToo)
		}

		def doWait(seconds: Double) = assign {
			R.proxy.actionWait(seconds)
		}

		def currentAction = R.proxy.getCurrentAction(this)
		def isBusy = currentAction != Action.InvalidAction

		def doLock(what: GameObject[_] with Lock) = assign {
			R.proxy.actionLockObject(what)
		}
	}

	trait Language extends ActionQueue {
		this: GameObject[_] =>

		def speak(channel: TalkVolume, text: String) = assign {
			R.proxy.actionSpeakString(text, channel)
		}

		def say(text: String) = speak(TalkVolume.TalkVol, text)
		def shout(text: String) = speak(TalkVolume.ShoutVol, text)
		def whisper(text: String) = speak(TalkVolume.WhisperVol, text)
	}

	trait Inventory extends ActionQueue {
		this: GameObject[_] =>

		def hasInventory = R.proxy.allInInventory(this)
		def allInInventory: List[Item] = R.proxy.allInInventory(this).toList.map(Item(_))
		def getEquipped: NWCreatureEquipped = R.proxy.allEquipped(this)
		def isEquipped(item: Item) = getEquipped.all contains item

		def createItem(resref: String,  stacksize: Int): Item = {
			require(stacksize > 0)
			Item(R.proxy.createItemOnObject(resref, this, stacksize, ""))
		}

		def giveItem(item: Item, to: GameObject[_] with Inventory) = assign {
			R.proxy.actionGiveItem(item, to)
		}

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
		this: GameObject[_] =>

		val location = P(() => R.proxy.getLocation(this) : Location, (n: Location) => R.proxy.jumpToLocation(n))
		val facing = P(() => location().facing, (n: Double) => R.proxy.setFacing(n))
		val area = P(() => location().area : Area)
	}

	trait Movement extends Position with ActionQueue {
		this: GameObject[_] =>

		def walk(to: Location) = assign { R.proxy.actionMoveToLocation(to, false) }
		def run(to: Location) = assign { R.proxy.actionMoveToLocation(to, true) }
		def randomWalk(to: Location) = assign { R.proxy.actionRandomWalk }
		def walkFrom(from: GameObject[_], range: Double) =
			assign { R.proxy.actionMoveAwayFromObject(from, false, range) }
		def runFrom(from: GameObject[_], range: Double) =
			assign { R.proxy.actionMoveAwayFromObject(from, true, range) }

		def follow(toFollow: GameObject[_], followDistance: Double) = assign {
			R.proxy.actionForceFollowObject(toFollow, followDistance)
		}
	}

	trait Effects extends ActionQueue {
		this: GameObject[_] =>
		
		private implicit def e2e(w: NWEffect) = new Effect(w)

		def effects: List[Effect] = R.proxy.allEffects(this).toList.map(new Effect(_))

		/** Apply a temporary effect to this object. */
		def <+(e: Effect, duration: Double) = applyEffect(this, e, DurationType.Temporary, duration)

		/** Apply a instantaneous effect to this object. */
		def <<(e: Effect) = applyEffect(this, e, DurationType.Instant, 0)

		/** Apply a permanent effect to this object. */
		def <*(e: Effect) = applyEffect(this, e, DurationType.Permanent, 0)

		def applyEffect(creator: ActionQueue, e: Effect, durationType: DurationType, duration: Double) =
			creator assign { R.proxy.applyEffectToObject(durationType, e, this, duration) }
	
		/** Remove the given effect from this object. Does nothing if this effect is not applied. */
		def removeEffect(e: Effect) = R.proxy.removeEffect(this, e)
	}

	trait VisualEffects {
		this: GameObject[_] =>

		/** Show a temporary visual effect on this object. */
		def ^+(e: Int, duration: Double): Unit = vfx(e, DurationType.Temporary, duration)
		/** Show a instantaneous visual effect on this object. */
		def ^^(e: Int): Unit = vfx(e, DurationType.Instant, 0)
		/** Show a permanent visual effect on this object. */
		def ^*(e: Int): Unit = vfx(e, DurationType.Permanent, 0)

		def vfx(e: Int, durationType: DurationType, duration: Double) =
			R.proxy.applyEffectToObject(durationType,
				R.proxy.effectVisualEffect(e, false),
				this, duration)
	}

	trait Trap {
		this: GameObject[_] =>

		def createTrap(creator: ActionQueue, trapType: TrapType, faction: StandardFaction,
				onDisarm: (Event) => Unit, onTriggered: (Event) => Unit) {

			// CoreEvents.once(classOf[ETrapDisarmed], Some(this), onDisarm)
			// CoreEvents.once(classOf[ETrapTriggered], Some(this), onTriggered)

			creator assign { R.proxy.createTrapOnObject(trapType, this, faction, "trap_disarm", "trap_trigger") }
		}
		
		def trapDetected(by: GameObject[_] with Creature) = R.proxy.getTrapDetectedBy(this, by)
		def trapDetected(by: GameObject[_] with Creature, status: Boolean) = R.proxy.setTrapDetectedBy(this, by, status)

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
		this: GameObject[_] =>

		val locked = P(() => R.proxy.getLocked(this), (locked: Boolean) => R.proxy.setLocked(this, locked))
		val lockKeyRequired = P(() => R.proxy.getLockKeyRequired(this), (required: Boolean) => R.proxy.setLockKeyRequired(this, required))
		val lockKeyTag = P(() => R.proxy.getLockKeyTag(this), (tag: String) => R.proxy.setLockKeyTag(this, tag))
		val lockable = P(() => R.proxy.getLockLockable(this), (lockable: Boolean) => R.proxy.setLockLockable(this, lockable))
		val lockDC = P(() => R.proxy.getLockLockDC(this), (dc: Int) => R.proxy.setLockLockDC(this, dc))
		val unlockDC = P(() => R.proxy.getLockUnlockDC(this), (dc: Int) => R.proxy.setLockUnlockDC(this, dc))
	}

	trait SpellCasting extends ActionQueue {
		this: GameObject[_] =>

		def doCounterSpell(o: GameObject[_]) = assign {
			R.proxy.actionCounterSpell(o)
		}
	}
}
