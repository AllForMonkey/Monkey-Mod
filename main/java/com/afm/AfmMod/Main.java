package com.afm.AfmMod;

import org.apache.logging.log4j.Logger;

import com.afm.AfmMod.proxy.CommonProxy;
import com.afm.AfmMod.tabs.AfmModTab;
import com.afm.AfmMod.util.Reference;
import com.afm.AfmMod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static final CreativeTabs afmmodtab = new AfmModTab("afmmodtab");
	
	@Instance
	public static Main instance;
	
     public static Logger logger;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		RegistryHandler.preInitRegistries(event);
        logger = event.getModLog();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		RegistryHandler.postInitRegistries(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries(event);
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
}
