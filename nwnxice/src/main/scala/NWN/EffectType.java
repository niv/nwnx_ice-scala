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

public enum EffectType implements java.io.Serializable
{
    InvalidEffect,
    DamageResistanceEffect,
    RegenerateEffect,
    DamageReductionEffect,
    TemporaryHitpointsEffect,
    EntangleEffect,
    InvulnerableEffect,
    DeafEffect,
    ResurrectionEffect,
    ImmunityEffect,
    EnemyAttackBonusEffect,
    ArcaneSpellFailureEffect,
    AreaOfEffectEffect,
    BeamEffect,
    CharmedEffect,
    ConfusedEffect,
    FrightenedEffect,
    DominatedEffect,
    ParalyzeEffect,
    DazedEffect,
    StunnedEffect,
    SleepEffect,
    PoisonEffect,
    DiseaseEffect,
    CurseEffect,
    SilenceEffect,
    TurnedEffect,
    HasteEffect,
    SlowEffect,
    AbilityIncreaseEffect,
    AbilityDecreaseEffect,
    AttackIncreaseEffect,
    AttackDecreaseEffect,
    DamageIncreaseEffect,
    DamageDecreaseEffect,
    DamageImmunityIncreaseEffect,
    DamageImmunityDecreaseEffect,
    ACIncreaseEffect,
    ACDecreaseEffect,
    MovementSpeedIncreaseEffect,
    MovementSpeedDecreaseEffect,
    SavingThrowIncreaseEffect,
    SavingThrowDecreaseEffect,
    SpellResistanceIncreaseEffect,
    SpellResistanceDecreaseEffect,
    SkillIncreaseEffect,
    SkillDecreaseEffect,
    InvisibilityEffect,
    ImprovedInvisibilityEffect,
    DarknessEffect,
    DispelMagicAllEffect,
    ElementalShieldEffect,
    NegativeLevelEffect,
    PolymorphEffect,
    SanctuaryEffect,
    TrueSeeingEffect,
    SeeInvisibleEffect,
    TimestopEffect,
    BlindnessEffect,
    SpellLevelAbsorptionEffect,
    DispelMagicBestEffect,
    UltravisionEffect,
    MissChanceEffect,
    ConcealmentEffect,
    SpellImmunityEffect,
    VisualEffect,
    DisappearAppearEffect,
    SwarmEffect,
    TurnResistanceDecreaseEffect,
    TurnResistanceIncreaseEffect,
    PetrifyEffect,
    CutsceneParalyzeEffect,
    EtherealEffect,
    SpellFailureEffect,
    CutsceneGhostEffect,
    CutsceneImmobilizeEffect;

    public static final int _InvalidEffect = 0;
    public static final int _DamageResistanceEffect = 1;
    public static final int _RegenerateEffect = 2;
    public static final int _DamageReductionEffect = 3;
    public static final int _TemporaryHitpointsEffect = 4;
    public static final int _EntangleEffect = 5;
    public static final int _InvulnerableEffect = 6;
    public static final int _DeafEffect = 7;
    public static final int _ResurrectionEffect = 8;
    public static final int _ImmunityEffect = 9;
    public static final int _EnemyAttackBonusEffect = 10;
    public static final int _ArcaneSpellFailureEffect = 11;
    public static final int _AreaOfEffectEffect = 12;
    public static final int _BeamEffect = 13;
    public static final int _CharmedEffect = 14;
    public static final int _ConfusedEffect = 15;
    public static final int _FrightenedEffect = 16;
    public static final int _DominatedEffect = 17;
    public static final int _ParalyzeEffect = 18;
    public static final int _DazedEffect = 19;
    public static final int _StunnedEffect = 20;
    public static final int _SleepEffect = 21;
    public static final int _PoisonEffect = 22;
    public static final int _DiseaseEffect = 23;
    public static final int _CurseEffect = 24;
    public static final int _SilenceEffect = 25;
    public static final int _TurnedEffect = 26;
    public static final int _HasteEffect = 27;
    public static final int _SlowEffect = 28;
    public static final int _AbilityIncreaseEffect = 29;
    public static final int _AbilityDecreaseEffect = 30;
    public static final int _AttackIncreaseEffect = 31;
    public static final int _AttackDecreaseEffect = 32;
    public static final int _DamageIncreaseEffect = 33;
    public static final int _DamageDecreaseEffect = 34;
    public static final int _DamageImmunityIncreaseEffect = 35;
    public static final int _DamageImmunityDecreaseEffect = 36;
    public static final int _ACIncreaseEffect = 37;
    public static final int _ACDecreaseEffect = 38;
    public static final int _MovementSpeedIncreaseEffect = 39;
    public static final int _MovementSpeedDecreaseEffect = 40;
    public static final int _SavingThrowIncreaseEffect = 41;
    public static final int _SavingThrowDecreaseEffect = 42;
    public static final int _SpellResistanceIncreaseEffect = 43;
    public static final int _SpellResistanceDecreaseEffect = 44;
    public static final int _SkillIncreaseEffect = 45;
    public static final int _SkillDecreaseEffect = 46;
    public static final int _InvisibilityEffect = 47;
    public static final int _ImprovedInvisibilityEffect = 48;
    public static final int _DarknessEffect = 49;
    public static final int _DispelMagicAllEffect = 50;
    public static final int _ElementalShieldEffect = 51;
    public static final int _NegativeLevelEffect = 52;
    public static final int _PolymorphEffect = 53;
    public static final int _SanctuaryEffect = 54;
    public static final int _TrueSeeingEffect = 55;
    public static final int _SeeInvisibleEffect = 56;
    public static final int _TimestopEffect = 57;
    public static final int _BlindnessEffect = 58;
    public static final int _SpellLevelAbsorptionEffect = 59;
    public static final int _DispelMagicBestEffect = 60;
    public static final int _UltravisionEffect = 61;
    public static final int _MissChanceEffect = 62;
    public static final int _ConcealmentEffect = 63;
    public static final int _SpellImmunityEffect = 64;
    public static final int _VisualEffect = 65;
    public static final int _DisappearAppearEffect = 66;
    public static final int _SwarmEffect = 67;
    public static final int _TurnResistanceDecreaseEffect = 68;
    public static final int _TurnResistanceIncreaseEffect = 69;
    public static final int _PetrifyEffect = 70;
    public static final int _CutsceneParalyzeEffect = 71;
    public static final int _EtherealEffect = 72;
    public static final int _SpellFailureEffect = 73;
    public static final int _CutsceneGhostEffect = 74;
    public static final int _CutsceneImmobilizeEffect = 75;

    public static EffectType
    convert(int val)
    {
        assert val >= 0 && val < 76;
        return values()[val];
    }

    public static EffectType
    convert(String val)
    {
        try
        {
            return valueOf(val);
        }
        catch(java.lang.IllegalArgumentException ex)
        {
            return null;
        }
    }

    public int
    value()
    {
        return ordinal();
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeByte((byte)value());
    }

    public static EffectType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(76);
        return EffectType.convert(__v);
    }
}
