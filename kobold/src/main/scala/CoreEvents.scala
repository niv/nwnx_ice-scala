package es.elv.kobold {
	import net.lag._
	import NWN._
	import Implicits._
	import ImplicitDowncasts._

	object ImplicitDowncasts {
		implicit def item(o: NWObject): Item = Item(o)
		implicit def creature(o: NWObject): Creature = if (
				R.proxy.getIsPC(o) && !R.proxy.getIsDMPossessed(o) && !R.proxy.getIsPossessedFamiliar(o)
			) Player(o) else Creature(o)
		implicit def area(o: NWObject): Area = Area(o)
		implicit def trigger(o: NWObject): Trigger = Trigger(o)
	}

	abstract case class GameEvent() extends Event

	case class EModuleLoad() extends GameEvent
	case class EModuleHB() extends GameEvent

	case class EItemAcquire(val creature: Creature, val from: GameObject[_], val item: Item,
		stackSize: Int) extends GameEvent
	case class EItemUnacquire(val creature: Creature, val item: Item) extends GameEvent
	case class EItemEquip(val item: Item, val creature: Creature) extends GameEvent
	case class EItemUnequip(val item: Item, val creature: Creature) extends GameEvent
	case class EItemActivate(val item: Item, val creature: Creature, val targetObject: GameObject[_],
		val targetLocation: Location) extends GameEvent
	case class EItemSpellCastAt(val item: Item, val caster: Creature, val castItem: Item,
		val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

	case class ECreatureSpawn(val creature: Creature) extends GameEvent
	case class ECreatureDamaged(val creature: Creature, val damager: Creature) extends GameEvent
	case class ECreatureHB(val creature: Creature) extends GameEvent
	case class ECreatureAttacked(val creature: Creature, val attacker: Creature,
		val attackMode: CombatMode, val attackType: SpecialAttack) extends GameEvent
	case class ECreatureConversation(val creature: Creature, val speaker: GameObject[_]) extends GameEvent
	case class ECreatureDeath(val creature: Creature, val killer: Creature) extends GameEvent
	case class ECreatureDisturbed(val creature: Creature, val disturber: Creature) extends GameEvent
	case class ECreatureEndOfRound(val creature: Creature) extends GameEvent
	case class ECreatureHears(val creature: Creature, val who: Creature) extends GameEvent
	case class ECreatureSees(val creature: Creature, val who: Creature) extends GameEvent
	case class ECreatureNoLongerHears(val creature: Creature, val who: Creature) extends GameEvent
	case class ECreatureNoLongerSees(val creature: Creature, val who: Creature) extends GameEvent

	case class ECreatureRest(val creature: Creature) extends GameEvent
	case class ECreatureSpellCastAt(val creature: Creature, val caster: Creature, val castItem: Item,
		val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

	case class EAreaEnter(val area: Area, val creature: Creature) extends GameEvent
	case class EAreaLeave(val area: Area, val creature: Creature) extends GameEvent
	case class ETransitionClick(val transition: GameObject[_], val creature: Creature, val target: GameObject[_]) extends GameEvent /* todo: transition/target = Trigger or Door, but cannot abstract */

	case class EPlayerEnter(val player: Player) extends GameEvent
	case class EPlayerLeave(val player: Player) extends GameEvent
	case class EPlayerDying(val player: Player) extends GameEvent
	case class EPlayerDeath(val player: Player) extends GameEvent
	case class EPlayerRest(val player: Player) extends GameEvent
	case class EPlayerLevelUp(val player: Player) extends GameEvent
	case class EPlayerRespawn(val player: Player) extends GameEvent
	case class EPlayerCutsceneAbort(val player: Player) extends GameEvent

	case class ETrapTriggered(val trap: GameObject[_]) extends GameEvent
	case class ETrapDisarmed(val trap: GameObject[_], val disarmer: Creature) extends GameEvent

	case class ESaveCharacter(val player: Player) extends GameEvent
	// case class ECreaturePickpocket(val creature: Creature, val target: Creature) extends GameEvent
	case class ECreatureAttack(val creature: Creature, val target: GameObject[_]) extends GameEvent
	case class EItemFreeActivate(val creature: Creature, val item: Item, val target: GameObject[_], val targetLocation: Location) extends GameEvent
	case class ECreatureQuickChat(creature: Creature, chat: Int) extends GameEvent
	case class EObjectExamine(val examiner: Creature, val target: GameObject[_]) extends GameEvent
	case class ECreatureUseSkill(val creature: Creature, val skill: Int, val target: GameObject[_], val targetLocation: Location) extends GameEvent
	case class ECreatureUseFeat(val creature: Creature, val feat: Int, val target: GameObject[_], val targetLocation: Location) extends GameEvent
	case class ECreatureToggleMode(val creature: Creature, val mode: ActionMode) extends GameEvent
	case class ECreatureCastSpell(val caster: Creature, val spell: Int, val target: GameObject[_], val targetLocation: Location) extends GameEvent
	case class ETogglePause(player: Player) extends GameEvent
	case class ECreaturePossessFamiliar(creature: Creature) extends GameEvent

	case class EChatTalk(val speaker: GameObject[_], val text: String) extends GameEvent
	case class EChatShout(val speaker: GameObject[_], val text: String) extends GameEvent
	case class EChatWhisper(val speaker: GameObject[_], val text: String) extends GameEvent
	case class EChatPrivate(val speaker: GameObject[_], val to: GameObject[_], val text: String) extends GameEvent
	case class EChatServer(val speaker: GameObject[_], val text: String) extends GameEvent
	case class EChatParty(val speaker: GameObject[_], val text: String) extends GameEvent
	case class EChatSilentShout(val speaker: GameObject[_], val text: String) extends GameEvent
	case class EChatDM(val speaker: GameObject[_], val text: String) extends GameEvent

	object CoreEvents extends Plugin {
		private val log = logging.Logger.get
		import scala.concurrent.ops.future
		import scala.collection._

		private val factories = List(AOE, Area, Creature, Door, Encounter, Item, Placeable, Player, Store, Trigger, Waypoint)

		def invalidateFactories = future(
			factories.foreach((f) => f.getCache.foreach((k) => k._2.clearCachedPropertiesByPolicy(cachedproperty.CachePolicy.Event)))
		)

		private var lastInvalidateRun: () => Unit = future()

		private val actions: mutable.Map[Class[_], mutable.Set[(Option[GameObject[_]], (Event) => Unit)]] = mutable.Map()

		// Register action to be ran with on as self when eventName on on happens. Hah, parse that.
		def once[T <: GameEvent](on: Class[T], self: Option[GameObject[_]], action: (Event) => Unit) {
			if (!actions.contains(on))
				actions(on) = mutable.Set()
			val v = (self, action)
			actions(on) += v
		}

		def nwnxSpeakToChannel(speaker: GameObject[_], channel: Int, text: String, to: GameObject[_]): Unit = {
			if (!speaker.valid)
				return

			if (channel == 4 && !to.valid)
				return

			val t = List(speaker.wrapped.id.toHexString,
				to.wrapped.id.toHexString, channel, text).mkString("¬")

			// R.proxy.setLocalInt(speaker, "ice_chat_message_ignore", 1)
			R.proxy.setLocalString(speaker, "NWNX!CHAT!SPEAK", t)
		}

		private def nwnxGet(obj: NWObject, lib: String, key: String, buf: Int) = {
			R.proxy.setLocalString(obj, "NWNX!" + lib + "!" + key,
				" " * buf)
			R.proxy.getLocalString(obj, "NWNX!" + lib + "!" + key)
		}

		private def nwnxChatPCIn(o: Player) {
			val id = nwnxGet(o, "CHAT", "GETID", 10).trim.toInt
			if (id != -1) {
				R.proxy.setLocalObject(Module(), "chatPC_" + id, o)
				R.proxy.setLocalInt(o, "chatID", id)
			}
		}
		private def nwnxChatPCOut(o: Player) {
			val id = R.proxy.getLocalInt(o, "chatID")
			R.proxy.deleteLocalInt(o, "chatID")
			R.proxy.deleteLocalObject(Module(), "chatPC_" + id)
		}
		private def nwnxChatGetPC(id: Int): Player = {
			Player(R.proxy.getLocalObject(Module(), "chatPC_" + id))
		}

		def listen(e: Event) = {
			// wait for last future
			lastInvalidateRun()

			e match {
				case r: RawEvent => {
					val e: Event = (r.event match {
						case "module_hb"       => EventSource send new EModuleHB()
						case "module_load"     => EventSource send new EModuleLoad()

						case "transition_click" => EventSource send new ETransitionClick(
							GameObject(r.self), R.proxy.getClickingObject,
							GameObject(R.proxy.getTransitionTarget(r.self)))
						case "area_enter" => EventSource send new EAreaEnter(
							r.self, R.proxy.getEnteringObject)
						case "area_leave" => EventSource send new EAreaLeave(
							r.self, R.proxy.getExitingObject)

						case "item_acquire"    => EventSource send new EItemAcquire(
							R.proxy.getModuleItemAcquiredBy, GameObject(R.proxy.getModuleItemAcquiredFrom),
							R.proxy.getModuleItemAcquired, R.proxy.getModuleItemAcquiredStackSize)
						case "item_unacquire"  => EventSource send new EItemUnacquire(
							R.proxy.getModuleItemLostBy, R.proxy.getModuleItemLost)
						case "item_equip"      => EventSource send new EItemEquip(
							R.proxy.getPCItemLastEquipped, R.proxy.getPCItemLastEquippedBy)
						case "item_unequip"    => EventSource send new EItemUnequip(
							R.proxy.getPCItemLastUnequipped, R.proxy.getPCItemLastUnequippedBy)
						case "item_spell_cast_at" => EventSource send new EItemSpellCastAt(
							r.self, R.proxy.getLastSpellCaster, R.proxy.getSpellCastItem,
							R.proxy.getLastSpell, R.proxy.getMetaMagicFeat, R.proxy.getLastSpellHarmful)
						case "item_activate"   => EventSource send new EItemActivate(
							R.proxy.getItemActivator, R.proxy.getItemActivated,
							GameObject(R.proxy.getItemActivatedTarget), R.proxy.getItemActivatedTargetLocation)

						case "creature_spawn"  => EventSource send new ECreatureSpawn(r.self)
						case "creature_hb"     => EventSource send new ECreatureHB(r.self)
						case "creature_attacked" => EventSource send new ECreatureAttacked(
							r.self, R.proxy.getLastAttacker(r.self), R.proxy.getLastAttackMode(r.self),
							R.proxy.getLastAttackType(r.self))
						case "creature_conversation" => EventSource send new ECreatureConversation(
							r.self, GameObject(R.proxy.getLastSpeaker))
						case "creature_damaged" => EventSource send new ECreatureDamaged(
							r.self, R.proxy.getLastDamager(r.self))
						case "creature_death" => EventSource send new ECreatureDeath(
							r.self, R.proxy.getLastKiller)
						case "creature_disturbed" => EventSource send new ECreatureDisturbed(
							r.self, R.proxy.getLastDisturbed)
						case "creature_endofround" => EventSource send new ECreatureEndOfRound(
							r.self)
						case "creature_perceive" => {
							val (heard, seen, inaudible, vanished) = (
								R.proxy.getLastPerceptionHeard, R.proxy.getLastPerceptionSeen,
								R.proxy.getLastPerceptionInaudible, R.proxy.getLastPerceptionVanished
							)
							require(List(heard, seen, inaudible, vanished).count(_ == true) == 1)
							if (heard) EventSource send new ECreatureHears(r.self, R.proxy.getLastPerceived)
							else if (seen) EventSource send new ECreatureSees(r.self, R.proxy.getLastPerceived)
							else if (inaudible) EventSource send new ECreatureNoLongerHears(r.self, R.proxy.getLastPerceived)
							else EventSource send new ECreatureNoLongerSees(r.self, R.proxy.getLastPerceived)
						}
						case "creature_rest" => EventSource send new ECreatureRest(r.self)
						case "creature_spell_cast_at" => EventSource send new ECreatureSpellCastAt(
							r.self, R.proxy.getLastSpellCaster, R.proxy.getSpellCastItem,
							R.proxy.getLastSpell, R.proxy.getMetaMagicFeat, R.proxy.getLastSpellHarmful)


						case "player_enter" => {
							val player = Player(R.proxy.getEnteringObject)
							nwnxChatPCIn(player)
							EventSource send new EPlayerEnter(player)
						}
						case "player_leave" => {
							val player = Player(R.proxy.getExitingObject)
							nwnxChatPCOut(player)
							EventSource send new EPlayerLeave(player)
						}
						case "player_dying" => EventSource send new EPlayerDying(Player(R.proxy.getLastPlayerDying))
						case "player_death" => EventSource send new EPlayerDeath(Player(R.proxy.getLastPlayerDied))
						case "player_rest" => EventSource send new EPlayerRest(Player(R.proxy.getLastPCRested))
						case "player_levelup" => EventSource send new EPlayerLevelUp(Player(R.proxy.getPCLevellingUp))
						case "player_respawn" => EventSource send new EPlayerRespawn(Player(R.proxy.getLastRespawnButtonPresser))
						case "player_cutscene_abort" => EventSource send new EPlayerCutsceneAbort(Player(R.proxy.getLastPCToCancelCutscene))


						/*case "door_click" => EventSource send new E
						case "door_lock" => EventSource send new E
						case "door_unlock" => EventSource send new E
						case "door_open" => EventSource send new E
						case "door_closed" => EventSource send new E
						case "door_attacked" => EventSource send new E
						case "door_damaged" => EventSource send new E
						case "door_death" => EventSource send new E
						case "door_fail_to_open" => EventSource send new E
						case "door_spell_cast_at" => EventSource send new E*/

						case "trap_disarm" => EventSource send new ETrapDisarmed(GameObject(r.self), R.proxy.getLastDisarmed)
						case "trap_triggered" => EventSource send new ETrapTriggered(GameObject(r.self))

						// NWNX
						// case "player_chat" => EventSource send new E

						case "nwnx_event" => {
							val nwnxType = nwnxGet(Module(), "EVENTS", "GET_EVENT_ID", 10).trim.toInt
							val nwnxSubType = nwnxGet(Module(), "EVENTS", "GET_EVENT_SUBID", 10).trim.toInt
							val nwnxItem = R.proxy.getLocalObject(Module(), "NWNX!EVENTS!ITEM")
							val nwnxTarget = R.proxy.getLocalObject(Module(), "NWNX!EVENTS!TARGET")
							val nwnxPosition = {
								val svec = nwnxGet(Module(), "EVENTS", "GET_EVENT_POSITION", 30)
								println("got svec = " + svec)
								if (svec.size == 26) {
									val (x, y, z) = (svec.substring(0, 8).toDouble, svec.substring(9, 17).toDouble,
										svec.substring(18, 26).toDouble)
									Vector(x, y, z)
								} else {
									Vector(0, 0, 0)
								}
							}
							val nwnxLocation = Location(R.proxy.getArea(r.self), nwnxPosition, 0)

							nwnxType match {
								case 1 => EventSource send new ESaveCharacter(Player(r.self))
								// case 2 => EventSource send new ECreaturePickpocket(r.self, nwnxTarget)
								case 3 => EventSource send new ECreatureAttack(r.self, GameObject(nwnxTarget))
								case 4 => EventSource send new EItemFreeActivate(r.self, nwnxItem, GameObject(nwnxTarget), nwnxLocation)
								case 5 => EventSource send new ECreatureQuickChat(r.self, nwnxSubType)
								case 6 => EventSource send new EObjectExamine(r.self, GameObject(nwnxTarget))
								case 7 => EventSource send new ECreatureUseSkill(r.self, nwnxSubType, GameObject(nwnxTarget), nwnxLocation)
								case 8 => EventSource send new ECreatureUseFeat(r.self, nwnxSubType, GameObject(nwnxTarget), nwnxLocation)
								case 9 => EventSource send new ECreatureToggleMode(r.self, ActionMode.convert(nwnxSubType))
								case 10 => EventSource send new ECreatureCastSpell(r.self, nwnxSubType, GameObject(nwnxTarget), nwnxLocation)
								case 11 => EventSource send new ETogglePause(Player(r.self))
								case 12 => EventSource send new ECreaturePossessFamiliar(r.self)
								case _ => log.warning("Unhandled nwnx_event: " + r.event) ; r
							}
						}

						case "nwnx_chat" => {
							/*
							MSG_TALK = 1,
							MSG_SHOUT = 2,
							MSG_WHISPER = 3,
							MSG_PRIVATE = 4,
							MSG_SERVER = 5,
							MSG_PARTY = 6,
							MSG_SILENT_SHOUT = 13,
							MSG_DM = 14,
							MSG_MODE_DM = 16;
							*/
							if (R.proxy.getLocalInt(r.self, "ice_chat_message_ignore") > 0) {
								R.proxy.setLocalInt(r.self, "ice_chat_message_ignore", 0)
								r

							} else {
								val allText = nwnxGet(r.self, "CHAT", "TEXT", 1024) // R.proxy.getLocalString(r.self, "NWNX!CHAT!TEXT")
								val modeWithDM = allText.substring(0, 2).trim.toInt
								val mode = if (modeWithDM > 16) modeWithDM - 16 else modeWithDM
								val toId = allText.substring(2, 12).trim.toInt
								val text = allText.substring(12)
								val to = if (mode == 4) nwnxChatGetPC(toId) else Invalid()

								mode match {
									case  1 => EventSource send new EChatTalk(GameObject(r.self), text)
									case  2 => EventSource send new EChatShout(GameObject(r.self), text)
									case  3 => EventSource send new EChatWhisper(GameObject(r.self), text)
									case  4 => EventSource send new EChatPrivate(GameObject(r.self), to, text)
									case  5 => EventSource send new EChatServer(GameObject(r.self), text)
									case  6 => EventSource send new EChatParty(GameObject(r.self), text)
									case 13 => EventSource send new EChatSilentShout(GameObject(r.self), text)
									case 14 => EventSource send new EChatDM(GameObject(r.self), text)
								}
							}
						}


						case _ => log.warning("Unhandled event received: " + r.event) ; r
					})

					// todo: indirect invocations
					if (actions.contains(e.getClass)) {
						actions(e.getClass).foreach(x => {
							val (self, handler) = (x._1, x._2)
							if ((self.isDefined && r.self.id == self.get.wrapped.id) || self.isEmpty) {
								actions(e.getClass) -= x
								handler(e)
							}
						})
					}

					// log.info(e.toString)

					if (e.stopped)
						r.stop
					if (e.suppressed)
						r.suppress

				}
				case _ =>
			}

			lastInvalidateRun = invalidateFactories
		}
	}
}
