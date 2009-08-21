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

public enum DamageType implements java.io.Serializable
{
    BludgeoningDamage,
    PiercingDamage,
    SlashingDamage,
    MagicalDamage,
    AcidDamage,
    ColdDamage,
    DivineDamage,
    ElectricalDamage,
    FireDamage,
    NegativeDamage,
    PositiveDamage,
    SonicDamage,
    BaseDamage,
    ACVsAllDamage;

    public static final int _BludgeoningDamage = 0;
    public static final int _PiercingDamage = 1;
    public static final int _SlashingDamage = 2;
    public static final int _MagicalDamage = 3;
    public static final int _AcidDamage = 4;
    public static final int _ColdDamage = 5;
    public static final int _DivineDamage = 6;
    public static final int _ElectricalDamage = 7;
    public static final int _FireDamage = 8;
    public static final int _NegativeDamage = 9;
    public static final int _PositiveDamage = 10;
    public static final int _SonicDamage = 11;
    public static final int _BaseDamage = 12;
    public static final int _ACVsAllDamage = 13;

    public static DamageType
    convert(int val)
    {
        assert val >= 0 && val < 14;
        return values()[val];
    }

    public static DamageType
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

    public static DamageType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(14);
        return DamageType.convert(__v);
    }
}
