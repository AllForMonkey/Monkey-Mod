package com.afm.AfmMod.init;

import com.afm.AfmMod.potions.CustomPotion;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionInit 
{
	public static final Potion FREEZE = new CustomPotion("freeze_potion", false, 553686, 0, 0).registerPotionAttributeModifier(SharedMonsterAttributes.MOVEMENT_SPEED, MathHelper.getRandomUUID().toString(), 00.0D, 2);
	
	public static final PotionType FREEZE_POTION = new PotionType("freeze_potion", new PotionEffect[] {new PotionEffect(FREEZE, 2400)}).setRegistryName("freeze_potion");
	public static final PotionType LONG_FREEZE_POTION = new PotionType("freeze_potion", new PotionEffect[] {new PotionEffect(FREEZE, 4800)}).setRegistryName("long_freeze_potion");
	
	public static void registerPotions()
	{
		registerPotion(FREEZE_POTION, LONG_FREEZE_POTION, FREEZE);
		
		registerPotionMixes();
	}
	
	private static void registerPotion(PotionType defaultPotion, PotionType longPotion, Potion effect)
	{
		ForgeRegistries.POTIONS.register(effect);
		ForgeRegistries.POTION_TYPES.register(defaultPotion);
		ForgeRegistries.POTION_TYPES.register(longPotion);
	}
	
	private static void registerPotionMixes()
	{
		PotionHelper.addMix(FREEZE_POTION, Items.REDSTONE, LONG_FREEZE_POTION);
		PotionHelper.addMix(PotionTypes.AWKWARD, ItemInit.Frozen_banana, FREEZE_POTION);
	}
}
