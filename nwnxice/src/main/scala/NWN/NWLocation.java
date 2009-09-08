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

public final class NWLocation implements java.lang.Cloneable, java.io.Serializable
{
    public NWObject area;

    public double x;

    public double y;

    public double z;

    public double facing;

    public NWLocation()
    {
    }

    public NWLocation(NWObject area, double x, double y, double z, double facing)
    {
        this.area = area;
        this.x = x;
        this.y = y;
        this.z = z;
        this.facing = facing;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        NWLocation _r = null;
        try
        {
            _r = (NWLocation)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(area != _r.area && area != null && !area.equals(_r.area))
            {
                return false;
            }
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
            if(facing != _r.facing)
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
        if(area != null)
        {
            __h = 5 * __h + area.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(x);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(y);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(z);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(facing);
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
        area.__write(__os);
        __os.writeDouble(x);
        __os.writeDouble(y);
        __os.writeDouble(z);
        __os.writeDouble(facing);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        area = new NWObject();
        area.__read(__is);
        x = __is.readDouble();
        y = __is.readDouble();
        z = __is.readDouble();
        facing = __is.readDouble();
    }
}
