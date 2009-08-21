package es.elv.kobold {
	import NWN._
	import scala.collection._
	import net.lag._
	import scala.actors._
	import scala._
	import Implicits._

	object ItemProperty {
		private implicit def e2e(w: NWItemProperty) = new ItemProperty(w)

		def additional(additionalProperty: Int): ItemProperty = R.proxy.itemPropertyAdditional(additionalProperty)

		def acBonus(bonus: Int): ItemProperty = R.proxy.itemPropertyACBonus(bonus)
		def acBonusVsAlign(alignGroup: IPAlignGroup, bonus: Int): ItemProperty = R.proxy.itemPropertyACBonusVsAlign(alignGroup, bonus)
		def acBonusVsDmgType(damageType: IPDamageType , bonus: Int): ItemProperty = R.proxy.itemPropertyACBonusVsDmgType(damageType, bonus)
		def acBonusVsRace(racialType: IPRacialType, bonus: Int): ItemProperty = R.proxy.itemPropertyACBonusVsRace(racialType, bonus)
		def acBonusVsSAlign(alignment: Alignment, bonus: Int): ItemProperty = R.proxy.itemPropertyACBonusVsSAlign(alignment, bonus)
		def abilityBonus(ability: Ability, bonus: Int): ItemProperty = R.proxy.itemPropertyAbilityBonus(ability, bonus)
		def arcaneSpellFailure(modLevel: Int): ItemProperty = R.proxy.itemPropertyArcaneSpellFailure(modLevel)
		def attackBonus(bonus: Int): ItemProperty = R.proxy.itemPropertyAttackBonus(bonus)
		def attackBonusVsAlign(alignGroup: IPAlignGroup, bonus: Int): ItemProperty = R.proxy.itemPropertyAttackBonusVsAlign(alignGroup, bonus)
		def attackBonusVsRace(racialType: IPRacialType, bonus: Int): ItemProperty = R.proxy.itemPropertyAttackBonusVsRace(racialType, bonus)
		def attackBonusVsSAlign(alignment: Alignment, bonus: Int): ItemProperty = R.proxy.itemPropertyAttackBonusVsSAlign(alignment, bonus)
		def attackPenalty(penalty: Int): ItemProperty = R.proxy.itemPropertyAttackPenalty(penalty)
		def bonusFeat(feat: Int): ItemProperty = R.proxy.itemPropertyBonusFeat(feat)
		def bonusLevelSpell(cls: Int, spellLevel: Int): ItemProperty = R.proxy.itemPropertyBonusLevelSpell(cls, spellLevel)
		def bonusSavingThrow(baseSaveType: Int, bonus: Int): ItemProperty = R.proxy.itemPropertyBonusSavingThrow(baseSaveType, bonus)
		def bonusSavingThrowVsX(bonusType: Int, bonus: Int): ItemProperty = R.proxy.itemPropertyBonusSavingThrowVsX(bonusType, bonus)
		def bonusSpellResistance(bonus: Int): ItemProperty = R.proxy.itemPropertyBonusSpellResistance(bonus)
		def castSpell(spell: Int, numUses: Int): ItemProperty = R.proxy.itemPropertyCastSpell(spell, numUses)
		def containerReducedWeight(containerType: Int): ItemProperty = R.proxy.itemPropertyContainerReducedWeight(containerType)
		def damageBonus(damageType: IPDamageType, damage: Int): ItemProperty = R.proxy.itemPropertyDamageBonus(damageType, damage)
		def damageBonusVsAlign(alignGroup: IPAlignGroup, damageType: IPDamageType, damage: Int): ItemProperty = R.proxy.itemPropertyDamageBonusVsAlign(alignGroup, damageType, damage)
		def damageBonusVsRace(racialType: IPRacialType, damageType: IPDamageType, damage: Int): ItemProperty = R.proxy.itemPropertyDamageBonusVsRace(racialType, damageType, damage)
		def damageBonusVsSAlign(aligmnent: Alignment, damageType: IPDamageType, damage: Int): ItemProperty = R.proxy.itemPropertyDamageBonusVsSAlign(aligmnent, damageType, damage)
		def damageImmunity(damageType: IPDamageType, immuneBonus: Int): ItemProperty = R.proxy.itemPropertyDamageImmunity(damageType, immuneBonus)
		def damagePenalty(penalty: Int): ItemProperty = R.proxy.itemPropertyDamagePenalty(penalty)
		def damageReduction(enhancement: Int, hPSoak: Int): ItemProperty = R.proxy.itemPropertyDamageReduction(enhancement, hPSoak)
		def damageResistance(damageType: IPDamageType, hPResist: Int): ItemProperty = R.proxy.itemPropertyDamageResistance(damageType, hPResist)
		def damageVulnerability(damageType: IPDamageType, vulnerability: Int): ItemProperty = R.proxy.itemPropertyDamageVulnerability(damageType, vulnerability)
		def darkvision: ItemProperty = R.proxy.itemPropertyDarkvision
		def decreaseAC(modifierType: Int, penalty: Int): ItemProperty = R.proxy.itemPropertyDecreaseAC(modifierType, penalty)
		def decreaseAbility(ability: Ability, modifier: Int): ItemProperty = R.proxy.itemPropertyDecreaseAbility(ability, modifier)
		def decreaseSkill(skill: Int, penalty: Int): ItemProperty = R.proxy.itemPropertyDecreaseSkill(skill, penalty)
		def enhancementBonus(enhancementBonus: Int): ItemProperty = R.proxy.itemPropertyEnhancementBonus(enhancementBonus)
		def enhancementBonusVsAlign(alignGroup: IPAlignGroup, bonus: Int): ItemProperty = R.proxy.itemPropertyEnhancementBonusVsAlign(alignGroup, bonus)
		def enhancementBonusVsRace(racialType: IPRacialType, bonus: Int): ItemProperty = R.proxy.itemPropertyEnhancementBonusVsRace(racialType, bonus)
		def enhancementBonusVsSAlign(aligmnent: Alignment, bonus: Int): ItemProperty = R.proxy.itemPropertyEnhancementBonusVsSAlign(aligmnent, bonus)
		def enhancementPenalty(penalty: Int): ItemProperty = R.proxy.itemPropertyEnhancementPenalty(penalty)
		def extraMeleeDamageType(damageType: IPDamageType): ItemProperty = R.proxy.itemPropertyExtraMeleeDamageType(damageType)
		def extraRangeDamageType(damageType: IPDamageType): ItemProperty = R.proxy.itemPropertyExtraRangeDamageType(damageType)
		def freeAction: ItemProperty = R.proxy.itemPropertyFreeAction
		def haste: ItemProperty = R.proxy.itemPropertyHaste
		def healersKit(modifier: Int): ItemProperty = R.proxy.itemPropertyHealersKit(modifier)
		def holyAvenger: ItemProperty = R.proxy.itemPropertyHolyAvenger
		def immunityMisc(immunityType: Int): ItemProperty = R.proxy.itemPropertyImmunityMisc(immunityType)
		def immunityToSpellLevel(level: Int): ItemProperty = R.proxy.itemPropertyImmunityToSpellLevel(level)
		def improvedEvasion: ItemProperty = R.proxy.itemPropertyImprovedEvasion
		def keen: ItemProperty = R.proxy.itemPropertyKeen
		def light(brightness: Int, color: Int): ItemProperty = R.proxy.itemPropertyLight(brightness, color)
		def limitUseByAlign(alignGroup: IPAlignGroup): ItemProperty = R.proxy.itemPropertyLimitUseByAlign(alignGroup)
		def limitUseByClass(cls: Int): ItemProperty = R.proxy.itemPropertyLimitUseByClass(cls)
		def limitUseByRace(racialType: IPRacialType): ItemProperty = R.proxy.itemPropertyLimitUseByRace(racialType)
		def limitUseBySAlign(alignment: Alignment): ItemProperty = R.proxy.itemPropertyLimitUseBySAlign(alignment)
		def massiveCritical(damage: Int): ItemProperty = R.proxy.itemPropertyMassiveCritical(damage)
		def material(materialType: Int): ItemProperty = R.proxy.itemPropertyMaterial(materialType)
		def maxRangeStrengthMod(modifier: Int): ItemProperty = R.proxy.itemPropertyMaxRangeStrengthMod(modifier)
		def monsterDamage(damage: Int): ItemProperty = R.proxy.itemPropertyMonsterDamage(damage)
		def noDamage: ItemProperty = R.proxy.itemPropertyNoDamage
		def onHitCastSpell(spell: Int, level: Int): ItemProperty = R.proxy.itemPropertyOnHitCastSpell(spell, level)
		def onHitProps(property: Int, saveDC: Int, special: Int): ItemProperty = R.proxy.itemPropertyOnHitProps(property, saveDC, special)
		def onMonsterHitProperties(property: Int, special: Int): ItemProperty = R.proxy.itemPropertyOnMonsterHitProperties(property, special)
		def quality(quality: Int): ItemProperty = R.proxy.itemPropertyQuality(quality)
		def reducedSavingThrow(bonusType: Int, penalty: Int): ItemProperty = R.proxy.itemPropertyReducedSavingThrow(bonusType, penalty)
		def reducedSavingThrowVsX(baseSaveType: Int, penalty: Int): ItemProperty = R.proxy.itemPropertyReducedSavingThrowVsX(baseSaveType, penalty)
		def regeneration(regenAmount: Int): ItemProperty = R.proxy.itemPropertyRegeneration(regenAmount)
		def skillBonus(skill: Int, bonus: Int): ItemProperty = R.proxy.itemPropertySkillBonus(skill, bonus)
		def specialWalk(walkType: Int): ItemProperty = R.proxy.itemPropertySpecialWalk(walkType)
		def spellImmunitySchool(school: Int): ItemProperty = R.proxy.itemPropertySpellImmunitySchool(school)
		def spellImmunitySpecific(spell: Int): ItemProperty = R.proxy.itemPropertySpellImmunitySpecific(spell)
		def thievesTools(modifier: Int): ItemProperty = R.proxy.itemPropertyThievesTools(modifier)
		def trap(trapLevel: Int, trapType: IPTrapType): ItemProperty = R.proxy.itemPropertyTrap(trapLevel, trapType)
		def trueSeeing: ItemProperty = R.proxy.itemPropertyTrueSeeing
		def turnResistance(modifier: Int): ItemProperty = R.proxy.itemPropertyTurnResistance(modifier)
		def unlimitedAmmo(ammoDamage: Int): ItemProperty = R.proxy.itemPropertyUnlimitedAmmo(ammoDamage)
		def vampiricRegeneration(regenAmount: Int): ItemProperty = R.proxy.itemPropertyVampiricRegeneration(regenAmount)
		def visualEffect(effect: Int): ItemProperty = R.proxy.itemPropertyVisualEffect(effect)
		def weightIncrease(weight: Int): ItemProperty = R.proxy.itemPropertyWeightIncrease(weight)
		def weightReduction(reduction: Int): ItemProperty = R.proxy.itemPropertyWeightReduction(reduction)

	}

	case class ItemProperty(wrap: NWItemProperty) extends Wrapped[NWItemProperty, ItemProperty](wrap, None) {
		val iprpType = wrap.tType
		val iprpSubType = wrap.tSubType
		val durationType = wrap.tDurationType
		val param1 = wrap.tParam1
		val param1Value = wrap.tParam1Value
		val costTable = wrap.tCostTable
		val costTableValue = wrap.tCostTableValue

		
		override def toString = {
			val typeStrRef = TwoDA("itempropdef", "Name", iprpType)
			val typeStr = if (typeStrRef != "") Tlk(typeStrRef.toInt) else "t=" + iprpType
			val subTypeTable = TwoDA("itempropdef", "SubTypeResRef", iprpSubType)
			val subTypeStr = (if (subTypeTable != "")
				Tlk(TwoDA(subTypeTable, "Name", iprpSubType).toInt) // + " (" + iprpSubType.toString + ")"
			else "")
			
			val param1Str = (if (param1 > -1 && param1 != 255) 
				Tlk(TwoDA(TwoDA("iprp_paramtable", "TableResRef", param1), "Name", param1Value).toInt) // + " (" + param1.toString + "=" + param1Value.toString + ")"
			else "")
			
			val costTableStr = (if (costTable > 0)
				Tlk(TwoDA(TwoDA("iprp_costtable", "Name", costTable), "Name", costTableValue).toInt) // + " (" +  costTable.toString + "=" + costTableValue.toString + ")"
			else "")

			"ItemProperty(" + List(/*wrapped.id.toHexString, */typeStr, subTypeStr,
				durationType, param1Str, costTableStr).filter(_ != "").mkString(",") + ")"
		}
	}
}
