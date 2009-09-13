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

public interface _NWScriptOperations
{
    int getEffectInteger(NWEffect e, int index, Ice.Current __current)
        throws InvalidArgumentException,
               InvalidEffectException;

    void setEffectInteger(NWEffect e, int index, int value, Ice.Current __current)
        throws InvalidArgumentException,
               InvalidEffectException;

    int getItemPropertyInteger(NWItemProperty e, int index, Ice.Current __current)
        throws InvalidArgumentException,
               InvalidItemPropertyException;

    void setItemPropertyInteger(NWItemProperty e, int index, int value, Ice.Current __current)
        throws InvalidArgumentException,
               InvalidItemPropertyException;

    void setEffectTrueType(NWEffect e, EffectTrueType t, Ice.Current __current)
        throws InvalidItemPropertyException;

    float getEffectDuration(NWEffect e, Ice.Current __current)
        throws InvalidEffectException;

    float getItemPropertyDuration(NWItemProperty e, Ice.Current __current)
        throws InvalidEffectException;

    void setDebugLogging(boolean state, Ice.Current __current);

    long getInstructionCount(Ice.Current __current);

    boolean hasState(String key, Ice.Current __current);

    NWN.Persistable getState(String key, Ice.Current __current)
        throws StateNotAvailableException;

    void putState(String key, NWN.Persistable state, Ice.Current __current);

    void delState(String key, Ice.Current __current);

    void clearState(Ice.Current __current);

    NWObject[] allPCs(Ice.Current __current)
        throws NotInContextException;

    NWEffect[] allEffects(NWObject o, Ice.Current __current)
        throws NotInContextException;

    NWObject[] allInArea(NWObject area, Ice.Current __current)
        throws NotInContextException;

    NWObject[] allInAreaOfType(NWObject area, ObjectType ofType, Ice.Current __current)
        throws NotInContextException;

    NWObject[] allByTag(String tag, Ice.Current __current)
        throws NotInContextException;

    NWObject[] allInInventory(NWObject o, Ice.Current __current)
        throws NotInContextException;

