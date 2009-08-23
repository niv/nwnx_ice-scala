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

public enum IPSpellSchool implements java.io.Serializable
{
    AbjurationIPSchool,
    ConjurationIPSchool,
    DivinationIPSchool,
    EnchantmentIPSchool,
    EvocationIPSchool,
    IllusionIPSchool,
    NecromancyIPSchool,
    TransmutationIPSchool;

    public static final int _AbjurationIPSchool = 0;
    public static final int _ConjurationIPSchool = 1;
    public static final int _DivinationIPSchool = 2;
    public static final int _EnchantmentIPSchool = 3;
    public static final int _EvocationIPSchool = 4;
    public static final int _IllusionIPSchool = 5;
    public static final int _NecromancyIPSchool = 6;
    public static final int _TransmutationIPSchool = 7;

    public static IPSpellSchool
    convert(int val)
    {
        assert val >= 0 && val < 8;
        return values()[val];
    }

    public static IPSpellSchool
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

    public static IPSpellSchool
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(8);
        return IPSpellSchool.convert(__v);
    }
}
