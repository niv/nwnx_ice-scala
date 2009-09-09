package es.elv.kobold {
	import NWN._
	import scala.collection._
	import scala.actors._
	import scala._
	import Implicits._

	trait Effects extends ActionQueue {
		this: G =>

		def effects: List[Effect] = R.proxy.allEffects(this).toList.map(Effect(_))

		/** Apply a temporary effect to this object. */
		def <+(e: Effect, duration: Float) = applyEffect(this, e, DurationType.Temporary, duration)

		/** Apply a instantaneous effect to this object. */
		def <<(e: Effect) = applyEffect(this, e, DurationType.Instant, 0)

		/** Apply a permanent effect to this object. */
		def <*(e: Effect) = applyEffect(this, e, DurationType.Permanent, 0)

		def applyEffect(creator: ActionQueue, e: Effect, durationType: DurationType, duration: Float) =
			creator assign { R.proxy.applyEffectToObject(durationType, e, this, duration) }

		/** Remove the given effect from this object. Does nothing if this effect is not applied. */
		def removeEffect(e: Effect) = R.proxy.removeEffect(this, e)
	}

	trait VisualEffects {
		this: G =>

		/** Show a temporary visual effect on this object. */
		def ^+(e: Int, duration: Float): Unit = vfx(e, DurationType.Temporary, duration)
		/** Show a instantaneous visual effect on this object. */
		def ^^(e: Int): Unit = vfx(e, DurationType.Instant, 0)
		/** Show a permanent visual effect on this object. */
		def ^*(e: Int): Unit = vfx(e, DurationType.Permanent, 0)

		def vfx(e: Int, durationType: DurationType, duration: Float) =
			R.proxy.applyEffectToObject(durationType,
				R.proxy.effectVisualEffect(e, false),
				this, duration)
	}

	object Effect {
		def apply(o: NWEffect): Effect = implicitEffect(o)

		private implicit def implicitEffect(n: NWEffect): Effect = Effect(
			n.id, G(n.tCreator), n.tTrueType, n.tSubType, n.tDurationType, n.tSpellId)

		def darknessInvisibility: Effect = R.proxy.effectInvisibility(2)
		def improvedInvisibility: Effect = R.proxy.effectInvisibility(4)
		def invisibility: Effect = R.proxy.effectInvisibility(1)
		def heal(amount: Int): Effect = R.proxy.effectHeal(amount)
		def spellLevelAbsorption(maxSpellLevelAbsorbed: Int, totalSpellLevelsAbsorbed: Int, spellSchool: SpellSchool): Effect =
			R.proxy.effectSpellLevelAbsorption(maxSpellLevelAbsorbed, totalSpellLevelsAbsorbed, spellSchool)
		def spellFailure(percent: Int, spellSchool: SpellSchool): Effect = R.proxy.effectSpellFailure(percent, spellSchool)
		def ethereal: Effect = R.proxy.effectEthereal
		def cutsceneGhost: Effect = R.proxy.effectCutsceneGhost
		def cutsceneImmobilize: Effect = R.proxy.effectCutsceneImmobilize
		def resurrection: Effect = R.proxy.effectResurrection
		def entangle: Effect = R.proxy.effectEntangle
		def knockdown: Effect = R.proxy.effectKnockdown
		def paralyze: Effect = R.proxy.effectParalyze
		def deaf: Effect = R.proxy.effectDeaf
		def sleep: Effect = R.proxy.effectSleep
		def charmed: Effect = R.proxy.effectCharmed
		def confused: Effect = R.proxy.effectConfused
		def frightened: Effect = R.proxy.effectFrightened
		def dominated: Effect = R.proxy.effectDominated
		def dazed: Effect = R.proxy.effectDazed
		def stunned: Effect = R.proxy.effectStunned
		def regenerate(amount: Int, intervalSeconds: Float): Effect = R.proxy.effectRegenerate(amount, intervalSeconds)
		def silence: Effect = R.proxy.effectSilence
		def haste: Effect = R.proxy.effectHaste
		def slow: Effect = R.proxy.effectSlow
		def turned: Effect = R.proxy.effectTurned
		def darkness: Effect = R.proxy.effectDarkness
		def trueSeeing: Effect = R.proxy.effectTrueSeeing
		def seeInvisible: Effect = R.proxy.effectSeeInvisible
		def timeStop: Effect = R.proxy.effectTimeStop
		def blindness: Effect = R.proxy.effectBlindness
		def disappear: Effect = disappear(1)
		def disappear(animation: Int): Effect = R.proxy.effectDisappear(animation)
		def appear: Effect = appear(1)
		def appear(animation: Int): Effect = R.proxy.effectAppear(animation)
		def disappearAppear(where: Location, animation: Int): Effect = R.proxy.effectDisappearAppear(where, animation)
		def petrify: Effect = R.proxy.effectPetrify
		def cutsceneParalyze: Effect = R.proxy.effectCutsceneParalyze
		def cutsceneDominated: Effect = R.proxy.effectCutsceneDominated
		def turnResistanceDecrease(hitDice: Int): Effect = R.proxy.effectTurnResistanceDecrease(hitDice)
		def turnResistanceIncrease(hitDice: Int): Effect = R.proxy.effectTurnResistanceIncrease(hitDice)
		def ultravision: Effect = R.proxy.effectUltravision
		def modifyAttacks(attacks: Int): Effect = R.proxy.effectModifyAttacks(attacks)
		def sanctuary(dc: Int): Effect = R.proxy.effectSanctuary(dc)
		def curse(strMod: Int, dexMod: Int, conMod: Int, intMod: Int, wisMod: Int, chaMod: Int): Effect =
			R.proxy.effectCurse(strMod, dexMod, conMod, intMod, wisMod, chaMod)
		def savingThrowIncrease(save: Int, value: Int, saveType: SaveType): Effect =
			R.proxy.effectSavingThrowIncrease(save, value, saveType)
		def savingThrowDecrease(save: Int, value: Int, saveType: SaveType): Effect =
			R.proxy.effectSavingThrowDecrease(save, value, saveType)
		def concealment(percent: Int, missChanceType: MissChanceType): Effect = R.proxy.effectConcealment(percent, missChanceType)
		def missChance(percent: Int, missChanceType: MissChanceType): Effect = R.proxy.effectMissChance(percent, missChanceType)
		def temporaryHitpoints(hitPoints: Int): Effect = R.proxy.effectTemporaryHitpoints(hitPoints)
		def polymorph(polymorph: Int, locked: Boolean): Effect = R.proxy.effectPolymorph(polymorph, locked)
		def negativeLevel(numLevels: Int, hitpointBonus: Boolean): Effect = R.proxy.effectNegativeLevel(numLevels, hitpointBonus)
		def spellResistanceIncrease(value: Int): Effect = R.proxy.effectSpellResistanceIncrease(value)
		def spellResistanceDecrease(value: Int): Effect = R.proxy.effectSpellResistanceDecrease(value)
		def movementSpeedIncrease(percent: Int): Effect = R.proxy.effectMovementSpeedIncrease(percent)
		def movementSpeedDecrease(percent: Int): Effect = R.proxy.effectMovementSpeedDecrease(percent)
		def hitPointChangeWhenDying(hitPointChangePerRound: Float): Effect = R.proxy.effectHitPointChangeWhenDying(hitPointChangePerRound)
		def death(spectacularDeath: Boolean, displayFeedback: Boolean): Effect = R.proxy.effectDeath(spectacularDeath, displayFeedback)
		def spellImmunityAllSpells: Effect = spellImmunity(-1)
		def spellImmunity(spell: Int): Effect = R.proxy.effectSpellImmunity(spell)

		def damage(amount: Int, damageType: DamageType, damagePower: DamagePower): Effect =
			R.proxy.effectDamage(amount, damageType, damagePower)
		def damageReduction(amount: Int, damagePower: DamagePower, limit: Int): Effect = R.proxy.effectDamageReduction(amount, damagePower, limit)
		def damageIncrease(amount: Int, damageType: DamageType): Effect = R.proxy.effectDamageIncrease(amount, damageType)
		def damageDecrease(amount: Int, damageType: DamageType): Effect = R.proxy.effectDamageDecrease(amount, damageType)
		def damageShield(amount: Int, randomAmount: Int, damageType: DamageType): Effect = R.proxy.effectDamageShield(amount, randomAmount, damageType)
		def damageResistance(damageType: DamageType, amount: Int, limit: Int): Effect = R.proxy.effectDamageResistance(damageType, amount, limit)
		def damageImmunityDecrease(damageType: DamageType, percent: Int): Effect = R.proxy.effectDamageImmunityDecrease(damageType, percent)
		def damageImmunityIncrease(damageType: DamageType, percent: Int): Effect = R.proxy.effectDamageImmunityIncrease(damageType, percent)

		def summonCreature(creatureResRef: String, visualEffectId: Int, fDelaySeconds: Float, useAppearAnimation: Boolean): Effect =
			R.proxy.effectSummonCreature(creatureResRef, visualEffectId, fDelaySeconds, useAppearAnimation)
		def swarm(looping: Boolean, t1: String, t2: String, t3: String, t4: String): Effect = R.proxy.effectSwarm(looping, t1, t2, t3, t4)

		def ACIncrease(value: Int, modifyType: ACModifyType, damageType: DamageType): Effect =
			R.proxy.effectACIncrease(value, modifyType, damageType)
		def ACDecrease(value: Int, modifyType: ACModifyType, damageType: DamageType): Effect =
			R.proxy.effectACDecrease(value, modifyType, damageType)

		def skillIncrease(skill: Int, value: Int): Effect = R.proxy.effectSkillIncrease(skill, value)
		def skillDecrease(skill: Int, value: Int): Effect = R.proxy.effectSkillDecrease(skill, value)

		def abilityIncrease(ability: Ability, amount: Int): Effect = R.proxy.effectAbilityIncrease(ability, amount)
		def abilityDecrease(ability: Ability, amount: Int): Effect = R.proxy.effectAbilityDecrease(ability, amount)
		def attackIncrease(amount: Int, modifier: AttackBonus): Effect = R.proxy.effectAttackIncrease(amount, modifier)
		def attackDecrease(amount: Int, modifier: AttackBonus): Effect = R.proxy.effectAttackDecrease(amount, modifier)

		/** Uses the callers' creature level. */
		// def dispelMagicAll: Effect = dispelMagicAll(0)

		def dispelMagicAll(casterLevel: Int): Effect = R.proxy.effectDispelMagicAll(casterLevel)
		def dispelMagicBest(casterLevel: Int): Effect = R.proxy.effectDispelMagicBest(casterLevel)
		def poison(poison: Int): Effect = R.proxy.effectPoison(poison)
		def disease(disease: Int): Effect = R.proxy.effectDisease(disease)
		def immunity(immunity: ImmunityType): Effect = R.proxy.effectImmunity(immunity)

		def aoe(id: Int): Effect = aoe(id, "", "", "")
		def aoe(id: Int, enterScript: String, hbScript: String, exitScript: String): Effect =
			R.proxy.effectAreaOfEffect(id, enterScript, hbScript, exitScript)


		def vfx(id: Int): Effect = vfx(id, false)
		def vfx(id: Int, miss: Boolean): Effect = R.proxy.effectVisualEffect(id, miss)
		/*
		TODO
		def beam(nBeamVisualEffect: Int, object oEffector, nBodyPart: Int, bMissEffect: Int=FALSE): Effect = R.proxy.effectBeam
		*/
	}

	case class Effect (val effectId: Long, val creator: G, val effectType: EffectTrueType,
			val subType: EffectSubType, val durationType: DurationType, val spellId: Int) {

		/** the legacy nwscript effect type. Usually not needed. */
		lazy val nwEffectType = R.proxy.getEffectType(this)

		lazy val duration = R.proxy.getEffectDuration(this)
		lazy val iconShown = R.proxy.getEffectIconShown(this)
		lazy val exposed = R.proxy.getEffectExposed(this)
		def iconShown_=(v: Boolean) = R.proxy.setEffectIconShown(this, v)
		def exposed_=(v: Boolean) = R.proxy.setEffectExposed(this, v)

		def getInteger(idx: Int): Int =
			R.proxy.getEffectInteger(this, idx)
		def setInteger(idx: Int, value: Int) =
			R.proxy.setEffectInteger(this, idx, value)

		def magical: Effect = R.proxy.magicalEffect(this)
		def extraordinary: Effect = R.proxy.extraordinaryEffect(this)
		def supernatural: Effect = R.proxy.supernaturalEffect(this)

		def link(to: Effect): Effect = R.proxy.effectLinkEffects(to, this)

		private[kobold] def toNWEffect: NWEffect =
			new NWEffect(effectId, durationType, EffectType.InvalidEffect, effectType, subType, Module(), 0)

		override def toString =
			effectType + "<" + subType + ">(" + List(
				effectId.toHexString, durationType, duration,
				"creator=" + creator, "icon=" + iconShown, "exposed=" + exposed,
				"iv=" + (for (i <- 0 to 15) yield(getInteger(i))).toList
			).mkString(",") + ")"
	}
}
