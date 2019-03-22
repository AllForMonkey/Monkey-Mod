package com.afm.AfmMod.proxy;

import java.io.File;

import com.afm.AfmMod.Config;
import com.afm.AfmMod.init.EntityInit;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod.EventBusSubscriber
public class CommonProxy 
{

	public void registerItemRenderer(Item item, int meta, String id) {}
    public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
    
    	public void preInit()
    	    {	
    	    }

    	public void init()
    	    {    
    		   EntityInit.registerEntities();
    	    }

    	public void postInit() {}
    	
		public void registerModel(Item item, int metadata) {}
	}
