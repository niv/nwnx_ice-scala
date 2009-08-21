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

public enum CombatMode implements java.io.Serializable
{
    InvalidCombatMode,
    ParryCombatMode,
    PowerAttackCombatMode,
    ImprovedPowerAttackCombatMode,
    FlurryOfBlowsCombatMode,
    RapidShotCombatMode,
    ExpertiseCombatMode,
    ImprovedExpertiseCombatMode,
    DefensiveCastingCombatMode,
    DirtyFightingCombatMode,
    DefensiveStanceCombatMode;

    public static final int _InvalidCombatMode = 0;
    public static final int _ParryCombatMode = 1;
    public static final int _PowerAttackCombatMode = 2;
    public static final int _ImprovedPowerAttackCombatMode = 3;
    public static final int _FlurryOfBlowsCombatMode = 4;
    public static final int _RapidShotCombatMode = 5;
    public static final int _ExpertiseCombatMode = 6;
    public static final int _ImprovedExpertiseCombatMode = 7;
    public static final int _DefensiveCastingCombatMode = 8;
    public static final int _DirtyFightingCombatMode = 9;
    public static final int _DefensiveStanceCombatMode = 10;

    public static CombatMode
    convert(int val)
    {
        assert val >= 0 && val < 11;
        return values()[val];
    }

    public static CombatMode
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

    public static CombatMode
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(11);
        return CombatMode.convert(__v);
    }
}
