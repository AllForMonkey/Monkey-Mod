package com.afm.AfmMod.init;

import com.afm.AfmMod.Main;
import com.afm.AfmMod.entity.EntityMonkey;
import com.afm.AfmMod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("monkey", EntityMonkey.class, Reference.ENTITY_MONKEY, 100, 11437146, 000000);
		registerEntity("poacher", EntityPoacher.class, Reference.ENTITY_POACHER, 200, 3080386, 3115957);
	}
	
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
