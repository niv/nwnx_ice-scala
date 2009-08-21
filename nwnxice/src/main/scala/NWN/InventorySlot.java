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

public enum InventorySlot implements java.io.Serializable
{
    HeadSlot,
    ChestSlot,
    BootsSlot,
    ArmsSlot,
    RighthandSlot,
    LefthandSlot,
    CloakSlot,
    LeftringSlot,
    RightringSlot,
    NeckSlot,
    BeltSlot,
    ArrowsSlot,
    BulletsSlot,
    BoltsSlot,
    CreatureLefthandSlot,
    CreatureRighthandSlot,
    CreatureBiteSlot,
    CreatureArmorSlot;

    public static final int _HeadSlot = 0;
    public static final int _ChestSlot = 1;
    public static final int _BootsSlot = 2;
    public static final int _ArmsSlot = 3;
    public static final int _RighthandSlot = 4;
    public static final int _LefthandSlot = 5;
    public static final int _CloakSlot = 6;
    public static final int _LeftringSlot = 7;
    public static final int _RightringSlot = 8;
    public static final int _NeckSlot = 9;
    public static final int _BeltSlot = 10;
    public static final int _ArrowsSlot = 11;
    public static final int _BulletsSlot = 12;
    public static final int _BoltsSlot = 13;
    public static final int _CreatureLefthandSlot = 14;
    public static final int _CreatureRighthandSlot = 15;
    public static final int _CreatureBiteSlot = 16;
    public static final int _CreatureArmorSlot = 17;

    public static InventorySlot
    convert(int val)
    {
        assert val >= 0 && val < 18;
        return values()[val];
    }

    public static InventorySlot
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

    public static InventorySlot
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(18);
        return InventorySlot.convert(__v);
    }
}
