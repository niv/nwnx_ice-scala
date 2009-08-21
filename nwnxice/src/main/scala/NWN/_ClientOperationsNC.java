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

public interface _ClientOperationsNC
{
    ClientResult event(NWScriptPrx proxy, NWObject self, String evt);

    void token(NWScriptPrx proxy, NWObject self, String tok);
}
