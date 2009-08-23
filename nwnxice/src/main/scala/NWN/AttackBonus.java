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

public enum AttackBonus implements java.io.Serializable
{
    MiscBonus,
    OnhandBonus,
    OffhandBonus;

    public static final int _MiscBonus = 0;
    public static final int _OnhandBonus = 1;
    public static final int _OffhandBonus = 2;

    public static AttackBonus
    convert(int val)
    {
        assert val >= 0 && val < 3;
        return values()[val];
    }

    public static AttackBonus
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

    public static AttackBonus
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(3);
        return AttackBonus.convert(__v);
    }
}
