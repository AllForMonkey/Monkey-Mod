package com.afm.AfmMod.objects.items;

import com.afm.AfmMod.Main;
import com.afm.AfmMod.init.ItemInit;
import com.afm.AfmMod.init.PotionInit;
import com.afm.AfmMod.util.interfaces.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFrozenBanana extends ItemFood implements IHasModel
{
	public ItemFrozenBanana(String name, int amount, boolean isWolfFood) 
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.afmmodtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) 
	{
		if(!worldIn.isRemote)
		{
			player.addPotionEffect(new PotionEffect(PotionInit.FREEZE, 1200));
		}
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
}
