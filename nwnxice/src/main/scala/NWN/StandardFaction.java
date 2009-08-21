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

public enum StandardFaction implements java.io.Serializable
{
    Hostile,
    Commoner,
    Merchant,
    Defender;

    public static final int _Hostile = 0;
    public static final int _Commoner = 1;
    public static final int _Merchant = 2;
    public static final int _Defender = 3;

    public static StandardFaction
    convert(int val)
    {
        assert val >= 0 && val < 4;
        return values()[val];
    }

    public static StandardFaction
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

    public static StandardFaction
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(4);
        return StandardFaction.convert(__v);
    }
}
