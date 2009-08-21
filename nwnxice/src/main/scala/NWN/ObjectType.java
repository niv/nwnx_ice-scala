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

public enum ObjectType implements java.io.Serializable
{
    InvalidObject,
    Creature,
    Item,
    Trigger,
    Door,
    AOE,
    Waypoint,
    Placeable,
    Store,
    Encounter,
    All;

    public static final int _InvalidObject = 0;
    public static final int _Creature = 1;
    public static final int _Item = 2;
    public static final int _Trigger = 3;
    public static final int _Door = 4;
    public static final int _AOE = 5;
    public static final int _Waypoint = 6;
    public static final int _Placeable = 7;
    public static final int _Store = 8;
    public static final int _Encounter = 9;
    public static final int _All = 10;

    public static ObjectType
    convert(int val)
    {
        assert val >= 0 && val < 11;
        return values()[val];
    }

    public static ObjectType
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

    public static ObjectType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(11);
        return ObjectType.convert(__v);
    }
}
