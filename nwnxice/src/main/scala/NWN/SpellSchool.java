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

public enum SpellSchool implements java.io.Serializable
{
    GeneralSchool,
    AbjurationSchool,
    ConjurationSchool,
    DivinationSchool,
    EnchantmentSchool,
    EvocationSchool,
    IllusionSchool,
    NecromancySchool,
    TransmutationSchool;

    public static final int _GeneralSchool = 0;
    public static final int _AbjurationSchool = 1;
    public static final int _ConjurationSchool = 2;
    public static final int _DivinationSchool = 3;
    public static final int _EnchantmentSchool = 4;
    public static final int _EvocationSchool = 5;
    public static final int _IllusionSchool = 6;
    public static final int _NecromancySchool = 7;
    public static final int _TransmutationSchool = 8;

    public static SpellSchool
    convert(int val)
    {
        assert val >= 0 && val < 9;
        return values()[val];
    }

    public static SpellSchool
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

    public static SpellSchool
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(9);
        return SpellSchool.convert(__v);
    }
}
