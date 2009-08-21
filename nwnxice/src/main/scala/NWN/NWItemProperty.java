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

public final class NWItemProperty implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public DurationType tDurationType;

    public int tType;

    public int tSubType;

    public int tCostTable;

    public int tCostTableValue;

    public int tParam1;

    public int tParam1Value;

    public NWItemProperty()
    {
    }

    public NWItemProperty(long id, DurationType tDurationType, int tType, int tSubType, int tCostTable, int tCostTableValue, int tParam1, int tParam1Value)
    {
        this.id = id;
        this.tDurationType = tDurationType;
        this.tType = tType;
        this.tSubType = tSubType;
        this.tCostTable = tCostTable;
        this.tCostTableValue = tCostTableValue;
        this.tParam1 = tParam1;
        this.tParam1Value = tParam1Value;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        NWItemProperty _r = null;
        try
        {
            _r = (NWItemProperty)rhs;
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
            if(tCostTable != _r.tCostTable)
            {
                return false;
            }
            if(tCostTableValue != _r.tCostTableValue)
            {
                return false;
            }
            if(tParam1 != _r.tParam1)
            {
                return false;
            }
            if(tParam1Value != _r.tParam1Value)
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
        __h = 5 * __h + tCostTable;
        __h = 5 * __h + tCostTableValue;
        __h = 5 * __h + tParam1;
        __h = 5 * __h + tParam1Value;
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
        __os.writeInt(tCostTable);
        __os.writeInt(tCostTableValue);
        __os.writeInt(tParam1);
        __os.writeInt(tParam1Value);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        tDurationType = DurationType.__read(__is);
        tType = __is.readInt();
        tSubType = __is.readInt();
        tCostTable = __is.readInt();
        tCostTableValue = __is.readInt();
        tParam1 = __is.readInt();
        tParam1Value = __is.readInt();
    }
}
