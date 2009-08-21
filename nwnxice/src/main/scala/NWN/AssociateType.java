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

public enum AssociateType implements java.io.Serializable
{
    NoAssociate,
    HenchmanAssociate,
    AnimalCompanionAssociate,
    FamiliarAssociate,
    SummonedAssociate,
    DominatedAssociate;

    public static final int _NoAssociate = 0;
    public static final int _HenchmanAssociate = 1;
    public static final int _AnimalCompanionAssociate = 2;
    public static final int _FamiliarAssociate = 3;
    public static final int _SummonedAssociate = 4;
    public static final int _DominatedAssociate = 5;

    public static AssociateType
    convert(int val)
    {
        assert val >= 0 && val < 6;
        return values()[val];
    }

    public static AssociateType
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

    public static AssociateType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(6);
        return AssociateType.convert(__v);
    }
}
