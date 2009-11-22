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

public enum MetaMagic implements java.io.Serializable
{
    NoneMeta,
    EmpowerMeta,
    ExtendMeta,
    InvalidMeta,
    MaximizeMeta,
    QuickenMeta,
    SilentMeta,
    StillMeta,
    AnyMeta;

    public static final int _NoneMeta = 0;
    public static final int _EmpowerMeta = 1;
    public static final int _ExtendMeta = 2;
    public static final int _InvalidMeta = 3;
    public static final int _MaximizeMeta = 4;
    public static final int _QuickenMeta = 5;
    public static final int _SilentMeta = 6;
    public static final int _StillMeta = 7;
    public static final int _AnyMeta = 8;

    public static MetaMagic
    convert(int val)
    {
        assert val >= 0 && val < 9;
        return values()[val];
    }

    public static MetaMagic
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

    public static MetaMagic
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(9);
        return MetaMagic.convert(__v);
    }
}
