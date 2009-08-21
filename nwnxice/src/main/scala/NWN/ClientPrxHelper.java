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

public final class ClientPrxHelper extends Ice.ObjectPrxHelperBase implements ClientPrx
{
    public ClientResult
    event(NWScriptPrx proxy, NWObject self, String evt)
    {
        return event(proxy, self, evt, null, false);
    }

    public ClientResult
    event(NWScriptPrx proxy, NWObject self, String evt, java.util.Map<String, String> __ctx)
    {
        return event(proxy, self, evt, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private ClientResult
    event(NWScriptPrx proxy, NWObject self, String evt, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("event");
                __delBase = __getDelegate(false);
                _ClientDel __del = (_ClientDel)__delBase;
                return __del.event(proxy, self, evt, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex, null);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public void
    token(NWScriptPrx proxy, NWObject self, String tok)
    {
        token(proxy, self, tok, null, false);
    }

    public void
    token(NWScriptPrx proxy, NWObject self, String tok, java.util.Map<String, String> __ctx)
    {
        token(proxy, self, tok, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    token(NWScriptPrx proxy, NWObject self, String tok, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _ClientDel __del = (_ClientDel)__delBase;
                __del.token(proxy, self, tok, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public static ClientPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        ClientPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ClientPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::NWN::Client"))
                {
                    ClientPrxHelper __h = new ClientPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ClientPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        ClientPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ClientPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::NWN::Client", __ctx))
                {
                    ClientPrxHelper __h = new ClientPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ClientPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ClientPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::NWN::Client"))
                {
                    ClientPrxHelper __h = new ClientPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ClientPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        ClientPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::NWN::Client", __ctx))
                {
                    ClientPrxHelper __h = new ClientPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ClientPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        ClientPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ClientPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                ClientPrxHelper __h = new ClientPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static ClientPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ClientPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            ClientPrxHelper __h = new ClientPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _ClientDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _ClientDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, ClientPrx v)
    {
        __os.writeProxy(v);
    }

    public static ClientPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ClientPrxHelper result = new ClientPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
