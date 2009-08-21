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

public enum DoorAction implements java.io.Serializable
{
    OpenDoor,
    UnlockDoor,
    BashDoor,
    IgnoreDoor,
    KnockDoor;

    public static final int _OpenDoor = 0;
    public static final int _UnlockDoor = 1;
    public static final int _BashDoor = 2;
    public static final int _IgnoreDoor = 3;
    public static final int _KnockDoor = 4;

    public static DoorAction
    convert(int val)
    {
        assert val >= 0 && val < 5;
        return values()[val];
    }

    public static DoorAction
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

    public static DoorAction
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(5);
        return DoorAction.convert(__v);
    }
}
