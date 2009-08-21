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

public enum PhenoType implements java.io.Serializable
{
    NormalPhenoType,
    BigPhenoType,
    Custom1PhenoType,
    Custom2PhenoType,
    Custom3PhenoType,
    Custom4PhenoType,
    Custom5PhenoType,
    Custom6PhenoType,
    Custom7PhenoType,
    Custom8PhenoType,
    Custom9PhenoType,
    Custom10PhenoType,
    Custom11PhenoType,
    Custom12PhenoType,
    Custom13PhenoType,
    Custom14PhenoType,
    Custom15PhenoType,
    Custom16PhenoType,
    Custom17PhenoType,
    Custom18PhenoType;

    public static final int _NormalPhenoType = 0;
    public static final int _BigPhenoType = 1;
    public static final int _Custom1PhenoType = 2;
    public static final int _Custom2PhenoType = 3;
    public static final int _Custom3PhenoType = 4;
    public static final int _Custom4PhenoType = 5;
    public static final int _Custom5PhenoType = 6;
    public static final int _Custom6PhenoType = 7;
    public static final int _Custom7PhenoType = 8;
    public static final int _Custom8PhenoType = 9;
    public static final int _Custom9PhenoType = 10;
    public static final int _Custom10PhenoType = 11;
    public static final int _Custom11PhenoType = 12;
    public static final int _Custom12PhenoType = 13;
    public static final int _Custom13PhenoType = 14;
    public static final int _Custom14PhenoType = 15;
    public static final int _Custom15PhenoType = 16;
    public static final int _Custom16PhenoType = 17;
    public static final int _Custom17PhenoType = 18;
    public static final int _Custom18PhenoType = 19;

    public static PhenoType
    convert(int val)
    {
        assert val >= 0 && val < 20;
        return values()[val];
    }

    public static PhenoType
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

    public static PhenoType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(20);
        return PhenoType.convert(__v);
    }
}