    NWCreatureEquipped allEquipped(NWObject o, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty[] allItemProperties(NWObject item, Ice.Current __current)
        throws NotInContextException;

    NWObject[] allInShape(ShapeType tShapeType, float fSize, NWLocation lTarget, boolean bLineOfSight, ObjectType tObjectType, NWVector vOrigin, Ice.Current __current)
        throws NotInContextException;

    NWObject[] allInFaction(NWObject memberOf, boolean bPCOnly, Ice.Current __current)
        throws NotInContextException;

    boolean getEffectIconShown(NWEffect eff, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    void setEffectIconShown(NWEffect eff, boolean bShown, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    boolean getEffectExposed(NWEffect eff, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    void setEffectExposed(NWEffect eff, boolean bShown, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    void actionAttack(NWObject oAttackee, boolean bPassive, Ice.Current __current)
        throws NotInContextException;

    void actionCastFakeSpellAtLocation(int nSpell, NWLocation lTarget, ProjectilePathType tProjectilePathType, Ice.Current __current)
        throws NotInContextException;

    void actionCastFakeSpellAtObject(int nSpell, NWObject oTarget, ProjectilePathType tProjectilePathType, Ice.Current __current)
        throws NotInContextException;

    void actionCastSpellAtLocation(int nSpell, NWLocation lTargetLocation, MetaMagic tMetaMagic, boolean bCheat, ProjectilePathType tProjectilePathType, boolean bInstantSpell, Ice.Current __current)
        throws NotInContextException;

    void actionCastSpellAtObject(int nSpell, NWObject oTarget, MetaMagic tMetaMagic, boolean bCheat, int nDomainLevel, ProjectilePathType tProjectilePathType, boolean bInstantSpell, Ice.Current __current)
        throws NotInContextException;

    void actionCloseDoor(NWObject oDoor, Ice.Current __current)
        throws NotInContextException;

    void actionCounterSpell(NWObject oCounterSpellTarget, Ice.Current __current)
        throws NotInContextException;

    void actionEquipItem(NWObject oItem, InventorySlot tInventorySlot, Ice.Current __current)
        throws NotInContextException;

    void actionEquipMostDamagingMelee(NWObject oVersus, boolean bOffHand, Ice.Current __current)
        throws NotInContextException;

    void actionEquipMostDamagingRanged(NWObject oVersus, Ice.Current __current)
        throws NotInContextException;

    void actionEquipMostEffectiveArmor(Ice.Current __current)
        throws NotInContextException;

    void actionExamine(NWObject oExamine, Ice.Current __current)
        throws NotInContextException;

    void actionForceFollowObject(NWObject oFollow, float fFollowDistance, Ice.Current __current)
        throws NotInContextException;

    void actionForceMoveToLocation(NWLocation lDestination, boolean bRun, float fTimeout, Ice.Current __current)
        throws NotInContextException;

    void actionForceMoveToObject(NWObject oMoveTo, boolean bRun, float fRange, float fTimeout, Ice.Current __current)
        throws NotInContextException;

    void actionGiveItem(NWObject oItem, NWObject oGiveTo, Ice.Current __current)
        throws NotInContextException;

    void actionInteractObject(NWObject oPlaceable, Ice.Current __current)
        throws NotInContextException;

    void actionJumpToLocation(NWLocation lLocation, Ice.Current __current)
        throws NotInContextException;

    void actionJumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint, Ice.Current __current)
        throws NotInContextException;

    void actionLockObject(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void actionMoveAwayFromLocation(NWLocation lMoveAwayFrom, boolean bRun, float fMoveAwayRange, Ice.Current __current)
        throws NotInContextException;

    void actionMoveAwayFromObject(NWObject oFleeFrom, boolean bRun, float fMoveAwayRange, Ice.Current __current)
        throws NotInContextException;

    void actionMoveToLocation(NWLocation lDestination, boolean bRun, Ice.Current __current)
        throws NotInContextException;

    void actionMoveToObject(NWObject oMoveTo, boolean bRun, float fRange, Ice.Current __current)
        throws NotInContextException;

    void actionOpenDoor(NWObject oDoor, Ice.Current __current)
        throws NotInContextException;

    void actionPauseConversation(Ice.Current __current)
        throws NotInContextException;

    void actionPickUpItem(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    void actionPlayAnimation(int nAnimation, float fSpeed, float fDurationSeconds, Ice.Current __current)
        throws NotInContextException;

    void actionPutDownItem(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    void actionRandomWalk(Ice.Current __current)
        throws NotInContextException;

    void actionRest(boolean bCreatureToEnemyLineOfSightCheck, Ice.Current __current)
        throws NotInContextException;

    void actionResumeConversation(Ice.Current __current)
        throws NotInContextException;

    void actionSit(NWObject oChair, Ice.Current __current)
        throws NotInContextException;

    void actionSpeakString(String sStringToSpeak, TalkVolume tTalkVolume, Ice.Current __current)
        throws NotInContextException;

    void actionSpeakStringByStrRef(int nStrRef, TalkVolume tTalkVolume, Ice.Current __current)
        throws NotInContextException;

    void actionStartConversation(NWObject oObjectToConverseWith, String sDialogResRef, boolean bPrivateConversation, boolean bPlayHello, Ice.Current __current)
        throws NotInContextException;

    void actionTakeItem(NWObject oItem, NWObject oTakeFrom, Ice.Current __current)
        throws NotInContextException;

    void actionUnequipItem(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    void actionUnlockObject(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void actionUseFeat(int nFeat, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void actionUseSkill(int nSkill, NWObject oTarget, int nSubSkill, NWObject oItemUsed, Ice.Current __current)
        throws NotInContextException;

    void actionWait(float fSeconds, Ice.Current __current)
        throws NotInContextException;

    void activatePortal(NWObject oTarget, String sIPaddress, String sPassword, String sWaypointTag, boolean bSeemless, Ice.Current __current)
        throws NotInContextException;

    void addHenchman(NWObject oMaster, NWObject oHenchman, Ice.Current __current)
        throws NotInContextException;

    void addItemProperty(DurationType tDurationType, NWItemProperty ipProperty, NWObject oItem, float fDuration, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    void addJournalQuestEntry(String szPlotID, int nState, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers, boolean bAllowOverrideHigher, Ice.Current __current)
        throws NotInContextException;

    void addToParty(NWObject oPC, NWObject oPartyLeader, Ice.Current __current)
        throws NotInContextException;

    void adjustAlignment(NWObject oSubject, Alignment tAlignment, int nShift, boolean bAllPartyMembers, Ice.Current __current)
        throws NotInContextException;

    void adjustReputation(NWObject oTarget, NWObject oSourceFactionMember, int nAdjustment, Ice.Current __current)
        throws NotInContextException;

    void ambientSoundChangeDay(NWObject oArea, int nTrack, Ice.Current __current)
        throws NotInContextException;

    void ambientSoundChangeNight(NWObject oArea, int nTrack, Ice.Current __current)
        throws NotInContextException;

    void ambientSoundPlay(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    void ambientSoundSetDayVolume(NWObject oArea, int nVolume, Ice.Current __current)
        throws NotInContextException;

    void ambientSoundSetNightVolume(NWObject oArea, int nVolume, Ice.Current __current)
        throws NotInContextException;

    void ambientSoundStop(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    NWVector angleToVector(float fAngle, Ice.Current __current)
        throws NotInContextException;

    void applyEffectAtLocation(DurationType tDurationType, NWEffect eEffect, NWLocation lLocation, float fDuration, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    void applyEffectToObject(DurationType tDurationType, NWEffect eEffect, NWObject oTarget, float fDuration, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    NWItemProperty badBadReplaceMeThisDoesNothing(Ice.Current __current)
        throws NotInContextException;

    int beginConversation(String sResRef, NWObject oObjectToDialog, Ice.Current __current)
        throws NotInContextException;

    void blackScreen(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void bootPC(NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    void changeFaction(NWObject oObjectToChangeFaction, NWObject oMemberOfFactionToJoin, Ice.Current __current)
        throws NotInContextException;

    void changeToStandardFaction(NWObject oCreatureToChange, StandardFaction tStandardFaction, Ice.Current __current)
        throws NotInContextException;

    void clearAllActions(boolean bClearCombatState, Ice.Current __current)
        throws NotInContextException;

    void clearPersonalReputation(NWObject oTarget, NWObject oSource, Ice.Current __current)
        throws NotInContextException;

    NWObject copyItem(NWObject oItem, NWObject oTargetInventory, boolean bCopyVars, Ice.Current __current)
        throws NotInContextException;

    NWObject copyItemAndModify(NWObject oItem, int nType, int nIndex, int nNewValue, boolean bCopyVars, Ice.Current __current)
        throws NotInContextException;

    NWObject copyObject(NWObject oSource, NWLocation locLocation, NWObject oOwner, String sNewTag, Ice.Current __current)
        throws NotInContextException;

    NWObject createItemOnObject(String sItemTemplate, NWObject oTarget, int nStackSize, String sNewTag, Ice.Current __current)
        throws NotInContextException;

    NWObject createObject(ObjectType tObjectType, String sTemplate, NWLocation lLocation, boolean bUseAppearAnimation, String sNewTag, Ice.Current __current)
        throws NotInContextException;

    NWObject createTrapAtLocation(TrapType tTrapType, NWLocation lLocation, float fSize, String sTag, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript, Ice.Current __current)
        throws NotInContextException;

    void createTrapOnObject(TrapType tTrapType, NWObject oObject, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript, Ice.Current __current)
        throws NotInContextException;

    void dayToNight(NWObject oPlayer, float fTransitionTime, Ice.Current __current)
        throws NotInContextException;

    void decrementRemainingFeatUses(NWObject oCreature, int nFeat, Ice.Current __current)
        throws NotInContextException;

    void decrementRemainingSpellUses(NWObject oCreature, int nSpell, Ice.Current __current)
        throws NotInContextException;

    void deleteCampaignVariable(String sCampaignName, String sVarName, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    void deleteLocalFloat(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    void deleteLocalInt(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    void deleteLocalLocation(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    void deleteLocalObject(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    void deleteLocalString(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    void destroyCampaignDatabase(String sCampaignName, Ice.Current __current)
        throws NotInContextException;

    void destroyObject(NWObject oDestroy, float fDelay, Ice.Current __current)
        throws NotInContextException;

    void doDoorAction(NWObject oTargetDoor, DoorAction tDoorAction, Ice.Current __current)
        throws NotInContextException;

    void doPlaceableObjectAction(NWObject oPlaceable, PlaceableAction tPlaceableAction, Ice.Current __current)
        throws NotInContextException;

    void doSinglePlayerAutoSave(Ice.Current __current)
        throws NotInContextException;

    void doWhirlwindAttack(boolean bDisplayFeedback, boolean bImproved, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectACDecrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectACIncrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectAbilityDecrease(Ability tAbility, int nModifyBy, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectAbilityIncrease(Ability tAbility, int nModifyBy, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectAppear(int nAnimation, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectAreaOfEffect(int nAreaEffectId, String sOnEnterScript, String sHeartbeatScript, String sOnExitScript, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectAttackDecrease(int nPenalty, AttackBonus tAttackBonus, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectAttackIncrease(int nBonus, AttackBonus tAttackBonus, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectBeam(int nBeamVisualEffect, NWObject oEffector, CreaturePart tCreaturePart, boolean bMissEffect, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectBlindness(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectCharmed(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectConcealment(int nPercentage, MissChanceType tMissChanceType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectConfused(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectCurse(int nStrMod, int nDexMod, int nConMod, int nIntMod, int nWisMod, int nChaMod, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectCutsceneDominated(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectCutsceneGhost(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectCutsceneImmobilize(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectCutsceneParalyze(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDamage(int nDamageAmount, DamageType tDamageType, DamagePower tDamagePower, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDamageDecrease(int nPenalty, DamageType tDamageType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDamageImmunityDecrease(DamageType tDamageType, int nPercentImmunity, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDamageImmunityIncrease(DamageType tDamageType, int nPercentImmunity, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDamageIncrease(int nBonus, DamageType tDamageType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDamageReduction(int nAmount, DamagePower tDamagePower, int nLimit, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDamageResistance(DamageType tDamageType, int nAmount, int nLimit, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDamageShield(int nDamageAmount, int nRandomAmount, DamageType tDamageType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDarkness(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDazed(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDeaf(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDeath(boolean bSpectacularDeath, boolean bDisplayFeedback, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDisappear(int nAnimation, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDisappearAppear(NWLocation lLocation, int nAnimation, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDisease(int nDiseaseType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDispelMagicAll(int nCasterLevel, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDispelMagicBest(int nCasterLevel, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectDominated(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectEntangle(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectEthereal(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectFrightened(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectHaste(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectHeal(int nDamageToHeal, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectHitPointChangeWhenDying(float fHitPointChangePerRound, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectImmunity(ImmunityType tImmunityType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectInvisibility(int nInvisibilityType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectKnockdown(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectLinkEffects(NWEffect eChildEffect, NWEffect eParentEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    NWEffect effectMissChance(int nPercentage, MissChanceType tMissChanceType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectModifyAttacks(int nAttacks, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectMovementSpeedDecrease(int nPercentChange, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectMovementSpeedIncrease(int nPercentChange, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectNegativeLevel(int nNumLevels, boolean bHPBonus, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectParalyze(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectPetrify(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectPoison(int nPoisonType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectPolymorph(int nPolymorphSelection, boolean bLocked, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectRegenerate(int nAmount, float fIntervalSeconds, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectResurrection(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSanctuary(int nDifficultyClass, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSavingThrowDecrease(int nSave, int nValue, SaveType tSaveType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSavingThrowIncrease(int nSave, int nValue, SaveType tSaveType, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSeeInvisible(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSilence(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSkillDecrease(int nSkill, int nValue, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSkillIncrease(int nSkill, int nValue, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSleep(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSlow(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSpellFailure(int nPercent, SpellSchool tSpellSchool, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSpellImmunity(int nImmunityToSpell, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSpellLevelAbsorption(int nMaxSpellLevelAbsorbed, int nTotalSpellLevelsAbsorbed, SpellSchool tSpellSchool, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSpellResistanceDecrease(int nValue, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSpellResistanceIncrease(int nValue, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectStunned(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSummonCreature(String sCreatureResref, int nVisualEffectId, float fDelaySeconds, boolean bUseAppearAnimation, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectSwarm(boolean bLooping, String sCreatureTemplate1, String sCreatureTemplate2, String sCreatureTemplate3, String sCreatureTemplate4, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectTemporaryHitpoints(int nHitPoints, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectTimeStop(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectTrueSeeing(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectTurnResistanceDecrease(int nHitDice, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectTurnResistanceIncrease(int nHitDice, Ice.Current __current)
        throws NotInContextException;

    NWEffect effectTurned(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectUltravision(Ice.Current __current)
        throws NotInContextException;

    NWEffect effectVisualEffect(int nVisualEffectId, boolean bMissEffect, Ice.Current __current)
        throws NotInContextException;

    void endGame(String sEndMovie, Ice.Current __current)
        throws NotInContextException;

    void executeScript(String sScript, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void exploreAreaForPlayer(NWObject oArea, NWObject oPlayer, boolean bExplored, Ice.Current __current)
        throws NotInContextException;

    void exportAllCharacters(Ice.Current __current)
        throws NotInContextException;

    void exportSingleCharacter(NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    NWEffect extraordinaryEffect(NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    void fadeFromBlack(NWObject oCreature, float fSpeed, Ice.Current __current)
        throws NotInContextException;

    void fadeToBlack(NWObject oCreature, float fSpeed, Ice.Current __current)
        throws NotInContextException;

    void floatingTextStrRefOnCreature(int nStrRefToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction, Ice.Current __current)
        throws NotInContextException;

    void floatingTextStringOnCreature(String sStringToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction, Ice.Current __current)
        throws NotInContextException;

    void forceRest(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    SavingThrowResult fortitudeSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus, Ice.Current __current)
        throws NotInContextException;

    String get2DAString(String s2DA, String sColumn, int nRow, Ice.Current __current)
        throws NotInContextException;

    int getAC(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    AILevel getAILevel(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getAbilityModifier(Ability tAbility, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getAbilityScore(NWObject oCreature, Ability tAbility, boolean bBaseAbilityScore, Ice.Current __current)
        throws NotInContextException;

    boolean getActionMode(NWObject oCreature, ActionMode tActionMode, Ice.Current __current)
        throws NotInContextException;

    int getAge(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    Alignment getAlignmentGoodEvil(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    Alignment getAlignmentLawChaos(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getAnimalCompanionCreatureType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    String getAnimalCompanionName(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getAppearanceType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getArcaneSpellFailure(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    NWObject getArea(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    NWObject getAreaOfEffectCreator(NWObject oAreaOfEffectObject, Ice.Current __current)
        throws NotInContextException;

    int getAreaSize(int nAreaDimension, NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    NWObject getAssociate(AssociateType tAssociateType, NWObject oMaster, int nTh, Ice.Current __current)
        throws NotInContextException;

    AssociateType getAssociateType(NWObject oAssociate, Ice.Current __current)
        throws NotInContextException;

    NWObject getAttackTarget(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    NWObject getAttemptedAttackTarget(Ice.Current __current)
        throws NotInContextException;

    NWObject getAttemptedSpellTarget(Ice.Current __current)
        throws NotInContextException;

    int getBaseAttackBonus(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getBaseItemType(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    NWObject getBlockingDoor(Ice.Current __current)
        throws NotInContextException;

    int getCalendarDay(Ice.Current __current)
        throws NotInContextException;

    int getCalendarMonth(Ice.Current __current)
        throws NotInContextException;

    int getCalendarYear(Ice.Current __current)
        throws NotInContextException;

    float getCampaignFloat(String sCampaignName, String sVarName, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    int getCampaignInt(String sCampaignName, String sVarName, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    NWLocation getCampaignLocation(String sCampaignName, String sVarName, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    String getCampaignString(String sCampaignName, String sVarName, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    NWVector getCampaignVector(String sCampaignName, String sVarName, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    int getCasterLevel(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    float getChallengeRating(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getClassByPosition(int nClassPosition, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    NWObject getClickingObject(Ice.Current __current)
        throws NotInContextException;

    int getColor(NWObject oObject, int nColorChannel, Ice.Current __current)
        throws NotInContextException;

    boolean getCommandable(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getCreatureBodyPart(CreaturePart tCreaturePart, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    CreatureSize getCreatureSize(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getCreatureStartingPackage(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getCreatureTailType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getCreatureWingType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    Action getCurrentAction(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    int getCurrentHitPoints(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    float getCutsceneCameraMoveRate(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getCutsceneMode(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getDamageDealtByType(DamageType tDamageType, Ice.Current __current)
        throws NotInContextException;

    int getDefensiveCastingMode(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    String getDeity(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    String getDescription(NWObject oObject, boolean bOriginalDescription, boolean bIdentifiedDescription, Ice.Current __current)
        throws NotInContextException;

    int getDetectMode(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    float getDialogSoundLength(int nStrRef, Ice.Current __current)
        throws NotInContextException;

    float getDistanceBetween(NWObject oObjectA, NWObject oObjectB, Ice.Current __current)
        throws NotInContextException;

    float getDistanceBetweenLocations(NWLocation lLocationA, NWLocation lLocationB, Ice.Current __current)
        throws NotInContextException;

    float getDistanceToObject(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getDroppableFlag(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    NWObject getEffectCreator(NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    DurationType getEffectDurationType(NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    int getEffectSpellId(NWEffect eSpellEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    EffectSubType getEffectSubType(NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    EffectType getEffectType(NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    int getEncounterActive(NWObject oEncounter, Ice.Current __current)
        throws NotInContextException;

    int getEncounterDifficulty(NWObject oEncounter, Ice.Current __current)
        throws NotInContextException;

    int getEncounterSpawnsCurrent(NWObject oEncounter, Ice.Current __current)
        throws NotInContextException;

    int getEncounterSpawnsMax(NWObject oEncounter, Ice.Current __current)
        throws NotInContextException;

    NWObject getEnteringObject(Ice.Current __current)
        throws NotInContextException;

    NWObject getExitingObject(Ice.Current __current)
        throws NotInContextException;

    float getFacing(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getFactionAverageGoodEvilAlignment(NWObject oFactionMember, Ice.Current __current)
        throws NotInContextException;

    int getFactionAverageLawChaosAlignment(NWObject oFactionMember, Ice.Current __current)
        throws NotInContextException;

    int getFactionAverageLevel(NWObject oFactionMember, Ice.Current __current)
        throws NotInContextException;

    int getFactionAverageReputation(NWObject oSourceFactionMember, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getFactionAverageXP(NWObject oFactionMember, Ice.Current __current)
        throws NotInContextException;

    NWObject getFactionBestAC(NWObject oFactionMember, boolean bMustBeVisible, Ice.Current __current)
        throws NotInContextException;

    boolean getFactionEqual(NWObject oFirstObject, NWObject oSecondObject, Ice.Current __current)
        throws NotInContextException;

    int getFactionGold(NWObject oFactionMember, Ice.Current __current)
        throws NotInContextException;

    NWObject getFactionLeader(NWObject oMemberOfFaction, Ice.Current __current)
        throws NotInContextException;

    NWObject getFactionLeastDamagedMember(NWObject oFactionMember, boolean bMustBeVisible, Ice.Current __current)
        throws NotInContextException;

    NWObject getFactionMostDamagedMember(NWObject oFactionMember, boolean bMustBeVisible, Ice.Current __current)
        throws NotInContextException;

    int getFactionMostFrequentClass(NWObject oFactionMember, Ice.Current __current)
        throws NotInContextException;

    NWObject getFactionStrongestMember(NWObject oFactionMember, boolean bMustBeVisible, Ice.Current __current)
        throws NotInContextException;

    NWObject getFactionWeakestMember(NWObject oFactionMember, boolean bMustBeVisible, Ice.Current __current)
        throws NotInContextException;

    NWObject getFactionWorstAC(NWObject oFactionMember, boolean bMustBeVisible, Ice.Current __current)
        throws NotInContextException;

    int getFamiliarCreatureType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    String getFamiliarName(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getFogAmount(int nFogType, NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    int getFogColor(int nFogType, NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    int getFootstepType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getFortitudeSavingThrow(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getGameDifficulty(Ice.Current __current)
        throws NotInContextException;

    Gender getGender(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    NWObject getGoingToBeAttackedBy(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getGold(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getGoldPieceValue(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    int getGoodEvilValue(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getHardness(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getHasFeat(int nFeat, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getHasFeatEffect(int nFeat, NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getHasInventory(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getHasSkill(int nSkill, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getHasSpell(int nSpell, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getHasSpellEffect(int nSpell, NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    NWObject getHenchman(NWObject oMaster, int nNth, Ice.Current __current)
        throws NotInContextException;

    int getHitDice(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIdentified(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    boolean getImmortal(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    boolean getInfiniteFlag(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    NWObject getInventoryDisturbItem(Ice.Current __current)
        throws NotInContextException;

    int getInventoryDisturbType(Ice.Current __current)
        throws NotInContextException;

    boolean getIsAreaAboveGround(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    boolean getIsAreaInterior(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    boolean getIsAreaNatural(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    boolean getIsCreatureDisarmable(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsDM(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsDMPossessed(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsDawn(Ice.Current __current)
        throws NotInContextException;

    boolean getIsDay(Ice.Current __current)
        throws NotInContextException;

    boolean getIsDead(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsDoorActionPossible(NWObject oTargetDoor, DoorAction tDoorAction, Ice.Current __current)
        throws NotInContextException;

    boolean getIsDusk(Ice.Current __current)
        throws NotInContextException;

    boolean getIsEffectValid(NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    boolean getIsEncounterCreature(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsEnemy(NWObject oTarget, NWObject oSource, Ice.Current __current)
        throws NotInContextException;

    boolean getIsFriend(NWObject oTarget, NWObject oSource, Ice.Current __current)
        throws NotInContextException;

    boolean getIsImmune(NWObject oCreature, ImmunityType tImmunityType, NWObject oVersus, Ice.Current __current)
        throws NotInContextException;

    boolean getIsInCombat(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsInSubArea(NWObject oCreature, NWObject oSubArea, Ice.Current __current)
        throws NotInContextException;

    boolean getIsItemPropertyValid(NWItemProperty ipProperty, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    boolean getIsListening(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getIsNeutral(NWObject oTarget, NWObject oSource, Ice.Current __current)
        throws NotInContextException;

    boolean getIsNight(Ice.Current __current)
        throws NotInContextException;

    boolean getIsObjectValid(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getIsOpen(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getIsPC(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsPlaceableObjectActionPossible(NWObject oPlaceable, PlaceableAction tPlaceableAction, Ice.Current __current)
        throws NotInContextException;

    boolean getIsPlayableRacialType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsPossessedFamiliar(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsReactionTypeFriendly(NWObject oTarget, NWObject oSource, Ice.Current __current)
        throws NotInContextException;

    boolean getIsReactionTypeHostile(NWObject oTarget, NWObject oSource, Ice.Current __current)
        throws NotInContextException;

    boolean getIsReactionTypeNeutral(NWObject oTarget, NWObject oSource, Ice.Current __current)
        throws NotInContextException;

    boolean getIsResting(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getIsSkillSuccessful(NWObject oTarget, int nSkill, int nDifficulty, Ice.Current __current)
        throws NotInContextException;

    boolean getIsTrapped(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getIsWeaponEffective(NWObject oVersus, boolean bOffHand, Ice.Current __current)
        throws NotInContextException;

    int getItemACValue(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    NWObject getItemActivated(Ice.Current __current)
        throws NotInContextException;

    NWObject getItemActivatedTarget(Ice.Current __current)
        throws NotInContextException;

    NWLocation getItemActivatedTargetLocation(Ice.Current __current)
        throws NotInContextException;

    NWObject getItemActivator(Ice.Current __current)
        throws NotInContextException;

    int getItemAppearance(NWObject oItem, int nType, int nIndex, Ice.Current __current)
        throws NotInContextException;

    int getItemCharges(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    boolean getItemCursedFlag(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    boolean getItemHasItemProperty(NWObject oItem, int nProperty, Ice.Current __current)
        throws NotInContextException;

    NWObject getItemInSlot(InventorySlot tInventorySlot, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    NWObject getItemPossessedBy(NWObject oCreature, String sItemTag, Ice.Current __current)
        throws NotInContextException;

    NWObject getItemPossessor(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    int getItemPropertyCostTable(NWItemProperty iProp, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyCostTableValue(NWItemProperty iProp, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    DurationType getItemPropertyDurationType(NWItemProperty ip, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyParam1(NWItemProperty iProp, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyParam1Value(NWItemProperty iProp, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertySubType(NWItemProperty iProperty, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyType(NWItemProperty ip, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    int getItemStackSize(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    int getJournalQuestExperience(String szPlotID, Ice.Current __current)
        throws NotInContextException;

    String getKeyRequiredFeedback(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    AssociateCommand getLastAssociateCommand(NWObject oAssociate, Ice.Current __current)
        throws NotInContextException;

    CombatMode getLastAttackMode(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    SpecialAttack getLastAttackType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    NWObject getLastAttacker(NWObject oAttackee, Ice.Current __current)
        throws NotInContextException;

    NWObject getLastClosedBy(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastDamager(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    NWObject getLastDisarmed(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastDisturbed(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastHostileActor(NWObject oVictim, Ice.Current __current)
        throws NotInContextException;

    NWObject getLastKiller(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastLocked(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastOpenedBy(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastPCRested(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastPCToCancelCutscene(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastPerceived(Ice.Current __current)
        throws NotInContextException;

    boolean getLastPerceptionHeard(Ice.Current __current)
        throws NotInContextException;

    boolean getLastPerceptionInaudible(Ice.Current __current)
        throws NotInContextException;

    boolean getLastPerceptionSeen(Ice.Current __current)
        throws NotInContextException;

    boolean getLastPerceptionVanished(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastPlayerDied(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastPlayerDying(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastRespawnButtonPresser(Ice.Current __current)
        throws NotInContextException;

    int getLastRestEventType(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastSpeaker(Ice.Current __current)
        throws NotInContextException;

    int getLastSpell(Ice.Current __current)
        throws NotInContextException;

    int getLastSpellCastClass(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastSpellCaster(Ice.Current __current)
        throws NotInContextException;

    boolean getLastSpellHarmful(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastTrapDetected(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    NWObject getLastUnlocked(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastUsedBy(Ice.Current __current)
        throws NotInContextException;

    NWObject getLastWeaponUsed(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getLawChaosValue(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getLevelByClass(int nClassType, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getLevelByPosition(int nClassPosition, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getListenPatternNumber(Ice.Current __current)
        throws NotInContextException;

    float getLocalFloat(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    int getLocalInt(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    NWLocation getLocalLocation(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    NWObject getLocalObject(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    String getLocalString(NWObject oObject, String sVarName, Ice.Current __current)
        throws NotInContextException;

    NWLocation getLocation(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getLockKeyRequired(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    String getLockKeyTag(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    int getLockLockDC(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getLockLockable(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    int getLockUnlockDC(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    boolean getLocked(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    boolean getLootable(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    NWObject getMaster(NWObject oAssociate, Ice.Current __current)
        throws NotInContextException;

    String getMatchedSubstring(int nString, Ice.Current __current)
        throws NotInContextException;

    int getMatchedSubstringsCount(Ice.Current __current)
        throws NotInContextException;

    int getMaxHenchmen(Ice.Current __current)
        throws NotInContextException;

    int getMaxHitPoints(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    MetaMagic getMetaMagicFeat(Ice.Current __current)
        throws NotInContextException;

    NWObject getModule(Ice.Current __current)
        throws NotInContextException;

    NWObject getModuleItemAcquired(Ice.Current __current)
        throws NotInContextException;

    NWObject getModuleItemAcquiredBy(Ice.Current __current)
        throws NotInContextException;

    NWObject getModuleItemAcquiredFrom(Ice.Current __current)
        throws NotInContextException;

    int getModuleItemAcquiredStackSize(Ice.Current __current)
        throws NotInContextException;

    NWObject getModuleItemLost(Ice.Current __current)
        throws NotInContextException;

    NWObject getModuleItemLostBy(Ice.Current __current)
        throws NotInContextException;

    String getModuleName(Ice.Current __current)
        throws NotInContextException;

    int getModuleXPScale(Ice.Current __current)
        throws NotInContextException;

    int getMovementRate(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    String getName(NWObject oObject, boolean bOriginalName, Ice.Current __current)
        throws NotInContextException;

    NWObject getNearestCreature(int nFirstCriteriaType, int nFirstCriteriaValue, NWObject oTarget, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue, Ice.Current __current)
        throws NotInContextException;

    NWObject getNearestCreatureToLocation(int nFirstCriteriaType, int nFirstCriteriaValue, NWLocation lLocation, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue, Ice.Current __current)
        throws NotInContextException;

    NWObject getNearestObject(ObjectType tObjectType, NWObject oTarget, int nNth, Ice.Current __current)
        throws NotInContextException;

    NWObject getNearestObjectByTag(String sTag, NWObject oTarget, int nNth, Ice.Current __current)
        throws NotInContextException;

    NWObject getNearestObjectToLocation(ObjectType tObjectType, NWLocation lLocation, int nNth, Ice.Current __current)
        throws NotInContextException;

    NWObject getNearestTrapToObject(NWObject oTarget, boolean bTrapDetected, Ice.Current __current)
        throws NotInContextException;

    int getNumStackedItems(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    NWObject getObjectByTag(String sTag, int nNth, Ice.Current __current)
        throws NotInContextException;

    boolean getObjectHeard(NWObject oTarget, NWObject oSource, Ice.Current __current)
        throws NotInContextException;

    boolean getObjectSeen(NWObject oTarget, NWObject oSource, Ice.Current __current)
        throws NotInContextException;

    ObjectType getObjectType(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    String getPCChatMessage(Ice.Current __current)
        throws NotInContextException;

    NWObject getPCChatSpeaker(Ice.Current __current)
        throws NotInContextException;

    int getPCChatVolume(Ice.Current __current)
        throws NotInContextException;

    String getPCIPAddress(NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    NWObject getPCItemLastEquipped(Ice.Current __current)
        throws NotInContextException;

    NWObject getPCItemLastEquippedBy(Ice.Current __current)
        throws NotInContextException;

    NWObject getPCItemLastUnequipped(Ice.Current __current)
        throws NotInContextException;

    NWObject getPCItemLastUnequippedBy(Ice.Current __current)
        throws NotInContextException;

    NWObject getPCLevellingUp(Ice.Current __current)
        throws NotInContextException;

    String getPCPlayerName(NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    String getPCPublicCDKey(NWObject oPlayer, boolean bSinglePlayerCDKey, Ice.Current __current)
        throws NotInContextException;

    NWObject getPCSpeaker(Ice.Current __current)
        throws NotInContextException;

    PhenoType getPhenoType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getPickpocketableFlag(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    int getPlaceableIllumination(NWObject oPlaceable, Ice.Current __current)
        throws NotInContextException;

    NWObject getPlaceableLastClickedBy(Ice.Current __current)
        throws NotInContextException;

    boolean getPlotFlag(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getPortraitId(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    String getPortraitResRef(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    NWVector getPosition(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    RacialType getRacialType(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getReflexAdjustedDamage(int nDamage, NWObject oTarget, int nDC, SaveType tSaveType, NWObject oSaveVersus, Ice.Current __current)
        throws NotInContextException;

    int getReflexSavingThrow(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getReputation(NWObject oSource, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    String getResRef(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    NWObject getSittingCreature(NWObject oChair, Ice.Current __current)
        throws NotInContextException;

    int getSkillRank(int nSkill, NWObject oTarget, boolean bBaseSkillRank, Ice.Current __current)
        throws NotInContextException;

    int getSkyBox(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    NWObject getSpellCastItem(Ice.Current __current)
        throws NotInContextException;

    int getSpellId(Ice.Current __current)
        throws NotInContextException;

    int getSpellResistance(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getSpellSaveDC(Ice.Current __current)
        throws NotInContextException;

    NWLocation getSpellTargetLocation(Ice.Current __current)
        throws NotInContextException;

    NWObject getSpellTargetObject(Ice.Current __current)
        throws NotInContextException;

    int getStandardFactionReputation(StandardFaction tStandardFaction, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    NWLocation getStartingLocation(Ice.Current __current)
        throws NotInContextException;

    int getStealthMode(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    boolean getStolenFlag(NWObject oStolen, Ice.Current __current)
        throws NotInContextException;

    int getStoreGold(NWObject oidStore, Ice.Current __current)
        throws NotInContextException;

    int getStoreIdentifyCost(NWObject oidStore, Ice.Current __current)
        throws NotInContextException;

    int getStoreMaxBuyPrice(NWObject oidStore, Ice.Current __current)
        throws NotInContextException;

    float getStrRefSoundDuration(int nStrRef, Ice.Current __current)
        throws NotInContextException;

    String getStringByStrRef(int nStrRef, Gender tGender, Ice.Current __current)
        throws NotInContextException;

    String getSubRace(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    String getTag(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    TileMainLightColor getTileMainLight1Color(NWLocation lTile, Ice.Current __current)
        throws NotInContextException;

    TileMainLightColor getTileMainLight2Color(NWLocation lTile, Ice.Current __current)
        throws NotInContextException;

    TileSourceLightColor getTileSourceLight1Color(NWLocation lTile, Ice.Current __current)
        throws NotInContextException;

    TileSourceLightColor getTileSourceLight2Color(NWLocation lTile, Ice.Current __current)
        throws NotInContextException;

    String getTilesetResRef(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    int getTimeHour(Ice.Current __current)
        throws NotInContextException;

    int getTimeMillisecond(Ice.Current __current)
        throws NotInContextException;

    int getTimeMinute(Ice.Current __current)
        throws NotInContextException;

    int getTimeSecond(Ice.Current __current)
        throws NotInContextException;

    int getTotalDamageDealt(Ice.Current __current)
        throws NotInContextException;

    NWObject getTransitionTarget(NWObject oTransition, Ice.Current __current)
        throws NotInContextException;

    boolean getTrapActive(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    int getTrapBaseType(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    NWObject getTrapCreator(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    int getTrapDetectDC(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    boolean getTrapDetectable(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    boolean getTrapDetectedBy(NWObject oTrapObject, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    int getTrapDisarmDC(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    boolean getTrapDisarmable(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    boolean getTrapFlagged(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    String getTrapKeyTag(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    boolean getTrapOneShot(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    boolean getTrapRecoverable(NWObject oTrapObject, Ice.Current __current)
        throws NotInContextException;

    int getTurnResistanceHD(NWObject oUndead, Ice.Current __current)
        throws NotInContextException;

    boolean getUseableFlag(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    int getUserDefinedEventNumber(Ice.Current __current)
        throws NotInContextException;

    NWObject getWaypointByTag(String sWaypointTag, Ice.Current __current)
        throws NotInContextException;

    boolean getWeaponRanged(NWObject oItem, Ice.Current __current)
        throws NotInContextException;

    Weather getWeather(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    int getWeight(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getWillSavingThrow(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int getXP(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void giveGoldToCreature(NWObject oCreature, int nGP, Ice.Current __current)
        throws NotInContextException;

    void giveXPToCreature(NWObject oCreature, int nXpAmount, Ice.Current __current)
        throws NotInContextException;

    float hoursToSeconds(int nHours, Ice.Current __current)
        throws NotInContextException;

    void incrementRemainingFeatUses(NWObject oCreature, int nFeat, Ice.Current __current)
        throws NotInContextException;

    boolean isInConversation(NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonus(int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonusVsAlign(IPAlignGroup tIPAlignGroup, int nACBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonusVsDmgType(IPDamageType tIPDamageType, int nACBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonusVsRace(IPRacialType tIPRacialType, int nACBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyACBonusVsSAlign(Alignment tAlignment, int nACBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyAbilityBonus(Ability tAbility, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyAdditional(int nAdditionalProperty, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyArcaneSpellFailure(int nModLevel, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackBonus(int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackBonusVsRace(IPRacialType tIPRacialType, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackBonusVsSAlign(Alignment tAlignment, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyAttackPenalty(int nPenalty, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusFeat(int nFeat, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusLevelSpell(int nClass, int nSpellLevel, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusSavingThrow(int nBaseSaveType, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusSavingThrowVsX(int nBonusType, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyBonusSpellResistance(int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyCastSpell(int nSpell, int nNumUses, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyContainerReducedWeight(int nContainerType, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageBonus(IPDamageType tIPDamageType, int nDamage, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageBonusVsAlign(IPAlignGroup tIPAlignGroup, IPDamageType tIPDamageType, int nDamage, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageBonusVsRace(IPRacialType tIPRacialType, IPDamageType tIPDamageType, int nDamage, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageBonusVsSAlign(Alignment tAlignment, IPDamageType tIPDamageType, int nDamage, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageImmunity(IPDamageType tIPDamageType, int nImmuneBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDamagePenalty(int nPenalty, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageReduction(int nEnhancement, int nHPSoak, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageResistance(IPDamageType tIPDamageType, int nHPResist, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDamageVulnerability(IPDamageType tIPDamageType, int nVulnerability, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDarkvision(Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDecreaseAC(int nModifierType, int nPenalty, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDecreaseAbility(Ability tAbility, int nModifier, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyDecreaseSkill(int nSkill, int nPenalty, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementBonus(int nEnhancementBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementBonusVsRace(IPRacialType tIPRacialType, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementBonusVsSAlign(Alignment tAlignment, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyEnhancementPenalty(int nPenalty, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyExtraMeleeDamageType(IPDamageType tIPDamageType, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyExtraRangeDamageType(IPDamageType tIPDamageType, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyFreeAction(Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyHaste(Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyHealersKit(int nModifier, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyHolyAvenger(Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyImmunityMisc(IPMiscImmunityType tIPMiscImmunityType, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyImmunityToSpellLevel(int nLevel, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyImprovedEvasion(Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyKeen(Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyLight(int nBrightness, int nColor, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyLimitUseByAlign(IPAlignGroup tIPAlignGroup, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyLimitUseByClass(int nClass, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyLimitUseByRace(IPRacialType tIPRacialType, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyLimitUseBySAlign(Alignment tAlignment, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyMassiveCritical(int nDamage, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyMaterial(int nMaterialType, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyMaxRangeStrengthMod(int nModifier, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyMonsterDamage(int nDamage, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyNoDamage(Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyOnHitCastSpell(int nSpell, int nLevel, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyOnHitProps(int nProperty, int nSaveDC, int nSpecial, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyOnMonsterHitProperties(int nProperty, int nSpecial, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyQuality(int nQuality, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyReducedSavingThrow(int nBonusType, int nPenalty, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyReducedSavingThrowVsX(int nBaseSaveType, int nPenalty, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyRegeneration(int nRegenAmount, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertySkillBonus(int nSkill, int nBonus, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertySpecialWalk(int nWalkType, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertySpellImmunitySchool(IPSpellSchool tIPSpellSchool, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertySpellImmunitySpecific(int nSpell, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyThievesTools(int nModifier, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyTrap(int nTrapLevel, IPTrapType tIPTrapType, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyTrueSeeing(Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyTurnResistance(int nModifier, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyUnlimitedAmmo(int nAmmoDamage, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyVampiricRegeneration(int nRegenAmount, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyVisualEffect(int nEffect, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyWeightIncrease(int nWeight, Ice.Current __current)
        throws NotInContextException;

    NWItemProperty itemPropertyWeightReduction(int nReduction, Ice.Current __current)
        throws NotInContextException;

    void jumpToLocation(NWLocation lDestination, Ice.Current __current)
        throws NotInContextException;

    void jumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint, Ice.Current __current)
        throws NotInContextException;

    int levelUpHenchman(NWObject oCreature, int nClass, boolean bReadyAllSpells, int nPackage, Ice.Current __current)
        throws NotInContextException;

    int lineOfSightObject(NWObject oSource, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    int lineOfSightVector(NWVector vSource, NWVector vTarget, Ice.Current __current)
        throws NotInContextException;

    void lockCameraDirection(NWObject oPlayer, boolean bLocked, Ice.Current __current)
        throws NotInContextException;

    void lockCameraDistance(NWObject oPlayer, boolean bLocked, Ice.Current __current)
        throws NotInContextException;

    void lockCameraPitch(NWObject oPlayer, boolean bLocked, Ice.Current __current)
        throws NotInContextException;

    NWEffect magicalEffect(NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    void musicBackgroundChangeDay(NWObject oArea, int nTrack, Ice.Current __current)
        throws NotInContextException;

    void musicBackgroundChangeNight(NWObject oArea, int nTrack, Ice.Current __current)
        throws NotInContextException;

    int musicBackgroundGetBattleTrack(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    int musicBackgroundGetDayTrack(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    int musicBackgroundGetNightTrack(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    void musicBackgroundPlay(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    void musicBackgroundSetDelay(NWObject oArea, int nDelay, Ice.Current __current)
        throws NotInContextException;

    void musicBackgroundStop(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    void musicBattleChange(NWObject oArea, int nTrack, Ice.Current __current)
        throws NotInContextException;

    void musicBattlePlay(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    void musicBattleStop(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    void nightToDay(NWObject oPlayer, float fTransitionTime, Ice.Current __current)
        throws NotInContextException;

    void openInventory(NWObject oCreature, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    void openStore(NWObject oStore, NWObject oPC, int nBonusMarkUp, int nBonusMarkDown, Ice.Current __current)
        throws NotInContextException;

    void playAnimation(int nAnimation, float fSpeed, float fSeconds, Ice.Current __current)
        throws NotInContextException;

    void playSound(String sSoundName, Ice.Current __current)
        throws NotInContextException;

    void playSoundByStrRef(int nStrRef, int nRunAsAction, Ice.Current __current)
        throws NotInContextException;

    void playVoiceChat(int nVoiceChatID, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void popUpDeathGUIPanel(NWObject oPC, boolean bRespawnButtonEnabled, boolean bWaitForHelpButtonEnabled, int nHelpStringReference, String sHelpString, Ice.Current __current)
        throws NotInContextException;

    void popUpGUIPanel(NWObject oPC, int nGUIPanel, Ice.Current __current)
        throws NotInContextException;

    String randomName(int nNameType, Ice.Current __current)
        throws NotInContextException;

    void recomputeStaticLighting(NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    SavingThrowResult reflexSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus, Ice.Current __current)
        throws NotInContextException;

    void removeEffect(NWObject oCreature, NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    void removeFromParty(NWObject oPC, Ice.Current __current)
        throws NotInContextException;

    void removeHenchman(NWObject oMaster, NWObject oHenchman, Ice.Current __current)
        throws NotInContextException;

    void removeItemProperty(NWObject oItem, NWItemProperty ipProperty, Ice.Current __current)
        throws InvalidItemPropertyException,
               NotInContextException;

    void removeJournalQuestEntry(String szPlotID, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers, Ice.Current __current)
        throws NotInContextException;

    void removeSummonedAssociate(NWObject oMaster, NWObject oAssociate, Ice.Current __current)
        throws NotInContextException;

    int resistSpell(NWObject oCaster, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void restoreBaseAttackBonus(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void restoreCameraFacing(Ice.Current __current)
        throws NotInContextException;

    NWObject retrieveCampaignObject(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oOwner, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    float roundsToSeconds(int nRounds, Ice.Current __current)
        throws NotInContextException;

    void sendMessageToAllDMs(String szMessage, Ice.Current __current)
        throws NotInContextException;

    void sendMessageToPC(NWObject oPlayer, String szMessage, Ice.Current __current)
        throws NotInContextException;

    void sendMessageToPCByStrRef(NWObject oPlayer, int nStrRef, Ice.Current __current)
        throws NotInContextException;

    void setAILevel(NWObject oTarget, AILevel tAILevel, Ice.Current __current)
        throws NotInContextException;

    void setActionMode(NWObject oCreature, ActionMode tActionMode, boolean bStatus, Ice.Current __current)
        throws NotInContextException;

    void setAreaTransitionBMP(int nPredefinedAreaTransition, String sCustomAreaTransitionBMP, Ice.Current __current)
        throws NotInContextException;

    void setAssociateListenPatterns(NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void setBaseAttackBonus(int nBaseAttackBonus, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void setCalendar(int nYear, int nMonth, int nDay, Ice.Current __current)
        throws NotInContextException;

    void setCameraFacing(float fDirection, float fDistance, float fPitch, int nTransitionType, Ice.Current __current)
        throws NotInContextException;

    void setCameraHeight(NWObject oPlayer, float fHeight, Ice.Current __current)
        throws NotInContextException;

    void setCameraMode(NWObject oPlayer, int nCameraMode, Ice.Current __current)
        throws NotInContextException;

    void setCampaignFloat(String sCampaignName, String sVarName, float flFloat, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    void setCampaignInt(String sCampaignName, String sVarName, int nInt, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    void setCampaignLocation(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    void setCampaignString(String sCampaignName, String sVarName, String sString, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    void setCampaignVector(String sCampaignName, String sVarName, NWVector vVector, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    void setColor(NWObject oObject, int nColorChannel, int nColorValue, Ice.Current __current)
        throws NotInContextException;

    void setCommandable(boolean bCommandable, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void setCreatureAppearanceType(NWObject oCreature, int nAppearanceType, Ice.Current __current)
        throws NotInContextException;

    void setCreatureBodyPart(CreaturePart tCreaturePart, int nModelNumber, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void setCreatureTailType(int nTailType, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void setCreatureWingType(int nWingType, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void setCustomToken(int nCustomTokenNumber, String sTokenValue, Ice.Current __current)
        throws NotInContextException;

    void setCutsceneCameraMoveRate(NWObject oCreature, float fRate, Ice.Current __current)
        throws NotInContextException;

    void setCutsceneMode(NWObject oCreature, boolean bInCutscene, boolean bLeftClickingEnabled, Ice.Current __current)
        throws NotInContextException;

    void setDeity(NWObject oCreature, String sDeity, Ice.Current __current)
        throws NotInContextException;

    void setDescription(NWObject oObject, String sNewDescription, boolean bIdentifiedDescription, Ice.Current __current)
        throws NotInContextException;

    void setDroppableFlag(NWObject oItem, boolean bDroppable, Ice.Current __current)
        throws NotInContextException;

    void setEncounterActive(boolean bNewValue, NWObject oEncounter, Ice.Current __current)
        throws NotInContextException;

    void setEncounterDifficulty(int nEncounterDifficulty, NWObject oEncounter, Ice.Current __current)
        throws NotInContextException;

    void setEncounterSpawnsCurrent(int nNewValue, NWObject oEncounter, Ice.Current __current)
        throws NotInContextException;

    void setEncounterSpawnsMax(int nNewValue, NWObject oEncounter, Ice.Current __current)
        throws NotInContextException;

    void setFacing(float fDirection, Ice.Current __current)
        throws NotInContextException;

    void setFacingPoint(NWVector vTarget, Ice.Current __current)
        throws NotInContextException;

    void setFogAmount(int nFogType, int nFogAmount, NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    void setFogColor(int nFogType, int nFogColor, NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    void setFootstepType(int nFootstepType, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void setFortitudeSavingThrow(NWObject oObject, int nFortitudeSave, Ice.Current __current)
        throws NotInContextException;

    void setHardness(int nHardness, NWObject oObject, Ice.Current __current)
        throws NotInContextException;

    void setIdentified(NWObject oItem, boolean bIdentified, Ice.Current __current)
        throws NotInContextException;

    void setImmortal(NWObject oCreature, boolean bImmortal, Ice.Current __current)
        throws NotInContextException;

    void setInfiniteFlag(NWObject oItem, boolean bInfinite, Ice.Current __current)
        throws NotInContextException;

    void setIsDestroyable(boolean bDestroyable, boolean bRaiseable, boolean bSelectableWhenDead, Ice.Current __current)
        throws NotInContextException;

    void setIsTemporaryEnemy(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds, Ice.Current __current)
        throws NotInContextException;

    void setIsTemporaryFriend(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds, Ice.Current __current)
        throws NotInContextException;

    void setIsTemporaryNeutral(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds, Ice.Current __current)
        throws NotInContextException;

    void setItemCharges(NWObject oItem, int nCharges, Ice.Current __current)
        throws NotInContextException;

    void setItemCursedFlag(NWObject oItem, boolean bCursed, Ice.Current __current)
        throws NotInContextException;

    void setItemStackSize(NWObject oItem, int nSize, Ice.Current __current)
        throws NotInContextException;

    void setKeyRequiredFeedback(NWObject oObject, String sFeedbackMessage, Ice.Current __current)
        throws NotInContextException;

    void setListenPattern(NWObject oObject, String sPattern, int nNumber, Ice.Current __current)
        throws NotInContextException;

    void setListening(NWObject oObject, boolean bValue, Ice.Current __current)
        throws NotInContextException;

    void setLocalFloat(NWObject oObject, String sVarName, float fValue, Ice.Current __current)
        throws NotInContextException;

    void setLocalInt(NWObject oObject, String sVarName, int nValue, Ice.Current __current)
        throws NotInContextException;

    void setLocalLocation(NWObject oObject, String sVarName, NWLocation lValue, Ice.Current __current)
        throws NotInContextException;

    void setLocalObject(NWObject oObject, String sVarName, NWObject oValue, Ice.Current __current)
        throws NotInContextException;

    void setLocalString(NWObject oObject, String sVarName, String sValue, Ice.Current __current)
        throws NotInContextException;

    void setLockKeyRequired(NWObject oObject, boolean bKeyRequired, Ice.Current __current)
        throws NotInContextException;

    void setLockKeyTag(NWObject oObject, String sNewKeyTag, Ice.Current __current)
        throws NotInContextException;

    void setLockLockDC(NWObject oObject, int nNewLockDC, Ice.Current __current)
        throws NotInContextException;

    void setLockLockable(NWObject oObject, boolean bLockable, Ice.Current __current)
        throws NotInContextException;

    void setLockUnlockDC(NWObject oObject, int nNewUnlockDC, Ice.Current __current)
        throws NotInContextException;

    void setLocked(NWObject oTarget, boolean bLocked, Ice.Current __current)
        throws NotInContextException;

    void setLootable(NWObject oCreature, boolean bLootable, Ice.Current __current)
        throws NotInContextException;

    void setMapPinEnabled(NWObject oMapPin, boolean bEnabled, Ice.Current __current)
        throws NotInContextException;

    void setMaxHenchmen(int nNumHenchmen, Ice.Current __current)
        throws NotInContextException;

    void setModuleXPScale(int nXPScale, Ice.Current __current)
        throws NotInContextException;

    void setName(NWObject oObject, String sNewName, Ice.Current __current)
        throws NotInContextException;

    void setPCChatMessage(String sNewChatMessage, Ice.Current __current)
        throws NotInContextException;

    void setPCChatVolume(TalkVolume tTalkVolume, Ice.Current __current)
        throws NotInContextException;

    void setPCDislike(NWObject oPlayer, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void setPCLike(NWObject oPlayer, NWObject oTarget, Ice.Current __current)
        throws NotInContextException;

    void setPanelButtonFlash(NWObject oPlayer, Button tButton, boolean bEnableFlash, Ice.Current __current)
        throws NotInContextException;

    void setPhenoType(PhenoType tPhenoType, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void setPickpocketableFlag(NWObject oItem, boolean bPickpocketable, Ice.Current __current)
        throws NotInContextException;

    void setPlaceableIllumination(NWObject oPlaceable, boolean bIlluminate, Ice.Current __current)
        throws NotInContextException;

    void setPlotFlag(NWObject oTarget, boolean bPlotFlag, Ice.Current __current)
        throws NotInContextException;

    void setPortraitId(NWObject oTarget, int nPortraitId, Ice.Current __current)
        throws NotInContextException;

    void setPortraitResRef(NWObject oTarget, String sPortraitResRef, Ice.Current __current)
        throws NotInContextException;

    void setReflexSavingThrow(NWObject oObject, int nReflexSave, Ice.Current __current)
        throws NotInContextException;

    void setSkyBox(int nSkyBox, NWObject oArea, Ice.Current __current)
        throws NotInContextException;

    void setStandardFactionReputation(StandardFaction tStandardFaction, int nNewReputation, NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void setStolenFlag(NWObject oItem, boolean bStolenFlag, Ice.Current __current)
        throws NotInContextException;

    void setStoreGold(NWObject oidStore, int nGold, Ice.Current __current)
        throws NotInContextException;

    void setStoreIdentifyCost(NWObject oidStore, int nCost, Ice.Current __current)
        throws NotInContextException;

    void setStoreMaxBuyPrice(NWObject oidStore, int nMaxBuy, Ice.Current __current)
        throws NotInContextException;

    void setSubRace(NWObject oCreature, String sSubRace, Ice.Current __current)
        throws NotInContextException;

    void setTileMainLightColor(NWLocation lTileLocation, TileMainLightColor nMainLight1Color, TileMainLightColor nMainLight2Color, Ice.Current __current)
        throws NotInContextException;

    void setTileSourceLightColor(NWLocation lTileLocation, TileSourceLightColor nSourceLight1Color, TileSourceLightColor nSourceLight2Color, Ice.Current __current)
        throws NotInContextException;

    void setTime(int nHour, int nMinute, int nSecond, int nMillisecond, Ice.Current __current)
        throws NotInContextException;

    void setTrapActive(NWObject oTrapObject, boolean bActive, Ice.Current __current)
        throws NotInContextException;

    void setTrapDetectDC(NWObject oTrapObject, int nDetectDC, Ice.Current __current)
        throws NotInContextException;

    void setTrapDetectable(NWObject oTrapObject, boolean bDetectable, Ice.Current __current)
        throws NotInContextException;

    int setTrapDetectedBy(NWObject oTrap, NWObject oDetector, boolean bDetected, Ice.Current __current)
        throws NotInContextException;

    void setTrapDisabled(NWObject oTrap, Ice.Current __current)
        throws NotInContextException;

    void setTrapDisarmDC(NWObject oTrapObject, int nDisarmDC, Ice.Current __current)
        throws NotInContextException;

    void setTrapDisarmable(NWObject oTrapObject, boolean bDisarmable, Ice.Current __current)
        throws NotInContextException;

    void setTrapKeyTag(NWObject oTrapObject, String sKeyTag, Ice.Current __current)
        throws NotInContextException;

    void setTrapOneShot(NWObject oTrapObject, boolean bOneShot, Ice.Current __current)
        throws NotInContextException;

    void setTrapRecoverable(NWObject oTrapObject, boolean bRecoverable, Ice.Current __current)
        throws NotInContextException;

    void setUseableFlag(NWObject oPlaceable, boolean bUseableFlag, Ice.Current __current)
        throws NotInContextException;

    void setWeather(NWObject oTarget, Weather tWeather, Ice.Current __current)
        throws NotInContextException;

    void setWillSavingThrow(NWObject oObject, int nWillSave, Ice.Current __current)
        throws NotInContextException;

    void setXP(NWObject oCreature, int nXpAmount, Ice.Current __current)
        throws NotInContextException;

    void soundObjectPlay(NWObject oSound, Ice.Current __current)
        throws NotInContextException;

    void soundObjectSetPosition(NWObject oSound, NWVector vPosition, Ice.Current __current)
        throws NotInContextException;

    void soundObjectSetVolume(NWObject oSound, int nVolume, Ice.Current __current)
        throws NotInContextException;

    void soundObjectStop(NWObject oSound, Ice.Current __current)
        throws NotInContextException;

    void speakOneLinerConversation(String sDialogResRef, NWObject oTokenTarget, Ice.Current __current)
        throws NotInContextException;

    void speakString(String sStringToSpeak, TalkVolume tTalkVolume, Ice.Current __current)
        throws NotInContextException;

    void speakStringByStrRef(int nStrRef, TalkVolume tTalkVolume, Ice.Current __current)
        throws NotInContextException;

    void startNewModule(String sModuleName, Ice.Current __current)
        throws NotInContextException;

    void stopFade(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    void storeCameraFacing(Ice.Current __current)
        throws NotInContextException;

    int storeCampaignObject(String sCampaignName, String sVarName, NWObject oObject, NWObject oPlayer, Ice.Current __current)
        throws NotInContextException;

    void summonAnimalCompanion(NWObject oMaster, Ice.Current __current)
        throws NotInContextException;

    void summonFamiliar(NWObject oMaster, Ice.Current __current)
        throws NotInContextException;

    NWEffect supernaturalEffect(NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    void surrenderToEnemies(Ice.Current __current)
        throws NotInContextException;

    void takeGoldFromCreature(int nAmount, NWObject oCreatureToTakeFrom, boolean bDestroy, Ice.Current __current)
        throws NotInContextException;

    AttackResult touchAttackMelee(NWObject oTarget, boolean bDisplayFeedback, Ice.Current __current)
        throws NotInContextException;

    AttackResult touchAttackRanged(NWObject oTarget, boolean bDisplayFeedback, Ice.Current __current)
        throws NotInContextException;

    float turnsToSeconds(int nTurns, Ice.Current __current)
        throws NotInContextException;

    void unpossessFamiliar(NWObject oCreature, Ice.Current __current)
        throws NotInContextException;

    float vectorMagnitude(NWVector vVector, Ice.Current __current)
        throws NotInContextException;

    NWVector vectorNormalize(NWVector vVector, Ice.Current __current)
        throws NotInContextException;

    float vectorToAngle(NWVector vVector, Ice.Current __current)
        throws NotInContextException;

    NWEffect versusAlignmentEffect(NWEffect eEffect, int nLawChaos, int nGoodEvil, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    NWEffect versusRacialTypeEffect(NWEffect eEffect, RacialType tRacialType, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    NWEffect versusTrapEffect(NWEffect eEffect, Ice.Current __current)
        throws InvalidEffectException,
               NotInContextException;

    SavingThrowResult willSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus, Ice.Current __current)
        throws NotInContextException;

    void writeTimestampedLogEntry(String sLogEntry, Ice.Current __current)
        throws NotInContextException;
}
