package com.afm.AfmMod.util.handlers;

import com.afm.AfmMod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation MONKEY = LootTableList.register(new ResourceLocation(Reference.MODID, "monkey"));
	public static final ResourceLocation POACHER = LootTableList.register(new ResourceLocation(Reference.MODID, "poacher"));
}
