package com.afm.AfmMod.util.handlers;

import java.io.File;

import com.afm.AfmMod.Config;
import com.afm.AfmMod.Main;
import com.afm.AfmMod.entity.EntityMonkey;
import com.afm.AfmMod.init.BlockInit;
import com.afm.AfmMod.init.EntityInit;
import com.afm.AfmMod.init.ItemInit;
import com.afm.AfmMod.init.PotionInit;
import com.afm.AfmMod.util.interfaces.IHasModel;
import com.afm.AfmMod.world.gen.WorldGenCustomStructures;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeCache;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	
    public static Configuration config;
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		Main.proxy.preInit();	
		
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		
		//config code :D
		File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "afmmod.cfg"));
        Config.readConfig();
        
        //Init mate
   		RenderHandler.registerEntityRenders();
		PotionInit.registerPotions();
	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{
		Main.proxy.init();
		SoundsHandler.registerSounds();
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event)
	{
		Main.proxy.postInit();
		
	    {    
            if (config.hasChanged()) {
                config.save(); }}
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
}

