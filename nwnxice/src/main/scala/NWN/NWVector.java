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

public final class NWVector implements java.lang.Cloneable, java.io.Serializable
{
    public float x;

    public float y;

    public float z;

    public NWVector()
    {
    }

    public NWVector(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        NWVector _r = null;
        try
        {
            _r = (NWVector)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(x != _r.x)
            {
                return false;
            }
            if(y != _r.y)
            {
                return false;
            }
            if(z != _r.z)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 0;
        __h = 5 * __h + java.lang.Float.floatToIntBits(x);
        __h = 5 * __h + java.lang.Float.floatToIntBits(y);
        __h = 5 * __h + java.lang.Float.floatToIntBits(z);
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeFloat(x);
        __os.writeFloat(y);
        __os.writeFloat(z);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        x = __is.readFloat();
        y = __is.readFloat();
        z = __is.readFloat();
    }
}
