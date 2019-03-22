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
	
	public static final Item Banana = new ItemFoodBase("banana", 4, false);
	public static final Item Frozen_banana = new ItemFrozenBanana("frozen_banana", 2, false);
	public static final ItemMonkeyHand MONKEY_HAND = new ItemMonkeyHand("monkey_hand", Main.afmmodtab, 3);
}
