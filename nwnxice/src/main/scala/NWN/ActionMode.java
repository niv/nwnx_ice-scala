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

public enum ActionMode implements java.io.Serializable
{
    DetectMode,
    StealthMode,
    ParryMode,
    PowerAttackMode,
    ImprovedPowerAttackMode,
    CounterspellMode,
    FlurryOfBlowsMode,
    RapidShotMode,
    ExpertiseMode,
    ImprovedExpertiseMode,
    DefensiveCastMode,
    DirtyFightingMode;

    public static final int _DetectMode = 0;
    public static final int _StealthMode = 1;
    public static final int _ParryMode = 2;
    public static final int _PowerAttackMode = 3;
    public static final int _ImprovedPowerAttackMode = 4;
    public static final int _CounterspellMode = 5;
    public static final int _FlurryOfBlowsMode = 6;
    public static final int _RapidShotMode = 7;
    public static final int _ExpertiseMode = 8;
    public static final int _ImprovedExpertiseMode = 9;
    public static final int _DefensiveCastMode = 10;
    public static final int _DirtyFightingMode = 11;

    public static ActionMode
    convert(int val)
    {
        assert val >= 0 && val < 12;
        return values()[val];
    }

    public static ActionMode
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

    public static ActionMode
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(12);
        return ActionMode.convert(__v);
    }
}
