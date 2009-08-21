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

public enum ProjectilePathType implements java.io.Serializable
{
    DefaultPath,
    HomingPath,
    BallisticPath,
    HighBallisticPath,
    AcceleratingPath;

    public static final int _DefaultPath = 0;
    public static final int _HomingPath = 1;
    public static final int _BallisticPath = 2;
    public static final int _HighBallisticPath = 3;
    public static final int _AcceleratingPath = 4;

    public static ProjectilePathType
    convert(int val)
    {
        assert val >= 0 && val < 5;
        return values()[val];
    }

    public static ProjectilePathType
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

    public static ProjectilePathType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(5);
        return ProjectilePathType.convert(__v);
    }
}
