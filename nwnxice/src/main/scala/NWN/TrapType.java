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

public enum TrapType implements java.io.Serializable
{
    MinorSpikeTrap,
    AverageSpikeTrap,
    StrongSpikeTrap,
    DeadlySpikeTrap,
    MinorHolyTrap,
    AverageHolyTrap,
    StrongHolyTrap,
    DeadlyHolyTrap,
    MinorTangleTrap,
    AverageTangleTrap,
    StrongTangleTrap,
    DeadlyTangleTrap,
    MinorAcidTrap,
    AverageAcidTrap,
    StrongAcidTrap,
    DeadlyAcidTrap,
    MinorFireTrap,
    AverageFireTrap,
    StrongFireTrap,
    DeadlyFireTrap,
    MinorElectricalTrap,
    AverageElectricalTrap,
    StrongElectricalTrap,
    DeadlyElectricalTrap,
    MinorGasTrap,
    AverageGasTrap,
    StrongGasTrap,
    DeadlyGasTrap,
    MinorFrostTrap,
    AverageFrostTrap,
    StrongFrostTrap,
    DeadlyFrostTrap,
    MinorNegativeTrap,
    AverageNegativeTrap,
    StrongNegativeTrap,
    DeadlyNegativeTrap,
    MinorSonicTrap,
    AverageSonicTrap,
    StrongSonicTrap,
    DeadlySonicTrap,
    MinorAcidSplashTrap,
    AverageAcidSplashTrap,
    StrongAcidSplashTrap,
    DeadlyAcidSplashTrap,
    EpicElectricalTrap,
    EpicFireTrap,
    EpicFrostTrap,
    EpicSonicTrap;

    public static final int _MinorSpikeTrap = 0;
    public static final int _AverageSpikeTrap = 1;
    public static final int _StrongSpikeTrap = 2;
    public static final int _DeadlySpikeTrap = 3;
    public static final int _MinorHolyTrap = 4;
    public static final int _AverageHolyTrap = 5;
    public static final int _StrongHolyTrap = 6;
    public static final int _DeadlyHolyTrap = 7;
    public static final int _MinorTangleTrap = 8;
    public static final int _AverageTangleTrap = 9;
    public static final int _StrongTangleTrap = 10;
    public static final int _DeadlyTangleTrap = 11;
    public static final int _MinorAcidTrap = 12;
    public static final int _AverageAcidTrap = 13;
    public static final int _StrongAcidTrap = 14;
    public static final int _DeadlyAcidTrap = 15;
    public static final int _MinorFireTrap = 16;
    public static final int _AverageFireTrap = 17;
    public static final int _StrongFireTrap = 18;
    public static final int _DeadlyFireTrap = 19;
    public static final int _MinorElectricalTrap = 20;
    public static final int _AverageElectricalTrap = 21;
    public static final int _StrongElectricalTrap = 22;
    public static final int _DeadlyElectricalTrap = 23;
    public static final int _MinorGasTrap = 24;
    public static final int _AverageGasTrap = 25;
    public static final int _StrongGasTrap = 26;
    public static final int _DeadlyGasTrap = 27;
    public static final int _MinorFrostTrap = 28;
    public static final int _AverageFrostTrap = 29;
    public static final int _StrongFrostTrap = 30;
    public static final int _DeadlyFrostTrap = 31;
    public static final int _MinorNegativeTrap = 32;
    public static final int _AverageNegativeTrap = 33;
    public static final int _StrongNegativeTrap = 34;
    public static final int _DeadlyNegativeTrap = 35;
    public static final int _MinorSonicTrap = 36;
    public static final int _AverageSonicTrap = 37;
    public static final int _StrongSonicTrap = 38;
    public static final int _DeadlySonicTrap = 39;
    public static final int _MinorAcidSplashTrap = 40;
    public static final int _AverageAcidSplashTrap = 41;
    public static final int _StrongAcidSplashTrap = 42;
    public static final int _DeadlyAcidSplashTrap = 43;
    public static final int _EpicElectricalTrap = 44;
    public static final int _EpicFireTrap = 45;
    public static final int _EpicFrostTrap = 46;
    public static final int _EpicSonicTrap = 47;

    public static TrapType
    convert(int val)
    {
        assert val >= 0 && val < 48;
        return values()[val];
    }

    public static TrapType
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

    public static TrapType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(48);
        return TrapType.convert(__v);
    }
}
