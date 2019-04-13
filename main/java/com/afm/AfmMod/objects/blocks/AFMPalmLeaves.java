package com.afm.AfmMod.objects.blocks;

import com.afm.AfmMod.objects.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AFMPalmLeaves extends BlockBase {

    public static final PropertyBool DECAYABLE = PropertyBool.create("decayable");
    public static final PropertyBool CHECK_DECAY = PropertyBool.create("check_decay");
    protected boolean leavesFancy;
    int[] surroundings;
	
	public AFMPalmLeaves(Material material, String name) 
	{
		super(Material.LEAVES, name);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setSoundType(SoundType.PLANT);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}