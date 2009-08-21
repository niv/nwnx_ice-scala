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

public enum SaveType implements java.io.Serializable
{
    AllOrNoneSaveType,
    MindSpellsSaveType,
    PoisonSaveType,
    DiseaseSaveType,
    FearSaveType,
    SonicSaveType,
    AcidSaveType,
    FireSaveType,
    ElectricitySaveType,
    PositiveSaveType,
    NegativeSaveType,
    DeathSaveType,
    ColdSaveType,
    DivineSaveType,
    TrapSaveType,
    SpellSaveType,
    GoodSaveType,
    EvilSaveType,
    LawSaveType,
    ChaosSaveType;

    public static final int _AllOrNoneSaveType = 0;
    public static final int _MindSpellsSaveType = 1;
    public static final int _PoisonSaveType = 2;
    public static final int _DiseaseSaveType = 3;
    public static final int _FearSaveType = 4;
    public static final int _SonicSaveType = 5;
    public static final int _AcidSaveType = 6;
    public static final int _FireSaveType = 7;
    public static final int _ElectricitySaveType = 8;
    public static final int _PositiveSaveType = 9;
    public static final int _NegativeSaveType = 10;
    public static final int _DeathSaveType = 11;
    public static final int _ColdSaveType = 12;
    public static final int _DivineSaveType = 13;
    public static final int _TrapSaveType = 14;
    public static final int _SpellSaveType = 15;
    public static final int _GoodSaveType = 16;
    public static final int _EvilSaveType = 17;
    public static final int _LawSaveType = 18;
    public static final int _ChaosSaveType = 19;

    public static SaveType
    convert(int val)
    {
        assert val >= 0 && val < 20;
        return values()[val];
    }

    public static SaveType
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

    public static SaveType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(20);
        return SaveType.convert(__v);
    }
}
