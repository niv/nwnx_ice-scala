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

public enum IPMiscImmunityType implements java.io.Serializable
{
    BackstabIPImmunity,
    LevelAbilDrainIPImmunity,
    MindSpellsIPImmunity,
    PoisonIPImmunity,
    DiseaseIPImmunity,
    FearIPImmunity,
    KnockdownIPImmunity,
    ParalysisIPImmunity,
    CriticalHitsIPImmunity,
    DeathMagicIPImmunity;

    public static final int _BackstabIPImmunity = 0;
    public static final int _LevelAbilDrainIPImmunity = 1;
    public static final int _MindSpellsIPImmunity = 2;
    public static final int _PoisonIPImmunity = 3;
    public static final int _DiseaseIPImmunity = 4;
    public static final int _FearIPImmunity = 5;
    public static final int _KnockdownIPImmunity = 6;
    public static final int _ParalysisIPImmunity = 7;
    public static final int _CriticalHitsIPImmunity = 8;
    public static final int _DeathMagicIPImmunity = 9;

    public static IPMiscImmunityType
    convert(int val)
    {
        assert val >= 0 && val < 10;
        return values()[val];
    }

    public static IPMiscImmunityType
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

    public static IPMiscImmunityType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(10);
        return IPMiscImmunityType.convert(__v);
    }
}
