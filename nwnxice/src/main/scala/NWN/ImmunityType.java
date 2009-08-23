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

public enum ImmunityType implements java.io.Serializable
{
    NoneImmunity,
    MindSpellsImmunity,
    PoisonImmunity,
    DiseaseImmunity,
    FearImmunity,
    TrapImmunity,
    ParalysisImmunity,
    BlindnessImmunity,
    DeafnessImmunity,
    SlowImmunity,
    EntangleImmunity,
    SilenceImmunity,
    StunImmunity,
    SleepImmunity,
    CharmImmunity,
    DominateImmunity,
    ConfusedImmunity,
    CursedImmunity,
    DazedImmunity,
    AbilityDecreaseImmunity,
    AttackDecreaseImmunity,
    DamageDecreaseImmunity,
    DamageImmunityDecreaseImmunity,
    AcDecreaseImmunity,
    MovementSpeedDecreaseImmunity,
    SavingThrowDecreaseImmunity,
    SpellResistanceDecreaseImmunity,
    SkillDecreaseImmunity,
    KnockdownImmunity,
    NegativeLevelImmunity,
    SneakAttackImmunity,
    CriticalHitImmunity,
    DeathImmunity;

    public static final int _NoneImmunity = 0;
    public static final int _MindSpellsImmunity = 1;
    public static final int _PoisonImmunity = 2;
    public static final int _DiseaseImmunity = 3;
    public static final int _FearImmunity = 4;
    public static final int _TrapImmunity = 5;
    public static final int _ParalysisImmunity = 6;
    public static final int _BlindnessImmunity = 7;
    public static final int _DeafnessImmunity = 8;
    public static final int _SlowImmunity = 9;
    public static final int _EntangleImmunity = 10;
    public static final int _SilenceImmunity = 11;
    public static final int _StunImmunity = 12;
    public static final int _SleepImmunity = 13;
    public static final int _CharmImmunity = 14;
    public static final int _DominateImmunity = 15;
    public static final int _ConfusedImmunity = 16;
    public static final int _CursedImmunity = 17;
    public static final int _DazedImmunity = 18;
    public static final int _AbilityDecreaseImmunity = 19;
    public static final int _AttackDecreaseImmunity = 20;
    public static final int _DamageDecreaseImmunity = 21;
    public static final int _DamageImmunityDecreaseImmunity = 22;
    public static final int _AcDecreaseImmunity = 23;
    public static final int _MovementSpeedDecreaseImmunity = 24;
    public static final int _SavingThrowDecreaseImmunity = 25;
    public static final int _SpellResistanceDecreaseImmunity = 26;
    public static final int _SkillDecreaseImmunity = 27;
    public static final int _KnockdownImmunity = 28;
    public static final int _NegativeLevelImmunity = 29;
    public static final int _SneakAttackImmunity = 30;
    public static final int _CriticalHitImmunity = 31;
    public static final int _DeathImmunity = 32;

    public static ImmunityType
    convert(int val)
    {
        assert val >= 0 && val < 33;
        return values()[val];
    }

    public static ImmunityType
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

    public static ImmunityType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(33);
        return ImmunityType.convert(__v);
    }
}
