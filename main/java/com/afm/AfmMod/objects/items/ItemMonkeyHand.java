package com.afm.AfmMod.objects.items;

import com.afm.AfmMod.Main;
import com.afm.AfmMod.init.ItemInit;
import com.afm.AfmMod.util.interfaces.IHasModel;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemMonkeyHand extends Item implements IHasModel
{

	public ItemMonkeyHand(String name, CreativeTabs tab, int dura)
    {
    	this.setUnlocalizedName(name);
    	this.setRegistryName(name);
        this.maxStackSize = 1;
        this.setCreativeTab(tab);
        this.setMaxDamage(dura);
        ItemInit.ITEMS.add(this);
    }

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.damageItem(1, playerIn);
        }
        if (!worldIn.isRemote)
        {
        	playerIn.addPotionEffect(new PotionEffect(MobEffects.LUCK,100, 0));
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }


    @Override
    public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}