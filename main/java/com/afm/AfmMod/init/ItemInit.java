package com.afm.AfmMod.init;

import java.util.ArrayList;
import java.util.List;

import com.afm.AfmMod.Main;
import com.afm.AfmMod.objects.items.ItemBase;
import com.afm.AfmMod.objects.items.ItemFoodBase;
import com.afm.AfmMod.objects.items.ItemFrozenBanana;
import com.afm.AfmMod.objects.items.ItemMonkeyHand;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Materials
	public static final ArmorMaterial TIKI_MASK_MATERIAL = EnumHelper.addArmorMaterial("tiki_mask_material", Reference.MODID + ":tiki_mask_material", 
			20, new int[] {5, 5, 5, 5}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ArmorMaterial CAMOUFLAGE_MATERIAL = EnumHelper.addArmorMaterial("camouflage_material", Reference.MODID + ":camouflage_material", 
			1, new int[] {1, 1, 1, 1}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Food
	public static final Item Banana = new ItemFoodBase("banana", 4, false);
	public static final Item Frozen_banana = new ItemFrozenBanana("frozen_banana", 2, false);
	
	//Items
	public static final ItemMonkeyHand MONKEY_HAND = new ItemMonkeyHand("monkey_hand", Main.afmmodtab, 3);
	
	//Armor
	public static final Item TIKI_MASK = new TikiMask("tiki_mask", Main.afmmodtab, TIKI_MASK_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item CAMOUFLAGE = new Camouflage("camouflage", Main.afmmodtab, CAMOUFLAGE_MATERIAL, EntityEquipmentSlot.CHEST);
}
