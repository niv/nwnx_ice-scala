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

public enum PlaceableAction implements java.io.Serializable
{
    UsePlaceable,
    UnlockPlaceable,
    BashPlaceable,
    KnockPlaceable;

    public static final int _UsePlaceable = 0;
    public static final int _UnlockPlaceable = 1;
    public static final int _BashPlaceable = 2;
    public static final int _KnockPlaceable = 3;

    public static PlaceableAction
    convert(int val)
    {
        assert val >= 0 && val < 4;
        return values()[val];
    }

    public static PlaceableAction
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

    public static PlaceableAction
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(4);
        return PlaceableAction.convert(__v);
    }
}
