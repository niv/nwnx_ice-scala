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

public enum TileSourceLightColor implements java.io.Serializable
{
    BlackTileSourceLightColor,
    WhiteTileSourceLightColor,
    PaleDarkYellowTileSourceLightColor,
    PaleYellowTileSourceLightColor,
    PaleDarkGreenTileSourceLightColor,
    PaleGreenTileSourceLightColor,
    PaleDarkAquaTileSourceLightColor,
    PaleAquaTileSourceLightColor,
    PaleDarkBlueTileSourceLightColor,
    PaleBlueTileSourceLightColor,
    PaleDarkPurpleTileSourceLightColor,
    PalePurpleTileSourceLightColor,
    PaleDarkRedTileSourceLightColor,
    PaleRedTileSourceLightColor,
    PaleDarkOrangeTileSourceLightColor,
    PaleOrangeTileSourceLightColor;

    public static final int _BlackTileSourceLightColor = 0;
    public static final int _WhiteTileSourceLightColor = 1;
    public static final int _PaleDarkYellowTileSourceLightColor = 2;
    public static final int _PaleYellowTileSourceLightColor = 3;
    public static final int _PaleDarkGreenTileSourceLightColor = 4;
    public static final int _PaleGreenTileSourceLightColor = 5;
    public static final int _PaleDarkAquaTileSourceLightColor = 6;
    public static final int _PaleAquaTileSourceLightColor = 7;
    public static final int _PaleDarkBlueTileSourceLightColor = 8;
    public static final int _PaleBlueTileSourceLightColor = 9;
    public static final int _PaleDarkPurpleTileSourceLightColor = 10;
    public static final int _PalePurpleTileSourceLightColor = 11;
    public static final int _PaleDarkRedTileSourceLightColor = 12;
    public static final int _PaleRedTileSourceLightColor = 13;
    public static final int _PaleDarkOrangeTileSourceLightColor = 14;
    public static final int _PaleOrangeTileSourceLightColor = 15;

    public static TileSourceLightColor
    convert(int val)
    {
        assert val >= 0 && val < 16;
        return values()[val];
    }

    public static TileSourceLightColor
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

    public static TileSourceLightColor
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(16);
        return TileSourceLightColor.convert(__v);
    }
}
