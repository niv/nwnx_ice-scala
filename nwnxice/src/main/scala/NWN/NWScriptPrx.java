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

public interface NWScriptPrx extends Ice.ObjectPrx
{
    public int getEffectInteger(NWEffect e, int index)
        throws InvalidArgumentException,
               InvalidEffectException;
    public int getEffectInteger(NWEffect e, int index, java.util.Map<String, String> __ctx)
        throws InvalidArgumentException,
               InvalidEffectException;

    public void setEffectInteger(NWEffect e, int index, int value)
        throws InvalidArgumentException,
               InvalidEffectException;
    public void setEffectInteger(NWEffect e, int index, int value, java.util.Map<String, String> __ctx)
        throws InvalidArgumentException,
               InvalidEffectException;

    public int getItemPropertyInteger(NWItemProperty e, int index)
        throws InvalidArgumentException,
               InvalidItemPropertyException;
    public int getItemPropertyInteger(NWItemProperty e, int index, java.util.Map<String, String> __ctx)
        throws InvalidArgumentException,
               InvalidItemPropertyException;

    public void setItemPropertyInteger(NWItemProperty e, int index, int value)
        throws InvalidArgumentException,
               InvalidItemPropertyException;
    public void setItemPropertyInteger(NWItemProperty e, int index, int value, java.util.Map<String, String> __ctx)
        throws InvalidArgumentException,
               InvalidItemPropertyException;

