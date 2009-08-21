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

public enum SpecialAttack implements java.io.Serializable
{
    InvalidSpecialAttack,
    CalledShotLegSpecialAttack,
    CalledShotArmSpecialAttack,
    SapSpecialAttack,
    DisarmSpecialAttack,
    ImprovedDisarmSpecialAttack,
    KnockdownSpecialAttack,
    ImprovedKnockdownSpecialAttack,
    StunningFistSpecialAttack,
    FlurryOfBlowsSpecialAttack,
    RapidShotSpecialAttack;

    public static final int _InvalidSpecialAttack = 0;
    public static final int _CalledShotLegSpecialAttack = 1;
    public static final int _CalledShotArmSpecialAttack = 2;
    public static final int _SapSpecialAttack = 3;
    public static final int _DisarmSpecialAttack = 4;
    public static final int _ImprovedDisarmSpecialAttack = 5;
    public static final int _KnockdownSpecialAttack = 6;
    public static final int _ImprovedKnockdownSpecialAttack = 7;
    public static final int _StunningFistSpecialAttack = 8;
    public static final int _FlurryOfBlowsSpecialAttack = 9;
    public static final int _RapidShotSpecialAttack = 10;

    public static SpecialAttack
    convert(int val)
    {
        assert val >= 0 && val < 11;
        return values()[val];
    }

    public static SpecialAttack
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

    public static SpecialAttack
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(11);
        return SpecialAttack.convert(__v);
    }
}
