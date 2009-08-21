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

public enum AILevel implements java.io.Serializable
{
    DefaultAI,
    VeryLowAI,
    LowAI,
    NormalAI,
    HighAI,
    VeryHighAI;

    public static final int _DefaultAI = 0;
    public static final int _VeryLowAI = 1;
    public static final int _LowAI = 2;
    public static final int _NormalAI = 3;
    public static final int _HighAI = 4;
    public static final int _VeryHighAI = 5;

    public static AILevel
    convert(int val)
    {
        assert val >= 0 && val < 6;
        return values()[val];
    }

    public static AILevel
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

    public static AILevel
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(6);
        return AILevel.convert(__v);
    }
}