    public void setEffectTrueType(NWEffect e, EffectTrueType t)
        throws InvalidItemPropertyException;
    public void setEffectTrueType(NWEffect e, EffectTrueType t, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException;

    public float getEffectDuration(NWEffect e)
        throws InvalidEffectException;
    public float getEffectDuration(NWEffect e, java.util.Map<String, String> __ctx)
        throws InvalidEffectException;

    public float getItemPropertyDuration(NWItemProperty e)
        throws InvalidEffectException;
    public float getItemPropertyDuration(NWItemProperty e, java.util.Map<String, String> __ctx)
        throws InvalidEffectException;

    public void setDebugLogging(boolean state);
    public void setDebugLogging(boolean state, java.util.Map<String, String> __ctx);

    public long getInstructionCount();
    public long getInstructionCount(java.util.Map<String, String> __ctx);

    public boolean hasState(String key);
    public boolean hasState(String key, java.util.Map<String, String> __ctx);

    public NWN.Persistable getState(String key)
        throws StateNotAvailableException;
    public NWN.Persistable getState(String key, java.util.Map<String, String> __ctx)
        throws StateNotAvailableException;

    public void putState(String key, NWN.Persistable state);
    public void putState(String key, NWN.Persistable state, java.util.Map<String, String> __ctx);

    public void delState(String key);
    public void delState(String key, java.util.Map<String, String> __ctx);

    public void clearState();
    public void clearState(java.util.Map<String, String> __ctx);

    public NWObject[] allPCs()
        throws NotInContextException;
    public NWObject[] allPCs(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect[] allEffects(NWObject o)
        throws NotInContextException;
    public NWEffect[] allEffects(NWObject o, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject[] allInArea(NWObject area)
        throws NotInContextException;
    public NWObject[] allInArea(NWObject area, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject[] allInAreaOfType(NWObject area, ObjectType ofType)
        throws NotInContextException;
    public NWObject[] allInAreaOfType(NWObject area, ObjectType ofType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject[] allByTag(String tag)
        throws NotInContextException;
    public NWObject[] allByTag(String tag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject[] allInInventory(NWObject o)
        throws NotInContextException;
    public NWObject[] allInInventory(NWObject o, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWCreatureEquipped allEquipped(NWObject o)
        throws NotInContextException;
    public NWCreatureEquipped allEquipped(NWObject o, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty[] allItemProperties(NWObject item)
        throws NotInContextException;
    public NWItemProperty[] allItemProperties(NWObject item, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject[] allInShape(ShapeType tShapeType, float fSize, NWLocation lTarget, boolean bLineOfSight, ObjectType tObjectType, NWVector vOrigin)
        throws NotInContextException;
    public NWObject[] allInShape(ShapeType tShapeType, float fSize, NWLocation lTarget, boolean bLineOfSight, ObjectType tObjectType, NWVector vOrigin, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject[] allInFaction(NWObject memberOf, boolean bPCOnly)
        throws NotInContextException;
    public NWObject[] allInFaction(NWObject memberOf, boolean bPCOnly, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getEffectIconShown(NWEffect eff)
        throws InvalidEffectException,
               NotInContextException;
    public boolean getEffectIconShown(NWEffect eff, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public void setEffectIconShown(NWEffect eff, boolean bShown)
        throws InvalidEffectException,
               NotInContextException;
    public void setEffectIconShown(NWEffect eff, boolean bShown, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public boolean getEffectExposed(NWEffect eff)
        throws InvalidEffectException,
               NotInContextException;
    public boolean getEffectExposed(NWEffect eff, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public void setEffectExposed(NWEffect eff, boolean bShown)
        throws InvalidEffectException,
               NotInContextException;
    public void setEffectExposed(NWEffect eff, boolean bShown, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public void actionAttack(NWObject oAttackee, boolean bPassive)
        throws NotInContextException;
    public void actionAttack(NWObject oAttackee, boolean bPassive, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionCastFakeSpellAtLocation(int nSpell, NWLocation lTarget, ProjectilePathType tProjectilePathType)
        throws NotInContextException;
    public void actionCastFakeSpellAtLocation(int nSpell, NWLocation lTarget, ProjectilePathType tProjectilePathType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionCastFakeSpellAtObject(int nSpell, NWObject oTarget, ProjectilePathType tProjectilePathType)
        throws NotInContextException;
    public void actionCastFakeSpellAtObject(int nSpell, NWObject oTarget, ProjectilePathType tProjectilePathType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionCastSpellAtLocation(int nSpell, NWLocation lTargetLocation, MetaMagic tMetaMagic, boolean bCheat, ProjectilePathType tProjectilePathType, boolean bInstantSpell)
        throws NotInContextException;
    public void actionCastSpellAtLocation(int nSpell, NWLocation lTargetLocation, MetaMagic tMetaMagic, boolean bCheat, ProjectilePathType tProjectilePathType, boolean bInstantSpell, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionCastSpellAtObject(int nSpell, NWObject oTarget, MetaMagic tMetaMagic, boolean bCheat, int nDomainLevel, ProjectilePathType tProjectilePathType, boolean bInstantSpell)
        throws NotInContextException;
    public void actionCastSpellAtObject(int nSpell, NWObject oTarget, MetaMagic tMetaMagic, boolean bCheat, int nDomainLevel, ProjectilePathType tProjectilePathType, boolean bInstantSpell, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionCloseDoor(NWObject oDoor)
        throws NotInContextException;
    public void actionCloseDoor(NWObject oDoor, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionCounterSpell(NWObject oCounterSpellTarget)
        throws NotInContextException;
    public void actionCounterSpell(NWObject oCounterSpellTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionEquipItem(NWObject oItem, InventorySlot tInventorySlot)
        throws NotInContextException;
    public void actionEquipItem(NWObject oItem, InventorySlot tInventorySlot, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionEquipMostDamagingMelee(NWObject oVersus, boolean bOffHand)
        throws NotInContextException;
    public void actionEquipMostDamagingMelee(NWObject oVersus, boolean bOffHand, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionEquipMostDamagingRanged(NWObject oVersus)
        throws NotInContextException;
    public void actionEquipMostDamagingRanged(NWObject oVersus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionEquipMostEffectiveArmor()
        throws NotInContextException;
    public void actionEquipMostEffectiveArmor(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionExamine(NWObject oExamine)
        throws NotInContextException;
    public void actionExamine(NWObject oExamine, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionForceFollowObject(NWObject oFollow, float fFollowDistance)
        throws NotInContextException;
    public void actionForceFollowObject(NWObject oFollow, float fFollowDistance, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionForceMoveToLocation(NWLocation lDestination, boolean bRun, float fTimeout)
        throws NotInContextException;
    public void actionForceMoveToLocation(NWLocation lDestination, boolean bRun, float fTimeout, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionForceMoveToObject(NWObject oMoveTo, boolean bRun, float fRange, float fTimeout)
        throws NotInContextException;
    public void actionForceMoveToObject(NWObject oMoveTo, boolean bRun, float fRange, float fTimeout, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionGiveItem(NWObject oItem, NWObject oGiveTo)
        throws NotInContextException;
    public void actionGiveItem(NWObject oItem, NWObject oGiveTo, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionInteractObject(NWObject oPlaceable)
        throws NotInContextException;
    public void actionInteractObject(NWObject oPlaceable, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionJumpToLocation(NWLocation lLocation)
        throws NotInContextException;
    public void actionJumpToLocation(NWLocation lLocation, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionJumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint)
        throws NotInContextException;
    public void actionJumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionLockObject(NWObject oTarget)
        throws NotInContextException;
    public void actionLockObject(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionMoveAwayFromLocation(NWLocation lMoveAwayFrom, boolean bRun, float fMoveAwayRange)
        throws NotInContextException;
    public void actionMoveAwayFromLocation(NWLocation lMoveAwayFrom, boolean bRun, float fMoveAwayRange, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionMoveAwayFromObject(NWObject oFleeFrom, boolean bRun, float fMoveAwayRange)
        throws NotInContextException;
    public void actionMoveAwayFromObject(NWObject oFleeFrom, boolean bRun, float fMoveAwayRange, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionMoveToLocation(NWLocation lDestination, boolean bRun)
        throws NotInContextException;
    public void actionMoveToLocation(NWLocation lDestination, boolean bRun, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionMoveToObject(NWObject oMoveTo, boolean bRun, float fRange)
        throws NotInContextException;
    public void actionMoveToObject(NWObject oMoveTo, boolean bRun, float fRange, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionOpenDoor(NWObject oDoor)
        throws NotInContextException;
    public void actionOpenDoor(NWObject oDoor, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionPauseConversation()
        throws NotInContextException;
    public void actionPauseConversation(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionPickUpItem(NWObject oItem)
        throws NotInContextException;
    public void actionPickUpItem(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionPlayAnimation(int nAnimation, float fSpeed, float fDurationSeconds)
        throws NotInContextException;
    public void actionPlayAnimation(int nAnimation, float fSpeed, float fDurationSeconds, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionPutDownItem(NWObject oItem)
        throws NotInContextException;
    public void actionPutDownItem(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionRandomWalk()
        throws NotInContextException;
    public void actionRandomWalk(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionRest(boolean bCreatureToEnemyLineOfSightCheck)
        throws NotInContextException;
    public void actionRest(boolean bCreatureToEnemyLineOfSightCheck, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionResumeConversation()
        throws NotInContextException;
    public void actionResumeConversation(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionSit(NWObject oChair)
        throws NotInContextException;
    public void actionSit(NWObject oChair, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionSpeakString(String sStringToSpeak, TalkVolume tTalkVolume)
        throws NotInContextException;
    public void actionSpeakString(String sStringToSpeak, TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionSpeakStringByStrRef(int nStrRef, TalkVolume tTalkVolume)
        throws NotInContextException;
    public void actionSpeakStringByStrRef(int nStrRef, TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionStartConversation(NWObject oObjectToConverseWith, String sDialogResRef, boolean bPrivateConversation, boolean bPlayHello)
        throws NotInContextException;
    public void actionStartConversation(NWObject oObjectToConverseWith, String sDialogResRef, boolean bPrivateConversation, boolean bPlayHello, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionTakeItem(NWObject oItem, NWObject oTakeFrom)
        throws NotInContextException;
    public void actionTakeItem(NWObject oItem, NWObject oTakeFrom, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionUnequipItem(NWObject oItem)
        throws NotInContextException;
    public void actionUnequipItem(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionUnlockObject(NWObject oTarget)
        throws NotInContextException;
    public void actionUnlockObject(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionUseFeat(int nFeat, NWObject oTarget)
        throws NotInContextException;
    public void actionUseFeat(int nFeat, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionUseSkill(int nSkill, NWObject oTarget, int nSubSkill, NWObject oItemUsed)
        throws NotInContextException;
    public void actionUseSkill(int nSkill, NWObject oTarget, int nSubSkill, NWObject oItemUsed, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void actionWait(float fSeconds)
        throws NotInContextException;
    public void actionWait(float fSeconds, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void activatePortal(NWObject oTarget, String sIPaddress, String sPassword, String sWaypointTag, boolean bSeemless)
        throws NotInContextException;
    public void activatePortal(NWObject oTarget, String sIPaddress, String sPassword, String sWaypointTag, boolean bSeemless, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void addHenchman(NWObject oMaster, NWObject oHenchman)
        throws NotInContextException;
    public void addHenchman(NWObject oMaster, NWObject oHenchman, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void addItemProperty(DurationType tDurationType, NWItemProperty ipProperty, NWObject oItem, float fDuration)
        throws InvalidItemPropertyException,
               NotInContextException;
    public void addItemProperty(DurationType tDurationType, NWItemProperty ipProperty, NWObject oItem, float fDuration, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public void addJournalQuestEntry(String szPlotID, int nState, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers, boolean bAllowOverrideHigher)
        throws NotInContextException;
    public void addJournalQuestEntry(String szPlotID, int nState, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers, boolean bAllowOverrideHigher, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void addToParty(NWObject oPC, NWObject oPartyLeader)
        throws NotInContextException;
    public void addToParty(NWObject oPC, NWObject oPartyLeader, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void adjustAlignment(NWObject oSubject, Alignment tAlignment, int nShift, boolean bAllPartyMembers)
        throws NotInContextException;
    public void adjustAlignment(NWObject oSubject, Alignment tAlignment, int nShift, boolean bAllPartyMembers, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void adjustReputation(NWObject oTarget, NWObject oSourceFactionMember, int nAdjustment)
        throws NotInContextException;
    public void adjustReputation(NWObject oTarget, NWObject oSourceFactionMember, int nAdjustment, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void ambientSoundChangeDay(NWObject oArea, int nTrack)
        throws NotInContextException;
    public void ambientSoundChangeDay(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void ambientSoundChangeNight(NWObject oArea, int nTrack)
        throws NotInContextException;
    public void ambientSoundChangeNight(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void ambientSoundPlay(NWObject oArea)
        throws NotInContextException;
    public void ambientSoundPlay(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void ambientSoundSetDayVolume(NWObject oArea, int nVolume)
        throws NotInContextException;
    public void ambientSoundSetDayVolume(NWObject oArea, int nVolume, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void ambientSoundSetNightVolume(NWObject oArea, int nVolume)
        throws NotInContextException;
    public void ambientSoundSetNightVolume(NWObject oArea, int nVolume, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void ambientSoundStop(NWObject oArea)
        throws NotInContextException;
    public void ambientSoundStop(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWVector angleToVector(float fAngle)
        throws NotInContextException;
    public NWVector angleToVector(float fAngle, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void applyEffectAtLocation(DurationType tDurationType, NWEffect eEffect, NWLocation lLocation, float fDuration)
        throws InvalidEffectException,
               NotInContextException;
    public void applyEffectAtLocation(DurationType tDurationType, NWEffect eEffect, NWLocation lLocation, float fDuration, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public void applyEffectToObject(DurationType tDurationType, NWEffect eEffect, NWObject oTarget, float fDuration)
        throws InvalidEffectException,
               NotInContextException;
    public void applyEffectToObject(DurationType tDurationType, NWEffect eEffect, NWObject oTarget, float fDuration, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public NWItemProperty badBadReplaceMeThisDoesNothing()
        throws NotInContextException;
    public NWItemProperty badBadReplaceMeThisDoesNothing(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int beginConversation(String sResRef, NWObject oObjectToDialog)
        throws NotInContextException;
    public int beginConversation(String sResRef, NWObject oObjectToDialog, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void blackScreen(NWObject oCreature)
        throws NotInContextException;
    public void blackScreen(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void bootPC(NWObject oPlayer)
        throws NotInContextException;
    public void bootPC(NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void changeFaction(NWObject oObjectToChangeFaction, NWObject oMemberOfFactionToJoin)
        throws NotInContextException;
    public void changeFaction(NWObject oObjectToChangeFaction, NWObject oMemberOfFactionToJoin, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void changeToStandardFaction(NWObject oCreatureToChange, StandardFaction tStandardFaction)
        throws NotInContextException;
    public void changeToStandardFaction(NWObject oCreatureToChange, StandardFaction tStandardFaction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void clearAllActions(boolean bClearCombatState)
        throws NotInContextException;
    public void clearAllActions(boolean bClearCombatState, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void clearPersonalReputation(NWObject oTarget, NWObject oSource)
        throws NotInContextException;
    public void clearPersonalReputation(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject copyItem(NWObject oItem, NWObject oTargetInventory, boolean bCopyVars)
        throws NotInContextException;
    public NWObject copyItem(NWObject oItem, NWObject oTargetInventory, boolean bCopyVars, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject copyItemAndModify(NWObject oItem, int nType, int nIndex, int nNewValue, boolean bCopyVars)
        throws NotInContextException;
    public NWObject copyItemAndModify(NWObject oItem, int nType, int nIndex, int nNewValue, boolean bCopyVars, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject copyObject(NWObject oSource, NWLocation locLocation, NWObject oOwner, String sNewTag)
        throws NotInContextException;
    public NWObject copyObject(NWObject oSource, NWLocation locLocation, NWObject oOwner, String sNewTag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject createItemOnObject(String sItemTemplate, NWObject oTarget, int nStackSize, String sNewTag)
        throws NotInContextException;
    public NWObject createItemOnObject(String sItemTemplate, NWObject oTarget, int nStackSize, String sNewTag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject createObject(ObjectType tObjectType, String sTemplate, NWLocation lLocation, boolean bUseAppearAnimation, String sNewTag)
        throws NotInContextException;
    public NWObject createObject(ObjectType tObjectType, String sTemplate, NWLocation lLocation, boolean bUseAppearAnimation, String sNewTag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject createTrapAtLocation(TrapType tTrapType, NWLocation lLocation, float fSize, String sTag, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript)
        throws NotInContextException;
    public NWObject createTrapAtLocation(TrapType tTrapType, NWLocation lLocation, float fSize, String sTag, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void createTrapOnObject(TrapType tTrapType, NWObject oObject, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript)
        throws NotInContextException;
    public void createTrapOnObject(TrapType tTrapType, NWObject oObject, StandardFaction tStandardFaction, String sOnDisarmScript, String sOnTrapTriggeredScript, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void dayToNight(NWObject oPlayer, float fTransitionTime)
        throws NotInContextException;
    public void dayToNight(NWObject oPlayer, float fTransitionTime, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void decrementRemainingFeatUses(NWObject oCreature, int nFeat)
        throws NotInContextException;
    public void decrementRemainingFeatUses(NWObject oCreature, int nFeat, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void decrementRemainingSpellUses(NWObject oCreature, int nSpell)
        throws NotInContextException;
    public void decrementRemainingSpellUses(NWObject oCreature, int nSpell, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void deleteCampaignVariable(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;
    public void deleteCampaignVariable(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void deleteLocalFloat(NWObject oObject, String sVarName)
        throws NotInContextException;
    public void deleteLocalFloat(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void deleteLocalInt(NWObject oObject, String sVarName)
        throws NotInContextException;
    public void deleteLocalInt(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void deleteLocalLocation(NWObject oObject, String sVarName)
        throws NotInContextException;
    public void deleteLocalLocation(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void deleteLocalObject(NWObject oObject, String sVarName)
        throws NotInContextException;
    public void deleteLocalObject(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void deleteLocalString(NWObject oObject, String sVarName)
        throws NotInContextException;
    public void deleteLocalString(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void destroyCampaignDatabase(String sCampaignName)
        throws NotInContextException;
    public void destroyCampaignDatabase(String sCampaignName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void destroyObject(NWObject oDestroy, float fDelay)
        throws NotInContextException;
    public void destroyObject(NWObject oDestroy, float fDelay, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void doDoorAction(NWObject oTargetDoor, DoorAction tDoorAction)
        throws NotInContextException;
    public void doDoorAction(NWObject oTargetDoor, DoorAction tDoorAction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void doPlaceableObjectAction(NWObject oPlaceable, PlaceableAction tPlaceableAction)
        throws NotInContextException;
    public void doPlaceableObjectAction(NWObject oPlaceable, PlaceableAction tPlaceableAction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void doSinglePlayerAutoSave()
        throws NotInContextException;
    public void doSinglePlayerAutoSave(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void doWhirlwindAttack(boolean bDisplayFeedback, boolean bImproved)
        throws NotInContextException;
    public void doWhirlwindAttack(boolean bDisplayFeedback, boolean bImproved, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectACDecrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType)
        throws NotInContextException;
    public NWEffect effectACDecrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectACIncrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType)
        throws NotInContextException;
    public NWEffect effectACIncrease(int nValue, ACModifyType tACModifyType, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectAbilityDecrease(Ability tAbility, int nModifyBy)
        throws NotInContextException;
    public NWEffect effectAbilityDecrease(Ability tAbility, int nModifyBy, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectAbilityIncrease(Ability tAbility, int nModifyBy)
        throws NotInContextException;
    public NWEffect effectAbilityIncrease(Ability tAbility, int nModifyBy, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectAppear(int nAnimation)
        throws NotInContextException;
    public NWEffect effectAppear(int nAnimation, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectAreaOfEffect(int nAreaEffectId, String sOnEnterScript, String sHeartbeatScript, String sOnExitScript)
        throws NotInContextException;
    public NWEffect effectAreaOfEffect(int nAreaEffectId, String sOnEnterScript, String sHeartbeatScript, String sOnExitScript, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectAttackDecrease(int nPenalty, AttackBonus tAttackBonus)
        throws NotInContextException;
    public NWEffect effectAttackDecrease(int nPenalty, AttackBonus tAttackBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectAttackIncrease(int nBonus, AttackBonus tAttackBonus)
        throws NotInContextException;
    public NWEffect effectAttackIncrease(int nBonus, AttackBonus tAttackBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectBeam(int nBeamVisualEffect, NWObject oEffector, CreaturePart tCreaturePart, boolean bMissEffect)
        throws NotInContextException;
    public NWEffect effectBeam(int nBeamVisualEffect, NWObject oEffector, CreaturePart tCreaturePart, boolean bMissEffect, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectBlindness()
        throws NotInContextException;
    public NWEffect effectBlindness(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectCharmed()
        throws NotInContextException;
    public NWEffect effectCharmed(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectConcealment(int nPercentage, MissChanceType tMissChanceType)
        throws NotInContextException;
    public NWEffect effectConcealment(int nPercentage, MissChanceType tMissChanceType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectConfused()
        throws NotInContextException;
    public NWEffect effectConfused(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectCurse(int nStrMod, int nDexMod, int nConMod, int nIntMod, int nWisMod, int nChaMod)
        throws NotInContextException;
    public NWEffect effectCurse(int nStrMod, int nDexMod, int nConMod, int nIntMod, int nWisMod, int nChaMod, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectCutsceneDominated()
        throws NotInContextException;
    public NWEffect effectCutsceneDominated(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectCutsceneGhost()
        throws NotInContextException;
    public NWEffect effectCutsceneGhost(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectCutsceneImmobilize()
        throws NotInContextException;
    public NWEffect effectCutsceneImmobilize(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectCutsceneParalyze()
        throws NotInContextException;
    public NWEffect effectCutsceneParalyze(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDamage(int nDamageAmount, DamageType tDamageType, DamagePower tDamagePower)
        throws NotInContextException;
    public NWEffect effectDamage(int nDamageAmount, DamageType tDamageType, DamagePower tDamagePower, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDamageDecrease(int nPenalty, DamageType tDamageType)
        throws NotInContextException;
    public NWEffect effectDamageDecrease(int nPenalty, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDamageImmunityDecrease(DamageType tDamageType, int nPercentImmunity)
        throws NotInContextException;
    public NWEffect effectDamageImmunityDecrease(DamageType tDamageType, int nPercentImmunity, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDamageImmunityIncrease(DamageType tDamageType, int nPercentImmunity)
        throws NotInContextException;
    public NWEffect effectDamageImmunityIncrease(DamageType tDamageType, int nPercentImmunity, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDamageIncrease(int nBonus, DamageType tDamageType)
        throws NotInContextException;
    public NWEffect effectDamageIncrease(int nBonus, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDamageReduction(int nAmount, DamagePower tDamagePower, int nLimit)
        throws NotInContextException;
    public NWEffect effectDamageReduction(int nAmount, DamagePower tDamagePower, int nLimit, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDamageResistance(DamageType tDamageType, int nAmount, int nLimit)
        throws NotInContextException;
    public NWEffect effectDamageResistance(DamageType tDamageType, int nAmount, int nLimit, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDamageShield(int nDamageAmount, int nRandomAmount, DamageType tDamageType)
        throws NotInContextException;
    public NWEffect effectDamageShield(int nDamageAmount, int nRandomAmount, DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDarkness()
        throws NotInContextException;
    public NWEffect effectDarkness(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDazed()
        throws NotInContextException;
    public NWEffect effectDazed(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDeaf()
        throws NotInContextException;
    public NWEffect effectDeaf(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDeath(boolean bSpectacularDeath, boolean bDisplayFeedback)
        throws NotInContextException;
    public NWEffect effectDeath(boolean bSpectacularDeath, boolean bDisplayFeedback, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDisappear(int nAnimation)
        throws NotInContextException;
    public NWEffect effectDisappear(int nAnimation, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDisappearAppear(NWLocation lLocation, int nAnimation)
        throws NotInContextException;
    public NWEffect effectDisappearAppear(NWLocation lLocation, int nAnimation, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDisease(int nDiseaseType)
        throws NotInContextException;
    public NWEffect effectDisease(int nDiseaseType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDispelMagicAll(int nCasterLevel)
        throws NotInContextException;
    public NWEffect effectDispelMagicAll(int nCasterLevel, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDispelMagicBest(int nCasterLevel)
        throws NotInContextException;
    public NWEffect effectDispelMagicBest(int nCasterLevel, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectDominated()
        throws NotInContextException;
    public NWEffect effectDominated(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectEntangle()
        throws NotInContextException;
    public NWEffect effectEntangle(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectEthereal()
        throws NotInContextException;
    public NWEffect effectEthereal(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectFrightened()
        throws NotInContextException;
    public NWEffect effectFrightened(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectHaste()
        throws NotInContextException;
    public NWEffect effectHaste(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectHeal(int nDamageToHeal)
        throws NotInContextException;
    public NWEffect effectHeal(int nDamageToHeal, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectHitPointChangeWhenDying(float fHitPointChangePerRound)
        throws NotInContextException;
    public NWEffect effectHitPointChangeWhenDying(float fHitPointChangePerRound, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectImmunity(ImmunityType tImmunityType)
        throws NotInContextException;
    public NWEffect effectImmunity(ImmunityType tImmunityType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectInvisibility(int nInvisibilityType)
        throws NotInContextException;
    public NWEffect effectInvisibility(int nInvisibilityType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectKnockdown()
        throws NotInContextException;
    public NWEffect effectKnockdown(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectLinkEffects(NWEffect eChildEffect, NWEffect eParentEffect)
        throws InvalidEffectException,
               NotInContextException;
    public NWEffect effectLinkEffects(NWEffect eChildEffect, NWEffect eParentEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public NWEffect effectMissChance(int nPercentage, MissChanceType tMissChanceType)
        throws NotInContextException;
    public NWEffect effectMissChance(int nPercentage, MissChanceType tMissChanceType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectModifyAttacks(int nAttacks)
        throws NotInContextException;
    public NWEffect effectModifyAttacks(int nAttacks, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectMovementSpeedDecrease(int nPercentChange)
        throws NotInContextException;
    public NWEffect effectMovementSpeedDecrease(int nPercentChange, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectMovementSpeedIncrease(int nPercentChange)
        throws NotInContextException;
    public NWEffect effectMovementSpeedIncrease(int nPercentChange, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectNegativeLevel(int nNumLevels, boolean bHPBonus)
        throws NotInContextException;
    public NWEffect effectNegativeLevel(int nNumLevels, boolean bHPBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectParalyze()
        throws NotInContextException;
    public NWEffect effectParalyze(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectPetrify()
        throws NotInContextException;
    public NWEffect effectPetrify(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectPoison(int nPoisonType)
        throws NotInContextException;
    public NWEffect effectPoison(int nPoisonType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectPolymorph(int nPolymorphSelection, boolean bLocked)
        throws NotInContextException;
    public NWEffect effectPolymorph(int nPolymorphSelection, boolean bLocked, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectRegenerate(int nAmount, float fIntervalSeconds)
        throws NotInContextException;
    public NWEffect effectRegenerate(int nAmount, float fIntervalSeconds, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectResurrection()
        throws NotInContextException;
    public NWEffect effectResurrection(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSanctuary(int nDifficultyClass)
        throws NotInContextException;
    public NWEffect effectSanctuary(int nDifficultyClass, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSavingThrowDecrease(int nSave, int nValue, SaveType tSaveType)
        throws NotInContextException;
    public NWEffect effectSavingThrowDecrease(int nSave, int nValue, SaveType tSaveType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSavingThrowIncrease(int nSave, int nValue, SaveType tSaveType)
        throws NotInContextException;
    public NWEffect effectSavingThrowIncrease(int nSave, int nValue, SaveType tSaveType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSeeInvisible()
        throws NotInContextException;
    public NWEffect effectSeeInvisible(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSilence()
        throws NotInContextException;
    public NWEffect effectSilence(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSkillDecrease(int nSkill, int nValue)
        throws NotInContextException;
    public NWEffect effectSkillDecrease(int nSkill, int nValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSkillIncrease(int nSkill, int nValue)
        throws NotInContextException;
    public NWEffect effectSkillIncrease(int nSkill, int nValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSleep()
        throws NotInContextException;
    public NWEffect effectSleep(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSlow()
        throws NotInContextException;
    public NWEffect effectSlow(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSpellFailure(int nPercent, SpellSchool tSpellSchool)
        throws NotInContextException;
    public NWEffect effectSpellFailure(int nPercent, SpellSchool tSpellSchool, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSpellImmunity(int nImmunityToSpell)
        throws NotInContextException;
    public NWEffect effectSpellImmunity(int nImmunityToSpell, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSpellLevelAbsorption(int nMaxSpellLevelAbsorbed, int nTotalSpellLevelsAbsorbed, SpellSchool tSpellSchool)
        throws NotInContextException;
    public NWEffect effectSpellLevelAbsorption(int nMaxSpellLevelAbsorbed, int nTotalSpellLevelsAbsorbed, SpellSchool tSpellSchool, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSpellResistanceDecrease(int nValue)
        throws NotInContextException;
    public NWEffect effectSpellResistanceDecrease(int nValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSpellResistanceIncrease(int nValue)
        throws NotInContextException;
    public NWEffect effectSpellResistanceIncrease(int nValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectStunned()
        throws NotInContextException;
    public NWEffect effectStunned(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSummonCreature(String sCreatureResref, int nVisualEffectId, float fDelaySeconds, boolean bUseAppearAnimation)
        throws NotInContextException;
    public NWEffect effectSummonCreature(String sCreatureResref, int nVisualEffectId, float fDelaySeconds, boolean bUseAppearAnimation, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectSwarm(boolean bLooping, String sCreatureTemplate1, String sCreatureTemplate2, String sCreatureTemplate3, String sCreatureTemplate4)
        throws NotInContextException;
    public NWEffect effectSwarm(boolean bLooping, String sCreatureTemplate1, String sCreatureTemplate2, String sCreatureTemplate3, String sCreatureTemplate4, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectTemporaryHitpoints(int nHitPoints)
        throws NotInContextException;
    public NWEffect effectTemporaryHitpoints(int nHitPoints, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectTimeStop()
        throws NotInContextException;
    public NWEffect effectTimeStop(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectTrueSeeing()
        throws NotInContextException;
    public NWEffect effectTrueSeeing(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectTurnResistanceDecrease(int nHitDice)
        throws NotInContextException;
    public NWEffect effectTurnResistanceDecrease(int nHitDice, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectTurnResistanceIncrease(int nHitDice)
        throws NotInContextException;
    public NWEffect effectTurnResistanceIncrease(int nHitDice, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectTurned()
        throws NotInContextException;
    public NWEffect effectTurned(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectUltravision()
        throws NotInContextException;
    public NWEffect effectUltravision(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect effectVisualEffect(int nVisualEffectId, boolean bMissEffect)
        throws NotInContextException;
    public NWEffect effectVisualEffect(int nVisualEffectId, boolean bMissEffect, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void endGame(String sEndMovie)
        throws NotInContextException;
    public void endGame(String sEndMovie, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void executeScript(String sScript, NWObject oTarget)
        throws NotInContextException;
    public void executeScript(String sScript, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void exploreAreaForPlayer(NWObject oArea, NWObject oPlayer, boolean bExplored)
        throws NotInContextException;
    public void exploreAreaForPlayer(NWObject oArea, NWObject oPlayer, boolean bExplored, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void exportAllCharacters()
        throws NotInContextException;
    public void exportAllCharacters(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void exportSingleCharacter(NWObject oPlayer)
        throws NotInContextException;
    public void exportSingleCharacter(NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect extraordinaryEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public NWEffect extraordinaryEffect(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public void fadeFromBlack(NWObject oCreature, float fSpeed)
        throws NotInContextException;
    public void fadeFromBlack(NWObject oCreature, float fSpeed, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void fadeToBlack(NWObject oCreature, float fSpeed)
        throws NotInContextException;
    public void fadeToBlack(NWObject oCreature, float fSpeed, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void floatingTextStrRefOnCreature(int nStrRefToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction)
        throws NotInContextException;
    public void floatingTextStrRefOnCreature(int nStrRefToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void floatingTextStringOnCreature(String sStringToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction)
        throws NotInContextException;
    public void floatingTextStringOnCreature(String sStringToDisplay, NWObject oCreatureToFloatAbove, boolean bBroadcastToFaction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void forceRest(NWObject oCreature)
        throws NotInContextException;
    public void forceRest(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public SavingThrowResult fortitudeSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException;
    public SavingThrowResult fortitudeSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String get2DAString(String s2DA, String sColumn, int nRow)
        throws NotInContextException;
    public String get2DAString(String s2DA, String sColumn, int nRow, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getAC(NWObject oObject)
        throws NotInContextException;
    public int getAC(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public AILevel getAILevel(NWObject oTarget)
        throws NotInContextException;
    public AILevel getAILevel(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getAbilityModifier(Ability tAbility, NWObject oCreature)
        throws NotInContextException;
    public int getAbilityModifier(Ability tAbility, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getAbilityScore(NWObject oCreature, Ability tAbility, boolean bBaseAbilityScore)
        throws NotInContextException;
    public int getAbilityScore(NWObject oCreature, Ability tAbility, boolean bBaseAbilityScore, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getActionMode(NWObject oCreature, ActionMode tActionMode)
        throws NotInContextException;
    public boolean getActionMode(NWObject oCreature, ActionMode tActionMode, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getAge(NWObject oCreature)
        throws NotInContextException;
    public int getAge(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public Alignment getAlignmentGoodEvil(NWObject oCreature)
        throws NotInContextException;
    public Alignment getAlignmentGoodEvil(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public Alignment getAlignmentLawChaos(NWObject oCreature)
        throws NotInContextException;
    public Alignment getAlignmentLawChaos(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getAnimalCompanionCreatureType(NWObject oCreature)
        throws NotInContextException;
    public int getAnimalCompanionCreatureType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getAnimalCompanionName(NWObject oTarget)
        throws NotInContextException;
    public String getAnimalCompanionName(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getAppearanceType(NWObject oCreature)
        throws NotInContextException;
    public int getAppearanceType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getArcaneSpellFailure(NWObject oCreature)
        throws NotInContextException;
    public int getArcaneSpellFailure(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getArea(NWObject oTarget)
        throws NotInContextException;
    public NWObject getArea(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getAreaOfEffectCreator(NWObject oAreaOfEffectObject)
        throws NotInContextException;
    public NWObject getAreaOfEffectCreator(NWObject oAreaOfEffectObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getAreaSize(int nAreaDimension, NWObject oArea)
        throws NotInContextException;
    public int getAreaSize(int nAreaDimension, NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getAssociate(AssociateType tAssociateType, NWObject oMaster, int nTh)
        throws NotInContextException;
    public NWObject getAssociate(AssociateType tAssociateType, NWObject oMaster, int nTh, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public AssociateType getAssociateType(NWObject oAssociate)
        throws NotInContextException;
    public AssociateType getAssociateType(NWObject oAssociate, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getAttackTarget(NWObject oCreature)
        throws NotInContextException;
    public NWObject getAttackTarget(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getAttemptedAttackTarget()
        throws NotInContextException;
    public NWObject getAttemptedAttackTarget(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getAttemptedSpellTarget()
        throws NotInContextException;
    public NWObject getAttemptedSpellTarget(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getBaseAttackBonus(NWObject oCreature)
        throws NotInContextException;
    public int getBaseAttackBonus(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getBaseItemType(NWObject oItem)
        throws NotInContextException;
    public int getBaseItemType(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getBlockingDoor()
        throws NotInContextException;
    public NWObject getBlockingDoor(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCalendarDay()
        throws NotInContextException;
    public int getCalendarDay(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCalendarMonth()
        throws NotInContextException;
    public int getCalendarMonth(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCalendarYear()
        throws NotInContextException;
    public int getCalendarYear(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getCampaignFloat(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;
    public float getCampaignFloat(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCampaignInt(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;
    public int getCampaignInt(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWLocation getCampaignLocation(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;
    public NWLocation getCampaignLocation(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getCampaignString(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;
    public String getCampaignString(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWVector getCampaignVector(String sCampaignName, String sVarName, NWObject oPlayer)
        throws NotInContextException;
    public NWVector getCampaignVector(String sCampaignName, String sVarName, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCasterLevel(NWObject oCreature)
        throws NotInContextException;
    public int getCasterLevel(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getChallengeRating(NWObject oCreature)
        throws NotInContextException;
    public float getChallengeRating(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getClassByPosition(int nClassPosition, NWObject oCreature)
        throws NotInContextException;
    public int getClassByPosition(int nClassPosition, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getClickingObject()
        throws NotInContextException;
    public NWObject getClickingObject(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getColor(NWObject oObject, int nColorChannel)
        throws NotInContextException;
    public int getColor(NWObject oObject, int nColorChannel, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getCommandable(NWObject oTarget)
        throws NotInContextException;
    public boolean getCommandable(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCreatureBodyPart(CreaturePart tCreaturePart, NWObject oCreature)
        throws NotInContextException;
    public int getCreatureBodyPart(CreaturePart tCreaturePart, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public CreatureSize getCreatureSize(NWObject oCreature)
        throws NotInContextException;
    public CreatureSize getCreatureSize(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCreatureStartingPackage(NWObject oCreature)
        throws NotInContextException;
    public int getCreatureStartingPackage(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCreatureTailType(NWObject oCreature)
        throws NotInContextException;
    public int getCreatureTailType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCreatureWingType(NWObject oCreature)
        throws NotInContextException;
    public int getCreatureWingType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public Action getCurrentAction(NWObject oObject)
        throws NotInContextException;
    public Action getCurrentAction(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getCurrentHitPoints(NWObject oObject)
        throws NotInContextException;
    public int getCurrentHitPoints(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getCutsceneCameraMoveRate(NWObject oCreature)
        throws NotInContextException;
    public float getCutsceneCameraMoveRate(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getCutsceneMode(NWObject oCreature)
        throws NotInContextException;
    public boolean getCutsceneMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getDamageDealtByType(DamageType tDamageType)
        throws NotInContextException;
    public int getDamageDealtByType(DamageType tDamageType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getDefensiveCastingMode(NWObject oCreature)
        throws NotInContextException;
    public int getDefensiveCastingMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getDeity(NWObject oCreature)
        throws NotInContextException;
    public String getDeity(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getDescription(NWObject oObject, boolean bOriginalDescription, boolean bIdentifiedDescription)
        throws NotInContextException;
    public String getDescription(NWObject oObject, boolean bOriginalDescription, boolean bIdentifiedDescription, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getDetectMode(NWObject oCreature)
        throws NotInContextException;
    public int getDetectMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getDialogSoundLength(int nStrRef)
        throws NotInContextException;
    public float getDialogSoundLength(int nStrRef, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getDistanceBetween(NWObject oObjectA, NWObject oObjectB)
        throws NotInContextException;
    public float getDistanceBetween(NWObject oObjectA, NWObject oObjectB, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getDistanceBetweenLocations(NWLocation lLocationA, NWLocation lLocationB)
        throws NotInContextException;
    public float getDistanceBetweenLocations(NWLocation lLocationA, NWLocation lLocationB, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getDistanceToObject(NWObject oObject)
        throws NotInContextException;
    public float getDistanceToObject(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getDroppableFlag(NWObject oItem)
        throws NotInContextException;
    public boolean getDroppableFlag(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getEffectCreator(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public NWObject getEffectCreator(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public DurationType getEffectDurationType(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public DurationType getEffectDurationType(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public int getEffectSpellId(NWEffect eSpellEffect)
        throws InvalidEffectException,
               NotInContextException;
    public int getEffectSpellId(NWEffect eSpellEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public EffectSubType getEffectSubType(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public EffectSubType getEffectSubType(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public EffectType getEffectType(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public EffectType getEffectType(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public int getEncounterActive(NWObject oEncounter)
        throws NotInContextException;
    public int getEncounterActive(NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getEncounterDifficulty(NWObject oEncounter)
        throws NotInContextException;
    public int getEncounterDifficulty(NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getEncounterSpawnsCurrent(NWObject oEncounter)
        throws NotInContextException;
    public int getEncounterSpawnsCurrent(NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getEncounterSpawnsMax(NWObject oEncounter)
        throws NotInContextException;
    public int getEncounterSpawnsMax(NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getEnteringObject()
        throws NotInContextException;
    public NWObject getEnteringObject(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getExitingObject()
        throws NotInContextException;
    public NWObject getExitingObject(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getFacing(NWObject oTarget)
        throws NotInContextException;
    public float getFacing(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFactionAverageGoodEvilAlignment(NWObject oFactionMember)
        throws NotInContextException;
    public int getFactionAverageGoodEvilAlignment(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFactionAverageLawChaosAlignment(NWObject oFactionMember)
        throws NotInContextException;
    public int getFactionAverageLawChaosAlignment(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFactionAverageLevel(NWObject oFactionMember)
        throws NotInContextException;
    public int getFactionAverageLevel(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFactionAverageReputation(NWObject oSourceFactionMember, NWObject oTarget)
        throws NotInContextException;
    public int getFactionAverageReputation(NWObject oSourceFactionMember, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFactionAverageXP(NWObject oFactionMember)
        throws NotInContextException;
    public int getFactionAverageXP(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getFactionBestAC(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;
    public NWObject getFactionBestAC(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getFactionEqual(NWObject oFirstObject, NWObject oSecondObject)
        throws NotInContextException;
    public boolean getFactionEqual(NWObject oFirstObject, NWObject oSecondObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFactionGold(NWObject oFactionMember)
        throws NotInContextException;
    public int getFactionGold(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getFactionLeader(NWObject oMemberOfFaction)
        throws NotInContextException;
    public NWObject getFactionLeader(NWObject oMemberOfFaction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getFactionLeastDamagedMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;
    public NWObject getFactionLeastDamagedMember(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getFactionMostDamagedMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;
    public NWObject getFactionMostDamagedMember(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFactionMostFrequentClass(NWObject oFactionMember)
        throws NotInContextException;
    public int getFactionMostFrequentClass(NWObject oFactionMember, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getFactionStrongestMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;
    public NWObject getFactionStrongestMember(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getFactionWeakestMember(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;
    public NWObject getFactionWeakestMember(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getFactionWorstAC(NWObject oFactionMember, boolean bMustBeVisible)
        throws NotInContextException;
    public NWObject getFactionWorstAC(NWObject oFactionMember, boolean bMustBeVisible, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFamiliarCreatureType(NWObject oCreature)
        throws NotInContextException;
    public int getFamiliarCreatureType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getFamiliarName(NWObject oCreature)
        throws NotInContextException;
    public String getFamiliarName(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFogAmount(int nFogType, NWObject oArea)
        throws NotInContextException;
    public int getFogAmount(int nFogType, NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFogColor(int nFogType, NWObject oArea)
        throws NotInContextException;
    public int getFogColor(int nFogType, NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFootstepType(NWObject oCreature)
        throws NotInContextException;
    public int getFootstepType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getFortitudeSavingThrow(NWObject oTarget)
        throws NotInContextException;
    public int getFortitudeSavingThrow(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getGameDifficulty()
        throws NotInContextException;
    public int getGameDifficulty(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public Gender getGender(NWObject oCreature)
        throws NotInContextException;
    public Gender getGender(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getGoingToBeAttackedBy(NWObject oTarget)
        throws NotInContextException;
    public NWObject getGoingToBeAttackedBy(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getGold(NWObject oTarget)
        throws NotInContextException;
    public int getGold(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getGoldPieceValue(NWObject oItem)
        throws NotInContextException;
    public int getGoldPieceValue(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getGoodEvilValue(NWObject oCreature)
        throws NotInContextException;
    public int getGoodEvilValue(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getHardness(NWObject oObject)
        throws NotInContextException;
    public int getHardness(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getHasFeat(int nFeat, NWObject oCreature)
        throws NotInContextException;
    public boolean getHasFeat(int nFeat, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getHasFeatEffect(int nFeat, NWObject oObject)
        throws NotInContextException;
    public boolean getHasFeatEffect(int nFeat, NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getHasInventory(NWObject oObject)
        throws NotInContextException;
    public boolean getHasInventory(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getHasSkill(int nSkill, NWObject oCreature)
        throws NotInContextException;
    public boolean getHasSkill(int nSkill, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getHasSpell(int nSpell, NWObject oCreature)
        throws NotInContextException;
    public boolean getHasSpell(int nSpell, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getHasSpellEffect(int nSpell, NWObject oObject)
        throws NotInContextException;
    public boolean getHasSpellEffect(int nSpell, NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getHenchman(NWObject oMaster, int nNth)
        throws NotInContextException;
    public NWObject getHenchman(NWObject oMaster, int nNth, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getHitDice(NWObject oCreature)
        throws NotInContextException;
    public int getHitDice(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIdentified(NWObject oItem)
        throws NotInContextException;
    public boolean getIdentified(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getImmortal(NWObject oTarget)
        throws NotInContextException;
    public boolean getImmortal(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getInfiniteFlag(NWObject oItem)
        throws NotInContextException;
    public boolean getInfiniteFlag(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getInventoryDisturbItem()
        throws NotInContextException;
    public NWObject getInventoryDisturbItem(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getInventoryDisturbType()
        throws NotInContextException;
    public int getInventoryDisturbType(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsAreaAboveGround(NWObject oArea)
        throws NotInContextException;
    public boolean getIsAreaAboveGround(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsAreaInterior(NWObject oArea)
        throws NotInContextException;
    public boolean getIsAreaInterior(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsAreaNatural(NWObject oArea)
        throws NotInContextException;
    public boolean getIsAreaNatural(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsCreatureDisarmable(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsCreatureDisarmable(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsDM(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsDM(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsDMPossessed(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsDMPossessed(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsDawn()
        throws NotInContextException;
    public boolean getIsDawn(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsDay()
        throws NotInContextException;
    public boolean getIsDay(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsDead(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsDead(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsDoorActionPossible(NWObject oTargetDoor, DoorAction tDoorAction)
        throws NotInContextException;
    public boolean getIsDoorActionPossible(NWObject oTargetDoor, DoorAction tDoorAction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsDusk()
        throws NotInContextException;
    public boolean getIsDusk(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsEffectValid(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public boolean getIsEffectValid(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public boolean getIsEncounterCreature(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsEncounterCreature(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsEnemy(NWObject oTarget, NWObject oSource)
        throws NotInContextException;
    public boolean getIsEnemy(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsFriend(NWObject oTarget, NWObject oSource)
        throws NotInContextException;
    public boolean getIsFriend(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsImmune(NWObject oCreature, ImmunityType tImmunityType, NWObject oVersus)
        throws NotInContextException;
    public boolean getIsImmune(NWObject oCreature, ImmunityType tImmunityType, NWObject oVersus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsInCombat(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsInCombat(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsInSubArea(NWObject oCreature, NWObject oSubArea)
        throws NotInContextException;
    public boolean getIsInSubArea(NWObject oCreature, NWObject oSubArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsItemPropertyValid(NWItemProperty ipProperty)
        throws InvalidItemPropertyException,
               NotInContextException;
    public boolean getIsItemPropertyValid(NWItemProperty ipProperty, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public boolean getIsListening(NWObject oObject)
        throws NotInContextException;
    public boolean getIsListening(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsNeutral(NWObject oTarget, NWObject oSource)
        throws NotInContextException;
    public boolean getIsNeutral(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsNight()
        throws NotInContextException;
    public boolean getIsNight(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsObjectValid(NWObject oObject)
        throws NotInContextException;
    public boolean getIsObjectValid(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsOpen(NWObject oObject)
        throws NotInContextException;
    public boolean getIsOpen(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsPC(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsPC(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsPlaceableObjectActionPossible(NWObject oPlaceable, PlaceableAction tPlaceableAction)
        throws NotInContextException;
    public boolean getIsPlaceableObjectActionPossible(NWObject oPlaceable, PlaceableAction tPlaceableAction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsPlayableRacialType(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsPlayableRacialType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsPossessedFamiliar(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsPossessedFamiliar(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsReactionTypeFriendly(NWObject oTarget, NWObject oSource)
        throws NotInContextException;
    public boolean getIsReactionTypeFriendly(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsReactionTypeHostile(NWObject oTarget, NWObject oSource)
        throws NotInContextException;
    public boolean getIsReactionTypeHostile(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsReactionTypeNeutral(NWObject oTarget, NWObject oSource)
        throws NotInContextException;
    public boolean getIsReactionTypeNeutral(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsResting(NWObject oCreature)
        throws NotInContextException;
    public boolean getIsResting(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsSkillSuccessful(NWObject oTarget, int nSkill, int nDifficulty)
        throws NotInContextException;
    public boolean getIsSkillSuccessful(NWObject oTarget, int nSkill, int nDifficulty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsTrapped(NWObject oObject)
        throws NotInContextException;
    public boolean getIsTrapped(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getIsWeaponEffective(NWObject oVersus, boolean bOffHand)
        throws NotInContextException;
    public boolean getIsWeaponEffective(NWObject oVersus, boolean bOffHand, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getItemACValue(NWObject oItem)
        throws NotInContextException;
    public int getItemACValue(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getItemActivated()
        throws NotInContextException;
    public NWObject getItemActivated(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getItemActivatedTarget()
        throws NotInContextException;
    public NWObject getItemActivatedTarget(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWLocation getItemActivatedTargetLocation()
        throws NotInContextException;
    public NWLocation getItemActivatedTargetLocation(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getItemActivator()
        throws NotInContextException;
    public NWObject getItemActivator(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getItemAppearance(NWObject oItem, int nType, int nIndex)
        throws NotInContextException;
    public int getItemAppearance(NWObject oItem, int nType, int nIndex, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getItemCharges(NWObject oItem)
        throws NotInContextException;
    public int getItemCharges(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getItemCursedFlag(NWObject oItem)
        throws NotInContextException;
    public boolean getItemCursedFlag(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getItemHasItemProperty(NWObject oItem, int nProperty)
        throws NotInContextException;
    public boolean getItemHasItemProperty(NWObject oItem, int nProperty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getItemInSlot(InventorySlot tInventorySlot, NWObject oCreature)
        throws NotInContextException;
    public NWObject getItemInSlot(InventorySlot tInventorySlot, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getItemPossessedBy(NWObject oCreature, String sItemTag)
        throws NotInContextException;
    public NWObject getItemPossessedBy(NWObject oCreature, String sItemTag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getItemPossessor(NWObject oItem)
        throws NotInContextException;
    public NWObject getItemPossessor(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getItemPropertyCostTable(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException;
    public int getItemPropertyCostTable(NWItemProperty iProp, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public int getItemPropertyCostTableValue(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException;
    public int getItemPropertyCostTableValue(NWItemProperty iProp, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public DurationType getItemPropertyDurationType(NWItemProperty ip)
        throws InvalidItemPropertyException,
               NotInContextException;
    public DurationType getItemPropertyDurationType(NWItemProperty ip, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public int getItemPropertyParam1(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException;
    public int getItemPropertyParam1(NWItemProperty iProp, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public int getItemPropertyParam1Value(NWItemProperty iProp)
        throws InvalidItemPropertyException,
               NotInContextException;
    public int getItemPropertyParam1Value(NWItemProperty iProp, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public int getItemPropertySubType(NWItemProperty iProperty)
        throws InvalidItemPropertyException,
               NotInContextException;
    public int getItemPropertySubType(NWItemProperty iProperty, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public int getItemPropertyType(NWItemProperty ip)
        throws InvalidItemPropertyException,
               NotInContextException;
    public int getItemPropertyType(NWItemProperty ip, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public int getItemStackSize(NWObject oItem)
        throws NotInContextException;
    public int getItemStackSize(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getJournalQuestExperience(String szPlotID)
        throws NotInContextException;
    public int getJournalQuestExperience(String szPlotID, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getKeyRequiredFeedback(NWObject oObject)
        throws NotInContextException;
    public String getKeyRequiredFeedback(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public AssociateCommand getLastAssociateCommand(NWObject oAssociate)
        throws NotInContextException;
    public AssociateCommand getLastAssociateCommand(NWObject oAssociate, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public CombatMode getLastAttackMode(NWObject oCreature)
        throws NotInContextException;
    public CombatMode getLastAttackMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public SpecialAttack getLastAttackType(NWObject oCreature)
        throws NotInContextException;
    public SpecialAttack getLastAttackType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastAttacker(NWObject oAttackee)
        throws NotInContextException;
    public NWObject getLastAttacker(NWObject oAttackee, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastClosedBy()
        throws NotInContextException;
    public NWObject getLastClosedBy(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastDamager(NWObject oObject)
        throws NotInContextException;
    public NWObject getLastDamager(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastDisarmed()
        throws NotInContextException;
    public NWObject getLastDisarmed(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastDisturbed()
        throws NotInContextException;
    public NWObject getLastDisturbed(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastHostileActor(NWObject oVictim)
        throws NotInContextException;
    public NWObject getLastHostileActor(NWObject oVictim, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastKiller()
        throws NotInContextException;
    public NWObject getLastKiller(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastLocked()
        throws NotInContextException;
    public NWObject getLastLocked(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastOpenedBy()
        throws NotInContextException;
    public NWObject getLastOpenedBy(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastPCRested()
        throws NotInContextException;
    public NWObject getLastPCRested(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastPCToCancelCutscene()
        throws NotInContextException;
    public NWObject getLastPCToCancelCutscene(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastPerceived()
        throws NotInContextException;
    public NWObject getLastPerceived(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getLastPerceptionHeard()
        throws NotInContextException;
    public boolean getLastPerceptionHeard(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getLastPerceptionInaudible()
        throws NotInContextException;
    public boolean getLastPerceptionInaudible(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getLastPerceptionSeen()
        throws NotInContextException;
    public boolean getLastPerceptionSeen(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getLastPerceptionVanished()
        throws NotInContextException;
    public boolean getLastPerceptionVanished(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastPlayerDied()
        throws NotInContextException;
    public NWObject getLastPlayerDied(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastPlayerDying()
        throws NotInContextException;
    public NWObject getLastPlayerDying(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastRespawnButtonPresser()
        throws NotInContextException;
    public NWObject getLastRespawnButtonPresser(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getLastRestEventType()
        throws NotInContextException;
    public int getLastRestEventType(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastSpeaker()
        throws NotInContextException;
    public NWObject getLastSpeaker(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getLastSpell()
        throws NotInContextException;
    public int getLastSpell(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getLastSpellCastClass()
        throws NotInContextException;
    public int getLastSpellCastClass(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastSpellCaster()
        throws NotInContextException;
    public NWObject getLastSpellCaster(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getLastSpellHarmful()
        throws NotInContextException;
    public boolean getLastSpellHarmful(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastTrapDetected(NWObject oTarget)
        throws NotInContextException;
    public NWObject getLastTrapDetected(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastUnlocked()
        throws NotInContextException;
    public NWObject getLastUnlocked(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastUsedBy()
        throws NotInContextException;
    public NWObject getLastUsedBy(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLastWeaponUsed(NWObject oCreature)
        throws NotInContextException;
    public NWObject getLastWeaponUsed(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getLawChaosValue(NWObject oCreature)
        throws NotInContextException;
    public int getLawChaosValue(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getLevelByClass(int nClassType, NWObject oCreature)
        throws NotInContextException;
    public int getLevelByClass(int nClassType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getLevelByPosition(int nClassPosition, NWObject oCreature)
        throws NotInContextException;
    public int getLevelByPosition(int nClassPosition, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getListenPatternNumber()
        throws NotInContextException;
    public int getListenPatternNumber(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getLocalFloat(NWObject oObject, String sVarName)
        throws NotInContextException;
    public float getLocalFloat(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getLocalInt(NWObject oObject, String sVarName)
        throws NotInContextException;
    public int getLocalInt(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWLocation getLocalLocation(NWObject oObject, String sVarName)
        throws NotInContextException;
    public NWLocation getLocalLocation(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getLocalObject(NWObject oObject, String sVarName)
        throws NotInContextException;
    public NWObject getLocalObject(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getLocalString(NWObject oObject, String sVarName)
        throws NotInContextException;
    public String getLocalString(NWObject oObject, String sVarName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWLocation getLocation(NWObject oObject)
        throws NotInContextException;
    public NWLocation getLocation(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getLockKeyRequired(NWObject oObject)
        throws NotInContextException;
    public boolean getLockKeyRequired(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getLockKeyTag(NWObject oObject)
        throws NotInContextException;
    public String getLockKeyTag(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getLockLockDC(NWObject oObject)
        throws NotInContextException;
    public int getLockLockDC(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getLockLockable(NWObject oObject)
        throws NotInContextException;
    public boolean getLockLockable(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getLockUnlockDC(NWObject oObject)
        throws NotInContextException;
    public int getLockUnlockDC(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getLocked(NWObject oTarget)
        throws NotInContextException;
    public boolean getLocked(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getLootable(NWObject oCreature)
        throws NotInContextException;
    public boolean getLootable(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getMaster(NWObject oAssociate)
        throws NotInContextException;
    public NWObject getMaster(NWObject oAssociate, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getMatchedSubstring(int nString)
        throws NotInContextException;
    public String getMatchedSubstring(int nString, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getMatchedSubstringsCount()
        throws NotInContextException;
    public int getMatchedSubstringsCount(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getMaxHenchmen()
        throws NotInContextException;
    public int getMaxHenchmen(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getMaxHitPoints(NWObject oObject)
        throws NotInContextException;
    public int getMaxHitPoints(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public MetaMagic getMetaMagicFeat()
        throws NotInContextException;
    public MetaMagic getMetaMagicFeat(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getModule()
        throws NotInContextException;
    public NWObject getModule(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getModuleItemAcquired()
        throws NotInContextException;
    public NWObject getModuleItemAcquired(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getModuleItemAcquiredBy()
        throws NotInContextException;
    public NWObject getModuleItemAcquiredBy(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getModuleItemAcquiredFrom()
        throws NotInContextException;
    public NWObject getModuleItemAcquiredFrom(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getModuleItemAcquiredStackSize()
        throws NotInContextException;
    public int getModuleItemAcquiredStackSize(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getModuleItemLost()
        throws NotInContextException;
    public NWObject getModuleItemLost(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getModuleItemLostBy()
        throws NotInContextException;
    public NWObject getModuleItemLostBy(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getModuleName()
        throws NotInContextException;
    public String getModuleName(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getModuleXPScale()
        throws NotInContextException;
    public int getModuleXPScale(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getMovementRate(NWObject oCreature)
        throws NotInContextException;
    public int getMovementRate(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getName(NWObject oObject, boolean bOriginalName)
        throws NotInContextException;
    public String getName(NWObject oObject, boolean bOriginalName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getNearestCreature(int nFirstCriteriaType, int nFirstCriteriaValue, NWObject oTarget, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue)
        throws NotInContextException;
    public NWObject getNearestCreature(int nFirstCriteriaType, int nFirstCriteriaValue, NWObject oTarget, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getNearestCreatureToLocation(int nFirstCriteriaType, int nFirstCriteriaValue, NWLocation lLocation, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue)
        throws NotInContextException;
    public NWObject getNearestCreatureToLocation(int nFirstCriteriaType, int nFirstCriteriaValue, NWLocation lLocation, int nNth, int nSecondCriteriaType, int nSecondCriteriaValue, int nThirdCriteriaType, int nThirdCriteriaValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getNearestObject(ObjectType tObjectType, NWObject oTarget, int nNth)
        throws NotInContextException;
    public NWObject getNearestObject(ObjectType tObjectType, NWObject oTarget, int nNth, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getNearestObjectByTag(String sTag, NWObject oTarget, int nNth)
        throws NotInContextException;
    public NWObject getNearestObjectByTag(String sTag, NWObject oTarget, int nNth, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getNearestObjectToLocation(ObjectType tObjectType, NWLocation lLocation, int nNth)
        throws NotInContextException;
    public NWObject getNearestObjectToLocation(ObjectType tObjectType, NWLocation lLocation, int nNth, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getNearestTrapToObject(NWObject oTarget, boolean bTrapDetected)
        throws NotInContextException;
    public NWObject getNearestTrapToObject(NWObject oTarget, boolean bTrapDetected, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getNumStackedItems(NWObject oItem)
        throws NotInContextException;
    public int getNumStackedItems(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getObjectByTag(String sTag, int nNth)
        throws NotInContextException;
    public NWObject getObjectByTag(String sTag, int nNth, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getObjectHeard(NWObject oTarget, NWObject oSource)
        throws NotInContextException;
    public boolean getObjectHeard(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getObjectSeen(NWObject oTarget, NWObject oSource)
        throws NotInContextException;
    public boolean getObjectSeen(NWObject oTarget, NWObject oSource, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public ObjectType getObjectType(NWObject oTarget)
        throws NotInContextException;
    public ObjectType getObjectType(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getPCChatMessage()
        throws NotInContextException;
    public String getPCChatMessage(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getPCChatSpeaker()
        throws NotInContextException;
    public NWObject getPCChatSpeaker(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getPCChatVolume()
        throws NotInContextException;
    public int getPCChatVolume(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getPCIPAddress(NWObject oPlayer)
        throws NotInContextException;
    public String getPCIPAddress(NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getPCItemLastEquipped()
        throws NotInContextException;
    public NWObject getPCItemLastEquipped(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getPCItemLastEquippedBy()
        throws NotInContextException;
    public NWObject getPCItemLastEquippedBy(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getPCItemLastUnequipped()
        throws NotInContextException;
    public NWObject getPCItemLastUnequipped(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getPCItemLastUnequippedBy()
        throws NotInContextException;
    public NWObject getPCItemLastUnequippedBy(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getPCLevellingUp()
        throws NotInContextException;
    public NWObject getPCLevellingUp(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getPCPlayerName(NWObject oPlayer)
        throws NotInContextException;
    public String getPCPlayerName(NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getPCPublicCDKey(NWObject oPlayer, boolean bSinglePlayerCDKey)
        throws NotInContextException;
    public String getPCPublicCDKey(NWObject oPlayer, boolean bSinglePlayerCDKey, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getPCSpeaker()
        throws NotInContextException;
    public NWObject getPCSpeaker(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public PhenoType getPhenoType(NWObject oCreature)
        throws NotInContextException;
    public PhenoType getPhenoType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getPickpocketableFlag(NWObject oItem)
        throws NotInContextException;
    public boolean getPickpocketableFlag(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getPlaceableIllumination(NWObject oPlaceable)
        throws NotInContextException;
    public int getPlaceableIllumination(NWObject oPlaceable, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getPlaceableLastClickedBy()
        throws NotInContextException;
    public NWObject getPlaceableLastClickedBy(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getPlotFlag(NWObject oTarget)
        throws NotInContextException;
    public boolean getPlotFlag(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getPortraitId(NWObject oTarget)
        throws NotInContextException;
    public int getPortraitId(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getPortraitResRef(NWObject oTarget)
        throws NotInContextException;
    public String getPortraitResRef(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWVector getPosition(NWObject oTarget)
        throws NotInContextException;
    public NWVector getPosition(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public RacialType getRacialType(NWObject oCreature)
        throws NotInContextException;
    public RacialType getRacialType(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getReflexAdjustedDamage(int nDamage, NWObject oTarget, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException;
    public int getReflexAdjustedDamage(int nDamage, NWObject oTarget, int nDC, SaveType tSaveType, NWObject oSaveVersus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getReflexSavingThrow(NWObject oTarget)
        throws NotInContextException;
    public int getReflexSavingThrow(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getReputation(NWObject oSource, NWObject oTarget)
        throws NotInContextException;
    public int getReputation(NWObject oSource, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getResRef(NWObject oObject)
        throws NotInContextException;
    public String getResRef(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getSittingCreature(NWObject oChair)
        throws NotInContextException;
    public NWObject getSittingCreature(NWObject oChair, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getSkillRank(int nSkill, NWObject oTarget, boolean bBaseSkillRank)
        throws NotInContextException;
    public int getSkillRank(int nSkill, NWObject oTarget, boolean bBaseSkillRank, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getSkyBox(NWObject oArea)
        throws NotInContextException;
    public int getSkyBox(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getSpellCastItem()
        throws NotInContextException;
    public NWObject getSpellCastItem(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getSpellId()
        throws NotInContextException;
    public int getSpellId(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getSpellResistance(NWObject oCreature)
        throws NotInContextException;
    public int getSpellResistance(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getSpellSaveDC()
        throws NotInContextException;
    public int getSpellSaveDC(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWLocation getSpellTargetLocation()
        throws NotInContextException;
    public NWLocation getSpellTargetLocation(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getSpellTargetObject()
        throws NotInContextException;
    public NWObject getSpellTargetObject(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getStandardFactionReputation(StandardFaction tStandardFaction, NWObject oCreature)
        throws NotInContextException;
    public int getStandardFactionReputation(StandardFaction tStandardFaction, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWLocation getStartingLocation()
        throws NotInContextException;
    public NWLocation getStartingLocation(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getStealthMode(NWObject oCreature)
        throws NotInContextException;
    public int getStealthMode(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getStolenFlag(NWObject oStolen)
        throws NotInContextException;
    public boolean getStolenFlag(NWObject oStolen, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getStoreGold(NWObject oidStore)
        throws NotInContextException;
    public int getStoreGold(NWObject oidStore, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getStoreIdentifyCost(NWObject oidStore)
        throws NotInContextException;
    public int getStoreIdentifyCost(NWObject oidStore, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getStoreMaxBuyPrice(NWObject oidStore)
        throws NotInContextException;
    public int getStoreMaxBuyPrice(NWObject oidStore, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float getStrRefSoundDuration(int nStrRef)
        throws NotInContextException;
    public float getStrRefSoundDuration(int nStrRef, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getStringByStrRef(int nStrRef, Gender tGender)
        throws NotInContextException;
    public String getStringByStrRef(int nStrRef, Gender tGender, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getSubRace(NWObject oTarget)
        throws NotInContextException;
    public String getSubRace(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getTag(NWObject oObject)
        throws NotInContextException;
    public String getTag(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public TileMainLightColor getTileMainLight1Color(NWLocation lTile)
        throws NotInContextException;
    public TileMainLightColor getTileMainLight1Color(NWLocation lTile, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public TileMainLightColor getTileMainLight2Color(NWLocation lTile)
        throws NotInContextException;
    public TileMainLightColor getTileMainLight2Color(NWLocation lTile, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public TileSourceLightColor getTileSourceLight1Color(NWLocation lTile)
        throws NotInContextException;
    public TileSourceLightColor getTileSourceLight1Color(NWLocation lTile, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public TileSourceLightColor getTileSourceLight2Color(NWLocation lTile)
        throws NotInContextException;
    public TileSourceLightColor getTileSourceLight2Color(NWLocation lTile, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getTilesetResRef(NWObject oArea)
        throws NotInContextException;
    public String getTilesetResRef(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getTimeHour()
        throws NotInContextException;
    public int getTimeHour(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getTimeMillisecond()
        throws NotInContextException;
    public int getTimeMillisecond(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getTimeMinute()
        throws NotInContextException;
    public int getTimeMinute(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getTimeSecond()
        throws NotInContextException;
    public int getTimeSecond(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getTotalDamageDealt()
        throws NotInContextException;
    public int getTotalDamageDealt(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getTransitionTarget(NWObject oTransition)
        throws NotInContextException;
    public NWObject getTransitionTarget(NWObject oTransition, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getTrapActive(NWObject oTrapObject)
        throws NotInContextException;
    public boolean getTrapActive(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getTrapBaseType(NWObject oTrapObject)
        throws NotInContextException;
    public int getTrapBaseType(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getTrapCreator(NWObject oTrapObject)
        throws NotInContextException;
    public NWObject getTrapCreator(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getTrapDetectDC(NWObject oTrapObject)
        throws NotInContextException;
    public int getTrapDetectDC(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getTrapDetectable(NWObject oTrapObject)
        throws NotInContextException;
    public boolean getTrapDetectable(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getTrapDetectedBy(NWObject oTrapObject, NWObject oCreature)
        throws NotInContextException;
    public boolean getTrapDetectedBy(NWObject oTrapObject, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getTrapDisarmDC(NWObject oTrapObject)
        throws NotInContextException;
    public int getTrapDisarmDC(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getTrapDisarmable(NWObject oTrapObject)
        throws NotInContextException;
    public boolean getTrapDisarmable(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getTrapFlagged(NWObject oTrapObject)
        throws NotInContextException;
    public boolean getTrapFlagged(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String getTrapKeyTag(NWObject oTrapObject)
        throws NotInContextException;
    public String getTrapKeyTag(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getTrapOneShot(NWObject oTrapObject)
        throws NotInContextException;
    public boolean getTrapOneShot(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getTrapRecoverable(NWObject oTrapObject)
        throws NotInContextException;
    public boolean getTrapRecoverable(NWObject oTrapObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getTurnResistanceHD(NWObject oUndead)
        throws NotInContextException;
    public int getTurnResistanceHD(NWObject oUndead, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getUseableFlag(NWObject oObject)
        throws NotInContextException;
    public boolean getUseableFlag(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getUserDefinedEventNumber()
        throws NotInContextException;
    public int getUserDefinedEventNumber(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject getWaypointByTag(String sWaypointTag)
        throws NotInContextException;
    public NWObject getWaypointByTag(String sWaypointTag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean getWeaponRanged(NWObject oItem)
        throws NotInContextException;
    public boolean getWeaponRanged(NWObject oItem, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public Weather getWeather(NWObject oArea)
        throws NotInContextException;
    public Weather getWeather(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getWeight(NWObject oTarget)
        throws NotInContextException;
    public int getWeight(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getWillSavingThrow(NWObject oTarget)
        throws NotInContextException;
    public int getWillSavingThrow(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int getXP(NWObject oCreature)
        throws NotInContextException;
    public int getXP(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void giveGoldToCreature(NWObject oCreature, int nGP)
        throws NotInContextException;
    public void giveGoldToCreature(NWObject oCreature, int nGP, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void giveXPToCreature(NWObject oCreature, int nXpAmount)
        throws NotInContextException;
    public void giveXPToCreature(NWObject oCreature, int nXpAmount, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float hoursToSeconds(int nHours)
        throws NotInContextException;
    public float hoursToSeconds(int nHours, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void incrementRemainingFeatUses(NWObject oCreature, int nFeat)
        throws NotInContextException;
    public void incrementRemainingFeatUses(NWObject oCreature, int nFeat, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public boolean isInConversation(NWObject oObject)
        throws NotInContextException;
    public boolean isInConversation(NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyACBonus(int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyACBonus(int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyACBonusVsAlign(IPAlignGroup tIPAlignGroup, int nACBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyACBonusVsAlign(IPAlignGroup tIPAlignGroup, int nACBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyACBonusVsDmgType(IPDamageType tIPDamageType, int nACBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyACBonusVsDmgType(IPDamageType tIPDamageType, int nACBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyACBonusVsRace(IPRacialType tIPRacialType, int nACBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyACBonusVsRace(IPRacialType tIPRacialType, int nACBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyACBonusVsSAlign(Alignment tAlignment, int nACBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyACBonusVsSAlign(Alignment tAlignment, int nACBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyAbilityBonus(Ability tAbility, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyAbilityBonus(Ability tAbility, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyAdditional(int nAdditionalProperty)
        throws NotInContextException;
    public NWItemProperty itemPropertyAdditional(int nAdditionalProperty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyArcaneSpellFailure(int nModLevel)
        throws NotInContextException;
    public NWItemProperty itemPropertyArcaneSpellFailure(int nModLevel, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyAttackBonus(int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyAttackBonus(int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyAttackBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyAttackBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyAttackBonusVsRace(IPRacialType tIPRacialType, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyAttackBonusVsRace(IPRacialType tIPRacialType, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyAttackBonusVsSAlign(Alignment tAlignment, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyAttackBonusVsSAlign(Alignment tAlignment, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyAttackPenalty(int nPenalty)
        throws NotInContextException;
    public NWItemProperty itemPropertyAttackPenalty(int nPenalty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyBonusFeat(int nFeat)
        throws NotInContextException;
    public NWItemProperty itemPropertyBonusFeat(int nFeat, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyBonusLevelSpell(int nClass, int nSpellLevel)
        throws NotInContextException;
    public NWItemProperty itemPropertyBonusLevelSpell(int nClass, int nSpellLevel, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyBonusSavingThrow(int nBaseSaveType, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyBonusSavingThrow(int nBaseSaveType, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyBonusSavingThrowVsX(int nBonusType, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyBonusSavingThrowVsX(int nBonusType, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyBonusSpellResistance(int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyBonusSpellResistance(int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyCastSpell(int nSpell, int nNumUses)
        throws NotInContextException;
    public NWItemProperty itemPropertyCastSpell(int nSpell, int nNumUses, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyContainerReducedWeight(int nContainerType)
        throws NotInContextException;
    public NWItemProperty itemPropertyContainerReducedWeight(int nContainerType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDamageBonus(IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException;
    public NWItemProperty itemPropertyDamageBonus(IPDamageType tIPDamageType, int nDamage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDamageBonusVsAlign(IPAlignGroup tIPAlignGroup, IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException;
    public NWItemProperty itemPropertyDamageBonusVsAlign(IPAlignGroup tIPAlignGroup, IPDamageType tIPDamageType, int nDamage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDamageBonusVsRace(IPRacialType tIPRacialType, IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException;
    public NWItemProperty itemPropertyDamageBonusVsRace(IPRacialType tIPRacialType, IPDamageType tIPDamageType, int nDamage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDamageBonusVsSAlign(Alignment tAlignment, IPDamageType tIPDamageType, int nDamage)
        throws NotInContextException;
    public NWItemProperty itemPropertyDamageBonusVsSAlign(Alignment tAlignment, IPDamageType tIPDamageType, int nDamage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDamageImmunity(IPDamageType tIPDamageType, int nImmuneBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyDamageImmunity(IPDamageType tIPDamageType, int nImmuneBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDamagePenalty(int nPenalty)
        throws NotInContextException;
    public NWItemProperty itemPropertyDamagePenalty(int nPenalty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDamageReduction(int nEnhancement, int nHPSoak)
        throws NotInContextException;
    public NWItemProperty itemPropertyDamageReduction(int nEnhancement, int nHPSoak, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDamageResistance(IPDamageType tIPDamageType, int nHPResist)
        throws NotInContextException;
    public NWItemProperty itemPropertyDamageResistance(IPDamageType tIPDamageType, int nHPResist, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDamageVulnerability(IPDamageType tIPDamageType, int nVulnerability)
        throws NotInContextException;
    public NWItemProperty itemPropertyDamageVulnerability(IPDamageType tIPDamageType, int nVulnerability, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDarkvision()
        throws NotInContextException;
    public NWItemProperty itemPropertyDarkvision(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDecreaseAC(int nModifierType, int nPenalty)
        throws NotInContextException;
    public NWItemProperty itemPropertyDecreaseAC(int nModifierType, int nPenalty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDecreaseAbility(Ability tAbility, int nModifier)
        throws NotInContextException;
    public NWItemProperty itemPropertyDecreaseAbility(Ability tAbility, int nModifier, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyDecreaseSkill(int nSkill, int nPenalty)
        throws NotInContextException;
    public NWItemProperty itemPropertyDecreaseSkill(int nSkill, int nPenalty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyEnhancementBonus(int nEnhancementBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyEnhancementBonus(int nEnhancementBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyEnhancementBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyEnhancementBonusVsAlign(IPAlignGroup tIPAlignGroup, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyEnhancementBonusVsRace(IPRacialType tIPRacialType, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyEnhancementBonusVsRace(IPRacialType tIPRacialType, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyEnhancementBonusVsSAlign(Alignment tAlignment, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertyEnhancementBonusVsSAlign(Alignment tAlignment, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyEnhancementPenalty(int nPenalty)
        throws NotInContextException;
    public NWItemProperty itemPropertyEnhancementPenalty(int nPenalty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyExtraMeleeDamageType(IPDamageType tIPDamageType)
        throws NotInContextException;
    public NWItemProperty itemPropertyExtraMeleeDamageType(IPDamageType tIPDamageType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyExtraRangeDamageType(IPDamageType tIPDamageType)
        throws NotInContextException;
    public NWItemProperty itemPropertyExtraRangeDamageType(IPDamageType tIPDamageType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyFreeAction()
        throws NotInContextException;
    public NWItemProperty itemPropertyFreeAction(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyHaste()
        throws NotInContextException;
    public NWItemProperty itemPropertyHaste(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyHealersKit(int nModifier)
        throws NotInContextException;
    public NWItemProperty itemPropertyHealersKit(int nModifier, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyHolyAvenger()
        throws NotInContextException;
    public NWItemProperty itemPropertyHolyAvenger(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyImmunityMisc(IPMiscImmunityType tIPMiscImmunityType)
        throws NotInContextException;
    public NWItemProperty itemPropertyImmunityMisc(IPMiscImmunityType tIPMiscImmunityType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyImmunityToSpellLevel(int nLevel)
        throws NotInContextException;
    public NWItemProperty itemPropertyImmunityToSpellLevel(int nLevel, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyImprovedEvasion()
        throws NotInContextException;
    public NWItemProperty itemPropertyImprovedEvasion(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyKeen()
        throws NotInContextException;
    public NWItemProperty itemPropertyKeen(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyLight(int nBrightness, int nColor)
        throws NotInContextException;
    public NWItemProperty itemPropertyLight(int nBrightness, int nColor, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyLimitUseByAlign(IPAlignGroup tIPAlignGroup)
        throws NotInContextException;
    public NWItemProperty itemPropertyLimitUseByAlign(IPAlignGroup tIPAlignGroup, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyLimitUseByClass(int nClass)
        throws NotInContextException;
    public NWItemProperty itemPropertyLimitUseByClass(int nClass, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyLimitUseByRace(IPRacialType tIPRacialType)
        throws NotInContextException;
    public NWItemProperty itemPropertyLimitUseByRace(IPRacialType tIPRacialType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyLimitUseBySAlign(Alignment tAlignment)
        throws NotInContextException;
    public NWItemProperty itemPropertyLimitUseBySAlign(Alignment tAlignment, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyMassiveCritical(int nDamage)
        throws NotInContextException;
    public NWItemProperty itemPropertyMassiveCritical(int nDamage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyMaterial(int nMaterialType)
        throws NotInContextException;
    public NWItemProperty itemPropertyMaterial(int nMaterialType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyMaxRangeStrengthMod(int nModifier)
        throws NotInContextException;
    public NWItemProperty itemPropertyMaxRangeStrengthMod(int nModifier, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyMonsterDamage(int nDamage)
        throws NotInContextException;
    public NWItemProperty itemPropertyMonsterDamage(int nDamage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyNoDamage()
        throws NotInContextException;
    public NWItemProperty itemPropertyNoDamage(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyOnHitCastSpell(int nSpell, int nLevel)
        throws NotInContextException;
    public NWItemProperty itemPropertyOnHitCastSpell(int nSpell, int nLevel, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyOnHitProps(int nProperty, int nSaveDC, int nSpecial)
        throws NotInContextException;
    public NWItemProperty itemPropertyOnHitProps(int nProperty, int nSaveDC, int nSpecial, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyOnMonsterHitProperties(int nProperty, int nSpecial)
        throws NotInContextException;
    public NWItemProperty itemPropertyOnMonsterHitProperties(int nProperty, int nSpecial, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyQuality(int nQuality)
        throws NotInContextException;
    public NWItemProperty itemPropertyQuality(int nQuality, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyReducedSavingThrow(int nBonusType, int nPenalty)
        throws NotInContextException;
    public NWItemProperty itemPropertyReducedSavingThrow(int nBonusType, int nPenalty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyReducedSavingThrowVsX(int nBaseSaveType, int nPenalty)
        throws NotInContextException;
    public NWItemProperty itemPropertyReducedSavingThrowVsX(int nBaseSaveType, int nPenalty, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyRegeneration(int nRegenAmount)
        throws NotInContextException;
    public NWItemProperty itemPropertyRegeneration(int nRegenAmount, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertySkillBonus(int nSkill, int nBonus)
        throws NotInContextException;
    public NWItemProperty itemPropertySkillBonus(int nSkill, int nBonus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertySpecialWalk(int nWalkType)
        throws NotInContextException;
    public NWItemProperty itemPropertySpecialWalk(int nWalkType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertySpellImmunitySchool(IPSpellSchool tIPSpellSchool)
        throws NotInContextException;
    public NWItemProperty itemPropertySpellImmunitySchool(IPSpellSchool tIPSpellSchool, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertySpellImmunitySpecific(int nSpell)
        throws NotInContextException;
    public NWItemProperty itemPropertySpellImmunitySpecific(int nSpell, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyThievesTools(int nModifier)
        throws NotInContextException;
    public NWItemProperty itemPropertyThievesTools(int nModifier, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyTrap(int nTrapLevel, IPTrapType tIPTrapType)
        throws NotInContextException;
    public NWItemProperty itemPropertyTrap(int nTrapLevel, IPTrapType tIPTrapType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyTrueSeeing()
        throws NotInContextException;
    public NWItemProperty itemPropertyTrueSeeing(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyTurnResistance(int nModifier)
        throws NotInContextException;
    public NWItemProperty itemPropertyTurnResistance(int nModifier, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyUnlimitedAmmo(int nAmmoDamage)
        throws NotInContextException;
    public NWItemProperty itemPropertyUnlimitedAmmo(int nAmmoDamage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyVampiricRegeneration(int nRegenAmount)
        throws NotInContextException;
    public NWItemProperty itemPropertyVampiricRegeneration(int nRegenAmount, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyVisualEffect(int nEffect)
        throws NotInContextException;
    public NWItemProperty itemPropertyVisualEffect(int nEffect, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyWeightIncrease(int nWeight)
        throws NotInContextException;
    public NWItemProperty itemPropertyWeightIncrease(int nWeight, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWItemProperty itemPropertyWeightReduction(int nReduction)
        throws NotInContextException;
    public NWItemProperty itemPropertyWeightReduction(int nReduction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void jumpToLocation(NWLocation lDestination)
        throws NotInContextException;
    public void jumpToLocation(NWLocation lDestination, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void jumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint)
        throws NotInContextException;
    public void jumpToObject(NWObject oToJumpTo, boolean bWalkStraightLineToPoint, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int levelUpHenchman(NWObject oCreature, int nClass, boolean bReadyAllSpells, int nPackage)
        throws NotInContextException;
    public int levelUpHenchman(NWObject oCreature, int nClass, boolean bReadyAllSpells, int nPackage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int lineOfSightObject(NWObject oSource, NWObject oTarget)
        throws NotInContextException;
    public int lineOfSightObject(NWObject oSource, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int lineOfSightVector(NWVector vSource, NWVector vTarget)
        throws NotInContextException;
    public int lineOfSightVector(NWVector vSource, NWVector vTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void lockCameraDirection(NWObject oPlayer, boolean bLocked)
        throws NotInContextException;
    public void lockCameraDirection(NWObject oPlayer, boolean bLocked, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void lockCameraDistance(NWObject oPlayer, boolean bLocked)
        throws NotInContextException;
    public void lockCameraDistance(NWObject oPlayer, boolean bLocked, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void lockCameraPitch(NWObject oPlayer, boolean bLocked)
        throws NotInContextException;
    public void lockCameraPitch(NWObject oPlayer, boolean bLocked, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect magicalEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public NWEffect magicalEffect(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public void musicBackgroundChangeDay(NWObject oArea, int nTrack)
        throws NotInContextException;
    public void musicBackgroundChangeDay(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void musicBackgroundChangeNight(NWObject oArea, int nTrack)
        throws NotInContextException;
    public void musicBackgroundChangeNight(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int musicBackgroundGetBattleTrack(NWObject oArea)
        throws NotInContextException;
    public int musicBackgroundGetBattleTrack(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int musicBackgroundGetDayTrack(NWObject oArea)
        throws NotInContextException;
    public int musicBackgroundGetDayTrack(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int musicBackgroundGetNightTrack(NWObject oArea)
        throws NotInContextException;
    public int musicBackgroundGetNightTrack(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void musicBackgroundPlay(NWObject oArea)
        throws NotInContextException;
    public void musicBackgroundPlay(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void musicBackgroundSetDelay(NWObject oArea, int nDelay)
        throws NotInContextException;
    public void musicBackgroundSetDelay(NWObject oArea, int nDelay, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void musicBackgroundStop(NWObject oArea)
        throws NotInContextException;
    public void musicBackgroundStop(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void musicBattleChange(NWObject oArea, int nTrack)
        throws NotInContextException;
    public void musicBattleChange(NWObject oArea, int nTrack, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void musicBattlePlay(NWObject oArea)
        throws NotInContextException;
    public void musicBattlePlay(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void musicBattleStop(NWObject oArea)
        throws NotInContextException;
    public void musicBattleStop(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void nightToDay(NWObject oPlayer, float fTransitionTime)
        throws NotInContextException;
    public void nightToDay(NWObject oPlayer, float fTransitionTime, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void openInventory(NWObject oCreature, NWObject oPlayer)
        throws NotInContextException;
    public void openInventory(NWObject oCreature, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void openStore(NWObject oStore, NWObject oPC, int nBonusMarkUp, int nBonusMarkDown)
        throws NotInContextException;
    public void openStore(NWObject oStore, NWObject oPC, int nBonusMarkUp, int nBonusMarkDown, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void playAnimation(int nAnimation, float fSpeed, float fSeconds)
        throws NotInContextException;
    public void playAnimation(int nAnimation, float fSpeed, float fSeconds, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void playSound(String sSoundName)
        throws NotInContextException;
    public void playSound(String sSoundName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void playSoundByStrRef(int nStrRef, int nRunAsAction)
        throws NotInContextException;
    public void playSoundByStrRef(int nStrRef, int nRunAsAction, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void playVoiceChat(int nVoiceChatID, NWObject oTarget)
        throws NotInContextException;
    public void playVoiceChat(int nVoiceChatID, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void popUpDeathGUIPanel(NWObject oPC, boolean bRespawnButtonEnabled, boolean bWaitForHelpButtonEnabled, int nHelpStringReference, String sHelpString)
        throws NotInContextException;
    public void popUpDeathGUIPanel(NWObject oPC, boolean bRespawnButtonEnabled, boolean bWaitForHelpButtonEnabled, int nHelpStringReference, String sHelpString, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void popUpGUIPanel(NWObject oPC, int nGUIPanel)
        throws NotInContextException;
    public void popUpGUIPanel(NWObject oPC, int nGUIPanel, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public String randomName(int nNameType)
        throws NotInContextException;
    public String randomName(int nNameType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void recomputeStaticLighting(NWObject oArea)
        throws NotInContextException;
    public void recomputeStaticLighting(NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public SavingThrowResult reflexSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException;
    public SavingThrowResult reflexSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void removeEffect(NWObject oCreature, NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public void removeEffect(NWObject oCreature, NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public void removeFromParty(NWObject oPC)
        throws NotInContextException;
    public void removeFromParty(NWObject oPC, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void removeHenchman(NWObject oMaster, NWObject oHenchman)
        throws NotInContextException;
    public void removeHenchman(NWObject oMaster, NWObject oHenchman, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void removeItemProperty(NWObject oItem, NWItemProperty ipProperty)
        throws InvalidItemPropertyException,
               NotInContextException;
    public void removeItemProperty(NWObject oItem, NWItemProperty ipProperty, java.util.Map<String, String> __ctx)
        throws InvalidItemPropertyException,
               NotInContextException;

    public void removeJournalQuestEntry(String szPlotID, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers)
        throws NotInContextException;
    public void removeJournalQuestEntry(String szPlotID, NWObject oCreature, boolean bAllPartyMembers, boolean bAllPlayers, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void removeSummonedAssociate(NWObject oMaster, NWObject oAssociate)
        throws NotInContextException;
    public void removeSummonedAssociate(NWObject oMaster, NWObject oAssociate, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int resistSpell(NWObject oCaster, NWObject oTarget)
        throws NotInContextException;
    public int resistSpell(NWObject oCaster, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void restoreBaseAttackBonus(NWObject oCreature)
        throws NotInContextException;
    public void restoreBaseAttackBonus(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void restoreCameraFacing()
        throws NotInContextException;
    public void restoreCameraFacing(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWObject retrieveCampaignObject(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oOwner, NWObject oPlayer)
        throws NotInContextException;
    public NWObject retrieveCampaignObject(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oOwner, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float roundsToSeconds(int nRounds)
        throws NotInContextException;
    public float roundsToSeconds(int nRounds, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void sendMessageToAllDMs(String szMessage)
        throws NotInContextException;
    public void sendMessageToAllDMs(String szMessage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void sendMessageToPC(NWObject oPlayer, String szMessage)
        throws NotInContextException;
    public void sendMessageToPC(NWObject oPlayer, String szMessage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void sendMessageToPCByStrRef(NWObject oPlayer, int nStrRef)
        throws NotInContextException;
    public void sendMessageToPCByStrRef(NWObject oPlayer, int nStrRef, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setAILevel(NWObject oTarget, AILevel tAILevel)
        throws NotInContextException;
    public void setAILevel(NWObject oTarget, AILevel tAILevel, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setActionMode(NWObject oCreature, ActionMode tActionMode, boolean bStatus)
        throws NotInContextException;
    public void setActionMode(NWObject oCreature, ActionMode tActionMode, boolean bStatus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setAreaTransitionBMP(int nPredefinedAreaTransition, String sCustomAreaTransitionBMP)
        throws NotInContextException;
    public void setAreaTransitionBMP(int nPredefinedAreaTransition, String sCustomAreaTransitionBMP, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setAssociateListenPatterns(NWObject oTarget)
        throws NotInContextException;
    public void setAssociateListenPatterns(NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setBaseAttackBonus(int nBaseAttackBonus, NWObject oCreature)
        throws NotInContextException;
    public void setBaseAttackBonus(int nBaseAttackBonus, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCalendar(int nYear, int nMonth, int nDay)
        throws NotInContextException;
    public void setCalendar(int nYear, int nMonth, int nDay, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCameraFacing(float fDirection, float fDistance, float fPitch, int nTransitionType)
        throws NotInContextException;
    public void setCameraFacing(float fDirection, float fDistance, float fPitch, int nTransitionType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCameraHeight(NWObject oPlayer, float fHeight)
        throws NotInContextException;
    public void setCameraHeight(NWObject oPlayer, float fHeight, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCameraMode(NWObject oPlayer, int nCameraMode)
        throws NotInContextException;
    public void setCameraMode(NWObject oPlayer, int nCameraMode, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCampaignFloat(String sCampaignName, String sVarName, float flFloat, NWObject oPlayer)
        throws NotInContextException;
    public void setCampaignFloat(String sCampaignName, String sVarName, float flFloat, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCampaignInt(String sCampaignName, String sVarName, int nInt, NWObject oPlayer)
        throws NotInContextException;
    public void setCampaignInt(String sCampaignName, String sVarName, int nInt, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCampaignLocation(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oPlayer)
        throws NotInContextException;
    public void setCampaignLocation(String sCampaignName, String sVarName, NWLocation locLocation, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCampaignString(String sCampaignName, String sVarName, String sString, NWObject oPlayer)
        throws NotInContextException;
    public void setCampaignString(String sCampaignName, String sVarName, String sString, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCampaignVector(String sCampaignName, String sVarName, NWVector vVector, NWObject oPlayer)
        throws NotInContextException;
    public void setCampaignVector(String sCampaignName, String sVarName, NWVector vVector, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setColor(NWObject oObject, int nColorChannel, int nColorValue)
        throws NotInContextException;
    public void setColor(NWObject oObject, int nColorChannel, int nColorValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCommandable(boolean bCommandable, NWObject oTarget)
        throws NotInContextException;
    public void setCommandable(boolean bCommandable, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCreatureAppearanceType(NWObject oCreature, int nAppearanceType)
        throws NotInContextException;
    public void setCreatureAppearanceType(NWObject oCreature, int nAppearanceType, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCreatureBodyPart(CreaturePart tCreaturePart, int nModelNumber, NWObject oCreature)
        throws NotInContextException;
    public void setCreatureBodyPart(CreaturePart tCreaturePart, int nModelNumber, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCreatureTailType(int nTailType, NWObject oCreature)
        throws NotInContextException;
    public void setCreatureTailType(int nTailType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCreatureWingType(int nWingType, NWObject oCreature)
        throws NotInContextException;
    public void setCreatureWingType(int nWingType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCustomToken(int nCustomTokenNumber, String sTokenValue)
        throws NotInContextException;
    public void setCustomToken(int nCustomTokenNumber, String sTokenValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCutsceneCameraMoveRate(NWObject oCreature, float fRate)
        throws NotInContextException;
    public void setCutsceneCameraMoveRate(NWObject oCreature, float fRate, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setCutsceneMode(NWObject oCreature, boolean bInCutscene, boolean bLeftClickingEnabled)
        throws NotInContextException;
    public void setCutsceneMode(NWObject oCreature, boolean bInCutscene, boolean bLeftClickingEnabled, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setDeity(NWObject oCreature, String sDeity)
        throws NotInContextException;
    public void setDeity(NWObject oCreature, String sDeity, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setDescription(NWObject oObject, String sNewDescription, boolean bIdentifiedDescription)
        throws NotInContextException;
    public void setDescription(NWObject oObject, String sNewDescription, boolean bIdentifiedDescription, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setDroppableFlag(NWObject oItem, boolean bDroppable)
        throws NotInContextException;
    public void setDroppableFlag(NWObject oItem, boolean bDroppable, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setEncounterActive(boolean bNewValue, NWObject oEncounter)
        throws NotInContextException;
    public void setEncounterActive(boolean bNewValue, NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setEncounterDifficulty(int nEncounterDifficulty, NWObject oEncounter)
        throws NotInContextException;
    public void setEncounterDifficulty(int nEncounterDifficulty, NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setEncounterSpawnsCurrent(int nNewValue, NWObject oEncounter)
        throws NotInContextException;
    public void setEncounterSpawnsCurrent(int nNewValue, NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setEncounterSpawnsMax(int nNewValue, NWObject oEncounter)
        throws NotInContextException;
    public void setEncounterSpawnsMax(int nNewValue, NWObject oEncounter, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setFacing(float fDirection)
        throws NotInContextException;
    public void setFacing(float fDirection, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setFacingPoint(NWVector vTarget)
        throws NotInContextException;
    public void setFacingPoint(NWVector vTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setFogAmount(int nFogType, int nFogAmount, NWObject oArea)
        throws NotInContextException;
    public void setFogAmount(int nFogType, int nFogAmount, NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setFogColor(int nFogType, int nFogColor, NWObject oArea)
        throws NotInContextException;
    public void setFogColor(int nFogType, int nFogColor, NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setFootstepType(int nFootstepType, NWObject oCreature)
        throws NotInContextException;
    public void setFootstepType(int nFootstepType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setFortitudeSavingThrow(NWObject oObject, int nFortitudeSave)
        throws NotInContextException;
    public void setFortitudeSavingThrow(NWObject oObject, int nFortitudeSave, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setHardness(int nHardness, NWObject oObject)
        throws NotInContextException;
    public void setHardness(int nHardness, NWObject oObject, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setIdentified(NWObject oItem, boolean bIdentified)
        throws NotInContextException;
    public void setIdentified(NWObject oItem, boolean bIdentified, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setImmortal(NWObject oCreature, boolean bImmortal)
        throws NotInContextException;
    public void setImmortal(NWObject oCreature, boolean bImmortal, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setInfiniteFlag(NWObject oItem, boolean bInfinite)
        throws NotInContextException;
    public void setInfiniteFlag(NWObject oItem, boolean bInfinite, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setIsDestroyable(boolean bDestroyable, boolean bRaiseable, boolean bSelectableWhenDead)
        throws NotInContextException;
    public void setIsDestroyable(boolean bDestroyable, boolean bRaiseable, boolean bSelectableWhenDead, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setIsTemporaryEnemy(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds)
        throws NotInContextException;
    public void setIsTemporaryEnemy(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setIsTemporaryFriend(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds)
        throws NotInContextException;
    public void setIsTemporaryFriend(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setIsTemporaryNeutral(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds)
        throws NotInContextException;
    public void setIsTemporaryNeutral(NWObject oTarget, NWObject oSource, boolean bDecays, float fDurationInSeconds, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setItemCharges(NWObject oItem, int nCharges)
        throws NotInContextException;
    public void setItemCharges(NWObject oItem, int nCharges, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setItemCursedFlag(NWObject oItem, boolean bCursed)
        throws NotInContextException;
    public void setItemCursedFlag(NWObject oItem, boolean bCursed, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setItemStackSize(NWObject oItem, int nSize)
        throws NotInContextException;
    public void setItemStackSize(NWObject oItem, int nSize, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setKeyRequiredFeedback(NWObject oObject, String sFeedbackMessage)
        throws NotInContextException;
    public void setKeyRequiredFeedback(NWObject oObject, String sFeedbackMessage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setListenPattern(NWObject oObject, String sPattern, int nNumber)
        throws NotInContextException;
    public void setListenPattern(NWObject oObject, String sPattern, int nNumber, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setListening(NWObject oObject, boolean bValue)
        throws NotInContextException;
    public void setListening(NWObject oObject, boolean bValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLocalFloat(NWObject oObject, String sVarName, float fValue)
        throws NotInContextException;
    public void setLocalFloat(NWObject oObject, String sVarName, float fValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLocalInt(NWObject oObject, String sVarName, int nValue)
        throws NotInContextException;
    public void setLocalInt(NWObject oObject, String sVarName, int nValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLocalLocation(NWObject oObject, String sVarName, NWLocation lValue)
        throws NotInContextException;
    public void setLocalLocation(NWObject oObject, String sVarName, NWLocation lValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLocalObject(NWObject oObject, String sVarName, NWObject oValue)
        throws NotInContextException;
    public void setLocalObject(NWObject oObject, String sVarName, NWObject oValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLocalString(NWObject oObject, String sVarName, String sValue)
        throws NotInContextException;
    public void setLocalString(NWObject oObject, String sVarName, String sValue, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLockKeyRequired(NWObject oObject, boolean bKeyRequired)
        throws NotInContextException;
    public void setLockKeyRequired(NWObject oObject, boolean bKeyRequired, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLockKeyTag(NWObject oObject, String sNewKeyTag)
        throws NotInContextException;
    public void setLockKeyTag(NWObject oObject, String sNewKeyTag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLockLockDC(NWObject oObject, int nNewLockDC)
        throws NotInContextException;
    public void setLockLockDC(NWObject oObject, int nNewLockDC, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLockLockable(NWObject oObject, boolean bLockable)
        throws NotInContextException;
    public void setLockLockable(NWObject oObject, boolean bLockable, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLockUnlockDC(NWObject oObject, int nNewUnlockDC)
        throws NotInContextException;
    public void setLockUnlockDC(NWObject oObject, int nNewUnlockDC, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLocked(NWObject oTarget, boolean bLocked)
        throws NotInContextException;
    public void setLocked(NWObject oTarget, boolean bLocked, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setLootable(NWObject oCreature, boolean bLootable)
        throws NotInContextException;
    public void setLootable(NWObject oCreature, boolean bLootable, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setMapPinEnabled(NWObject oMapPin, boolean bEnabled)
        throws NotInContextException;
    public void setMapPinEnabled(NWObject oMapPin, boolean bEnabled, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setMaxHenchmen(int nNumHenchmen)
        throws NotInContextException;
    public void setMaxHenchmen(int nNumHenchmen, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setModuleXPScale(int nXPScale)
        throws NotInContextException;
    public void setModuleXPScale(int nXPScale, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setName(NWObject oObject, String sNewName)
        throws NotInContextException;
    public void setName(NWObject oObject, String sNewName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPCChatMessage(String sNewChatMessage)
        throws NotInContextException;
    public void setPCChatMessage(String sNewChatMessage, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPCChatVolume(TalkVolume tTalkVolume)
        throws NotInContextException;
    public void setPCChatVolume(TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPCDislike(NWObject oPlayer, NWObject oTarget)
        throws NotInContextException;
    public void setPCDislike(NWObject oPlayer, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPCLike(NWObject oPlayer, NWObject oTarget)
        throws NotInContextException;
    public void setPCLike(NWObject oPlayer, NWObject oTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPanelButtonFlash(NWObject oPlayer, Button tButton, boolean bEnableFlash)
        throws NotInContextException;
    public void setPanelButtonFlash(NWObject oPlayer, Button tButton, boolean bEnableFlash, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPhenoType(PhenoType tPhenoType, NWObject oCreature)
        throws NotInContextException;
    public void setPhenoType(PhenoType tPhenoType, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPickpocketableFlag(NWObject oItem, boolean bPickpocketable)
        throws NotInContextException;
    public void setPickpocketableFlag(NWObject oItem, boolean bPickpocketable, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPlaceableIllumination(NWObject oPlaceable, boolean bIlluminate)
        throws NotInContextException;
    public void setPlaceableIllumination(NWObject oPlaceable, boolean bIlluminate, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPlotFlag(NWObject oTarget, boolean bPlotFlag)
        throws NotInContextException;
    public void setPlotFlag(NWObject oTarget, boolean bPlotFlag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPortraitId(NWObject oTarget, int nPortraitId)
        throws NotInContextException;
    public void setPortraitId(NWObject oTarget, int nPortraitId, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setPortraitResRef(NWObject oTarget, String sPortraitResRef)
        throws NotInContextException;
    public void setPortraitResRef(NWObject oTarget, String sPortraitResRef, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setReflexSavingThrow(NWObject oObject, int nReflexSave)
        throws NotInContextException;
    public void setReflexSavingThrow(NWObject oObject, int nReflexSave, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setSkyBox(int nSkyBox, NWObject oArea)
        throws NotInContextException;
    public void setSkyBox(int nSkyBox, NWObject oArea, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setStandardFactionReputation(StandardFaction tStandardFaction, int nNewReputation, NWObject oCreature)
        throws NotInContextException;
    public void setStandardFactionReputation(StandardFaction tStandardFaction, int nNewReputation, NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setStolenFlag(NWObject oItem, boolean bStolenFlag)
        throws NotInContextException;
    public void setStolenFlag(NWObject oItem, boolean bStolenFlag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setStoreGold(NWObject oidStore, int nGold)
        throws NotInContextException;
    public void setStoreGold(NWObject oidStore, int nGold, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setStoreIdentifyCost(NWObject oidStore, int nCost)
        throws NotInContextException;
    public void setStoreIdentifyCost(NWObject oidStore, int nCost, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setStoreMaxBuyPrice(NWObject oidStore, int nMaxBuy)
        throws NotInContextException;
    public void setStoreMaxBuyPrice(NWObject oidStore, int nMaxBuy, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setSubRace(NWObject oCreature, String sSubRace)
        throws NotInContextException;
    public void setSubRace(NWObject oCreature, String sSubRace, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTileMainLightColor(NWLocation lTileLocation, TileMainLightColor nMainLight1Color, TileMainLightColor nMainLight2Color)
        throws NotInContextException;
    public void setTileMainLightColor(NWLocation lTileLocation, TileMainLightColor nMainLight1Color, TileMainLightColor nMainLight2Color, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTileSourceLightColor(NWLocation lTileLocation, TileSourceLightColor nSourceLight1Color, TileSourceLightColor nSourceLight2Color)
        throws NotInContextException;
    public void setTileSourceLightColor(NWLocation lTileLocation, TileSourceLightColor nSourceLight1Color, TileSourceLightColor nSourceLight2Color, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTime(int nHour, int nMinute, int nSecond, int nMillisecond)
        throws NotInContextException;
    public void setTime(int nHour, int nMinute, int nSecond, int nMillisecond, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTrapActive(NWObject oTrapObject, boolean bActive)
        throws NotInContextException;
    public void setTrapActive(NWObject oTrapObject, boolean bActive, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTrapDetectDC(NWObject oTrapObject, int nDetectDC)
        throws NotInContextException;
    public void setTrapDetectDC(NWObject oTrapObject, int nDetectDC, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTrapDetectable(NWObject oTrapObject, boolean bDetectable)
        throws NotInContextException;
    public void setTrapDetectable(NWObject oTrapObject, boolean bDetectable, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int setTrapDetectedBy(NWObject oTrap, NWObject oDetector, boolean bDetected)
        throws NotInContextException;
    public int setTrapDetectedBy(NWObject oTrap, NWObject oDetector, boolean bDetected, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTrapDisabled(NWObject oTrap)
        throws NotInContextException;
    public void setTrapDisabled(NWObject oTrap, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTrapDisarmDC(NWObject oTrapObject, int nDisarmDC)
        throws NotInContextException;
    public void setTrapDisarmDC(NWObject oTrapObject, int nDisarmDC, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTrapDisarmable(NWObject oTrapObject, boolean bDisarmable)
        throws NotInContextException;
    public void setTrapDisarmable(NWObject oTrapObject, boolean bDisarmable, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTrapKeyTag(NWObject oTrapObject, String sKeyTag)
        throws NotInContextException;
    public void setTrapKeyTag(NWObject oTrapObject, String sKeyTag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTrapOneShot(NWObject oTrapObject, boolean bOneShot)
        throws NotInContextException;
    public void setTrapOneShot(NWObject oTrapObject, boolean bOneShot, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setTrapRecoverable(NWObject oTrapObject, boolean bRecoverable)
        throws NotInContextException;
    public void setTrapRecoverable(NWObject oTrapObject, boolean bRecoverable, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setUseableFlag(NWObject oPlaceable, boolean bUseableFlag)
        throws NotInContextException;
    public void setUseableFlag(NWObject oPlaceable, boolean bUseableFlag, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setWeather(NWObject oTarget, Weather tWeather)
        throws NotInContextException;
    public void setWeather(NWObject oTarget, Weather tWeather, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setWillSavingThrow(NWObject oObject, int nWillSave)
        throws NotInContextException;
    public void setWillSavingThrow(NWObject oObject, int nWillSave, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void setXP(NWObject oCreature, int nXpAmount)
        throws NotInContextException;
    public void setXP(NWObject oCreature, int nXpAmount, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void soundObjectPlay(NWObject oSound)
        throws NotInContextException;
    public void soundObjectPlay(NWObject oSound, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void soundObjectSetPosition(NWObject oSound, NWVector vPosition)
        throws NotInContextException;
    public void soundObjectSetPosition(NWObject oSound, NWVector vPosition, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void soundObjectSetVolume(NWObject oSound, int nVolume)
        throws NotInContextException;
    public void soundObjectSetVolume(NWObject oSound, int nVolume, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void soundObjectStop(NWObject oSound)
        throws NotInContextException;
    public void soundObjectStop(NWObject oSound, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void speakOneLinerConversation(String sDialogResRef, NWObject oTokenTarget)
        throws NotInContextException;
    public void speakOneLinerConversation(String sDialogResRef, NWObject oTokenTarget, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void speakString(String sStringToSpeak, TalkVolume tTalkVolume)
        throws NotInContextException;
    public void speakString(String sStringToSpeak, TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void speakStringByStrRef(int nStrRef, TalkVolume tTalkVolume)
        throws NotInContextException;
    public void speakStringByStrRef(int nStrRef, TalkVolume tTalkVolume, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void startNewModule(String sModuleName)
        throws NotInContextException;
    public void startNewModule(String sModuleName, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void stopFade(NWObject oCreature)
        throws NotInContextException;
    public void stopFade(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void storeCameraFacing()
        throws NotInContextException;
    public void storeCameraFacing(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public int storeCampaignObject(String sCampaignName, String sVarName, NWObject oObject, NWObject oPlayer)
        throws NotInContextException;
    public int storeCampaignObject(String sCampaignName, String sVarName, NWObject oObject, NWObject oPlayer, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void summonAnimalCompanion(NWObject oMaster)
        throws NotInContextException;
    public void summonAnimalCompanion(NWObject oMaster, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void summonFamiliar(NWObject oMaster)
        throws NotInContextException;
    public void summonFamiliar(NWObject oMaster, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect supernaturalEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public NWEffect supernaturalEffect(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public void surrenderToEnemies()
        throws NotInContextException;
    public void surrenderToEnemies(java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void takeGoldFromCreature(int nAmount, NWObject oCreatureToTakeFrom, boolean bDestroy)
        throws NotInContextException;
    public void takeGoldFromCreature(int nAmount, NWObject oCreatureToTakeFrom, boolean bDestroy, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public AttackResult touchAttackMelee(NWObject oTarget, boolean bDisplayFeedback)
        throws NotInContextException;
    public AttackResult touchAttackMelee(NWObject oTarget, boolean bDisplayFeedback, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public AttackResult touchAttackRanged(NWObject oTarget, boolean bDisplayFeedback)
        throws NotInContextException;
    public AttackResult touchAttackRanged(NWObject oTarget, boolean bDisplayFeedback, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float turnsToSeconds(int nTurns)
        throws NotInContextException;
    public float turnsToSeconds(int nTurns, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void unpossessFamiliar(NWObject oCreature)
        throws NotInContextException;
    public void unpossessFamiliar(NWObject oCreature, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float vectorMagnitude(NWVector vVector)
        throws NotInContextException;
    public float vectorMagnitude(NWVector vVector, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWVector vectorNormalize(NWVector vVector)
        throws NotInContextException;
    public NWVector vectorNormalize(NWVector vVector, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public float vectorToAngle(NWVector vVector)
        throws NotInContextException;
    public float vectorToAngle(NWVector vVector, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public NWEffect versusAlignmentEffect(NWEffect eEffect, int nLawChaos, int nGoodEvil)
        throws InvalidEffectException,
               NotInContextException;
    public NWEffect versusAlignmentEffect(NWEffect eEffect, int nLawChaos, int nGoodEvil, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public NWEffect versusRacialTypeEffect(NWEffect eEffect, RacialType tRacialType)
        throws InvalidEffectException,
               NotInContextException;
    public NWEffect versusRacialTypeEffect(NWEffect eEffect, RacialType tRacialType, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public NWEffect versusTrapEffect(NWEffect eEffect)
        throws InvalidEffectException,
               NotInContextException;
    public NWEffect versusTrapEffect(NWEffect eEffect, java.util.Map<String, String> __ctx)
        throws InvalidEffectException,
               NotInContextException;

    public SavingThrowResult willSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus)
        throws NotInContextException;
    public SavingThrowResult willSave(NWObject oCreature, int nDC, SaveType tSaveType, NWObject oSaveVersus, java.util.Map<String, String> __ctx)
        throws NotInContextException;

    public void writeTimestampedLogEntry(String sLogEntry)
        throws NotInContextException;
    public void writeTimestampedLogEntry(String sLogEntry, java.util.Map<String, String> __ctx)
        throws NotInContextException;
}
