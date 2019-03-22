package com.afm.AfmMod.util.handlers;

import com.afm.AfmMod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	public static SoundEvent ENTITY_MONKEY_AMBIENT, ENTITY_MONKEY_HURT, ENTITY_MONKEY_DEATH;
	
	public static void registerSounds()
	{
		ENTITY_MONKEY_AMBIENT = registerSound("entity.monkey.ambient");
		ENTITY_MONKEY_HURT = registerSound("entity.monkey.hurt");
		ENTITY_MONKEY_DEATH = registerSound("entity.monkey.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
