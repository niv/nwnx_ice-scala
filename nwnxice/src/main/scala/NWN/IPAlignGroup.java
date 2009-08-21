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

public enum IPAlignGroup implements java.io.Serializable
{
    AllAlignGroup,
    NeutralAlignGroup,
    LawfulAlignGroup,
    ChaoticAlignGroup,
    GoodAlignGroup,
    EvilAlignGroup;

    public static final int _AllAlignGroup = 0;
    public static final int _NeutralAlignGroup = 1;
    public static final int _LawfulAlignGroup = 2;
    public static final int _ChaoticAlignGroup = 3;
    public static final int _GoodAlignGroup = 4;
    public static final int _EvilAlignGroup = 5;

    public static IPAlignGroup
    convert(int val)
    {
        assert val >= 0 && val < 6;
        return values()[val];
    }

    public static IPAlignGroup
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

    public static IPAlignGroup
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(6);
        return IPAlignGroup.convert(__v);
    }
}
