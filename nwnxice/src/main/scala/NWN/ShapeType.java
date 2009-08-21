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

public enum ShapeType implements java.io.Serializable
{
    SpellCylinderShape,
    ConeShape,
    CubeShape,
    SpellConeShape,
    SphereShape;

    public static final int _SpellCylinderShape = 0;
    public static final int _ConeShape = 1;
    public static final int _CubeShape = 2;
    public static final int _SpellConeShape = 3;
    public static final int _SphereShape = 4;

    public static ShapeType
    convert(int val)
    {
        assert val >= 0 && val < 5;
        return values()[val];
    }

    public static ShapeType
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

    public static ShapeType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(5);
        return ShapeType.convert(__v);
    }
}
