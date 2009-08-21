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

public enum IPAlignment implements java.io.Serializable
{
    LgAlignment,
    LnAlignment,
    LeAlignment,
    NgAlignment,
    TnAlignment,
    NeAlignment,
    CgAlignment,
    CnAlignment,
    CeAlignment;

    public static final int _LgAlignment = 0;
    public static final int _LnAlignment = 1;
    public static final int _LeAlignment = 2;
    public static final int _NgAlignment = 3;
    public static final int _TnAlignment = 4;
    public static final int _NeAlignment = 5;
    public static final int _CgAlignment = 6;
    public static final int _CnAlignment = 7;
    public static final int _CeAlignment = 8;

    public static IPAlignment
    convert(int val)
    {
        assert val >= 0 && val < 9;
        return values()[val];
    }

    public static IPAlignment
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

    public static IPAlignment
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(9);
        return IPAlignment.convert(__v);
    }
}
