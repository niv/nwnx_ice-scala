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

public enum Weather implements java.io.Serializable
{
    InvalidWeather,
    ClearWeather,
    RainWeather,
    SnowWeather,
    AreaDefaultsWeather;

    public static final int _InvalidWeather = 0;
    public static final int _ClearWeather = 1;
    public static final int _RainWeather = 2;
    public static final int _SnowWeather = 3;
    public static final int _AreaDefaultsWeather = 4;

    public static Weather
    convert(int val)
    {
        assert val >= 0 && val < 5;
        return values()[val];
    }

    public static Weather
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

    public static Weather
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(5);
        return Weather.convert(__v);
    }
}
