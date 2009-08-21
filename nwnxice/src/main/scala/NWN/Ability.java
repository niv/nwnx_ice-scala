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

public enum Ability implements java.io.Serializable
{
    Strength,
    Dexterity,
    Constitution,
    Intelligence,
    Wisdom,
    Charisma;

    public static final int _Strength = 0;
    public static final int _Dexterity = 1;
    public static final int _Constitution = 2;
    public static final int _Intelligence = 3;
    public static final int _Wisdom = 4;
    public static final int _Charisma = 5;

    public static Ability
    convert(int val)
    {
        assert val >= 0 && val < 6;
        return values()[val];
    }

    public static Ability
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

    public static Ability
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(6);
        return Ability.convert(__v);
    }
}
