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
    public double x;

    public double y;

    public double z;

    public NWVector()
    {
    }

    public NWVector(double x, double y, double z)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(x);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(y);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(z);
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
        __os.writeDouble(x);
        __os.writeDouble(y);
        __os.writeDouble(z);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        x = __is.readDouble();
        y = __is.readDouble();
        z = __is.readDouble();
    }
}
