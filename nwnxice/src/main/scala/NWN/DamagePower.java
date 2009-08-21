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

public enum DamagePower implements java.io.Serializable
{
    NormalDamage,
    PlusOneDamage,
    PlusTwoDamage,
    PlusThreeDamage,
    PlusFourDamage,
    PlusFiveDamage,
    EnergyDamage,
    PlusSixDamage,
    PlusSevenDamage,
    PlusEightDamage,
    PlusNineDamage,
    PlusTenDamage,
    PlusElevenDamage,
    PlusTwelveDamage,
    PlusThirteenDamage,
    PlusFourteenDamage,
    PlusFifteenDamage,
    PlusSixteenDamage,
    PlusSeventeenDamage,
    PlusEighteenDamage,
    PlusNinteenDamage,
    PlusTwentyDamage;

    public static final int _NormalDamage = 0;
    public static final int _PlusOneDamage = 1;
    public static final int _PlusTwoDamage = 2;
    public static final int _PlusThreeDamage = 3;
    public static final int _PlusFourDamage = 4;
    public static final int _PlusFiveDamage = 5;
    public static final int _EnergyDamage = 6;
    public static final int _PlusSixDamage = 7;
    public static final int _PlusSevenDamage = 8;
    public static final int _PlusEightDamage = 9;
    public static final int _PlusNineDamage = 10;
    public static final int _PlusTenDamage = 11;
    public static final int _PlusElevenDamage = 12;
    public static final int _PlusTwelveDamage = 13;
    public static final int _PlusThirteenDamage = 14;
    public static final int _PlusFourteenDamage = 15;
    public static final int _PlusFifteenDamage = 16;
    public static final int _PlusSixteenDamage = 17;
    public static final int _PlusSeventeenDamage = 18;
    public static final int _PlusEighteenDamage = 19;
    public static final int _PlusNinteenDamage = 20;
    public static final int _PlusTwentyDamage = 21;

    public static DamagePower
    convert(int val)
    {
        assert val >= 0 && val < 22;
        return values()[val];
    }

    public static DamagePower
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

    public static DamagePower
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(22);
        return DamagePower.convert(__v);
    }
}
