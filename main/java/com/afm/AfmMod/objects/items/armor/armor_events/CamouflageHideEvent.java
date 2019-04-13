package com.afm.AfmMod.objects.items.armor.armor_events;

import com.afm.AfmMod.init.ItemInit;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class CamouflageHideEvent
{
@SubscribeEvent
public static void CamouflageHide(LivingSetAttackTargetEvent event) 
    {
	EntityLivingBase target = event.getTarget();
	EntityLivingBase entitylivingbase = event.getEntityLiving();
	if (entitylivingbase instanceof EntityLiving) 
	{
		 EntityLiving entity = (EntityLiving) entitylivingbase;
		if (target != null &&  target instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) target;
			ItemStack stack = player.inventory.armorItemInSlot(2); 
			
			if ((stack.getItem() instanceof ItemArmor) && ((ItemArmor)stack.getItem()).getArmorMaterial() == ItemInit.CAMOUFLAGE_MATERIAL)
				{
					
				{
					entity.setAttackTarget(null);
			    }
				}
	    }
		}
    }

public EntityLivingBase getTarget()
{
	return null;
}

}
