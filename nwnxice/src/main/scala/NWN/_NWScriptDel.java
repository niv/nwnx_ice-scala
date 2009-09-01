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

public interface _NWScriptDel extends Ice._ObjectDel
{
    boolean hasState(String key, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    NWN.Persistable getState(String key, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               StateNotAvailableException;

    void putState(String key, NWN.Persistable state, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void delState(String key, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void clearState(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    NWObject[] allPCs(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect[] allEffects(NWObject o, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject[] allInArea(NWObject area, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject[] allByTag(String tag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject[] allInInventory(NWObject o, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWCreatureEquipped allEquipped(NWObject o, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty[] allItemProperties(NWObject item, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject[] allInShape(ShapeType tShapeType, double fSize, NWLocation lTarget, boolean bLineOfSight, ObjectType tObjectType, NWVector vOrigin, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject[] allInFaction(NWObject memberOf, boolean bPCOnly, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getEffectIconShown(NWEffect eff, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    void setEffectIconShown(NWEffect eff, boolean bShown, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    void actionAttack(NWObject oAttackee, boolean bPassive, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionCastFakeSpellAtLocation(int nSpell, NWLocation lTarget, ProjectilePathType tProjectilePathType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionCastFakeSpellAtObject(int nSpell, NWObject oTarget, ProjectilePathType tProjectilePathType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionCastSpellAtLocation(int nSpell, NWLocation lTargetLocation, MetaMagic tMetaMagic, boolean bCheat, ProjectilePathType tProjectilePathType, boolean bInstantSpell, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionCastSpellAtObject(int nSpell, NWObject oTarget, MetaMagic tMetaMagic, boolean bCheat, int nDomainLevel, ProjectilePathType tProjectilePathType, boolean bInstantSpell, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionCloseDoor(NWObject oDoor, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionCounterSpell(NWObject oCounterSpellTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionEquipItem(NWObject oItem, InventorySlot tInventorySlot, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionEquipMostDamagingMelee(NWObject oVersus, boolean bOffHand, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionEquipMostDamagingRanged(NWObject oVersus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionEquipMostEffectiveArmor(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionExamine(NWObject oExamine, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionForceFollowObject(NWObject oFollow, double fFollowDistance, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionForceMoveToLocation(NWLocation lDestination, boolean bRun, double fTimeout, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionForceMoveToObject(NWObject oMoveTo, boolean bRun, double fRange, double fTimeout, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionGiveItem(NWObject oItem, NWObject oGiveTo, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionInteractObject(NWObject oPlaceable, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionJumpToLocation(NWLocation lLocation, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionJumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionLockObject(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionMoveAwayFromLocation(NWLocation lMoveAwayFrom, boolean bRun, double fMoveAwayRange, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionMoveAwayFromObject(NWObject oFleeFrom, boolean bRun, double fMoveAwayRange, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionMoveToLocation(NWLocation lDestination, boolean bRun, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionMoveToObject(NWObject oMoveTo, boolean bRun, double fRange, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionOpenDoor(NWObject oDoor, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionPauseConversation(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionPickUpItem(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionPlayAnimation(int nAnimation, double fSpeed, double fDurationSeconds, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionPutDownItem(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionRandomWalk(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionRest(boolean bCreatureToEnemyLineOfSightCheck, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionResumeConversation(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionSit(NWObject oChair, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionSpeakString(String sStringToSpeak, TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionSpeakStringByStrRef(int nStrRef, TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionStartConversation(NWObject oObjectToConverseWith, String sDialogResRef, boolean bPrivateConversation, boolean bPlayHello, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionTakeItem(NWObject oItem, NWObject oTakeFrom, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionUnequipItem(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionUnlockObject(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionUseFeat(int nFeat, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionUseSkill(int nSkill, NWObject oTarget, int nSubSkill, NWObject oItemUsed, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void actionWait(double fSeconds, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void activatePortal(NWObject oTarget, String sIPaddress, String sPassword, String sWaypointTag, boolean bSeemless, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void addHenchman(NWObject oMaster, NWObject oHenchman, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void addItemProperty(DurationType tDurationType, NWItemProperty ipProperty, NWObject oItem, double fDuration, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    void addJournalQuestEntry(String szPlotID, int nState, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers, boolean bAllowOverrideHigher, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void addToParty(NWObject oPC, NWObject oPartyLeader, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void adjustAlignment(NWObject oSubject, Alignment tAlignment, int nShift, boolean bAllPartyMembers, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void adjustReputation(NWObject oTarget, NWObject oSourceFactionMember, int nAdjustment, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void ambientSoundChangeDay(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void ambientSoundChangeNight(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void ambientSoundPlay(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void ambientSoundSetDayVolume(NWObject oArea, int nVolume, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void ambientSoundSetNightVolume(NWObject oArea, int nVolume, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void ambientSoundStop(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWVector angleToVector(double fAngle, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void applyEffectAtLocation(DurationType tDurationType, NWEffect eEffect, NWLocation lLocation, double fDuration, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    void applyEffectToObject(DurationType tDurationType, NWEffect eEffect, NWObject oTarget, double fDuration, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    NWItemProperty badBadReplaceMeThisDoesNothing(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int beginConversation(String sResRef, NWObject oObjectToDialog, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void blackScreen(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void bootPC(NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void changeFaction(NWObject oObjectToChangeFaction, NWObject oMemberOfFactionToJoin, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void changeToStandardFaction(NWObject oCreatureToChange, StandardFaction tStandardFaction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void clearAllActions(boolean bClearCombatState, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void clearPersonalReputation(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject copyItem(NWObject oItem, NWObject oTargetInventory, boolean bCopyVars, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject copyItemAndModify(NWObject oItem, int nType, int nIndex, int nNewValue, boolean bCopyVars, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject copyObject(NWObject oSource, NWLocation locLocation, NWObject oOwner, String sNewTag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject createItemOnObject(String sItemTemplate, NWObject oTarget, int nStackSize, String sNewTag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject createObject(ObjectType tObjectType, String sTemplate, NWLocation lLocation, boolean bUseAppearAnimation, String sNewTag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject createTrapAtLocation(TrapType tTrapType, NWLocation lLocation, double fSize, String sTag, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void createTrapOnObject(TrapType tTrapType, NWObject oObject, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void dayToNight(NWObject oPlayer, double fTransitionTime, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void decrementRemainingFeatUses(NWObject oCreature, int nFeat, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void decrementRemainingSpellUses(NWObject oCreature, int nSpell, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void deleteCampaignVariable(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void deleteLocalFloat(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void deleteLocalInt(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void deleteLocalLocation(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void deleteLocalObject(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void deleteLocalString(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void destroyCampaignDatabase(String sCampaignName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void destroyObject(NWObject oDestroy, double fDelay, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void doDoorAction(NWObject oTargetDoor, DoorAction tDoorAction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void doPlaceableObjectAction(NWObject oPlaceable, PlaceableAction tPlaceableAction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void doSinglePlayerAutoSave(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void doWhirlwindAttack(boolean bDisplayFeedback, boolean bImproved, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectACDecrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectACIncrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectAbilityDecrease(Ability tAbility, int nModifyBy, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectAbilityIncrease(Ability tAbility, int nModifyBy, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectAppear(int nAnimation, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectAreaOfEffect(int nAreaEffectId, String sOnEnterScript, String sHeartbeatScript, String sOnExitScript, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectAttackDecrease(int nPenalty, AttackBonus tAttackBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectAttackIncrease(int nBonus, AttackBonus tAttackBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectBeam(int nBeamVisualEffect, NWObject oEffector, CreaturePart tCreaturePart, boolean bMissEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectBlindness(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectCharmed(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectConcealment(int nPercentage, MissChanceType tMissChanceType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectConfused(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectCurse(int nStrMod, int nDexMod, int nConMod, int nIntMod, int nWisMod, int nChaMod, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectCutsceneDominated(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectCutsceneGhost(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectCutsceneImmobilize(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectCutsceneParalyze(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDamage(int nDamageAmount, DamageType tDamageType, DamagePower tDamagePower, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDamageDecrease(int nPenalty, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDamageImmunityDecrease(DamageType tDamageType, int nPercentImmunity, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDamageImmunityIncrease(DamageType tDamageType, int nPercentImmunity, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDamageIncrease(int nBonus, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDamageReduction(int nAmount, DamagePower tDamagePower, int nLimit, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDamageResistance(DamageType tDamageType, int nAmount, int nLimit, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDamageShield(int nDamageAmount, int nRandomAmount, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDarkness(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDazed(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDeaf(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDeath(boolean bSpectacularDeath, boolean bDisplayFeedback, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDisappear(int nAnimation, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDisappearAppear(NWLocation lLocation, int nAnimation, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDisease(int nDiseaseType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDispelMagicAll(int nCasterLevel, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDispelMagicBest(int nCasterLevel, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectDominated(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectEntangle(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectEthereal(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectFrightened(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectHaste(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectHeal(int nDamageToHeal, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectHitPointChangeWhenDying(double fHitPointChangePerRound, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectImmunity(ImmunityType tImmunityType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectInvisibility(int nInvisibilityType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectKnockdown(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectLinkEffects(NWEffect eChildEffect, NWEffect eParentEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    NWEffect effectMissChance(int nPercentage, MissChanceType tMissChanceType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectModifyAttacks(int nAttacks, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectMovementSpeedDecrease(int nPercentChange, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectMovementSpeedIncrease(int nPercentChange, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectNegativeLevel(int nNumLevels, boolean bHPBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectParalyze(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectPetrify(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectPoison(int nPoisonType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectPolymorph(int nPolymorphSelection, boolean bLocked, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectRegenerate(int nAmount, double fIntervalSeconds, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectResurrection(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSanctuary(int nDifficultyClass, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSavingThrowDecrease(int nSave, int nValue, SaveType tSaveType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSavingThrowIncrease(int nSave, int nValue, SaveType tSaveType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSeeInvisible(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSilence(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSkillDecrease(int nSkill, int nValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSkillIncrease(int nSkill, int nValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSleep(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSlow(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSpellFailure(int nPercent, SpellSchool tSpellSchool, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSpellImmunity(int nImmunityToSpell, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSpellLevelAbsorption(int nMaxSpellLevelAbsorbed, int nTotalSpellLevelsAbsorbed, SpellSchool tSpellSchool, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSpellResistanceDecrease(int nValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSpellResistanceIncrease(int nValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectStunned(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSummonCreature(String sCreatureResref, int nVisualEffectId, double fDelaySeconds, boolean bUseAppearAnimation, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectSwarm(boolean bLooping, String sCreatureTemplate1, String sCreatureTemplate2, String sCreatureTemplate3, String sCreatureTemplate4, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectTemporaryHitpoints(int nHitPoints, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectTimeStop(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectTrueSeeing(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectTurnResistanceDecrease(int nHitDice, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectTurnResistanceIncrease(int nHitDice, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectTurned(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectUltravision(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect effectVisualEffect(int nVisualEffectId, boolean bMissEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void endGame(String sEndMovie, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void executeScript(String sScript, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void exploreAreaForPlayer(NWObject oArea, NWObject oPlayer, boolean bExplored, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void exportAllCharacters(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void exportSingleCharacter(NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect extraordinaryEffect(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    void fadeFromBlack(NWObject oCreature, double fSpeed, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void fadeToBlack(NWObject oCreature, double fSpeed, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void floatingTextStrRefOnCreature(int nStrRefToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void floatingTextStringOnCreature(String sStringToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void forceRest(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    SavingThrowResult fortitudeSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String get2DAString(String s2DA, String sColumn, int nRow, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getAC(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    AILevel getAILevel(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getAbilityModifier(Ability tAbility, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getAbilityScore(NWObject oCreature, Ability tAbility, boolean bBaseAbilityScore, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getActionMode(NWObject oCreature, ActionMode tActionMode, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getAge(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    Alignment getAlignmentGoodEvil(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    Alignment getAlignmentLawChaos(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getAnimalCompanionCreatureType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getAnimalCompanionName(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getAppearanceType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getArcaneSpellFailure(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getArea(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getAreaOfEffectCreator(NWObject oAreaOfEffectObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getAreaSize(int nAreaDimension, NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getAssociate(AssociateType tAssociateType, NWObject oMaster, int nTh, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    AssociateType getAssociateType(NWObject oAssociate, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getAttackTarget(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getAttemptedAttackTarget(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getAttemptedSpellTarget(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getBaseAttackBonus(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getBaseItemType(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getBlockingDoor(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCalendarDay(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCalendarMonth(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCalendarYear(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getCampaignFloat(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCampaignInt(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWLocation getCampaignLocation(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getCampaignString(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWVector getCampaignVector(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCasterLevel(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getChallengeRating(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getClassByPosition(int nClassPosition, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getClickingObject(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getColor(NWObject oObject, int nColorChannel, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getCommandable(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCreatureBodyPart(CreaturePart tCreaturePart, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    CreatureSize getCreatureSize(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCreatureStartingPackage(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCreatureTailType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCreatureWingType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    Action getCurrentAction(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getCurrentHitPoints(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getCutsceneCameraMoveRate(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getCutsceneMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getDamageDealtByType(DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getDefensiveCastingMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getDeity(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getDescription(NWObject oObject, boolean bOriginalDescription, boolean bIdentifiedDescription, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getDetectMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getDialogSoundLength(int nStrRef, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getDistanceBetween(NWObject oObjectA, NWObject oObjectB, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getDistanceBetweenLocations(NWLocation lLocationA, NWLocation lLocationB, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getDistanceToObject(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getDroppableFlag(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getEffectCreator(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    DurationType getEffectDurationType(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    int getEffectSpellId(NWEffect eSpellEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    EffectSubType getEffectSubType(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    EffectType getEffectType(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    int getEncounterActive(NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getEncounterDifficulty(NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getEncounterSpawnsCurrent(NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getEncounterSpawnsMax(NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getEnteringObject(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getExitingObject(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getFacing(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFactionAverageGoodEvilAlignment(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFactionAverageLawChaosAlignment(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFactionAverageLevel(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFactionAverageReputation(NWObject oSourceFactionMember, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFactionAverageXP(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getFactionBestAC(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getFactionEqual(NWObject oFirstObject, NWObject oSecondObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFactionGold(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getFactionLeader(NWObject oMemberOfFaction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getFactionLeastDamagedMember(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getFactionMostDamagedMember(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFactionMostFrequentClass(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getFactionStrongestMember(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getFactionWeakestMember(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getFactionWorstAC(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFamiliarCreatureType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getFamiliarName(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFogAmount(int nFogType, NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFogColor(int nFogType, NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFootstepType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getFortitudeSavingThrow(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getGameDifficulty(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    Gender getGender(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getGoingToBeAttackedBy(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getGold(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getGoldPieceValue(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getGoodEvilValue(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getHardness(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getHasFeat(int nFeat, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getHasFeatEffect(int nFeat, NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getHasInventory(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getHasSkill(int nSkill, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getHasSpell(int nSpell, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getHasSpellEffect(int nSpell, NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getHenchman(NWObject oMaster, int nNth, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getHitDice(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIdentified(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getImmortal(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getInfiniteFlag(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getInventoryDisturbItem(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getInventoryDisturbType(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsAreaAboveGround(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsAreaInterior(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsAreaNatural(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsCreatureDisarmable(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsDM(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsDMPossessed(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsDawn(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsDay(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsDead(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsDoorActionPossible(NWObject oTargetDoor, DoorAction tDoorAction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsDusk(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsEffectValid(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    boolean getIsEncounterCreature(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsEnemy(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsFriend(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsImmune(NWObject oCreature, ImmunityType tImmunityType, NWObject oVersus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsInCombat(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsInSubArea(NWObject oCreature, NWObject oSubArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsItemPropertyValid(NWItemProperty ipProperty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    boolean getIsListening(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsNeutral(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsNight(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsObjectValid(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsOpen(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsPC(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsPlaceableObjectActionPossible(NWObject oPlaceable, PlaceableAction tPlaceableAction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsPlayableRacialType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsPossessedFamiliar(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsReactionTypeFriendly(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsReactionTypeHostile(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsReactionTypeNeutral(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsResting(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsSkillSuccessful(NWObject oTarget, int nSkill, int nDifficulty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsTrapped(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getIsWeaponEffective(NWObject oVersus, boolean bOffHand, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getItemACValue(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getItemActivated(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getItemActivatedTarget(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWLocation getItemActivatedTargetLocation(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getItemActivator(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getItemAppearance(NWObject oItem, int nType, int nIndex, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getItemCharges(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getItemCursedFlag(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getItemHasItemProperty(NWObject oItem, int nProperty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getItemInSlot(InventorySlot tInventorySlot, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getItemPossessedBy(NWObject oCreature, String sItemTag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getItemPossessor(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getItemPropertyCostTable(NWItemProperty iProp, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyCostTableValue(NWItemProperty iProp, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    DurationType getItemPropertyDurationType(NWItemProperty ip, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyParam1(NWItemProperty iProp, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyParam1Value(NWItemProperty iProp, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertySubType(NWItemProperty iProperty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    int getItemPropertyType(NWItemProperty ip, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    int getItemStackSize(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getJournalQuestExperience(String szPlotID, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getKeyRequiredFeedback(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    AssociateCommand getLastAssociateCommand(NWObject oAssociate, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    CombatMode getLastAttackMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    SpecialAttack getLastAttackType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastAttacker(NWObject oAttackee, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastClosedBy(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastDamager(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastDisarmed(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastDisturbed(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastHostileActor(NWObject oVictim, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastKiller(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastLocked(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastOpenedBy(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastPCRested(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastPCToCancelCutscene(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastPerceived(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getLastPerceptionHeard(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getLastPerceptionInaudible(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getLastPerceptionSeen(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getLastPerceptionVanished(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastPlayerDied(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastPlayerDying(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastRespawnButtonPresser(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getLastRestEventType(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastSpeaker(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getLastSpell(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getLastSpellCastClass(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastSpellCaster(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getLastSpellHarmful(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastTrapDetected(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastUnlocked(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastUsedBy(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLastWeaponUsed(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getLawChaosValue(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getLevelByClass(int nClassType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getLevelByPosition(int nClassPosition, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getListenPatternNumber(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getLocalFloat(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getLocalInt(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWLocation getLocalLocation(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getLocalObject(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getLocalString(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWLocation getLocation(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getLockKeyRequired(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getLockKeyTag(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getLockLockDC(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getLockLockable(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getLockUnlockDC(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getLocked(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getLootable(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getMaster(NWObject oAssociate, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getMatchedSubstring(int nString, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getMatchedSubstringsCount(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getMaxHenchmen(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getMaxHitPoints(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    MetaMagic getMetaMagicFeat(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getModule(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getModuleItemAcquired(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getModuleItemAcquiredBy(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getModuleItemAcquiredFrom(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getModuleItemAcquiredStackSize(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getModuleItemLost(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getModuleItemLostBy(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getModuleName(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getModuleXPScale(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getMovementRate(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getName(NWObject oObject, boolean bOriginalName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getNearestCreature(int nFirstCriteriaType, int nFirstCriteriaValue, NWObject oTarget, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getNearestCreatureToLocation(int nFirstCriteriaType, int nFirstCriteriaValue, NWLocation lLocation, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getNearestObject(ObjectType tObjectType, NWObject oTarget, int nNth, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getNearestObjectByTag(String sTag, NWObject oTarget, int nNth, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getNearestObjectToLocation(ObjectType tObjectType, NWLocation lLocation, int nNth, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getNearestTrapToObject(NWObject oTarget, boolean bTrapDetected, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getNumStackedItems(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getObjectByTag(String sTag, int nNth, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getObjectHeard(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getObjectSeen(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    ObjectType getObjectType(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getPCChatMessage(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getPCChatSpeaker(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getPCChatVolume(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getPCIPAddress(NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getPCItemLastEquipped(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getPCItemLastEquippedBy(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getPCItemLastUnequipped(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getPCItemLastUnequippedBy(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getPCLevellingUp(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getPCPlayerName(NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getPCPublicCDKey(NWObject oPlayer, boolean bSinglePlayerCDKey, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getPCSpeaker(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    PhenoType getPhenoType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getPickpocketableFlag(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getPlaceableIllumination(NWObject oPlaceable, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getPlaceableLastClickedBy(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getPlotFlag(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getPortraitId(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getPortraitResRef(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWVector getPosition(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    RacialType getRacialType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getReflexAdjustedDamage(int nDamage, NWObject oTarget, int nDC, SaveType tSaveType, NWObject oSaveVersus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getReflexSavingThrow(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getReputation(NWObject oSource, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getResRef(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getSittingCreature(NWObject oChair, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getSkillRank(int nSkill, NWObject oTarget, boolean bBaseSkillRank, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getSkyBox(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getSpellCastItem(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getSpellId(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getSpellResistance(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getSpellSaveDC(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWLocation getSpellTargetLocation(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getSpellTargetObject(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getStandardFactionReputation(StandardFaction tStandardFaction, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWLocation getStartingLocation(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getStealthMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getStolenFlag(NWObject oStolen, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getStoreGold(NWObject oidStore, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getStoreIdentifyCost(NWObject oidStore, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getStoreMaxBuyPrice(NWObject oidStore, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double getStrRefSoundDuration(int nStrRef, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getStringByStrRef(int nStrRef, Gender tGender, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getSubRace(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getTag(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    TileMainLightColor getTileMainLight1Color(NWLocation lTile, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    TileMainLightColor getTileMainLight2Color(NWLocation lTile, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    TileSourceLightColor getTileSourceLight1Color(NWLocation lTile, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    TileSourceLightColor getTileSourceLight2Color(NWLocation lTile, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getTilesetResRef(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getTimeHour(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getTimeMillisecond(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getTimeMinute(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getTimeSecond(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getTotalDamageDealt(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getTransitionTarget(NWObject oTransition, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getTrapActive(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getTrapBaseType(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getTrapCreator(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getTrapDetectDC(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getTrapDetectable(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getTrapDetectedBy(NWObject oTrapObject, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getTrapDisarmDC(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getTrapDisarmable(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getTrapFlagged(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String getTrapKeyTag(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getTrapOneShot(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getTrapRecoverable(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getTurnResistanceHD(NWObject oUndead, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getUseableFlag(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getUserDefinedEventNumber(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject getWaypointByTag(String sWaypointTag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean getWeaponRanged(NWObject oItem, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    Weather getWeather(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getWeight(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getWillSavingThrow(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int getXP(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void giveGoldToCreature(NWObject oCreature, int nGP, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void giveXPToCreature(NWObject oCreature, int nXpAmount, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double hoursToSeconds(int nHours, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void incrementRemainingFeatUses(NWObject oCreature, int nFeat, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    boolean isInConversation(NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyACBonus(int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyACBonusVsAlign(IPAlignGroup tIPAlignGroup, int nACBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyACBonusVsDmgType(IPDamageType tIPDamageType, int nACBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyACBonusVsRace(IPRacialType tIPRacialType, int nACBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyACBonusVsSAlign(Alignment tAlignment, int nACBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyAbilityBonus(Ability tAbility, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyAdditional(int nAdditionalProperty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyArcaneSpellFailure(int nModLevel, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyAttackBonus(int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyAttackBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyAttackBonusVsRace(IPRacialType tIPRacialType, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyAttackBonusVsSAlign(Alignment tAlignment, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyAttackPenalty(int nPenalty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyBonusFeat(int nFeat, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyBonusLevelSpell(int nClass, int nSpellLevel, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyBonusSavingThrow(int nBaseSaveType, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyBonusSavingThrowVsX(int nBonusType, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyBonusSpellResistance(int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyCastSpell(int nSpell, int nNumUses, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyContainerReducedWeight(int nContainerType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDamageBonus(IPDamageType tIPDamageType, int nDamage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDamageBonusVsAlign(IPAlignGroup tIPAlignGroup, IPDamageType tIPDamageType, int nDamage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDamageBonusVsRace(IPRacialType tIPRacialType, IPDamageType tIPDamageType, int nDamage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDamageBonusVsSAlign(Alignment tAlignment, IPDamageType tIPDamageType, int nDamage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDamageImmunity(IPDamageType tIPDamageType, int nImmuneBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDamagePenalty(int nPenalty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDamageReduction(int nEnhancement, int nHPSoak, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDamageResistance(IPDamageType tIPDamageType, int nHPResist, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDamageVulnerability(IPDamageType tIPDamageType, int nVulnerability, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDarkvision(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDecreaseAC(int nModifierType, int nPenalty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDecreaseAbility(Ability tAbility, int nModifier, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyDecreaseSkill(int nSkill, int nPenalty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyEnhancementBonus(int nEnhancementBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyEnhancementBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyEnhancementBonusVsRace(IPRacialType tIPRacialType, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyEnhancementBonusVsSAlign(Alignment tAlignment, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyEnhancementPenalty(int nPenalty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyExtraMeleeDamageType(IPDamageType tIPDamageType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyExtraRangeDamageType(IPDamageType tIPDamageType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyFreeAction(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyHaste(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyHealersKit(int nModifier, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyHolyAvenger(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyImmunityMisc(IPMiscImmunityType tIPMiscImmunityType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyImmunityToSpellLevel(int nLevel, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyImprovedEvasion(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyKeen(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyLight(int nBrightness, int nColor, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyLimitUseByAlign(IPAlignGroup tIPAlignGroup, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyLimitUseByClass(int nClass, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyLimitUseByRace(IPRacialType tIPRacialType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyLimitUseBySAlign(Alignment tAlignment, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyMassiveCritical(int nDamage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyMaterial(int nMaterialType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyMaxRangeStrengthMod(int nModifier, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyMonsterDamage(int nDamage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyNoDamage(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyOnHitCastSpell(int nSpell, int nLevel, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyOnHitProps(int nProperty, int nSaveDC, int nSpecial, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyOnMonsterHitProperties(int nProperty, int nSpecial, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyQuality(int nQuality, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyReducedSavingThrow(int nBonusType, int nPenalty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyReducedSavingThrowVsX(int nBaseSaveType, int nPenalty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyRegeneration(int nRegenAmount, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertySkillBonus(int nSkill, int nBonus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertySpecialWalk(int nWalkType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertySpellImmunitySchool(IPSpellSchool tIPSpellSchool, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertySpellImmunitySpecific(int nSpell, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyThievesTools(int nModifier, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyTrap(int nTrapLevel, IPTrapType tIPTrapType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyTrueSeeing(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyTurnResistance(int nModifier, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyUnlimitedAmmo(int nAmmoDamage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyVampiricRegeneration(int nRegenAmount, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyVisualEffect(int nEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyWeightIncrease(int nWeight, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWItemProperty itemPropertyWeightReduction(int nReduction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void jumpToLocation(NWLocation lDestination, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void jumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int levelUpHenchman(NWObject oCreature, int nClass, boolean bReadyAllSpells, int nPackage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int lineOfSightObject(NWObject oSource, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int lineOfSightVector(NWVector vSource, NWVector vTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void lockCameraDirection(NWObject oPlayer, boolean bLocked, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void lockCameraDistance(NWObject oPlayer, boolean bLocked, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void lockCameraPitch(NWObject oPlayer, boolean bLocked, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect magicalEffect(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    void musicBackgroundChangeDay(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void musicBackgroundChangeNight(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int musicBackgroundGetBattleTrack(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int musicBackgroundGetDayTrack(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int musicBackgroundGetNightTrack(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void musicBackgroundPlay(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void musicBackgroundSetDelay(NWObject oArea, int nDelay, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void musicBackgroundStop(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void musicBattleChange(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void musicBattlePlay(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void musicBattleStop(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void nightToDay(NWObject oPlayer, double fTransitionTime, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void openInventory(NWObject oCreature, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void openStore(NWObject oStore, NWObject oPC, int nBonusMarkUp, int nBonusMarkDown, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void playAnimation(int nAnimation, double fSpeed, double fSeconds, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void playSound(String sSoundName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void playSoundByStrRef(int nStrRef, int nRunAsAction, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void playVoiceChat(int nVoiceChatID, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void popUpDeathGUIPanel(NWObject oPC, boolean bRespawnButtonEnabled, boolean bWaitForHelpButtonEnabled, int nHelpStringReference, String sHelpString, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void popUpGUIPanel(NWObject oPC, int nGUIPanel, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    String randomName(int nNameType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void recomputeStaticLighting(NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    SavingThrowResult reflexSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void removeEffect(NWObject oCreature, NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    void removeFromParty(NWObject oPC, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void removeHenchman(NWObject oMaster, NWObject oHenchman, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void removeItemProperty(NWObject oItem, NWItemProperty ipProperty, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidItemPropertyException,
               NotInContextException;

    void removeJournalQuestEntry(String szPlotID, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void removeSummonedAssociate(NWObject oMaster, NWObject oAssociate, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int resistSpell(NWObject oCaster, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void restoreBaseAttackBonus(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void restoreCameraFacing(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWObject retrieveCampaignObject(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oOwner, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double roundsToSeconds(int nRounds, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void sendMessageToAllDMs(String szMessage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void sendMessageToPC(NWObject oPlayer, String szMessage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void sendMessageToPCByStrRef(NWObject oPlayer, int nStrRef, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setAILevel(NWObject oTarget, AILevel tAILevel, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setActionMode(NWObject oCreature, ActionMode tActionMode, boolean bStatus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setAreaTransitionBMP(int nPredefinedAreaTransition, String sCustomAreaTransitionBMP, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setAssociateListenPatterns(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setBaseAttackBonus(int nBaseAttackBonus, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCalendar(int nYear, int nMonth, int nDay, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCameraFacing(double fDirection, double fDistance, double fPitch, int nTransitionType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCameraHeight(NWObject oPlayer, double fHeight, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCameraMode(NWObject oPlayer, int nCameraMode, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCampaignFloat(String sCampaignName, String sVarName, double flFloat, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCampaignInt(String sCampaignName, String sVarName, int nInt, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCampaignLocation(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCampaignString(String sCampaignName, String sVarName, String sString, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCampaignVector(String sCampaignName, String sVarName, NWVector vVector, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setColor(NWObject oObject, int nColorChannel, int nColorValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCommandable(boolean bCommandable, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCreatureAppearanceType(NWObject oCreature, int nAppearanceType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCreatureBodyPart(CreaturePart tCreaturePart, int nModelNumber, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCreatureTailType(int nTailType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCreatureWingType(int nWingType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCustomToken(int nCustomTokenNumber, String sTokenValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCutsceneCameraMoveRate(NWObject oCreature, double fRate, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setCutsceneMode(NWObject oCreature, boolean bInCutscene, boolean bLeftClickingEnabled, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setDeity(NWObject oCreature, String sDeity, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setDescription(NWObject oObject, String sNewDescription, boolean bIdentifiedDescription, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setDroppableFlag(NWObject oItem, boolean bDroppable, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setEncounterActive(boolean bNewValue, NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setEncounterDifficulty(int nEncounterDifficulty, NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setEncounterSpawnsCurrent(int nNewValue, NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setEncounterSpawnsMax(int nNewValue, NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setFacing(double fDirection, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setFacingPoint(NWVector vTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setFogAmount(int nFogType, int nFogAmount, NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setFogColor(int nFogType, int nFogColor, NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setFootstepType(int nFootstepType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setFortitudeSavingThrow(NWObject oObject, int nFortitudeSave, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setHardness(int nHardness, NWObject oObject, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setIdentified(NWObject oItem, boolean bIdentified, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setImmortal(NWObject oCreature, boolean bImmortal, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setInfiniteFlag(NWObject oItem, boolean bInfinite, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setIsDestroyable(boolean bDestroyable, boolean bRaiseable, boolean bSelectableWhenDead, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setIsTemporaryEnemy(NWObject oTarget, NWObject oSource, boolean bDecays, double fDurationInSeconds, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setIsTemporaryFriend(NWObject oTarget, NWObject oSource, boolean bDecays, double fDurationInSeconds, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setIsTemporaryNeutral(NWObject oTarget, NWObject oSource, boolean bDecays, double fDurationInSeconds, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setItemCharges(NWObject oItem, int nCharges, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setItemCursedFlag(NWObject oItem, boolean bCursed, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setItemStackSize(NWObject oItem, int nSize, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setKeyRequiredFeedback(NWObject oObject, String sFeedbackMessage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setListenPattern(NWObject oObject, String sPattern, int nNumber, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setListening(NWObject oObject, boolean bValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLocalFloat(NWObject oObject, String sVarName, double fValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLocalInt(NWObject oObject, String sVarName, int nValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLocalLocation(NWObject oObject, String sVarName, NWLocation lValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLocalObject(NWObject oObject, String sVarName, NWObject oValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLocalString(NWObject oObject, String sVarName, String sValue, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLockKeyRequired(NWObject oObject, boolean bKeyRequired, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLockKeyTag(NWObject oObject, String sNewKeyTag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLockLockDC(NWObject oObject, int nNewLockDC, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLockLockable(NWObject oObject, boolean bLockable, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLockUnlockDC(NWObject oObject, int nNewUnlockDC, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLocked(NWObject oTarget, boolean bLocked, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setLootable(NWObject oCreature, boolean bLootable, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setMapPinEnabled(NWObject oMapPin, boolean bEnabled, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setMaxHenchmen(int nNumHenchmen, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setModuleXPScale(int nXPScale, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setName(NWObject oObject, String sNewName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPCChatMessage(String sNewChatMessage, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPCChatVolume(TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPCDislike(NWObject oPlayer, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPCLike(NWObject oPlayer, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPanelButtonFlash(NWObject oPlayer, Button tButton, boolean bEnableFlash, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPhenoType(PhenoType tPhenoType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPickpocketableFlag(NWObject oItem, boolean bPickpocketable, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPlaceableIllumination(NWObject oPlaceable, boolean bIlluminate, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPlotFlag(NWObject oTarget, boolean bPlotFlag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPortraitId(NWObject oTarget, int nPortraitId, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setPortraitResRef(NWObject oTarget, String sPortraitResRef, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setReflexSavingThrow(NWObject oObject, int nReflexSave, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setSkyBox(int nSkyBox, NWObject oArea, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setStandardFactionReputation(StandardFaction tStandardFaction, int nNewReputation, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setStolenFlag(NWObject oItem, boolean bStolenFlag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setStoreGold(NWObject oidStore, int nGold, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setStoreIdentifyCost(NWObject oidStore, int nCost, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setStoreMaxBuyPrice(NWObject oidStore, int nMaxBuy, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setSubRace(NWObject oCreature, String sSubRace, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTileMainLightColor(NWLocation lTileLocation, TileMainLightColor nMainLight1Color, TileMainLightColor nMainLight2Color, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTileSourceLightColor(NWLocation lTileLocation, TileSourceLightColor nSourceLight1Color, TileSourceLightColor nSourceLight2Color, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTime(int nHour, int nMinute, int nSecond, int nMillisecond, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTrapActive(NWObject oTrapObject, boolean bActive, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTrapDetectDC(NWObject oTrapObject, int nDetectDC, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTrapDetectable(NWObject oTrapObject, boolean bDetectable, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int setTrapDetectedBy(NWObject oTrap, NWObject oDetector, boolean bDetected, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTrapDisabled(NWObject oTrap, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTrapDisarmDC(NWObject oTrapObject, int nDisarmDC, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTrapDisarmable(NWObject oTrapObject, boolean bDisarmable, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTrapKeyTag(NWObject oTrapObject, String sKeyTag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTrapOneShot(NWObject oTrapObject, boolean bOneShot, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setTrapRecoverable(NWObject oTrapObject, boolean bRecoverable, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setUseableFlag(NWObject oPlaceable, boolean bUseableFlag, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setWeather(NWObject oTarget, Weather tWeather, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setWillSavingThrow(NWObject oObject, int nWillSave, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void setXP(NWObject oCreature, int nXpAmount, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void soundObjectPlay(NWObject oSound, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void soundObjectSetPosition(NWObject oSound, NWVector vPosition, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void soundObjectSetVolume(NWObject oSound, int nVolume, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void soundObjectStop(NWObject oSound, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void speakOneLinerConversation(String sDialogResRef, NWObject oTokenTarget, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void speakString(String sStringToSpeak, TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void speakStringByStrRef(int nStrRef, TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void startNewModule(String sModuleName, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void stopFade(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void storeCameraFacing(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    int storeCampaignObject(String sCampaignName, String sVarName, NWObject oObject, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void summonAnimalCompanion(NWObject oMaster, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void summonFamiliar(NWObject oMaster, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect supernaturalEffect(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    void surrenderToEnemies(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void takeGoldFromCreature(int nAmount, NWObject oCreatureToTakeFrom, boolean bDestroy, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    AttackResult touchAttackMelee(NWObject oTarget, boolean bDisplayFeedback, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    AttackResult touchAttackRanged(NWObject oTarget, boolean bDisplayFeedback, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double turnsToSeconds(int nTurns, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void unpossessFamiliar(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double vectorMagnitude(NWVector vVector, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWVector vectorNormalize(NWVector vVector, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    double vectorToAngle(NWVector vVector, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    NWEffect versusAlignmentEffect(NWEffect eEffect, int nLawChaos, int nGoodEvil, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    NWEffect versusRacialTypeEffect(NWEffect eEffect, RacialType tRacialType, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    NWEffect versusTrapEffect(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               InvalidEffectException,
               NotInContextException;

    SavingThrowResult willSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;

    void writeTimestampedLogEntry(String sLogEntry, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               NotInContextException;
}
