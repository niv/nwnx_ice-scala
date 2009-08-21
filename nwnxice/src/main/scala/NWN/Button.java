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

public enum Button implements java.io.Serializable
{
    MapButton,
    InventoryButton,
    JournalButton,
    CharacterButton,
    OptionsButton,
    SpellsButton,
    RestButton,
    PvPButton;

    public static final int _MapButton = 0;
    public static final int _InventoryButton = 1;
    public static final int _JournalButton = 2;
    public static final int _CharacterButton = 3;
    public static final int _OptionsButton = 4;
    public static final int _SpellsButton = 5;
    public static final int _RestButton = 6;
    public static final int _PvPButton = 7;

    public static Button
    convert(int val)
    {
        assert val >= 0 && val < 8;
        return values()[val];
    }

    public static Button
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

    public static Button
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(8);
        return Button.convert(__v);
    }
}
