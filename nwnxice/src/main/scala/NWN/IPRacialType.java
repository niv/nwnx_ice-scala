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

public enum IPRacialType implements java.io.Serializable
{
    DwarfIPRace,
    ElfIPRace,
    GnomeIPRace,
    HalflingIPRace,
    HalfelfIPRace,
    HalforcIPRace,
    HumanIPRace,
    AberrationIPRace,
    AnimalIPRace,
    BeastIPRace,
    ConstructIPRace,
    DragonIPRace,
    HumanoidGoblinoidIPRace,
    HumanoidMonstrousIPRace,
    HumanoidOrcIPRace,
    HumanoidReptilianIPRace,
    ElementalIPRace,
    FeyIPRace,
    GiantIPRace,
    MagicalBeastIPRace,
    OutsiderIPRace,
    ShapechangerIPRace,
    UndeadIPRace,
    VerminIPRace;

    public static final int _DwarfIPRace = 0;
    public static final int _ElfIPRace = 1;
    public static final int _GnomeIPRace = 2;
    public static final int _HalflingIPRace = 3;
    public static final int _HalfelfIPRace = 4;
    public static final int _HalforcIPRace = 5;
    public static final int _HumanIPRace = 6;
    public static final int _AberrationIPRace = 7;
    public static final int _AnimalIPRace = 8;
    public static final int _BeastIPRace = 9;
    public static final int _ConstructIPRace = 10;
    public static final int _DragonIPRace = 11;
    public static final int _HumanoidGoblinoidIPRace = 12;
    public static final int _HumanoidMonstrousIPRace = 13;
    public static final int _HumanoidOrcIPRace = 14;
    public static final int _HumanoidReptilianIPRace = 15;
    public static final int _ElementalIPRace = 16;
    public static final int _FeyIPRace = 17;
    public static final int _GiantIPRace = 18;
    public static final int _MagicalBeastIPRace = 19;
    public static final int _OutsiderIPRace = 20;
    public static final int _ShapechangerIPRace = 21;
    public static final int _UndeadIPRace = 22;
    public static final int _VerminIPRace = 23;

    public static IPRacialType
    convert(int val)
    {
        assert val >= 0 && val < 24;
        return values()[val];
    }

    public static IPRacialType
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

    public static IPRacialType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(24);
        return IPRacialType.convert(__v);
    }
}
