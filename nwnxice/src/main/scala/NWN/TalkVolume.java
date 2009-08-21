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

public enum TalkVolume implements java.io.Serializable
{
    TalkVol,
    WhisperVol,
    ShoutVol,
    SilentTalkVol,
    SilentShoutVol,
    PartyVol,
    TellVol;

    public static final int _TalkVol = 0;
    public static final int _WhisperVol = 1;
    public static final int _ShoutVol = 2;
    public static final int _SilentTalkVol = 3;
    public static final int _SilentShoutVol = 4;
    public static final int _PartyVol = 5;
    public static final int _TellVol = 6;

    public static TalkVolume
    convert(int val)
    {
        assert val >= 0 && val < 7;
        return values()[val];
    }

    public static TalkVolume
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

    public static TalkVolume
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(7);
        return TalkVolume.convert(__v);
    }
}
