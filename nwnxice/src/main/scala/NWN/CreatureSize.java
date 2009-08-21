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

public enum CreatureSize implements java.io.Serializable
{
    InvalidSize,
    TinySize,
    SmallSize,
    MediumSize,
    LargeSize,
    HugeSize;

    public static final int _InvalidSize = 0;
    public static final int _TinySize = 1;
    public static final int _SmallSize = 2;
    public static final int _MediumSize = 3;
    public static final int _LargeSize = 4;
    public static final int _HugeSize = 5;

    public static CreatureSize
    convert(int val)
    {
        assert val >= 0 && val < 6;
        return values()[val];
    }

    public static CreatureSize
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

    public static CreatureSize
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(6);
        return CreatureSize.convert(__v);
    }
}
