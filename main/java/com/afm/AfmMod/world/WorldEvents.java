package com.afm.AfmMod.world;

import com.afm.AfmMod.init.PotionInit;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@EventBusSubscriber
public class WorldEvents 
{
	@SubscribeEvent
	public static void FreezePotionActive(PlayerTickEvent event)
	{
		boolean isActive = false;
		if(event.player.isPotionActive(PotionInit.FREEZE)) isActive = true;
		
		if(isActive)
		{
			
		}
	}
}
