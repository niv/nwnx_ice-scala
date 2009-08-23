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

public enum PoisonType implements java.io.Serializable
{
    NightshadePoison,
    SmallCentipedePoisonPoison,
    BladeBanePoison,
    GreenbloodOilPoison,
    BloodrootPoison,
    PurpleWormPoisonPoison,
    LargeScorpionVenomPoison,
    WyvernPoisonPoison,
    BlueWhinnisPoison,
    GiantWaspPoisonPoison,
    ShadowEssencePoison,
    BlackAdderVenomPoison,
    DeathbladePoison,
    MalyssRootPastePoison,
    NitharitPoison,
    DragonBilePoison,
    SassoneLeafResiduePoison,
    TerinavRootPoison,
    CarrionCrawlerBrainJuicePoison,
    BlackLotusExtractPoison,
    OilOfTaggitPoison,
    IdMossPoison,
    StripedToadstoolPoison,
    ArsenicPoison,
    LichDustPoison,
    DarkReaverPowderPoison,
    UngolDustPoison,
    BurntOthurFumesPoison,
    ChaosMistPoison,
    BebilithVenomPoison,
    QuasitVenomPoison,
    PitFiendIchorPoison,
    EttercapVenomPoison,
    AraneaVenomPoison,
    TinySpiderVenomPoison,
    SmallSpiderVenomPoison,
    MediumSpiderVenomPoison,
    LargeSpiderVenomPoison,
    HugeSpiderVenomPoison,
    GargantuanSpiderVenomPoison,
    ColossalSpiderVenomPoison,
    PhaseSpiderVenomPoison,
    WraithSpiderVenomPoison,
    IronGolemPoison;

    public static final int _NightshadePoison = 0;
    public static final int _SmallCentipedePoisonPoison = 1;
    public static final int _BladeBanePoison = 2;
    public static final int _GreenbloodOilPoison = 3;
    public static final int _BloodrootPoison = 4;
    public static final int _PurpleWormPoisonPoison = 5;
    public static final int _LargeScorpionVenomPoison = 6;
    public static final int _WyvernPoisonPoison = 7;
    public static final int _BlueWhinnisPoison = 8;
    public static final int _GiantWaspPoisonPoison = 9;
    public static final int _ShadowEssencePoison = 10;
    public static final int _BlackAdderVenomPoison = 11;
    public static final int _DeathbladePoison = 12;
    public static final int _MalyssRootPastePoison = 13;
    public static final int _NitharitPoison = 14;
    public static final int _DragonBilePoison = 15;
    public static final int _SassoneLeafResiduePoison = 16;
    public static final int _TerinavRootPoison = 17;
    public static final int _CarrionCrawlerBrainJuicePoison = 18;
    public static final int _BlackLotusExtractPoison = 19;
    public static final int _OilOfTaggitPoison = 20;
    public static final int _IdMossPoison = 21;
    public static final int _StripedToadstoolPoison = 22;
    public static final int _ArsenicPoison = 23;
    public static final int _LichDustPoison = 24;
    public static final int _DarkReaverPowderPoison = 25;
    public static final int _UngolDustPoison = 26;
    public static final int _BurntOthurFumesPoison = 27;
    public static final int _ChaosMistPoison = 28;
    public static final int _BebilithVenomPoison = 29;
    public static final int _QuasitVenomPoison = 30;
    public static final int _PitFiendIchorPoison = 31;
    public static final int _EttercapVenomPoison = 32;
    public static final int _AraneaVenomPoison = 33;
    public static final int _TinySpiderVenomPoison = 34;
    public static final int _SmallSpiderVenomPoison = 35;
    public static final int _MediumSpiderVenomPoison = 36;
    public static final int _LargeSpiderVenomPoison = 37;
    public static final int _HugeSpiderVenomPoison = 38;
    public static final int _GargantuanSpiderVenomPoison = 39;
    public static final int _ColossalSpiderVenomPoison = 40;
    public static final int _PhaseSpiderVenomPoison = 41;
    public static final int _WraithSpiderVenomPoison = 42;
    public static final int _IronGolemPoison = 43;

    public static PoisonType
    convert(int val)
    {
        assert val >= 0 && val < 44;
        return values()[val];
    }

    public static PoisonType
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

    public static PoisonType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(44);
        return PoisonType.convert(__v);
    }
}
