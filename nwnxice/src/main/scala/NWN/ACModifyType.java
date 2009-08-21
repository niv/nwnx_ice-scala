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

public enum ACModifyType implements java.io.Serializable
{
    ACDodgeBonus,
    ACNaturalBonus,
    ACArmorEnchantmentBonus,
    ACShieldEnchantmentBonus,
    ACDeflectionBonus;

    public static final int _ACDodgeBonus = 0;
    public static final int _ACNaturalBonus = 1;
    public static final int _ACArmorEnchantmentBonus = 2;
    public static final int _ACShieldEnchantmentBonus = 3;
    public static final int _ACDeflectionBonus = 4;

    public static ACModifyType
    convert(int val)
    {
        assert val >= 0 && val < 5;
        return values()[val];
    }

    public static ACModifyType
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

    public static ACModifyType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(5);
        return ACModifyType.convert(__v);
    }
}
