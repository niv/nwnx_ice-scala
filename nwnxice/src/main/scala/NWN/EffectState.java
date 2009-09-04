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

public enum EffectState implements java.io.Serializable
{
    CharmedState,
    ConfusedState,
    FrightenedState,
    TurnedState,
    DazedState,
    StunnedState,
    DominatedState,
    ParalyzeState,
    SleepState;

    public static final int _CharmedState = 0;
    public static final int _ConfusedState = 1;
    public static final int _FrightenedState = 2;
    public static final int _TurnedState = 3;
    public static final int _DazedState = 4;
    public static final int _StunnedState = 5;
    public static final int _DominatedState = 6;
    public static final int _ParalyzeState = 7;
    public static final int _SleepState = 8;

    public static EffectState
    convert(int val)
    {
        assert val >= 0 && val < 9;
        return values()[val];
    }

    public static EffectState
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

    public static EffectState
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(9);
        return EffectState.convert(__v);
    }
}
