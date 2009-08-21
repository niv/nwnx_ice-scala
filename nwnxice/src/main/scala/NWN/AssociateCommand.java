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

public enum AssociateCommand implements java.io.Serializable
{
    ToggleSearchCommand,
    ToggleStealthCommand,
    ToggleCastingCommand,
    DisarmTrapCommand,
    InventoryCommand,
    PickLockCommand,
    LeavePartyCommand,
    MasterGoingToBeAttackedCommand,
    MasterAttackedOtherCommand,
    MasterSawTrapCommand,
    UnpossessFamiliarCommand,
    ReleaseDominationCommand,
    MasterUnderAttackCommand,
    UnsummonSummonedCommand,
    UnsummonAnimalCompanionCommand,
    UnsummonFamiliarCommand,
    GuardMasterCommand,
    MasterFailedLockpickCommand,
    FollowMasterCommand,
    HealMasterCommand,
    AttackNearestCommand,
    StandGroundCommand;

    public static final int _ToggleSearchCommand = 0;
    public static final int _ToggleStealthCommand = 1;
    public static final int _ToggleCastingCommand = 2;
    public static final int _DisarmTrapCommand = 3;
    public static final int _InventoryCommand = 4;
    public static final int _PickLockCommand = 5;
    public static final int _LeavePartyCommand = 6;
    public static final int _MasterGoingToBeAttackedCommand = 7;
    public static final int _MasterAttackedOtherCommand = 8;
    public static final int _MasterSawTrapCommand = 9;
    public static final int _UnpossessFamiliarCommand = 10;
    public static final int _ReleaseDominationCommand = 11;
    public static final int _MasterUnderAttackCommand = 12;
    public static final int _UnsummonSummonedCommand = 13;
    public static final int _UnsummonAnimalCompanionCommand = 14;
    public static final int _UnsummonFamiliarCommand = 15;
    public static final int _GuardMasterCommand = 16;
    public static final int _MasterFailedLockpickCommand = 17;
    public static final int _FollowMasterCommand = 18;
    public static final int _HealMasterCommand = 19;
    public static final int _AttackNearestCommand = 20;
    public static final int _StandGroundCommand = 21;

    public static AssociateCommand
    convert(int val)
    {
        assert val >= 0 && val < 22;
        return values()[val];
    }

    public static AssociateCommand
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

    public static AssociateCommand
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(22);
        return AssociateCommand.convert(__v);
    }
}
