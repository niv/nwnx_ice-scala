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

public enum MissChanceType implements java.io.Serializable
{
    MissChanceVSAll,
    MissChanceVSRanged,
    MissChanceVSMelee;

    public static final int _MissChanceVSAll = 0;
    public static final int _MissChanceVSRanged = 1;
    public static final int _MissChanceVSMelee = 2;

    public static MissChanceType
    convert(int val)
    {
        assert val >= 0 && val < 3;
        return values()[val];
    }

    public static MissChanceType
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

    public static MissChanceType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(3);
        return MissChanceType.convert(__v);
    }
}
