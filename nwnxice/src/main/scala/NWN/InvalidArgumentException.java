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

public class InvalidArgumentException extends Ice.UserException
{
    public InvalidArgumentException()
    {
    }

    public InvalidArgumentException(String message)
    {
        this.message = message;
    }

    public String
    ice_name()
    {
        return "NWN::InvalidArgumentException";
    }

    public String message;

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString("::NWN::InvalidArgumentException");
        __os.startWriteSlice();
        __os.writeString(message);
        __os.endWriteSlice();
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readString();
        }
        __is.startReadSlice();
        message = __is.readString();
        __is.endReadSlice();
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "exception NWN::InvalidArgumentException was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "exception NWN::InvalidArgumentException was not generated with stream support";
        throw ex;
    }
}