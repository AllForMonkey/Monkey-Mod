package com.afm.AfmMod.objects.blocks;

import com.afm.AfmMod.objects.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AFMWood extends BlockBase 
{
	
	public static final AxisAlignedBB AFM_WOOD_AABB = new AxisAlignedBB(0.1875D, 0, 0.1875D, 0.8125D, 1D, 0.8125D);
	
	public AFMWood(Material material, String name) 
	{
		super(Material.WOOD, name);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		   return AFM_WOOD_AABB;
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
        return BlockRenderLayer.CUTOUT;
    }
    
    @Override
    public SoundType getSoundType(IBlockState state, World world, BlockPos pos, Entity entity) 
    {
    	return blockSoundType.WOOD;
    }
    
}
