package com.afm.AfmMod.proxy;

import java.io.File;

import com.afm.AfmMod.init.EntityInit;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod.EventBusSubscriber
public class CommonProxy 
{
		public void registerModel(Item item, int metadata) {}
}
