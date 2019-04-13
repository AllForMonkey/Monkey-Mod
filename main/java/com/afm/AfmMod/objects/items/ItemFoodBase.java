package com.afm.AfmMod.objects.items;

import com.afm.AfmMod.Main;
import com.afm.AfmMod.init.ItemInit;
import com.afm.AfmMod.util.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood implements IHasModel
{
	public ItemFoodBase(String name, int amount, boolean isWolfFood) 
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.afmmodtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
}
