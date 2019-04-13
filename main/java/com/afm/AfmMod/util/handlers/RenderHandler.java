    
package com.afm.AfmMod.util.handlers;

import com.afm.AfmMod.entity.EntityMonkey;
import com.afm.AfmMod.entity.EntityPoacher;
import com.afm.AfmMod.entity.render.RenderMonkey;
import com.afm.AfmMod.entity.render.RenderPoacher;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMonkey.class, new IRenderFactory<EntityMonkey>()
	    {
			@Override
			public Render<? super EntityMonkey> createRenderFor(RenderManager manager) 
			{
				return new RenderMonkey(manager);
			}
	    });
		RenderingRegistry.registerEntityRenderingHandler(EntityPoacher.class, new IRenderFactory<EntityPoacher>()
	    {
			@Override
			public Render<? super EntityPoacher> createRenderFor(RenderManager manager) 
			{
				return new RenderPoacher(manager);
			}
	    });
	}
}