package com.afm.AfmMod.proxy;

import com.afm.AfmMod.util.Reference;
import com.afm.AfmMod.util.handlers.RenderHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy 
{
	@Override
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta,String filename, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), id));
	}
	
	    public void preInit(FMLPreInitializationEvent event)
	    {
	        super.preInit();
	        RenderHandler.registerEntityRenders();
	    }

	    public void init(FMLInitializationEvent event)
	    {
	        super.init();
	    }

	    public void postInit(FMLPostInitializationEvent event)
	    {
	        super.postInit();
	    }
}