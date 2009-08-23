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

public abstract class _NWScriptDisp extends Ice.ObjectImpl implements NWScript
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::NWN::NWScript"
    };

    public boolean
    ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean
    ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[]
    ice_ids()
    {
        return __ids;
    }

    public String[]
    ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String
    ice_id()
    {
        return __ids[1];
    }

    public String
    ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String
    ice_staticId()
    {
        return __ids[1];
    }

    public final void
    actionAttack(NWObject oAttackee, boolean bPassive)
        throws NotInContextException
    {
        actionAttack(oAttackee, bPassive, null);
    }

    public final void
    actionCastFakeSpellAtLocation(int nSpell, NWLocation lTarget, ProjectilePathType tProjectilePathType)
        throws NotInContextException
    {
        actionCastFakeSpellAtLocation(nSpell, lTarget, tProjectilePathType, null);
    }

    public final void
    actionCastFakeSpellAtObject(int nSpell, NWObject oTarget, ProjectilePathType tProjectilePathType)
        throws NotInContextException
    {
        actionCastFakeSpellAtObject(nSpell, oTarget, tProjectilePathType, null);
    }

    public final void
    actionCastSpellAtLocation(int nSpell, NWLocation lTargetLocation, MetaMagic tMetaMagic, boolean bCheat, ProjectilePathType tProjectilePathType, boolean bInstantSpell)
        throws NotInContextException
    {
        actionCastSpellAtLocation(nSpell, lTargetLocation, tMetaMagic, bCheat, tProjectilePathType, bInstantSpell, null);
    }

    public final void
    actionCastSpellAtObject(int nSpell, NWObject oTarget, MetaMagic tMetaMagic, boolean bCheat, int nDomainLevel, ProjectilePathType tProjectilePathType, boolean bInstantSpell)
        throws NotInContextException
    {
        actionCastSpellAtObject(nSpell, oTarget, tMetaMagic, bCheat, nDomainLevel, tProjectilePathType, bInstantSpell, null);
    }

    public final void
    actionCloseDoor(NWObject oDoor)
        throws NotInContextException
    {
        actionCloseDoor(oDoor, null);
    }

    public final void
    actionCounterSpell(NWObject oCounterSpellTarget)
        throws NotInContextException
    {
        actionCounterSpell(oCounterSpellTarget, null);
    }

    public final void
    actionEquipItem(NWObject oItem, InventorySlot tInventorySlot)
        throws NotInContextException
    {
        actionEquipItem(oItem, tInventorySlot, null);
    }

    public final void
    actionEquipMostDamagingMelee(NWObject oVersus, boolean bOffHand)
        throws NotInContextException
    {
        actionEquipMostDamagingMelee(oVersus, bOffHand, null);
    }

    public final void
    actionEquipMostDamagingRanged(NWObject oVersus)
        throws NotInContextException
    {
        actionEquipMostDamagingRanged(oVersus, null);
    }

    public final void
    actionEquipMostEffectiveArmor()
        throws NotInContextException
    {
        actionEquipMostEffectiveArmor(null);
    }

    public final void
    actionExamine(NWObject oExamine)
        throws NotInContextException
    {
        actionExamine(oExamine, null);
    }

    public final void
    actionForceFollowObject(NWObject oFollow, double fFollowDistance)
        throws NotInContextException
    {
        actionForceFollowObject(oFollow, fFollowDistance, null);
    }

    public final void
    actionForceMoveToLocation(NWLocation lDestination, boolean bRun, double fTimeout)
        throws NotInContextException
    {
        actionForceMoveToLocation(lDestination, bRun, fTimeout, null);
    }

    public final void
    actionForceMoveToObject(NWObject oMoveTo, boolean bRun, double fRange, double fTimeout)
        throws NotInContextException
    {
        actionForceMoveToObject(oMoveTo, bRun, fRange, fTimeout, null);
    }

    public final void
    actionGiveItem(NWObject oItem, NWObject oGiveTo)
        throws NotInContextException
    {
        actionGiveItem(oItem, oGiveTo, null);
    }

    public final void
    actionInteractObject(NWObject oPlaceable)
        throws NotInContextException
    {
        actionInteractObject(oPlaceable, null);
    }

    public final void
    actionJumpToLocation(NWLocation lLocation)
        throws NotInContextException
    {
        actionJumpToLocation(lLocation, null);
    }

    public final void
    actionJumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint)
        throws NotInContextException
    {
        actionJumpToObject(oToJumpTo, bWalkStraightLineToPoint, null);
    }

    public final void
    actionLockObject(NWObject oTarget)
        throws NotInContextException
    {
        actionLockObject(oTarget, null);
    }

    public final void
    actionMoveAwayFromLocation(NWLocation lMoveAwayFrom, boolean bRun, double fMoveAwayRange)
        throws NotInContextException
    {
        actionMoveAwayFromLocation(lMoveAwayFrom, bRun, fMoveAwayRange, null);
    }

    public final void
    actionMoveAwayFromObject(NWObject oFleeFrom, boolean bRun, double fMoveAwayRange)
        throws NotInContextException
    {
        actionMoveAwayFromObject(oFleeFrom, bRun, fMoveAwayRange, null);
    }

    public final void
    actionMoveToLocation(NWLocation lDestination, boolean bRun)
        throws NotInContextException
    {
        actionMoveToLocation(lDestination, bRun, null);
    }

    public final void
    actionMoveToObject(NWObject oMoveTo, boolean bRun, double fRange)
        throws NotInContextException
    {
        actionMoveToObject(oMoveTo, bRun, fRange, null);
    }

    public final void
    actionOpenDoor(NWObject oDoor)
        throws NotInContextException
    {
        actionOpenDoor(oDoor, null);
    }

    public final void
    actionPauseConversation()
        throws NotInContextException
    {
        actionPauseConversation(null);
    }

    public final void
    actionPickUpItem(NWObject oItem)
        throws NotInContextException
    {
        actionPickUpItem(oItem, null);
    }

    public final void
    actionPlayAnimation(int nAnimation, double fSpeed, double fDurationSeconds)
        throws NotInContextException
    {
        actionPlayAnimation(nAnimation, fSpeed, fDurationSeconds, null);
    }

    public final void
    actionPutDownItem(NWObject oItem)
        throws NotInContextException
    {
        actionPutDownItem(oItem, null);
    }

    public final void
    actionRandomWalk()
        throws NotInContextException
    {
        actionRandomWalk(null);
    }

    public final void
    actionRest(boolean bCreatureToEnemyLineOfSightCheck)
        throws NotInContextException
    {
        actionRest(bCreatureToEnemyLineOfSightCheck, null);
    }

    public final void
    actionResumeConversation()
        throws NotInContextException
    {
        actionResumeConversation(null);
    }

    public final void
    actionSit(NWObject oChair)
        throws NotInContextException
    {
        actionSit(oChair, null);
    }

    public final void
    actionSpeakString(String sStringToSpeak, TalkVolume tTalkVolume)
        throws NotInContextException
    {
        actionSpeakString(sStringToSpeak, tTalkVolume, null);
    }

    public final void
    actionSpeakStringByStrRef(int nStrRef, TalkVolume tTalkVolume)
        throws NotInContextException
    {
        actionSpeakStringByStrRef(nStrRef, tTalkVolume, null);
    }

    public final void
    actionStartConversation(NWObject oObjectToConverseWith, String sDialogResRef, boolean bPrivateConversation, boolean bPlayHello)
        throws NotInContextException
    {
        actionStartConversation(oObjectToConverseWith, sDialogResRef, bPrivateConversation, bPlayHello, null);
    }

    public final void
    actionTakeItem(NWObject oItem, NWObject oTakeFrom)
        throws NotInContextException
    {
        actionTakeItem(oItem, oTakeFrom, null);
    }

    public final void
    actionUnequipItem(NWObject oItem)
        throws NotInContextException
    {
        actionUnequipItem(oItem, null);
    }

    public final void
    actionUnlockObject(NWObject oTarget)
        throws NotInContextException
    {
        actionUnlockObject(oTarget, null);
    }

    public final void
    actionUseFeat(int nFeat, NWObject oTarget)
        throws NotInContextException
    {
        actionUseFeat(nFeat, oTarget, null);
    }

    public final void
    actionUseSkill(int nSkill, NWObject oTarget, int nSubSkill, NWObject oItemUsed)
        throws NotInContextException
    {
        actionUseSkill(nSkill, oTarget, nSubSkill, oItemUsed, null);
    }

    public final void
    actionWait(double fSeconds)
        throws NotInContextException
    {
        actionWait(fSeconds, null);
    }

    public final void
    activatePortal(NWObject oTarget, String sIPaddress, String sPassword, String sWaypointTag, boolean bSeemless)
        throws NotInContextException
    {
        activatePortal(oTarget, sIPaddress, sPassword, sWaypointTag, bSeemless, null);
    }

    public final void
    addHenchman(NWObject oMaster, NWObject oHenchman)
        throws NotInContextException
    {
        addHenchman(oMaster, oHenchman, null);
    }

    public final void
    addItemProperty(DurationType tDurationType, NWItemProperty ipProperty, NWObject oItem, double fDuration)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        addItemProperty(tDurationType, ipProperty, oItem, fDuration, null);
    }

    public final void
    addJournalQuestEntry(String szPlotID, int nState, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers, boolean bAllowOverrideHigher)
        throws NotInContextException
    {
        addJournalQuestEntry(szPlotID, nState, oCreature, bAllPartyMembers, bAllPlayers, bAllowOverrideHigher, null);
    }

    public final void
    addToParty(NWObject oPC, NWObject oPartyLeader)
        throws NotInContextException
    {
        addToParty(oPC, oPartyLeader, null);
    }

    public final void
    adjustAlignment(NWObject oSubject, Alignment tAlignment, int nShift, boolean bAllPartyMembers)
        throws NotInContextException
    {
        adjustAlignment(oSubject, tAlignment, nShift, bAllPartyMembers, null);
    }

    public final void
    adjustReputation(NWObject oTarget, NWObject oSourceFactionMember, int nAdjustment)
        throws NotInContextException
    {
        adjustReputation(oTarget, oSourceFactionMember, nAdjustment, null);
    }

    public final NWEffect[]
    allEffects(NWObject o)
        throws NotInContextException
    {
        return allEffects(o, null);
    }

    public final NWCreatureEquipped
    allEquipped(NWObject o)
        throws NotInContextException
    {
        return allEquipped(o, null);
    }

    public final NWObject[]
    allInArea(NWObject area)
        throws NotInContextException
    {
        return allInArea(area, null);
    }

    public final NWObject[]
    allInFaction(NWObject memberOf, boolean bPCOnly)
        throws NotInContextException
    {
        return allInFaction(memberOf, bPCOnly, null);
    }

    public final NWObject[]
    allInInventory(NWObject o)
        throws NotInContextException
    {
        return allInInventory(o, null);
    }

    public final NWObject[]
    allInShape(ShapeType tShapeType, double fSize, NWLocation lTarget, boolean bLineOfSight, ObjectType tObjectType, NWVector vOrigin)
        throws NotInContextException
    {
        return allInShape(tShapeType, fSize, lTarget, bLineOfSight, tObjectType, vOrigin, null);
    }

    public final NWItemProperty[]
    allItemProperties(NWObject item)
        throws NotInContextException
    {
        return allItemProperties(item, null);
    }

    public final NWObject[]
    allPCs()
        throws NotInContextException
    {
        return allPCs(null);
    }

    public final void
    ambientSoundChangeDay(NWObject oArea, int nTrack)
        throws NotInContextException
    {
        ambientSoundChangeDay(oArea, nTrack, null);
    }

    public final void
    ambientSoundChangeNight(NWObject oArea, int nTrack)
        throws NotInContextException
    {
        ambientSoundChangeNight(oArea, nTrack, null);
    }

    public final void
    ambientSoundPlay(NWObject oArea)
        throws NotInContextException
    {
        ambientSoundPlay(oArea, null);
    }

    public final void
    ambientSoundSetDayVolume(NWObject oArea, int nVolume)
        throws NotInContextException
    {
        ambientSoundSetDayVolume(oArea, nVolume, null);
    }

    public final void
    ambientSoundSetNightVolume(NWObject oArea, int nVolume)
        throws NotInContextException
    {
        ambientSoundSetNightVolume(oArea, nVolume, null);
    }

    public final void
    ambientSoundStop(NWObject oArea)
        throws NotInContextException
    {
        ambientSoundStop(oArea, null);
    }

    public final NWVector
    angleToVector(double fAngle)
        throws NotInContextException
    {
        return angleToVector(fAngle, null);
    }

    public final void
    applyEffectAtLocation(DurationType tDurationType, NWEffect eEffect, NWLocation lLocation, double fDuration)
        throws InvalidEffectException,
               NotInContextException
    {
        applyEffectAtLocation(tDurationType, eEffect, lLocation, fDuration, null);
    }

    public final void
    applyEffectToObject(DurationType tDurationType, NWEffect eEffect, NWObject oTarget, double fDuration)
        throws InvalidEffectException,
               NotInContextException
    {
        applyEffectToObject(tDurationType, eEffect, oTarget, fDuration, null);
    }

    public final NWItemProperty
    badBadReplaceMeThisDoesNothing()
        throws NotInContextException
    {
        return badBadReplaceMeThisDoesNothing(null);
    }

    public final int
    beginConversation(String sResRef, NWObject oObjectToDialog)
        throws NotInContextException
    {
        return beginConversation(sResRef, oObjectToDialog, null);
    }

    public final void
    blackScreen(NWObject oCreature)
        throws NotInContextException
    {
        blackScreen(oCreature, null);
    }

    public final void
    bootPC(NWObject oPlayer)
        throws NotInContextException
    {
        bootPC(oPlayer, null);
    }

    public final void
    changeFaction(NWObject oObjectToChangeFaction, NWObject oMemberOfFactionToJoin)
        throws NotInContextException
    {
        changeFaction(oObjectToChangeFaction, oMemberOfFactionToJoin, null);
    }

    public final void
    changeToStandardFaction(NWObject oCreatureToChange, StandardFaction tStandardFaction)
        throws NotInContextException
    {
        changeToStandardFaction(oCreatureToChange, tStandardFaction, null);
    }

    public final void
    clearAllActions(boolean bClearCombatState)
        throws NotInContextException
    {
        clearAllActions(bClearCombatState, null);
    }

    public final void
    clearPersonalReputation(NWObject oTarget, NWObject oSource)
        throws NotInContextException
    {
        clearPersonalReputation(oTarget, oSource, null);
    }

    public final void
    clearState()
    {
        clearState(null);
    }

    public final NWObject
    copyItem(NWObject oItem, NWObject oTargetInventory, boolean bCopyVars)
        throws NotInContextException
    {
        return copyItem(oItem, oTargetInventory, bCopyVars, null);
    }

    public final NWObject
    copyItemAndModify(NWObject oItem, int nType, int nIndex, int nNewValue, boolean bCopyVars)
        throws NotInContextException
    {
        return copyItemAndModify(oItem, nType, nIndex, nNewValue, bCopyVars, null);
    }

    public final NWObject
    copyObject(NWObject oSource, NWLocation locLocation, NWObject oOwner, String sNewTag)
        throws NotInContextException
    {
        return copyObject(oSource, locLocation, oOwner, sNewTag, null);
    }

    public final NWObject
    createItemOnObject(String sItemTemplate, NWObject oTarget, int nStackSize, String sNewTag)
        throws NotInContextException
    {
        return createItemOnObject(sItemTemplate, oTarget, nStackSize, sNewTag, null);
    }

    public final NWObject
    createObject(ObjectType tObjectType, String sTemplate, NWLocation lLocation, boolean bUseAppearAnimation, String sNewTag)
        throws NotInContextException
    {
        return createObject(tObjectType, sTemplate, lLocation, bUseAppearAnimation, sNewTag, null);
    }

    public final NWObject
    createTrapAtLocation(TrapType tTrapType, NWLocation lLocation, double fSize, String sTag, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript)
        throws NotInContextException
    {
        return createTrapAtLocation(tTrapType, lLocation, fSize, sTag, tStandardFaction, sOnDisarmScript, sOnTrapTriggeredScript, null);
    }

    public final void
    createTrapOnObject(TrapType tTrapType, NWObject oObject, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript)
        throws NotInContextException
    {
        createTrapOnObject(tTrapType, oObject, tStandardFaction, sOnDisarmScript, sOnTrapTriggeredScript, null);
    }

    public final void
    dayToNight(NWObject oPlayer, double fTransitionTime)
        throws NotInContextException
    {
        dayToNight(oPlayer, fTransitionTime, null);
    }

    public final void
    decrementRemainingFeatUses(NWObject oCreature, int nFeat)
        throws NotInContextException
    {
        decrementRemainingFeatUses(oCreature, nFeat, null);
    }

    public final void
    decrementRemainingSpellUses(NWObject oCreature, int nSpell)
        throws NotInContextException
    {
        decrementRemainingSpellUses(oCreature, nSpell, null);
    }

    public final void
    delState(String key)
    {
        delState(key, null);
    }

    public final void
    deleteCampaignVariable(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException
    {
        deleteCampaignVariable(sCampaignName, sVarName, oPlayer, null);
    }

    public final void
    deleteLocalFloat(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        deleteLocalFloat(oObject, sVarName, null);
    }

    public final void
    deleteLocalInt(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        deleteLocalInt(oObject, sVarName, null);
    }

    public final void
    deleteLocalLocation(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        deleteLocalLocation(oObject, sVarName, null);
    }

    public final void
    deleteLocalObject(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        deleteLocalObject(oObject, sVarName, null);
    }

    public final void
    deleteLocalString(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        deleteLocalString(oObject, sVarName, null);
    }

    public final void
    destroyCampaignDatabase(String sCampaignName)
        throws NotInContextException
    {
        destroyCampaignDatabase(sCampaignName, null);
    }

    public final void
    destroyObject(NWObject oDestroy, double fDelay)
        throws NotInContextException
    {
        destroyObject(oDestroy, fDelay, null);
    }

    public final void
    doDoorAction(NWObject oTargetDoor, DoorAction tDoorAction)
        throws NotInContextException
    {
        doDoorAction(oTargetDoor, tDoorAction, null);
    }

    public final void
    doPlaceableObjectAction(NWObject oPlaceable, PlaceableAction tPlaceableAction)
        throws NotInContextException
    {
        doPlaceableObjectAction(oPlaceable, tPlaceableAction, null);
    }

    public final void
    doSinglePlayerAutoSave()
        throws NotInContextException
    {
        doSinglePlayerAutoSave(null);
    }

    public final void
    doWhirlwindAttack(boolean bDisplayFeedback, boolean bImproved)
        throws NotInContextException
    {
        doWhirlwindAttack(bDisplayFeedback, bImproved, null);
    }

    public final NWEffect
    effectACDecrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType)
        throws NotInContextException
    {
        return effectACDecrease(nValue, tACModifyType, tDamageType, null);
    }

    public final NWEffect
    effectACIncrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType)
        throws NotInContextException
    {
        return effectACIncrease(nValue, tACModifyType, tDamageType, null);
    }

    public final NWEffect
    effectAbilityDecrease(Ability tAbility, int nModifyBy)
        throws NotInContextException
    {
        return effectAbilityDecrease(tAbility, nModifyBy, null);
    }

    public final NWEffect
    effectAbilityIncrease(Ability tAbility, int nModifyBy)
        throws NotInContextException
    {
        return effectAbilityIncrease(tAbility, nModifyBy, null);
    }

    public final NWEffect
    effectAppear(int nAnimation)
        throws NotInContextException
    {
        return effectAppear(nAnimation, null);
    }

    public final NWEffect
    effectAreaOfEffect(int nAreaEffectId, String sOnEnterScript, String sHeartbeatScript, String sOnExitScript)
        throws NotInContextException
    {
        return effectAreaOfEffect(nAreaEffectId, sOnEnterScript, sHeartbeatScript, sOnExitScript, null);
    }

    public final NWEffect
    effectAttackDecrease(int nPenalty, AttackBonus tAttackBonus)
        throws NotInContextException
    {
        return effectAttackDecrease(nPenalty, tAttackBonus, null);
    }

    public final NWEffect
    effectAttackIncrease(int nBonus, AttackBonus tAttackBonus)
        throws NotInContextException
    {
        return effectAttackIncrease(nBonus, tAttackBonus, null);
    }

    public final NWEffect
    effectBeam(int nBeamVisualEffect, NWObject oEffector, CreaturePart tCreaturePart, boolean bMissEffect)
        throws NotInContextException
    {
        return effectBeam(nBeamVisualEffect, oEffector, tCreaturePart, bMissEffect, null);
    }

    public final NWEffect
    effectBlindness()
        throws NotInContextException
    {
        return effectBlindness(null);
    }

    public final NWEffect
    effectCharmed()
        throws NotInContextException
    {
        return effectCharmed(null);
    }

    public final NWEffect
    effectConcealment(int nPercentage, MissChanceType tMissChanceType)
        throws NotInContextException
    {
        return effectConcealment(nPercentage, tMissChanceType, null);
    }

    public final NWEffect
    effectConfused()
        throws NotInContextException
    {
        return effectConfused(null);
    }

    public final NWEffect
    effectCurse(int nStrMod, int nDexMod, int nConMod, int nIntMod, int nWisMod, int nChaMod)
        throws NotInContextException
    {
        return effectCurse(nStrMod, nDexMod, nConMod, nIntMod, nWisMod, nChaMod, null);
    }

    public final NWEffect
    effectCutsceneDominated()
        throws NotInContextException
    {
        return effectCutsceneDominated(null);
    }

    public final NWEffect
    effectCutsceneGhost()
        throws NotInContextException
    {
        return effectCutsceneGhost(null);
    }

    public final NWEffect
    effectCutsceneImmobilize()
        throws NotInContextException
    {
        return effectCutsceneImmobilize(null);
    }

    public final NWEffect
    effectCutsceneParalyze()
        throws NotInContextException
    {
        return effectCutsceneParalyze(null);
    }

    public final NWEffect
    effectDamage(int nDamageAmount, DamageType tDamageType, DamagePower tDamagePower)
        throws NotInContextException
    {
        return effectDamage(nDamageAmount, tDamageType, tDamagePower, null);
    }

    public final NWEffect
    effectDamageDecrease(int nPenalty, DamageType tDamageType)
        throws NotInContextException
    {
        return effectDamageDecrease(nPenalty, tDamageType, null);
    }

    public final NWEffect
    effectDamageImmunityDecrease(DamageType tDamageType, int nPercentImmunity)
        throws NotInContextException
    {
        return effectDamageImmunityDecrease(tDamageType, nPercentImmunity, null);
    }

    public final NWEffect
    effectDamageImmunityIncrease(DamageType tDamageType, int nPercentImmunity)
        throws NotInContextException
    {
        return effectDamageImmunityIncrease(tDamageType, nPercentImmunity, null);
    }

    public final NWEffect
    effectDamageIncrease(int nBonus, DamageType tDamageType)
        throws NotInContextException
    {
        return effectDamageIncrease(nBonus, tDamageType, null);
    }

    public final NWEffect
    effectDamageReduction(int nAmount, DamagePower tDamagePower, int nLimit)
        throws NotInContextException
    {
        return effectDamageReduction(nAmount, tDamagePower, nLimit, null);
    }

    public final NWEffect
    effectDamageResistance(DamageType tDamageType, int nAmount, int nLimit)
        throws NotInContextException
    {
        return effectDamageResistance(tDamageType, nAmount, nLimit, null);
    }

    public final NWEffect
    effectDamageShield(int nDamageAmount, int nRandomAmount, DamageType tDamageType)
        throws NotInContextException
    {
        return effectDamageShield(nDamageAmount, nRandomAmount, tDamageType, null);
    }

    public final NWEffect
    effectDarkness()
        throws NotInContextException
    {
        return effectDarkness(null);
    }

    public final NWEffect
    effectDazed()
        throws NotInContextException
    {
        return effectDazed(null);
    }

    public final NWEffect
    effectDeaf()
        throws NotInContextException
    {
        return effectDeaf(null);
    }

    public final NWEffect
    effectDeath(boolean bSpectacularDeath, boolean bDisplayFeedback)
        throws NotInContextException
    {
        return effectDeath(bSpectacularDeath, bDisplayFeedback, null);
    }

    public final NWEffect
    effectDisappear(int nAnimation)
        throws NotInContextException
    {
        return effectDisappear(nAnimation, null);
    }

    public final NWEffect
    effectDisappearAppear(NWLocation lLocation, int nAnimation)
        throws NotInContextException
    {
        return effectDisappearAppear(lLocation, nAnimation, null);
    }

    public final NWEffect
    effectDisease(int nDiseaseType)
        throws NotInContextException
    {
        return effectDisease(nDiseaseType, null);
    }

    public final NWEffect
    effectDispelMagicAll(int nCasterLevel)
        throws NotInContextException
    {
        return effectDispelMagicAll(nCasterLevel, null);
    }

    public final NWEffect
    effectDispelMagicBest(int nCasterLevel)
        throws NotInContextException
    {
        return effectDispelMagicBest(nCasterLevel, null);
    }

    public final NWEffect
    effectDominated()
        throws NotInContextException
    {
        return effectDominated(null);
    }

    public final NWEffect
    effectEntangle()
        throws NotInContextException
    {
        return effectEntangle(null);
    }

    public final NWEffect
    effectEthereal()
        throws NotInContextException
    {
        return effectEthereal(null);
    }

    public final NWEffect
    effectFrightened()
        throws NotInContextException
    {
        return effectFrightened(null);
    }

    public final NWEffect
    effectHaste()
        throws NotInContextException
    {
        return effectHaste(null);
    }

    public final NWEffect
    effectHeal(int nDamageToHeal)
        throws NotInContextException
    {
        return effectHeal(nDamageToHeal, null);
    }

    public final NWEffect
    effectHitPointChangeWhenDying(double fHitPointChangePerRound)
        throws NotInContextException
    {
        return effectHitPointChangeWhenDying(fHitPointChangePerRound, null);
    }

    public final NWEffect
    effectImmunity(ImmunityType tImmunityType)
        throws NotInContextException
    {
        return effectImmunity(tImmunityType, null);
    }

    public final NWEffect
    effectInvisibility(int nInvisibilityType)
        throws NotInContextException
    {
        return effectInvisibility(nInvisibilityType, null);
    }

    public final NWEffect
    effectKnockdown()
        throws NotInContextException
    {
        return effectKnockdown(null);
    }

    public final NWEffect
    effectLinkEffects(NWEffect eChildEffect, NWEffect eParentEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return effectLinkEffects(eChildEffect, eParentEffect, null);
    }

    public final NWEffect
    effectMissChance(int nPercentage, MissChanceType tMissChanceType)
        throws NotInContextException
    {
        return effectMissChance(nPercentage, tMissChanceType, null);
    }

    public final NWEffect
    effectModifyAttacks(int nAttacks)
        throws NotInContextException
    {
        return effectModifyAttacks(nAttacks, null);
    }

    public final NWEffect
    effectMovementSpeedDecrease(int nPercentChange)
        throws NotInContextException
    {
        return effectMovementSpeedDecrease(nPercentChange, null);
    }

    public final NWEffect
    effectMovementSpeedIncrease(int nPercentChange)
        throws NotInContextException
    {
        return effectMovementSpeedIncrease(nPercentChange, null);
    }

    public final NWEffect
    effectNegativeLevel(int nNumLevels, boolean bHPBonus)
        throws NotInContextException
    {
        return effectNegativeLevel(nNumLevels, bHPBonus, null);
    }

    public final NWEffect
    effectParalyze()
        throws NotInContextException
    {
        return effectParalyze(null);
    }

    public final NWEffect
    effectPetrify()
        throws NotInContextException
    {
        return effectPetrify(null);
    }

    public final NWEffect
    effectPoison(int nPoisonType)
        throws NotInContextException
    {
        return effectPoison(nPoisonType, null);
    }

    public final NWEffect
    effectPolymorph(int nPolymorphSelection, boolean bLocked)
        throws NotInContextException
    {
        return effectPolymorph(nPolymorphSelection, bLocked, null);
    }

    public final NWEffect
    effectRegenerate(int nAmount, double fIntervalSeconds)
        throws NotInContextException
    {
        return effectRegenerate(nAmount, fIntervalSeconds, null);
    }

    public final NWEffect
    effectResurrection()
        throws NotInContextException
    {
        return effectResurrection(null);
    }

    public final NWEffect
    effectSanctuary(int nDifficultyClass)
        throws NotInContextException
    {
        return effectSanctuary(nDifficultyClass, null);
    }

    public final NWEffect
    effectSavingThrowDecrease(int nSave, int nValue, SaveType tSaveType)
        throws NotInContextException
    {
        return effectSavingThrowDecrease(nSave, nValue, tSaveType, null);
    }

    public final NWEffect
    effectSavingThrowIncrease(int nSave, int nValue, SaveType tSaveType)
        throws NotInContextException
    {
        return effectSavingThrowIncrease(nSave, nValue, tSaveType, null);
    }

    public final NWEffect
    effectSeeInvisible()
        throws NotInContextException
    {
        return effectSeeInvisible(null);
    }

    public final NWEffect
    effectSilence()
        throws NotInContextException
    {
        return effectSilence(null);
    }

    public final NWEffect
    effectSkillDecrease(int nSkill, int nValue)
        throws NotInContextException
    {
        return effectSkillDecrease(nSkill, nValue, null);
    }

    public final NWEffect
    effectSkillIncrease(int nSkill, int nValue)
        throws NotInContextException
    {
        return effectSkillIncrease(nSkill, nValue, null);
    }

    public final NWEffect
    effectSleep()
        throws NotInContextException
    {
        return effectSleep(null);
    }

    public final NWEffect
    effectSlow()
        throws NotInContextException
    {
        return effectSlow(null);
    }

    public final NWEffect
    effectSpellFailure(int nPercent, SpellSchool tSpellSchool)
        throws NotInContextException
    {
        return effectSpellFailure(nPercent, tSpellSchool, null);
    }

    public final NWEffect
    effectSpellImmunity(int nImmunityToSpell)
        throws NotInContextException
    {
        return effectSpellImmunity(nImmunityToSpell, null);
    }

    public final NWEffect
    effectSpellLevelAbsorption(int nMaxSpellLevelAbsorbed, int nTotalSpellLevelsAbsorbed, SpellSchool tSpellSchool)
        throws NotInContextException
    {
        return effectSpellLevelAbsorption(nMaxSpellLevelAbsorbed, nTotalSpellLevelsAbsorbed, tSpellSchool, null);
    }

    public final NWEffect
    effectSpellResistanceDecrease(int nValue)
        throws NotInContextException
    {
        return effectSpellResistanceDecrease(nValue, null);
    }

    public final NWEffect
    effectSpellResistanceIncrease(int nValue)
        throws NotInContextException
    {
        return effectSpellResistanceIncrease(nValue, null);
    }

    public final NWEffect
    effectStunned()
        throws NotInContextException
    {
        return effectStunned(null);
    }

    public final NWEffect
    effectSummonCreature(String sCreatureResref, int nVisualEffectId, double fDelaySeconds, boolean bUseAppearAnimation)
        throws NotInContextException
    {
        return effectSummonCreature(sCreatureResref, nVisualEffectId, fDelaySeconds, bUseAppearAnimation, null);
    }

    public final NWEffect
    effectSwarm(boolean bLooping, String sCreatureTemplate1, String sCreatureTemplate2, String sCreatureTemplate3, String sCreatureTemplate4)
        throws NotInContextException
    {
        return effectSwarm(bLooping, sCreatureTemplate1, sCreatureTemplate2, sCreatureTemplate3, sCreatureTemplate4, null);
    }

    public final NWEffect
    effectTemporaryHitpoints(int nHitPoints)
        throws NotInContextException
    {
        return effectTemporaryHitpoints(nHitPoints, null);
    }

    public final NWEffect
    effectTimeStop()
        throws NotInContextException
    {
        return effectTimeStop(null);
    }

    public final NWEffect
    effectTrueSeeing()
        throws NotInContextException
    {
        return effectTrueSeeing(null);
    }

    public final NWEffect
    effectTurnResistanceDecrease(int nHitDice)
        throws NotInContextException
    {
        return effectTurnResistanceDecrease(nHitDice, null);
    }

    public final NWEffect
    effectTurnResistanceIncrease(int nHitDice)
        throws NotInContextException
    {
        return effectTurnResistanceIncrease(nHitDice, null);
    }

    public final NWEffect
    effectTurned()
        throws NotInContextException
    {
        return effectTurned(null);
    }

    public final NWEffect
    effectUltravision()
        throws NotInContextException
    {
        return effectUltravision(null);
    }

    public final NWEffect
    effectVisualEffect(int nVisualEffectId, boolean bMissEffect)
        throws NotInContextException
    {
        return effectVisualEffect(nVisualEffectId, bMissEffect, null);
    }

    public final void
    endGame(String sEndMovie)
        throws NotInContextException
    {
        endGame(sEndMovie, null);
    }

    public final void
    executeScript(String sScript, NWObject oTarget)
        throws NotInContextException
    {
        executeScript(sScript, oTarget, null);
    }

    public final void
    exploreAreaForPlayer(NWObject oArea, NWObject oPlayer, boolean bExplored)
        throws NotInContextException
    {
        exploreAreaForPlayer(oArea, oPlayer, bExplored, null);
    }

    public final void
    exportAllCharacters()
        throws NotInContextException
    {
        exportAllCharacters(null);
    }

    public final void
    exportSingleCharacter(NWObject oPlayer)
        throws NotInContextException
    {
        exportSingleCharacter(oPlayer, null);
    }

    public final NWEffect
    extraordinaryEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return extraordinaryEffect(eEffect, null);
    }

    public final void
    fadeFromBlack(NWObject oCreature, double fSpeed)
        throws NotInContextException
    {
        fadeFromBlack(oCreature, fSpeed, null);
    }

    public final void
    fadeToBlack(NWObject oCreature, double fSpeed)
        throws NotInContextException
    {
        fadeToBlack(oCreature, fSpeed, null);
    }

    public final void
    floatingTextStrRefOnCreature(int nStrRefToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction)
        throws NotInContextException
    {
        floatingTextStrRefOnCreature(nStrRefToDisplay, oCreatureToFloatAbove, bBroadcastToFaction, null);
    }

    public final void
    floatingTextStringOnCreature(String sStringToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction)
        throws NotInContextException
    {
        floatingTextStringOnCreature(sStringToDisplay, oCreatureToFloatAbove, bBroadcastToFaction, null);
    }

    public final void
    forceRest(NWObject oCreature)
        throws NotInContextException
    {
        forceRest(oCreature, null);
    }

    public final SavingThrowResult
    fortitudeSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException
    {
        return fortitudeSave(oCreature, nDC, tSaveType, oSaveVersus, null);
    }

    public final String
    get2DAString(String s2DA, String sColumn, int nRow)
        throws NotInContextException
    {
        return get2DAString(s2DA, sColumn, nRow, null);
    }

    public final int
    getAC(NWObject oObject)
        throws NotInContextException
    {
        return getAC(oObject, null);
    }

    public final AILevel
    getAILevel(NWObject oTarget)
        throws NotInContextException
    {
        return getAILevel(oTarget, null);
    }

    public final int
    getAbilityModifier(Ability tAbility, NWObject oCreature)
        throws NotInContextException
    {
        return getAbilityModifier(tAbility, oCreature, null);
    }

    public final int
    getAbilityScore(NWObject oCreature, Ability tAbility, boolean bBaseAbilityScore)
        throws NotInContextException
    {
        return getAbilityScore(oCreature, tAbility, bBaseAbilityScore, null);
    }

    public final boolean
    getActionMode(NWObject oCreature, ActionMode tActionMode)
        throws NotInContextException
    {
        return getActionMode(oCreature, tActionMode, null);
    }

    public final int
    getAge(NWObject oCreature)
        throws NotInContextException
    {
        return getAge(oCreature, null);
    }

    public final Alignment
    getAlignmentGoodEvil(NWObject oCreature)
        throws NotInContextException
    {
        return getAlignmentGoodEvil(oCreature, null);
    }

    public final Alignment
    getAlignmentLawChaos(NWObject oCreature)
        throws NotInContextException
    {
        return getAlignmentLawChaos(oCreature, null);
    }

    public final int
    getAnimalCompanionCreatureType(NWObject oCreature)
        throws NotInContextException
    {
        return getAnimalCompanionCreatureType(oCreature, null);
    }

    public final String
    getAnimalCompanionName(NWObject oTarget)
        throws NotInContextException
    {
        return getAnimalCompanionName(oTarget, null);
    }

    public final int
    getAppearanceType(NWObject oCreature)
        throws NotInContextException
    {
        return getAppearanceType(oCreature, null);
    }

    public final int
    getArcaneSpellFailure(NWObject oCreature)
        throws NotInContextException
    {
        return getArcaneSpellFailure(oCreature, null);
    }

    public final NWObject
    getArea(NWObject oTarget)
        throws NotInContextException
    {
        return getArea(oTarget, null);
    }

    public final NWObject
    getAreaOfEffectCreator(NWObject oAreaOfEffectObject)
        throws NotInContextException
    {
        return getAreaOfEffectCreator(oAreaOfEffectObject, null);
    }

    public final int
    getAreaSize(int nAreaDimension, NWObject oArea)
        throws NotInContextException
    {
        return getAreaSize(nAreaDimension, oArea, null);
    }

    public final NWObject
    getAssociate(AssociateType tAssociateType, NWObject oMaster, int nTh)
        throws NotInContextException
    {
        return getAssociate(tAssociateType, oMaster, nTh, null);
    }

    public final AssociateType
    getAssociateType(NWObject oAssociate)
        throws NotInContextException
    {
        return getAssociateType(oAssociate, null);
    }

    public final NWObject
    getAttackTarget(NWObject oCreature)
        throws NotInContextException
    {
        return getAttackTarget(oCreature, null);
    }

    public final NWObject
    getAttemptedAttackTarget()
        throws NotInContextException
    {
        return getAttemptedAttackTarget(null);
    }

    public final NWObject
    getAttemptedSpellTarget()
        throws NotInContextException
    {
        return getAttemptedSpellTarget(null);
    }

    public final int
    getBaseAttackBonus(NWObject oCreature)
        throws NotInContextException
    {
        return getBaseAttackBonus(oCreature, null);
    }

    public final int
    getBaseItemType(NWObject oItem)
        throws NotInContextException
    {
        return getBaseItemType(oItem, null);
    }

    public final NWObject
    getBlockingDoor()
        throws NotInContextException
    {
        return getBlockingDoor(null);
    }

    public final int
    getCalendarDay()
        throws NotInContextException
    {
        return getCalendarDay(null);
    }

    public final int
    getCalendarMonth()
        throws NotInContextException
    {
        return getCalendarMonth(null);
    }

    public final int
    getCalendarYear()
        throws NotInContextException
    {
        return getCalendarYear(null);
    }

    public final double
    getCampaignFloat(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException
    {
        return getCampaignFloat(sCampaignName, sVarName, oPlayer, null);
    }

    public final int
    getCampaignInt(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException
    {
        return getCampaignInt(sCampaignName, sVarName, oPlayer, null);
    }

    public final NWLocation
    getCampaignLocation(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException
    {
        return getCampaignLocation(sCampaignName, sVarName, oPlayer, null);
    }

    public final String
    getCampaignString(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException
    {
        return getCampaignString(sCampaignName, sVarName, oPlayer, null);
    }

    public final NWVector
    getCampaignVector(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException
    {
        return getCampaignVector(sCampaignName, sVarName, oPlayer, null);
    }

    public final int
    getCasterLevel(NWObject oCreature)
        throws NotInContextException
    {
        return getCasterLevel(oCreature, null);
    }

    public final double
    getChallengeRating(NWObject oCreature)
        throws NotInContextException
    {
        return getChallengeRating(oCreature, null);
    }

    public final int
    getClassByPosition(int nClassPosition, NWObject oCreature)
        throws NotInContextException
    {
        return getClassByPosition(nClassPosition, oCreature, null);
    }

    public final NWObject
    getClickingObject()
        throws NotInContextException
    {
        return getClickingObject(null);
    }

    public final int
    getColor(NWObject oObject, int nColorChannel)
        throws NotInContextException
    {
        return getColor(oObject, nColorChannel, null);
    }

    public final boolean
    getCommandable(NWObject oTarget)
        throws NotInContextException
    {
        return getCommandable(oTarget, null);
    }

    public final int
    getCreatureBodyPart(CreaturePart tCreaturePart, NWObject oCreature)
        throws NotInContextException
    {
        return getCreatureBodyPart(tCreaturePart, oCreature, null);
    }

    public final CreatureSize
    getCreatureSize(NWObject oCreature)
        throws NotInContextException
    {
        return getCreatureSize(oCreature, null);
    }

    public final int
    getCreatureStartingPackage(NWObject oCreature)
        throws NotInContextException
    {
        return getCreatureStartingPackage(oCreature, null);
    }

    public final int
    getCreatureTailType(NWObject oCreature)
        throws NotInContextException
    {
        return getCreatureTailType(oCreature, null);
    }

    public final int
    getCreatureWingType(NWObject oCreature)
        throws NotInContextException
    {
        return getCreatureWingType(oCreature, null);
    }

    public final Action
    getCurrentAction(NWObject oObject)
        throws NotInContextException
    {
        return getCurrentAction(oObject, null);
    }

    public final int
    getCurrentHitPoints(NWObject oObject)
        throws NotInContextException
    {
        return getCurrentHitPoints(oObject, null);
    }

    public final double
    getCutsceneCameraMoveRate(NWObject oCreature)
        throws NotInContextException
    {
        return getCutsceneCameraMoveRate(oCreature, null);
    }

    public final boolean
    getCutsceneMode(NWObject oCreature)
        throws NotInContextException
    {
        return getCutsceneMode(oCreature, null);
    }

    public final int
    getDamageDealtByType(DamageType tDamageType)
        throws NotInContextException
    {
        return getDamageDealtByType(tDamageType, null);
    }

    public final int
    getDefensiveCastingMode(NWObject oCreature)
        throws NotInContextException
    {
        return getDefensiveCastingMode(oCreature, null);
    }

    public final String
    getDeity(NWObject oCreature)
        throws NotInContextException
    {
        return getDeity(oCreature, null);
    }

    public final String
    getDescription(NWObject oObject, boolean bOriginalDescription, boolean bIdentifiedDescription)
        throws NotInContextException
    {
        return getDescription(oObject, bOriginalDescription, bIdentifiedDescription, null);
    }

    public final int
    getDetectMode(NWObject oCreature)
        throws NotInContextException
    {
        return getDetectMode(oCreature, null);
    }

    public final double
    getDialogSoundLength(int nStrRef)
        throws NotInContextException
    {
        return getDialogSoundLength(nStrRef, null);
    }

    public final double
    getDistanceBetween(NWObject oObjectA, NWObject oObjectB)
        throws NotInContextException
    {
        return getDistanceBetween(oObjectA, oObjectB, null);
    }

    public final double
    getDistanceBetweenLocations(NWLocation lLocationA, NWLocation lLocationB)
        throws NotInContextException
    {
        return getDistanceBetweenLocations(lLocationA, lLocationB, null);
    }

    public final double
    getDistanceToObject(NWObject oObject)
        throws NotInContextException
    {
        return getDistanceToObject(oObject, null);
    }

    public final boolean
    getDroppableFlag(NWObject oItem)
        throws NotInContextException
    {
        return getDroppableFlag(oItem, null);
    }

    public final NWObject
    getEffectCreator(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return getEffectCreator(eEffect, null);
    }

    public final DurationType
    getEffectDurationType(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return getEffectDurationType(eEffect, null);
    }

    public final boolean
    getEffectIconShown(NWEffect eff)
        throws InvalidEffectException,
               NotInContextException
    {
        return getEffectIconShown(eff, null);
    }

    public final int
    getEffectSpellId(NWEffect eSpellEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return getEffectSpellId(eSpellEffect, null);
    }

    public final EffectSubType
    getEffectSubType(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return getEffectSubType(eEffect, null);
    }

    public final EffectType
    getEffectType(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return getEffectType(eEffect, null);
    }

    public final int
    getEncounterActive(NWObject oEncounter)
        throws NotInContextException
    {
        return getEncounterActive(oEncounter, null);
    }

    public final int
    getEncounterDifficulty(NWObject oEncounter)
        throws NotInContextException
    {
        return getEncounterDifficulty(oEncounter, null);
    }

    public final int
    getEncounterSpawnsCurrent(NWObject oEncounter)
        throws NotInContextException
    {
        return getEncounterSpawnsCurrent(oEncounter, null);
    }

    public final int
    getEncounterSpawnsMax(NWObject oEncounter)
        throws NotInContextException
    {
        return getEncounterSpawnsMax(oEncounter, null);
    }

    public final NWObject
    getEnteringObject()
        throws NotInContextException
    {
        return getEnteringObject(null);
    }

    public final NWObject
    getExitingObject()
        throws NotInContextException
    {
        return getExitingObject(null);
    }

    public final double
    getFacing(NWObject oTarget)
        throws NotInContextException
    {
        return getFacing(oTarget, null);
    }

    public final int
    getFactionAverageGoodEvilAlignment(NWObject oFactionMember)
        throws NotInContextException
    {
        return getFactionAverageGoodEvilAlignment(oFactionMember, null);
    }

    public final int
    getFactionAverageLawChaosAlignment(NWObject oFactionMember)
        throws NotInContextException
    {
        return getFactionAverageLawChaosAlignment(oFactionMember, null);
    }

    public final int
    getFactionAverageLevel(NWObject oFactionMember)
        throws NotInContextException
    {
        return getFactionAverageLevel(oFactionMember, null);
    }

    public final int
    getFactionAverageReputation(NWObject oSourceFactionMember, NWObject oTarget)
        throws NotInContextException
    {
        return getFactionAverageReputation(oSourceFactionMember, oTarget, null);
    }

    public final int
    getFactionAverageXP(NWObject oFactionMember)
        throws NotInContextException
    {
        return getFactionAverageXP(oFactionMember, null);
    }

    public final NWObject
    getFactionBestAC(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException
    {
        return getFactionBestAC(oFactionMember, bMustBeVisible, null);
    }

    public final boolean
    getFactionEqual(NWObject oFirstObject, NWObject oSecondObject)
        throws NotInContextException
    {
        return getFactionEqual(oFirstObject, oSecondObject, null);
    }

    public final int
    getFactionGold(NWObject oFactionMember)
        throws NotInContextException
    {
        return getFactionGold(oFactionMember, null);
    }

    public final NWObject
    getFactionLeader(NWObject oMemberOfFaction)
        throws NotInContextException
    {
        return getFactionLeader(oMemberOfFaction, null);
    }

    public final NWObject
    getFactionLeastDamagedMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException
    {
        return getFactionLeastDamagedMember(oFactionMember, bMustBeVisible, null);
    }

    public final NWObject
    getFactionMostDamagedMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException
    {
        return getFactionMostDamagedMember(oFactionMember, bMustBeVisible, null);
    }

    public final int
    getFactionMostFrequentClass(NWObject oFactionMember)
        throws NotInContextException
    {
        return getFactionMostFrequentClass(oFactionMember, null);
    }

    public final NWObject
    getFactionStrongestMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException
    {
        return getFactionStrongestMember(oFactionMember, bMustBeVisible, null);
    }

    public final NWObject
    getFactionWeakestMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException
    {
        return getFactionWeakestMember(oFactionMember, bMustBeVisible, null);
    }

    public final NWObject
    getFactionWorstAC(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException
    {
        return getFactionWorstAC(oFactionMember, bMustBeVisible, null);
    }

    public final int
    getFamiliarCreatureType(NWObject oCreature)
        throws NotInContextException
    {
        return getFamiliarCreatureType(oCreature, null);
    }

    public final String
    getFamiliarName(NWObject oCreature)
        throws NotInContextException
    {
        return getFamiliarName(oCreature, null);
    }

    public final int
    getFogAmount(int nFogType, NWObject oArea)
        throws NotInContextException
    {
        return getFogAmount(nFogType, oArea, null);
    }

    public final int
    getFogColor(int nFogType, NWObject oArea)
        throws NotInContextException
    {
        return getFogColor(nFogType, oArea, null);
    }

    public final int
    getFootstepType(NWObject oCreature)
        throws NotInContextException
    {
        return getFootstepType(oCreature, null);
    }

    public final int
    getFortitudeSavingThrow(NWObject oTarget)
        throws NotInContextException
    {
        return getFortitudeSavingThrow(oTarget, null);
    }

    public final int
    getGameDifficulty()
        throws NotInContextException
    {
        return getGameDifficulty(null);
    }

    public final Gender
    getGender(NWObject oCreature)
        throws NotInContextException
    {
        return getGender(oCreature, null);
    }

    public final NWObject
    getGoingToBeAttackedBy(NWObject oTarget)
        throws NotInContextException
    {
        return getGoingToBeAttackedBy(oTarget, null);
    }

    public final int
    getGold(NWObject oTarget)
        throws NotInContextException
    {
        return getGold(oTarget, null);
    }

    public final int
    getGoldPieceValue(NWObject oItem)
        throws NotInContextException
    {
        return getGoldPieceValue(oItem, null);
    }

    public final int
    getGoodEvilValue(NWObject oCreature)
        throws NotInContextException
    {
        return getGoodEvilValue(oCreature, null);
    }

    public final int
    getHardness(NWObject oObject)
        throws NotInContextException
    {
        return getHardness(oObject, null);
    }

    public final boolean
    getHasFeat(int nFeat, NWObject oCreature)
        throws NotInContextException
    {
        return getHasFeat(nFeat, oCreature, null);
    }

    public final boolean
    getHasFeatEffect(int nFeat, NWObject oObject)
        throws NotInContextException
    {
        return getHasFeatEffect(nFeat, oObject, null);
    }

    public final boolean
    getHasInventory(NWObject oObject)
        throws NotInContextException
    {
        return getHasInventory(oObject, null);
    }

    public final boolean
    getHasSkill(int nSkill, NWObject oCreature)
        throws NotInContextException
    {
        return getHasSkill(nSkill, oCreature, null);
    }

    public final boolean
    getHasSpell(int nSpell, NWObject oCreature)
        throws NotInContextException
    {
        return getHasSpell(nSpell, oCreature, null);
    }

    public final boolean
    getHasSpellEffect(int nSpell, NWObject oObject)
        throws NotInContextException
    {
        return getHasSpellEffect(nSpell, oObject, null);
    }

    public final NWObject
    getHenchman(NWObject oMaster, int nNth)
        throws NotInContextException
    {
        return getHenchman(oMaster, nNth, null);
    }

    public final int
    getHitDice(NWObject oCreature)
        throws NotInContextException
    {
        return getHitDice(oCreature, null);
    }

    public final boolean
    getIdentified(NWObject oItem)
        throws NotInContextException
    {
        return getIdentified(oItem, null);
    }

    public final boolean
    getImmortal(NWObject oTarget)
        throws NotInContextException
    {
        return getImmortal(oTarget, null);
    }

    public final boolean
    getInfiniteFlag(NWObject oItem)
        throws NotInContextException
    {
        return getInfiniteFlag(oItem, null);
    }

    public final NWObject
    getInventoryDisturbItem()
        throws NotInContextException
    {
        return getInventoryDisturbItem(null);
    }

    public final int
    getInventoryDisturbType()
        throws NotInContextException
    {
        return getInventoryDisturbType(null);
    }

    public final boolean
    getIsAreaAboveGround(NWObject oArea)
        throws NotInContextException
    {
        return getIsAreaAboveGround(oArea, null);
    }

    public final boolean
    getIsAreaInterior(NWObject oArea)
        throws NotInContextException
    {
        return getIsAreaInterior(oArea, null);
    }

    public final boolean
    getIsAreaNatural(NWObject oArea)
        throws NotInContextException
    {
        return getIsAreaNatural(oArea, null);
    }

    public final boolean
    getIsCreatureDisarmable(NWObject oCreature)
        throws NotInContextException
    {
        return getIsCreatureDisarmable(oCreature, null);
    }

    public final boolean
    getIsDM(NWObject oCreature)
        throws NotInContextException
    {
        return getIsDM(oCreature, null);
    }

    public final boolean
    getIsDMPossessed(NWObject oCreature)
        throws NotInContextException
    {
        return getIsDMPossessed(oCreature, null);
    }

    public final boolean
    getIsDawn()
        throws NotInContextException
    {
        return getIsDawn(null);
    }

    public final boolean
    getIsDay()
        throws NotInContextException
    {
        return getIsDay(null);
    }

    public final boolean
    getIsDead(NWObject oCreature)
        throws NotInContextException
    {
        return getIsDead(oCreature, null);
    }

    public final boolean
    getIsDoorActionPossible(NWObject oTargetDoor, DoorAction tDoorAction)
        throws NotInContextException
    {
        return getIsDoorActionPossible(oTargetDoor, tDoorAction, null);
    }

    public final boolean
    getIsDusk()
        throws NotInContextException
    {
        return getIsDusk(null);
    }

    public final boolean
    getIsEffectValid(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return getIsEffectValid(eEffect, null);
    }

    public final boolean
    getIsEncounterCreature(NWObject oCreature)
        throws NotInContextException
    {
        return getIsEncounterCreature(oCreature, null);
    }

    public final boolean
    getIsEnemy(NWObject oTarget, NWObject oSource)
        throws NotInContextException
    {
        return getIsEnemy(oTarget, oSource, null);
    }

    public final boolean
    getIsFriend(NWObject oTarget, NWObject oSource)
        throws NotInContextException
    {
        return getIsFriend(oTarget, oSource, null);
    }

    public final boolean
    getIsImmune(NWObject oCreature, ImmunityType tImmunityType, NWObject oVersus)
        throws NotInContextException
    {
        return getIsImmune(oCreature, tImmunityType, oVersus, null);
    }

    public final boolean
    getIsInCombat(NWObject oCreature)
        throws NotInContextException
    {
        return getIsInCombat(oCreature, null);
    }

    public final boolean
    getIsInSubArea(NWObject oCreature, NWObject oSubArea)
        throws NotInContextException
    {
        return getIsInSubArea(oCreature, oSubArea, null);
    }

    public final boolean
    getIsItemPropertyValid(NWItemProperty ipProperty)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        return getIsItemPropertyValid(ipProperty, null);
    }

    public final boolean
    getIsListening(NWObject oObject)
        throws NotInContextException
    {
        return getIsListening(oObject, null);
    }

    public final boolean
    getIsNeutral(NWObject oTarget, NWObject oSource)
        throws NotInContextException
    {
        return getIsNeutral(oTarget, oSource, null);
    }

    public final boolean
    getIsNight()
        throws NotInContextException
    {
        return getIsNight(null);
    }

    public final boolean
    getIsObjectValid(NWObject oObject)
        throws NotInContextException
    {
        return getIsObjectValid(oObject, null);
    }

    public final boolean
    getIsOpen(NWObject oObject)
        throws NotInContextException
    {
        return getIsOpen(oObject, null);
    }

    public final boolean
    getIsPC(NWObject oCreature)
        throws NotInContextException
    {
        return getIsPC(oCreature, null);
    }

    public final boolean
    getIsPlaceableObjectActionPossible(NWObject oPlaceable, PlaceableAction tPlaceableAction)
        throws NotInContextException
    {
        return getIsPlaceableObjectActionPossible(oPlaceable, tPlaceableAction, null);
    }

    public final boolean
    getIsPlayableRacialType(NWObject oCreature)
        throws NotInContextException
    {
        return getIsPlayableRacialType(oCreature, null);
    }

    public final boolean
    getIsPossessedFamiliar(NWObject oCreature)
        throws NotInContextException
    {
        return getIsPossessedFamiliar(oCreature, null);
    }

    public final boolean
    getIsReactionTypeFriendly(NWObject oTarget, NWObject oSource)
        throws NotInContextException
    {
        return getIsReactionTypeFriendly(oTarget, oSource, null);
    }

    public final boolean
    getIsReactionTypeHostile(NWObject oTarget, NWObject oSource)
        throws NotInContextException
    {
        return getIsReactionTypeHostile(oTarget, oSource, null);
    }

    public final boolean
    getIsReactionTypeNeutral(NWObject oTarget, NWObject oSource)
        throws NotInContextException
    {
        return getIsReactionTypeNeutral(oTarget, oSource, null);
    }

    public final boolean
    getIsResting(NWObject oCreature)
        throws NotInContextException
    {
        return getIsResting(oCreature, null);
    }

    public final boolean
    getIsSkillSuccessful(NWObject oTarget, int nSkill, int nDifficulty)
        throws NotInContextException
    {
        return getIsSkillSuccessful(oTarget, nSkill, nDifficulty, null);
    }

    public final boolean
    getIsTrapped(NWObject oObject)
        throws NotInContextException
    {
        return getIsTrapped(oObject, null);
    }

    public final boolean
    getIsWeaponEffective(NWObject oVersus, boolean bOffHand)
        throws NotInContextException
    {
        return getIsWeaponEffective(oVersus, bOffHand, null);
    }

    public final int
    getItemACValue(NWObject oItem)
        throws NotInContextException
    {
        return getItemACValue(oItem, null);
    }

    public final NWObject
    getItemActivated()
        throws NotInContextException
    {
        return getItemActivated(null);
    }

    public final NWObject
    getItemActivatedTarget()
        throws NotInContextException
    {
        return getItemActivatedTarget(null);
    }

    public final NWLocation
    getItemActivatedTargetLocation()
        throws NotInContextException
    {
        return getItemActivatedTargetLocation(null);
    }

    public final NWObject
    getItemActivator()
        throws NotInContextException
    {
        return getItemActivator(null);
    }

    public final int
    getItemAppearance(NWObject oItem, int nType, int nIndex)
        throws NotInContextException
    {
        return getItemAppearance(oItem, nType, nIndex, null);
    }

    public final int
    getItemCharges(NWObject oItem)
        throws NotInContextException
    {
        return getItemCharges(oItem, null);
    }

    public final boolean
    getItemCursedFlag(NWObject oItem)
        throws NotInContextException
    {
        return getItemCursedFlag(oItem, null);
    }

    public final boolean
    getItemHasItemProperty(NWObject oItem, int nProperty)
        throws NotInContextException
    {
        return getItemHasItemProperty(oItem, nProperty, null);
    }

    public final NWObject
    getItemInSlot(InventorySlot tInventorySlot, NWObject oCreature)
        throws NotInContextException
    {
        return getItemInSlot(tInventorySlot, oCreature, null);
    }

    public final NWObject
    getItemPossessedBy(NWObject oCreature, String sItemTag)
        throws NotInContextException
    {
        return getItemPossessedBy(oCreature, sItemTag, null);
    }

    public final NWObject
    getItemPossessor(NWObject oItem)
        throws NotInContextException
    {
        return getItemPossessor(oItem, null);
    }

    public final int
    getItemPropertyCostTable(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        return getItemPropertyCostTable(iProp, null);
    }

    public final int
    getItemPropertyCostTableValue(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        return getItemPropertyCostTableValue(iProp, null);
    }

    public final DurationType
    getItemPropertyDurationType(NWItemProperty ip)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        return getItemPropertyDurationType(ip, null);
    }

    public final int
    getItemPropertyParam1(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        return getItemPropertyParam1(iProp, null);
    }

    public final int
    getItemPropertyParam1Value(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        return getItemPropertyParam1Value(iProp, null);
    }

    public final int
    getItemPropertySubType(NWItemProperty iProperty)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        return getItemPropertySubType(iProperty, null);
    }

    public final int
    getItemPropertyType(NWItemProperty ip)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        return getItemPropertyType(ip, null);
    }

    public final int
    getItemStackSize(NWObject oItem)
        throws NotInContextException
    {
        return getItemStackSize(oItem, null);
    }

    public final int
    getJournalQuestExperience(String szPlotID)
        throws NotInContextException
    {
        return getJournalQuestExperience(szPlotID, null);
    }

    public final String
    getKeyRequiredFeedback(NWObject oObject)
        throws NotInContextException
    {
        return getKeyRequiredFeedback(oObject, null);
    }

    public final AssociateCommand
    getLastAssociateCommand(NWObject oAssociate)
        throws NotInContextException
    {
        return getLastAssociateCommand(oAssociate, null);
    }

    public final CombatMode
    getLastAttackMode(NWObject oCreature)
        throws NotInContextException
    {
        return getLastAttackMode(oCreature, null);
    }

    public final SpecialAttack
    getLastAttackType(NWObject oCreature)
        throws NotInContextException
    {
        return getLastAttackType(oCreature, null);
    }

    public final NWObject
    getLastAttacker(NWObject oAttackee)
        throws NotInContextException
    {
        return getLastAttacker(oAttackee, null);
    }

    public final NWObject
    getLastClosedBy()
        throws NotInContextException
    {
        return getLastClosedBy(null);
    }

    public final NWObject
    getLastDamager(NWObject oObject)
        throws NotInContextException
    {
        return getLastDamager(oObject, null);
    }

    public final NWObject
    getLastDisarmed()
        throws NotInContextException
    {
        return getLastDisarmed(null);
    }

    public final NWObject
    getLastDisturbed()
        throws NotInContextException
    {
        return getLastDisturbed(null);
    }

    public final NWObject
    getLastHostileActor(NWObject oVictim)
        throws NotInContextException
    {
        return getLastHostileActor(oVictim, null);
    }

    public final NWObject
    getLastKiller()
        throws NotInContextException
    {
        return getLastKiller(null);
    }

    public final NWObject
    getLastLocked()
        throws NotInContextException
    {
        return getLastLocked(null);
    }

    public final NWObject
    getLastOpenedBy()
        throws NotInContextException
    {
        return getLastOpenedBy(null);
    }

    public final NWObject
    getLastPCRested()
        throws NotInContextException
    {
        return getLastPCRested(null);
    }

    public final NWObject
    getLastPCToCancelCutscene()
        throws NotInContextException
    {
        return getLastPCToCancelCutscene(null);
    }

    public final NWObject
    getLastPerceived()
        throws NotInContextException
    {
        return getLastPerceived(null);
    }

    public final boolean
    getLastPerceptionHeard()
        throws NotInContextException
    {
        return getLastPerceptionHeard(null);
    }

    public final boolean
    getLastPerceptionInaudible()
        throws NotInContextException
    {
        return getLastPerceptionInaudible(null);
    }

    public final boolean
    getLastPerceptionSeen()
        throws NotInContextException
    {
        return getLastPerceptionSeen(null);
    }

    public final boolean
    getLastPerceptionVanished()
        throws NotInContextException
    {
        return getLastPerceptionVanished(null);
    }

    public final NWObject
    getLastPlayerDied()
        throws NotInContextException
    {
        return getLastPlayerDied(null);
    }

    public final NWObject
    getLastPlayerDying()
        throws NotInContextException
    {
        return getLastPlayerDying(null);
    }

    public final NWObject
    getLastRespawnButtonPresser()
        throws NotInContextException
    {
        return getLastRespawnButtonPresser(null);
    }

    public final int
    getLastRestEventType()
        throws NotInContextException
    {
        return getLastRestEventType(null);
    }

    public final NWObject
    getLastSpeaker()
        throws NotInContextException
    {
        return getLastSpeaker(null);
    }

    public final int
    getLastSpell()
        throws NotInContextException
    {
        return getLastSpell(null);
    }

    public final int
    getLastSpellCastClass()
        throws NotInContextException
    {
        return getLastSpellCastClass(null);
    }

    public final NWObject
    getLastSpellCaster()
        throws NotInContextException
    {
        return getLastSpellCaster(null);
    }

    public final boolean
    getLastSpellHarmful()
        throws NotInContextException
    {
        return getLastSpellHarmful(null);
    }

    public final NWObject
    getLastTrapDetected(NWObject oTarget)
        throws NotInContextException
    {
        return getLastTrapDetected(oTarget, null);
    }

    public final NWObject
    getLastUnlocked()
        throws NotInContextException
    {
        return getLastUnlocked(null);
    }

    public final NWObject
    getLastUsedBy()
        throws NotInContextException
    {
        return getLastUsedBy(null);
    }

    public final NWObject
    getLastWeaponUsed(NWObject oCreature)
        throws NotInContextException
    {
        return getLastWeaponUsed(oCreature, null);
    }

    public final int
    getLawChaosValue(NWObject oCreature)
        throws NotInContextException
    {
        return getLawChaosValue(oCreature, null);
    }

    public final int
    getLevelByClass(int nClassType, NWObject oCreature)
        throws NotInContextException
    {
        return getLevelByClass(nClassType, oCreature, null);
    }

    public final int
    getLevelByPosition(int nClassPosition, NWObject oCreature)
        throws NotInContextException
    {
        return getLevelByPosition(nClassPosition, oCreature, null);
    }

    public final int
    getListenPatternNumber()
        throws NotInContextException
    {
        return getListenPatternNumber(null);
    }

    public final double
    getLocalFloat(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        return getLocalFloat(oObject, sVarName, null);
    }

    public final int
    getLocalInt(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        return getLocalInt(oObject, sVarName, null);
    }

    public final NWLocation
    getLocalLocation(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        return getLocalLocation(oObject, sVarName, null);
    }

    public final NWObject
    getLocalObject(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        return getLocalObject(oObject, sVarName, null);
    }

    public final String
    getLocalString(NWObject oObject, String sVarName)
        throws NotInContextException
    {
        return getLocalString(oObject, sVarName, null);
    }

    public final NWLocation
    getLocation(NWObject oObject)
        throws NotInContextException
    {
        return getLocation(oObject, null);
    }

    public final boolean
    getLockKeyRequired(NWObject oObject)
        throws NotInContextException
    {
        return getLockKeyRequired(oObject, null);
    }

    public final String
    getLockKeyTag(NWObject oObject)
        throws NotInContextException
    {
        return getLockKeyTag(oObject, null);
    }

    public final int
    getLockLockDC(NWObject oObject)
        throws NotInContextException
    {
        return getLockLockDC(oObject, null);
    }

    public final boolean
    getLockLockable(NWObject oObject)
        throws NotInContextException
    {
        return getLockLockable(oObject, null);
    }

    public final int
    getLockUnlockDC(NWObject oObject)
        throws NotInContextException
    {
        return getLockUnlockDC(oObject, null);
    }

    public final boolean
    getLocked(NWObject oTarget)
        throws NotInContextException
    {
        return getLocked(oTarget, null);
    }

    public final boolean
    getLootable(NWObject oCreature)
        throws NotInContextException
    {
        return getLootable(oCreature, null);
    }

    public final NWObject
    getMaster(NWObject oAssociate)
        throws NotInContextException
    {
        return getMaster(oAssociate, null);
    }

    public final String
    getMatchedSubstring(int nString)
        throws NotInContextException
    {
        return getMatchedSubstring(nString, null);
    }

    public final int
    getMatchedSubstringsCount()
        throws NotInContextException
    {
        return getMatchedSubstringsCount(null);
    }

    public final int
    getMaxHenchmen()
        throws NotInContextException
    {
        return getMaxHenchmen(null);
    }

    public final int
    getMaxHitPoints(NWObject oObject)
        throws NotInContextException
    {
        return getMaxHitPoints(oObject, null);
    }

    public final MetaMagic
    getMetaMagicFeat()
        throws NotInContextException
    {
        return getMetaMagicFeat(null);
    }

    public final NWObject
    getModule()
        throws NotInContextException
    {
        return getModule(null);
    }

    public final NWObject
    getModuleItemAcquired()
        throws NotInContextException
    {
        return getModuleItemAcquired(null);
    }

    public final NWObject
    getModuleItemAcquiredBy()
        throws NotInContextException
    {
        return getModuleItemAcquiredBy(null);
    }

    public final NWObject
    getModuleItemAcquiredFrom()
        throws NotInContextException
    {
        return getModuleItemAcquiredFrom(null);
    }

    public final int
    getModuleItemAcquiredStackSize()
        throws NotInContextException
    {
        return getModuleItemAcquiredStackSize(null);
    }

    public final NWObject
    getModuleItemLost()
        throws NotInContextException
    {
        return getModuleItemLost(null);
    }

    public final NWObject
    getModuleItemLostBy()
        throws NotInContextException
    {
        return getModuleItemLostBy(null);
    }

    public final String
    getModuleName()
        throws NotInContextException
    {
        return getModuleName(null);
    }

    public final int
    getModuleXPScale()
        throws NotInContextException
    {
        return getModuleXPScale(null);
    }

    public final int
    getMovementRate(NWObject oCreature)
        throws NotInContextException
    {
        return getMovementRate(oCreature, null);
    }

    public final String
    getName(NWObject oObject, boolean bOriginalName)
        throws NotInContextException
    {
        return getName(oObject, bOriginalName, null);
    }

    public final NWObject
    getNearestCreature(int nFirstCriteriaType, int nFirstCriteriaValue, NWObject oTarget, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue)
        throws NotInContextException
    {
        return getNearestCreature(nFirstCriteriaType, nFirstCriteriaValue, oTarget, nNth, nSecondCriteriaType, nSecondCriteriaValue, nThirdCriteriaType, nThirdCriteriaValue, null);
    }

    public final NWObject
    getNearestCreatureToLocation(int nFirstCriteriaType, int nFirstCriteriaValue, NWLocation lLocation, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue)
        throws NotInContextException
    {
        return getNearestCreatureToLocation(nFirstCriteriaType, nFirstCriteriaValue, lLocation, nNth, nSecondCriteriaType, nSecondCriteriaValue, nThirdCriteriaType, nThirdCriteriaValue, null);
    }

    public final NWObject
    getNearestObject(ObjectType tObjectType, NWObject oTarget, int nNth)
        throws NotInContextException
    {
        return getNearestObject(tObjectType, oTarget, nNth, null);
    }

    public final NWObject
    getNearestObjectByTag(String sTag, NWObject oTarget, int nNth)
        throws NotInContextException
    {
        return getNearestObjectByTag(sTag, oTarget, nNth, null);
    }

    public final NWObject
    getNearestObjectToLocation(ObjectType tObjectType, NWLocation lLocation, int nNth)
        throws NotInContextException
    {
        return getNearestObjectToLocation(tObjectType, lLocation, nNth, null);
    }

    public final NWObject
    getNearestTrapToObject(NWObject oTarget, boolean bTrapDetected)
        throws NotInContextException
    {
        return getNearestTrapToObject(oTarget, bTrapDetected, null);
    }

    public final int
    getNumStackedItems(NWObject oItem)
        throws NotInContextException
    {
        return getNumStackedItems(oItem, null);
    }

    public final NWObject
    getObjectByTag(String sTag, int nNth)
        throws NotInContextException
    {
        return getObjectByTag(sTag, nNth, null);
    }

    public final boolean
    getObjectHeard(NWObject oTarget, NWObject oSource)
        throws NotInContextException
    {
        return getObjectHeard(oTarget, oSource, null);
    }

    public final boolean
    getObjectSeen(NWObject oTarget, NWObject oSource)
        throws NotInContextException
    {
        return getObjectSeen(oTarget, oSource, null);
    }

    public final ObjectType
    getObjectType(NWObject oTarget)
        throws NotInContextException
    {
        return getObjectType(oTarget, null);
    }

    public final String
    getPCChatMessage()
        throws NotInContextException
    {
        return getPCChatMessage(null);
    }

    public final NWObject
    getPCChatSpeaker()
        throws NotInContextException
    {
        return getPCChatSpeaker(null);
    }

    public final int
    getPCChatVolume()
        throws NotInContextException
    {
        return getPCChatVolume(null);
    }

    public final String
    getPCIPAddress(NWObject oPlayer)
        throws NotInContextException
    {
        return getPCIPAddress(oPlayer, null);
    }

    public final NWObject
    getPCItemLastEquipped()
        throws NotInContextException
    {
        return getPCItemLastEquipped(null);
    }

    public final NWObject
    getPCItemLastEquippedBy()
        throws NotInContextException
    {
        return getPCItemLastEquippedBy(null);
    }

    public final NWObject
    getPCItemLastUnequipped()
        throws NotInContextException
    {
        return getPCItemLastUnequipped(null);
    }

    public final NWObject
    getPCItemLastUnequippedBy()
        throws NotInContextException
    {
        return getPCItemLastUnequippedBy(null);
    }

    public final NWObject
    getPCLevellingUp()
        throws NotInContextException
    {
        return getPCLevellingUp(null);
    }

    public final String
    getPCPlayerName(NWObject oPlayer)
        throws NotInContextException
    {
        return getPCPlayerName(oPlayer, null);
    }

    public final String
    getPCPublicCDKey(NWObject oPlayer, boolean bSinglePlayerCDKey)
        throws NotInContextException
    {
        return getPCPublicCDKey(oPlayer, bSinglePlayerCDKey, null);
    }

    public final NWObject
    getPCSpeaker()
        throws NotInContextException
    {
        return getPCSpeaker(null);
    }

    public final PhenoType
    getPhenoType(NWObject oCreature)
        throws NotInContextException
    {
        return getPhenoType(oCreature, null);
    }

    public final boolean
    getPickpocketableFlag(NWObject oItem)
        throws NotInContextException
    {
        return getPickpocketableFlag(oItem, null);
    }

    public final int
    getPlaceableIllumination(NWObject oPlaceable)
        throws NotInContextException
    {
        return getPlaceableIllumination(oPlaceable, null);
    }

    public final NWObject
    getPlaceableLastClickedBy()
        throws NotInContextException
    {
        return getPlaceableLastClickedBy(null);
    }

    public final boolean
    getPlotFlag(NWObject oTarget)
        throws NotInContextException
    {
        return getPlotFlag(oTarget, null);
    }

    public final int
    getPortraitId(NWObject oTarget)
        throws NotInContextException
    {
        return getPortraitId(oTarget, null);
    }

    public final String
    getPortraitResRef(NWObject oTarget)
        throws NotInContextException
    {
        return getPortraitResRef(oTarget, null);
    }

    public final NWVector
    getPosition(NWObject oTarget)
        throws NotInContextException
    {
        return getPosition(oTarget, null);
    }

    public final RacialType
    getRacialType(NWObject oCreature)
        throws NotInContextException
    {
        return getRacialType(oCreature, null);
    }

    public final int
    getReflexAdjustedDamage(int nDamage, NWObject oTarget, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException
    {
        return getReflexAdjustedDamage(nDamage, oTarget, nDC, tSaveType, oSaveVersus, null);
    }

    public final int
    getReflexSavingThrow(NWObject oTarget)
        throws NotInContextException
    {
        return getReflexSavingThrow(oTarget, null);
    }

    public final int
    getReputation(NWObject oSource, NWObject oTarget)
        throws NotInContextException
    {
        return getReputation(oSource, oTarget, null);
    }

    public final String
    getResRef(NWObject oObject)
        throws NotInContextException
    {
        return getResRef(oObject, null);
    }

    public final NWObject
    getSittingCreature(NWObject oChair)
        throws NotInContextException
    {
        return getSittingCreature(oChair, null);
    }

    public final int
    getSkillRank(int nSkill, NWObject oTarget, boolean bBaseSkillRank)
        throws NotInContextException
    {
        return getSkillRank(nSkill, oTarget, bBaseSkillRank, null);
    }

    public final int
    getSkyBox(NWObject oArea)
        throws NotInContextException
    {
        return getSkyBox(oArea, null);
    }

    public final NWObject
    getSpellCastItem()
        throws NotInContextException
    {
        return getSpellCastItem(null);
    }

    public final int
    getSpellId()
        throws NotInContextException
    {
        return getSpellId(null);
    }

    public final int
    getSpellResistance(NWObject oCreature)
        throws NotInContextException
    {
        return getSpellResistance(oCreature, null);
    }

    public final int
    getSpellSaveDC()
        throws NotInContextException
    {
        return getSpellSaveDC(null);
    }

    public final NWLocation
    getSpellTargetLocation()
        throws NotInContextException
    {
        return getSpellTargetLocation(null);
    }

    public final NWObject
    getSpellTargetObject()
        throws NotInContextException
    {
        return getSpellTargetObject(null);
    }

    public final int
    getStandardFactionReputation(StandardFaction tStandardFaction, NWObject oCreature)
        throws NotInContextException
    {
        return getStandardFactionReputation(tStandardFaction, oCreature, null);
    }

    public final NWLocation
    getStartingLocation()
        throws NotInContextException
    {
        return getStartingLocation(null);
    }

    public final NWN.Persistable
    getState(String key)
        throws StateNotAvailableException
    {
        return getState(key, null);
    }

    public final int
    getStealthMode(NWObject oCreature)
        throws NotInContextException
    {
        return getStealthMode(oCreature, null);
    }

    public final boolean
    getStolenFlag(NWObject oStolen)
        throws NotInContextException
    {
        return getStolenFlag(oStolen, null);
    }

    public final int
    getStoreGold(NWObject oidStore)
        throws NotInContextException
    {
        return getStoreGold(oidStore, null);
    }

    public final int
    getStoreIdentifyCost(NWObject oidStore)
        throws NotInContextException
    {
        return getStoreIdentifyCost(oidStore, null);
    }

    public final int
    getStoreMaxBuyPrice(NWObject oidStore)
        throws NotInContextException
    {
        return getStoreMaxBuyPrice(oidStore, null);
    }

    public final double
    getStrRefSoundDuration(int nStrRef)
        throws NotInContextException
    {
        return getStrRefSoundDuration(nStrRef, null);
    }

    public final String
    getStringByStrRef(int nStrRef, Gender tGender)
        throws NotInContextException
    {
        return getStringByStrRef(nStrRef, tGender, null);
    }

    public final String
    getSubRace(NWObject oTarget)
        throws NotInContextException
    {
        return getSubRace(oTarget, null);
    }

    public final String
    getTag(NWObject oObject)
        throws NotInContextException
    {
        return getTag(oObject, null);
    }

    public final TileMainLightColor
    getTileMainLight1Color(NWLocation lTile)
        throws NotInContextException
    {
        return getTileMainLight1Color(lTile, null);
    }

    public final TileMainLightColor
    getTileMainLight2Color(NWLocation lTile)
        throws NotInContextException
    {
        return getTileMainLight2Color(lTile, null);
    }

    public final TileSourceLightColor
    getTileSourceLight1Color(NWLocation lTile)
        throws NotInContextException
    {
        return getTileSourceLight1Color(lTile, null);
    }

    public final TileSourceLightColor
    getTileSourceLight2Color(NWLocation lTile)
        throws NotInContextException
    {
        return getTileSourceLight2Color(lTile, null);
    }

    public final String
    getTilesetResRef(NWObject oArea)
        throws NotInContextException
    {
        return getTilesetResRef(oArea, null);
    }

    public final int
    getTimeHour()
        throws NotInContextException
    {
        return getTimeHour(null);
    }

    public final int
    getTimeMillisecond()
        throws NotInContextException
    {
        return getTimeMillisecond(null);
    }

    public final int
    getTimeMinute()
        throws NotInContextException
    {
        return getTimeMinute(null);
    }

    public final int
    getTimeSecond()
        throws NotInContextException
    {
        return getTimeSecond(null);
    }

    public final int
    getTotalDamageDealt()
        throws NotInContextException
    {
        return getTotalDamageDealt(null);
    }

    public final NWObject
    getTransitionTarget(NWObject oTransition)
        throws NotInContextException
    {
        return getTransitionTarget(oTransition, null);
    }

    public final boolean
    getTrapActive(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapActive(oTrapObject, null);
    }

    public final int
    getTrapBaseType(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapBaseType(oTrapObject, null);
    }

    public final NWObject
    getTrapCreator(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapCreator(oTrapObject, null);
    }

    public final int
    getTrapDetectDC(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapDetectDC(oTrapObject, null);
    }

    public final boolean
    getTrapDetectable(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapDetectable(oTrapObject, null);
    }

    public final boolean
    getTrapDetectedBy(NWObject oTrapObject, NWObject oCreature)
        throws NotInContextException
    {
        return getTrapDetectedBy(oTrapObject, oCreature, null);
    }

    public final int
    getTrapDisarmDC(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapDisarmDC(oTrapObject, null);
    }

    public final boolean
    getTrapDisarmable(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapDisarmable(oTrapObject, null);
    }

    public final boolean
    getTrapFlagged(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapFlagged(oTrapObject, null);
    }

    public final String
    getTrapKeyTag(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapKeyTag(oTrapObject, null);
    }

    public final boolean
    getTrapOneShot(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapOneShot(oTrapObject, null);
    }

    public final boolean
    getTrapRecoverable(NWObject oTrapObject)
        throws NotInContextException
    {
        return getTrapRecoverable(oTrapObject, null);
    }

    public final int
    getTurnResistanceHD(NWObject oUndead)
        throws NotInContextException
    {
        return getTurnResistanceHD(oUndead, null);
    }

    public final boolean
    getUseableFlag(NWObject oObject)
        throws NotInContextException
    {
        return getUseableFlag(oObject, null);
    }

    public final int
    getUserDefinedEventNumber()
        throws NotInContextException
    {
        return getUserDefinedEventNumber(null);
    }

    public final NWObject
    getWaypointByTag(String sWaypointTag)
        throws NotInContextException
    {
        return getWaypointByTag(sWaypointTag, null);
    }

    public final boolean
    getWeaponRanged(NWObject oItem)
        throws NotInContextException
    {
        return getWeaponRanged(oItem, null);
    }

    public final Weather
    getWeather(NWObject oArea)
        throws NotInContextException
    {
        return getWeather(oArea, null);
    }

    public final int
    getWeight(NWObject oTarget)
        throws NotInContextException
    {
        return getWeight(oTarget, null);
    }

    public final int
    getWillSavingThrow(NWObject oTarget)
        throws NotInContextException
    {
        return getWillSavingThrow(oTarget, null);
    }

    public final int
    getXP(NWObject oCreature)
        throws NotInContextException
    {
        return getXP(oCreature, null);
    }

    public final void
    giveGoldToCreature(NWObject oCreature, int nGP)
        throws NotInContextException
    {
        giveGoldToCreature(oCreature, nGP, null);
    }

    public final void
    giveXPToCreature(NWObject oCreature, int nXpAmount)
        throws NotInContextException
    {
        giveXPToCreature(oCreature, nXpAmount, null);
    }

    public final boolean
    hasState(String key)
    {
        return hasState(key, null);
    }

    public final double
    hoursToSeconds(int nHours)
        throws NotInContextException
    {
        return hoursToSeconds(nHours, null);
    }

    public final void
    incrementRemainingFeatUses(NWObject oCreature, int nFeat)
        throws NotInContextException
    {
        incrementRemainingFeatUses(oCreature, nFeat, null);
    }

    public final boolean
    isInConversation(NWObject oObject)
        throws NotInContextException
    {
        return isInConversation(oObject, null);
    }

    public final NWItemProperty
    itemPropertyACBonus(int nBonus)
        throws NotInContextException
    {
        return itemPropertyACBonus(nBonus, null);
    }

    public final NWItemProperty
    itemPropertyACBonusVsAlign(IPAlignGroup tIPAlignGroup, int nACBonus)
        throws NotInContextException
    {
        return itemPropertyACBonusVsAlign(tIPAlignGroup, nACBonus, null);
    }

    public final NWItemProperty
    itemPropertyACBonusVsDmgType(IPDamageType tIPDamageType, int nACBonus)
        throws NotInContextException
    {
        return itemPropertyACBonusVsDmgType(tIPDamageType, nACBonus, null);
    }

    public final NWItemProperty
    itemPropertyACBonusVsRace(IPRacialType tIPRacialType, int nACBonus)
        throws NotInContextException
    {
        return itemPropertyACBonusVsRace(tIPRacialType, nACBonus, null);
    }

    public final NWItemProperty
    itemPropertyACBonusVsSAlign(Alignment tAlignment, int nACBonus)
        throws NotInContextException
    {
        return itemPropertyACBonusVsSAlign(tAlignment, nACBonus, null);
    }

    public final NWItemProperty
    itemPropertyAbilityBonus(Ability tAbility, int nBonus)
        throws NotInContextException
    {
        return itemPropertyAbilityBonus(tAbility, nBonus, null);
    }

    public final NWItemProperty
    itemPropertyAdditional(int nAdditionalProperty)
        throws NotInContextException
    {
        return itemPropertyAdditional(nAdditionalProperty, null);
    }

    public final NWItemProperty
    itemPropertyArcaneSpellFailure(int nModLevel)
        throws NotInContextException
    {
        return itemPropertyArcaneSpellFailure(nModLevel, null);
    }

    public final NWItemProperty
    itemPropertyAttackBonus(int nBonus)
        throws NotInContextException
    {
        return itemPropertyAttackBonus(nBonus, null);
    }

    public final NWItemProperty
    itemPropertyAttackBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus)
        throws NotInContextException
    {
        return itemPropertyAttackBonusVsAlign(tIPAlignGroup, nBonus, null);
    }

    public final NWItemProperty
    itemPropertyAttackBonusVsRace(IPRacialType tIPRacialType, int nBonus)
        throws NotInContextException
    {
        return itemPropertyAttackBonusVsRace(tIPRacialType, nBonus, null);
    }

    public final NWItemProperty
    itemPropertyAttackBonusVsSAlign(Alignment tAlignment, int nBonus)
        throws NotInContextException
    {
        return itemPropertyAttackBonusVsSAlign(tAlignment, nBonus, null);
    }

    public final NWItemProperty
    itemPropertyAttackPenalty(int nPenalty)
        throws NotInContextException
    {
        return itemPropertyAttackPenalty(nPenalty, null);
    }

    public final NWItemProperty
    itemPropertyBonusFeat(int nFeat)
        throws NotInContextException
    {
        return itemPropertyBonusFeat(nFeat, null);
    }

    public final NWItemProperty
    itemPropertyBonusLevelSpell(int nClass, int nSpellLevel)
        throws NotInContextException
    {
        return itemPropertyBonusLevelSpell(nClass, nSpellLevel, null);
    }

    public final NWItemProperty
    itemPropertyBonusSavingThrow(int nBaseSaveType, int nBonus)
        throws NotInContextException
    {
        return itemPropertyBonusSavingThrow(nBaseSaveType, nBonus, null);
    }

    public final NWItemProperty
    itemPropertyBonusSavingThrowVsX(int nBonusType, int nBonus)
        throws NotInContextException
    {
        return itemPropertyBonusSavingThrowVsX(nBonusType, nBonus, null);
    }

    public final NWItemProperty
    itemPropertyBonusSpellResistance(int nBonus)
        throws NotInContextException
    {
        return itemPropertyBonusSpellResistance(nBonus, null);
    }

    public final NWItemProperty
    itemPropertyCastSpell(int nSpell, int nNumUses)
        throws NotInContextException
    {
        return itemPropertyCastSpell(nSpell, nNumUses, null);
    }

    public final NWItemProperty
    itemPropertyContainerReducedWeight(int nContainerType)
        throws NotInContextException
    {
        return itemPropertyContainerReducedWeight(nContainerType, null);
    }

    public final NWItemProperty
    itemPropertyDamageBonus(IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException
    {
        return itemPropertyDamageBonus(tIPDamageType, nDamage, null);
    }

    public final NWItemProperty
    itemPropertyDamageBonusVsAlign(IPAlignGroup tIPAlignGroup, IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException
    {
        return itemPropertyDamageBonusVsAlign(tIPAlignGroup, tIPDamageType, nDamage, null);
    }

    public final NWItemProperty
    itemPropertyDamageBonusVsRace(IPRacialType tIPRacialType, IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException
    {
        return itemPropertyDamageBonusVsRace(tIPRacialType, tIPDamageType, nDamage, null);
    }

    public final NWItemProperty
    itemPropertyDamageBonusVsSAlign(Alignment tAlignment, IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException
    {
        return itemPropertyDamageBonusVsSAlign(tAlignment, tIPDamageType, nDamage, null);
    }

    public final NWItemProperty
    itemPropertyDamageImmunity(IPDamageType tIPDamageType, int nImmuneBonus)
        throws NotInContextException
    {
        return itemPropertyDamageImmunity(tIPDamageType, nImmuneBonus, null);
    }

    public final NWItemProperty
    itemPropertyDamagePenalty(int nPenalty)
        throws NotInContextException
    {
        return itemPropertyDamagePenalty(nPenalty, null);
    }

    public final NWItemProperty
    itemPropertyDamageReduction(int nEnhancement, int nHPSoak)
        throws NotInContextException
    {
        return itemPropertyDamageReduction(nEnhancement, nHPSoak, null);
    }

    public final NWItemProperty
    itemPropertyDamageResistance(IPDamageType tIPDamageType, int nHPResist)
        throws NotInContextException
    {
        return itemPropertyDamageResistance(tIPDamageType, nHPResist, null);
    }

    public final NWItemProperty
    itemPropertyDamageVulnerability(IPDamageType tIPDamageType, int nVulnerability)
        throws NotInContextException
    {
        return itemPropertyDamageVulnerability(tIPDamageType, nVulnerability, null);
    }

    public final NWItemProperty
    itemPropertyDarkvision()
        throws NotInContextException
    {
        return itemPropertyDarkvision(null);
    }

    public final NWItemProperty
    itemPropertyDecreaseAC(int nModifierType, int nPenalty)
        throws NotInContextException
    {
        return itemPropertyDecreaseAC(nModifierType, nPenalty, null);
    }

    public final NWItemProperty
    itemPropertyDecreaseAbility(Ability tAbility, int nModifier)
        throws NotInContextException
    {
        return itemPropertyDecreaseAbility(tAbility, nModifier, null);
    }

    public final NWItemProperty
    itemPropertyDecreaseSkill(int nSkill, int nPenalty)
        throws NotInContextException
    {
        return itemPropertyDecreaseSkill(nSkill, nPenalty, null);
    }

    public final NWItemProperty
    itemPropertyEnhancementBonus(int nEnhancementBonus)
        throws NotInContextException
    {
        return itemPropertyEnhancementBonus(nEnhancementBonus, null);
    }

    public final NWItemProperty
    itemPropertyEnhancementBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus)
        throws NotInContextException
    {
        return itemPropertyEnhancementBonusVsAlign(tIPAlignGroup, nBonus, null);
    }

    public final NWItemProperty
    itemPropertyEnhancementBonusVsRace(IPRacialType tIPRacialType, int nBonus)
        throws NotInContextException
    {
        return itemPropertyEnhancementBonusVsRace(tIPRacialType, nBonus, null);
    }

    public final NWItemProperty
    itemPropertyEnhancementBonusVsSAlign(Alignment tAlignment, int nBonus)
        throws NotInContextException
    {
        return itemPropertyEnhancementBonusVsSAlign(tAlignment, nBonus, null);
    }

    public final NWItemProperty
    itemPropertyEnhancementPenalty(int nPenalty)
        throws NotInContextException
    {
        return itemPropertyEnhancementPenalty(nPenalty, null);
    }

    public final NWItemProperty
    itemPropertyExtraMeleeDamageType(IPDamageType tIPDamageType)
        throws NotInContextException
    {
        return itemPropertyExtraMeleeDamageType(tIPDamageType, null);
    }

    public final NWItemProperty
    itemPropertyExtraRangeDamageType(IPDamageType tIPDamageType)
        throws NotInContextException
    {
        return itemPropertyExtraRangeDamageType(tIPDamageType, null);
    }

    public final NWItemProperty
    itemPropertyFreeAction()
        throws NotInContextException
    {
        return itemPropertyFreeAction(null);
    }

    public final NWItemProperty
    itemPropertyHaste()
        throws NotInContextException
    {
        return itemPropertyHaste(null);
    }

    public final NWItemProperty
    itemPropertyHealersKit(int nModifier)
        throws NotInContextException
    {
        return itemPropertyHealersKit(nModifier, null);
    }

    public final NWItemProperty
    itemPropertyHolyAvenger()
        throws NotInContextException
    {
        return itemPropertyHolyAvenger(null);
    }

    public final NWItemProperty
    itemPropertyImmunityMisc(IPMiscImmunityType tIPMiscImmunityType)
        throws NotInContextException
    {
        return itemPropertyImmunityMisc(tIPMiscImmunityType, null);
    }

    public final NWItemProperty
    itemPropertyImmunityToSpellLevel(int nLevel)
        throws NotInContextException
    {
        return itemPropertyImmunityToSpellLevel(nLevel, null);
    }

    public final NWItemProperty
    itemPropertyImprovedEvasion()
        throws NotInContextException
    {
        return itemPropertyImprovedEvasion(null);
    }

    public final NWItemProperty
    itemPropertyKeen()
        throws NotInContextException
    {
        return itemPropertyKeen(null);
    }

    public final NWItemProperty
    itemPropertyLight(int nBrightness, int nColor)
        throws NotInContextException
    {
        return itemPropertyLight(nBrightness, nColor, null);
    }

    public final NWItemProperty
    itemPropertyLimitUseByAlign(IPAlignGroup tIPAlignGroup)
        throws NotInContextException
    {
        return itemPropertyLimitUseByAlign(tIPAlignGroup, null);
    }

    public final NWItemProperty
    itemPropertyLimitUseByClass(int nClass)
        throws NotInContextException
    {
        return itemPropertyLimitUseByClass(nClass, null);
    }

    public final NWItemProperty
    itemPropertyLimitUseByRace(IPRacialType tIPRacialType)
        throws NotInContextException
    {
        return itemPropertyLimitUseByRace(tIPRacialType, null);
    }

    public final NWItemProperty
    itemPropertyLimitUseBySAlign(Alignment tAlignment)
        throws NotInContextException
    {
        return itemPropertyLimitUseBySAlign(tAlignment, null);
    }

    public final NWItemProperty
    itemPropertyMassiveCritical(int nDamage)
        throws NotInContextException
    {
        return itemPropertyMassiveCritical(nDamage, null);
    }

    public final NWItemProperty
    itemPropertyMaterial(int nMaterialType)
        throws NotInContextException
    {
        return itemPropertyMaterial(nMaterialType, null);
    }

    public final NWItemProperty
    itemPropertyMaxRangeStrengthMod(int nModifier)
        throws NotInContextException
    {
        return itemPropertyMaxRangeStrengthMod(nModifier, null);
    }

    public final NWItemProperty
    itemPropertyMonsterDamage(int nDamage)
        throws NotInContextException
    {
        return itemPropertyMonsterDamage(nDamage, null);
    }

    public final NWItemProperty
    itemPropertyNoDamage()
        throws NotInContextException
    {
        return itemPropertyNoDamage(null);
    }

    public final NWItemProperty
    itemPropertyOnHitCastSpell(int nSpell, int nLevel)
        throws NotInContextException
    {
        return itemPropertyOnHitCastSpell(nSpell, nLevel, null);
    }

    public final NWItemProperty
    itemPropertyOnHitProps(int nProperty, int nSaveDC, int nSpecial)
        throws NotInContextException
    {
        return itemPropertyOnHitProps(nProperty, nSaveDC, nSpecial, null);
    }

    public final NWItemProperty
    itemPropertyOnMonsterHitProperties(int nProperty, int nSpecial)
        throws NotInContextException
    {
        return itemPropertyOnMonsterHitProperties(nProperty, nSpecial, null);
    }

    public final NWItemProperty
    itemPropertyQuality(int nQuality)
        throws NotInContextException
    {
        return itemPropertyQuality(nQuality, null);
    }

    public final NWItemProperty
    itemPropertyReducedSavingThrow(int nBonusType, int nPenalty)
        throws NotInContextException
    {
        return itemPropertyReducedSavingThrow(nBonusType, nPenalty, null);
    }

    public final NWItemProperty
    itemPropertyReducedSavingThrowVsX(int nBaseSaveType, int nPenalty)
        throws NotInContextException
    {
        return itemPropertyReducedSavingThrowVsX(nBaseSaveType, nPenalty, null);
    }

    public final NWItemProperty
    itemPropertyRegeneration(int nRegenAmount)
        throws NotInContextException
    {
        return itemPropertyRegeneration(nRegenAmount, null);
    }

    public final NWItemProperty
    itemPropertySkillBonus(int nSkill, int nBonus)
        throws NotInContextException
    {
        return itemPropertySkillBonus(nSkill, nBonus, null);
    }

    public final NWItemProperty
    itemPropertySpecialWalk(int nWalkType)
        throws NotInContextException
    {
        return itemPropertySpecialWalk(nWalkType, null);
    }

    public final NWItemProperty
    itemPropertySpellImmunitySchool(IPSpellSchool tIPSpellSchool)
        throws NotInContextException
    {
        return itemPropertySpellImmunitySchool(tIPSpellSchool, null);
    }

    public final NWItemProperty
    itemPropertySpellImmunitySpecific(int nSpell)
        throws NotInContextException
    {
        return itemPropertySpellImmunitySpecific(nSpell, null);
    }

    public final NWItemProperty
    itemPropertyThievesTools(int nModifier)
        throws NotInContextException
    {
        return itemPropertyThievesTools(nModifier, null);
    }

    public final NWItemProperty
    itemPropertyTrap(int nTrapLevel, IPTrapType tIPTrapType)
        throws NotInContextException
    {
        return itemPropertyTrap(nTrapLevel, tIPTrapType, null);
    }

    public final NWItemProperty
    itemPropertyTrueSeeing()
        throws NotInContextException
    {
        return itemPropertyTrueSeeing(null);
    }

    public final NWItemProperty
    itemPropertyTurnResistance(int nModifier)
        throws NotInContextException
    {
        return itemPropertyTurnResistance(nModifier, null);
    }

    public final NWItemProperty
    itemPropertyUnlimitedAmmo(int nAmmoDamage)
        throws NotInContextException
    {
        return itemPropertyUnlimitedAmmo(nAmmoDamage, null);
    }

    public final NWItemProperty
    itemPropertyVampiricRegeneration(int nRegenAmount)
        throws NotInContextException
    {
        return itemPropertyVampiricRegeneration(nRegenAmount, null);
    }

    public final NWItemProperty
    itemPropertyVisualEffect(int nEffect)
        throws NotInContextException
    {
        return itemPropertyVisualEffect(nEffect, null);
    }

    public final NWItemProperty
    itemPropertyWeightIncrease(int nWeight)
        throws NotInContextException
    {
        return itemPropertyWeightIncrease(nWeight, null);
    }

    public final NWItemProperty
    itemPropertyWeightReduction(int nReduction)
        throws NotInContextException
    {
        return itemPropertyWeightReduction(nReduction, null);
    }

    public final void
    jumpToLocation(NWLocation lDestination)
        throws NotInContextException
    {
        jumpToLocation(lDestination, null);
    }

    public final void
    jumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint)
        throws NotInContextException
    {
        jumpToObject(oToJumpTo, bWalkStraightLineToPoint, null);
    }

    public final int
    levelUpHenchman(NWObject oCreature, int nClass, boolean bReadyAllSpells, int nPackage)
        throws NotInContextException
    {
        return levelUpHenchman(oCreature, nClass, bReadyAllSpells, nPackage, null);
    }

    public final int
    lineOfSightObject(NWObject oSource, NWObject oTarget)
        throws NotInContextException
    {
        return lineOfSightObject(oSource, oTarget, null);
    }

    public final int
    lineOfSightVector(NWVector vSource, NWVector vTarget)
        throws NotInContextException
    {
        return lineOfSightVector(vSource, vTarget, null);
    }

    public final void
    lockCameraDirection(NWObject oPlayer, boolean bLocked)
        throws NotInContextException
    {
        lockCameraDirection(oPlayer, bLocked, null);
    }

    public final void
    lockCameraDistance(NWObject oPlayer, boolean bLocked)
        throws NotInContextException
    {
        lockCameraDistance(oPlayer, bLocked, null);
    }

    public final void
    lockCameraPitch(NWObject oPlayer, boolean bLocked)
        throws NotInContextException
    {
        lockCameraPitch(oPlayer, bLocked, null);
    }

    public final NWEffect
    magicalEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return magicalEffect(eEffect, null);
    }

    public final void
    musicBackgroundChangeDay(NWObject oArea, int nTrack)
        throws NotInContextException
    {
        musicBackgroundChangeDay(oArea, nTrack, null);
    }

    public final void
    musicBackgroundChangeNight(NWObject oArea, int nTrack)
        throws NotInContextException
    {
        musicBackgroundChangeNight(oArea, nTrack, null);
    }

    public final int
    musicBackgroundGetBattleTrack(NWObject oArea)
        throws NotInContextException
    {
        return musicBackgroundGetBattleTrack(oArea, null);
    }

    public final int
    musicBackgroundGetDayTrack(NWObject oArea)
        throws NotInContextException
    {
        return musicBackgroundGetDayTrack(oArea, null);
    }

    public final int
    musicBackgroundGetNightTrack(NWObject oArea)
        throws NotInContextException
    {
        return musicBackgroundGetNightTrack(oArea, null);
    }

    public final void
    musicBackgroundPlay(NWObject oArea)
        throws NotInContextException
    {
        musicBackgroundPlay(oArea, null);
    }

    public final void
    musicBackgroundSetDelay(NWObject oArea, int nDelay)
        throws NotInContextException
    {
        musicBackgroundSetDelay(oArea, nDelay, null);
    }

    public final void
    musicBackgroundStop(NWObject oArea)
        throws NotInContextException
    {
        musicBackgroundStop(oArea, null);
    }

    public final void
    musicBattleChange(NWObject oArea, int nTrack)
        throws NotInContextException
    {
        musicBattleChange(oArea, nTrack, null);
    }

    public final void
    musicBattlePlay(NWObject oArea)
        throws NotInContextException
    {
        musicBattlePlay(oArea, null);
    }

    public final void
    musicBattleStop(NWObject oArea)
        throws NotInContextException
    {
        musicBattleStop(oArea, null);
    }

    public final void
    nightToDay(NWObject oPlayer, double fTransitionTime)
        throws NotInContextException
    {
        nightToDay(oPlayer, fTransitionTime, null);
    }

    public final void
    openInventory(NWObject oCreature, NWObject oPlayer)
        throws NotInContextException
    {
        openInventory(oCreature, oPlayer, null);
    }

    public final void
    openStore(NWObject oStore, NWObject oPC, int nBonusMarkUp, int nBonusMarkDown)
        throws NotInContextException
    {
        openStore(oStore, oPC, nBonusMarkUp, nBonusMarkDown, null);
    }

    public final void
    playAnimation(int nAnimation, double fSpeed, double fSeconds)
        throws NotInContextException
    {
        playAnimation(nAnimation, fSpeed, fSeconds, null);
    }

    public final void
    playSound(String sSoundName)
        throws NotInContextException
    {
        playSound(sSoundName, null);
    }

    public final void
    playSoundByStrRef(int nStrRef, int nRunAsAction)
        throws NotInContextException
    {
        playSoundByStrRef(nStrRef, nRunAsAction, null);
    }

    public final void
    playVoiceChat(int nVoiceChatID, NWObject oTarget)
        throws NotInContextException
    {
        playVoiceChat(nVoiceChatID, oTarget, null);
    }

    public final void
    popUpDeathGUIPanel(NWObject oPC, boolean bRespawnButtonEnabled, boolean bWaitForHelpButtonEnabled, int nHelpStringReference, String sHelpString)
        throws NotInContextException
    {
        popUpDeathGUIPanel(oPC, bRespawnButtonEnabled, bWaitForHelpButtonEnabled, nHelpStringReference, sHelpString, null);
    }

    public final void
    popUpGUIPanel(NWObject oPC, int nGUIPanel)
        throws NotInContextException
    {
        popUpGUIPanel(oPC, nGUIPanel, null);
    }

    public final void
    putState(String key, NWN.Persistable state)
    {
        putState(key, state, null);
    }

    public final String
    randomName(int nNameType)
        throws NotInContextException
    {
        return randomName(nNameType, null);
    }

    public final void
    recomputeStaticLighting(NWObject oArea)
        throws NotInContextException
    {
        recomputeStaticLighting(oArea, null);
    }

    public final SavingThrowResult
    reflexSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException
    {
        return reflexSave(oCreature, nDC, tSaveType, oSaveVersus, null);
    }

    public final void
    removeEffect(NWObject oCreature, NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        removeEffect(oCreature, eEffect, null);
    }

    public final void
    removeFromParty(NWObject oPC)
        throws NotInContextException
    {
        removeFromParty(oPC, null);
    }

    public final void
    removeHenchman(NWObject oMaster, NWObject oHenchman)
        throws NotInContextException
    {
        removeHenchman(oMaster, oHenchman, null);
    }

    public final void
    removeItemProperty(NWObject oItem, NWItemProperty ipProperty)
        throws InvalidItemPropertyException,
               NotInContextException
    {
        removeItemProperty(oItem, ipProperty, null);
    }

    public final void
    removeJournalQuestEntry(String szPlotID, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers)
        throws NotInContextException
    {
        removeJournalQuestEntry(szPlotID, oCreature, bAllPartyMembers, bAllPlayers, null);
    }

    public final void
    removeSummonedAssociate(NWObject oMaster, NWObject oAssociate)
        throws NotInContextException
    {
        removeSummonedAssociate(oMaster, oAssociate, null);
    }

    public final int
    resistSpell(NWObject oCaster, NWObject oTarget)
        throws NotInContextException
    {
        return resistSpell(oCaster, oTarget, null);
    }

    public final void
    restoreBaseAttackBonus(NWObject oCreature)
        throws NotInContextException
    {
        restoreBaseAttackBonus(oCreature, null);
    }

    public final void
    restoreCameraFacing()
        throws NotInContextException
    {
        restoreCameraFacing(null);
    }

    public final NWObject
    retrieveCampaignObject(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oOwner, NWObject oPlayer)
        throws NotInContextException
    {
        return retrieveCampaignObject(sCampaignName, sVarName, locLocation, oOwner, oPlayer, null);
    }

    public final double
    roundsToSeconds(int nRounds)
        throws NotInContextException
    {
        return roundsToSeconds(nRounds, null);
    }

    public final void
    sendMessageToAllDMs(String szMessage)
        throws NotInContextException
    {
        sendMessageToAllDMs(szMessage, null);
    }

    public final void
    sendMessageToPC(NWObject oPlayer, String szMessage)
        throws NotInContextException
    {
        sendMessageToPC(oPlayer, szMessage, null);
    }

    public final void
    sendMessageToPCByStrRef(NWObject oPlayer, int nStrRef)
        throws NotInContextException
    {
        sendMessageToPCByStrRef(oPlayer, nStrRef, null);
    }

    public final void
    setAILevel(NWObject oTarget, AILevel tAILevel)
        throws NotInContextException
    {
        setAILevel(oTarget, tAILevel, null);
    }

    public final void
    setActionMode(NWObject oCreature, ActionMode tActionMode, boolean bStatus)
        throws NotInContextException
    {
        setActionMode(oCreature, tActionMode, bStatus, null);
    }

    public final void
    setAreaTransitionBMP(int nPredefinedAreaTransition, String sCustomAreaTransitionBMP)
        throws NotInContextException
    {
        setAreaTransitionBMP(nPredefinedAreaTransition, sCustomAreaTransitionBMP, null);
    }

    public final void
    setAssociateListenPatterns(NWObject oTarget)
        throws NotInContextException
    {
        setAssociateListenPatterns(oTarget, null);
    }

    public final void
    setBaseAttackBonus(int nBaseAttackBonus, NWObject oCreature)
        throws NotInContextException
    {
        setBaseAttackBonus(nBaseAttackBonus, oCreature, null);
    }

    public final void
    setCalendar(int nYear, int nMonth, int nDay)
        throws NotInContextException
    {
        setCalendar(nYear, nMonth, nDay, null);
    }

    public final void
    setCameraFacing(double fDirection, double fDistance, double fPitch, int nTransitionType)
        throws NotInContextException
    {
        setCameraFacing(fDirection, fDistance, fPitch, nTransitionType, null);
    }

    public final void
    setCameraHeight(NWObject oPlayer, double fHeight)
        throws NotInContextException
    {
        setCameraHeight(oPlayer, fHeight, null);
    }

    public final void
    setCameraMode(NWObject oPlayer, int nCameraMode)
        throws NotInContextException
    {
        setCameraMode(oPlayer, nCameraMode, null);
    }

    public final void
    setCampaignFloat(String sCampaignName, String sVarName, double flFloat, NWObject oPlayer)
        throws NotInContextException
    {
        setCampaignFloat(sCampaignName, sVarName, flFloat, oPlayer, null);
    }

    public final void
    setCampaignInt(String sCampaignName, String sVarName, int nInt, NWObject oPlayer)
        throws NotInContextException
    {
        setCampaignInt(sCampaignName, sVarName, nInt, oPlayer, null);
    }

    public final void
    setCampaignLocation(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oPlayer)
        throws NotInContextException
    {
        setCampaignLocation(sCampaignName, sVarName, locLocation, oPlayer, null);
    }

    public final void
    setCampaignString(String sCampaignName, String sVarName, String sString, NWObject oPlayer)
        throws NotInContextException
    {
        setCampaignString(sCampaignName, sVarName, sString, oPlayer, null);
    }

    public final void
    setCampaignVector(String sCampaignName, String sVarName, NWVector vVector, NWObject oPlayer)
        throws NotInContextException
    {
        setCampaignVector(sCampaignName, sVarName, vVector, oPlayer, null);
    }

    public final void
    setColor(NWObject oObject, int nColorChannel, int nColorValue)
        throws NotInContextException
    {
        setColor(oObject, nColorChannel, nColorValue, null);
    }

    public final void
    setCommandable(boolean bCommandable, NWObject oTarget)
        throws NotInContextException
    {
        setCommandable(bCommandable, oTarget, null);
    }

    public final void
    setCreatureAppearanceType(NWObject oCreature, int nAppearanceType)
        throws NotInContextException
    {
        setCreatureAppearanceType(oCreature, nAppearanceType, null);
    }

    public final void
    setCreatureBodyPart(CreaturePart tCreaturePart, int nModelNumber, NWObject oCreature)
        throws NotInContextException
    {
        setCreatureBodyPart(tCreaturePart, nModelNumber, oCreature, null);
    }

    public final void
    setCreatureTailType(int nTailType, NWObject oCreature)
        throws NotInContextException
    {
        setCreatureTailType(nTailType, oCreature, null);
    }

    public final void
    setCreatureWingType(int nWingType, NWObject oCreature)
        throws NotInContextException
    {
        setCreatureWingType(nWingType, oCreature, null);
    }

    public final void
    setCustomToken(int nCustomTokenNumber, String sTokenValue)
        throws NotInContextException
    {
        setCustomToken(nCustomTokenNumber, sTokenValue, null);
    }

    public final void
    setCutsceneCameraMoveRate(NWObject oCreature, double fRate)
        throws NotInContextException
    {
        setCutsceneCameraMoveRate(oCreature, fRate, null);
    }

    public final void
    setCutsceneMode(NWObject oCreature, boolean bInCutscene, boolean bLeftClickingEnabled)
        throws NotInContextException
    {
        setCutsceneMode(oCreature, bInCutscene, bLeftClickingEnabled, null);
    }

    public final void
    setDeity(NWObject oCreature, String sDeity)
        throws NotInContextException
    {
        setDeity(oCreature, sDeity, null);
    }

    public final void
    setDescription(NWObject oObject, String sNewDescription, boolean bIdentifiedDescription)
        throws NotInContextException
    {
        setDescription(oObject, sNewDescription, bIdentifiedDescription, null);
    }

    public final void
    setDroppableFlag(NWObject oItem, boolean bDroppable)
        throws NotInContextException
    {
        setDroppableFlag(oItem, bDroppable, null);
    }

    public final void
    setEffectIconShown(NWEffect eff, boolean bShown)
        throws InvalidEffectException,
               NotInContextException
    {
        setEffectIconShown(eff, bShown, null);
    }

    public final void
    setEncounterActive(boolean bNewValue, NWObject oEncounter)
        throws NotInContextException
    {
        setEncounterActive(bNewValue, oEncounter, null);
    }

    public final void
    setEncounterDifficulty(int nEncounterDifficulty, NWObject oEncounter)
        throws NotInContextException
    {
        setEncounterDifficulty(nEncounterDifficulty, oEncounter, null);
    }

    public final void
    setEncounterSpawnsCurrent(int nNewValue, NWObject oEncounter)
        throws NotInContextException
    {
        setEncounterSpawnsCurrent(nNewValue, oEncounter, null);
    }

    public final void
    setEncounterSpawnsMax(int nNewValue, NWObject oEncounter)
        throws NotInContextException
    {
        setEncounterSpawnsMax(nNewValue, oEncounter, null);
    }

    public final void
    setFacing(double fDirection)
        throws NotInContextException
    {
        setFacing(fDirection, null);
    }

    public final void
    setFacingPoint(NWVector vTarget)
        throws NotInContextException
    {
        setFacingPoint(vTarget, null);
    }

    public final void
    setFogAmount(int nFogType, int nFogAmount, NWObject oArea)
        throws NotInContextException
    {
        setFogAmount(nFogType, nFogAmount, oArea, null);
    }

    public final void
    setFogColor(int nFogType, int nFogColor, NWObject oArea)
        throws NotInContextException
    {
        setFogColor(nFogType, nFogColor, oArea, null);
    }

    public final void
    setFootstepType(int nFootstepType, NWObject oCreature)
        throws NotInContextException
    {
        setFootstepType(nFootstepType, oCreature, null);
    }

    public final void
    setFortitudeSavingThrow(NWObject oObject, int nFortitudeSave)
        throws NotInContextException
    {
        setFortitudeSavingThrow(oObject, nFortitudeSave, null);
    }

    public final void
    setHardness(int nHardness, NWObject oObject)
        throws NotInContextException
    {
        setHardness(nHardness, oObject, null);
    }

    public final void
    setIdentified(NWObject oItem, boolean bIdentified)
        throws NotInContextException
    {
        setIdentified(oItem, bIdentified, null);
    }

    public final void
    setImmortal(NWObject oCreature, boolean bImmortal)
        throws NotInContextException
    {
        setImmortal(oCreature, bImmortal, null);
    }

    public final void
    setInfiniteFlag(NWObject oItem, boolean bInfinite)
        throws NotInContextException
    {
        setInfiniteFlag(oItem, bInfinite, null);
    }

    public final void
    setIsDestroyable(boolean bDestroyable, boolean bRaiseable, boolean bSelectableWhenDead)
        throws NotInContextException
    {
        setIsDestroyable(bDestroyable, bRaiseable, bSelectableWhenDead, null);
    }

    public final void
    setIsTemporaryEnemy(NWObject oTarget, NWObject oSource, boolean bDecays, double fDurationInSeconds)
        throws NotInContextException
    {
        setIsTemporaryEnemy(oTarget, oSource, bDecays, fDurationInSeconds, null);
    }

    public final void
    setIsTemporaryFriend(NWObject oTarget, NWObject oSource, boolean bDecays, double fDurationInSeconds)
        throws NotInContextException
    {
        setIsTemporaryFriend(oTarget, oSource, bDecays, fDurationInSeconds, null);
    }

    public final void
    setIsTemporaryNeutral(NWObject oTarget, NWObject oSource, boolean bDecays, double fDurationInSeconds)
        throws NotInContextException
    {
        setIsTemporaryNeutral(oTarget, oSource, bDecays, fDurationInSeconds, null);
    }

    public final void
    setItemCharges(NWObject oItem, int nCharges)
        throws NotInContextException
    {
        setItemCharges(oItem, nCharges, null);
    }

    public final void
    setItemCursedFlag(NWObject oItem, boolean bCursed)
        throws NotInContextException
    {
        setItemCursedFlag(oItem, bCursed, null);
    }

    public final void
    setItemStackSize(NWObject oItem, int nSize)
        throws NotInContextException
    {
        setItemStackSize(oItem, nSize, null);
    }

    public final void
    setKeyRequiredFeedback(NWObject oObject, String sFeedbackMessage)
        throws NotInContextException
    {
        setKeyRequiredFeedback(oObject, sFeedbackMessage, null);
    }

    public final void
    setListenPattern(NWObject oObject, String sPattern, int nNumber)
        throws NotInContextException
    {
        setListenPattern(oObject, sPattern, nNumber, null);
    }

    public final void
    setListening(NWObject oObject, boolean bValue)
        throws NotInContextException
    {
        setListening(oObject, bValue, null);
    }

    public final void
    setLocalFloat(NWObject oObject, String sVarName, double fValue)
        throws NotInContextException
    {
        setLocalFloat(oObject, sVarName, fValue, null);
    }

    public final void
    setLocalInt(NWObject oObject, String sVarName, int nValue)
        throws NotInContextException
    {
        setLocalInt(oObject, sVarName, nValue, null);
    }

    public final void
    setLocalLocation(NWObject oObject, String sVarName, NWLocation lValue)
        throws NotInContextException
    {
        setLocalLocation(oObject, sVarName, lValue, null);
    }

    public final void
    setLocalObject(NWObject oObject, String sVarName, NWObject oValue)
        throws NotInContextException
    {
        setLocalObject(oObject, sVarName, oValue, null);
    }

    public final void
    setLocalString(NWObject oObject, String sVarName, String sValue)
        throws NotInContextException
    {
        setLocalString(oObject, sVarName, sValue, null);
    }

    public final void
    setLockKeyRequired(NWObject oObject, boolean bKeyRequired)
        throws NotInContextException
    {
        setLockKeyRequired(oObject, bKeyRequired, null);
    }

    public final void
    setLockKeyTag(NWObject oObject, String sNewKeyTag)
        throws NotInContextException
    {
        setLockKeyTag(oObject, sNewKeyTag, null);
    }

    public final void
    setLockLockDC(NWObject oObject, int nNewLockDC)
        throws NotInContextException
    {
        setLockLockDC(oObject, nNewLockDC, null);
    }

    public final void
    setLockLockable(NWObject oObject, boolean bLockable)
        throws NotInContextException
    {
        setLockLockable(oObject, bLockable, null);
    }

    public final void
    setLockUnlockDC(NWObject oObject, int nNewUnlockDC)
        throws NotInContextException
    {
        setLockUnlockDC(oObject, nNewUnlockDC, null);
    }

    public final void
    setLocked(NWObject oTarget, boolean bLocked)
        throws NotInContextException
    {
        setLocked(oTarget, bLocked, null);
    }

    public final void
    setLootable(NWObject oCreature, boolean bLootable)
        throws NotInContextException
    {
        setLootable(oCreature, bLootable, null);
    }

    public final void
    setMapPinEnabled(NWObject oMapPin, boolean bEnabled)
        throws NotInContextException
    {
        setMapPinEnabled(oMapPin, bEnabled, null);
    }

    public final void
    setMaxHenchmen(int nNumHenchmen)
        throws NotInContextException
    {
        setMaxHenchmen(nNumHenchmen, null);
    }

    public final void
    setModuleXPScale(int nXPScale)
        throws NotInContextException
    {
        setModuleXPScale(nXPScale, null);
    }

    public final void
    setName(NWObject oObject, String sNewName)
        throws NotInContextException
    {
        setName(oObject, sNewName, null);
    }

    public final void
    setPCChatMessage(String sNewChatMessage)
        throws NotInContextException
    {
        setPCChatMessage(sNewChatMessage, null);
    }

    public final void
    setPCChatVolume(TalkVolume tTalkVolume)
        throws NotInContextException
    {
        setPCChatVolume(tTalkVolume, null);
    }

    public final void
    setPCDislike(NWObject oPlayer, NWObject oTarget)
        throws NotInContextException
    {
        setPCDislike(oPlayer, oTarget, null);
    }

    public final void
    setPCLike(NWObject oPlayer, NWObject oTarget)
        throws NotInContextException
    {
        setPCLike(oPlayer, oTarget, null);
    }

    public final void
    setPanelButtonFlash(NWObject oPlayer, Button tButton, boolean bEnableFlash)
        throws NotInContextException
    {
        setPanelButtonFlash(oPlayer, tButton, bEnableFlash, null);
    }

    public final void
    setPhenoType(PhenoType tPhenoType, NWObject oCreature)
        throws NotInContextException
    {
        setPhenoType(tPhenoType, oCreature, null);
    }

    public final void
    setPickpocketableFlag(NWObject oItem, boolean bPickpocketable)
        throws NotInContextException
    {
        setPickpocketableFlag(oItem, bPickpocketable, null);
    }

    public final void
    setPlaceableIllumination(NWObject oPlaceable, boolean bIlluminate)
        throws NotInContextException
    {
        setPlaceableIllumination(oPlaceable, bIlluminate, null);
    }

    public final void
    setPlotFlag(NWObject oTarget, boolean bPlotFlag)
        throws NotInContextException
    {
        setPlotFlag(oTarget, bPlotFlag, null);
    }

    public final void
    setPortraitId(NWObject oTarget, int nPortraitId)
        throws NotInContextException
    {
        setPortraitId(oTarget, nPortraitId, null);
    }

    public final void
    setPortraitResRef(NWObject oTarget, String sPortraitResRef)
        throws NotInContextException
    {
        setPortraitResRef(oTarget, sPortraitResRef, null);
    }

    public final void
    setReflexSavingThrow(NWObject oObject, int nReflexSave)
        throws NotInContextException
    {
        setReflexSavingThrow(oObject, nReflexSave, null);
    }

    public final void
    setSkyBox(int nSkyBox, NWObject oArea)
        throws NotInContextException
    {
        setSkyBox(nSkyBox, oArea, null);
    }

    public final void
    setStandardFactionReputation(StandardFaction tStandardFaction, int nNewReputation, NWObject oCreature)
        throws NotInContextException
    {
        setStandardFactionReputation(tStandardFaction, nNewReputation, oCreature, null);
    }

    public final void
    setStolenFlag(NWObject oItem, boolean bStolenFlag)
        throws NotInContextException
    {
        setStolenFlag(oItem, bStolenFlag, null);
    }

    public final void
    setStoreGold(NWObject oidStore, int nGold)
        throws NotInContextException
    {
        setStoreGold(oidStore, nGold, null);
    }

    public final void
    setStoreIdentifyCost(NWObject oidStore, int nCost)
        throws NotInContextException
    {
        setStoreIdentifyCost(oidStore, nCost, null);
    }

    public final void
    setStoreMaxBuyPrice(NWObject oidStore, int nMaxBuy)
        throws NotInContextException
    {
        setStoreMaxBuyPrice(oidStore, nMaxBuy, null);
    }

    public final void
    setSubRace(NWObject oCreature, String sSubRace)
        throws NotInContextException
    {
        setSubRace(oCreature, sSubRace, null);
    }

    public final void
    setTileMainLightColor(NWLocation lTileLocation, TileMainLightColor nMainLight1Color, TileMainLightColor nMainLight2Color)
        throws NotInContextException
    {
        setTileMainLightColor(lTileLocation, nMainLight1Color, nMainLight2Color, null);
    }

    public final void
    setTileSourceLightColor(NWLocation lTileLocation, TileSourceLightColor nSourceLight1Color, TileSourceLightColor nSourceLight2Color)
        throws NotInContextException
    {
        setTileSourceLightColor(lTileLocation, nSourceLight1Color, nSourceLight2Color, null);
    }

    public final void
    setTime(int nHour, int nMinute, int nSecond, int nMillisecond)
        throws NotInContextException
    {
        setTime(nHour, nMinute, nSecond, nMillisecond, null);
    }

    public final void
    setTrapActive(NWObject oTrapObject, boolean bActive)
        throws NotInContextException
    {
        setTrapActive(oTrapObject, bActive, null);
    }

    public final void
    setTrapDetectDC(NWObject oTrapObject, int nDetectDC)
        throws NotInContextException
    {
        setTrapDetectDC(oTrapObject, nDetectDC, null);
    }

    public final void
    setTrapDetectable(NWObject oTrapObject, boolean bDetectable)
        throws NotInContextException
    {
        setTrapDetectable(oTrapObject, bDetectable, null);
    }

    public final int
    setTrapDetectedBy(NWObject oTrap, NWObject oDetector, boolean bDetected)
        throws NotInContextException
    {
        return setTrapDetectedBy(oTrap, oDetector, bDetected, null);
    }

    public final void
    setTrapDisabled(NWObject oTrap)
        throws NotInContextException
    {
        setTrapDisabled(oTrap, null);
    }

    public final void
    setTrapDisarmDC(NWObject oTrapObject, int nDisarmDC)
        throws NotInContextException
    {
        setTrapDisarmDC(oTrapObject, nDisarmDC, null);
    }

    public final void
    setTrapDisarmable(NWObject oTrapObject, boolean bDisarmable)
        throws NotInContextException
    {
        setTrapDisarmable(oTrapObject, bDisarmable, null);
    }

    public final void
    setTrapKeyTag(NWObject oTrapObject, String sKeyTag)
        throws NotInContextException
    {
        setTrapKeyTag(oTrapObject, sKeyTag, null);
    }

    public final void
    setTrapOneShot(NWObject oTrapObject, boolean bOneShot)
        throws NotInContextException
    {
        setTrapOneShot(oTrapObject, bOneShot, null);
    }

    public final void
    setTrapRecoverable(NWObject oTrapObject, boolean bRecoverable)
        throws NotInContextException
    {
        setTrapRecoverable(oTrapObject, bRecoverable, null);
    }

    public final void
    setUseableFlag(NWObject oPlaceable, boolean bUseableFlag)
        throws NotInContextException
    {
        setUseableFlag(oPlaceable, bUseableFlag, null);
    }

    public final void
    setWeather(NWObject oTarget, Weather tWeather)
        throws NotInContextException
    {
        setWeather(oTarget, tWeather, null);
    }

    public final void
    setWillSavingThrow(NWObject oObject, int nWillSave)
        throws NotInContextException
    {
        setWillSavingThrow(oObject, nWillSave, null);
    }

    public final void
    setXP(NWObject oCreature, int nXpAmount)
        throws NotInContextException
    {
        setXP(oCreature, nXpAmount, null);
    }

    public final void
    soundObjectPlay(NWObject oSound)
        throws NotInContextException
    {
        soundObjectPlay(oSound, null);
    }

    public final void
    soundObjectSetPosition(NWObject oSound, NWVector vPosition)
        throws NotInContextException
    {
        soundObjectSetPosition(oSound, vPosition, null);
    }

    public final void
    soundObjectSetVolume(NWObject oSound, int nVolume)
        throws NotInContextException
    {
        soundObjectSetVolume(oSound, nVolume, null);
    }

    public final void
    soundObjectStop(NWObject oSound)
        throws NotInContextException
    {
        soundObjectStop(oSound, null);
    }

    public final void
    speakOneLinerConversation(String sDialogResRef, NWObject oTokenTarget)
        throws NotInContextException
    {
        speakOneLinerConversation(sDialogResRef, oTokenTarget, null);
    }

    public final void
    speakString(String sStringToSpeak, TalkVolume tTalkVolume)
        throws NotInContextException
    {
        speakString(sStringToSpeak, tTalkVolume, null);
    }

    public final void
    speakStringByStrRef(int nStrRef, TalkVolume tTalkVolume)
        throws NotInContextException
    {
        speakStringByStrRef(nStrRef, tTalkVolume, null);
    }

    public final void
    startNewModule(String sModuleName)
        throws NotInContextException
    {
        startNewModule(sModuleName, null);
    }

    public final void
    stopFade(NWObject oCreature)
        throws NotInContextException
    {
        stopFade(oCreature, null);
    }

    public final void
    storeCameraFacing()
        throws NotInContextException
    {
        storeCameraFacing(null);
    }

    public final int
    storeCampaignObject(String sCampaignName, String sVarName, NWObject oObject, NWObject oPlayer)
        throws NotInContextException
    {
        return storeCampaignObject(sCampaignName, sVarName, oObject, oPlayer, null);
    }

    public final void
    summonAnimalCompanion(NWObject oMaster)
        throws NotInContextException
    {
        summonAnimalCompanion(oMaster, null);
    }

    public final void
    summonFamiliar(NWObject oMaster)
        throws NotInContextException
    {
        summonFamiliar(oMaster, null);
    }

    public final NWEffect
    supernaturalEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return supernaturalEffect(eEffect, null);
    }

    public final void
    surrenderToEnemies()
        throws NotInContextException
    {
        surrenderToEnemies(null);
    }

    public final void
    takeGoldFromCreature(int nAmount, NWObject oCreatureToTakeFrom, boolean bDestroy)
        throws NotInContextException
    {
        takeGoldFromCreature(nAmount, oCreatureToTakeFrom, bDestroy, null);
    }

    public final AttackResult
    touchAttackMelee(NWObject oTarget, boolean bDisplayFeedback)
        throws NotInContextException
    {
        return touchAttackMelee(oTarget, bDisplayFeedback, null);
    }

    public final AttackResult
    touchAttackRanged(NWObject oTarget, boolean bDisplayFeedback)
        throws NotInContextException
    {
        return touchAttackRanged(oTarget, bDisplayFeedback, null);
    }

    public final double
    turnsToSeconds(int nTurns)
        throws NotInContextException
    {
        return turnsToSeconds(nTurns, null);
    }

    public final void
    unpossessFamiliar(NWObject oCreature)
        throws NotInContextException
    {
        unpossessFamiliar(oCreature, null);
    }

    public final double
    vectorMagnitude(NWVector vVector)
        throws NotInContextException
    {
        return vectorMagnitude(vVector, null);
    }

    public final NWVector
    vectorNormalize(NWVector vVector)
        throws NotInContextException
    {
        return vectorNormalize(vVector, null);
    }

    public final double
    vectorToAngle(NWVector vVector)
        throws NotInContextException
    {
        return vectorToAngle(vVector, null);
    }

    public final NWEffect
    versusAlignmentEffect(NWEffect eEffect, int nLawChaos, int nGoodEvil)
        throws InvalidEffectException,
               NotInContextException
    {
        return versusAlignmentEffect(eEffect, nLawChaos, nGoodEvil, null);
    }

    public final NWEffect
    versusRacialTypeEffect(NWEffect eEffect, RacialType tRacialType)
        throws InvalidEffectException,
               NotInContextException
    {
        return versusRacialTypeEffect(eEffect, tRacialType, null);
    }

    public final NWEffect
    versusTrapEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException
    {
        return versusTrapEffect(eEffect, null);
    }

    public final SavingThrowResult
    willSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException
    {
        return willSave(oCreature, nDC, tSaveType, oSaveVersus, null);
    }

    public final void
    writeTimestampedLogEntry(String sLogEntry)
        throws NotInContextException
    {
        writeTimestampedLogEntry(sLogEntry, null);
    }

    public static Ice.DispatchStatus
    ___hasState(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String key;
        key = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        boolean __ret = __obj.hasState(key, __current);
        __os.writeBool(__ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getState(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String key;
        key = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWN.Persistable __ret = __obj.getState(key, __current);
            __os.writeSerializable(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(StateNotAvailableException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___putState(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String key;
        key = __is.readString();
        NWN.Persistable state;
        state = (NWN.Persistable)__is.readSerializable();
        __is.endReadEncaps();
        __obj.putState(key, state, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___delState(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String key;
        key = __is.readString();
        __is.endReadEncaps();
        __obj.delState(key, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___clearState(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        __obj.clearState(__current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___allPCs(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject[] __ret = __obj.allPCs(__current);
            NWObjectSeqHelper.write(__os, __ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___allEffects(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject o;
        o = new NWObject();
        o.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect[] __ret = __obj.allEffects(o, __current);
            NWEffectSeqHelper.write(__os, __ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___allInArea(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject area;
        area = new NWObject();
        area.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject[] __ret = __obj.allInArea(area, __current);
            NWObjectSeqHelper.write(__os, __ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___allInInventory(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject o;
        o = new NWObject();
        o.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject[] __ret = __obj.allInInventory(o, __current);
            NWObjectSeqHelper.write(__os, __ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___allEquipped(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject o;
        o = new NWObject();
        o.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWCreatureEquipped __ret = __obj.allEquipped(o, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___allItemProperties(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject item;
        item = new NWObject();
        item.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty[] __ret = __obj.allItemProperties(item, __current);
            NWItemPropertySeqHelper.write(__os, __ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___allInShape(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ShapeType tShapeType;
        tShapeType = ShapeType.__read(__is);
        double fSize;
        fSize = __is.readDouble();
        NWLocation lTarget;
        lTarget = new NWLocation();
        lTarget.__read(__is);
        boolean bLineOfSight;
        bLineOfSight = __is.readBool();
        ObjectType tObjectType;
        tObjectType = ObjectType.__read(__is);
        NWVector vOrigin;
        vOrigin = new NWVector();
        vOrigin.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject[] __ret = __obj.allInShape(tShapeType, fSize, lTarget, bLineOfSight, tObjectType, vOrigin, __current);
            NWObjectSeqHelper.write(__os, __ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___allInFaction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject memberOf;
        memberOf = new NWObject();
        memberOf.__read(__is);
        boolean bPCOnly;
        bPCOnly = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject[] __ret = __obj.allInFaction(memberOf, bPCOnly, __current);
            NWObjectSeqHelper.write(__os, __ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEffectIconShown(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eff;
        eff = new NWEffect();
        eff.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getEffectIconShown(eff, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setEffectIconShown(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eff;
        eff = new NWEffect();
        eff.__read(__is);
        boolean bShown;
        bShown = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setEffectIconShown(eff, bShown, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionAttack(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oAttackee;
        oAttackee = new NWObject();
        oAttackee.__read(__is);
        boolean bPassive;
        bPassive = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionAttack(oAttackee, bPassive, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionCastFakeSpellAtLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSpell;
        nSpell = __is.readInt();
        NWLocation lTarget;
        lTarget = new NWLocation();
        lTarget.__read(__is);
        ProjectilePathType tProjectilePathType;
        tProjectilePathType = ProjectilePathType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionCastFakeSpellAtLocation(nSpell, lTarget, tProjectilePathType, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionCastFakeSpellAtObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSpell;
        nSpell = __is.readInt();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        ProjectilePathType tProjectilePathType;
        tProjectilePathType = ProjectilePathType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionCastFakeSpellAtObject(nSpell, oTarget, tProjectilePathType, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionCastSpellAtLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSpell;
        nSpell = __is.readInt();
        NWLocation lTargetLocation;
        lTargetLocation = new NWLocation();
        lTargetLocation.__read(__is);
        MetaMagic tMetaMagic;
        tMetaMagic = MetaMagic.__read(__is);
        boolean bCheat;
        bCheat = __is.readBool();
        ProjectilePathType tProjectilePathType;
        tProjectilePathType = ProjectilePathType.__read(__is);
        boolean bInstantSpell;
        bInstantSpell = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionCastSpellAtLocation(nSpell, lTargetLocation, tMetaMagic, bCheat, tProjectilePathType, bInstantSpell, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionCastSpellAtObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSpell;
        nSpell = __is.readInt();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        MetaMagic tMetaMagic;
        tMetaMagic = MetaMagic.__read(__is);
        boolean bCheat;
        bCheat = __is.readBool();
        int nDomainLevel;
        nDomainLevel = __is.readInt();
        ProjectilePathType tProjectilePathType;
        tProjectilePathType = ProjectilePathType.__read(__is);
        boolean bInstantSpell;
        bInstantSpell = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionCastSpellAtObject(nSpell, oTarget, tMetaMagic, bCheat, nDomainLevel, tProjectilePathType, bInstantSpell, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionCloseDoor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oDoor;
        oDoor = new NWObject();
        oDoor.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionCloseDoor(oDoor, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionCounterSpell(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCounterSpellTarget;
        oCounterSpellTarget = new NWObject();
        oCounterSpellTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionCounterSpell(oCounterSpellTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionEquipItem(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        InventorySlot tInventorySlot;
        tInventorySlot = InventorySlot.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionEquipItem(oItem, tInventorySlot, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionEquipMostDamagingMelee(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oVersus;
        oVersus = new NWObject();
        oVersus.__read(__is);
        boolean bOffHand;
        bOffHand = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionEquipMostDamagingMelee(oVersus, bOffHand, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionEquipMostDamagingRanged(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oVersus;
        oVersus = new NWObject();
        oVersus.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionEquipMostDamagingRanged(oVersus, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionEquipMostEffectiveArmor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionEquipMostEffectiveArmor(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionExamine(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oExamine;
        oExamine = new NWObject();
        oExamine.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionExamine(oExamine, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionForceFollowObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFollow;
        oFollow = new NWObject();
        oFollow.__read(__is);
        double fFollowDistance;
        fFollowDistance = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionForceFollowObject(oFollow, fFollowDistance, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionForceMoveToLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lDestination;
        lDestination = new NWLocation();
        lDestination.__read(__is);
        boolean bRun;
        bRun = __is.readBool();
        double fTimeout;
        fTimeout = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionForceMoveToLocation(lDestination, bRun, fTimeout, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionForceMoveToObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMoveTo;
        oMoveTo = new NWObject();
        oMoveTo.__read(__is);
        boolean bRun;
        bRun = __is.readBool();
        double fRange;
        fRange = __is.readDouble();
        double fTimeout;
        fTimeout = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionForceMoveToObject(oMoveTo, bRun, fRange, fTimeout, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionGiveItem(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        NWObject oGiveTo;
        oGiveTo = new NWObject();
        oGiveTo.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionGiveItem(oItem, oGiveTo, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionInteractObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlaceable;
        oPlaceable = new NWObject();
        oPlaceable.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionInteractObject(oPlaceable, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionJumpToLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lLocation;
        lLocation = new NWLocation();
        lLocation.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionJumpToLocation(lLocation, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionJumpToObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oToJumpTo;
        oToJumpTo = new NWObject();
        oToJumpTo.__read(__is);
        boolean bWalkStraightLineToPoint;
        bWalkStraightLineToPoint = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionJumpToObject(oToJumpTo, bWalkStraightLineToPoint, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionLockObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionLockObject(oTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionMoveAwayFromLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lMoveAwayFrom;
        lMoveAwayFrom = new NWLocation();
        lMoveAwayFrom.__read(__is);
        boolean bRun;
        bRun = __is.readBool();
        double fMoveAwayRange;
        fMoveAwayRange = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionMoveAwayFromLocation(lMoveAwayFrom, bRun, fMoveAwayRange, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionMoveAwayFromObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFleeFrom;
        oFleeFrom = new NWObject();
        oFleeFrom.__read(__is);
        boolean bRun;
        bRun = __is.readBool();
        double fMoveAwayRange;
        fMoveAwayRange = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionMoveAwayFromObject(oFleeFrom, bRun, fMoveAwayRange, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionMoveToLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lDestination;
        lDestination = new NWLocation();
        lDestination.__read(__is);
        boolean bRun;
        bRun = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionMoveToLocation(lDestination, bRun, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionMoveToObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMoveTo;
        oMoveTo = new NWObject();
        oMoveTo.__read(__is);
        boolean bRun;
        bRun = __is.readBool();
        double fRange;
        fRange = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionMoveToObject(oMoveTo, bRun, fRange, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionOpenDoor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oDoor;
        oDoor = new NWObject();
        oDoor.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionOpenDoor(oDoor, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionPauseConversation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionPauseConversation(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionPickUpItem(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionPickUpItem(oItem, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionPlayAnimation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAnimation;
        nAnimation = __is.readInt();
        double fSpeed;
        fSpeed = __is.readDouble();
        double fDurationSeconds;
        fDurationSeconds = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionPlayAnimation(nAnimation, fSpeed, fDurationSeconds, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionPutDownItem(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionPutDownItem(oItem, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionRandomWalk(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionRandomWalk(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionRest(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        boolean bCreatureToEnemyLineOfSightCheck;
        bCreatureToEnemyLineOfSightCheck = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionRest(bCreatureToEnemyLineOfSightCheck, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionResumeConversation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionResumeConversation(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionSit(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oChair;
        oChair = new NWObject();
        oChair.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionSit(oChair, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionSpeakString(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sStringToSpeak;
        sStringToSpeak = __is.readString();
        TalkVolume tTalkVolume;
        tTalkVolume = TalkVolume.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionSpeakString(sStringToSpeak, tTalkVolume, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionSpeakStringByStrRef(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nStrRef;
        nStrRef = __is.readInt();
        TalkVolume tTalkVolume;
        tTalkVolume = TalkVolume.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionSpeakStringByStrRef(nStrRef, tTalkVolume, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionStartConversation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObjectToConverseWith;
        oObjectToConverseWith = new NWObject();
        oObjectToConverseWith.__read(__is);
        String sDialogResRef;
        sDialogResRef = __is.readString();
        boolean bPrivateConversation;
        bPrivateConversation = __is.readBool();
        boolean bPlayHello;
        bPlayHello = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionStartConversation(oObjectToConverseWith, sDialogResRef, bPrivateConversation, bPlayHello, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionTakeItem(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        NWObject oTakeFrom;
        oTakeFrom = new NWObject();
        oTakeFrom.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionTakeItem(oItem, oTakeFrom, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionUnequipItem(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionUnequipItem(oItem, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionUnlockObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionUnlockObject(oTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionUseFeat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFeat;
        nFeat = __is.readInt();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionUseFeat(nFeat, oTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionUseSkill(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSkill;
        nSkill = __is.readInt();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        int nSubSkill;
        nSubSkill = __is.readInt();
        NWObject oItemUsed;
        oItemUsed = new NWObject();
        oItemUsed.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionUseSkill(nSkill, oTarget, nSubSkill, oItemUsed, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___actionWait(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        double fSeconds;
        fSeconds = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.actionWait(fSeconds, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___activatePortal(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        String sIPaddress;
        sIPaddress = __is.readString();
        String sPassword;
        sPassword = __is.readString();
        String sWaypointTag;
        sWaypointTag = __is.readString();
        boolean bSeemless;
        bSeemless = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.activatePortal(oTarget, sIPaddress, sPassword, sWaypointTag, bSeemless, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___addHenchman(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMaster;
        oMaster = new NWObject();
        oMaster.__read(__is);
        NWObject oHenchman;
        oHenchman = new NWObject();
        oHenchman.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.addHenchman(oMaster, oHenchman, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___addItemProperty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DurationType tDurationType;
        tDurationType = DurationType.__read(__is);
        NWItemProperty ipProperty;
        ipProperty = new NWItemProperty();
        ipProperty.__read(__is);
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        double fDuration;
        fDuration = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.addItemProperty(tDurationType, ipProperty, oItem, fDuration, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___addJournalQuestEntry(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String szPlotID;
        szPlotID = __is.readString();
        int nState;
        nState = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        boolean bAllPartyMembers;
        bAllPartyMembers = __is.readBool();
        boolean bAllPlayers;
        bAllPlayers = __is.readBool();
        boolean bAllowOverrideHigher;
        bAllowOverrideHigher = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.addJournalQuestEntry(szPlotID, nState, oCreature, bAllPartyMembers, bAllPlayers, bAllowOverrideHigher, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___addToParty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPC;
        oPC = new NWObject();
        oPC.__read(__is);
        NWObject oPartyLeader;
        oPartyLeader = new NWObject();
        oPartyLeader.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.addToParty(oPC, oPartyLeader, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___adjustAlignment(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oSubject;
        oSubject = new NWObject();
        oSubject.__read(__is);
        Alignment tAlignment;
        tAlignment = Alignment.__read(__is);
        int nShift;
        nShift = __is.readInt();
        boolean bAllPartyMembers;
        bAllPartyMembers = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.adjustAlignment(oSubject, tAlignment, nShift, bAllPartyMembers, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___adjustReputation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSourceFactionMember;
        oSourceFactionMember = new NWObject();
        oSourceFactionMember.__read(__is);
        int nAdjustment;
        nAdjustment = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.adjustReputation(oTarget, oSourceFactionMember, nAdjustment, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___ambientSoundChangeDay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        int nTrack;
        nTrack = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.ambientSoundChangeDay(oArea, nTrack, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___ambientSoundChangeNight(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        int nTrack;
        nTrack = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.ambientSoundChangeNight(oArea, nTrack, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___ambientSoundPlay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.ambientSoundPlay(oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___ambientSoundSetDayVolume(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        int nVolume;
        nVolume = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.ambientSoundSetDayVolume(oArea, nVolume, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___ambientSoundSetNightVolume(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        int nVolume;
        nVolume = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.ambientSoundSetNightVolume(oArea, nVolume, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___ambientSoundStop(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.ambientSoundStop(oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___angleToVector(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        double fAngle;
        fAngle = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWVector __ret = __obj.angleToVector(fAngle, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___applyEffectAtLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DurationType tDurationType;
        tDurationType = DurationType.__read(__is);
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        NWLocation lLocation;
        lLocation = new NWLocation();
        lLocation.__read(__is);
        double fDuration;
        fDuration = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.applyEffectAtLocation(tDurationType, eEffect, lLocation, fDuration, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___applyEffectToObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DurationType tDurationType;
        tDurationType = DurationType.__read(__is);
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        double fDuration;
        fDuration = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.applyEffectToObject(tDurationType, eEffect, oTarget, fDuration, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___badBadReplaceMeThisDoesNothing(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.badBadReplaceMeThisDoesNothing(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___beginConversation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sResRef;
        sResRef = __is.readString();
        NWObject oObjectToDialog;
        oObjectToDialog = new NWObject();
        oObjectToDialog.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.beginConversation(sResRef, oObjectToDialog, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___blackScreen(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.blackScreen(oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___bootPC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.bootPC(oPlayer, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___changeFaction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObjectToChangeFaction;
        oObjectToChangeFaction = new NWObject();
        oObjectToChangeFaction.__read(__is);
        NWObject oMemberOfFactionToJoin;
        oMemberOfFactionToJoin = new NWObject();
        oMemberOfFactionToJoin.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.changeFaction(oObjectToChangeFaction, oMemberOfFactionToJoin, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___changeToStandardFaction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreatureToChange;
        oCreatureToChange = new NWObject();
        oCreatureToChange.__read(__is);
        StandardFaction tStandardFaction;
        tStandardFaction = StandardFaction.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.changeToStandardFaction(oCreatureToChange, tStandardFaction, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___clearAllActions(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        boolean bClearCombatState;
        bClearCombatState = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.clearAllActions(bClearCombatState, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___clearPersonalReputation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.clearPersonalReputation(oTarget, oSource, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___copyItem(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        NWObject oTargetInventory;
        oTargetInventory = new NWObject();
        oTargetInventory.__read(__is);
        boolean bCopyVars;
        bCopyVars = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.copyItem(oItem, oTargetInventory, bCopyVars, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___copyItemAndModify(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        int nType;
        nType = __is.readInt();
        int nIndex;
        nIndex = __is.readInt();
        int nNewValue;
        nNewValue = __is.readInt();
        boolean bCopyVars;
        bCopyVars = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.copyItemAndModify(oItem, nType, nIndex, nNewValue, bCopyVars, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___copyObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        NWLocation locLocation;
        locLocation = new NWLocation();
        locLocation.__read(__is);
        NWObject oOwner;
        oOwner = new NWObject();
        oOwner.__read(__is);
        String sNewTag;
        sNewTag = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.copyObject(oSource, locLocation, oOwner, sNewTag, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___createItemOnObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sItemTemplate;
        sItemTemplate = __is.readString();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        int nStackSize;
        nStackSize = __is.readInt();
        String sNewTag;
        sNewTag = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.createItemOnObject(sItemTemplate, oTarget, nStackSize, sNewTag, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___createObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ObjectType tObjectType;
        tObjectType = ObjectType.__read(__is);
        String sTemplate;
        sTemplate = __is.readString();
        NWLocation lLocation;
        lLocation = new NWLocation();
        lLocation.__read(__is);
        boolean bUseAppearAnimation;
        bUseAppearAnimation = __is.readBool();
        String sNewTag;
        sNewTag = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.createObject(tObjectType, sTemplate, lLocation, bUseAppearAnimation, sNewTag, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___createTrapAtLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TrapType tTrapType;
        tTrapType = TrapType.__read(__is);
        NWLocation lLocation;
        lLocation = new NWLocation();
        lLocation.__read(__is);
        double fSize;
        fSize = __is.readDouble();
        String sTag;
        sTag = __is.readString();
        StandardFaction tStandardFaction;
        tStandardFaction = StandardFaction.__read(__is);
        String sOnDisarmScript;
        sOnDisarmScript = __is.readString();
        String sOnTrapTriggeredScript;
        sOnTrapTriggeredScript = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.createTrapAtLocation(tTrapType, lLocation, fSize, sTag, tStandardFaction, sOnDisarmScript, sOnTrapTriggeredScript, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___createTrapOnObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TrapType tTrapType;
        tTrapType = TrapType.__read(__is);
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        StandardFaction tStandardFaction;
        tStandardFaction = StandardFaction.__read(__is);
        String sOnDisarmScript;
        sOnDisarmScript = __is.readString();
        String sOnTrapTriggeredScript;
        sOnTrapTriggeredScript = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.createTrapOnObject(tTrapType, oObject, tStandardFaction, sOnDisarmScript, sOnTrapTriggeredScript, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___dayToNight(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        double fTransitionTime;
        fTransitionTime = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.dayToNight(oPlayer, fTransitionTime, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___decrementRemainingFeatUses(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nFeat;
        nFeat = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.decrementRemainingFeatUses(oCreature, nFeat, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___decrementRemainingSpellUses(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nSpell;
        nSpell = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.decrementRemainingSpellUses(oCreature, nSpell, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___deleteCampaignVariable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.deleteCampaignVariable(sCampaignName, sVarName, oPlayer, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___deleteLocalFloat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.deleteLocalFloat(oObject, sVarName, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___deleteLocalInt(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.deleteLocalInt(oObject, sVarName, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___deleteLocalLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.deleteLocalLocation(oObject, sVarName, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___deleteLocalObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.deleteLocalObject(oObject, sVarName, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___deleteLocalString(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.deleteLocalString(oObject, sVarName, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___destroyCampaignDatabase(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.destroyCampaignDatabase(sCampaignName, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___destroyObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oDestroy;
        oDestroy = new NWObject();
        oDestroy.__read(__is);
        double fDelay;
        fDelay = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.destroyObject(oDestroy, fDelay, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___doDoorAction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTargetDoor;
        oTargetDoor = new NWObject();
        oTargetDoor.__read(__is);
        DoorAction tDoorAction;
        tDoorAction = DoorAction.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.doDoorAction(oTargetDoor, tDoorAction, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___doPlaceableObjectAction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlaceable;
        oPlaceable = new NWObject();
        oPlaceable.__read(__is);
        PlaceableAction tPlaceableAction;
        tPlaceableAction = PlaceableAction.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.doPlaceableObjectAction(oPlaceable, tPlaceableAction, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___doSinglePlayerAutoSave(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.doSinglePlayerAutoSave(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___doWhirlwindAttack(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        boolean bDisplayFeedback;
        bDisplayFeedback = __is.readBool();
        boolean bImproved;
        bImproved = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.doWhirlwindAttack(bDisplayFeedback, bImproved, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectACDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nValue;
        nValue = __is.readInt();
        ACModifyType tACModifyType;
        tACModifyType = ACModifyType.__read(__is);
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectACDecrease(nValue, tACModifyType, tDamageType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectACIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nValue;
        nValue = __is.readInt();
        ACModifyType tACModifyType;
        tACModifyType = ACModifyType.__read(__is);
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectACIncrease(nValue, tACModifyType, tDamageType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectAbilityDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Ability tAbility;
        tAbility = Ability.__read(__is);
        int nModifyBy;
        nModifyBy = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectAbilityDecrease(tAbility, nModifyBy, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectAbilityIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Ability tAbility;
        tAbility = Ability.__read(__is);
        int nModifyBy;
        nModifyBy = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectAbilityIncrease(tAbility, nModifyBy, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectAppear(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAnimation;
        nAnimation = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectAppear(nAnimation, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectAreaOfEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAreaEffectId;
        nAreaEffectId = __is.readInt();
        String sOnEnterScript;
        sOnEnterScript = __is.readString();
        String sHeartbeatScript;
        sHeartbeatScript = __is.readString();
        String sOnExitScript;
        sOnExitScript = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectAreaOfEffect(nAreaEffectId, sOnEnterScript, sHeartbeatScript, sOnExitScript, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectAttackDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPenalty;
        nPenalty = __is.readInt();
        AttackBonus tAttackBonus;
        tAttackBonus = AttackBonus.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectAttackDecrease(nPenalty, tAttackBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectAttackIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBonus;
        nBonus = __is.readInt();
        AttackBonus tAttackBonus;
        tAttackBonus = AttackBonus.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectAttackIncrease(nBonus, tAttackBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectBeam(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBeamVisualEffect;
        nBeamVisualEffect = __is.readInt();
        NWObject oEffector;
        oEffector = new NWObject();
        oEffector.__read(__is);
        CreaturePart tCreaturePart;
        tCreaturePart = CreaturePart.__read(__is);
        boolean bMissEffect;
        bMissEffect = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectBeam(nBeamVisualEffect, oEffector, tCreaturePart, bMissEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectBlindness(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectBlindness(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectCharmed(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectCharmed(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectConcealment(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPercentage;
        nPercentage = __is.readInt();
        MissChanceType tMissChanceType;
        tMissChanceType = MissChanceType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectConcealment(nPercentage, tMissChanceType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectConfused(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectConfused(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectCurse(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nStrMod;
        nStrMod = __is.readInt();
        int nDexMod;
        nDexMod = __is.readInt();
        int nConMod;
        nConMod = __is.readInt();
        int nIntMod;
        nIntMod = __is.readInt();
        int nWisMod;
        nWisMod = __is.readInt();
        int nChaMod;
        nChaMod = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectCurse(nStrMod, nDexMod, nConMod, nIntMod, nWisMod, nChaMod, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectCutsceneDominated(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectCutsceneDominated(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectCutsceneGhost(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectCutsceneGhost(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectCutsceneImmobilize(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectCutsceneImmobilize(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectCutsceneParalyze(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectCutsceneParalyze(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDamage(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nDamageAmount;
        nDamageAmount = __is.readInt();
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        DamagePower tDamagePower;
        tDamagePower = DamagePower.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDamage(nDamageAmount, tDamageType, tDamagePower, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDamageDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPenalty;
        nPenalty = __is.readInt();
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDamageDecrease(nPenalty, tDamageType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDamageImmunityDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        int nPercentImmunity;
        nPercentImmunity = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDamageImmunityDecrease(tDamageType, nPercentImmunity, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDamageImmunityIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        int nPercentImmunity;
        nPercentImmunity = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDamageImmunityIncrease(tDamageType, nPercentImmunity, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDamageIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBonus;
        nBonus = __is.readInt();
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDamageIncrease(nBonus, tDamageType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDamageReduction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAmount;
        nAmount = __is.readInt();
        DamagePower tDamagePower;
        tDamagePower = DamagePower.__read(__is);
        int nLimit;
        nLimit = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDamageReduction(nAmount, tDamagePower, nLimit, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDamageResistance(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        int nAmount;
        nAmount = __is.readInt();
        int nLimit;
        nLimit = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDamageResistance(tDamageType, nAmount, nLimit, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDamageShield(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nDamageAmount;
        nDamageAmount = __is.readInt();
        int nRandomAmount;
        nRandomAmount = __is.readInt();
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDamageShield(nDamageAmount, nRandomAmount, tDamageType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDarkness(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDarkness(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDazed(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDazed(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDeaf(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDeaf(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDeath(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        boolean bSpectacularDeath;
        bSpectacularDeath = __is.readBool();
        boolean bDisplayFeedback;
        bDisplayFeedback = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDeath(bSpectacularDeath, bDisplayFeedback, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDisappear(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAnimation;
        nAnimation = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDisappear(nAnimation, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDisappearAppear(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lLocation;
        lLocation = new NWLocation();
        lLocation.__read(__is);
        int nAnimation;
        nAnimation = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDisappearAppear(lLocation, nAnimation, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDisease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nDiseaseType;
        nDiseaseType = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDisease(nDiseaseType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDispelMagicAll(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nCasterLevel;
        nCasterLevel = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDispelMagicAll(nCasterLevel, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDispelMagicBest(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nCasterLevel;
        nCasterLevel = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDispelMagicBest(nCasterLevel, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectDominated(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectDominated(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectEntangle(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectEntangle(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectEthereal(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectEthereal(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectFrightened(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectFrightened(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectHaste(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectHaste(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectHeal(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nDamageToHeal;
        nDamageToHeal = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectHeal(nDamageToHeal, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectHitPointChangeWhenDying(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        double fHitPointChangePerRound;
        fHitPointChangePerRound = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectHitPointChangeWhenDying(fHitPointChangePerRound, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectImmunity(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ImmunityType tImmunityType;
        tImmunityType = ImmunityType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectImmunity(tImmunityType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectInvisibility(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nInvisibilityType;
        nInvisibilityType = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectInvisibility(nInvisibilityType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectKnockdown(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectKnockdown(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectLinkEffects(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eChildEffect;
        eChildEffect = new NWEffect();
        eChildEffect.__read(__is);
        NWEffect eParentEffect;
        eParentEffect = new NWEffect();
        eParentEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectLinkEffects(eChildEffect, eParentEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectMissChance(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPercentage;
        nPercentage = __is.readInt();
        MissChanceType tMissChanceType;
        tMissChanceType = MissChanceType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectMissChance(nPercentage, tMissChanceType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectModifyAttacks(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAttacks;
        nAttacks = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectModifyAttacks(nAttacks, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectMovementSpeedDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPercentChange;
        nPercentChange = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectMovementSpeedDecrease(nPercentChange, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectMovementSpeedIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPercentChange;
        nPercentChange = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectMovementSpeedIncrease(nPercentChange, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectNegativeLevel(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nNumLevels;
        nNumLevels = __is.readInt();
        boolean bHPBonus;
        bHPBonus = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectNegativeLevel(nNumLevels, bHPBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectParalyze(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectParalyze(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectPetrify(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectPetrify(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectPoison(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPoisonType;
        nPoisonType = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectPoison(nPoisonType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectPolymorph(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPolymorphSelection;
        nPolymorphSelection = __is.readInt();
        boolean bLocked;
        bLocked = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectPolymorph(nPolymorphSelection, bLocked, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectRegenerate(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAmount;
        nAmount = __is.readInt();
        double fIntervalSeconds;
        fIntervalSeconds = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectRegenerate(nAmount, fIntervalSeconds, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectResurrection(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectResurrection(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSanctuary(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nDifficultyClass;
        nDifficultyClass = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSanctuary(nDifficultyClass, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSavingThrowDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSave;
        nSave = __is.readInt();
        int nValue;
        nValue = __is.readInt();
        SaveType tSaveType;
        tSaveType = SaveType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSavingThrowDecrease(nSave, nValue, tSaveType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSavingThrowIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSave;
        nSave = __is.readInt();
        int nValue;
        nValue = __is.readInt();
        SaveType tSaveType;
        tSaveType = SaveType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSavingThrowIncrease(nSave, nValue, tSaveType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSeeInvisible(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSeeInvisible(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSilence(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSilence(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSkillDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSkill;
        nSkill = __is.readInt();
        int nValue;
        nValue = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSkillDecrease(nSkill, nValue, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSkillIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSkill;
        nSkill = __is.readInt();
        int nValue;
        nValue = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSkillIncrease(nSkill, nValue, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSleep(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSleep(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSlow(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSlow(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSpellFailure(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPercent;
        nPercent = __is.readInt();
        SpellSchool tSpellSchool;
        tSpellSchool = SpellSchool.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSpellFailure(nPercent, tSpellSchool, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSpellImmunity(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nImmunityToSpell;
        nImmunityToSpell = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSpellImmunity(nImmunityToSpell, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSpellLevelAbsorption(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nMaxSpellLevelAbsorbed;
        nMaxSpellLevelAbsorbed = __is.readInt();
        int nTotalSpellLevelsAbsorbed;
        nTotalSpellLevelsAbsorbed = __is.readInt();
        SpellSchool tSpellSchool;
        tSpellSchool = SpellSchool.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSpellLevelAbsorption(nMaxSpellLevelAbsorbed, nTotalSpellLevelsAbsorbed, tSpellSchool, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSpellResistanceDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nValue;
        nValue = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSpellResistanceDecrease(nValue, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSpellResistanceIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nValue;
        nValue = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSpellResistanceIncrease(nValue, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectStunned(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectStunned(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSummonCreature(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCreatureResref;
        sCreatureResref = __is.readString();
        int nVisualEffectId;
        nVisualEffectId = __is.readInt();
        double fDelaySeconds;
        fDelaySeconds = __is.readDouble();
        boolean bUseAppearAnimation;
        bUseAppearAnimation = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSummonCreature(sCreatureResref, nVisualEffectId, fDelaySeconds, bUseAppearAnimation, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectSwarm(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        boolean bLooping;
        bLooping = __is.readBool();
        String sCreatureTemplate1;
        sCreatureTemplate1 = __is.readString();
        String sCreatureTemplate2;
        sCreatureTemplate2 = __is.readString();
        String sCreatureTemplate3;
        sCreatureTemplate3 = __is.readString();
        String sCreatureTemplate4;
        sCreatureTemplate4 = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectSwarm(bLooping, sCreatureTemplate1, sCreatureTemplate2, sCreatureTemplate3, sCreatureTemplate4, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectTemporaryHitpoints(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nHitPoints;
        nHitPoints = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectTemporaryHitpoints(nHitPoints, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectTimeStop(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectTimeStop(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectTrueSeeing(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectTrueSeeing(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectTurnResistanceDecrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nHitDice;
        nHitDice = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectTurnResistanceDecrease(nHitDice, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectTurnResistanceIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nHitDice;
        nHitDice = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectTurnResistanceIncrease(nHitDice, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectTurned(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectTurned(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectUltravision(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectUltravision(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___effectVisualEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nVisualEffectId;
        nVisualEffectId = __is.readInt();
        boolean bMissEffect;
        bMissEffect = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.effectVisualEffect(nVisualEffectId, bMissEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___endGame(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sEndMovie;
        sEndMovie = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.endGame(sEndMovie, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___executeScript(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sScript;
        sScript = __is.readString();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.executeScript(sScript, oTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___exploreAreaForPlayer(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        boolean bExplored;
        bExplored = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.exploreAreaForPlayer(oArea, oPlayer, bExplored, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___exportAllCharacters(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.exportAllCharacters(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___exportSingleCharacter(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.exportSingleCharacter(oPlayer, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___extraordinaryEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.extraordinaryEffect(eEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___fadeFromBlack(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        double fSpeed;
        fSpeed = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.fadeFromBlack(oCreature, fSpeed, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___fadeToBlack(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        double fSpeed;
        fSpeed = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.fadeToBlack(oCreature, fSpeed, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___floatingTextStrRefOnCreature(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nStrRefToDisplay;
        nStrRefToDisplay = __is.readInt();
        NWObject oCreatureToFloatAbove;
        oCreatureToFloatAbove = new NWObject();
        oCreatureToFloatAbove.__read(__is);
        boolean bBroadcastToFaction;
        bBroadcastToFaction = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.floatingTextStrRefOnCreature(nStrRefToDisplay, oCreatureToFloatAbove, bBroadcastToFaction, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___floatingTextStringOnCreature(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sStringToDisplay;
        sStringToDisplay = __is.readString();
        NWObject oCreatureToFloatAbove;
        oCreatureToFloatAbove = new NWObject();
        oCreatureToFloatAbove.__read(__is);
        boolean bBroadcastToFaction;
        bBroadcastToFaction = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.floatingTextStringOnCreature(sStringToDisplay, oCreatureToFloatAbove, bBroadcastToFaction, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___forceRest(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.forceRest(oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___fortitudeSave(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nDC;
        nDC = __is.readInt();
        SaveType tSaveType;
        tSaveType = SaveType.__read(__is);
        NWObject oSaveVersus;
        oSaveVersus = new NWObject();
        oSaveVersus.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            SavingThrowResult __ret = __obj.fortitudeSave(oCreature, nDC, tSaveType, oSaveVersus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___get2DAString(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String s2DA;
        s2DA = __is.readString();
        String sColumn;
        sColumn = __is.readString();
        int nRow;
        nRow = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.get2DAString(s2DA, sColumn, nRow, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getAC(oObject, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAILevel(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            AILevel __ret = __obj.getAILevel(oTarget, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAbilityModifier(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Ability tAbility;
        tAbility = Ability.__read(__is);
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getAbilityModifier(tAbility, oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAbilityScore(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        Ability tAbility;
        tAbility = Ability.__read(__is);
        boolean bBaseAbilityScore;
        bBaseAbilityScore = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getAbilityScore(oCreature, tAbility, bBaseAbilityScore, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getActionMode(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        ActionMode tActionMode;
        tActionMode = ActionMode.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getActionMode(oCreature, tActionMode, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAge(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getAge(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAlignmentGoodEvil(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            Alignment __ret = __obj.getAlignmentGoodEvil(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAlignmentLawChaos(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            Alignment __ret = __obj.getAlignmentLawChaos(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAnimalCompanionCreatureType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getAnimalCompanionCreatureType(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAnimalCompanionName(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getAnimalCompanionName(oTarget, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAppearanceType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getAppearanceType(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getArcaneSpellFailure(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getArcaneSpellFailure(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getArea(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getArea(oTarget, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAreaOfEffectCreator(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oAreaOfEffectObject;
        oAreaOfEffectObject = new NWObject();
        oAreaOfEffectObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getAreaOfEffectCreator(oAreaOfEffectObject, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAreaSize(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAreaDimension;
        nAreaDimension = __is.readInt();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getAreaSize(nAreaDimension, oArea, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAssociate(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        AssociateType tAssociateType;
        tAssociateType = AssociateType.__read(__is);
        NWObject oMaster;
        oMaster = new NWObject();
        oMaster.__read(__is);
        int nTh;
        nTh = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getAssociate(tAssociateType, oMaster, nTh, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAssociateType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oAssociate;
        oAssociate = new NWObject();
        oAssociate.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            AssociateType __ret = __obj.getAssociateType(oAssociate, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAttackTarget(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getAttackTarget(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAttemptedAttackTarget(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getAttemptedAttackTarget(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getAttemptedSpellTarget(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getAttemptedSpellTarget(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getBaseAttackBonus(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getBaseAttackBonus(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getBaseItemType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getBaseItemType(oItem, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getBlockingDoor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getBlockingDoor(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCalendarDay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCalendarDay(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCalendarMonth(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCalendarMonth(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCalendarYear(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCalendarYear(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCampaignFloat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getCampaignFloat(sCampaignName, sVarName, oPlayer, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCampaignInt(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCampaignInt(sCampaignName, sVarName, oPlayer, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCampaignLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWLocation __ret = __obj.getCampaignLocation(sCampaignName, sVarName, oPlayer, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCampaignString(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getCampaignString(sCampaignName, sVarName, oPlayer, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCampaignVector(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWVector __ret = __obj.getCampaignVector(sCampaignName, sVarName, oPlayer, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCasterLevel(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCasterLevel(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getChallengeRating(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getChallengeRating(oCreature, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getClassByPosition(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nClassPosition;
        nClassPosition = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getClassByPosition(nClassPosition, oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getClickingObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getClickingObject(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getColor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        int nColorChannel;
        nColorChannel = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getColor(oObject, nColorChannel, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCommandable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getCommandable(oTarget, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCreatureBodyPart(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        CreaturePart tCreaturePart;
        tCreaturePart = CreaturePart.__read(__is);
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCreatureBodyPart(tCreaturePart, oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCreatureSize(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            CreatureSize __ret = __obj.getCreatureSize(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCreatureStartingPackage(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCreatureStartingPackage(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCreatureTailType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCreatureTailType(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCreatureWingType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCreatureWingType(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCurrentAction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            Action __ret = __obj.getCurrentAction(oObject, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCurrentHitPoints(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getCurrentHitPoints(oObject, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCutsceneCameraMoveRate(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getCutsceneCameraMoveRate(oCreature, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getCutsceneMode(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getCutsceneMode(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDamageDealtByType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DamageType tDamageType;
        tDamageType = DamageType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getDamageDealtByType(tDamageType, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDefensiveCastingMode(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getDefensiveCastingMode(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDeity(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getDeity(oCreature, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDescription(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        boolean bOriginalDescription;
        bOriginalDescription = __is.readBool();
        boolean bIdentifiedDescription;
        bIdentifiedDescription = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getDescription(oObject, bOriginalDescription, bIdentifiedDescription, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDetectMode(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getDetectMode(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDialogSoundLength(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nStrRef;
        nStrRef = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getDialogSoundLength(nStrRef, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDistanceBetween(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObjectA;
        oObjectA = new NWObject();
        oObjectA.__read(__is);
        NWObject oObjectB;
        oObjectB = new NWObject();
        oObjectB.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getDistanceBetween(oObjectA, oObjectB, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDistanceBetweenLocations(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lLocationA;
        lLocationA = new NWLocation();
        lLocationA.__read(__is);
        NWLocation lLocationB;
        lLocationB = new NWLocation();
        lLocationB.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getDistanceBetweenLocations(lLocationA, lLocationB, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDistanceToObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getDistanceToObject(oObject, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getDroppableFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getDroppableFlag(oItem, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEffectCreator(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getEffectCreator(eEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEffectDurationType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            DurationType __ret = __obj.getEffectDurationType(eEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEffectSpellId(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eSpellEffect;
        eSpellEffect = new NWEffect();
        eSpellEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getEffectSpellId(eSpellEffect, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEffectSubType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            EffectSubType __ret = __obj.getEffectSubType(eEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEffectType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            EffectType __ret = __obj.getEffectType(eEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEncounterActive(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oEncounter;
        oEncounter = new NWObject();
        oEncounter.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getEncounterActive(oEncounter, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEncounterDifficulty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oEncounter;
        oEncounter = new NWObject();
        oEncounter.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getEncounterDifficulty(oEncounter, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEncounterSpawnsCurrent(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oEncounter;
        oEncounter = new NWObject();
        oEncounter.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getEncounterSpawnsCurrent(oEncounter, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEncounterSpawnsMax(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oEncounter;
        oEncounter = new NWObject();
        oEncounter.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getEncounterSpawnsMax(oEncounter, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getEnteringObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getEnteringObject(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getExitingObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getExitingObject(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFacing(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getFacing(oTarget, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionAverageGoodEvilAlignment(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFactionAverageGoodEvilAlignment(oFactionMember, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionAverageLawChaosAlignment(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFactionAverageLawChaosAlignment(oFactionMember, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionAverageLevel(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFactionAverageLevel(oFactionMember, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionAverageReputation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oSourceFactionMember;
        oSourceFactionMember = new NWObject();
        oSourceFactionMember.__read(__is);
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFactionAverageReputation(oSourceFactionMember, oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionAverageXP(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFactionAverageXP(oFactionMember, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionBestAC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        boolean bMustBeVisible;
        bMustBeVisible = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getFactionBestAC(oFactionMember, bMustBeVisible, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionEqual(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFirstObject;
        oFirstObject = new NWObject();
        oFirstObject.__read(__is);
        NWObject oSecondObject;
        oSecondObject = new NWObject();
        oSecondObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getFactionEqual(oFirstObject, oSecondObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionGold(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFactionGold(oFactionMember, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionLeader(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMemberOfFaction;
        oMemberOfFaction = new NWObject();
        oMemberOfFaction.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getFactionLeader(oMemberOfFaction, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionLeastDamagedMember(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        boolean bMustBeVisible;
        bMustBeVisible = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getFactionLeastDamagedMember(oFactionMember, bMustBeVisible, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionMostDamagedMember(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        boolean bMustBeVisible;
        bMustBeVisible = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getFactionMostDamagedMember(oFactionMember, bMustBeVisible, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionMostFrequentClass(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFactionMostFrequentClass(oFactionMember, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionStrongestMember(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        boolean bMustBeVisible;
        bMustBeVisible = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getFactionStrongestMember(oFactionMember, bMustBeVisible, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionWeakestMember(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        boolean bMustBeVisible;
        bMustBeVisible = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getFactionWeakestMember(oFactionMember, bMustBeVisible, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFactionWorstAC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oFactionMember;
        oFactionMember = new NWObject();
        oFactionMember.__read(__is);
        boolean bMustBeVisible;
        bMustBeVisible = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getFactionWorstAC(oFactionMember, bMustBeVisible, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFamiliarCreatureType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFamiliarCreatureType(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFamiliarName(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getFamiliarName(oCreature, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFogAmount(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFogType;
        nFogType = __is.readInt();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFogAmount(nFogType, oArea, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFogColor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFogType;
        nFogType = __is.readInt();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFogColor(nFogType, oArea, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFootstepType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFootstepType(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getFortitudeSavingThrow(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getFortitudeSavingThrow(oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getGameDifficulty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getGameDifficulty(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getGender(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            Gender __ret = __obj.getGender(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getGoingToBeAttackedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getGoingToBeAttackedBy(oTarget, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getGold(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getGold(oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getGoldPieceValue(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getGoldPieceValue(oItem, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getGoodEvilValue(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getGoodEvilValue(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getHardness(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getHardness(oObject, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getHasFeat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFeat;
        nFeat = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getHasFeat(nFeat, oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getHasFeatEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFeat;
        nFeat = __is.readInt();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getHasFeatEffect(nFeat, oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getHasInventory(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getHasInventory(oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getHasSkill(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSkill;
        nSkill = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getHasSkill(nSkill, oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getHasSpell(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSpell;
        nSpell = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getHasSpell(nSpell, oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getHasSpellEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSpell;
        nSpell = __is.readInt();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getHasSpellEffect(nSpell, oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getHenchman(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMaster;
        oMaster = new NWObject();
        oMaster.__read(__is);
        int nNth;
        nNth = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getHenchman(oMaster, nNth, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getHitDice(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getHitDice(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIdentified(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIdentified(oItem, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getImmortal(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getImmortal(oTarget, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getInfiniteFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getInfiniteFlag(oItem, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getInventoryDisturbItem(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getInventoryDisturbItem(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getInventoryDisturbType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getInventoryDisturbType(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsAreaAboveGround(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsAreaAboveGround(oArea, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsAreaInterior(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsAreaInterior(oArea, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsAreaNatural(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsAreaNatural(oArea, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsCreatureDisarmable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsCreatureDisarmable(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsDM(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsDM(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsDMPossessed(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsDMPossessed(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsDawn(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsDawn(__current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsDay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsDay(__current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsDead(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsDead(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsDoorActionPossible(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTargetDoor;
        oTargetDoor = new NWObject();
        oTargetDoor.__read(__is);
        DoorAction tDoorAction;
        tDoorAction = DoorAction.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsDoorActionPossible(oTargetDoor, tDoorAction, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsDusk(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsDusk(__current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsEffectValid(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsEffectValid(eEffect, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsEncounterCreature(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsEncounterCreature(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsEnemy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsEnemy(oTarget, oSource, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsFriend(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsFriend(oTarget, oSource, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsImmune(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        ImmunityType tImmunityType;
        tImmunityType = ImmunityType.__read(__is);
        NWObject oVersus;
        oVersus = new NWObject();
        oVersus.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsImmune(oCreature, tImmunityType, oVersus, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsInCombat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsInCombat(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsInSubArea(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        NWObject oSubArea;
        oSubArea = new NWObject();
        oSubArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsInSubArea(oCreature, oSubArea, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsItemPropertyValid(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWItemProperty ipProperty;
        ipProperty = new NWItemProperty();
        ipProperty.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsItemPropertyValid(ipProperty, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsListening(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsListening(oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsNeutral(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsNeutral(oTarget, oSource, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsNight(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsNight(__current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsObjectValid(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsObjectValid(oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsOpen(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsOpen(oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsPC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsPC(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsPlaceableObjectActionPossible(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlaceable;
        oPlaceable = new NWObject();
        oPlaceable.__read(__is);
        PlaceableAction tPlaceableAction;
        tPlaceableAction = PlaceableAction.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsPlaceableObjectActionPossible(oPlaceable, tPlaceableAction, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsPlayableRacialType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsPlayableRacialType(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsPossessedFamiliar(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsPossessedFamiliar(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsReactionTypeFriendly(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsReactionTypeFriendly(oTarget, oSource, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsReactionTypeHostile(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsReactionTypeHostile(oTarget, oSource, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsReactionTypeNeutral(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsReactionTypeNeutral(oTarget, oSource, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsResting(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsResting(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsSkillSuccessful(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        int nSkill;
        nSkill = __is.readInt();
        int nDifficulty;
        nDifficulty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsSkillSuccessful(oTarget, nSkill, nDifficulty, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsTrapped(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsTrapped(oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getIsWeaponEffective(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oVersus;
        oVersus = new NWObject();
        oVersus.__read(__is);
        boolean bOffHand;
        bOffHand = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getIsWeaponEffective(oVersus, bOffHand, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemACValue(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemACValue(oItem, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemActivated(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getItemActivated(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemActivatedTarget(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getItemActivatedTarget(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemActivatedTargetLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWLocation __ret = __obj.getItemActivatedTargetLocation(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemActivator(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getItemActivator(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemAppearance(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        int nType;
        nType = __is.readInt();
        int nIndex;
        nIndex = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemAppearance(oItem, nType, nIndex, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemCharges(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemCharges(oItem, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemCursedFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getItemCursedFlag(oItem, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemHasItemProperty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        int nProperty;
        nProperty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getItemHasItemProperty(oItem, nProperty, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemInSlot(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        InventorySlot tInventorySlot;
        tInventorySlot = InventorySlot.__read(__is);
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getItemInSlot(tInventorySlot, oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemPossessedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        String sItemTag;
        sItemTag = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getItemPossessedBy(oCreature, sItemTag, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemPossessor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getItemPossessor(oItem, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemPropertyCostTable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWItemProperty iProp;
        iProp = new NWItemProperty();
        iProp.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemPropertyCostTable(iProp, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemPropertyCostTableValue(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWItemProperty iProp;
        iProp = new NWItemProperty();
        iProp.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemPropertyCostTableValue(iProp, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemPropertyDurationType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWItemProperty ip;
        ip = new NWItemProperty();
        ip.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            DurationType __ret = __obj.getItemPropertyDurationType(ip, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemPropertyParam1(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWItemProperty iProp;
        iProp = new NWItemProperty();
        iProp.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemPropertyParam1(iProp, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemPropertyParam1Value(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWItemProperty iProp;
        iProp = new NWItemProperty();
        iProp.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemPropertyParam1Value(iProp, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemPropertySubType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWItemProperty iProperty;
        iProperty = new NWItemProperty();
        iProperty.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemPropertySubType(iProperty, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemPropertyType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWItemProperty ip;
        ip = new NWItemProperty();
        ip.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemPropertyType(ip, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getItemStackSize(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getItemStackSize(oItem, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getJournalQuestExperience(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String szPlotID;
        szPlotID = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getJournalQuestExperience(szPlotID, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getKeyRequiredFeedback(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getKeyRequiredFeedback(oObject, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastAssociateCommand(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oAssociate;
        oAssociate = new NWObject();
        oAssociate.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            AssociateCommand __ret = __obj.getLastAssociateCommand(oAssociate, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastAttackMode(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            CombatMode __ret = __obj.getLastAttackMode(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastAttackType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            SpecialAttack __ret = __obj.getLastAttackType(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastAttacker(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oAttackee;
        oAttackee = new NWObject();
        oAttackee.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastAttacker(oAttackee, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastClosedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastClosedBy(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastDamager(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastDamager(oObject, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastDisarmed(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastDisarmed(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastDisturbed(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastDisturbed(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastHostileActor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oVictim;
        oVictim = new NWObject();
        oVictim.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastHostileActor(oVictim, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastKiller(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastKiller(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastLocked(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastLocked(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastOpenedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastOpenedBy(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastPCRested(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastPCRested(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastPCToCancelCutscene(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastPCToCancelCutscene(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastPerceived(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastPerceived(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastPerceptionHeard(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getLastPerceptionHeard(__current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastPerceptionInaudible(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getLastPerceptionInaudible(__current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastPerceptionSeen(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getLastPerceptionSeen(__current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastPerceptionVanished(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getLastPerceptionVanished(__current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastPlayerDied(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastPlayerDied(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastPlayerDying(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastPlayerDying(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastRespawnButtonPresser(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastRespawnButtonPresser(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastRestEventType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getLastRestEventType(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastSpeaker(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastSpeaker(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastSpell(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getLastSpell(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastSpellCastClass(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getLastSpellCastClass(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastSpellCaster(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastSpellCaster(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastSpellHarmful(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getLastSpellHarmful(__current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastTrapDetected(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastTrapDetected(oTarget, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastUnlocked(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastUnlocked(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastUsedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastUsedBy(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLastWeaponUsed(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLastWeaponUsed(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLawChaosValue(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getLawChaosValue(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLevelByClass(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nClassType;
        nClassType = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getLevelByClass(nClassType, oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLevelByPosition(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nClassPosition;
        nClassPosition = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getLevelByPosition(nClassPosition, oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getListenPatternNumber(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getListenPatternNumber(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLocalFloat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getLocalFloat(oObject, sVarName, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLocalInt(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getLocalInt(oObject, sVarName, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLocalLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWLocation __ret = __obj.getLocalLocation(oObject, sVarName, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLocalObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getLocalObject(oObject, sVarName, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLocalString(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getLocalString(oObject, sVarName, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWLocation __ret = __obj.getLocation(oObject, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLockKeyRequired(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getLockKeyRequired(oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLockKeyTag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getLockKeyTag(oObject, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLockLockDC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getLockLockDC(oObject, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLockLockable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getLockLockable(oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLockUnlockDC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getLockUnlockDC(oObject, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLocked(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getLocked(oTarget, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getLootable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getLootable(oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getMaster(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oAssociate;
        oAssociate = new NWObject();
        oAssociate.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getMaster(oAssociate, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getMatchedSubstring(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nString;
        nString = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getMatchedSubstring(nString, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getMatchedSubstringsCount(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getMatchedSubstringsCount(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getMaxHenchmen(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getMaxHenchmen(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getMaxHitPoints(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getMaxHitPoints(oObject, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getMetaMagicFeat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            MetaMagic __ret = __obj.getMetaMagicFeat(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getModule(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getModule(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getModuleItemAcquired(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getModuleItemAcquired(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getModuleItemAcquiredBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getModuleItemAcquiredBy(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getModuleItemAcquiredFrom(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getModuleItemAcquiredFrom(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getModuleItemAcquiredStackSize(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getModuleItemAcquiredStackSize(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getModuleItemLost(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getModuleItemLost(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getModuleItemLostBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getModuleItemLostBy(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getModuleName(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getModuleName(__current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getModuleXPScale(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getModuleXPScale(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getMovementRate(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getMovementRate(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getName(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        boolean bOriginalName;
        bOriginalName = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getName(oObject, bOriginalName, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getNearestCreature(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFirstCriteriaType;
        nFirstCriteriaType = __is.readInt();
        int nFirstCriteriaValue;
        nFirstCriteriaValue = __is.readInt();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        int nNth;
        nNth = __is.readInt();
        int nSecondCriteriaType;
        nSecondCriteriaType = __is.readInt();
        int nSecondCriteriaValue;
        nSecondCriteriaValue = __is.readInt();
        int nThirdCriteriaType;
        nThirdCriteriaType = __is.readInt();
        int nThirdCriteriaValue;
        nThirdCriteriaValue = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getNearestCreature(nFirstCriteriaType, nFirstCriteriaValue, oTarget, nNth, nSecondCriteriaType, nSecondCriteriaValue, nThirdCriteriaType, nThirdCriteriaValue, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getNearestCreatureToLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFirstCriteriaType;
        nFirstCriteriaType = __is.readInt();
        int nFirstCriteriaValue;
        nFirstCriteriaValue = __is.readInt();
        NWLocation lLocation;
        lLocation = new NWLocation();
        lLocation.__read(__is);
        int nNth;
        nNth = __is.readInt();
        int nSecondCriteriaType;
        nSecondCriteriaType = __is.readInt();
        int nSecondCriteriaValue;
        nSecondCriteriaValue = __is.readInt();
        int nThirdCriteriaType;
        nThirdCriteriaType = __is.readInt();
        int nThirdCriteriaValue;
        nThirdCriteriaValue = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getNearestCreatureToLocation(nFirstCriteriaType, nFirstCriteriaValue, lLocation, nNth, nSecondCriteriaType, nSecondCriteriaValue, nThirdCriteriaType, nThirdCriteriaValue, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getNearestObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ObjectType tObjectType;
        tObjectType = ObjectType.__read(__is);
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        int nNth;
        nNth = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getNearestObject(tObjectType, oTarget, nNth, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getNearestObjectByTag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sTag;
        sTag = __is.readString();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        int nNth;
        nNth = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getNearestObjectByTag(sTag, oTarget, nNth, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getNearestObjectToLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        ObjectType tObjectType;
        tObjectType = ObjectType.__read(__is);
        NWLocation lLocation;
        lLocation = new NWLocation();
        lLocation.__read(__is);
        int nNth;
        nNth = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getNearestObjectToLocation(tObjectType, lLocation, nNth, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getNearestTrapToObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        boolean bTrapDetected;
        bTrapDetected = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getNearestTrapToObject(oTarget, bTrapDetected, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getNumStackedItems(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getNumStackedItems(oItem, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getObjectByTag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sTag;
        sTag = __is.readString();
        int nNth;
        nNth = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getObjectByTag(sTag, nNth, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getObjectHeard(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getObjectHeard(oTarget, oSource, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getObjectSeen(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getObjectSeen(oTarget, oSource, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getObjectType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            ObjectType __ret = __obj.getObjectType(oTarget, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCChatMessage(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getPCChatMessage(__current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCChatSpeaker(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getPCChatSpeaker(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCChatVolume(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getPCChatVolume(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCIPAddress(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getPCIPAddress(oPlayer, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCItemLastEquipped(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getPCItemLastEquipped(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCItemLastEquippedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getPCItemLastEquippedBy(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCItemLastUnequipped(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getPCItemLastUnequipped(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCItemLastUnequippedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getPCItemLastUnequippedBy(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCLevellingUp(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getPCLevellingUp(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCPlayerName(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getPCPlayerName(oPlayer, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCPublicCDKey(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        boolean bSinglePlayerCDKey;
        bSinglePlayerCDKey = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getPCPublicCDKey(oPlayer, bSinglePlayerCDKey, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPCSpeaker(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getPCSpeaker(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPhenoType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            PhenoType __ret = __obj.getPhenoType(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPickpocketableFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getPickpocketableFlag(oItem, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPlaceableIllumination(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlaceable;
        oPlaceable = new NWObject();
        oPlaceable.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getPlaceableIllumination(oPlaceable, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPlaceableLastClickedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getPlaceableLastClickedBy(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPlotFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getPlotFlag(oTarget, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPortraitId(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getPortraitId(oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPortraitResRef(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getPortraitResRef(oTarget, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getPosition(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWVector __ret = __obj.getPosition(oTarget, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getRacialType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            RacialType __ret = __obj.getRacialType(oCreature, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getReflexAdjustedDamage(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nDamage;
        nDamage = __is.readInt();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        int nDC;
        nDC = __is.readInt();
        SaveType tSaveType;
        tSaveType = SaveType.__read(__is);
        NWObject oSaveVersus;
        oSaveVersus = new NWObject();
        oSaveVersus.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getReflexAdjustedDamage(nDamage, oTarget, nDC, tSaveType, oSaveVersus, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getReflexSavingThrow(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getReflexSavingThrow(oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getReputation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getReputation(oSource, oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getResRef(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getResRef(oObject, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSittingCreature(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oChair;
        oChair = new NWObject();
        oChair.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getSittingCreature(oChair, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSkillRank(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSkill;
        nSkill = __is.readInt();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        boolean bBaseSkillRank;
        bBaseSkillRank = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getSkillRank(nSkill, oTarget, bBaseSkillRank, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSkyBox(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getSkyBox(oArea, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSpellCastItem(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getSpellCastItem(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSpellId(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getSpellId(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSpellResistance(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getSpellResistance(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSpellSaveDC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getSpellSaveDC(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSpellTargetLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWLocation __ret = __obj.getSpellTargetLocation(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSpellTargetObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getSpellTargetObject(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getStandardFactionReputation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        StandardFaction tStandardFaction;
        tStandardFaction = StandardFaction.__read(__is);
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getStandardFactionReputation(tStandardFaction, oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getStartingLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWLocation __ret = __obj.getStartingLocation(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getStealthMode(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getStealthMode(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getStolenFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oStolen;
        oStolen = new NWObject();
        oStolen.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getStolenFlag(oStolen, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getStoreGold(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oidStore;
        oidStore = new NWObject();
        oidStore.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getStoreGold(oidStore, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getStoreIdentifyCost(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oidStore;
        oidStore = new NWObject();
        oidStore.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getStoreIdentifyCost(oidStore, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getStoreMaxBuyPrice(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oidStore;
        oidStore = new NWObject();
        oidStore.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getStoreMaxBuyPrice(oidStore, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getStrRefSoundDuration(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nStrRef;
        nStrRef = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.getStrRefSoundDuration(nStrRef, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getStringByStrRef(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nStrRef;
        nStrRef = __is.readInt();
        Gender tGender;
        tGender = Gender.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getStringByStrRef(nStrRef, tGender, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getSubRace(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getSubRace(oTarget, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getTag(oObject, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTileMainLight1Color(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lTile;
        lTile = new NWLocation();
        lTile.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            TileMainLightColor __ret = __obj.getTileMainLight1Color(lTile, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTileMainLight2Color(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lTile;
        lTile = new NWLocation();
        lTile.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            TileMainLightColor __ret = __obj.getTileMainLight2Color(lTile, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTileSourceLight1Color(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lTile;
        lTile = new NWLocation();
        lTile.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            TileSourceLightColor __ret = __obj.getTileSourceLight1Color(lTile, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTileSourceLight2Color(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lTile;
        lTile = new NWLocation();
        lTile.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            TileSourceLightColor __ret = __obj.getTileSourceLight2Color(lTile, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTilesetResRef(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getTilesetResRef(oArea, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTimeHour(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getTimeHour(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTimeMillisecond(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getTimeMillisecond(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTimeMinute(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getTimeMinute(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTimeSecond(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getTimeSecond(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTotalDamageDealt(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getTotalDamageDealt(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTransitionTarget(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTransition;
        oTransition = new NWObject();
        oTransition.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getTransitionTarget(oTransition, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapActive(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getTrapActive(oTrapObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapBaseType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getTrapBaseType(oTrapObject, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapCreator(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getTrapCreator(oTrapObject, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapDetectDC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getTrapDetectDC(oTrapObject, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapDetectable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getTrapDetectable(oTrapObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapDetectedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getTrapDetectedBy(oTrapObject, oCreature, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapDisarmDC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getTrapDisarmDC(oTrapObject, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapDisarmable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getTrapDisarmable(oTrapObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapFlagged(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getTrapFlagged(oTrapObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapKeyTag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.getTrapKeyTag(oTrapObject, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapOneShot(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getTrapOneShot(oTrapObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTrapRecoverable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getTrapRecoverable(oTrapObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getTurnResistanceHD(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oUndead;
        oUndead = new NWObject();
        oUndead.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getTurnResistanceHD(oUndead, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getUseableFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getUseableFlag(oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getUserDefinedEventNumber(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getUserDefinedEventNumber(__current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getWaypointByTag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sWaypointTag;
        sWaypointTag = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.getWaypointByTag(sWaypointTag, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getWeaponRanged(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.getWeaponRanged(oItem, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getWeather(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            Weather __ret = __obj.getWeather(oArea, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getWeight(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getWeight(oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getWillSavingThrow(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getWillSavingThrow(oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___getXP(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.getXP(oCreature, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___giveGoldToCreature(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nGP;
        nGP = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.giveGoldToCreature(oCreature, nGP, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___giveXPToCreature(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nXpAmount;
        nXpAmount = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.giveXPToCreature(oCreature, nXpAmount, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___hoursToSeconds(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nHours;
        nHours = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.hoursToSeconds(nHours, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___incrementRemainingFeatUses(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nFeat;
        nFeat = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.incrementRemainingFeatUses(oCreature, nFeat, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___isInConversation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            boolean __ret = __obj.isInConversation(oObject, __current);
            __os.writeBool(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyACBonus(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyACBonus(nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyACBonusVsAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPAlignGroup tIPAlignGroup;
        tIPAlignGroup = IPAlignGroup.__read(__is);
        int nACBonus;
        nACBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyACBonusVsAlign(tIPAlignGroup, nACBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyACBonusVsDmgType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        int nACBonus;
        nACBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyACBonusVsDmgType(tIPDamageType, nACBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyACBonusVsRace(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPRacialType tIPRacialType;
        tIPRacialType = IPRacialType.__read(__is);
        int nACBonus;
        nACBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyACBonusVsRace(tIPRacialType, nACBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyACBonusVsSAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Alignment tAlignment;
        tAlignment = Alignment.__read(__is);
        int nACBonus;
        nACBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyACBonusVsSAlign(tAlignment, nACBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyAbilityBonus(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Ability tAbility;
        tAbility = Ability.__read(__is);
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyAbilityBonus(tAbility, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyAdditional(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAdditionalProperty;
        nAdditionalProperty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyAdditional(nAdditionalProperty, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyArcaneSpellFailure(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nModLevel;
        nModLevel = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyArcaneSpellFailure(nModLevel, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyAttackBonus(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyAttackBonus(nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyAttackBonusVsAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPAlignGroup tIPAlignGroup;
        tIPAlignGroup = IPAlignGroup.__read(__is);
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyAttackBonusVsAlign(tIPAlignGroup, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyAttackBonusVsRace(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPRacialType tIPRacialType;
        tIPRacialType = IPRacialType.__read(__is);
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyAttackBonusVsRace(tIPRacialType, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyAttackBonusVsSAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Alignment tAlignment;
        tAlignment = Alignment.__read(__is);
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyAttackBonusVsSAlign(tAlignment, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyAttackPenalty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPenalty;
        nPenalty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyAttackPenalty(nPenalty, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyBonusFeat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFeat;
        nFeat = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyBonusFeat(nFeat, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyBonusLevelSpell(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nClass;
        nClass = __is.readInt();
        int nSpellLevel;
        nSpellLevel = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyBonusLevelSpell(nClass, nSpellLevel, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyBonusSavingThrow(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBaseSaveType;
        nBaseSaveType = __is.readInt();
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyBonusSavingThrow(nBaseSaveType, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyBonusSavingThrowVsX(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBonusType;
        nBonusType = __is.readInt();
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyBonusSavingThrowVsX(nBonusType, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyBonusSpellResistance(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyBonusSpellResistance(nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyCastSpell(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSpell;
        nSpell = __is.readInt();
        int nNumUses;
        nNumUses = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyCastSpell(nSpell, nNumUses, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyContainerReducedWeight(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nContainerType;
        nContainerType = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyContainerReducedWeight(nContainerType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDamageBonus(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        int nDamage;
        nDamage = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDamageBonus(tIPDamageType, nDamage, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDamageBonusVsAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPAlignGroup tIPAlignGroup;
        tIPAlignGroup = IPAlignGroup.__read(__is);
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        int nDamage;
        nDamage = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDamageBonusVsAlign(tIPAlignGroup, tIPDamageType, nDamage, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDamageBonusVsRace(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPRacialType tIPRacialType;
        tIPRacialType = IPRacialType.__read(__is);
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        int nDamage;
        nDamage = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDamageBonusVsRace(tIPRacialType, tIPDamageType, nDamage, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDamageBonusVsSAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Alignment tAlignment;
        tAlignment = Alignment.__read(__is);
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        int nDamage;
        nDamage = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDamageBonusVsSAlign(tAlignment, tIPDamageType, nDamage, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDamageImmunity(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        int nImmuneBonus;
        nImmuneBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDamageImmunity(tIPDamageType, nImmuneBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDamagePenalty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPenalty;
        nPenalty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDamagePenalty(nPenalty, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDamageReduction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nEnhancement;
        nEnhancement = __is.readInt();
        int nHPSoak;
        nHPSoak = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDamageReduction(nEnhancement, nHPSoak, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDamageResistance(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        int nHPResist;
        nHPResist = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDamageResistance(tIPDamageType, nHPResist, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDamageVulnerability(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        int nVulnerability;
        nVulnerability = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDamageVulnerability(tIPDamageType, nVulnerability, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDarkvision(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDarkvision(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDecreaseAC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nModifierType;
        nModifierType = __is.readInt();
        int nPenalty;
        nPenalty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDecreaseAC(nModifierType, nPenalty, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDecreaseAbility(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Ability tAbility;
        tAbility = Ability.__read(__is);
        int nModifier;
        nModifier = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDecreaseAbility(tAbility, nModifier, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyDecreaseSkill(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSkill;
        nSkill = __is.readInt();
        int nPenalty;
        nPenalty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyDecreaseSkill(nSkill, nPenalty, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyEnhancementBonus(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nEnhancementBonus;
        nEnhancementBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyEnhancementBonus(nEnhancementBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyEnhancementBonusVsAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPAlignGroup tIPAlignGroup;
        tIPAlignGroup = IPAlignGroup.__read(__is);
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyEnhancementBonusVsAlign(tIPAlignGroup, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyEnhancementBonusVsRace(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPRacialType tIPRacialType;
        tIPRacialType = IPRacialType.__read(__is);
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyEnhancementBonusVsRace(tIPRacialType, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyEnhancementBonusVsSAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Alignment tAlignment;
        tAlignment = Alignment.__read(__is);
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyEnhancementBonusVsSAlign(tAlignment, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyEnhancementPenalty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPenalty;
        nPenalty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyEnhancementPenalty(nPenalty, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyExtraMeleeDamageType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyExtraMeleeDamageType(tIPDamageType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyExtraRangeDamageType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPDamageType tIPDamageType;
        tIPDamageType = IPDamageType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyExtraRangeDamageType(tIPDamageType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyFreeAction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyFreeAction(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyHaste(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyHaste(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyHealersKit(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nModifier;
        nModifier = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyHealersKit(nModifier, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyHolyAvenger(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyHolyAvenger(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyImmunityMisc(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPMiscImmunityType tIPMiscImmunityType;
        tIPMiscImmunityType = IPMiscImmunityType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyImmunityMisc(tIPMiscImmunityType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyImmunityToSpellLevel(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nLevel;
        nLevel = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyImmunityToSpellLevel(nLevel, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyImprovedEvasion(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyImprovedEvasion(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyKeen(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyKeen(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyLight(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBrightness;
        nBrightness = __is.readInt();
        int nColor;
        nColor = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyLight(nBrightness, nColor, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyLimitUseByAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPAlignGroup tIPAlignGroup;
        tIPAlignGroup = IPAlignGroup.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyLimitUseByAlign(tIPAlignGroup, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyLimitUseByClass(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nClass;
        nClass = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyLimitUseByClass(nClass, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyLimitUseByRace(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPRacialType tIPRacialType;
        tIPRacialType = IPRacialType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyLimitUseByRace(tIPRacialType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyLimitUseBySAlign(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Alignment tAlignment;
        tAlignment = Alignment.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyLimitUseBySAlign(tAlignment, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyMassiveCritical(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nDamage;
        nDamage = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyMassiveCritical(nDamage, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyMaterial(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nMaterialType;
        nMaterialType = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyMaterial(nMaterialType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyMaxRangeStrengthMod(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nModifier;
        nModifier = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyMaxRangeStrengthMod(nModifier, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyMonsterDamage(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nDamage;
        nDamage = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyMonsterDamage(nDamage, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyNoDamage(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyNoDamage(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyOnHitCastSpell(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSpell;
        nSpell = __is.readInt();
        int nLevel;
        nLevel = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyOnHitCastSpell(nSpell, nLevel, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyOnHitProps(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nProperty;
        nProperty = __is.readInt();
        int nSaveDC;
        nSaveDC = __is.readInt();
        int nSpecial;
        nSpecial = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyOnHitProps(nProperty, nSaveDC, nSpecial, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyOnMonsterHitProperties(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nProperty;
        nProperty = __is.readInt();
        int nSpecial;
        nSpecial = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyOnMonsterHitProperties(nProperty, nSpecial, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyQuality(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nQuality;
        nQuality = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyQuality(nQuality, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyReducedSavingThrow(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBonusType;
        nBonusType = __is.readInt();
        int nPenalty;
        nPenalty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyReducedSavingThrow(nBonusType, nPenalty, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyReducedSavingThrowVsX(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBaseSaveType;
        nBaseSaveType = __is.readInt();
        int nPenalty;
        nPenalty = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyReducedSavingThrowVsX(nBaseSaveType, nPenalty, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyRegeneration(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nRegenAmount;
        nRegenAmount = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyRegeneration(nRegenAmount, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertySkillBonus(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSkill;
        nSkill = __is.readInt();
        int nBonus;
        nBonus = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertySkillBonus(nSkill, nBonus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertySpecialWalk(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nWalkType;
        nWalkType = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertySpecialWalk(nWalkType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertySpellImmunitySchool(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        IPSpellSchool tIPSpellSchool;
        tIPSpellSchool = IPSpellSchool.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertySpellImmunitySchool(tIPSpellSchool, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertySpellImmunitySpecific(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSpell;
        nSpell = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertySpellImmunitySpecific(nSpell, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyThievesTools(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nModifier;
        nModifier = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyThievesTools(nModifier, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyTrap(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nTrapLevel;
        nTrapLevel = __is.readInt();
        IPTrapType tIPTrapType;
        tIPTrapType = IPTrapType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyTrap(nTrapLevel, tIPTrapType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyTrueSeeing(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyTrueSeeing(__current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyTurnResistance(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nModifier;
        nModifier = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyTurnResistance(nModifier, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyUnlimitedAmmo(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAmmoDamage;
        nAmmoDamage = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyUnlimitedAmmo(nAmmoDamage, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyVampiricRegeneration(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nRegenAmount;
        nRegenAmount = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyVampiricRegeneration(nRegenAmount, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyVisualEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nEffect;
        nEffect = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyVisualEffect(nEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyWeightIncrease(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nWeight;
        nWeight = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyWeightIncrease(nWeight, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___itemPropertyWeightReduction(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nReduction;
        nReduction = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWItemProperty __ret = __obj.itemPropertyWeightReduction(nReduction, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___jumpToLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lDestination;
        lDestination = new NWLocation();
        lDestination.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.jumpToLocation(lDestination, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___jumpToObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oToJumpTo;
        oToJumpTo = new NWObject();
        oToJumpTo.__read(__is);
        boolean bWalkStraightLineToPoint;
        bWalkStraightLineToPoint = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.jumpToObject(oToJumpTo, bWalkStraightLineToPoint, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___levelUpHenchman(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nClass;
        nClass = __is.readInt();
        boolean bReadyAllSpells;
        bReadyAllSpells = __is.readBool();
        int nPackage;
        nPackage = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.levelUpHenchman(oCreature, nClass, bReadyAllSpells, nPackage, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___lineOfSightObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.lineOfSightObject(oSource, oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___lineOfSightVector(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWVector vSource;
        vSource = new NWVector();
        vSource.__read(__is);
        NWVector vTarget;
        vTarget = new NWVector();
        vTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.lineOfSightVector(vSource, vTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___lockCameraDirection(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        boolean bLocked;
        bLocked = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.lockCameraDirection(oPlayer, bLocked, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___lockCameraDistance(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        boolean bLocked;
        bLocked = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.lockCameraDistance(oPlayer, bLocked, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___lockCameraPitch(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        boolean bLocked;
        bLocked = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.lockCameraPitch(oPlayer, bLocked, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___magicalEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.magicalEffect(eEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBackgroundChangeDay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        int nTrack;
        nTrack = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.musicBackgroundChangeDay(oArea, nTrack, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBackgroundChangeNight(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        int nTrack;
        nTrack = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.musicBackgroundChangeNight(oArea, nTrack, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBackgroundGetBattleTrack(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.musicBackgroundGetBattleTrack(oArea, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBackgroundGetDayTrack(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.musicBackgroundGetDayTrack(oArea, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBackgroundGetNightTrack(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.musicBackgroundGetNightTrack(oArea, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBackgroundPlay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.musicBackgroundPlay(oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBackgroundSetDelay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        int nDelay;
        nDelay = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.musicBackgroundSetDelay(oArea, nDelay, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBackgroundStop(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.musicBackgroundStop(oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBattleChange(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        int nTrack;
        nTrack = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.musicBattleChange(oArea, nTrack, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBattlePlay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.musicBattlePlay(oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___musicBattleStop(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.musicBattleStop(oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___nightToDay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        double fTransitionTime;
        fTransitionTime = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.nightToDay(oPlayer, fTransitionTime, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___openInventory(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.openInventory(oCreature, oPlayer, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___openStore(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oStore;
        oStore = new NWObject();
        oStore.__read(__is);
        NWObject oPC;
        oPC = new NWObject();
        oPC.__read(__is);
        int nBonusMarkUp;
        nBonusMarkUp = __is.readInt();
        int nBonusMarkDown;
        nBonusMarkDown = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.openStore(oStore, oPC, nBonusMarkUp, nBonusMarkDown, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___playAnimation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAnimation;
        nAnimation = __is.readInt();
        double fSpeed;
        fSpeed = __is.readDouble();
        double fSeconds;
        fSeconds = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.playAnimation(nAnimation, fSpeed, fSeconds, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___playSound(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sSoundName;
        sSoundName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.playSound(sSoundName, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___playSoundByStrRef(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nStrRef;
        nStrRef = __is.readInt();
        int nRunAsAction;
        nRunAsAction = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.playSoundByStrRef(nStrRef, nRunAsAction, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___playVoiceChat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nVoiceChatID;
        nVoiceChatID = __is.readInt();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.playVoiceChat(nVoiceChatID, oTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___popUpDeathGUIPanel(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPC;
        oPC = new NWObject();
        oPC.__read(__is);
        boolean bRespawnButtonEnabled;
        bRespawnButtonEnabled = __is.readBool();
        boolean bWaitForHelpButtonEnabled;
        bWaitForHelpButtonEnabled = __is.readBool();
        int nHelpStringReference;
        nHelpStringReference = __is.readInt();
        String sHelpString;
        sHelpString = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.popUpDeathGUIPanel(oPC, bRespawnButtonEnabled, bWaitForHelpButtonEnabled, nHelpStringReference, sHelpString, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___popUpGUIPanel(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPC;
        oPC = new NWObject();
        oPC.__read(__is);
        int nGUIPanel;
        nGUIPanel = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.popUpGUIPanel(oPC, nGUIPanel, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___randomName(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nNameType;
        nNameType = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            String __ret = __obj.randomName(nNameType, __current);
            __os.writeString(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___recomputeStaticLighting(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.recomputeStaticLighting(oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___reflexSave(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nDC;
        nDC = __is.readInt();
        SaveType tSaveType;
        tSaveType = SaveType.__read(__is);
        NWObject oSaveVersus;
        oSaveVersus = new NWObject();
        oSaveVersus.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            SavingThrowResult __ret = __obj.reflexSave(oCreature, nDC, tSaveType, oSaveVersus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___removeEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.removeEffect(oCreature, eEffect, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___removeFromParty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPC;
        oPC = new NWObject();
        oPC.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.removeFromParty(oPC, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___removeHenchman(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMaster;
        oMaster = new NWObject();
        oMaster.__read(__is);
        NWObject oHenchman;
        oHenchman = new NWObject();
        oHenchman.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.removeHenchman(oMaster, oHenchman, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___removeItemProperty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        NWItemProperty ipProperty;
        ipProperty = new NWItemProperty();
        ipProperty.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.removeItemProperty(oItem, ipProperty, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidItemPropertyException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___removeJournalQuestEntry(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String szPlotID;
        szPlotID = __is.readString();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        boolean bAllPartyMembers;
        bAllPartyMembers = __is.readBool();
        boolean bAllPlayers;
        bAllPlayers = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.removeJournalQuestEntry(szPlotID, oCreature, bAllPartyMembers, bAllPlayers, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___removeSummonedAssociate(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMaster;
        oMaster = new NWObject();
        oMaster.__read(__is);
        NWObject oAssociate;
        oAssociate = new NWObject();
        oAssociate.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.removeSummonedAssociate(oMaster, oAssociate, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___resistSpell(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCaster;
        oCaster = new NWObject();
        oCaster.__read(__is);
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.resistSpell(oCaster, oTarget, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___restoreBaseAttackBonus(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.restoreBaseAttackBonus(oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___restoreCameraFacing(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.restoreCameraFacing(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___retrieveCampaignObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWLocation locLocation;
        locLocation = new NWLocation();
        locLocation.__read(__is);
        NWObject oOwner;
        oOwner = new NWObject();
        oOwner.__read(__is);
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWObject __ret = __obj.retrieveCampaignObject(sCampaignName, sVarName, locLocation, oOwner, oPlayer, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___roundsToSeconds(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nRounds;
        nRounds = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.roundsToSeconds(nRounds, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___sendMessageToAllDMs(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String szMessage;
        szMessage = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.sendMessageToAllDMs(szMessage, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___sendMessageToPC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        String szMessage;
        szMessage = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.sendMessageToPC(oPlayer, szMessage, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___sendMessageToPCByStrRef(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        int nStrRef;
        nStrRef = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.sendMessageToPCByStrRef(oPlayer, nStrRef, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setAILevel(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        AILevel tAILevel;
        tAILevel = AILevel.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setAILevel(oTarget, tAILevel, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setActionMode(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        ActionMode tActionMode;
        tActionMode = ActionMode.__read(__is);
        boolean bStatus;
        bStatus = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setActionMode(oCreature, tActionMode, bStatus, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setAreaTransitionBMP(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nPredefinedAreaTransition;
        nPredefinedAreaTransition = __is.readInt();
        String sCustomAreaTransitionBMP;
        sCustomAreaTransitionBMP = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setAreaTransitionBMP(nPredefinedAreaTransition, sCustomAreaTransitionBMP, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setAssociateListenPatterns(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setAssociateListenPatterns(oTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setBaseAttackBonus(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nBaseAttackBonus;
        nBaseAttackBonus = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setBaseAttackBonus(nBaseAttackBonus, oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCalendar(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nYear;
        nYear = __is.readInt();
        int nMonth;
        nMonth = __is.readInt();
        int nDay;
        nDay = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCalendar(nYear, nMonth, nDay, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCameraFacing(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        double fDirection;
        fDirection = __is.readDouble();
        double fDistance;
        fDistance = __is.readDouble();
        double fPitch;
        fPitch = __is.readDouble();
        int nTransitionType;
        nTransitionType = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCameraFacing(fDirection, fDistance, fPitch, nTransitionType, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCameraHeight(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        double fHeight;
        fHeight = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCameraHeight(oPlayer, fHeight, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCameraMode(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        int nCameraMode;
        nCameraMode = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCameraMode(oPlayer, nCameraMode, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCampaignFloat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        double flFloat;
        flFloat = __is.readDouble();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCampaignFloat(sCampaignName, sVarName, flFloat, oPlayer, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCampaignInt(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        int nInt;
        nInt = __is.readInt();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCampaignInt(sCampaignName, sVarName, nInt, oPlayer, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCampaignLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWLocation locLocation;
        locLocation = new NWLocation();
        locLocation.__read(__is);
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCampaignLocation(sCampaignName, sVarName, locLocation, oPlayer, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCampaignString(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        String sString;
        sString = __is.readString();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCampaignString(sCampaignName, sVarName, sString, oPlayer, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCampaignVector(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWVector vVector;
        vVector = new NWVector();
        vVector.__read(__is);
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCampaignVector(sCampaignName, sVarName, vVector, oPlayer, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setColor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        int nColorChannel;
        nColorChannel = __is.readInt();
        int nColorValue;
        nColorValue = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setColor(oObject, nColorChannel, nColorValue, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCommandable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        boolean bCommandable;
        bCommandable = __is.readBool();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCommandable(bCommandable, oTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCreatureAppearanceType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nAppearanceType;
        nAppearanceType = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCreatureAppearanceType(oCreature, nAppearanceType, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCreatureBodyPart(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        CreaturePart tCreaturePart;
        tCreaturePart = CreaturePart.__read(__is);
        int nModelNumber;
        nModelNumber = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCreatureBodyPart(tCreaturePart, nModelNumber, oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCreatureTailType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nTailType;
        nTailType = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCreatureTailType(nTailType, oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCreatureWingType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nWingType;
        nWingType = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCreatureWingType(nWingType, oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCustomToken(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nCustomTokenNumber;
        nCustomTokenNumber = __is.readInt();
        String sTokenValue;
        sTokenValue = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCustomToken(nCustomTokenNumber, sTokenValue, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCutsceneCameraMoveRate(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        double fRate;
        fRate = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCutsceneCameraMoveRate(oCreature, fRate, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setCutsceneMode(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        boolean bInCutscene;
        bInCutscene = __is.readBool();
        boolean bLeftClickingEnabled;
        bLeftClickingEnabled = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setCutsceneMode(oCreature, bInCutscene, bLeftClickingEnabled, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setDeity(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        String sDeity;
        sDeity = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setDeity(oCreature, sDeity, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setDescription(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sNewDescription;
        sNewDescription = __is.readString();
        boolean bIdentifiedDescription;
        bIdentifiedDescription = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setDescription(oObject, sNewDescription, bIdentifiedDescription, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setDroppableFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        boolean bDroppable;
        bDroppable = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setDroppableFlag(oItem, bDroppable, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setEncounterActive(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        boolean bNewValue;
        bNewValue = __is.readBool();
        NWObject oEncounter;
        oEncounter = new NWObject();
        oEncounter.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setEncounterActive(bNewValue, oEncounter, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setEncounterDifficulty(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nEncounterDifficulty;
        nEncounterDifficulty = __is.readInt();
        NWObject oEncounter;
        oEncounter = new NWObject();
        oEncounter.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setEncounterDifficulty(nEncounterDifficulty, oEncounter, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setEncounterSpawnsCurrent(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nNewValue;
        nNewValue = __is.readInt();
        NWObject oEncounter;
        oEncounter = new NWObject();
        oEncounter.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setEncounterSpawnsCurrent(nNewValue, oEncounter, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setEncounterSpawnsMax(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nNewValue;
        nNewValue = __is.readInt();
        NWObject oEncounter;
        oEncounter = new NWObject();
        oEncounter.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setEncounterSpawnsMax(nNewValue, oEncounter, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setFacing(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        double fDirection;
        fDirection = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setFacing(fDirection, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setFacingPoint(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWVector vTarget;
        vTarget = new NWVector();
        vTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setFacingPoint(vTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setFogAmount(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFogType;
        nFogType = __is.readInt();
        int nFogAmount;
        nFogAmount = __is.readInt();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setFogAmount(nFogType, nFogAmount, oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setFogColor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFogType;
        nFogType = __is.readInt();
        int nFogColor;
        nFogColor = __is.readInt();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setFogColor(nFogType, nFogColor, oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setFootstepType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nFootstepType;
        nFootstepType = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setFootstepType(nFootstepType, oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setFortitudeSavingThrow(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        int nFortitudeSave;
        nFortitudeSave = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setFortitudeSavingThrow(oObject, nFortitudeSave, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setHardness(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nHardness;
        nHardness = __is.readInt();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setHardness(nHardness, oObject, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setIdentified(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        boolean bIdentified;
        bIdentified = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setIdentified(oItem, bIdentified, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setImmortal(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        boolean bImmortal;
        bImmortal = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setImmortal(oCreature, bImmortal, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setInfiniteFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        boolean bInfinite;
        bInfinite = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setInfiniteFlag(oItem, bInfinite, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setIsDestroyable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        boolean bDestroyable;
        bDestroyable = __is.readBool();
        boolean bRaiseable;
        bRaiseable = __is.readBool();
        boolean bSelectableWhenDead;
        bSelectableWhenDead = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setIsDestroyable(bDestroyable, bRaiseable, bSelectableWhenDead, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setIsTemporaryEnemy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        boolean bDecays;
        bDecays = __is.readBool();
        double fDurationInSeconds;
        fDurationInSeconds = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setIsTemporaryEnemy(oTarget, oSource, bDecays, fDurationInSeconds, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setIsTemporaryFriend(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        boolean bDecays;
        bDecays = __is.readBool();
        double fDurationInSeconds;
        fDurationInSeconds = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setIsTemporaryFriend(oTarget, oSource, bDecays, fDurationInSeconds, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setIsTemporaryNeutral(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        NWObject oSource;
        oSource = new NWObject();
        oSource.__read(__is);
        boolean bDecays;
        bDecays = __is.readBool();
        double fDurationInSeconds;
        fDurationInSeconds = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setIsTemporaryNeutral(oTarget, oSource, bDecays, fDurationInSeconds, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setItemCharges(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        int nCharges;
        nCharges = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setItemCharges(oItem, nCharges, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setItemCursedFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        boolean bCursed;
        bCursed = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setItemCursedFlag(oItem, bCursed, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setItemStackSize(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        int nSize;
        nSize = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setItemStackSize(oItem, nSize, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setKeyRequiredFeedback(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sFeedbackMessage;
        sFeedbackMessage = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setKeyRequiredFeedback(oObject, sFeedbackMessage, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setListenPattern(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sPattern;
        sPattern = __is.readString();
        int nNumber;
        nNumber = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setListenPattern(oObject, sPattern, nNumber, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setListening(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        boolean bValue;
        bValue = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setListening(oObject, bValue, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLocalFloat(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        double fValue;
        fValue = __is.readDouble();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLocalFloat(oObject, sVarName, fValue, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLocalInt(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        int nValue;
        nValue = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLocalInt(oObject, sVarName, nValue, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLocalLocation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        NWLocation lValue;
        lValue = new NWLocation();
        lValue.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLocalLocation(oObject, sVarName, lValue, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLocalObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        NWObject oValue;
        oValue = new NWObject();
        oValue.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLocalObject(oObject, sVarName, oValue, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLocalString(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sVarName;
        sVarName = __is.readString();
        String sValue;
        sValue = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLocalString(oObject, sVarName, sValue, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLockKeyRequired(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        boolean bKeyRequired;
        bKeyRequired = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLockKeyRequired(oObject, bKeyRequired, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLockKeyTag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sNewKeyTag;
        sNewKeyTag = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLockKeyTag(oObject, sNewKeyTag, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLockLockDC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        int nNewLockDC;
        nNewLockDC = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLockLockDC(oObject, nNewLockDC, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLockLockable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        boolean bLockable;
        bLockable = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLockLockable(oObject, bLockable, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLockUnlockDC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        int nNewUnlockDC;
        nNewUnlockDC = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLockUnlockDC(oObject, nNewUnlockDC, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLocked(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        boolean bLocked;
        bLocked = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLocked(oTarget, bLocked, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setLootable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        boolean bLootable;
        bLootable = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setLootable(oCreature, bLootable, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setMapPinEnabled(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMapPin;
        oMapPin = new NWObject();
        oMapPin.__read(__is);
        boolean bEnabled;
        bEnabled = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setMapPinEnabled(oMapPin, bEnabled, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setMaxHenchmen(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nNumHenchmen;
        nNumHenchmen = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setMaxHenchmen(nNumHenchmen, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setModuleXPScale(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nXPScale;
        nXPScale = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setModuleXPScale(nXPScale, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setName(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        String sNewName;
        sNewName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setName(oObject, sNewName, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPCChatMessage(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sNewChatMessage;
        sNewChatMessage = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPCChatMessage(sNewChatMessage, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPCChatVolume(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        TalkVolume tTalkVolume;
        tTalkVolume = TalkVolume.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPCChatVolume(tTalkVolume, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPCDislike(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPCDislike(oPlayer, oTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPCLike(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPCLike(oPlayer, oTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPanelButtonFlash(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        Button tButton;
        tButton = Button.__read(__is);
        boolean bEnableFlash;
        bEnableFlash = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPanelButtonFlash(oPlayer, tButton, bEnableFlash, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPhenoType(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        PhenoType tPhenoType;
        tPhenoType = PhenoType.__read(__is);
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPhenoType(tPhenoType, oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPickpocketableFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        boolean bPickpocketable;
        bPickpocketable = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPickpocketableFlag(oItem, bPickpocketable, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPlaceableIllumination(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlaceable;
        oPlaceable = new NWObject();
        oPlaceable.__read(__is);
        boolean bIlluminate;
        bIlluminate = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPlaceableIllumination(oPlaceable, bIlluminate, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPlotFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        boolean bPlotFlag;
        bPlotFlag = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPlotFlag(oTarget, bPlotFlag, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPortraitId(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        int nPortraitId;
        nPortraitId = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPortraitId(oTarget, nPortraitId, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setPortraitResRef(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        String sPortraitResRef;
        sPortraitResRef = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setPortraitResRef(oTarget, sPortraitResRef, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setReflexSavingThrow(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        int nReflexSave;
        nReflexSave = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setReflexSavingThrow(oObject, nReflexSave, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setSkyBox(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nSkyBox;
        nSkyBox = __is.readInt();
        NWObject oArea;
        oArea = new NWObject();
        oArea.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setSkyBox(nSkyBox, oArea, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setStandardFactionReputation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        StandardFaction tStandardFaction;
        tStandardFaction = StandardFaction.__read(__is);
        int nNewReputation;
        nNewReputation = __is.readInt();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setStandardFactionReputation(tStandardFaction, nNewReputation, oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setStolenFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oItem;
        oItem = new NWObject();
        oItem.__read(__is);
        boolean bStolenFlag;
        bStolenFlag = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setStolenFlag(oItem, bStolenFlag, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setStoreGold(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oidStore;
        oidStore = new NWObject();
        oidStore.__read(__is);
        int nGold;
        nGold = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setStoreGold(oidStore, nGold, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setStoreIdentifyCost(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oidStore;
        oidStore = new NWObject();
        oidStore.__read(__is);
        int nCost;
        nCost = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setStoreIdentifyCost(oidStore, nCost, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setStoreMaxBuyPrice(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oidStore;
        oidStore = new NWObject();
        oidStore.__read(__is);
        int nMaxBuy;
        nMaxBuy = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setStoreMaxBuyPrice(oidStore, nMaxBuy, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setSubRace(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        String sSubRace;
        sSubRace = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setSubRace(oCreature, sSubRace, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTileMainLightColor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lTileLocation;
        lTileLocation = new NWLocation();
        lTileLocation.__read(__is);
        TileMainLightColor nMainLight1Color;
        nMainLight1Color = TileMainLightColor.__read(__is);
        TileMainLightColor nMainLight2Color;
        nMainLight2Color = TileMainLightColor.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTileMainLightColor(lTileLocation, nMainLight1Color, nMainLight2Color, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTileSourceLightColor(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWLocation lTileLocation;
        lTileLocation = new NWLocation();
        lTileLocation.__read(__is);
        TileSourceLightColor nSourceLight1Color;
        nSourceLight1Color = TileSourceLightColor.__read(__is);
        TileSourceLightColor nSourceLight2Color;
        nSourceLight2Color = TileSourceLightColor.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTileSourceLightColor(lTileLocation, nSourceLight1Color, nSourceLight2Color, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTime(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nHour;
        nHour = __is.readInt();
        int nMinute;
        nMinute = __is.readInt();
        int nSecond;
        nSecond = __is.readInt();
        int nMillisecond;
        nMillisecond = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTime(nHour, nMinute, nSecond, nMillisecond, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapActive(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        boolean bActive;
        bActive = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTrapActive(oTrapObject, bActive, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapDetectDC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        int nDetectDC;
        nDetectDC = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTrapDetectDC(oTrapObject, nDetectDC, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapDetectable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        boolean bDetectable;
        bDetectable = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTrapDetectable(oTrapObject, bDetectable, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapDetectedBy(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrap;
        oTrap = new NWObject();
        oTrap.__read(__is);
        NWObject oDetector;
        oDetector = new NWObject();
        oDetector.__read(__is);
        boolean bDetected;
        bDetected = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.setTrapDetectedBy(oTrap, oDetector, bDetected, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapDisabled(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrap;
        oTrap = new NWObject();
        oTrap.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTrapDisabled(oTrap, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapDisarmDC(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        int nDisarmDC;
        nDisarmDC = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTrapDisarmDC(oTrapObject, nDisarmDC, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapDisarmable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        boolean bDisarmable;
        bDisarmable = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTrapDisarmable(oTrapObject, bDisarmable, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapKeyTag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        String sKeyTag;
        sKeyTag = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTrapKeyTag(oTrapObject, sKeyTag, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapOneShot(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        boolean bOneShot;
        bOneShot = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTrapOneShot(oTrapObject, bOneShot, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setTrapRecoverable(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTrapObject;
        oTrapObject = new NWObject();
        oTrapObject.__read(__is);
        boolean bRecoverable;
        bRecoverable = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setTrapRecoverable(oTrapObject, bRecoverable, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setUseableFlag(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oPlaceable;
        oPlaceable = new NWObject();
        oPlaceable.__read(__is);
        boolean bUseableFlag;
        bUseableFlag = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setUseableFlag(oPlaceable, bUseableFlag, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setWeather(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        Weather tWeather;
        tWeather = Weather.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setWeather(oTarget, tWeather, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setWillSavingThrow(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        int nWillSave;
        nWillSave = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setWillSavingThrow(oObject, nWillSave, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___setXP(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nXpAmount;
        nXpAmount = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.setXP(oCreature, nXpAmount, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___soundObjectPlay(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oSound;
        oSound = new NWObject();
        oSound.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.soundObjectPlay(oSound, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___soundObjectSetPosition(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oSound;
        oSound = new NWObject();
        oSound.__read(__is);
        NWVector vPosition;
        vPosition = new NWVector();
        vPosition.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.soundObjectSetPosition(oSound, vPosition, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___soundObjectSetVolume(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oSound;
        oSound = new NWObject();
        oSound.__read(__is);
        int nVolume;
        nVolume = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.soundObjectSetVolume(oSound, nVolume, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___soundObjectStop(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oSound;
        oSound = new NWObject();
        oSound.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.soundObjectStop(oSound, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___speakOneLinerConversation(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sDialogResRef;
        sDialogResRef = __is.readString();
        NWObject oTokenTarget;
        oTokenTarget = new NWObject();
        oTokenTarget.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.speakOneLinerConversation(sDialogResRef, oTokenTarget, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___speakString(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sStringToSpeak;
        sStringToSpeak = __is.readString();
        TalkVolume tTalkVolume;
        tTalkVolume = TalkVolume.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.speakString(sStringToSpeak, tTalkVolume, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___speakStringByStrRef(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nStrRef;
        nStrRef = __is.readInt();
        TalkVolume tTalkVolume;
        tTalkVolume = TalkVolume.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.speakStringByStrRef(nStrRef, tTalkVolume, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___startNewModule(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sModuleName;
        sModuleName = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.startNewModule(sModuleName, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___stopFade(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.stopFade(oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___storeCameraFacing(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.storeCameraFacing(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___storeCampaignObject(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sCampaignName;
        sCampaignName = __is.readString();
        String sVarName;
        sVarName = __is.readString();
        NWObject oObject;
        oObject = new NWObject();
        oObject.__read(__is);
        NWObject oPlayer;
        oPlayer = new NWObject();
        oPlayer.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            int __ret = __obj.storeCampaignObject(sCampaignName, sVarName, oObject, oPlayer, __current);
            __os.writeInt(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___summonAnimalCompanion(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMaster;
        oMaster = new NWObject();
        oMaster.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.summonAnimalCompanion(oMaster, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___summonFamiliar(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oMaster;
        oMaster = new NWObject();
        oMaster.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.summonFamiliar(oMaster, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___supernaturalEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.supernaturalEffect(eEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___surrenderToEnemies(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.surrenderToEnemies(__current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___takeGoldFromCreature(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nAmount;
        nAmount = __is.readInt();
        NWObject oCreatureToTakeFrom;
        oCreatureToTakeFrom = new NWObject();
        oCreatureToTakeFrom.__read(__is);
        boolean bDestroy;
        bDestroy = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.takeGoldFromCreature(nAmount, oCreatureToTakeFrom, bDestroy, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___touchAttackMelee(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        boolean bDisplayFeedback;
        bDisplayFeedback = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            AttackResult __ret = __obj.touchAttackMelee(oTarget, bDisplayFeedback, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___touchAttackRanged(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oTarget;
        oTarget = new NWObject();
        oTarget.__read(__is);
        boolean bDisplayFeedback;
        bDisplayFeedback = __is.readBool();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            AttackResult __ret = __obj.touchAttackRanged(oTarget, bDisplayFeedback, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___turnsToSeconds(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int nTurns;
        nTurns = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.turnsToSeconds(nTurns, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___unpossessFamiliar(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.unpossessFamiliar(oCreature, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___vectorMagnitude(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWVector vVector;
        vVector = new NWVector();
        vVector.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.vectorMagnitude(vVector, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___vectorNormalize(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWVector vVector;
        vVector = new NWVector();
        vVector.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWVector __ret = __obj.vectorNormalize(vVector, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___vectorToAngle(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWVector vVector;
        vVector = new NWVector();
        vVector.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            double __ret = __obj.vectorToAngle(vVector, __current);
            __os.writeDouble(__ret);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___versusAlignmentEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        int nLawChaos;
        nLawChaos = __is.readInt();
        int nGoodEvil;
        nGoodEvil = __is.readInt();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.versusAlignmentEffect(eEffect, nLawChaos, nGoodEvil, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___versusRacialTypeEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        RacialType tRacialType;
        tRacialType = RacialType.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.versusRacialTypeEffect(eEffect, tRacialType, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___versusTrapEffect(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWEffect eEffect;
        eEffect = new NWEffect();
        eEffect.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            NWEffect __ret = __obj.versusTrapEffect(eEffect, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(InvalidEffectException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___willSave(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        NWObject oCreature;
        oCreature = new NWObject();
        oCreature.__read(__is);
        int nDC;
        nDC = __is.readInt();
        SaveType tSaveType;
        tSaveType = SaveType.__read(__is);
        NWObject oSaveVersus;
        oSaveVersus = new NWObject();
        oSaveVersus.__read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            SavingThrowResult __ret = __obj.willSave(oCreature, nDC, tSaveType, oSaveVersus, __current);
            __ret.__write(__os);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    public static Ice.DispatchStatus
    ___writeTimestampedLogEntry(NWScript __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        String sLogEntry;
        sLogEntry = __is.readString();
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        try
        {
            __obj.writeTimestampedLogEntry(sLogEntry, __current);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(NotInContextException ex)
        {
            __os.writeUserException(ex);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    private final static String[] __all =
    {
        "actionAttack",
        "actionCastFakeSpellAtLocation",
        "actionCastFakeSpellAtObject",
        "actionCastSpellAtLocation",
        "actionCastSpellAtObject",
        "actionCloseDoor",
        "actionCounterSpell",
        "actionEquipItem",
        "actionEquipMostDamagingMelee",
        "actionEquipMostDamagingRanged",
        "actionEquipMostEffectiveArmor",
        "actionExamine",
        "actionForceFollowObject",
        "actionForceMoveToLocation",
        "actionForceMoveToObject",
        "actionGiveItem",
        "actionInteractObject",
        "actionJumpToLocation",
        "actionJumpToObject",
        "actionLockObject",
        "actionMoveAwayFromLocation",
        "actionMoveAwayFromObject",
        "actionMoveToLocation",
        "actionMoveToObject",
        "actionOpenDoor",
        "actionPauseConversation",
        "actionPickUpItem",
        "actionPlayAnimation",
        "actionPutDownItem",
        "actionRandomWalk",
        "actionRest",
        "actionResumeConversation",
        "actionSit",
        "actionSpeakString",
        "actionSpeakStringByStrRef",
        "actionStartConversation",
        "actionTakeItem",
        "actionUnequipItem",
        "actionUnlockObject",
        "actionUseFeat",
        "actionUseSkill",
        "actionWait",
        "activatePortal",
        "addHenchman",
        "addItemProperty",
        "addJournalQuestEntry",
        "addToParty",
        "adjustAlignment",
        "adjustReputation",
        "allEffects",
        "allEquipped",
        "allInArea",
        "allInFaction",
        "allInInventory",
        "allInShape",
        "allItemProperties",
        "allPCs",
        "ambientSoundChangeDay",
        "ambientSoundChangeNight",
        "ambientSoundPlay",
        "ambientSoundSetDayVolume",
        "ambientSoundSetNightVolume",
        "ambientSoundStop",
        "angleToVector",
        "applyEffectAtLocation",
        "applyEffectToObject",
        "badBadReplaceMeThisDoesNothing",
        "beginConversation",
        "blackScreen",
        "bootPC",
        "changeFaction",
        "changeToStandardFaction",
        "clearAllActions",
        "clearPersonalReputation",
        "clearState",
        "copyItem",
        "copyItemAndModify",
        "copyObject",
        "createItemOnObject",
        "createObject",
        "createTrapAtLocation",
        "createTrapOnObject",
        "dayToNight",
        "decrementRemainingFeatUses",
        "decrementRemainingSpellUses",
        "delState",
        "deleteCampaignVariable",
        "deleteLocalFloat",
        "deleteLocalInt",
        "deleteLocalLocation",
        "deleteLocalObject",
        "deleteLocalString",
        "destroyCampaignDatabase",
        "destroyObject",
        "doDoorAction",
        "doPlaceableObjectAction",
        "doSinglePlayerAutoSave",
        "doWhirlwindAttack",
        "effectACDecrease",
        "effectACIncrease",
        "effectAbilityDecrease",
        "effectAbilityIncrease",
        "effectAppear",
        "effectAreaOfEffect",
        "effectAttackDecrease",
        "effectAttackIncrease",
        "effectBeam",
        "effectBlindness",
        "effectCharmed",
        "effectConcealment",
        "effectConfused",
        "effectCurse",
        "effectCutsceneDominated",
        "effectCutsceneGhost",
        "effectCutsceneImmobilize",
        "effectCutsceneParalyze",
        "effectDamage",
        "effectDamageDecrease",
        "effectDamageImmunityDecrease",
        "effectDamageImmunityIncrease",
        "effectDamageIncrease",
        "effectDamageReduction",
        "effectDamageResistance",
        "effectDamageShield",
        "effectDarkness",
        "effectDazed",
        "effectDeaf",
        "effectDeath",
        "effectDisappear",
        "effectDisappearAppear",
        "effectDisease",
        "effectDispelMagicAll",
        "effectDispelMagicBest",
        "effectDominated",
        "effectEntangle",
        "effectEthereal",
        "effectFrightened",
        "effectHaste",
        "effectHeal",
        "effectHitPointChangeWhenDying",
        "effectImmunity",
        "effectInvisibility",
        "effectKnockdown",
        "effectLinkEffects",
        "effectMissChance",
        "effectModifyAttacks",
        "effectMovementSpeedDecrease",
        "effectMovementSpeedIncrease",
        "effectNegativeLevel",
        "effectParalyze",
        "effectPetrify",
        "effectPoison",
        "effectPolymorph",
        "effectRegenerate",
        "effectResurrection",
        "effectSanctuary",
        "effectSavingThrowDecrease",
        "effectSavingThrowIncrease",
        "effectSeeInvisible",
        "effectSilence",
        "effectSkillDecrease",
        "effectSkillIncrease",
        "effectSleep",
        "effectSlow",
        "effectSpellFailure",
        "effectSpellImmunity",
        "effectSpellLevelAbsorption",
        "effectSpellResistanceDecrease",
        "effectSpellResistanceIncrease",
        "effectStunned",
        "effectSummonCreature",
        "effectSwarm",
        "effectTemporaryHitpoints",
        "effectTimeStop",
        "effectTrueSeeing",
        "effectTurnResistanceDecrease",
        "effectTurnResistanceIncrease",
        "effectTurned",
        "effectUltravision",
        "effectVisualEffect",
        "endGame",
        "executeScript",
        "exploreAreaForPlayer",
        "exportAllCharacters",
        "exportSingleCharacter",
        "extraordinaryEffect",
        "fadeFromBlack",
        "fadeToBlack",
        "floatingTextStrRefOnCreature",
        "floatingTextStringOnCreature",
        "forceRest",
        "fortitudeSave",
        "get2DAString",
        "getAC",
        "getAILevel",
        "getAbilityModifier",
        "getAbilityScore",
        "getActionMode",
        "getAge",
        "getAlignmentGoodEvil",
        "getAlignmentLawChaos",
        "getAnimalCompanionCreatureType",
        "getAnimalCompanionName",
        "getAppearanceType",
        "getArcaneSpellFailure",
        "getArea",
        "getAreaOfEffectCreator",
        "getAreaSize",
        "getAssociate",
        "getAssociateType",
        "getAttackTarget",
        "getAttemptedAttackTarget",
        "getAttemptedSpellTarget",
        "getBaseAttackBonus",
        "getBaseItemType",
        "getBlockingDoor",
        "getCalendarDay",
        "getCalendarMonth",
        "getCalendarYear",
        "getCampaignFloat",
        "getCampaignInt",
        "getCampaignLocation",
        "getCampaignString",
        "getCampaignVector",
        "getCasterLevel",
        "getChallengeRating",
        "getClassByPosition",
        "getClickingObject",
        "getColor",
        "getCommandable",
        "getCreatureBodyPart",
        "getCreatureSize",
        "getCreatureStartingPackage",
        "getCreatureTailType",
        "getCreatureWingType",
        "getCurrentAction",
        "getCurrentHitPoints",
        "getCutsceneCameraMoveRate",
        "getCutsceneMode",
        "getDamageDealtByType",
        "getDefensiveCastingMode",
        "getDeity",
        "getDescription",
        "getDetectMode",
        "getDialogSoundLength",
        "getDistanceBetween",
        "getDistanceBetweenLocations",
        "getDistanceToObject",
        "getDroppableFlag",
        "getEffectCreator",
        "getEffectDurationType",
        "getEffectIconShown",
        "getEffectSpellId",
        "getEffectSubType",
        "getEffectType",
        "getEncounterActive",
        "getEncounterDifficulty",
        "getEncounterSpawnsCurrent",
        "getEncounterSpawnsMax",
        "getEnteringObject",
        "getExitingObject",
        "getFacing",
        "getFactionAverageGoodEvilAlignment",
        "getFactionAverageLawChaosAlignment",
        "getFactionAverageLevel",
        "getFactionAverageReputation",
        "getFactionAverageXP",
        "getFactionBestAC",
        "getFactionEqual",
        "getFactionGold",
        "getFactionLeader",
        "getFactionLeastDamagedMember",
        "getFactionMostDamagedMember",
        "getFactionMostFrequentClass",
        "getFactionStrongestMember",
        "getFactionWeakestMember",
        "getFactionWorstAC",
        "getFamiliarCreatureType",
        "getFamiliarName",
        "getFogAmount",
        "getFogColor",
        "getFootstepType",
        "getFortitudeSavingThrow",
        "getGameDifficulty",
        "getGender",
        "getGoingToBeAttackedBy",
        "getGold",
        "getGoldPieceValue",
        "getGoodEvilValue",
        "getHardness",
        "getHasFeat",
        "getHasFeatEffect",
        "getHasInventory",
        "getHasSkill",
        "getHasSpell",
        "getHasSpellEffect",
        "getHenchman",
        "getHitDice",
        "getIdentified",
        "getImmortal",
        "getInfiniteFlag",
        "getInventoryDisturbItem",
        "getInventoryDisturbType",
        "getIsAreaAboveGround",
        "getIsAreaInterior",
        "getIsAreaNatural",
        "getIsCreatureDisarmable",
        "getIsDM",
        "getIsDMPossessed",
        "getIsDawn",
        "getIsDay",
        "getIsDead",
        "getIsDoorActionPossible",
        "getIsDusk",
        "getIsEffectValid",
        "getIsEncounterCreature",
        "getIsEnemy",
        "getIsFriend",
        "getIsImmune",
        "getIsInCombat",
        "getIsInSubArea",
        "getIsItemPropertyValid",
        "getIsListening",
        "getIsNeutral",
        "getIsNight",
        "getIsObjectValid",
        "getIsOpen",
        "getIsPC",
        "getIsPlaceableObjectActionPossible",
        "getIsPlayableRacialType",
        "getIsPossessedFamiliar",
        "getIsReactionTypeFriendly",
        "getIsReactionTypeHostile",
        "getIsReactionTypeNeutral",
        "getIsResting",
        "getIsSkillSuccessful",
        "getIsTrapped",
        "getIsWeaponEffective",
        "getItemACValue",
        "getItemActivated",
        "getItemActivatedTarget",
        "getItemActivatedTargetLocation",
        "getItemActivator",
        "getItemAppearance",
        "getItemCharges",
        "getItemCursedFlag",
        "getItemHasItemProperty",
        "getItemInSlot",
        "getItemPossessedBy",
        "getItemPossessor",
        "getItemPropertyCostTable",
        "getItemPropertyCostTableValue",
        "getItemPropertyDurationType",
        "getItemPropertyParam1",
        "getItemPropertyParam1Value",
        "getItemPropertySubType",
        "getItemPropertyType",
        "getItemStackSize",
        "getJournalQuestExperience",
        "getKeyRequiredFeedback",
        "getLastAssociateCommand",
        "getLastAttackMode",
        "getLastAttackType",
        "getLastAttacker",
        "getLastClosedBy",
        "getLastDamager",
        "getLastDisarmed",
        "getLastDisturbed",
        "getLastHostileActor",
        "getLastKiller",
        "getLastLocked",
        "getLastOpenedBy",
        "getLastPCRested",
        "getLastPCToCancelCutscene",
        "getLastPerceived",
        "getLastPerceptionHeard",
        "getLastPerceptionInaudible",
        "getLastPerceptionSeen",
        "getLastPerceptionVanished",
        "getLastPlayerDied",
        "getLastPlayerDying",
        "getLastRespawnButtonPresser",
        "getLastRestEventType",
        "getLastSpeaker",
        "getLastSpell",
        "getLastSpellCastClass",
        "getLastSpellCaster",
        "getLastSpellHarmful",
        "getLastTrapDetected",
        "getLastUnlocked",
        "getLastUsedBy",
        "getLastWeaponUsed",
        "getLawChaosValue",
        "getLevelByClass",
        "getLevelByPosition",
        "getListenPatternNumber",
        "getLocalFloat",
        "getLocalInt",
        "getLocalLocation",
        "getLocalObject",
        "getLocalString",
        "getLocation",
        "getLockKeyRequired",
        "getLockKeyTag",
        "getLockLockDC",
        "getLockLockable",
        "getLockUnlockDC",
        "getLocked",
        "getLootable",
        "getMaster",
        "getMatchedSubstring",
        "getMatchedSubstringsCount",
        "getMaxHenchmen",
        "getMaxHitPoints",
        "getMetaMagicFeat",
        "getModule",
        "getModuleItemAcquired",
        "getModuleItemAcquiredBy",
        "getModuleItemAcquiredFrom",
        "getModuleItemAcquiredStackSize",
        "getModuleItemLost",
        "getModuleItemLostBy",
        "getModuleName",
        "getModuleXPScale",
        "getMovementRate",
        "getName",
        "getNearestCreature",
        "getNearestCreatureToLocation",
        "getNearestObject",
        "getNearestObjectByTag",
        "getNearestObjectToLocation",
        "getNearestTrapToObject",
        "getNumStackedItems",
        "getObjectByTag",
        "getObjectHeard",
        "getObjectSeen",
        "getObjectType",
        "getPCChatMessage",
        "getPCChatSpeaker",
        "getPCChatVolume",
        "getPCIPAddress",
        "getPCItemLastEquipped",
        "getPCItemLastEquippedBy",
        "getPCItemLastUnequipped",
        "getPCItemLastUnequippedBy",
        "getPCLevellingUp",
        "getPCPlayerName",
        "getPCPublicCDKey",
        "getPCSpeaker",
        "getPhenoType",
        "getPickpocketableFlag",
        "getPlaceableIllumination",
        "getPlaceableLastClickedBy",
        "getPlotFlag",
        "getPortraitId",
        "getPortraitResRef",
        "getPosition",
        "getRacialType",
        "getReflexAdjustedDamage",
        "getReflexSavingThrow",
        "getReputation",
        "getResRef",
        "getSittingCreature",
        "getSkillRank",
        "getSkyBox",
        "getSpellCastItem",
        "getSpellId",
        "getSpellResistance",
        "getSpellSaveDC",
        "getSpellTargetLocation",
        "getSpellTargetObject",
        "getStandardFactionReputation",
        "getStartingLocation",
        "getState",
        "getStealthMode",
        "getStolenFlag",
        "getStoreGold",
        "getStoreIdentifyCost",
        "getStoreMaxBuyPrice",
        "getStrRefSoundDuration",
        "getStringByStrRef",
        "getSubRace",
        "getTag",
        "getTileMainLight1Color",
        "getTileMainLight2Color",
        "getTileSourceLight1Color",
        "getTileSourceLight2Color",
        "getTilesetResRef",
        "getTimeHour",
        "getTimeMillisecond",
        "getTimeMinute",
        "getTimeSecond",
        "getTotalDamageDealt",
        "getTransitionTarget",
        "getTrapActive",
        "getTrapBaseType",
        "getTrapCreator",
        "getTrapDetectDC",
        "getTrapDetectable",
        "getTrapDetectedBy",
        "getTrapDisarmDC",
        "getTrapDisarmable",
        "getTrapFlagged",
        "getTrapKeyTag",
        "getTrapOneShot",
        "getTrapRecoverable",
        "getTurnResistanceHD",
        "getUseableFlag",
        "getUserDefinedEventNumber",
        "getWaypointByTag",
        "getWeaponRanged",
        "getWeather",
        "getWeight",
        "getWillSavingThrow",
        "getXP",
        "giveGoldToCreature",
        "giveXPToCreature",
        "hasState",
        "hoursToSeconds",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "incrementRemainingFeatUses",
        "isInConversation",
        "itemPropertyACBonus",
        "itemPropertyACBonusVsAlign",
        "itemPropertyACBonusVsDmgType",
        "itemPropertyACBonusVsRace",
        "itemPropertyACBonusVsSAlign",
        "itemPropertyAbilityBonus",
        "itemPropertyAdditional",
        "itemPropertyArcaneSpellFailure",
        "itemPropertyAttackBonus",
        "itemPropertyAttackBonusVsAlign",
        "itemPropertyAttackBonusVsRace",
        "itemPropertyAttackBonusVsSAlign",
        "itemPropertyAttackPenalty",
        "itemPropertyBonusFeat",
        "itemPropertyBonusLevelSpell",
        "itemPropertyBonusSavingThrow",
        "itemPropertyBonusSavingThrowVsX",
        "itemPropertyBonusSpellResistance",
        "itemPropertyCastSpell",
        "itemPropertyContainerReducedWeight",
        "itemPropertyDamageBonus",
        "itemPropertyDamageBonusVsAlign",
        "itemPropertyDamageBonusVsRace",
        "itemPropertyDamageBonusVsSAlign",
        "itemPropertyDamageImmunity",
        "itemPropertyDamagePenalty",
        "itemPropertyDamageReduction",
        "itemPropertyDamageResistance",
        "itemPropertyDamageVulnerability",
        "itemPropertyDarkvision",
        "itemPropertyDecreaseAC",
        "itemPropertyDecreaseAbility",
        "itemPropertyDecreaseSkill",
        "itemPropertyEnhancementBonus",
        "itemPropertyEnhancementBonusVsAlign",
        "itemPropertyEnhancementBonusVsRace",
        "itemPropertyEnhancementBonusVsSAlign",
        "itemPropertyEnhancementPenalty",
        "itemPropertyExtraMeleeDamageType",
        "itemPropertyExtraRangeDamageType",
        "itemPropertyFreeAction",
        "itemPropertyHaste",
        "itemPropertyHealersKit",
        "itemPropertyHolyAvenger",
        "itemPropertyImmunityMisc",
        "itemPropertyImmunityToSpellLevel",
        "itemPropertyImprovedEvasion",
        "itemPropertyKeen",
        "itemPropertyLight",
        "itemPropertyLimitUseByAlign",
        "itemPropertyLimitUseByClass",
        "itemPropertyLimitUseByRace",
        "itemPropertyLimitUseBySAlign",
        "itemPropertyMassiveCritical",
        "itemPropertyMaterial",
        "itemPropertyMaxRangeStrengthMod",
        "itemPropertyMonsterDamage",
        "itemPropertyNoDamage",
        "itemPropertyOnHitCastSpell",
        "itemPropertyOnHitProps",
        "itemPropertyOnMonsterHitProperties",
        "itemPropertyQuality",
        "itemPropertyReducedSavingThrow",
        "itemPropertyReducedSavingThrowVsX",
        "itemPropertyRegeneration",
        "itemPropertySkillBonus",
        "itemPropertySpecialWalk",
        "itemPropertySpellImmunitySchool",
        "itemPropertySpellImmunitySpecific",
        "itemPropertyThievesTools",
        "itemPropertyTrap",
        "itemPropertyTrueSeeing",
        "itemPropertyTurnResistance",
        "itemPropertyUnlimitedAmmo",
        "itemPropertyVampiricRegeneration",
        "itemPropertyVisualEffect",
        "itemPropertyWeightIncrease",
        "itemPropertyWeightReduction",
        "jumpToLocation",
        "jumpToObject",
        "levelUpHenchman",
        "lineOfSightObject",
        "lineOfSightVector",
        "lockCameraDirection",
        "lockCameraDistance",
        "lockCameraPitch",
        "magicalEffect",
        "musicBackgroundChangeDay",
        "musicBackgroundChangeNight",
        "musicBackgroundGetBattleTrack",
        "musicBackgroundGetDayTrack",
        "musicBackgroundGetNightTrack",
        "musicBackgroundPlay",
        "musicBackgroundSetDelay",
        "musicBackgroundStop",
        "musicBattleChange",
        "musicBattlePlay",
        "musicBattleStop",
        "nightToDay",
        "openInventory",
        "openStore",
        "playAnimation",
        "playSound",
        "playSoundByStrRef",
        "playVoiceChat",
        "popUpDeathGUIPanel",
        "popUpGUIPanel",
        "putState",
        "randomName",
        "recomputeStaticLighting",
        "reflexSave",
        "removeEffect",
        "removeFromParty",
        "removeHenchman",
        "removeItemProperty",
        "removeJournalQuestEntry",
        "removeSummonedAssociate",
        "resistSpell",
        "restoreBaseAttackBonus",
        "restoreCameraFacing",
        "retrieveCampaignObject",
        "roundsToSeconds",
        "sendMessageToAllDMs",
        "sendMessageToPC",
        "sendMessageToPCByStrRef",
        "setAILevel",
        "setActionMode",
        "setAreaTransitionBMP",
        "setAssociateListenPatterns",
        "setBaseAttackBonus",
        "setCalendar",
        "setCameraFacing",
        "setCameraHeight",
        "setCameraMode",
        "setCampaignFloat",
        "setCampaignInt",
        "setCampaignLocation",
        "setCampaignString",
        "setCampaignVector",
        "setColor",
        "setCommandable",
        "setCreatureAppearanceType",
        "setCreatureBodyPart",
        "setCreatureTailType",
        "setCreatureWingType",
        "setCustomToken",
        "setCutsceneCameraMoveRate",
        "setCutsceneMode",
        "setDeity",
        "setDescription",
        "setDroppableFlag",
        "setEffectIconShown",
        "setEncounterActive",
        "setEncounterDifficulty",
        "setEncounterSpawnsCurrent",
        "setEncounterSpawnsMax",
        "setFacing",
        "setFacingPoint",
        "setFogAmount",
        "setFogColor",
        "setFootstepType",
        "setFortitudeSavingThrow",
        "setHardness",
        "setIdentified",
        "setImmortal",
        "setInfiniteFlag",
        "setIsDestroyable",
        "setIsTemporaryEnemy",
        "setIsTemporaryFriend",
        "setIsTemporaryNeutral",
        "setItemCharges",
        "setItemCursedFlag",
        "setItemStackSize",
        "setKeyRequiredFeedback",
        "setListenPattern",
        "setListening",
        "setLocalFloat",
        "setLocalInt",
        "setLocalLocation",
        "setLocalObject",
        "setLocalString",
        "setLockKeyRequired",
        "setLockKeyTag",
        "setLockLockDC",
        "setLockLockable",
        "setLockUnlockDC",
        "setLocked",
        "setLootable",
        "setMapPinEnabled",
        "setMaxHenchmen",
        "setModuleXPScale",
        "setName",
        "setPCChatMessage",
        "setPCChatVolume",
        "setPCDislike",
        "setPCLike",
        "setPanelButtonFlash",
        "setPhenoType",
        "setPickpocketableFlag",
        "setPlaceableIllumination",
        "setPlotFlag",
        "setPortraitId",
        "setPortraitResRef",
        "setReflexSavingThrow",
        "setSkyBox",
        "setStandardFactionReputation",
        "setStolenFlag",
        "setStoreGold",
        "setStoreIdentifyCost",
        "setStoreMaxBuyPrice",
        "setSubRace",
        "setTileMainLightColor",
        "setTileSourceLightColor",
        "setTime",
        "setTrapActive",
        "setTrapDetectDC",
        "setTrapDetectable",
        "setTrapDetectedBy",
        "setTrapDisabled",
        "setTrapDisarmDC",
        "setTrapDisarmable",
        "setTrapKeyTag",
        "setTrapOneShot",
        "setTrapRecoverable",
        "setUseableFlag",
        "setWeather",
        "setWillSavingThrow",
        "setXP",
        "soundObjectPlay",
        "soundObjectSetPosition",
        "soundObjectSetVolume",
        "soundObjectStop",
        "speakOneLinerConversation",
        "speakString",
        "speakStringByStrRef",
        "startNewModule",
        "stopFade",
        "storeCameraFacing",
        "storeCampaignObject",
        "summonAnimalCompanion",
        "summonFamiliar",
        "supernaturalEffect",
        "surrenderToEnemies",
        "takeGoldFromCreature",
        "touchAttackMelee",
        "touchAttackRanged",
        "turnsToSeconds",
        "unpossessFamiliar",
        "vectorMagnitude",
        "vectorNormalize",
        "vectorToAngle",
        "versusAlignmentEffect",
        "versusRacialTypeEffect",
        "versusTrapEffect",
        "willSave",
        "writeTimestampedLogEntry"
    };

    public Ice.DispatchStatus
    __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___actionAttack(this, in, __current);
            }
            case 1:
            {
                return ___actionCastFakeSpellAtLocation(this, in, __current);
            }
            case 2:
            {
                return ___actionCastFakeSpellAtObject(this, in, __current);
            }
            case 3:
            {
                return ___actionCastSpellAtLocation(this, in, __current);
            }
            case 4:
            {
                return ___actionCastSpellAtObject(this, in, __current);
            }
            case 5:
            {
                return ___actionCloseDoor(this, in, __current);
            }
            case 6:
            {
                return ___actionCounterSpell(this, in, __current);
            }
            case 7:
            {
                return ___actionEquipItem(this, in, __current);
            }
            case 8:
            {
                return ___actionEquipMostDamagingMelee(this, in, __current);
            }
            case 9:
            {
                return ___actionEquipMostDamagingRanged(this, in, __current);
            }
            case 10:
            {
                return ___actionEquipMostEffectiveArmor(this, in, __current);
            }
            case 11:
            {
                return ___actionExamine(this, in, __current);
            }
            case 12:
            {
                return ___actionForceFollowObject(this, in, __current);
            }
            case 13:
            {
                return ___actionForceMoveToLocation(this, in, __current);
            }
            case 14:
            {
                return ___actionForceMoveToObject(this, in, __current);
            }
            case 15:
            {
                return ___actionGiveItem(this, in, __current);
            }
            case 16:
            {
                return ___actionInteractObject(this, in, __current);
            }
            case 17:
            {
                return ___actionJumpToLocation(this, in, __current);
            }
            case 18:
            {
                return ___actionJumpToObject(this, in, __current);
            }
            case 19:
            {
                return ___actionLockObject(this, in, __current);
            }
            case 20:
            {
                return ___actionMoveAwayFromLocation(this, in, __current);
            }
            case 21:
            {
                return ___actionMoveAwayFromObject(this, in, __current);
            }
            case 22:
            {
                return ___actionMoveToLocation(this, in, __current);
            }
            case 23:
            {
                return ___actionMoveToObject(this, in, __current);
            }
            case 24:
            {
                return ___actionOpenDoor(this, in, __current);
            }
            case 25:
            {
                return ___actionPauseConversation(this, in, __current);
            }
            case 26:
            {
                return ___actionPickUpItem(this, in, __current);
            }
            case 27:
            {
                return ___actionPlayAnimation(this, in, __current);
            }
            case 28:
            {
                return ___actionPutDownItem(this, in, __current);
            }
            case 29:
            {
                return ___actionRandomWalk(this, in, __current);
            }
            case 30:
            {
                return ___actionRest(this, in, __current);
            }
            case 31:
            {
                return ___actionResumeConversation(this, in, __current);
            }
            case 32:
            {
                return ___actionSit(this, in, __current);
            }
            case 33:
            {
                return ___actionSpeakString(this, in, __current);
            }
            case 34:
            {
                return ___actionSpeakStringByStrRef(this, in, __current);
            }
            case 35:
            {
                return ___actionStartConversation(this, in, __current);
            }
            case 36:
            {
                return ___actionTakeItem(this, in, __current);
            }
            case 37:
            {
                return ___actionUnequipItem(this, in, __current);
            }
            case 38:
            {
                return ___actionUnlockObject(this, in, __current);
            }
            case 39:
            {
                return ___actionUseFeat(this, in, __current);
            }
            case 40:
            {
                return ___actionUseSkill(this, in, __current);
            }
            case 41:
            {
                return ___actionWait(this, in, __current);
            }
            case 42:
            {
                return ___activatePortal(this, in, __current);
            }
            case 43:
            {
                return ___addHenchman(this, in, __current);
            }
            case 44:
            {
                return ___addItemProperty(this, in, __current);
            }
            case 45:
            {
                return ___addJournalQuestEntry(this, in, __current);
            }
            case 46:
            {
                return ___addToParty(this, in, __current);
            }
            case 47:
            {
                return ___adjustAlignment(this, in, __current);
            }
            case 48:
            {
                return ___adjustReputation(this, in, __current);
            }
            case 49:
            {
                return ___allEffects(this, in, __current);
            }
            case 50:
            {
                return ___allEquipped(this, in, __current);
            }
            case 51:
            {
                return ___allInArea(this, in, __current);
            }
            case 52:
            {
                return ___allInFaction(this, in, __current);
            }
            case 53:
            {
                return ___allInInventory(this, in, __current);
            }
            case 54:
            {
                return ___allInShape(this, in, __current);
            }
            case 55:
            {
                return ___allItemProperties(this, in, __current);
            }
            case 56:
            {
                return ___allPCs(this, in, __current);
            }
            case 57:
            {
                return ___ambientSoundChangeDay(this, in, __current);
            }
            case 58:
            {
                return ___ambientSoundChangeNight(this, in, __current);
            }
            case 59:
            {
                return ___ambientSoundPlay(this, in, __current);
            }
            case 60:
            {
                return ___ambientSoundSetDayVolume(this, in, __current);
            }
            case 61:
            {
                return ___ambientSoundSetNightVolume(this, in, __current);
            }
            case 62:
            {
                return ___ambientSoundStop(this, in, __current);
            }
            case 63:
            {
                return ___angleToVector(this, in, __current);
            }
            case 64:
            {
                return ___applyEffectAtLocation(this, in, __current);
            }
            case 65:
            {
                return ___applyEffectToObject(this, in, __current);
            }
            case 66:
            {
                return ___badBadReplaceMeThisDoesNothing(this, in, __current);
            }
            case 67:
            {
                return ___beginConversation(this, in, __current);
            }
            case 68:
            {
                return ___blackScreen(this, in, __current);
            }
            case 69:
            {
                return ___bootPC(this, in, __current);
            }
            case 70:
            {
                return ___changeFaction(this, in, __current);
            }
            case 71:
            {
                return ___changeToStandardFaction(this, in, __current);
            }
            case 72:
            {
                return ___clearAllActions(this, in, __current);
            }
            case 73:
            {
                return ___clearPersonalReputation(this, in, __current);
            }
            case 74:
            {
                return ___clearState(this, in, __current);
            }
            case 75:
            {
                return ___copyItem(this, in, __current);
            }
            case 76:
            {
                return ___copyItemAndModify(this, in, __current);
            }
            case 77:
            {
                return ___copyObject(this, in, __current);
            }
            case 78:
            {
                return ___createItemOnObject(this, in, __current);
            }
            case 79:
            {
                return ___createObject(this, in, __current);
            }
            case 80:
            {
                return ___createTrapAtLocation(this, in, __current);
            }
            case 81:
            {
                return ___createTrapOnObject(this, in, __current);
            }
            case 82:
            {
                return ___dayToNight(this, in, __current);
            }
            case 83:
            {
                return ___decrementRemainingFeatUses(this, in, __current);
            }
            case 84:
            {
                return ___decrementRemainingSpellUses(this, in, __current);
            }
            case 85:
            {
                return ___delState(this, in, __current);
            }
            case 86:
            {
                return ___deleteCampaignVariable(this, in, __current);
            }
            case 87:
            {
                return ___deleteLocalFloat(this, in, __current);
            }
            case 88:
            {
                return ___deleteLocalInt(this, in, __current);
            }
            case 89:
            {
                return ___deleteLocalLocation(this, in, __current);
            }
            case 90:
            {
                return ___deleteLocalObject(this, in, __current);
            }
            case 91:
            {
                return ___deleteLocalString(this, in, __current);
            }
            case 92:
            {
                return ___destroyCampaignDatabase(this, in, __current);
            }
            case 93:
            {
                return ___destroyObject(this, in, __current);
            }
            case 94:
            {
                return ___doDoorAction(this, in, __current);
            }
            case 95:
            {
                return ___doPlaceableObjectAction(this, in, __current);
            }
            case 96:
            {
                return ___doSinglePlayerAutoSave(this, in, __current);
            }
            case 97:
            {
                return ___doWhirlwindAttack(this, in, __current);
            }
            case 98:
            {
                return ___effectACDecrease(this, in, __current);
            }
            case 99:
            {
                return ___effectACIncrease(this, in, __current);
            }
            case 100:
            {
                return ___effectAbilityDecrease(this, in, __current);
            }
            case 101:
            {
                return ___effectAbilityIncrease(this, in, __current);
            }
            case 102:
            {
                return ___effectAppear(this, in, __current);
            }
            case 103:
            {
                return ___effectAreaOfEffect(this, in, __current);
            }
            case 104:
            {
                return ___effectAttackDecrease(this, in, __current);
            }
            case 105:
            {
                return ___effectAttackIncrease(this, in, __current);
            }
            case 106:
            {
                return ___effectBeam(this, in, __current);
            }
            case 107:
            {
                return ___effectBlindness(this, in, __current);
            }
            case 108:
            {
                return ___effectCharmed(this, in, __current);
            }
            case 109:
            {
                return ___effectConcealment(this, in, __current);
            }
            case 110:
            {
                return ___effectConfused(this, in, __current);
            }
            case 111:
            {
                return ___effectCurse(this, in, __current);
            }
            case 112:
            {
                return ___effectCutsceneDominated(this, in, __current);
            }
            case 113:
            {
                return ___effectCutsceneGhost(this, in, __current);
            }
            case 114:
            {
                return ___effectCutsceneImmobilize(this, in, __current);
            }
            case 115:
            {
                return ___effectCutsceneParalyze(this, in, __current);
            }
            case 116:
            {
                return ___effectDamage(this, in, __current);
            }
            case 117:
            {
                return ___effectDamageDecrease(this, in, __current);
            }
            case 118:
            {
                return ___effectDamageImmunityDecrease(this, in, __current);
            }
            case 119:
            {
                return ___effectDamageImmunityIncrease(this, in, __current);
            }
            case 120:
            {
                return ___effectDamageIncrease(this, in, __current);
            }
            case 121:
            {
                return ___effectDamageReduction(this, in, __current);
            }
            case 122:
            {
                return ___effectDamageResistance(this, in, __current);
            }
            case 123:
            {
                return ___effectDamageShield(this, in, __current);
            }
            case 124:
            {
                return ___effectDarkness(this, in, __current);
            }
            case 125:
            {
                return ___effectDazed(this, in, __current);
            }
            case 126:
            {
                return ___effectDeaf(this, in, __current);
            }
            case 127:
            {
                return ___effectDeath(this, in, __current);
            }
            case 128:
            {
                return ___effectDisappear(this, in, __current);
            }
            case 129:
            {
                return ___effectDisappearAppear(this, in, __current);
            }
            case 130:
            {
                return ___effectDisease(this, in, __current);
            }
            case 131:
            {
                return ___effectDispelMagicAll(this, in, __current);
            }
            case 132:
            {
                return ___effectDispelMagicBest(this, in, __current);
            }
            case 133:
            {
                return ___effectDominated(this, in, __current);
            }
            case 134:
            {
                return ___effectEntangle(this, in, __current);
            }
            case 135:
            {
                return ___effectEthereal(this, in, __current);
            }
            case 136:
            {
                return ___effectFrightened(this, in, __current);
            }
            case 137:
            {
                return ___effectHaste(this, in, __current);
            }
            case 138:
            {
                return ___effectHeal(this, in, __current);
            }
            case 139:
            {
                return ___effectHitPointChangeWhenDying(this, in, __current);
            }
            case 140:
            {
                return ___effectImmunity(this, in, __current);
            }
            case 141:
            {
                return ___effectInvisibility(this, in, __current);
            }
            case 142:
            {
                return ___effectKnockdown(this, in, __current);
            }
            case 143:
            {
                return ___effectLinkEffects(this, in, __current);
            }
            case 144:
            {
                return ___effectMissChance(this, in, __current);
            }
            case 145:
            {
                return ___effectModifyAttacks(this, in, __current);
            }
            case 146:
            {
                return ___effectMovementSpeedDecrease(this, in, __current);
            }
            case 147:
            {
                return ___effectMovementSpeedIncrease(this, in, __current);
            }
            case 148:
            {
                return ___effectNegativeLevel(this, in, __current);
            }
            case 149:
            {
                return ___effectParalyze(this, in, __current);
            }
            case 150:
            {
                return ___effectPetrify(this, in, __current);
            }
            case 151:
            {
                return ___effectPoison(this, in, __current);
            }
            case 152:
            {
                return ___effectPolymorph(this, in, __current);
            }
            case 153:
            {
                return ___effectRegenerate(this, in, __current);
            }
            case 154:
            {
                return ___effectResurrection(this, in, __current);
            }
            case 155:
            {
                return ___effectSanctuary(this, in, __current);
            }
            case 156:
            {
                return ___effectSavingThrowDecrease(this, in, __current);
            }
            case 157:
            {
                return ___effectSavingThrowIncrease(this, in, __current);
            }
            case 158:
            {
                return ___effectSeeInvisible(this, in, __current);
            }
            case 159:
            {
                return ___effectSilence(this, in, __current);
            }
            case 160:
            {
                return ___effectSkillDecrease(this, in, __current);
            }
            case 161:
            {
                return ___effectSkillIncrease(this, in, __current);
            }
            case 162:
            {
                return ___effectSleep(this, in, __current);
            }
            case 163:
            {
                return ___effectSlow(this, in, __current);
            }
            case 164:
            {
                return ___effectSpellFailure(this, in, __current);
            }
            case 165:
            {
                return ___effectSpellImmunity(this, in, __current);
            }
            case 166:
            {
                return ___effectSpellLevelAbsorption(this, in, __current);
            }
            case 167:
            {
                return ___effectSpellResistanceDecrease(this, in, __current);
            }
            case 168:
            {
                return ___effectSpellResistanceIncrease(this, in, __current);
            }
            case 169:
            {
                return ___effectStunned(this, in, __current);
            }
            case 170:
            {
                return ___effectSummonCreature(this, in, __current);
            }
            case 171:
            {
                return ___effectSwarm(this, in, __current);
            }
            case 172:
            {
                return ___effectTemporaryHitpoints(this, in, __current);
            }
            case 173:
            {
                return ___effectTimeStop(this, in, __current);
            }
            case 174:
            {
                return ___effectTrueSeeing(this, in, __current);
            }
            case 175:
            {
                return ___effectTurnResistanceDecrease(this, in, __current);
            }
            case 176:
            {
                return ___effectTurnResistanceIncrease(this, in, __current);
            }
            case 177:
            {
                return ___effectTurned(this, in, __current);
            }
            case 178:
            {
                return ___effectUltravision(this, in, __current);
            }
            case 179:
            {
                return ___effectVisualEffect(this, in, __current);
            }
            case 180:
            {
                return ___endGame(this, in, __current);
            }
            case 181:
            {
                return ___executeScript(this, in, __current);
            }
            case 182:
            {
                return ___exploreAreaForPlayer(this, in, __current);
            }
            case 183:
            {
                return ___exportAllCharacters(this, in, __current);
            }
            case 184:
            {
                return ___exportSingleCharacter(this, in, __current);
            }
            case 185:
            {
                return ___extraordinaryEffect(this, in, __current);
            }
            case 186:
            {
                return ___fadeFromBlack(this, in, __current);
            }
            case 187:
            {
                return ___fadeToBlack(this, in, __current);
            }
            case 188:
            {
                return ___floatingTextStrRefOnCreature(this, in, __current);
            }
            case 189:
            {
                return ___floatingTextStringOnCreature(this, in, __current);
            }
            case 190:
            {
                return ___forceRest(this, in, __current);
            }
            case 191:
            {
                return ___fortitudeSave(this, in, __current);
            }
            case 192:
            {
                return ___get2DAString(this, in, __current);
            }
            case 193:
            {
                return ___getAC(this, in, __current);
            }
            case 194:
            {
                return ___getAILevel(this, in, __current);
            }
            case 195:
            {
                return ___getAbilityModifier(this, in, __current);
            }
            case 196:
            {
                return ___getAbilityScore(this, in, __current);
            }
            case 197:
            {
                return ___getActionMode(this, in, __current);
            }
            case 198:
            {
                return ___getAge(this, in, __current);
            }
            case 199:
            {
                return ___getAlignmentGoodEvil(this, in, __current);
            }
            case 200:
            {
                return ___getAlignmentLawChaos(this, in, __current);
            }
            case 201:
            {
                return ___getAnimalCompanionCreatureType(this, in, __current);
            }
            case 202:
            {
                return ___getAnimalCompanionName(this, in, __current);
            }
            case 203:
            {
                return ___getAppearanceType(this, in, __current);
            }
            case 204:
            {
                return ___getArcaneSpellFailure(this, in, __current);
            }
            case 205:
            {
                return ___getArea(this, in, __current);
            }
            case 206:
            {
                return ___getAreaOfEffectCreator(this, in, __current);
            }
            case 207:
            {
                return ___getAreaSize(this, in, __current);
            }
            case 208:
            {
                return ___getAssociate(this, in, __current);
            }
            case 209:
            {
                return ___getAssociateType(this, in, __current);
            }
            case 210:
            {
                return ___getAttackTarget(this, in, __current);
            }
            case 211:
            {
                return ___getAttemptedAttackTarget(this, in, __current);
            }
            case 212:
            {
                return ___getAttemptedSpellTarget(this, in, __current);
            }
            case 213:
            {
                return ___getBaseAttackBonus(this, in, __current);
            }
            case 214:
            {
                return ___getBaseItemType(this, in, __current);
            }
            case 215:
            {
                return ___getBlockingDoor(this, in, __current);
            }
            case 216:
            {
                return ___getCalendarDay(this, in, __current);
            }
            case 217:
            {
                return ___getCalendarMonth(this, in, __current);
            }
            case 218:
            {
                return ___getCalendarYear(this, in, __current);
            }
            case 219:
            {
                return ___getCampaignFloat(this, in, __current);
            }
            case 220:
            {
                return ___getCampaignInt(this, in, __current);
            }
            case 221:
            {
                return ___getCampaignLocation(this, in, __current);
            }
            case 222:
            {
                return ___getCampaignString(this, in, __current);
            }
            case 223:
            {
                return ___getCampaignVector(this, in, __current);
            }
            case 224:
            {
                return ___getCasterLevel(this, in, __current);
            }
            case 225:
            {
                return ___getChallengeRating(this, in, __current);
            }
            case 226:
            {
                return ___getClassByPosition(this, in, __current);
            }
            case 227:
            {
                return ___getClickingObject(this, in, __current);
            }
            case 228:
            {
                return ___getColor(this, in, __current);
            }
            case 229:
            {
                return ___getCommandable(this, in, __current);
            }
            case 230:
            {
                return ___getCreatureBodyPart(this, in, __current);
            }
            case 231:
            {
                return ___getCreatureSize(this, in, __current);
            }
            case 232:
            {
                return ___getCreatureStartingPackage(this, in, __current);
            }
            case 233:
            {
                return ___getCreatureTailType(this, in, __current);
            }
            case 234:
            {
                return ___getCreatureWingType(this, in, __current);
            }
            case 235:
            {
                return ___getCurrentAction(this, in, __current);
            }
            case 236:
            {
                return ___getCurrentHitPoints(this, in, __current);
            }
            case 237:
            {
                return ___getCutsceneCameraMoveRate(this, in, __current);
            }
            case 238:
            {
                return ___getCutsceneMode(this, in, __current);
            }
            case 239:
            {
                return ___getDamageDealtByType(this, in, __current);
            }
            case 240:
            {
                return ___getDefensiveCastingMode(this, in, __current);
            }
            case 241:
            {
                return ___getDeity(this, in, __current);
            }
            case 242:
            {
                return ___getDescription(this, in, __current);
            }
            case 243:
            {
                return ___getDetectMode(this, in, __current);
            }
            case 244:
            {
                return ___getDialogSoundLength(this, in, __current);
            }
            case 245:
            {
                return ___getDistanceBetween(this, in, __current);
            }
            case 246:
            {
                return ___getDistanceBetweenLocations(this, in, __current);
            }
            case 247:
            {
                return ___getDistanceToObject(this, in, __current);
            }
            case 248:
            {
                return ___getDroppableFlag(this, in, __current);
            }
            case 249:
            {
                return ___getEffectCreator(this, in, __current);
            }
            case 250:
            {
                return ___getEffectDurationType(this, in, __current);
            }
            case 251:
            {
                return ___getEffectIconShown(this, in, __current);
            }
            case 252:
            {
                return ___getEffectSpellId(this, in, __current);
            }
            case 253:
            {
                return ___getEffectSubType(this, in, __current);
            }
            case 254:
            {
                return ___getEffectType(this, in, __current);
            }
            case 255:
            {
                return ___getEncounterActive(this, in, __current);
            }
            case 256:
            {
                return ___getEncounterDifficulty(this, in, __current);
            }
            case 257:
            {
                return ___getEncounterSpawnsCurrent(this, in, __current);
            }
            case 258:
            {
                return ___getEncounterSpawnsMax(this, in, __current);
            }
            case 259:
            {
                return ___getEnteringObject(this, in, __current);
            }
            case 260:
            {
                return ___getExitingObject(this, in, __current);
            }
            case 261:
            {
                return ___getFacing(this, in, __current);
            }
            case 262:
            {
                return ___getFactionAverageGoodEvilAlignment(this, in, __current);
            }
            case 263:
            {
                return ___getFactionAverageLawChaosAlignment(this, in, __current);
            }
            case 264:
            {
                return ___getFactionAverageLevel(this, in, __current);
            }
            case 265:
            {
                return ___getFactionAverageReputation(this, in, __current);
            }
            case 266:
            {
                return ___getFactionAverageXP(this, in, __current);
            }
            case 267:
            {
                return ___getFactionBestAC(this, in, __current);
            }
            case 268:
            {
                return ___getFactionEqual(this, in, __current);
            }
            case 269:
            {
                return ___getFactionGold(this, in, __current);
            }
            case 270:
            {
                return ___getFactionLeader(this, in, __current);
            }
            case 271:
            {
                return ___getFactionLeastDamagedMember(this, in, __current);
            }
            case 272:
            {
                return ___getFactionMostDamagedMember(this, in, __current);
            }
            case 273:
            {
                return ___getFactionMostFrequentClass(this, in, __current);
            }
            case 274:
            {
                return ___getFactionStrongestMember(this, in, __current);
            }
            case 275:
            {
                return ___getFactionWeakestMember(this, in, __current);
            }
            case 276:
            {
                return ___getFactionWorstAC(this, in, __current);
            }
            case 277:
            {
                return ___getFamiliarCreatureType(this, in, __current);
            }
            case 278:
            {
                return ___getFamiliarName(this, in, __current);
            }
            case 279:
            {
                return ___getFogAmount(this, in, __current);
            }
            case 280:
            {
                return ___getFogColor(this, in, __current);
            }
            case 281:
            {
                return ___getFootstepType(this, in, __current);
            }
            case 282:
            {
                return ___getFortitudeSavingThrow(this, in, __current);
            }
            case 283:
            {
                return ___getGameDifficulty(this, in, __current);
            }
            case 284:
            {
                return ___getGender(this, in, __current);
            }
            case 285:
            {
                return ___getGoingToBeAttackedBy(this, in, __current);
            }
            case 286:
            {
                return ___getGold(this, in, __current);
            }
            case 287:
            {
                return ___getGoldPieceValue(this, in, __current);
            }
            case 288:
            {
                return ___getGoodEvilValue(this, in, __current);
            }
            case 289:
            {
                return ___getHardness(this, in, __current);
            }
            case 290:
            {
                return ___getHasFeat(this, in, __current);
            }
            case 291:
            {
                return ___getHasFeatEffect(this, in, __current);
            }
            case 292:
            {
                return ___getHasInventory(this, in, __current);
            }
            case 293:
            {
                return ___getHasSkill(this, in, __current);
            }
            case 294:
            {
                return ___getHasSpell(this, in, __current);
            }
            case 295:
            {
                return ___getHasSpellEffect(this, in, __current);
            }
            case 296:
            {
                return ___getHenchman(this, in, __current);
            }
            case 297:
            {
                return ___getHitDice(this, in, __current);
            }
            case 298:
            {
                return ___getIdentified(this, in, __current);
            }
            case 299:
            {
                return ___getImmortal(this, in, __current);
            }
            case 300:
            {
                return ___getInfiniteFlag(this, in, __current);
            }
            case 301:
            {
                return ___getInventoryDisturbItem(this, in, __current);
            }
            case 302:
            {
                return ___getInventoryDisturbType(this, in, __current);
            }
            case 303:
            {
                return ___getIsAreaAboveGround(this, in, __current);
            }
            case 304:
            {
                return ___getIsAreaInterior(this, in, __current);
            }
            case 305:
            {
                return ___getIsAreaNatural(this, in, __current);
            }
            case 306:
            {
                return ___getIsCreatureDisarmable(this, in, __current);
            }
            case 307:
            {
                return ___getIsDM(this, in, __current);
            }
            case 308:
            {
                return ___getIsDMPossessed(this, in, __current);
            }
            case 309:
            {
                return ___getIsDawn(this, in, __current);
            }
            case 310:
            {
                return ___getIsDay(this, in, __current);
            }
            case 311:
            {
                return ___getIsDead(this, in, __current);
            }
            case 312:
            {
                return ___getIsDoorActionPossible(this, in, __current);
            }
            case 313:
            {
                return ___getIsDusk(this, in, __current);
            }
            case 314:
            {
                return ___getIsEffectValid(this, in, __current);
            }
            case 315:
            {
                return ___getIsEncounterCreature(this, in, __current);
            }
            case 316:
            {
                return ___getIsEnemy(this, in, __current);
            }
            case 317:
            {
                return ___getIsFriend(this, in, __current);
            }
            case 318:
            {
                return ___getIsImmune(this, in, __current);
            }
            case 319:
            {
                return ___getIsInCombat(this, in, __current);
            }
            case 320:
            {
                return ___getIsInSubArea(this, in, __current);
            }
            case 321:
            {
                return ___getIsItemPropertyValid(this, in, __current);
            }
            case 322:
            {
                return ___getIsListening(this, in, __current);
            }
            case 323:
            {
                return ___getIsNeutral(this, in, __current);
            }
            case 324:
            {
                return ___getIsNight(this, in, __current);
            }
            case 325:
            {
                return ___getIsObjectValid(this, in, __current);
            }
            case 326:
            {
                return ___getIsOpen(this, in, __current);
            }
            case 327:
            {
                return ___getIsPC(this, in, __current);
            }
            case 328:
            {
                return ___getIsPlaceableObjectActionPossible(this, in, __current);
            }
            case 329:
            {
                return ___getIsPlayableRacialType(this, in, __current);
            }
            case 330:
            {
                return ___getIsPossessedFamiliar(this, in, __current);
            }
            case 331:
            {
                return ___getIsReactionTypeFriendly(this, in, __current);
            }
            case 332:
            {
                return ___getIsReactionTypeHostile(this, in, __current);
            }
            case 333:
            {
                return ___getIsReactionTypeNeutral(this, in, __current);
            }
            case 334:
            {
                return ___getIsResting(this, in, __current);
            }
            case 335:
            {
                return ___getIsSkillSuccessful(this, in, __current);
            }
            case 336:
            {
                return ___getIsTrapped(this, in, __current);
            }
            case 337:
            {
                return ___getIsWeaponEffective(this, in, __current);
            }
            case 338:
            {
                return ___getItemACValue(this, in, __current);
            }
            case 339:
            {
                return ___getItemActivated(this, in, __current);
            }
            case 340:
            {
                return ___getItemActivatedTarget(this, in, __current);
            }
            case 341:
            {
                return ___getItemActivatedTargetLocation(this, in, __current);
            }
            case 342:
            {
                return ___getItemActivator(this, in, __current);
            }
            case 343:
            {
                return ___getItemAppearance(this, in, __current);
            }
            case 344:
            {
                return ___getItemCharges(this, in, __current);
            }
            case 345:
            {
                return ___getItemCursedFlag(this, in, __current);
            }
            case 346:
            {
                return ___getItemHasItemProperty(this, in, __current);
            }
            case 347:
            {
                return ___getItemInSlot(this, in, __current);
            }
            case 348:
            {
                return ___getItemPossessedBy(this, in, __current);
            }
            case 349:
            {
                return ___getItemPossessor(this, in, __current);
            }
            case 350:
            {
                return ___getItemPropertyCostTable(this, in, __current);
            }
            case 351:
            {
                return ___getItemPropertyCostTableValue(this, in, __current);
            }
            case 352:
            {
                return ___getItemPropertyDurationType(this, in, __current);
            }
            case 353:
            {
                return ___getItemPropertyParam1(this, in, __current);
            }
            case 354:
            {
                return ___getItemPropertyParam1Value(this, in, __current);
            }
            case 355:
            {
                return ___getItemPropertySubType(this, in, __current);
            }
            case 356:
            {
                return ___getItemPropertyType(this, in, __current);
            }
            case 357:
            {
                return ___getItemStackSize(this, in, __current);
            }
            case 358:
            {
                return ___getJournalQuestExperience(this, in, __current);
            }
            case 359:
            {
                return ___getKeyRequiredFeedback(this, in, __current);
            }
            case 360:
            {
                return ___getLastAssociateCommand(this, in, __current);
            }
            case 361:
            {
                return ___getLastAttackMode(this, in, __current);
            }
            case 362:
            {
                return ___getLastAttackType(this, in, __current);
            }
            case 363:
            {
                return ___getLastAttacker(this, in, __current);
            }
            case 364:
            {
                return ___getLastClosedBy(this, in, __current);
            }
            case 365:
            {
                return ___getLastDamager(this, in, __current);
            }
            case 366:
            {
                return ___getLastDisarmed(this, in, __current);
            }
            case 367:
            {
                return ___getLastDisturbed(this, in, __current);
            }
            case 368:
            {
                return ___getLastHostileActor(this, in, __current);
            }
            case 369:
            {
                return ___getLastKiller(this, in, __current);
            }
            case 370:
            {
                return ___getLastLocked(this, in, __current);
            }
            case 371:
            {
                return ___getLastOpenedBy(this, in, __current);
            }
            case 372:
            {
                return ___getLastPCRested(this, in, __current);
            }
            case 373:
            {
                return ___getLastPCToCancelCutscene(this, in, __current);
            }
            case 374:
            {
                return ___getLastPerceived(this, in, __current);
            }
            case 375:
            {
                return ___getLastPerceptionHeard(this, in, __current);
            }
            case 376:
            {
                return ___getLastPerceptionInaudible(this, in, __current);
            }
            case 377:
            {
                return ___getLastPerceptionSeen(this, in, __current);
            }
            case 378:
            {
                return ___getLastPerceptionVanished(this, in, __current);
            }
            case 379:
            {
                return ___getLastPlayerDied(this, in, __current);
            }
            case 380:
            {
                return ___getLastPlayerDying(this, in, __current);
            }
            case 381:
            {
                return ___getLastRespawnButtonPresser(this, in, __current);
            }
            case 382:
            {
                return ___getLastRestEventType(this, in, __current);
            }
            case 383:
            {
                return ___getLastSpeaker(this, in, __current);
            }
            case 384:
            {
                return ___getLastSpell(this, in, __current);
            }
            case 385:
            {
                return ___getLastSpellCastClass(this, in, __current);
            }
            case 386:
            {
                return ___getLastSpellCaster(this, in, __current);
            }
            case 387:
            {
                return ___getLastSpellHarmful(this, in, __current);
            }
            case 388:
            {
                return ___getLastTrapDetected(this, in, __current);
            }
            case 389:
            {
                return ___getLastUnlocked(this, in, __current);
            }
            case 390:
            {
                return ___getLastUsedBy(this, in, __current);
            }
            case 391:
            {
                return ___getLastWeaponUsed(this, in, __current);
            }
            case 392:
            {
                return ___getLawChaosValue(this, in, __current);
            }
            case 393:
            {
                return ___getLevelByClass(this, in, __current);
            }
            case 394:
            {
                return ___getLevelByPosition(this, in, __current);
            }
            case 395:
            {
                return ___getListenPatternNumber(this, in, __current);
            }
            case 396:
            {
                return ___getLocalFloat(this, in, __current);
            }
            case 397:
            {
                return ___getLocalInt(this, in, __current);
            }
            case 398:
            {
                return ___getLocalLocation(this, in, __current);
            }
            case 399:
            {
                return ___getLocalObject(this, in, __current);
            }
            case 400:
            {
                return ___getLocalString(this, in, __current);
            }
            case 401:
            {
                return ___getLocation(this, in, __current);
            }
            case 402:
            {
                return ___getLockKeyRequired(this, in, __current);
            }
            case 403:
            {
                return ___getLockKeyTag(this, in, __current);
            }
            case 404:
            {
                return ___getLockLockDC(this, in, __current);
            }
            case 405:
            {
                return ___getLockLockable(this, in, __current);
            }
            case 406:
            {
                return ___getLockUnlockDC(this, in, __current);
            }
            case 407:
            {
                return ___getLocked(this, in, __current);
            }
            case 408:
            {
                return ___getLootable(this, in, __current);
            }
            case 409:
            {
                return ___getMaster(this, in, __current);
            }
            case 410:
            {
                return ___getMatchedSubstring(this, in, __current);
            }
            case 411:
            {
                return ___getMatchedSubstringsCount(this, in, __current);
            }
            case 412:
            {
                return ___getMaxHenchmen(this, in, __current);
            }
            case 413:
            {
                return ___getMaxHitPoints(this, in, __current);
            }
            case 414:
            {
                return ___getMetaMagicFeat(this, in, __current);
            }
            case 415:
            {
                return ___getModule(this, in, __current);
            }
            case 416:
            {
                return ___getModuleItemAcquired(this, in, __current);
            }
            case 417:
            {
                return ___getModuleItemAcquiredBy(this, in, __current);
            }
            case 418:
            {
                return ___getModuleItemAcquiredFrom(this, in, __current);
            }
            case 419:
            {
                return ___getModuleItemAcquiredStackSize(this, in, __current);
            }
            case 420:
            {
                return ___getModuleItemLost(this, in, __current);
            }
            case 421:
            {
                return ___getModuleItemLostBy(this, in, __current);
            }
            case 422:
            {
                return ___getModuleName(this, in, __current);
            }
            case 423:
            {
                return ___getModuleXPScale(this, in, __current);
            }
            case 424:
            {
                return ___getMovementRate(this, in, __current);
            }
            case 425:
            {
                return ___getName(this, in, __current);
            }
            case 426:
            {
                return ___getNearestCreature(this, in, __current);
            }
            case 427:
            {
                return ___getNearestCreatureToLocation(this, in, __current);
            }
            case 428:
            {
                return ___getNearestObject(this, in, __current);
            }
            case 429:
            {
                return ___getNearestObjectByTag(this, in, __current);
            }
            case 430:
            {
                return ___getNearestObjectToLocation(this, in, __current);
            }
            case 431:
            {
                return ___getNearestTrapToObject(this, in, __current);
            }
            case 432:
            {
                return ___getNumStackedItems(this, in, __current);
            }
            case 433:
            {
                return ___getObjectByTag(this, in, __current);
            }
            case 434:
            {
                return ___getObjectHeard(this, in, __current);
            }
            case 435:
            {
                return ___getObjectSeen(this, in, __current);
            }
            case 436:
            {
                return ___getObjectType(this, in, __current);
            }
            case 437:
            {
                return ___getPCChatMessage(this, in, __current);
            }
            case 438:
            {
                return ___getPCChatSpeaker(this, in, __current);
            }
            case 439:
            {
                return ___getPCChatVolume(this, in, __current);
            }
            case 440:
            {
                return ___getPCIPAddress(this, in, __current);
            }
            case 441:
            {
                return ___getPCItemLastEquipped(this, in, __current);
            }
            case 442:
            {
                return ___getPCItemLastEquippedBy(this, in, __current);
            }
            case 443:
            {
                return ___getPCItemLastUnequipped(this, in, __current);
            }
            case 444:
            {
                return ___getPCItemLastUnequippedBy(this, in, __current);
            }
            case 445:
            {
                return ___getPCLevellingUp(this, in, __current);
            }
            case 446:
            {
                return ___getPCPlayerName(this, in, __current);
            }
            case 447:
            {
                return ___getPCPublicCDKey(this, in, __current);
            }
            case 448:
            {
                return ___getPCSpeaker(this, in, __current);
            }
            case 449:
            {
                return ___getPhenoType(this, in, __current);
            }
            case 450:
            {
                return ___getPickpocketableFlag(this, in, __current);
            }
            case 451:
            {
                return ___getPlaceableIllumination(this, in, __current);
            }
            case 452:
            {
                return ___getPlaceableLastClickedBy(this, in, __current);
            }
            case 453:
            {
                return ___getPlotFlag(this, in, __current);
            }
            case 454:
            {
                return ___getPortraitId(this, in, __current);
            }
            case 455:
            {
                return ___getPortraitResRef(this, in, __current);
            }
            case 456:
            {
                return ___getPosition(this, in, __current);
            }
            case 457:
            {
                return ___getRacialType(this, in, __current);
            }
            case 458:
            {
                return ___getReflexAdjustedDamage(this, in, __current);
            }
            case 459:
            {
                return ___getReflexSavingThrow(this, in, __current);
            }
            case 460:
            {
                return ___getReputation(this, in, __current);
            }
            case 461:
            {
                return ___getResRef(this, in, __current);
            }
            case 462:
            {
                return ___getSittingCreature(this, in, __current);
            }
            case 463:
            {
                return ___getSkillRank(this, in, __current);
            }
            case 464:
            {
                return ___getSkyBox(this, in, __current);
            }
            case 465:
            {
                return ___getSpellCastItem(this, in, __current);
            }
            case 466:
            {
                return ___getSpellId(this, in, __current);
            }
            case 467:
            {
                return ___getSpellResistance(this, in, __current);
            }
            case 468:
            {
                return ___getSpellSaveDC(this, in, __current);
            }
            case 469:
            {
                return ___getSpellTargetLocation(this, in, __current);
            }
            case 470:
            {
                return ___getSpellTargetObject(this, in, __current);
            }
            case 471:
            {
                return ___getStandardFactionReputation(this, in, __current);
            }
            case 472:
            {
                return ___getStartingLocation(this, in, __current);
            }
            case 473:
            {
                return ___getState(this, in, __current);
            }
            case 474:
            {
                return ___getStealthMode(this, in, __current);
            }
            case 475:
            {
                return ___getStolenFlag(this, in, __current);
            }
            case 476:
            {
                return ___getStoreGold(this, in, __current);
            }
            case 477:
            {
                return ___getStoreIdentifyCost(this, in, __current);
            }
            case 478:
            {
                return ___getStoreMaxBuyPrice(this, in, __current);
            }
            case 479:
            {
                return ___getStrRefSoundDuration(this, in, __current);
            }
            case 480:
            {
                return ___getStringByStrRef(this, in, __current);
            }
            case 481:
            {
                return ___getSubRace(this, in, __current);
            }
            case 482:
            {
                return ___getTag(this, in, __current);
            }
            case 483:
            {
                return ___getTileMainLight1Color(this, in, __current);
            }
            case 484:
            {
                return ___getTileMainLight2Color(this, in, __current);
            }
            case 485:
            {
                return ___getTileSourceLight1Color(this, in, __current);
            }
            case 486:
            {
                return ___getTileSourceLight2Color(this, in, __current);
            }
            case 487:
            {
                return ___getTilesetResRef(this, in, __current);
            }
            case 488:
            {
                return ___getTimeHour(this, in, __current);
            }
            case 489:
            {
                return ___getTimeMillisecond(this, in, __current);
            }
            case 490:
            {
                return ___getTimeMinute(this, in, __current);
            }
            case 491:
            {
                return ___getTimeSecond(this, in, __current);
            }
            case 492:
            {
                return ___getTotalDamageDealt(this, in, __current);
            }
            case 493:
            {
                return ___getTransitionTarget(this, in, __current);
            }
            case 494:
            {
                return ___getTrapActive(this, in, __current);
            }
            case 495:
            {
                return ___getTrapBaseType(this, in, __current);
            }
            case 496:
            {
                return ___getTrapCreator(this, in, __current);
            }
            case 497:
            {
                return ___getTrapDetectDC(this, in, __current);
            }
            case 498:
            {
                return ___getTrapDetectable(this, in, __current);
            }
            case 499:
            {
                return ___getTrapDetectedBy(this, in, __current);
            }
            case 500:
            {
                return ___getTrapDisarmDC(this, in, __current);
            }
            case 501:
            {
                return ___getTrapDisarmable(this, in, __current);
            }
            case 502:
            {
                return ___getTrapFlagged(this, in, __current);
            }
            case 503:
            {
                return ___getTrapKeyTag(this, in, __current);
            }
            case 504:
            {
                return ___getTrapOneShot(this, in, __current);
            }
            case 505:
            {
                return ___getTrapRecoverable(this, in, __current);
            }
            case 506:
            {
                return ___getTurnResistanceHD(this, in, __current);
            }
            case 507:
            {
                return ___getUseableFlag(this, in, __current);
            }
            case 508:
            {
                return ___getUserDefinedEventNumber(this, in, __current);
            }
            case 509:
            {
                return ___getWaypointByTag(this, in, __current);
            }
            case 510:
            {
                return ___getWeaponRanged(this, in, __current);
            }
            case 511:
            {
                return ___getWeather(this, in, __current);
            }
            case 512:
            {
                return ___getWeight(this, in, __current);
            }
            case 513:
            {
                return ___getWillSavingThrow(this, in, __current);
            }
            case 514:
            {
                return ___getXP(this, in, __current);
            }
            case 515:
            {
                return ___giveGoldToCreature(this, in, __current);
            }
            case 516:
            {
                return ___giveXPToCreature(this, in, __current);
            }
            case 517:
            {
                return ___hasState(this, in, __current);
            }
            case 518:
            {
                return ___hoursToSeconds(this, in, __current);
            }
            case 519:
            {
                return ___ice_id(this, in, __current);
            }
            case 520:
            {
                return ___ice_ids(this, in, __current);
            }
            case 521:
            {
                return ___ice_isA(this, in, __current);
            }
            case 522:
            {
                return ___ice_ping(this, in, __current);
            }
            case 523:
            {
                return ___incrementRemainingFeatUses(this, in, __current);
            }
            case 524:
            {
                return ___isInConversation(this, in, __current);
            }
            case 525:
            {
                return ___itemPropertyACBonus(this, in, __current);
            }
            case 526:
            {
                return ___itemPropertyACBonusVsAlign(this, in, __current);
            }
            case 527:
            {
                return ___itemPropertyACBonusVsDmgType(this, in, __current);
            }
            case 528:
            {
                return ___itemPropertyACBonusVsRace(this, in, __current);
            }
            case 529:
            {
                return ___itemPropertyACBonusVsSAlign(this, in, __current);
            }
            case 530:
            {
                return ___itemPropertyAbilityBonus(this, in, __current);
            }
            case 531:
            {
                return ___itemPropertyAdditional(this, in, __current);
            }
            case 532:
            {
                return ___itemPropertyArcaneSpellFailure(this, in, __current);
            }
            case 533:
            {
                return ___itemPropertyAttackBonus(this, in, __current);
            }
            case 534:
            {
                return ___itemPropertyAttackBonusVsAlign(this, in, __current);
            }
            case 535:
            {
                return ___itemPropertyAttackBonusVsRace(this, in, __current);
            }
            case 536:
            {
                return ___itemPropertyAttackBonusVsSAlign(this, in, __current);
            }
            case 537:
            {
                return ___itemPropertyAttackPenalty(this, in, __current);
            }
            case 538:
            {
                return ___itemPropertyBonusFeat(this, in, __current);
            }
            case 539:
            {
                return ___itemPropertyBonusLevelSpell(this, in, __current);
            }
            case 540:
            {
                return ___itemPropertyBonusSavingThrow(this, in, __current);
            }
            case 541:
            {
                return ___itemPropertyBonusSavingThrowVsX(this, in, __current);
            }
            case 542:
            {
                return ___itemPropertyBonusSpellResistance(this, in, __current);
            }
            case 543:
            {
                return ___itemPropertyCastSpell(this, in, __current);
            }
            case 544:
            {
                return ___itemPropertyContainerReducedWeight(this, in, __current);
            }
            case 545:
            {
                return ___itemPropertyDamageBonus(this, in, __current);
            }
            case 546:
            {
                return ___itemPropertyDamageBonusVsAlign(this, in, __current);
            }
            case 547:
            {
                return ___itemPropertyDamageBonusVsRace(this, in, __current);
            }
            case 548:
            {
                return ___itemPropertyDamageBonusVsSAlign(this, in, __current);
            }
            case 549:
            {
                return ___itemPropertyDamageImmunity(this, in, __current);
            }
            case 550:
            {
                return ___itemPropertyDamagePenalty(this, in, __current);
            }
            case 551:
            {
                return ___itemPropertyDamageReduction(this, in, __current);
            }
            case 552:
            {
                return ___itemPropertyDamageResistance(this, in, __current);
            }
            case 553:
            {
                return ___itemPropertyDamageVulnerability(this, in, __current);
            }
            case 554:
            {
                return ___itemPropertyDarkvision(this, in, __current);
            }
            case 555:
            {
                return ___itemPropertyDecreaseAC(this, in, __current);
            }
            case 556:
            {
                return ___itemPropertyDecreaseAbility(this, in, __current);
            }
            case 557:
            {
                return ___itemPropertyDecreaseSkill(this, in, __current);
            }
            case 558:
            {
                return ___itemPropertyEnhancementBonus(this, in, __current);
            }
            case 559:
            {
                return ___itemPropertyEnhancementBonusVsAlign(this, in, __current);
            }
            case 560:
            {
                return ___itemPropertyEnhancementBonusVsRace(this, in, __current);
            }
            case 561:
            {
                return ___itemPropertyEnhancementBonusVsSAlign(this, in, __current);
            }
            case 562:
            {
                return ___itemPropertyEnhancementPenalty(this, in, __current);
            }
            case 563:
            {
                return ___itemPropertyExtraMeleeDamageType(this, in, __current);
            }
            case 564:
            {
                return ___itemPropertyExtraRangeDamageType(this, in, __current);
            }
            case 565:
            {
                return ___itemPropertyFreeAction(this, in, __current);
            }
            case 566:
            {
                return ___itemPropertyHaste(this, in, __current);
            }
            case 567:
            {
                return ___itemPropertyHealersKit(this, in, __current);
            }
            case 568:
            {
                return ___itemPropertyHolyAvenger(this, in, __current);
            }
            case 569:
            {
                return ___itemPropertyImmunityMisc(this, in, __current);
            }
            case 570:
            {
                return ___itemPropertyImmunityToSpellLevel(this, in, __current);
            }
            case 571:
            {
                return ___itemPropertyImprovedEvasion(this, in, __current);
            }
            case 572:
            {
                return ___itemPropertyKeen(this, in, __current);
            }
            case 573:
            {
                return ___itemPropertyLight(this, in, __current);
            }
            case 574:
            {
                return ___itemPropertyLimitUseByAlign(this, in, __current);
            }
            case 575:
            {
                return ___itemPropertyLimitUseByClass(this, in, __current);
            }
            case 576:
            {
                return ___itemPropertyLimitUseByRace(this, in, __current);
            }
            case 577:
            {
                return ___itemPropertyLimitUseBySAlign(this, in, __current);
            }
            case 578:
            {
                return ___itemPropertyMassiveCritical(this, in, __current);
            }
            case 579:
            {
                return ___itemPropertyMaterial(this, in, __current);
            }
            case 580:
            {
                return ___itemPropertyMaxRangeStrengthMod(this, in, __current);
            }
            case 581:
            {
                return ___itemPropertyMonsterDamage(this, in, __current);
            }
            case 582:
            {
                return ___itemPropertyNoDamage(this, in, __current);
            }
            case 583:
            {
                return ___itemPropertyOnHitCastSpell(this, in, __current);
            }
            case 584:
            {
                return ___itemPropertyOnHitProps(this, in, __current);
            }
            case 585:
            {
                return ___itemPropertyOnMonsterHitProperties(this, in, __current);
            }
            case 586:
            {
                return ___itemPropertyQuality(this, in, __current);
            }
            case 587:
            {
                return ___itemPropertyReducedSavingThrow(this, in, __current);
            }
            case 588:
            {
                return ___itemPropertyReducedSavingThrowVsX(this, in, __current);
            }
            case 589:
            {
                return ___itemPropertyRegeneration(this, in, __current);
            }
            case 590:
            {
                return ___itemPropertySkillBonus(this, in, __current);
            }
            case 591:
            {
                return ___itemPropertySpecialWalk(this, in, __current);
            }
            case 592:
            {
                return ___itemPropertySpellImmunitySchool(this, in, __current);
            }
            case 593:
            {
                return ___itemPropertySpellImmunitySpecific(this, in, __current);
            }
            case 594:
            {
                return ___itemPropertyThievesTools(this, in, __current);
            }
            case 595:
            {
                return ___itemPropertyTrap(this, in, __current);
            }
            case 596:
            {
                return ___itemPropertyTrueSeeing(this, in, __current);
            }
            case 597:
            {
                return ___itemPropertyTurnResistance(this, in, __current);
            }
            case 598:
            {
                return ___itemPropertyUnlimitedAmmo(this, in, __current);
            }
            case 599:
            {
                return ___itemPropertyVampiricRegeneration(this, in, __current);
            }
            case 600:
            {
                return ___itemPropertyVisualEffect(this, in, __current);
            }
            case 601:
            {
                return ___itemPropertyWeightIncrease(this, in, __current);
            }
            case 602:
            {
                return ___itemPropertyWeightReduction(this, in, __current);
            }
            case 603:
            {
                return ___jumpToLocation(this, in, __current);
            }
            case 604:
            {
                return ___jumpToObject(this, in, __current);
            }
            case 605:
            {
                return ___levelUpHenchman(this, in, __current);
            }
            case 606:
            {
                return ___lineOfSightObject(this, in, __current);
            }
            case 607:
            {
                return ___lineOfSightVector(this, in, __current);
            }
            case 608:
            {
                return ___lockCameraDirection(this, in, __current);
            }
            case 609:
            {
                return ___lockCameraDistance(this, in, __current);
            }
            case 610:
            {
                return ___lockCameraPitch(this, in, __current);
            }
            case 611:
            {
                return ___magicalEffect(this, in, __current);
            }
            case 612:
            {
                return ___musicBackgroundChangeDay(this, in, __current);
            }
            case 613:
            {
                return ___musicBackgroundChangeNight(this, in, __current);
            }
            case 614:
            {
                return ___musicBackgroundGetBattleTrack(this, in, __current);
            }
            case 615:
            {
                return ___musicBackgroundGetDayTrack(this, in, __current);
            }
            case 616:
            {
                return ___musicBackgroundGetNightTrack(this, in, __current);
            }
            case 617:
            {
                return ___musicBackgroundPlay(this, in, __current);
            }
            case 618:
            {
                return ___musicBackgroundSetDelay(this, in, __current);
            }
            case 619:
            {
                return ___musicBackgroundStop(this, in, __current);
            }
            case 620:
            {
                return ___musicBattleChange(this, in, __current);
            }
            case 621:
            {
                return ___musicBattlePlay(this, in, __current);
            }
            case 622:
            {
                return ___musicBattleStop(this, in, __current);
            }
            case 623:
            {
                return ___nightToDay(this, in, __current);
            }
            case 624:
            {
                return ___openInventory(this, in, __current);
            }
            case 625:
            {
                return ___openStore(this, in, __current);
            }
            case 626:
            {
                return ___playAnimation(this, in, __current);
            }
            case 627:
            {
                return ___playSound(this, in, __current);
            }
            case 628:
            {
                return ___playSoundByStrRef(this, in, __current);
            }
            case 629:
            {
                return ___playVoiceChat(this, in, __current);
            }
            case 630:
            {
                return ___popUpDeathGUIPanel(this, in, __current);
            }
            case 631:
            {
                return ___popUpGUIPanel(this, in, __current);
            }
            case 632:
            {
                return ___putState(this, in, __current);
            }
            case 633:
            {
                return ___randomName(this, in, __current);
            }
            case 634:
            {
                return ___recomputeStaticLighting(this, in, __current);
            }
            case 635:
            {
                return ___reflexSave(this, in, __current);
            }
            case 636:
            {
                return ___removeEffect(this, in, __current);
            }
            case 637:
            {
                return ___removeFromParty(this, in, __current);
            }
            case 638:
            {
                return ___removeHenchman(this, in, __current);
            }
            case 639:
            {
                return ___removeItemProperty(this, in, __current);
            }
            case 640:
            {
                return ___removeJournalQuestEntry(this, in, __current);
            }
            case 641:
            {
                return ___removeSummonedAssociate(this, in, __current);
            }
            case 642:
            {
                return ___resistSpell(this, in, __current);
            }
            case 643:
            {
                return ___restoreBaseAttackBonus(this, in, __current);
            }
            case 644:
            {
                return ___restoreCameraFacing(this, in, __current);
            }
            case 645:
            {
                return ___retrieveCampaignObject(this, in, __current);
            }
            case 646:
            {
                return ___roundsToSeconds(this, in, __current);
            }
            case 647:
            {
                return ___sendMessageToAllDMs(this, in, __current);
            }
            case 648:
            {
                return ___sendMessageToPC(this, in, __current);
            }
            case 649:
            {
                return ___sendMessageToPCByStrRef(this, in, __current);
            }
            case 650:
            {
                return ___setAILevel(this, in, __current);
            }
            case 651:
            {
                return ___setActionMode(this, in, __current);
            }
            case 652:
            {
                return ___setAreaTransitionBMP(this, in, __current);
            }
            case 653:
            {
                return ___setAssociateListenPatterns(this, in, __current);
            }
            case 654:
            {
                return ___setBaseAttackBonus(this, in, __current);
            }
            case 655:
            {
                return ___setCalendar(this, in, __current);
            }
            case 656:
            {
                return ___setCameraFacing(this, in, __current);
            }
            case 657:
            {
                return ___setCameraHeight(this, in, __current);
            }
            case 658:
            {
                return ___setCameraMode(this, in, __current);
            }
            case 659:
            {
                return ___setCampaignFloat(this, in, __current);
            }
            case 660:
            {
                return ___setCampaignInt(this, in, __current);
            }
            case 661:
            {
                return ___setCampaignLocation(this, in, __current);
            }
            case 662:
            {
                return ___setCampaignString(this, in, __current);
            }
            case 663:
            {
                return ___setCampaignVector(this, in, __current);
            }
            case 664:
            {
                return ___setColor(this, in, __current);
            }
            case 665:
            {
                return ___setCommandable(this, in, __current);
            }
            case 666:
            {
                return ___setCreatureAppearanceType(this, in, __current);
            }
            case 667:
            {
                return ___setCreatureBodyPart(this, in, __current);
            }
            case 668:
            {
                return ___setCreatureTailType(this, in, __current);
            }
            case 669:
            {
                return ___setCreatureWingType(this, in, __current);
            }
            case 670:
            {
                return ___setCustomToken(this, in, __current);
            }
            case 671:
            {
                return ___setCutsceneCameraMoveRate(this, in, __current);
            }
            case 672:
            {
                return ___setCutsceneMode(this, in, __current);
            }
            case 673:
            {
                return ___setDeity(this, in, __current);
            }
            case 674:
            {
                return ___setDescription(this, in, __current);
            }
            case 675:
            {
                return ___setDroppableFlag(this, in, __current);
            }
            case 676:
            {
                return ___setEffectIconShown(this, in, __current);
            }
            case 677:
            {
                return ___setEncounterActive(this, in, __current);
            }
            case 678:
            {
                return ___setEncounterDifficulty(this, in, __current);
            }
            case 679:
            {
                return ___setEncounterSpawnsCurrent(this, in, __current);
            }
            case 680:
            {
                return ___setEncounterSpawnsMax(this, in, __current);
            }
            case 681:
            {
                return ___setFacing(this, in, __current);
            }
            case 682:
            {
                return ___setFacingPoint(this, in, __current);
            }
            case 683:
            {
                return ___setFogAmount(this, in, __current);
            }
            case 684:
            {
                return ___setFogColor(this, in, __current);
            }
            case 685:
            {
                return ___setFootstepType(this, in, __current);
            }
            case 686:
            {
                return ___setFortitudeSavingThrow(this, in, __current);
            }
            case 687:
            {
                return ___setHardness(this, in, __current);
            }
            case 688:
            {
                return ___setIdentified(this, in, __current);
            }
            case 689:
            {
                return ___setImmortal(this, in, __current);
            }
            case 690:
            {
                return ___setInfiniteFlag(this, in, __current);
            }
            case 691:
            {
                return ___setIsDestroyable(this, in, __current);
            }
            case 692:
            {
                return ___setIsTemporaryEnemy(this, in, __current);
            }
            case 693:
            {
                return ___setIsTemporaryFriend(this, in, __current);
            }
            case 694:
            {
                return ___setIsTemporaryNeutral(this, in, __current);
            }
            case 695:
            {
                return ___setItemCharges(this, in, __current);
            }
            case 696:
            {
                return ___setItemCursedFlag(this, in, __current);
            }
            case 697:
            {
                return ___setItemStackSize(this, in, __current);
            }
            case 698:
            {
                return ___setKeyRequiredFeedback(this, in, __current);
            }
            case 699:
            {
                return ___setListenPattern(this, in, __current);
            }
            case 700:
            {
                return ___setListening(this, in, __current);
            }
            case 701:
            {
                return ___setLocalFloat(this, in, __current);
            }
            case 702:
            {
                return ___setLocalInt(this, in, __current);
            }
            case 703:
            {
                return ___setLocalLocation(this, in, __current);
            }
            case 704:
            {
                return ___setLocalObject(this, in, __current);
            }
            case 705:
            {
                return ___setLocalString(this, in, __current);
            }
            case 706:
            {
                return ___setLockKeyRequired(this, in, __current);
            }
            case 707:
            {
                return ___setLockKeyTag(this, in, __current);
            }
            case 708:
            {
                return ___setLockLockDC(this, in, __current);
            }
            case 709:
            {
                return ___setLockLockable(this, in, __current);
            }
            case 710:
            {
                return ___setLockUnlockDC(this, in, __current);
            }
            case 711:
            {
                return ___setLocked(this, in, __current);
            }
            case 712:
            {
                return ___setLootable(this, in, __current);
            }
            case 713:
            {
                return ___setMapPinEnabled(this, in, __current);
            }
            case 714:
            {
                return ___setMaxHenchmen(this, in, __current);
            }
            case 715:
            {
                return ___setModuleXPScale(this, in, __current);
            }
            case 716:
            {
                return ___setName(this, in, __current);
            }
            case 717:
            {
                return ___setPCChatMessage(this, in, __current);
            }
            case 718:
            {
                return ___setPCChatVolume(this, in, __current);
            }
            case 719:
            {
                return ___setPCDislike(this, in, __current);
            }
            case 720:
            {
                return ___setPCLike(this, in, __current);
            }
            case 721:
            {
                return ___setPanelButtonFlash(this, in, __current);
            }
            case 722:
            {
                return ___setPhenoType(this, in, __current);
            }
            case 723:
            {
                return ___setPickpocketableFlag(this, in, __current);
            }
            case 724:
            {
                return ___setPlaceableIllumination(this, in, __current);
            }
            case 725:
            {
                return ___setPlotFlag(this, in, __current);
            }
            case 726:
            {
                return ___setPortraitId(this, in, __current);
            }
            case 727:
            {
                return ___setPortraitResRef(this, in, __current);
            }
            case 728:
            {
                return ___setReflexSavingThrow(this, in, __current);
            }
            case 729:
            {
                return ___setSkyBox(this, in, __current);
            }
            case 730:
            {
                return ___setStandardFactionReputation(this, in, __current);
            }
            case 731:
            {
                return ___setStolenFlag(this, in, __current);
            }
            case 732:
            {
                return ___setStoreGold(this, in, __current);
            }
            case 733:
            {
                return ___setStoreIdentifyCost(this, in, __current);
            }
            case 734:
            {
                return ___setStoreMaxBuyPrice(this, in, __current);
            }
            case 735:
            {
                return ___setSubRace(this, in, __current);
            }
            case 736:
            {
                return ___setTileMainLightColor(this, in, __current);
            }
            case 737:
            {
                return ___setTileSourceLightColor(this, in, __current);
            }
            case 738:
            {
                return ___setTime(this, in, __current);
            }
            case 739:
            {
                return ___setTrapActive(this, in, __current);
            }
            case 740:
            {
                return ___setTrapDetectDC(this, in, __current);
            }
            case 741:
            {
                return ___setTrapDetectable(this, in, __current);
            }
            case 742:
            {
                return ___setTrapDetectedBy(this, in, __current);
            }
            case 743:
            {
                return ___setTrapDisabled(this, in, __current);
            }
            case 744:
            {
                return ___setTrapDisarmDC(this, in, __current);
            }
            case 745:
            {
                return ___setTrapDisarmable(this, in, __current);
            }
            case 746:
            {
                return ___setTrapKeyTag(this, in, __current);
            }
            case 747:
            {
                return ___setTrapOneShot(this, in, __current);
            }
            case 748:
            {
                return ___setTrapRecoverable(this, in, __current);
            }
            case 749:
            {
                return ___setUseableFlag(this, in, __current);
            }
            case 750:
            {
                return ___setWeather(this, in, __current);
            }
            case 751:
            {
                return ___setWillSavingThrow(this, in, __current);
            }
            case 752:
            {
                return ___setXP(this, in, __current);
            }
            case 753:
            {
                return ___soundObjectPlay(this, in, __current);
            }
            case 754:
            {
                return ___soundObjectSetPosition(this, in, __current);
            }
            case 755:
            {
                return ___soundObjectSetVolume(this, in, __current);
            }
            case 756:
            {
                return ___soundObjectStop(this, in, __current);
            }
            case 757:
            {
                return ___speakOneLinerConversation(this, in, __current);
            }
            case 758:
            {
                return ___speakString(this, in, __current);
            }
            case 759:
            {
                return ___speakStringByStrRef(this, in, __current);
            }
            case 760:
            {
                return ___startNewModule(this, in, __current);
            }
            case 761:
            {
                return ___stopFade(this, in, __current);
            }
            case 762:
            {
                return ___storeCameraFacing(this, in, __current);
            }
            case 763:
            {
                return ___storeCampaignObject(this, in, __current);
            }
            case 764:
            {
                return ___summonAnimalCompanion(this, in, __current);
            }
            case 765:
            {
                return ___summonFamiliar(this, in, __current);
            }
            case 766:
            {
                return ___supernaturalEffect(this, in, __current);
            }
            case 767:
            {
                return ___surrenderToEnemies(this, in, __current);
            }
            case 768:
            {
                return ___takeGoldFromCreature(this, in, __current);
            }
            case 769:
            {
                return ___touchAttackMelee(this, in, __current);
            }
            case 770:
            {
                return ___touchAttackRanged(this, in, __current);
            }
            case 771:
            {
                return ___turnsToSeconds(this, in, __current);
            }
            case 772:
            {
                return ___unpossessFamiliar(this, in, __current);
            }
            case 773:
            {
                return ___vectorMagnitude(this, in, __current);
            }
            case 774:
            {
                return ___vectorNormalize(this, in, __current);
            }
            case 775:
            {
                return ___vectorToAngle(this, in, __current);
            }
            case 776:
            {
                return ___versusAlignmentEffect(this, in, __current);
            }
            case 777:
            {
                return ___versusRacialTypeEffect(this, in, __current);
            }
            case 778:
            {
                return ___versusTrapEffect(this, in, __current);
            }
            case 779:
            {
                return ___willSave(this, in, __current);
            }
            case 780:
            {
                return ___writeTimestampedLogEntry(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeTypeId(ice_staticId());
        __os.startWriteSlice();
        __os.endWriteSlice();
        super.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readTypeId();
        }
        __is.startReadSlice();
        __is.endReadSlice();
        super.__read(__is, true);
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type NWN::NWScript was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type NWN::NWScript was not generated with stream support";
        throw ex;
    }
}
