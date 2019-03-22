package com.afm.AfmMod.init;

import java.util.ArrayList;
import java.util.List;

import com.afm.AfmMod.objects.blocks.AFMPalmLeaves;
import com.afm.AfmMod.objects.blocks.AFMPalmPlanks;
import com.afm.AfmMod.objects.blocks.AFMPalmSapling;
import com.afm.AfmMod.objects.blocks.AFMStandingTorch;
import com.afm.AfmMod.objects.blocks.AFMWood;
import com.afm.AfmMod.objects.blocks.BlockBase;
import com.afm.AfmMod.objects.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PALM_WOOD = new AFMWood(Material.WOOD, "palm_wood");
	public static final Block PALM_PLANKS = new AFMPalmPlanks("palm_planks", Material.WOOD);
    public static final Block STANDING_TORCH = new AFMStandingTorch("standing_torch", true);
    public static final Block PALM_LEAVES = new AFMPalmLeaves(Material.LEAVES, "palm_leaves");
    public static final Block PALM_SAPLING = new AFMPalmSapling("palm_sapling");
}

