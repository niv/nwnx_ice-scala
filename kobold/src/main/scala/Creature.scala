package es.elv.kobold {
	import NWN._
	import Implicits._
	
	object Creature extends WrappedFactory[NWObject, Creature]((wrapped) => new Creature(wrapped))

	class Creature private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Creature](wrapped, Some(Creature))
			with GameObject[Creature]
			with HasMovement with HasLanguage with HasInventory with HasEffects
			with HasVisualEffects with HasSpellCasting {
		ensureObjectType(ObjectType.Creature)
		
		val plot = P(() => R.proxy.getPlotFlag(this), (v: Boolean) => R.proxy.setPlotFlag(this, v))

		val commandable = P(() => R.proxy.getCommandable(this), (is: Boolean) => R.proxy.setCommandable(is, this))
		val lootable = P(() => R.proxy.getLootable(this), (is: Boolean) => R.proxy.setLootable(this, is))

		val aiLevel = P(() => R.proxy.getAILevel(this), (level: AILevel) => R.proxy.setAILevel(this, level))

		val xp = P(() => R.proxy.getXP(this), (value: Int) => R.proxy.setXP(this, value))

		def weight = P(() => R.proxy.getWeight(this))

		val str = P(() => R.proxy.getAbilityScore(this, Ability.Strength, false))
		val dex = P(() => R.proxy.getAbilityScore(this, Ability.Dexterity, false))
		val con = P(() => R.proxy.getAbilityScore(this, Ability.Constitution, false))
		val wis = P(() => R.proxy.getAbilityScore(this, Ability.Wisdom, false))
		val int = P(() => R.proxy.getAbilityScore(this, Ability.Intelligence, false))
		val cha = P(() => R.proxy.getAbilityScore(this, Ability.Charisma, false))
		val strMod = P(() => R.proxy.getAbilityModifier(Ability.Strength, this))
		val dexMod = P(() => R.proxy.getAbilityModifier(Ability.Dexterity, this))
		val conMod = P(() => R.proxy.getAbilityModifier(Ability.Constitution, this))
		val wisMod = P(() => R.proxy.getAbilityModifier(Ability.Wisdom, this))
		val intMod = P(() => R.proxy.getAbilityModifier(Ability.Intelligence, this))
		val chaMod = P(() => R.proxy.getAbilityModifier(Ability.Charisma, this))

		val arcaneSpellFailure = P(() => R.proxy.getArcaneSpellFailure(this))

		def message(text: String) = R.proxy.sendMessageToPC(this, text)
		def floatingText(text: String, broadcastToFaction: Boolean) =
			R.proxy.floatingTextStringOnCreature(text, this, broadcastToFaction)

		def sit(on: Placeable) = assign { R.proxy.actionSit(on) }

		val appearance = P(() => R.proxy.getAppearanceType(this), (id: Int) => R.proxy.setCreatureAppearanceType(this, id))
		val phenoType = P(() => R.proxy.getPhenoType(this), (id: PhenoType) => R.proxy.setPhenoType(id, this))
		val portraitId = P(() => R.proxy.getPortraitId(this), (id: Int) => R.proxy.setPortraitId(this, id))
		val portrait = P(() => R.proxy.getPortraitResRef(this), (resRef: String) => R.proxy.setPortraitResRef(this, resRef))

		// def bodyPart(part: BodyPart) = R.proxy.getCreatureBodyPart(

		def stealthMode = P(() => R.proxy.getActionMode(this, ActionMode.StealthMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.StealthMode, status))
		def detectMode = P(() => R.proxy.getActionMode(this, ActionMode.DetectMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.DetectMode, status))
		def counterspellMode = P(() => R.proxy.getActionMode(this, ActionMode.CounterspellMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.CounterspellMode, status))
		def defensiveCastMode = P(() => R.proxy.getActionMode(this, ActionMode.DefensiveCastMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.DefensiveCastMode, status))
		def dirtyFightingMode = P(() => R.proxy.getActionMode(this, ActionMode.DirtyFightingMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.DirtyFightingMode, status))
		def expertiseMode = P(() => R.proxy.getActionMode(this, ActionMode.ExpertiseMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.ExpertiseMode, status))
		def flurryOfBlowsMode = P(() => R.proxy.getActionMode(this, ActionMode.FlurryOfBlowsMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.FlurryOfBlowsMode, status))
		def improvedExpertiseMode = P(() => R.proxy.getActionMode(this, ActionMode.ImprovedExpertiseMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.ImprovedExpertiseMode, status))
		def improvedPowerAttackMode = P(() => R.proxy.getActionMode(this, ActionMode.ImprovedPowerAttackMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.ImprovedPowerAttackMode, status))
		def parryMode = P(() => R.proxy.getActionMode(this, ActionMode.ParryMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.ParryMode, status))
		def powerAttackMode = P(() => R.proxy.getActionMode(this, ActionMode.PowerAttackMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.PowerAttackMode, status))
		def rapidShotMode = P(() => R.proxy.getActionMode(this, ActionMode.RapidShotMode), (status: Boolean) => R.proxy.setActionMode(this, ActionMode.RapidShotMode, status))


		// Perception
		def canHear(who: Creature) = R.proxy.getObjectHeard(who, this)
		def canSee(who: Creature) = R.proxy.getObjectSeen(who, this)

	}
}
