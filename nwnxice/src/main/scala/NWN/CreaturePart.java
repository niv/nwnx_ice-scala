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

public enum CreaturePart implements java.io.Serializable
{
    RightFootPart,
    LeftFootPart,
    RightShinPart,
    LeftShinPart,
    LeftThighPart,
    RightThighPart,
    PelvisPart,
    TorsoPart,
    BeltPart,
    NeckPart,
    RightForearmPart,
    LeftForearmPart,
    RightBicepPart,
    LeftBicepPart,
    RightShoulderPart,
    LeftShoulderPart,
    RightHandPart,
    LeftHandPart,
    HeadPart;

    public static final int _RightFootPart = 0;
    public static final int _LeftFootPart = 1;
    public static final int _RightShinPart = 2;
    public static final int _LeftShinPart = 3;
    public static final int _LeftThighPart = 4;
    public static final int _RightThighPart = 5;
    public static final int _PelvisPart = 6;
    public static final int _TorsoPart = 7;
    public static final int _BeltPart = 8;
    public static final int _NeckPart = 9;
    public static final int _RightForearmPart = 10;
    public static final int _LeftForearmPart = 11;
    public static final int _RightBicepPart = 12;
    public static final int _LeftBicepPart = 13;
    public static final int _RightShoulderPart = 14;
    public static final int _LeftShoulderPart = 15;
    public static final int _RightHandPart = 16;
    public static final int _LeftHandPart = 17;
    public static final int _HeadPart = 18;

    public static CreaturePart
    convert(int val)
    {
        assert val >= 0 && val < 19;
        return values()[val];
    }

    public static CreaturePart
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

    public static CreaturePart
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(19);
        return CreaturePart.convert(__v);
    }
}
