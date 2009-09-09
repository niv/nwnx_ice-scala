// **********************************************************************
//
// Copyright (c) 2003-2009 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.3.1

package NWN;

public interface _NWScriptOperationsNC
{
    int getEffectInteger(NWEffect e, int index)
        throws InvalidArgumentException,
               InvalidEffectException;

    void setEffectInteger(NWEffect e, int index, int value)
        throws InvalidArgumentException,
               InvalidEffectException;

    int getItemPropertyInteger(NWItemProperty e, int index)
        throws InvalidArgumentException,
               InvalidItemPropertyException;

    void setItemPropertyInteger(NWItemProperty e, int index, int value)
        throws InvalidArgumentException,
               InvalidItemPropertyException;

    void setEffectTrueType(NWEffect e, EffectTrueType t)
        throws InvalidItemPropertyException;

    float getEffectDuration(NWEffect e)
        throws InvalidEffectException;

    float getItemPropertyDuration(NWItemProperty e)
        throws InvalidEffectException;

    void setDebugLogging(boolean state);

    long getInstructionCount();

    boolean hasState(String key);

    NWN.Persistable getState(String key)
        throws StateNotAvailableException;

    void putState(String key, NWN.Persistable state);

    void delState(String key);

    void clearState();

    NWObject[] allPCs()
        throws NotInContextException;

    NWEffect[] allEffects(NWObject o)
        throws NotInContextException;

    NWObject[] allInArea(NWObject area)
        throws NotInContextException;

    NWObject[] allByTag(String tag)
        throws NotInContextException;

    NWObject[] allInInventory(NWObject o)
        throws NotInContextException;

    NWCreatureEquipped allEquipped(NWObject o)
        throws NotInContextException;

    NWItemProperty[] allItemProperties(NWObject item)
        throws NotInContextException;

    NWObject[] allInShape(ShapeType tShapeType, float fSize, NWLocation lTarget, boolean bLineOfSight, ObjectType tObjectType, NWVector vOrigin)
        throws NotInContextException;

    NWObject[] allInFaction(NWObject memberOf, boolean bPCOnly)
        throws NotInContextException;

    boolean getEffectIconShown(NWEffect eff)
        throws InvalidEffectException,
               NotInContextException;

    void setEffectIconShown(NWEffect eff, boolean bShown)
        throws InvalidEffectException,
               NotInContextException;

    boolean getEffectExposed(NWEffect eff)
        throws InvalidEffectException,
               NotInContextException;

    void setEffectExposed(NWEffect eff, boolean bShown)
        throws InvalidEffectException,
               NotInContextException;

    void actionAttack(NWObject oAttackee, boolean bPassive)
        throws NotInContextException;

    void actionCastFakeSpellAtLocation(int nSpell, NWLocation lTarget, ProjectilePathType tProjectilePathType)
        throws NotInContextException;

    void actionCastFakeSpellAtObject(int nSpell, NWObject oTarget, ProjectilePathType tProjectilePathType)
        throws NotInContextException;

    void actionCastSpellAtLocation(int nSpell, NWLocation lTargetLocation, MetaMagic tMetaMagic, boolean bCheat, ProjectilePathType tProjectilePathType, boolean bInstantSpell)
        throws NotInContextException;

    void actionCastSpellAtObject(int nSpell, NWObject oTarget, MetaMagic tMetaMagic, boolean bCheat, int nDomainLevel, ProjectilePathType tProjectilePathType, boolean bInstantSpell)
        throws NotInContextException;

    void actionCloseDoor(NWObject oDoor)
        throws NotInContextException;

    void actionCounterSpell(NWObject oCounterSpellTarget)
        throws NotInContextException;

    void actionEquipItem(NWObject oItem, InventorySlot tInventorySlot)
        throws NotInContextException;

    void actionEquipMostDamagingMelee(NWObject oVersus, boolean bOffHand)
        throws NotInContextException;

    void actionEquipMostDamagingRanged(NWObject oVersus)
        throws NotInContextException;

    void actionEquipMostEffectiveArmor()
        throws NotInContextException;

    void actionExamine(NWObject oExamine)
        throws NotInContextException;

    void actionForceFollowObject(NWObject oFollow, float fFollowDistance)
        throws NotInContextException;

    void actionForceMoveToLocation(NWLocation lDestination, boolean bRun, float fTimeout)
        throws NotInContextException;

    void actionForceMoveToObject(NWObject oMoveTo, boolean bRun, float fRange, float fTimeout)
        throws NotInContextException;

    void actionGiveItem(NWObject oItem, NWObject oGiveTo)
        throws NotInContextException;

    void actionInteractObject(NWObject oPlaceable)
        throws NotInContextException;

    void actionJumpToLocation(NWLocation lLocation)
        throws NotInContextException;

