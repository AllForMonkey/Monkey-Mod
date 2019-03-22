package com.afm.AfmMod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;

import java.util.Random;
import javax.annotation.Nullable;
import com.afm.AfmMod.objects.blocks.BlockBase;
import com.google.common.base.Predicate;
import com.google.common.base.Predicate;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumFacing.Axis;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AFMStandingTorch extends BlockBase
{		

	public static boolean isOn;
	
	public static final AxisAlignedBB STANDING_TORCH_AABB = new AxisAlignedBB(0.40625D, 0, 0.40625D, 0.59375D, 1.875D, 0.59375D);
	
	public AFMStandingTorch(String name, boolean isOn) 
	{
		super(Material.WOOD, name);
        this.setTickRandomly(true);
        
        this.isOn = isOn;
        
        if (isOn) {
        	this.setLightLevel(1.0F);
        }
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		   return STANDING_TORCH_AABB;
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
	
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        double d0 = (double)pos.getX() + 0.5D;
        double d1 = (double)pos.getY() + 1.875D;
        double d2 = (double)pos.getZ() + 0.5D;

        worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D);
        worldIn.spawnParticle(EnumParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    
    @Override
    public SoundType getSoundType(IBlockState state, World world, BlockPos pos, Entity entity) 
    {
	    return blockSoundType.PLANT;
    }
}
