package es.elv.kobold
import NWN._
import Implicits._

object Creature extends GFactory[Creature](ObjectType.Creature)

abstract class Creature(wrapped: NWObject) extends G(wrapped)
		with Movement with Language with Inventory with Equipped with Effects
		with VisualEffects with SpellCasting {

	ensureObjectType(ObjectType.Creature)

	val racialType = P(() => R.proxy.getRacialType(this))

	val commandable = P(() => R.proxy.getCommandable(this), (is: Boolean) => R.proxy.setCommandable(is, this))
	val lootable = P(() => R.proxy.getLootable(this), (is: Boolean) => R.proxy.setLootable(this, is))

	def weight = P(() => R.proxy.getWeight(this))

	private def abilityScore(i: Ability) = P(() => R.proxy.getAbilityScore(this, i, false))
	val str = abilityScore(Ability.Strength)
	val dex = abilityScore(Ability.Dexterity)
	val con = abilityScore(Ability.Constitution)
	val wis = abilityScore(Ability.Wisdom)
	val int = abilityScore(Ability.Intelligence)
	val cha = abilityScore(Ability.Charisma)
	private def abilityModifier(i: Ability) = P(() => R.proxy.getAbilityModifier(i, this))
	val strMod = abilityModifier(Ability.Strength)
	val dexMod = abilityModifier(Ability.Dexterity)
	val conMod = abilityModifier(Ability.Constitution)
	val wisMod = abilityModifier(Ability.Wisdom)
	val intMod = abilityModifier(Ability.Intelligence)
	val chaMod = abilityModifier(Ability.Charisma)

	val arcaneSpellFailure = P(() => R.proxy.getArcaneSpellFailure(this))


	val xp = P(() => R.proxy.getXP(this), (value: Int) => R.proxy.setXP(this, value))

	def message(text: String) = R.proxy.sendMessageToPC(this, text)
	def floatingText(text: String): Unit =
		floatingText(text, false)
	def floatingText(text: String, broadcastToFaction: Boolean) =
		R.proxy.floatingTextStringOnCreature(text, this, broadcastToFaction)

	def doSit(on: Placeable) = assign { R.proxy.actionSit(on) }
	def doPickUpItem(item: Item) = assign { R.proxy.actionPickUpItem(item) }
	def doPutDownItem(item: Item) = assign { R.proxy.actionPutDownItem(item) }

	val appearance = P(() => R.proxy.getAppearanceType(this), (id: Int) => R.proxy.setCreatureAppearanceType(this, id))
	val phenoType = P(() => R.proxy.getPhenoType(this), (id: PhenoType) => R.proxy.setPhenoType(id, this))
	val portraitId = P(() => R.proxy.getPortraitId(this), (id: Int) => R.proxy.setPortraitId(this, id))
	val portrait = P(() => R.proxy.getPortraitResRef(this), (resRef: String) => R.proxy.setPortraitResRef(this, resRef))

	private def getSetActionMode(m: ActionMode) = P(() => R.proxy.getActionMode(this, m), (status: Boolean) => R.proxy.setActionMode(this, m, status))
	val stealthMode = getSetActionMode(ActionMode.StealthMode)
	val detectMode = getSetActionMode(ActionMode.DetectMode)
	val counterspellMode = getSetActionMode(ActionMode.CounterspellMode)
	val defensiveCastMode = getSetActionMode(ActionMode.DefensiveCastMode)
	val dirtyFightingMode = getSetActionMode(ActionMode.DirtyFightingMode)
	val expertiseMode = getSetActionMode(ActionMode.ExpertiseMode)
	val flurryOfBlowsMode = getSetActionMode(ActionMode.FlurryOfBlowsMode)
	val improvedExpertiseMode = getSetActionMode(ActionMode.ImprovedExpertiseMode)
	val improvedPowerAttackMode = getSetActionMode(ActionMode.ImprovedPowerAttackMode)
	val parryMode = getSetActionMode(ActionMode.ParryMode)
	val powerAttackMode = getSetActionMode(ActionMode.PowerAttackMode)
	val rapidShotMode = getSetActionMode(ActionMode.RapidShotMode)

	/** Contains a List of classes. */
	val classes = P(() => {
		List(R.proxy.getClassByPosition(1, this),
			R.proxy.getClassByPosition(2, this),
			R.proxy.getClassByPosition(3, this)
		).filter(_ != 255)
	})

	/** Contains a SortedMap of class -> level. */
	val classLevels = P(() => {
		collection.immutable.TreeMap[Int, Int]() ++ this.classes().map(k =>
			k -> R.proxy.getLevelByClass(k, this)
		)
	})

	/** Returns true if this Creature has the feat in question. */
	def hasFeat(feat: Int) = R.proxy.getHasFeat(feat, this)

	/** Returns true if this Creature can hear who. */
	def hears(who: Creature) = R.proxy.getObjectHeard(who, this)

	/** Returns true if this Creature can see who. */
	def sees(who: Creature) = R.proxy.getObjectSeen(who, this)

	def alive = !dead
	def dead = R.proxy.getIsDead(this)
}
