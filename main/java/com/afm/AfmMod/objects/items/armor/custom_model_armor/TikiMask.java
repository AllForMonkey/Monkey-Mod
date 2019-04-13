package com.afm.AfmMod.objects.items.armor.custom_model_armor;

import com.afm.AfmMod.Main;
import com.afm.AfmMod.init.ItemInit;
import com.afm.AfmMod.objects.items.armor.custom_model_armor.armor_model.ModelTikiMask;
import com.afm.AfmMod.util.interfaces.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class TikiMask extends ItemArmor implements IHasModel 
{
	public TikiMask(String name, CreativeTabs tab, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, 1, equipmentSlotIn);
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

	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) 
	{
		if(itemStack != ItemStack.EMPTY)
		{
		if(itemStack.getItem() instanceof ItemArmor)
			{
				ModelTikiMask model = new ModelTikiMask();
				
				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				
				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				model.rightArmPose = _default.rightArmPose;
				model.leftArmPose = _default.leftArmPose;
				
				return model;
			}
		}
		
		return null;
	}
	
}