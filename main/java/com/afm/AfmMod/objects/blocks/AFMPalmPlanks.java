package com.afm.AfmMod.objects.blocks;

import com.afm.AfmMod.objects.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AFMPalmPlanks extends BlockBase {

	public AFMPalmPlanks(String name, Material material) 
	{
		super(material, name);
		
		setSoundType(SoundType.WOOD);
	}

}
