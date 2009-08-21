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

public final class NWCreatureEquipped implements java.lang.Cloneable, java.io.Serializable
{
    public NWObject[] all;

    public NWObject HeadSlot;

    public NWObject ChestSlot;

    public NWObject BootsSlot;

    public NWObject ArmsSlot;

    public NWObject RighthandSlot;

    public NWObject LefthandSlot;

    public NWObject CloakSlot;

    public NWObject LeftringSlot;

    public NWObject RightringSlot;

    public NWObject NeckSlot;

    public NWObject BeltSlot;

    public NWObject ArrowsSlot;

    public NWObject BulletsSlot;

    public NWObject BoltsSlot;

    public NWObject CreatureLefthandSlot;

    public NWObject CreatureRighthandSlot;

    public NWObject CreatureBiteSlot;

    public NWObject CreatureArmorSlot;

    public NWCreatureEquipped()
    {
    }

    public NWCreatureEquipped(NWObject[] all, NWObject HeadSlot, NWObject ChestSlot, NWObject BootsSlot, NWObject ArmsSlot, NWObject RighthandSlot, NWObject LefthandSlot, NWObject CloakSlot, NWObject LeftringSlot, NWObject RightringSlot, NWObject NeckSlot, NWObject BeltSlot, NWObject ArrowsSlot, NWObject BulletsSlot, NWObject BoltsSlot, NWObject CreatureLefthandSlot, NWObject CreatureRighthandSlot, NWObject CreatureBiteSlot, NWObject CreatureArmorSlot)
    {
        this.all = all;
        this.HeadSlot = HeadSlot;
        this.ChestSlot = ChestSlot;
        this.BootsSlot = BootsSlot;
        this.ArmsSlot = ArmsSlot;
        this.RighthandSlot = RighthandSlot;
        this.LefthandSlot = LefthandSlot;
        this.CloakSlot = CloakSlot;
        this.LeftringSlot = LeftringSlot;
        this.RightringSlot = RightringSlot;
        this.NeckSlot = NeckSlot;
        this.BeltSlot = BeltSlot;
        this.ArrowsSlot = ArrowsSlot;
        this.BulletsSlot = BulletsSlot;
        this.BoltsSlot = BoltsSlot;
        this.CreatureLefthandSlot = CreatureLefthandSlot;
        this.CreatureRighthandSlot = CreatureRighthandSlot;
        this.CreatureBiteSlot = CreatureBiteSlot;
        this.CreatureArmorSlot = CreatureArmorSlot;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        NWCreatureEquipped _r = null;
        try
        {
            _r = (NWCreatureEquipped)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(!java.util.Arrays.equals(all, _r.all))
            {
                return false;
            }
            if(HeadSlot != _r.HeadSlot && HeadSlot != null && !HeadSlot.equals(_r.HeadSlot))
            {
                return false;
            }
            if(ChestSlot != _r.ChestSlot && ChestSlot != null && !ChestSlot.equals(_r.ChestSlot))
            {
                return false;
            }
            if(BootsSlot != _r.BootsSlot && BootsSlot != null && !BootsSlot.equals(_r.BootsSlot))
            {
                return false;
            }
            if(ArmsSlot != _r.ArmsSlot && ArmsSlot != null && !ArmsSlot.equals(_r.ArmsSlot))
            {
                return false;
            }
            if(RighthandSlot != _r.RighthandSlot && RighthandSlot != null && !RighthandSlot.equals(_r.RighthandSlot))
            {
                return false;
            }
            if(LefthandSlot != _r.LefthandSlot && LefthandSlot != null && !LefthandSlot.equals(_r.LefthandSlot))
            {
                return false;
            }
            if(CloakSlot != _r.CloakSlot && CloakSlot != null && !CloakSlot.equals(_r.CloakSlot))
            {
                return false;
            }
            if(LeftringSlot != _r.LeftringSlot && LeftringSlot != null && !LeftringSlot.equals(_r.LeftringSlot))
            {
                return false;
            }
            if(RightringSlot != _r.RightringSlot && RightringSlot != null && !RightringSlot.equals(_r.RightringSlot))
            {
                return false;
            }
            if(NeckSlot != _r.NeckSlot && NeckSlot != null && !NeckSlot.equals(_r.NeckSlot))
            {
                return false;
            }
            if(BeltSlot != _r.BeltSlot && BeltSlot != null && !BeltSlot.equals(_r.BeltSlot))
            {
                return false;
            }
            if(ArrowsSlot != _r.ArrowsSlot && ArrowsSlot != null && !ArrowsSlot.equals(_r.ArrowsSlot))
            {
                return false;
            }
            if(BulletsSlot != _r.BulletsSlot && BulletsSlot != null && !BulletsSlot.equals(_r.BulletsSlot))
            {
                return false;
            }
            if(BoltsSlot != _r.BoltsSlot && BoltsSlot != null && !BoltsSlot.equals(_r.BoltsSlot))
            {
                return false;
            }
            if(CreatureLefthandSlot != _r.CreatureLefthandSlot && CreatureLefthandSlot != null && !CreatureLefthandSlot.equals(_r.CreatureLefthandSlot))
            {
                return false;
            }
            if(CreatureRighthandSlot != _r.CreatureRighthandSlot && CreatureRighthandSlot != null && !CreatureRighthandSlot.equals(_r.CreatureRighthandSlot))
            {
                return false;
            }
            if(CreatureBiteSlot != _r.CreatureBiteSlot && CreatureBiteSlot != null && !CreatureBiteSlot.equals(_r.CreatureBiteSlot))
            {
                return false;
            }
            if(CreatureArmorSlot != _r.CreatureArmorSlot && CreatureArmorSlot != null && !CreatureArmorSlot.equals(_r.CreatureArmorSlot))
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
        if(all != null)
        {
            for(int __i0 = 0; __i0 < all.length; __i0++)
            {
                if(all[__i0] != null)
                {
                    __h = 5 * __h + all[__i0].hashCode();
                }
            }
        }
        if(HeadSlot != null)
        {
            __h = 5 * __h + HeadSlot.hashCode();
        }
        if(ChestSlot != null)
        {
            __h = 5 * __h + ChestSlot.hashCode();
        }
        if(BootsSlot != null)
        {
            __h = 5 * __h + BootsSlot.hashCode();
        }
        if(ArmsSlot != null)
        {
            __h = 5 * __h + ArmsSlot.hashCode();
        }
        if(RighthandSlot != null)
        {
            __h = 5 * __h + RighthandSlot.hashCode();
        }
        if(LefthandSlot != null)
        {
            __h = 5 * __h + LefthandSlot.hashCode();
        }
        if(CloakSlot != null)
        {
            __h = 5 * __h + CloakSlot.hashCode();
        }
        if(LeftringSlot != null)
        {
            __h = 5 * __h + LeftringSlot.hashCode();
        }
        if(RightringSlot != null)
        {
            __h = 5 * __h + RightringSlot.hashCode();
        }
        if(NeckSlot != null)
        {
            __h = 5 * __h + NeckSlot.hashCode();
        }
        if(BeltSlot != null)
        {
            __h = 5 * __h + BeltSlot.hashCode();
        }
        if(ArrowsSlot != null)
        {
            __h = 5 * __h + ArrowsSlot.hashCode();
        }
        if(BulletsSlot != null)
        {
            __h = 5 * __h + BulletsSlot.hashCode();
        }
        if(BoltsSlot != null)
        {
            __h = 5 * __h + BoltsSlot.hashCode();
        }
        if(CreatureLefthandSlot != null)
        {
            __h = 5 * __h + CreatureLefthandSlot.hashCode();
        }
        if(CreatureRighthandSlot != null)
        {
            __h = 5 * __h + CreatureRighthandSlot.hashCode();
        }
        if(CreatureBiteSlot != null)
        {
            __h = 5 * __h + CreatureBiteSlot.hashCode();
        }
        if(CreatureArmorSlot != null)
        {
            __h = 5 * __h + CreatureArmorSlot.hashCode();
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
        NWObjectSeqHelper.write(__os, all);
        HeadSlot.__write(__os);
        ChestSlot.__write(__os);
        BootsSlot.__write(__os);
        ArmsSlot.__write(__os);
        RighthandSlot.__write(__os);
        LefthandSlot.__write(__os);
        CloakSlot.__write(__os);
        LeftringSlot.__write(__os);
        RightringSlot.__write(__os);
        NeckSlot.__write(__os);
        BeltSlot.__write(__os);
        ArrowsSlot.__write(__os);
        BulletsSlot.__write(__os);
        BoltsSlot.__write(__os);
        CreatureLefthandSlot.__write(__os);
        CreatureRighthandSlot.__write(__os);
        CreatureBiteSlot.__write(__os);
        CreatureArmorSlot.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        all = NWObjectSeqHelper.read(__is);
        HeadSlot = new NWObject();
        HeadSlot.__read(__is);
        ChestSlot = new NWObject();
        ChestSlot.__read(__is);
        BootsSlot = new NWObject();
        BootsSlot.__read(__is);
        ArmsSlot = new NWObject();
        ArmsSlot.__read(__is);
        RighthandSlot = new NWObject();
        RighthandSlot.__read(__is);
        LefthandSlot = new NWObject();
        LefthandSlot.__read(__is);
        CloakSlot = new NWObject();
        CloakSlot.__read(__is);
        LeftringSlot = new NWObject();
        LeftringSlot.__read(__is);
        RightringSlot = new NWObject();
        RightringSlot.__read(__is);
        NeckSlot = new NWObject();
        NeckSlot.__read(__is);
        BeltSlot = new NWObject();
        BeltSlot.__read(__is);
        ArrowsSlot = new NWObject();
        ArrowsSlot.__read(__is);
        BulletsSlot = new NWObject();
        BulletsSlot.__read(__is);
        BoltsSlot = new NWObject();
        BoltsSlot.__read(__is);
        CreatureLefthandSlot = new NWObject();
        CreatureLefthandSlot.__read(__is);
        CreatureRighthandSlot = new NWObject();
        CreatureRighthandSlot.__read(__is);
        CreatureBiteSlot = new NWObject();
        CreatureBiteSlot.__read(__is);
        CreatureArmorSlot = new NWObject();
        CreatureArmorSlot.__read(__is);
    }
}
