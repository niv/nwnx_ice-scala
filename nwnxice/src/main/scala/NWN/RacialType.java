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

public enum RacialType implements java.io.Serializable
{
    DwarfRace,
    ElfRace,
    GnomeRace,
    HalflingRace,
    HalfelfRace,
    HalforcRace,
    HumanRace,
    AberrationRace,
    AnimalRace,
    BeastRace,
    ConstructRace,
    DragonRace,
    HumanoidGoblinoidRace,
    HumanoidMonstrousRace,
    HumanoidOrcRace,
    HumanoidReptilianRace,
    ElementalRace,
    FeyRace,
    GiantRace,
    MagicalBeastRace,
    OutsiderRace,
    ShapechangerRace,
    UndeadRace,
    VerminRace,
    InvalidRace,
    OozeRace;

    public static final int _DwarfRace = 0;
    public static final int _ElfRace = 1;
    public static final int _GnomeRace = 2;
    public static final int _HalflingRace = 3;
    public static final int _HalfelfRace = 4;
    public static final int _HalforcRace = 5;
    public static final int _HumanRace = 6;
    public static final int _AberrationRace = 7;
    public static final int _AnimalRace = 8;
    public static final int _BeastRace = 9;
    public static final int _ConstructRace = 10;
    public static final int _DragonRace = 11;
    public static final int _HumanoidGoblinoidRace = 12;
    public static final int _HumanoidMonstrousRace = 13;
    public static final int _HumanoidOrcRace = 14;
    public static final int _HumanoidReptilianRace = 15;
    public static final int _ElementalRace = 16;
    public static final int _FeyRace = 17;
    public static final int _GiantRace = 18;
    public static final int _MagicalBeastRace = 19;
    public static final int _OutsiderRace = 20;
    public static final int _ShapechangerRace = 21;
    public static final int _UndeadRace = 22;
    public static final int _VerminRace = 23;
    public static final int _InvalidRace = 24;
    public static final int _OozeRace = 25;

    public static RacialType
    convert(int val)
    {
        assert val >= 0 && val < 26;
        return values()[val];
    }

    public static RacialType
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

    public static RacialType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(26);
        return RacialType.convert(__v);
    }
}
