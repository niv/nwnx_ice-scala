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

public enum TileMainLightColor implements java.io.Serializable
{
    BlackTileMainLightColor,
    DimWhiteTileMainLightColor,
    WhiteTileMainLightColor,
    BrightWhiteTileMainLightColor,
    PaleDarkYellowTileMainLightColor,
    DarkYellowTileMainLightColor,
    PaleYellowTileMainLightColor,
    YellowTileMainLightColor,
    PaleDarkGreenTileMainLightColor,
    DarkGreenTileMainLightColor,
    PaleGreenTileMainLightColor,
    GreenTileMainLightColor,
    PaleDarkAquaTileMainLightColor,
    DarkAquaTileMainLightColor,
    PaleAquaTileMainLightColor,
    AquaTileMainLightColor,
    PaleDarkBlueTileMainLightColor,
    DarkBlueTileMainLightColor,
    PaleBlueTileMainLightColor,
    BlueTileMainLightColor,
    PaleDarkPurpleTileMainLightColor,
    DarkPurpleTileMainLightColor,
    PalePurpleTileMainLightColor,
    PurpleTileMainLightColor,
    PaleDarkRedTileMainLightColor,
    DarkRedTileMainLightColor,
    PaleRedTileMainLightColor,
    RedTileMainLightColor,
    PaleDarkOrangeTileMainLightColor,
    DarkOrangeTileMainLightColor,
    PaleOrangeTileMainLightColor,
    OrangeTileMainLightColor;

    public static final int _BlackTileMainLightColor = 0;
    public static final int _DimWhiteTileMainLightColor = 1;
    public static final int _WhiteTileMainLightColor = 2;
    public static final int _BrightWhiteTileMainLightColor = 3;
    public static final int _PaleDarkYellowTileMainLightColor = 4;
    public static final int _DarkYellowTileMainLightColor = 5;
    public static final int _PaleYellowTileMainLightColor = 6;
    public static final int _YellowTileMainLightColor = 7;
    public static final int _PaleDarkGreenTileMainLightColor = 8;
    public static final int _DarkGreenTileMainLightColor = 9;
    public static final int _PaleGreenTileMainLightColor = 10;
    public static final int _GreenTileMainLightColor = 11;
    public static final int _PaleDarkAquaTileMainLightColor = 12;
    public static final int _DarkAquaTileMainLightColor = 13;
    public static final int _PaleAquaTileMainLightColor = 14;
    public static final int _AquaTileMainLightColor = 15;
    public static final int _PaleDarkBlueTileMainLightColor = 16;
    public static final int _DarkBlueTileMainLightColor = 17;
    public static final int _PaleBlueTileMainLightColor = 18;
    public static final int _BlueTileMainLightColor = 19;
    public static final int _PaleDarkPurpleTileMainLightColor = 20;
    public static final int _DarkPurpleTileMainLightColor = 21;
    public static final int _PalePurpleTileMainLightColor = 22;
    public static final int _PurpleTileMainLightColor = 23;
    public static final int _PaleDarkRedTileMainLightColor = 24;
    public static final int _DarkRedTileMainLightColor = 25;
    public static final int _PaleRedTileMainLightColor = 26;
    public static final int _RedTileMainLightColor = 27;
    public static final int _PaleDarkOrangeTileMainLightColor = 28;
    public static final int _DarkOrangeTileMainLightColor = 29;
    public static final int _PaleOrangeTileMainLightColor = 30;
    public static final int _OrangeTileMainLightColor = 31;

    public static TileMainLightColor
    convert(int val)
    {
        assert val >= 0 && val < 32;
        return values()[val];
    }

    public static TileMainLightColor
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

    public static TileMainLightColor
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(32);
        return TileMainLightColor.convert(__v);
    }
}
