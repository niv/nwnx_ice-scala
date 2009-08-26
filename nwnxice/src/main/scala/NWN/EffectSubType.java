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

public enum EffectSubType implements java.io.Serializable
{
    InvalidSubType,
    MagicalSubType,
    SupernaturalSubType,
    ExtraordinarySubType;

    public static final int _InvalidSubType = 0;
    public static final int _MagicalSubType = 1;
    public static final int _SupernaturalSubType = 2;
    public static final int _ExtraordinarySubType = 3;

    public static EffectSubType
    convert(int val)
    {
        assert val >= 0 && val < 4;
        return values()[val];
    }

    public static EffectSubType
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

    public static EffectSubType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(4);
        return EffectSubType.convert(__v);
    }
}
