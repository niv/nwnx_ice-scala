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

public enum IPDamageType implements java.io.Serializable
{
    BludgeoningIPDamage,
    PiercingIPDamage,
    SlashingIPDamage,
    SubdualIPDamage,
    PhysicalIPDamage,
    MagicalIPDamage,
    AcidIPDamage,
    ColdIPDamage,
    DivineIPDamage,
    ElectricalIPDamage,
    FireIPDamage,
    NegativeIPDamage,
    PositiveIPDamage,
    SonicIPDamage;

    public static final int _BludgeoningIPDamage = 0;
    public static final int _PiercingIPDamage = 1;
    public static final int _SlashingIPDamage = 2;
    public static final int _SubdualIPDamage = 3;
    public static final int _PhysicalIPDamage = 4;
    public static final int _MagicalIPDamage = 5;
    public static final int _AcidIPDamage = 6;
    public static final int _ColdIPDamage = 7;
    public static final int _DivineIPDamage = 8;
    public static final int _ElectricalIPDamage = 9;
    public static final int _FireIPDamage = 10;
    public static final int _NegativeIPDamage = 11;
    public static final int _PositiveIPDamage = 12;
    public static final int _SonicIPDamage = 13;

    public static IPDamageType
    convert(int val)
    {
        assert val >= 0 && val < 14;
        return values()[val];
    }

    public static IPDamageType
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

    public static IPDamageType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(14);
        return IPDamageType.convert(__v);
    }
}
