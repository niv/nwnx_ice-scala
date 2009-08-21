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

public final class NWEffect implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public DurationType tDurationType;

    public int tType;

    public int tSubType;

    public boolean tIconShown;

    public NWObject tCreator;

    public NWEffect()
    {
    }

    public NWEffect(long id, DurationType tDurationType, int tType, int tSubType, boolean tIconShown, NWObject tCreator)
    {
        this.id = id;
        this.tDurationType = tDurationType;
        this.tType = tType;
        this.tSubType = tSubType;
        this.tIconShown = tIconShown;
        this.tCreator = tCreator;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        NWEffect _r = null;
        try
        {
            _r = (NWEffect)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                return false;
            }
            if(tDurationType != _r.tDurationType && tDurationType != null && !tDurationType.equals(_r.tDurationType))
            {
                return false;
            }
            if(tType != _r.tType)
            {
                return false;
            }
            if(tSubType != _r.tSubType)
            {
                return false;
            }
            if(tIconShown != _r.tIconShown)
            {
                return false;
            }
            if(tCreator != _r.tCreator && tCreator != null && !tCreator.equals(_r.tCreator))
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
        __h = 5 * __h + (int)id;
        if(tDurationType != null)
        {
            __h = 5 * __h + tDurationType.hashCode();
        }
        __h = 5 * __h + tType;
        __h = 5 * __h + tSubType;
        __h = 5 * __h + (tIconShown ? 1 : 0);
        if(tCreator != null)
        {
            __h = 5 * __h + tCreator.hashCode();
        }
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
        __os.writeLong(id);
        tDurationType.__write(__os);
        __os.writeInt(tType);
        __os.writeInt(tSubType);
        __os.writeBool(tIconShown);
        tCreator.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        tDurationType = DurationType.__read(__is);
        tType = __is.readInt();
        tSubType = __is.readInt();
        tIconShown = __is.readBool();
        tCreator = new NWObject();
        tCreator.__read(__is);
    }
}
