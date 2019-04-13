package com.afm.AfmMod.entity;

import com.afm.AfmMod.init.ItemInit;
import com.afm.AfmMod.util.handlers.LootTableHandler;
import com.afm.AfmMod.util.handlers.SoundsHandler;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityPoacher extends EntityMob
{
    private final EntityAIAttackMelee aiAttackOnCollide = new EntityAIAttackMelee(this, 1.2D, false);
	public EntityPoacher(World worldIn) 
	{
		super(worldIn);
        this.setSize(0.6F, 1.95F);
	}
	
	@Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
    }
	
	@Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.setCombatTask();
    }
	
    public void setCombatTask()
    {
        if (this.world != null && !this.world.isRemote)
        {
            this.tasks.removeTask(this.aiAttackOnCollide);
            this.tasks.addTask(4, this.aiAttackOnCollide);
        }
    }
	
	@Override
	protected void initEntityAI() 
	{
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.tasks.addTask(10, new EntityAIWanderAvoidWater(this, 0.8D, 1.0000001E-5F));
        this.targetTasks.addTask(13, new EntityAINearestAttackableTarget(this, EntityMonkey.class, true));
        this.targetTasks.addTask(12, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(12, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
    }	
	@Override
    protected boolean canDespawn()
    {
        return true;
    }

	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0F);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30D);
	}
		
	@Override
	protected ResourceLocation getLootTable() 
	{
		return LootTableHandler.POACHER;
	}
	//yes i know im not using orignal sounds but idk how to make illager sounds
	@Override
	protected SoundEvent getAmbientSound() 
	{
		return SoundEvents.ENTITY_EVOCATION_ILLAGER_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) 
	{
		return SoundEvents.ENTITY_EVOCATION_ILLAGER_HURT;
	}
	@Override
	protected SoundEvent getDeathSound() 
	{
		return SoundEvents.ENTITY_ILLAGER_DEATH;
	}
}