    void actionJumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint)
        throws NotInContextException;

    void actionLockObject(NWObject oTarget)
        throws NotInContextException;

    void actionMoveAwayFromLocation(NWLocation lMoveAwayFrom, boolean bRun, float fMoveAwayRange)
        throws NotInContextException;

    void actionMoveAwayFromObject(NWObject oFleeFrom, boolean bRun, float fMoveAwayRange)
        throws NotInContextException;

    void actionMoveToLocation(NWLocation lDestination, boolean bRun)
        throws NotInContextException;

    void actionMoveToObject(NWObject oMoveTo, boolean bRun, float fRange)
        throws NotInContextException;

    void actionOpenDoor(NWObject oDoor)
        throws NotInContextException;

    void actionPauseConversation()
        throws NotInContextException;

    void actionPickUpItem(NWObject oItem)
        throws NotInContextException;

    void actionPlayAnimation(int nAnimation, float fSpeed, float fDurationSeconds)
        throws NotInContextException;

    void actionPutDownItem(NWObject oItem)
        throws NotInContextException;

    void actionRandomWalk()
        throws NotInContextException;

    void actionRest(boolean bCreatureToEnemyLineOfSightCheck)
        throws NotInContextException;

    void actionResumeConversation()
        throws NotInContextException;

    void actionSit(NWObject oChair)
        throws NotInContextException;

    void actionSpeakString(String sStringToSpeak, TalkVolume tTalkVolume)
        throws NotInContextException;

    void actionSpeakStringByStrRef(int nStrRef, TalkVolume tTalkVolume)
        throws NotInContextException;

    void actionStartConversation(NWObject oObjectToConverseWith, String sDialogResRef, boolean bPrivateConversation, boolean bPlayHello)
        throws NotInContextException;

    void actionTakeItem(NWObject oItem, NWObject oTakeFrom)
        throws NotInContextException;

    void actionUnequipItem(NWObject oItem)
        throws NotInContextException;

    void actionUnlockObject(NWObject oTarget)
        throws NotInContextException;

    void actionUseFeat(int nFeat, NWObject oTarget)
        throws NotInContextException;

    void actionUseSkill(int nSkill, NWObject oTarget, int nSubSkill, NWObject oItemUsed)
        throws NotInContextException;

    void actionWait(float fSeconds)
        throws NotInContextException;

    void activatePortal(NWObject oTarget, String sIPaddress, String sPassword, String sWaypointTag, boolean bSeemless)
        throws NotInContextException;

    void addHenchman(NWObject oMaster, NWObject oHenchman)
        throws NotInContextException;

    void addItemProperty(DurationType tDurationType, NWItemProperty ipProperty, NWObject oItem, float fDuration)
        throws InvalidItemPropertyException,
               NotInContextException;

    void addJournalQuestEntry(String szPlotID, int nState, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers, boolean bAllowOverrideHigher)
        throws NotInContextException;

    void addToParty(NWObject oPC, NWObject oPartyLeader)
        throws NotInContextException;

    void adjustAlignment(NWObject oSubject, Alignment tAlignment, int nShift, boolean bAllPartyMembers)
        throws NotInContextException;

    void adjustReputation(NWObject oTarget, NWObject oSourceFactionMember, int nAdjustment)
        throws NotInContextException;

    void ambientSoundChangeDay(NWObject oArea, int nTrack)
        throws NotInContextException;

    void ambientSoundChangeNight(NWObject oArea, int nTrack)
        throws NotInContextException;

    void ambientSoundPlay(NWObject oArea)
        throws NotInContextException;

    void ambientSoundSetDayVolume(NWObject oArea, int nVolume)
        throws NotInContextException;

    void ambientSoundSetNightVolume(NWObject oArea, int nVolume)
        throws NotInContextException;

    void ambientSoundStop(NWObject oArea)
        throws NotInContextException;

    NWVector angleToVector(float fAngle)
        throws NotInContextException;

    void applyEffectAtLocation(DurationType tDurationType, NWEffect eEffect, NWLocation lLocation, float fDuration)
        throws InvalidEffectException,
               NotInContextException;

    void applyEffectToObject(DurationType tDurationType, NWEffect eEffect, NWObject oTarget, float fDuration)
        throws InvalidEffectException,
               NotInContextException;

    NWItemProperty badBadReplaceMeThisDoesNothing()
        throws NotInContextException;

    int beginConversation(String sResRef, NWObject oObjectToDialog)
        throws NotInContextException;

    void blackScreen(NWObject oCreature)
        throws NotInContextException;

    void bootPC(NWObject oPlayer)
        throws NotInContextException;

    void changeFaction(NWObject oObjectToChangeFaction, NWObject oMemberOfFactionToJoin)
        throws NotInContextException;

    void changeToStandardFaction(NWObject oCreatureToChange, StandardFaction tStandardFaction)
        throws NotInContextException;

    void clearAllActions(boolean bClearCombatState)
        throws NotInContextException;

    void clearPersonalReputation(NWObject oTarget, NWObject oSource)
        throws NotInContextException;

    NWObject copyItem(NWObject oItem, NWObject oTargetInventory, boolean bCopyVars)
        throws NotInContextException;

    NWObject copyItemAndModify(NWObject oItem, int nType, int nIndex, int nNewValue, boolean bCopyVars)
        throws NotInContextException;

    NWObject copyObject(NWObject oSource, NWLocation locLocation, NWObject oOwner, String sNewTag)
        throws NotInContextException;

    NWObject createItemOnObject(String sItemTemplate, NWObject oTarget, int nStackSize, String sNewTag)
        throws NotInContextException;

    NWObject createObject(ObjectType tObjectType, String sTemplate, NWLocation lLocation, boolean bUseAppearAnimation, String sNewTag)
        throws NotInContextException;

    NWObject createTrapAtLocation(TrapType tTrapType, NWLocation lLocation, float fSize, String sTag, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript)
        throws NotInContextException;

    void createTrapOnObject(TrapType tTrapType, NWObject oObject, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript)
        throws NotInContextException;

    void dayToNight(NWObject oPlayer, float fTransitionTime)
        throws NotInContextException;

    void decrementRemainingFeatUses(NWObject oCreature, int nFeat)
        throws NotInContextException;

    void decrementRemainingSpellUses(NWObject oCreature, int nSpell)
        throws NotInContextException;

    void deleteCampaignVariable(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;

    void deleteLocalFloat(NWObject oObject, String sVarName)
        throws NotInContextException;

    void deleteLocalInt(NWObject oObject, String sVarName)
        throws NotInContextException;

    void deleteLocalLocation(NWObject oObject, String sVarName)
        throws NotInContextException;

    void deleteLocalObject(NWObject oObject, String sVarName)
        throws NotInContextException;

    void deleteLocalString(NWObject oObject, String sVarName)
        throws NotInContextException;

    void destroyCampaignDatabase(String sCampaignName)
        throws NotInContextException;

    void destroyObject(NWObject oDestroy, float fDelay)
        throws NotInContextException;

    void doDoorAction(NWObject oTargetDoor, DoorAction tDoorAction)
        throws NotInContextException;

    void doPlaceableObjectAction(NWObject oPlaceable, PlaceableAction tPlaceableAction)
        throws NotInContextException;

    void doSinglePlayerAutoSave()
        throws NotInContextException;

    void doWhirlwindAttack(boolean bDisplayFeedback, boolean bImproved)
        throws NotInContextException;

    NWEffect effectACDecrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType)
        throws NotInContextException;

    NWEffect effectACIncrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType)
        throws NotInContextException;

    NWEffect effectAbilityDecrease(Ability tAbility, int nModifyBy)
        throws NotInContextException;

    NWEffect effectAbilityIncrease(Ability tAbility, int nModifyBy)
        throws NotInContextException;

    NWEffect effectAppear(int nAnimation)
        throws NotInContextException;

    NWEffect effectAreaOfEffect(int nAreaEffectId, String sOnEnterScript, String sHeartbeatScript, String sOnExitScript)
        throws NotInContextException;

    NWEffect effectAttackDecrease(int nPenalty, AttackBonus tAttackBonus)
        throws NotInContextException;

    NWEffect effectAttackIncrease(int nBonus, AttackBonus tAttackBonus)
        throws NotInContextException;

    NWEffect effectBeam(int nBeamVisualEffect, NWObject oEffector, CreaturePart tCreaturePart, boolean bMissEffect)
        throws NotInContextException;

    NWEffect effectBlindness()
        throws NotInContextException;

    NWEffect effectCharmed()
        throws NotInContextException;

    NWEffect effectConcealment(int nPercentage, MissChanceType tMissChanceType)
        throws NotInContextException;

    NWEffect effectConfused()
        throws NotInContextException;

    NWEffect effectCurse(int nStrMod, int nDexMod, int nConMod, int nIntMod, int nWisMod, int nChaMod)
        throws NotInContextException;

    NWEffect effectCutsceneDominated()
        throws NotInContextException;

    NWEffect effectCutsceneGhost()
        throws NotInContextException;

    NWEffect effectCutsceneImmobilize()
        throws NotInContextException;

    NWEffect effectCutsceneParalyze()
        throws NotInContextException;

    NWEffect effectDamage(int nDamageAmount, DamageType tDamageType, DamagePower tDamagePower)
        throws NotInContextException;

    NWEffect effectDamageDecrease(int nPenalty, DamageType tDamageType)
        throws NotInContextException;

    NWEffect effectDamageImmunityDecrease(DamageType tDamageType, int nPercentImmunity)
        throws NotInContextException;

    NWEffect effectDamageImmunityIncrease(DamageType tDamageType, int nPercentImmunity)
        throws NotInContextException;

    NWEffect effectDamageIncrease(int nBonus, DamageType tDamageType)
        throws NotInContextException;

    NWEffect effectDamageReduction(int nAmount, DamagePower tDamagePower, int nLimit)
        throws NotInContextException;

    NWEffect effectDamageResistance(DamageType tDamageType, int nAmount, int nLimit)
        throws NotInContextException;

    NWEffect effectDamageShield(int nDamageAmount, int nRandomAmount, DamageType tDamageType)
        throws NotInContextException;

    NWEffect effectDarkness()
        throws NotInContextException;

    NWEffect effectDazed()
        throws NotInContextException;

    NWEffect effectDeaf()
        throws NotInContextException;

    NWEffect effectDeath(boolean bSpectacularDeath, boolean bDisplayFeedback)
        throws NotInContextException;

    NWEffect effectDisappear(int nAnimation)
        throws NotInContextException;

    NWEffect effectDisappearAppear(NWLocation lLocation, int nAnimation)
        throws NotInContextException;

    NWEffect effectDisease(int nDiseaseType)
        throws NotInContextException;

    NWEffect effectDispelMagicAll(int nCasterLevel)
        throws NotInContextException;

    NWEffect effectDispelMagicBest(int nCasterLevel)
        throws NotInContextException;

    NWEffect effectDominated()
        throws NotInContextException;

    NWEffect effectEntangle()
        throws NotInContextException;

    NWEffect effectEthereal()
        throws NotInContextException;

    NWEffect effectFrightened()
        throws NotInContextException;

    NWEffect effectHaste()
        throws NotInContextException;

    NWEffect effectHeal(int nDamageToHeal)
        throws NotInContextException;

    NWEffect effectHitPointChangeWhenDying(float fHitPointChangePerRound)
        throws NotInContextException;

    NWEffect effectImmunity(ImmunityType tImmunityType)
        throws NotInContextException;

    NWEffect effectInvisibility(int nInvisibilityType)
        throws NotInContextException;

    NWEffect effectKnockdown()
        throws NotInContextException;

    NWEffect effectLinkEffects(NWEffect eChildEffect, NWEffect eParentEffect)
        throws InvalidEffectException,
               NotInContextException;

    NWEffect effectMissChance(int nPercentage, MissChanceType tMissChanceType)
        throws NotInContextException;

    NWEffect effectModifyAttacks(int nAttacks)
        throws NotInContextException;

    NWEffect effectMovementSpeedDecrease(int nPercentChange)
        throws NotInContextException;

    NWEffect effectMovementSpeedIncrease(int nPercentChange)
        throws NotInContextException;

    NWEffect effectNegativeLevel(int nNumLevels, boolean bHPBonus)
        throws NotInContextException;

    NWEffect effectParalyze()
        throws NotInContextException;

    NWEffect effectPetrify()
        throws NotInContextException;

    NWEffect effectPoison(int nPoisonType)
        throws NotInContextException;

    NWEffect effectPolymorph(int nPolymorphSelection, boolean bLocked)
        throws NotInContextException;

    NWEffect effectRegenerate(int nAmount, float fIntervalSeconds)
        throws NotInContextException;

    NWEffect effectResurrection()
        throws NotInContextException;

    NWEffect effectSanctuary(int nDifficultyClass)
        throws NotInContextException;

    NWEffect effectSavingThrowDecrease(int nSave, int nValue, SaveType tSaveType)
        throws NotInContextException;

    NWEffect effectSavingThrowIncrease(int nSave, int nValue, SaveType tSaveType)
        throws NotInContextException;

    NWEffect effectSeeInvisible()
        throws NotInContextException;

    NWEffect effectSilence()
        throws NotInContextException;

    NWEffect effectSkillDecrease(int nSkill, int nValue)
        throws NotInContextException;

    NWEffect effectSkillIncrease(int nSkill, int nValue)
        throws NotInContextException;

    NWEffect effectSleep()
        throws NotInContextException;

    NWEffect effectSlow()
        throws NotInContextException;

    NWEffect effectSpellFailure(int nPercent, SpellSchool tSpellSchool)
        throws NotInContextException;

    NWEffect effectSpellImmunity(int nImmunityToSpell)
        throws NotInContextException;

    NWEffect effectSpellLevelAbsorption(int nMaxSpellLevelAbsorbed, int nTotalSpellLevelsAbsorbed, SpellSchool tSpellSchool)
        throws NotInContextException;

    NWEffect effectSpellResistanceDecrease(int nValue)
        throws NotInContextException;

    NWEffect effectSpellResistanceIncrease(int nValue)
        throws NotInContextException;

    NWEffect effectStunned()
        throws NotInContextException;

    NWEffect effectSummonCreature(String sCreatureResref, int nVisualEffectId, float fDelaySeconds, boolean bUseAppearAnimation)
        throws NotInContextException;

    NWEffect effectSwarm(boolean bLooping, String sCreatureTemplate1, String sCreatureTemplate2, String sCreatureTemplate3, String sCreatureTemplate4)
        throws NotInContextException;

    NWEffect effectTemporaryHitpoints(int nHitPoints)
        throws NotInContextException;

    NWEffect effectTimeStop()
        throws NotInContextException;

    NWEffect effectTrueSeeing()
        throws NotInContextException;

    NWEffect effectTurnResistanceDecrease(int nHitDice)
        throws NotInContextException;

    NWEffect effectTurnResistanceIncrease(int nHitDice)
        throws NotInContextException;

    NWEffect effectTurned()
        throws NotInContextException;

    NWEffect effectUltravision()
        throws NotInContextException;

    NWEffect effectVisualEffect(int nVisualEffectId, boolean bMissEffect)
        throws NotInContextException;

    void endGame(String sEndMovie)
        throws NotInContextException;

    void executeScript(String sScript, NWObject oTarget)
        throws NotInContextException;

    void exploreAreaForPlayer(NWObject oArea, NWObject oPlayer, boolean bExplored)
        throws NotInContextException;

    void exportAllCharacters()
        throws NotInContextException;

    void exportSingleCharacter(NWObject oPlayer)
        throws NotInContextException;

    NWEffect extraordinaryEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    void fadeFromBlack(NWObject oCreature, float fSpeed)
        throws NotInContextException;

    void fadeToBlack(NWObject oCreature, float fSpeed)
        throws NotInContextException;

    void floatingTextStrRefOnCreature(int nStrRefToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction)
        throws NotInContextException;

    void floatingTextStringOnCreature(String sStringToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction)
        throws NotInContextException;

    void forceRest(NWObject oCreature)
        throws NotInContextException;

    SavingThrowResult fortitudeSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException;

    String get2DAString(String s2DA, String sColumn, int nRow)
        throws NotInContextException;

    int getAC(NWObject oObject)
        throws NotInContextException;

    AILevel getAILevel(NWObject oTarget)
        throws NotInContextException;

    int getAbilityModifier(Ability tAbility, NWObject oCreature)
        throws NotInContextException;

    int getAbilityScore(NWObject oCreature, Ability tAbility, boolean bBaseAbilityScore)
        throws NotInContextException;

    boolean getActionMode(NWObject oCreature, ActionMode tActionMode)
        throws NotInContextException;

    int getAge(NWObject oCreature)
        throws NotInContextException;

    Alignment getAlignmentGoodEvil(NWObject oCreature)
        throws NotInContextException;

    Alignment getAlignmentLawChaos(NWObject oCreature)
        throws NotInContextException;

    int getAnimalCompanionCreatureType(NWObject oCreature)
        throws NotInContextException;

    String getAnimalCompanionName(NWObject oTarget)
        throws NotInContextException;

    int getAppearanceType(NWObject oCreature)
        throws NotInContextException;

    int getArcaneSpellFailure(NWObject oCreature)
        throws NotInContextException;

    NWObject getArea(NWObject oTarget)
        throws NotInContextException;

    NWObject getAreaOfEffectCreator(NWObject oAreaOfEffectObject)
        throws NotInContextException;

    int getAreaSize(int nAreaDimension, NWObject oArea)
        throws NotInContextException;

    NWObject getAssociate(AssociateType tAssociateType, NWObject oMaster, int nTh)
        throws NotInContextException;

    AssociateType getAssociateType(NWObject oAssociate)
        throws NotInContextException;

    NWObject getAttackTarget(NWObject oCreature)
        throws NotInContextException;

    NWObject getAttemptedAttackTarget()
        throws NotInContextException;

    NWObject getAttemptedSpellTarget()
        throws NotInContextException;

    int getBaseAttackBonus(NWObject oCreature)
        throws NotInContextException;

    int getBaseItemType(NWObject oItem)
        throws NotInContextException;

    NWObject getBlockingDoor()
        throws NotInContextException;

    int getCalendarDay()
        throws NotInContextException;

    int getCalendarMonth()
        throws NotInContextException;

    int getCalendarYear()
        throws NotInContextException;

    float getCampaignFloat(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;

    int getCampaignInt(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;

    NWLocation getCampaignLocation(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;

    String getCampaignString(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;

    NWVector getCampaignVector(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;

    int getCasterLevel(NWObject oCreature)
        throws NotInContextException;

    float getChallengeRating(NWObject oCreature)
        throws NotInContextException;

    int getClassByPosition(int nClassPosition, NWObject oCreature)
        throws NotInContextException;

    NWObject getClickingObject()
        throws NotInContextException;

    int getColor(NWObject oObject, int nColorChannel)
        throws NotInContextException;

    boolean getCommandable(NWObject oTarget)
        throws NotInContextException;

    int getCreatureBodyPart(CreaturePart tCreaturePart, NWObject oCreature)
        throws NotInContextException;

    CreatureSize getCreatureSize(NWObject oCreature)
        throws NotInContextException;

    int getCreatureStartingPackage(NWObject oCreature)
        throws NotInContextException;

    int getCreatureTailType(NWObject oCreature)
        throws NotInContextException;

    int getCreatureWingType(NWObject oCreature)
        throws NotInContextException;

    Action getCurrentAction(NWObject oObject)
        throws NotInContextException;

    int getCurrentHitPoints(NWObject oObject)
        throws NotInContextException;

    float getCutsceneCameraMoveRate(NWObject oCreature)
        throws NotInContextException;

    boolean getCutsceneMode(NWObject oCreature)
        throws NotInContextException;

    int getDamageDealtByType(DamageType tDamageType)
        throws NotInContextException;

    int getDefensiveCastingMode(NWObject oCreature)
        throws NotInContextException;

    String getDeity(NWObject oCreature)
        throws NotInContextException;

    String getDescription(NWObject oObject, boolean bOriginalDescription, boolean bIdentifiedDescription)
        throws NotInContextException;

    int getDetectMode(NWObject oCreature)
        throws NotInContextException;

    float getDialogSoundLength(int nStrRef)
        throws NotInContextException;

    float getDistanceBetween(NWObject oObjectA, NWObject oObjectB)
        throws NotInContextException;

    float getDistanceBetweenLocations(NWLocation lLocationA, NWLocation lLocationB)
        throws NotInContextException;

    float getDistanceToObject(NWObject oObject)
        throws NotInContextException;

    boolean getDroppableFlag(NWObject oItem)
        throws NotInContextException;

    NWObject getEffectCreator(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    DurationType getEffectDurationType(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    int getEffectSpellId(NWEffect eSpellEffect)
        throws InvalidEffectException,
               NotInContextException;

    EffectSubType getEffectSubType(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    EffectType getEffectType(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    int getEncounterActive(NWObject oEncounter)
        throws NotInContextException;

    int getEncounterDifficulty(NWObject oEncounter)
        throws NotInContextException;

    int getEncounterSpawnsCurrent(NWObject oEncounter)
        throws NotInContextException;

    int getEncounterSpawnsMax(NWObject oEncounter)
        throws NotInContextException;

    NWObject getEnteringObject()
        throws NotInContextException;

    NWObject getExitingObject()
        throws NotInContextException;

    float getFacing(NWObject oTarget)
        throws NotInContextException;

    int getFactionAverageGoodEvilAlignment(NWObject oFactionMember)
        throws NotInContextException;

    int getFactionAverageLawChaosAlignment(NWObject oFactionMember)
        throws NotInContextException;

    int getFactionAverageLevel(NWObject oFactionMember)
        throws NotInContextException;

    int getFactionAverageReputation(NWObject oSourceFactionMember, NWObject oTarget)
        throws NotInContextException;

    int getFactionAverageXP(NWObject oFactionMember)
        throws NotInContextException;

    NWObject getFactionBestAC(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;

    boolean getFactionEqual(NWObject oFirstObject, NWObject oSecondObject)
        throws NotInContextException;

    int getFactionGold(NWObject oFactionMember)
        throws NotInContextException;

    NWObject getFactionLeader(NWObject oMemberOfFaction)
        throws NotInContextException;

    NWObject getFactionLeastDamagedMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;

    NWObject getFactionMostDamagedMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;

    int getFactionMostFrequentClass(NWObject oFactionMember)
        throws NotInContextException;

    NWObject getFactionStrongestMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;

    NWObject getFactionWeakestMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;

    NWObject getFactionWorstAC(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;

    int getFamiliarCreatureType(NWObject oCreature)
        throws NotInContextException;

    String getFamiliarName(NWObject oCreature)
        throws NotInContextException;

    int getFogAmount(int nFogType, NWObject oArea)
        throws NotInContextException;

    int getFogColor(int nFogType, NWObject oArea)
        throws NotInContextException;

    int getFootstepType(NWObject oCreature)
        throws NotInContextException;

    int getFortitudeSavingThrow(NWObject oTarget)
        throws NotInContextException;

    int getGameDifficulty()
        throws NotInContextException;

    Gender getGender(NWObject oCreature)
        throws NotInContextException;

    NWObject getGoingToBeAttackedBy(NWObject oTarget)
        throws NotInContextException;

    int getGold(NWObject oTarget)
        throws NotInContextException;

    int getGoldPieceValue(NWObject oItem)
        throws NotInContextException;

    int getGoodEvilValue(NWObject oCreature)
        throws NotInContextException;

    int getHardness(NWObject oObject)
        throws NotInContextException;

    boolean getHasFeat(int nFeat, NWObject oCreature)
        throws NotInContextException;

    boolean getHasFeatEffect(int nFeat, NWObject oObject)
        throws NotInContextException;

    boolean getHasInventory(NWObject oObject)
        throws NotInContextException;

    boolean getHasSkill(int nSkill, NWObject oCreature)
        throws NotInContextException;

    boolean getHasSpell(int nSpell, NWObject oCreature)
        throws NotInContextException;

    boolean getHasSpellEffect(int nSpell, NWObject oObject)
        throws NotInContextException;

    NWObject getHenchman(NWObject oMaster, int nNth)
        throws NotInContextException;

    int getHitDice(NWObject oCreature)
        throws NotInContextException;

    boolean getIdentified(NWObject oItem)
        throws NotInContextException;

    boolean getImmortal(NWObject oTarget)
        throws NotInContextException;

    boolean getInfiniteFlag(NWObject oItem)
        throws NotInContextException;

    NWObject getInventoryDisturbItem()
        throws NotInContextException;

    int getInventoryDisturbType()
        throws NotInContextException;

    boolean getIsAreaAboveGround(NWObject oArea)
        throws NotInContextException;

    boolean getIsAreaInterior(NWObject oArea)
        throws NotInContextException;

    boolean getIsAreaNatural(NWObject oArea)
        throws NotInContextException;

    boolean getIsCreatureDisarmable(NWObject oCreature)
        throws NotInContextException;

    boolean getIsDM(NWObject oCreature)
        throws NotInContextException;

    boolean getIsDMPossessed(NWObject oCreature)
        throws NotInContextException;

    boolean getIsDawn()
        throws NotInContextException;

    boolean getIsDay()
        throws NotInContextException;

    boolean getIsDead(NWObject oCreature)
        throws NotInContextException;

    boolean getIsDoorActionPossible(NWObject oTargetDoor, DoorAction tDoorAction)
        throws NotInContextException;

    boolean getIsDusk()
        throws NotInContextException;

    boolean getIsEffectValid(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    boolean getIsEncounterCreature(NWObject oCreature)
        throws NotInContextException;

    boolean getIsEnemy(NWObject oTarget, NWObject oSource)
        throws NotInContextException;

    boolean getIsFriend(NWObject oTarget, NWObject oSource)
        throws NotInContextException;

    boolean getIsImmune(NWObject oCreature, ImmunityType tImmunityType, NWObject oVersus)
        throws NotInContextException;

    boolean getIsInCombat(NWObject oCreature)
        throws NotInContextException;

    boolean getIsInSubArea(NWObject oCreature, NWObject oSubArea)
        throws NotInContextException;

    boolean getIsItemPropertyValid(NWItemProperty ipProperty)
        throws InvalidItemPropertyException,
               NotInContextException;

    boolean getIsListening(NWObject oObject)
        throws NotInContextException;

    boolean getIsNeutral(NWObject oTarget, NWObject oSource)
        throws NotInContextException;

    boolean getIsNight()
        throws NotInContextException;

    boolean getIsObjectValid(NWObject oObject)
        throws NotInContextException;

    boolean getIsOpen(NWObject oObject)
        throws NotInContextException;

    boolean getIsPC(NWObject oCreature)
        throws NotInContextException;

    boolean getIsPlaceableObjectActionPossible(NWObject oPlaceable, PlaceableAction tPlaceableAction)
        throws NotInContextException;

    boolean getIsPlayableRacialType(NWObject oCreature)
        throws NotInContextException;

    boolean getIsPossessedFamiliar(NWObject oCreature)
        throws NotInContextException;

    boolean getIsReactionTypeFriendly(NWObject oTarget, NWObject oSource)
        throws NotInContextException;

    boolean getIsReactionTypeHostile(NWObject oTarget, NWObject oSource)
        throws NotInContextException;

    boolean getIsReactionTypeNeutral(NWObject oTarget, NWObject oSource)
        throws NotInContextException;

    boolean getIsResting(NWObject oCreature)
        throws NotInContextException;

    boolean getIsSkillSuccessful(NWObject oTarget, int nSkill, int nDifficulty)
        throws NotInContextException;

    boolean getIsTrapped(NWObject oObject)
        throws NotInContextException;

    boolean getIsWeaponEffective(NWObject oVersus, boolean bOffHand)
        throws NotInContextException;

    int getItemACValue(NWObject oItem)
        throws NotInContextException;

    NWObject getItemActivated()
        throws NotInContextException;

    NWObject getItemActivatedTarget()
        throws NotInContextException;

    NWLocation getItemActivatedTargetLocation()
        throws NotInContextException;

    NWObject getItemActivator()
        throws NotInContextException;

    int getItemAppearance(NWObject oItem, int nType, int nIndex)
        throws NotInContextException;

    int getItemCharges(NWObject oItem)
        throws NotInContextException;

    boolean getItemCursedFlag(NWObject oItem)
        throws NotInContextException;

    boolean getItemHasItemProperty(NWObject oItem, int nProperty)
        throws NotInContextException;

    NWObject getItemInSlot(InventorySlot tInventorySlot, NWObject oCreature)
        throws NotInContextException;

    NWObject getItemPossessedBy(NWObject oCreature, String sItemTag)
        throws NotInContextException;

    NWObject getItemPossessor(NWObject oItem)
        throws NotInContextException;

    int getItemPropertyCostTable(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyCostTableValue(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException;

    DurationType getItemPropertyDurationType(NWItemProperty ip)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyParam1(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyParam1Value(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertySubType(NWItemProperty iProperty)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyType(NWItemProperty ip)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemStackSize(NWObject oItem)
        throws NotInContextException;

    int getJournalQuestExperience(String szPlotID)
        throws NotInContextException;

    String getKeyRequiredFeedback(NWObject oObject)
        throws NotInContextException;

    AssociateCommand getLastAssociateCommand(NWObject oAssociate)
        throws NotInContextException;

    CombatMode getLastAttackMode(NWObject oCreature)
        throws NotInContextException;

    SpecialAttack getLastAttackType(NWObject oCreature)
        throws NotInContextException;

    NWObject getLastAttacker(NWObject oAttackee)
        throws NotInContextException;

    NWObject getLastClosedBy()
        throws NotInContextException;

    NWObject getLastDamager(NWObject oObject)
        throws NotInContextException;

    NWObject getLastDisarmed()
        throws NotInContextException;

    NWObject getLastDisturbed()
        throws NotInContextException;

    NWObject getLastHostileActor(NWObject oVictim)
        throws NotInContextException;

    NWObject getLastKiller()
        throws NotInContextException;

    NWObject getLastLocked()
        throws NotInContextException;

    NWObject getLastOpenedBy()
        throws NotInContextException;

    NWObject getLastPCRested()
        throws NotInContextException;

    NWObject getLastPCToCancelCutscene()
        throws NotInContextException;

    NWObject getLastPerceived()
        throws NotInContextException;

    boolean getLastPerceptionHeard()
        throws NotInContextException;

    boolean getLastPerceptionInaudible()
        throws NotInContextException;

    boolean getLastPerceptionSeen()
        throws NotInContextException;

    boolean getLastPerceptionVanished()
        throws NotInContextException;

    NWObject getLastPlayerDied()
        throws NotInContextException;

    NWObject getLastPlayerDying()
        throws NotInContextException;

    NWObject getLastRespawnButtonPresser()
        throws NotInContextException;

    int getLastRestEventType()
        throws NotInContextException;

    NWObject getLastSpeaker()
        throws NotInContextException;

    int getLastSpell()
        throws NotInContextException;

    int getLastSpellCastClass()
        throws NotInContextException;

    NWObject getLastSpellCaster()
        throws NotInContextException;

    boolean getLastSpellHarmful()
        throws NotInContextException;

    NWObject getLastTrapDetected(NWObject oTarget)
        throws NotInContextException;

    NWObject getLastUnlocked()
        throws NotInContextException;

    NWObject getLastUsedBy()
        throws NotInContextException;

    NWObject getLastWeaponUsed(NWObject oCreature)
        throws NotInContextException;

    int getLawChaosValue(NWObject oCreature)
        throws NotInContextException;

    int getLevelByClass(int nClassType, NWObject oCreature)
        throws NotInContextException;

    int getLevelByPosition(int nClassPosition, NWObject oCreature)
        throws NotInContextException;

    int getListenPatternNumber()
        throws NotInContextException;

    float getLocalFloat(NWObject oObject, String sVarName)
        throws NotInContextException;

    int getLocalInt(NWObject oObject, String sVarName)
        throws NotInContextException;

    NWLocation getLocalLocation(NWObject oObject, String sVarName)
        throws NotInContextException;

    NWObject getLocalObject(NWObject oObject, String sVarName)
        throws NotInContextException;

    String getLocalString(NWObject oObject, String sVarName)
        throws NotInContextException;

    NWLocation getLocation(NWObject oObject)
        throws NotInContextException;

    boolean getLockKeyRequired(NWObject oObject)
        throws NotInContextException;

    String getLockKeyTag(NWObject oObject)
        throws NotInContextException;

    int getLockLockDC(NWObject oObject)
        throws NotInContextException;

    boolean getLockLockable(NWObject oObject)
        throws NotInContextException;

    int getLockUnlockDC(NWObject oObject)
        throws NotInContextException;

    boolean getLocked(NWObject oTarget)
        throws NotInContextException;

    boolean getLootable(NWObject oCreature)
        throws NotInContextException;

    NWObject getMaster(NWObject oAssociate)
        throws NotInContextException;

    String getMatchedSubstring(int nString)
        throws NotInContextException;

    int getMatchedSubstringsCount()
        throws NotInContextException;

    int getMaxHenchmen()
        throws NotInContextException;

    int getMaxHitPoints(NWObject oObject)
        throws NotInContextException;

    MetaMagic getMetaMagicFeat()
        throws NotInContextException;

    NWObject getModule()
        throws NotInContextException;

    NWObject getModuleItemAcquired()
        throws NotInContextException;

    NWObject getModuleItemAcquiredBy()
        throws NotInContextException;

    NWObject getModuleItemAcquiredFrom()
        throws NotInContextException;

    int getModuleItemAcquiredStackSize()
        throws NotInContextException;

    NWObject getModuleItemLost()
        throws NotInContextException;

    NWObject getModuleItemLostBy()
        throws NotInContextException;

    String getModuleName()
        throws NotInContextException;

    int getModuleXPScale()
        throws NotInContextException;

    int getMovementRate(NWObject oCreature)
        throws NotInContextException;

    String getName(NWObject oObject, boolean bOriginalName)
        throws NotInContextException;

    NWObject getNearestCreature(int nFirstCriteriaType, int nFirstCriteriaValue, NWObject oTarget, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue)
        throws NotInContextException;

    NWObject getNearestCreatureToLocation(int nFirstCriteriaType, int nFirstCriteriaValue, NWLocation lLocation, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue)
        throws NotInContextException;

    NWObject getNearestObject(ObjectType tObjectType, NWObject oTarget, int nNth)
        throws NotInContextException;

    NWObject getNearestObjectByTag(String sTag, NWObject oTarget, int nNth)
        throws NotInContextException;

    NWObject getNearestObjectToLocation(ObjectType tObjectType, NWLocation lLocation, int nNth)
        throws NotInContextException;

    NWObject getNearestTrapToObject(NWObject oTarget, boolean bTrapDetected)
        throws NotInContextException;

    int getNumStackedItems(NWObject oItem)
        throws NotInContextException;

    NWObject getObjectByTag(String sTag, int nNth)
        throws NotInContextException;

    boolean getObjectHeard(NWObject oTarget, NWObject oSource)
        throws NotInContextException;

    boolean getObjectSeen(NWObject oTarget, NWObject oSource)
        throws NotInContextException;

    ObjectType getObjectType(NWObject oTarget)
        throws NotInContextException;

    String getPCChatMessage()
        throws NotInContextException;

    NWObject getPCChatSpeaker()
        throws NotInContextException;

    int getPCChatVolume()
        throws NotInContextException;

    String getPCIPAddress(NWObject oPlayer)
        throws NotInContextException;

    NWObject getPCItemLastEquipped()
        throws NotInContextException;

    NWObject getPCItemLastEquippedBy()
        throws NotInContextException;

    NWObject getPCItemLastUnequipped()
        throws NotInContextException;

    NWObject getPCItemLastUnequippedBy()
        throws NotInContextException;

    NWObject getPCLevellingUp()
        throws NotInContextException;

    String getPCPlayerName(NWObject oPlayer)
        throws NotInContextException;

    String getPCPublicCDKey(NWObject oPlayer, boolean bSinglePlayerCDKey)
        throws NotInContextException;

    NWObject getPCSpeaker()
        throws NotInContextException;

    PhenoType getPhenoType(NWObject oCreature)
        throws NotInContextException;

    boolean getPickpocketableFlag(NWObject oItem)
        throws NotInContextException;

    int getPlaceableIllumination(NWObject oPlaceable)
        throws NotInContextException;

    NWObject getPlaceableLastClickedBy()
        throws NotInContextException;

    boolean getPlotFlag(NWObject oTarget)
        throws NotInContextException;

    int getPortraitId(NWObject oTarget)
        throws NotInContextException;

    String getPortraitResRef(NWObject oTarget)
        throws NotInContextException;

    NWVector getPosition(NWObject oTarget)
        throws NotInContextException;

    RacialType getRacialType(NWObject oCreature)
        throws NotInContextException;

    int getReflexAdjustedDamage(int nDamage, NWObject oTarget, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException;

    int getReflexSavingThrow(NWObject oTarget)
        throws NotInContextException;

    int getReputation(NWObject oSource, NWObject oTarget)
        throws NotInContextException;

    String getResRef(NWObject oObject)
        throws NotInContextException;

    NWObject getSittingCreature(NWObject oChair)
        throws NotInContextException;

    int getSkillRank(int nSkill, NWObject oTarget, boolean bBaseSkillRank)
        throws NotInContextException;

    int getSkyBox(NWObject oArea)
        throws NotInContextException;

    NWObject getSpellCastItem()
        throws NotInContextException;

    int getSpellId()
        throws NotInContextException;

    int getSpellResistance(NWObject oCreature)
        throws NotInContextException;

    int getSpellSaveDC()
        throws NotInContextException;

    NWLocation getSpellTargetLocation()
        throws NotInContextException;

    NWObject getSpellTargetObject()
        throws NotInContextException;

    int getStandardFactionReputation(StandardFaction tStandardFaction, NWObject oCreature)
        throws NotInContextException;

    NWLocation getStartingLocation()
        throws NotInContextException;

    int getStealthMode(NWObject oCreature)
        throws NotInContextException;

    boolean getStolenFlag(NWObject oStolen)
        throws NotInContextException;

    int getStoreGold(NWObject oidStore)
        throws NotInContextException;

    int getStoreIdentifyCost(NWObject oidStore)
        throws NotInContextException;

    int getStoreMaxBuyPrice(NWObject oidStore)
        throws NotInContextException;

    float getStrRefSoundDuration(int nStrRef)
        throws NotInContextException;

    String getStringByStrRef(int nStrRef, Gender tGender)
        throws NotInContextException;

    String getSubRace(NWObject oTarget)
        throws NotInContextException;

    String getTag(NWObject oObject)
        throws NotInContextException;

    TileMainLightColor getTileMainLight1Color(NWLocation lTile)
        throws NotInContextException;

    TileMainLightColor getTileMainLight2Color(NWLocation lTile)
        throws NotInContextException;

    TileSourceLightColor getTileSourceLight1Color(NWLocation lTile)
        throws NotInContextException;

    TileSourceLightColor getTileSourceLight2Color(NWLocation lTile)
        throws NotInContextException;

    String getTilesetResRef(NWObject oArea)
        throws NotInContextException;

    int getTimeHour()
        throws NotInContextException;

    int getTimeMillisecond()
        throws NotInContextException;

    int getTimeMinute()
        throws NotInContextException;

    int getTimeSecond()
        throws NotInContextException;

    int getTotalDamageDealt()
        throws NotInContextException;

    NWObject getTransitionTarget(NWObject oTransition)
        throws NotInContextException;

    boolean getTrapActive(NWObject oTrapObject)
        throws NotInContextException;

    int getTrapBaseType(NWObject oTrapObject)
        throws NotInContextException;

    NWObject getTrapCreator(NWObject oTrapObject)
        throws NotInContextException;

    int getTrapDetectDC(NWObject oTrapObject)
        throws NotInContextException;

    boolean getTrapDetectable(NWObject oTrapObject)
        throws NotInContextException;

    boolean getTrapDetectedBy(NWObject oTrapObject, NWObject oCreature)
        throws NotInContextException;

    int getTrapDisarmDC(NWObject oTrapObject)
        throws NotInContextException;

    boolean getTrapDisarmable(NWObject oTrapObject)
        throws NotInContextException;

    boolean getTrapFlagged(NWObject oTrapObject)
        throws NotInContextException;

    String getTrapKeyTag(NWObject oTrapObject)
        throws NotInContextException;

    boolean getTrapOneShot(NWObject oTrapObject)
        throws NotInContextException;

    boolean getTrapRecoverable(NWObject oTrapObject)
        throws NotInContextException;

    int getTurnResistanceHD(NWObject oUndead)
        throws NotInContextException;

    boolean getUseableFlag(NWObject oObject)
        throws NotInContextException;

    int getUserDefinedEventNumber()
        throws NotInContextException;

    NWObject getWaypointByTag(String sWaypointTag)
        throws NotInContextException;

    boolean getWeaponRanged(NWObject oItem)
        throws NotInContextException;

    Weather getWeather(NWObject oArea)
        throws NotInContextException;

    int getWeight(NWObject oTarget)
        throws NotInContextException;

    int getWillSavingThrow(NWObject oTarget)
        throws NotInContextException;

    int getXP(NWObject oCreature)
        throws NotInContextException;

    void giveGoldToCreature(NWObject oCreature, int nGP)
        throws NotInContextException;

    void giveXPToCreature(NWObject oCreature, int nXpAmount)
        throws NotInContextException;

    float hoursToSeconds(int nHours)
        throws NotInContextException;

    void incrementRemainingFeatUses(NWObject oCreature, int nFeat)
        throws NotInContextException;

    boolean isInConversation(NWObject oObject)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonus(int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonusVsAlign(IPAlignGroup tIPAlignGroup, int nACBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonusVsDmgType(IPDamageType tIPDamageType, int nACBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonusVsRace(IPRacialType tIPRacialType, int nACBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonusVsSAlign(Alignment tAlignment, int nACBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyAbilityBonus(Ability tAbility, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyAdditional(int nAdditionalProperty)
        throws NotInContextException;

    NWItemProperty itemPropertyArcaneSpellFailure(int nModLevel)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackBonus(int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackBonusVsRace(IPRacialType tIPRacialType, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackBonusVsSAlign(Alignment tAlignment, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackPenalty(int nPenalty)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusFeat(int nFeat)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusLevelSpell(int nClass, int nSpellLevel)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusSavingThrow(int nBaseSaveType, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusSavingThrowVsX(int nBonusType, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusSpellResistance(int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyCastSpell(int nSpell, int nNumUses)
        throws NotInContextException;

    NWItemProperty itemPropertyContainerReducedWeight(int nContainerType)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageBonus(IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageBonusVsAlign(IPAlignGroup tIPAlignGroup, IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageBonusVsRace(IPRacialType tIPRacialType, IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageBonusVsSAlign(Alignment tAlignment, IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageImmunity(IPDamageType tIPDamageType, int nImmuneBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyDamagePenalty(int nPenalty)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageReduction(int nEnhancement, int nHPSoak)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageResistance(IPDamageType tIPDamageType, int nHPResist)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageVulnerability(IPDamageType tIPDamageType, int nVulnerability)
        throws NotInContextException;

    NWItemProperty itemPropertyDarkvision()
        throws NotInContextException;

    NWItemProperty itemPropertyDecreaseAC(int nModifierType, int nPenalty)
        throws NotInContextException;

    NWItemProperty itemPropertyDecreaseAbility(Ability tAbility, int nModifier)
        throws NotInContextException;

    NWItemProperty itemPropertyDecreaseSkill(int nSkill, int nPenalty)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementBonus(int nEnhancementBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementBonusVsRace(IPRacialType tIPRacialType, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementBonusVsSAlign(Alignment tAlignment, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementPenalty(int nPenalty)
        throws NotInContextException;

    NWItemProperty itemPropertyExtraMeleeDamageType(IPDamageType tIPDamageType)
        throws NotInContextException;

    NWItemProperty itemPropertyExtraRangeDamageType(IPDamageType tIPDamageType)
        throws NotInContextException;

    NWItemProperty itemPropertyFreeAction()
        throws NotInContextException;

    NWItemProperty itemPropertyHaste()
        throws NotInContextException;

    NWItemProperty itemPropertyHealersKit(int nModifier)
        throws NotInContextException;

    NWItemProperty itemPropertyHolyAvenger()
        throws NotInContextException;

    NWItemProperty itemPropertyImmunityMisc(IPMiscImmunityType tIPMiscImmunityType)
        throws NotInContextException;

    NWItemProperty itemPropertyImmunityToSpellLevel(int nLevel)
        throws NotInContextException;

    NWItemProperty itemPropertyImprovedEvasion()
        throws NotInContextException;

    NWItemProperty itemPropertyKeen()
        throws NotInContextException;

    NWItemProperty itemPropertyLight(int nBrightness, int nColor)
        throws NotInContextException;

    NWItemProperty itemPropertyLimitUseByAlign(IPAlignGroup tIPAlignGroup)
        throws NotInContextException;

    NWItemProperty itemPropertyLimitUseByClass(int nClass)
        throws NotInContextException;

    NWItemProperty itemPropertyLimitUseByRace(IPRacialType tIPRacialType)
        throws NotInContextException;

    NWItemProperty itemPropertyLimitUseBySAlign(Alignment tAlignment)
        throws NotInContextException;

    NWItemProperty itemPropertyMassiveCritical(int nDamage)
        throws NotInContextException;

    NWItemProperty itemPropertyMaterial(int nMaterialType)
        throws NotInContextException;

    NWItemProperty itemPropertyMaxRangeStrengthMod(int nModifier)
        throws NotInContextException;

    NWItemProperty itemPropertyMonsterDamage(int nDamage)
        throws NotInContextException;

    NWItemProperty itemPropertyNoDamage()
        throws NotInContextException;

    NWItemProperty itemPropertyOnHitCastSpell(int nSpell, int nLevel)
        throws NotInContextException;

    NWItemProperty itemPropertyOnHitProps(int nProperty, int nSaveDC, int nSpecial)
        throws NotInContextException;

    NWItemProperty itemPropertyOnMonsterHitProperties(int nProperty, int nSpecial)
        throws NotInContextException;

    NWItemProperty itemPropertyQuality(int nQuality)
        throws NotInContextException;

    NWItemProperty itemPropertyReducedSavingThrow(int nBonusType, int nPenalty)
        throws NotInContextException;

    NWItemProperty itemPropertyReducedSavingThrowVsX(int nBaseSaveType, int nPenalty)
        throws NotInContextException;

    NWItemProperty itemPropertyRegeneration(int nRegenAmount)
        throws NotInContextException;

    NWItemProperty itemPropertySkillBonus(int nSkill, int nBonus)
        throws NotInContextException;

    NWItemProperty itemPropertySpecialWalk(int nWalkType)
        throws NotInContextException;

    NWItemProperty itemPropertySpellImmunitySchool(IPSpellSchool tIPSpellSchool)
        throws NotInContextException;

    NWItemProperty itemPropertySpellImmunitySpecific(int nSpell)
        throws NotInContextException;

    NWItemProperty itemPropertyThievesTools(int nModifier)
        throws NotInContextException;

    NWItemProperty itemPropertyTrap(int nTrapLevel, IPTrapType tIPTrapType)
        throws NotInContextException;

    NWItemProperty itemPropertyTrueSeeing()
        throws NotInContextException;

    NWItemProperty itemPropertyTurnResistance(int nModifier)
        throws NotInContextException;

    NWItemProperty itemPropertyUnlimitedAmmo(int nAmmoDamage)
        throws NotInContextException;

    NWItemProperty itemPropertyVampiricRegeneration(int nRegenAmount)
        throws NotInContextException;

    NWItemProperty itemPropertyVisualEffect(int nEffect)
        throws NotInContextException;

    NWItemProperty itemPropertyWeightIncrease(int nWeight)
        throws NotInContextException;

    NWItemProperty itemPropertyWeightReduction(int nReduction)
        throws NotInContextException;

    void jumpToLocation(NWLocation lDestination)
        throws NotInContextException;

    void jumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint)
        throws NotInContextException;

    int levelUpHenchman(NWObject oCreature, int nClass, boolean bReadyAllSpells, int nPackage)
        throws NotInContextException;

    int lineOfSightObject(NWObject oSource, NWObject oTarget)
        throws NotInContextException;

    int lineOfSightVector(NWVector vSource, NWVector vTarget)
        throws NotInContextException;

    void lockCameraDirection(NWObject oPlayer, boolean bLocked)
        throws NotInContextException;

    void lockCameraDistance(NWObject oPlayer, boolean bLocked)
        throws NotInContextException;

    void lockCameraPitch(NWObject oPlayer, boolean bLocked)
        throws NotInContextException;

    NWEffect magicalEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    void musicBackgroundChangeDay(NWObject oArea, int nTrack)
        throws NotInContextException;

    void musicBackgroundChangeNight(NWObject oArea, int nTrack)
        throws NotInContextException;

    int musicBackgroundGetBattleTrack(NWObject oArea)
        throws NotInContextException;

    int musicBackgroundGetDayTrack(NWObject oArea)
        throws NotInContextException;

    int musicBackgroundGetNightTrack(NWObject oArea)
        throws NotInContextException;

    void musicBackgroundPlay(NWObject oArea)
        throws NotInContextException;

    void musicBackgroundSetDelay(NWObject oArea, int nDelay)
        throws NotInContextException;

    void musicBackgroundStop(NWObject oArea)
        throws NotInContextException;

    void musicBattleChange(NWObject oArea, int nTrack)
        throws NotInContextException;

    void musicBattlePlay(NWObject oArea)
        throws NotInContextException;

    void musicBattleStop(NWObject oArea)
        throws NotInContextException;

    void nightToDay(NWObject oPlayer, float fTransitionTime)
        throws NotInContextException;

    void openInventory(NWObject oCreature, NWObject oPlayer)
        throws NotInContextException;

    void openStore(NWObject oStore, NWObject oPC, int nBonusMarkUp, int nBonusMarkDown)
        throws NotInContextException;

    void playAnimation(int nAnimation, float fSpeed, float fSeconds)
        throws NotInContextException;

    void playSound(String sSoundName)
        throws NotInContextException;

    void playSoundByStrRef(int nStrRef, int nRunAsAction)
        throws NotInContextException;

    void playVoiceChat(int nVoiceChatID, NWObject oTarget)
        throws NotInContextException;

    void popUpDeathGUIPanel(NWObject oPC, boolean bRespawnButtonEnabled, boolean bWaitForHelpButtonEnabled, int nHelpStringReference, String sHelpString)
        throws NotInContextException;

    void popUpGUIPanel(NWObject oPC, int nGUIPanel)
        throws NotInContextException;

    String randomName(int nNameType)
        throws NotInContextException;

    void recomputeStaticLighting(NWObject oArea)
        throws NotInContextException;

    SavingThrowResult reflexSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException;

    void removeEffect(NWObject oCreature, NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    void removeFromParty(NWObject oPC)
        throws NotInContextException;

    void removeHenchman(NWObject oMaster, NWObject oHenchman)
        throws NotInContextException;

    void removeItemProperty(NWObject oItem, NWItemProperty ipProperty)
        throws InvalidItemPropertyException,
               NotInContextException;

    void removeJournalQuestEntry(String szPlotID, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers)
        throws NotInContextException;

    void removeSummonedAssociate(NWObject oMaster, NWObject oAssociate)
        throws NotInContextException;

    int resistSpell(NWObject oCaster, NWObject oTarget)
        throws NotInContextException;

    void restoreBaseAttackBonus(NWObject oCreature)
        throws NotInContextException;

    void restoreCameraFacing()
        throws NotInContextException;

    NWObject retrieveCampaignObject(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oOwner, NWObject oPlayer)
        throws NotInContextException;

    float roundsToSeconds(int nRounds)
        throws NotInContextException;

    void sendMessageToAllDMs(String szMessage)
        throws NotInContextException;

    void sendMessageToPC(NWObject oPlayer, String szMessage)
        throws NotInContextException;

    void sendMessageToPCByStrRef(NWObject oPlayer, int nStrRef)
        throws NotInContextException;

    void setAILevel(NWObject oTarget, AILevel tAILevel)
        throws NotInContextException;

    void setActionMode(NWObject oCreature, ActionMode tActionMode, boolean bStatus)
        throws NotInContextException;

    void setAreaTransitionBMP(int nPredefinedAreaTransition, String sCustomAreaTransitionBMP)
        throws NotInContextException;

    void setAssociateListenPatterns(NWObject oTarget)
        throws NotInContextException;

    void setBaseAttackBonus(int nBaseAttackBonus, NWObject oCreature)
        throws NotInContextException;

    void setCalendar(int nYear, int nMonth, int nDay)
        throws NotInContextException;

    void setCameraFacing(float fDirection, float fDistance, float fPitch, int nTransitionType)
        throws NotInContextException;

    void setCameraHeight(NWObject oPlayer, float fHeight)
        throws NotInContextException;

    void setCameraMode(NWObject oPlayer, int nCameraMode)
        throws NotInContextException;

    void setCampaignFloat(String sCampaignName, String sVarName, float flFloat, NWObject oPlayer)
        throws NotInContextException;

    void setCampaignInt(String sCampaignName, String sVarName, int nInt, NWObject oPlayer)
        throws NotInContextException;

    void setCampaignLocation(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oPlayer)
        throws NotInContextException;

    void setCampaignString(String sCampaignName, String sVarName, String sString, NWObject oPlayer)
        throws NotInContextException;

    void setCampaignVector(String sCampaignName, String sVarName, NWVector vVector, NWObject oPlayer)
        throws NotInContextException;

    void setColor(NWObject oObject, int nColorChannel, int nColorValue)
        throws NotInContextException;

    void setCommandable(boolean bCommandable, NWObject oTarget)
        throws NotInContextException;

    void setCreatureAppearanceType(NWObject oCreature, int nAppearanceType)
        throws NotInContextException;

    void setCreatureBodyPart(CreaturePart tCreaturePart, int nModelNumber, NWObject oCreature)
        throws NotInContextException;

    void setCreatureTailType(int nTailType, NWObject oCreature)
        throws NotInContextException;

    void setCreatureWingType(int nWingType, NWObject oCreature)
        throws NotInContextException;

    void setCustomToken(int nCustomTokenNumber, String sTokenValue)
        throws NotInContextException;

    void setCutsceneCameraMoveRate(NWObject oCreature, float fRate)
        throws NotInContextException;

    void setCutsceneMode(NWObject oCreature, boolean bInCutscene, boolean bLeftClickingEnabled)
        throws NotInContextException;

    void setDeity(NWObject oCreature, String sDeity)
        throws NotInContextException;

    void setDescription(NWObject oObject, String sNewDescription, boolean bIdentifiedDescription)
        throws NotInContextException;

    void setDroppableFlag(NWObject oItem, boolean bDroppable)
        throws NotInContextException;

    void setEncounterActive(boolean bNewValue, NWObject oEncounter)
        throws NotInContextException;

    void setEncounterDifficulty(int nEncounterDifficulty, NWObject oEncounter)
        throws NotInContextException;

    void setEncounterSpawnsCurrent(int nNewValue, NWObject oEncounter)
        throws NotInContextException;

    void setEncounterSpawnsMax(int nNewValue, NWObject oEncounter)
        throws NotInContextException;

    void setFacing(float fDirection)
        throws NotInContextException;

    void setFacingPoint(NWVector vTarget)
        throws NotInContextException;

    void setFogAmount(int nFogType, int nFogAmount, NWObject oArea)
        throws NotInContextException;

    void setFogColor(int nFogType, int nFogColor, NWObject oArea)
        throws NotInContextException;

    void setFootstepType(int nFootstepType, NWObject oCreature)
        throws NotInContextException;

    void setFortitudeSavingThrow(NWObject oObject, int nFortitudeSave)
        throws NotInContextException;

    void setHardness(int nHardness, NWObject oObject)
        throws NotInContextException;

    void setIdentified(NWObject oItem, boolean bIdentified)
        throws NotInContextException;

    void setImmortal(NWObject oCreature, boolean bImmortal)
        throws NotInContextException;

    void setInfiniteFlag(NWObject oItem, boolean bInfinite)
        throws NotInContextException;

    void setIsDestroyable(boolean bDestroyable, boolean bRaiseable, boolean bSelectableWhenDead)
        throws NotInContextException;

    void setIsTemporaryEnemy(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds)
        throws NotInContextException;

    void setIsTemporaryFriend(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds)
        throws NotInContextException;

    void setIsTemporaryNeutral(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds)
        throws NotInContextException;

    void setItemCharges(NWObject oItem, int nCharges)
        throws NotInContextException;

    void setItemCursedFlag(NWObject oItem, boolean bCursed)
        throws NotInContextException;

    void setItemStackSize(NWObject oItem, int nSize)
        throws NotInContextException;

    void setKeyRequiredFeedback(NWObject oObject, String sFeedbackMessage)
        throws NotInContextException;

    void setListenPattern(NWObject oObject, String sPattern, int nNumber)
        throws NotInContextException;

    void setListening(NWObject oObject, boolean bValue)
        throws NotInContextException;

    void setLocalFloat(NWObject oObject, String sVarName, float fValue)
        throws NotInContextException;

    void setLocalInt(NWObject oObject, String sVarName, int nValue)
        throws NotInContextException;

    void setLocalLocation(NWObject oObject, String sVarName, NWLocation lValue)
        throws NotInContextException;

    void setLocalObject(NWObject oObject, String sVarName, NWObject oValue)
        throws NotInContextException;

    void setLocalString(NWObject oObject, String sVarName, String sValue)
        throws NotInContextException;

    void setLockKeyRequired(NWObject oObject, boolean bKeyRequired)
        throws NotInContextException;

    void setLockKeyTag(NWObject oObject, String sNewKeyTag)
        throws NotInContextException;

    void setLockLockDC(NWObject oObject, int nNewLockDC)
        throws NotInContextException;

    void setLockLockable(NWObject oObject, boolean bLockable)
        throws NotInContextException;

    void setLockUnlockDC(NWObject oObject, int nNewUnlockDC)
        throws NotInContextException;

    void setLocked(NWObject oTarget, boolean bLocked)
        throws NotInContextException;

    void setLootable(NWObject oCreature, boolean bLootable)
        throws NotInContextException;

    void setMapPinEnabled(NWObject oMapPin, boolean bEnabled)
        throws NotInContextException;

    void setMaxHenchmen(int nNumHenchmen)
        throws NotInContextException;

    void setModuleXPScale(int nXPScale)
        throws NotInContextException;

    void setName(NWObject oObject, String sNewName)
        throws NotInContextException;

    void setPCChatMessage(String sNewChatMessage)
        throws NotInContextException;

    void setPCChatVolume(TalkVolume tTalkVolume)
        throws NotInContextException;

    void setPCDislike(NWObject oPlayer, NWObject oTarget)
        throws NotInContextException;

    void setPCLike(NWObject oPlayer, NWObject oTarget)
        throws NotInContextException;

    void setPanelButtonFlash(NWObject oPlayer, Button tButton, boolean bEnableFlash)
        throws NotInContextException;

    void setPhenoType(PhenoType tPhenoType, NWObject oCreature)
        throws NotInContextException;

    void setPickpocketableFlag(NWObject oItem, boolean bPickpocketable)
        throws NotInContextException;

    void setPlaceableIllumination(NWObject oPlaceable, boolean bIlluminate)
        throws NotInContextException;

    void setPlotFlag(NWObject oTarget, boolean bPlotFlag)
        throws NotInContextException;

    void setPortraitId(NWObject oTarget, int nPortraitId)
        throws NotInContextException;

    void setPortraitResRef(NWObject oTarget, String sPortraitResRef)
        throws NotInContextException;

    void setReflexSavingThrow(NWObject oObject, int nReflexSave)
        throws NotInContextException;

    void setSkyBox(int nSkyBox, NWObject oArea)
        throws NotInContextException;

    void setStandardFactionReputation(StandardFaction tStandardFaction, int nNewReputation, NWObject oCreature)
        throws NotInContextException;

    void setStolenFlag(NWObject oItem, boolean bStolenFlag)
        throws NotInContextException;

    void setStoreGold(NWObject oidStore, int nGold)
        throws NotInContextException;

    void setStoreIdentifyCost(NWObject oidStore, int nCost)
        throws NotInContextException;

    void setStoreMaxBuyPrice(NWObject oidStore, int nMaxBuy)
        throws NotInContextException;

    void setSubRace(NWObject oCreature, String sSubRace)
        throws NotInContextException;

    void setTileMainLightColor(NWLocation lTileLocation, TileMainLightColor nMainLight1Color, TileMainLightColor nMainLight2Color)
        throws NotInContextException;

    void setTileSourceLightColor(NWLocation lTileLocation, TileSourceLightColor nSourceLight1Color, TileSourceLightColor nSourceLight2Color)
        throws NotInContextException;

    void setTime(int nHour, int nMinute, int nSecond, int nMillisecond)
        throws NotInContextException;

    void setTrapActive(NWObject oTrapObject, boolean bActive)
        throws NotInContextException;

    void setTrapDetectDC(NWObject oTrapObject, int nDetectDC)
        throws NotInContextException;

    void setTrapDetectable(NWObject oTrapObject, boolean bDetectable)
        throws NotInContextException;

    int setTrapDetectedBy(NWObject oTrap, NWObject oDetector, boolean bDetected)
        throws NotInContextException;

    void setTrapDisabled(NWObject oTrap)
        throws NotInContextException;

    void setTrapDisarmDC(NWObject oTrapObject, int nDisarmDC)
        throws NotInContextException;

    void setTrapDisarmable(NWObject oTrapObject, boolean bDisarmable)
        throws NotInContextException;

    void setTrapKeyTag(NWObject oTrapObject, String sKeyTag)
        throws NotInContextException;

    void setTrapOneShot(NWObject oTrapObject, boolean bOneShot)
        throws NotInContextException;

    void setTrapRecoverable(NWObject oTrapObject, boolean bRecoverable)
        throws NotInContextException;

    void setUseableFlag(NWObject oPlaceable, boolean bUseableFlag)
        throws NotInContextException;

    void setWeather(NWObject oTarget, Weather tWeather)
        throws NotInContextException;

    void setWillSavingThrow(NWObject oObject, int nWillSave)
        throws NotInContextException;

    void setXP(NWObject oCreature, int nXpAmount)
        throws NotInContextException;

    void soundObjectPlay(NWObject oSound)
        throws NotInContextException;

    void soundObjectSetPosition(NWObject oSound, NWVector vPosition)
        throws NotInContextException;

    void soundObjectSetVolume(NWObject oSound, int nVolume)
        throws NotInContextException;

    void soundObjectStop(NWObject oSound)
        throws NotInContextException;

    void speakOneLinerConversation(String sDialogResRef, NWObject oTokenTarget)
        throws NotInContextException;

    void speakString(String sStringToSpeak, TalkVolume tTalkVolume)
        throws NotInContextException;

    void speakStringByStrRef(int nStrRef, TalkVolume tTalkVolume)
        throws NotInContextException;

    void startNewModule(String sModuleName)
        throws NotInContextException;

    void stopFade(NWObject oCreature)
        throws NotInContextException;

    void storeCameraFacing()
        throws NotInContextException;

    int storeCampaignObject(String sCampaignName, String sVarName, NWObject oObject, NWObject oPlayer)
        throws NotInContextException;

    void summonAnimalCompanion(NWObject oMaster)
        throws NotInContextException;

    void summonFamiliar(NWObject oMaster)
        throws NotInContextException;

    NWEffect supernaturalEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    void surrenderToEnemies()
        throws NotInContextException;

    void takeGoldFromCreature(int nAmount, NWObject oCreatureToTakeFrom, boolean bDestroy)
        throws NotInContextException;

    AttackResult touchAttackMelee(NWObject oTarget, boolean bDisplayFeedback)
        throws NotInContextException;

    AttackResult touchAttackRanged(NWObject oTarget, boolean bDisplayFeedback)
        throws NotInContextException;

    float turnsToSeconds(int nTurns)
        throws NotInContextException;

    void unpossessFamiliar(NWObject oCreature)
        throws NotInContextException;

    float vectorMagnitude(NWVector vVector)
        throws NotInContextException;

    NWVector vectorNormalize(NWVector vVector)
        throws NotInContextException;

    float vectorToAngle(NWVector vVector)
        throws NotInContextException;

    NWEffect versusAlignmentEffect(NWEffect eEffect, int nLawChaos, int nGoodEvil)
        throws InvalidEffectException,
               NotInContextException;

    NWEffect versusRacialTypeEffect(NWEffect eEffect, RacialType tRacialType)
        throws InvalidEffectException,
               NotInContextException;

    NWEffect versusTrapEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;

    SavingThrowResult willSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException;

    void writeTimestampedLogEntry(String sLogEntry)
        throws NotInContextException;
}
