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

public enum Alignment implements java.io.Serializable
{
    Any,
    Neutral,
    Lawful,
    Chaotic,
    Good,
    Evil;

    public static final int _Any = 0;
    public static final int _Neutral = 1;
    public static final int _Lawful = 2;
    public static final int _Chaotic = 3;
    public static final int _Good = 4;
    public static final int _Evil = 5;

    public static Alignment
    convert(int val)
    {
        assert val >= 0 && val < 6;
        return values()[val];
    }

    public static Alignment
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

    public static Alignment
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(6);
        return Alignment.convert(__v);
    }
}
