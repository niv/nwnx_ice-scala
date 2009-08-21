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

public enum IPTrapType implements java.io.Serializable
{
    SpikeIPTrap,
    HolyIPTrap,
    TangleIPTrap,
    BlobOfAcidIPTrap,
    FireIPTrap,
    ElectricalIPTrap,
    GasIPTrap,
    FrostIPTrap,
    AcidSplashIPTrap,
    SonicIPTrap,
    NegativeIPTrap;

    public static final int _SpikeIPTrap = 0;
    public static final int _HolyIPTrap = 1;
    public static final int _TangleIPTrap = 2;
    public static final int _BlobOfAcidIPTrap = 3;
    public static final int _FireIPTrap = 4;
    public static final int _ElectricalIPTrap = 5;
    public static final int _GasIPTrap = 6;
    public static final int _FrostIPTrap = 7;
    public static final int _AcidSplashIPTrap = 8;
    public static final int _SonicIPTrap = 9;
    public static final int _NegativeIPTrap = 10;

    public static IPTrapType
    convert(int val)
    {
        assert val >= 0 && val < 11;
        return values()[val];
    }

    public static IPTrapType
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

    public static IPTrapType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(11);
        return IPTrapType.convert(__v);
    }
}
