package com.afm.AfmMod.entity;

import java.util.Set;

import javax.annotation.Nullable;

import com.afm.AfmMod.init.ItemInit;
import com.afm.AfmMod.util.handlers.LootTableHandler;
import com.afm.AfmMod.util.handlers.SoundsHandler;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOcelotAttack;
import net.minecraft.entity.ai.EntityAIOcelotSit;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityMonkey extends EntityAnimal
{
	private static final DataParameter<Boolean> SITTING = EntityDataManager.<Boolean>createKey(EntityMonkey.class, DataSerializers.BOOLEAN);
	private static final DataParameter <Boolean> MOVING = EntityDataManager.<Boolean>createKey(EntityMonkey.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> DATA_VARIANT_ID = EntityDataManager.<Integer>createKey(EntityMonkey.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> DATA_STRENGTH_ID = EntityDataManager.<Integer>createKey(EntityMonkey.class, DataSerializers.VARINT);
    
    private EntityAITempt aiTempt;
	private Object aiSit;
    
	public EntityMonkey(World worldIn) 
	{
		super(worldIn);
		this.setSize(1F, 1F);
	}
	
	
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("Variant", this.getVariant());
        compound.setInteger("Strength", this.getStrength());
    }

    public void readEntityFromNBT(NBTTagCompound compound)
    {
        this.setStrength(compound.getInteger("Strength"));
        super.readEntityFromNBT(compound);
        this.setVariant(compound.getInteger("Variant"));
    }
	
	
	@Override
	protected void initEntityAI() 
	{
        this.aiTempt = new EntityAITempt(this, 0.6D, ItemInit.Banana, true);
        this.tasks.addTask(20, new EntityAIAvoidEntity(this, EntityPoacher.class, 15.0F, 1.0D, 1.2D));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(3, new EntityAIPanic(this, 1.2D));
        this.tasks.addTask(7, new EntityAILeapAtTarget(this, 0.3F));
        this.tasks.addTask(8, new EntityAIMate(this, 0.8D));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.tasks.addTask(10, new EntityAIWanderAvoidWater(this, 0.8D, 1.0000001E-5F));
        this.tasks.addTask(11, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
	}
	
	public void entityInit()
    {
        super.entityInit();
        this.dataManager.register(MOVING, Boolean.valueOf(false));
        this.dataManager.register(SITTING, Boolean.valueOf(false));
        this.dataManager.register(DATA_STRENGTH_ID, Integer.valueOf(0));
        this.dataManager.register(DATA_VARIANT_ID, Integer.valueOf(0));
    }
	

    public int getStrength()
    {
        return ((Integer)this.dataManager.get(DATA_STRENGTH_ID)).intValue();
    }
	
    private void setStrength(int strengthIn)
    {
        this.dataManager.set(DATA_STRENGTH_ID, Integer.valueOf(Math.max(1, Math.min(5, strengthIn))));
    }
	
    private void setRandomStrength()
    {
        int i = this.rand.nextFloat() < 0.04F ? 5 : 3;
        this.setStrength(1 + this.rand.nextInt(i));
    }
	
    public void updateAITasks()
    {
        if (this.getMoveHelper().isUpdating())
        {
            double d0 = this.getMoveHelper().getSpeed();

            if (d0 == 0.6D)
            {
                this.setSneaking(true);
                this.setSprinting(false);
            }
            else if (d0 == 1.33D)
            {
                this.setSneaking(false);
                this.setSprinting(true);
            }
            else
            {
                this.setSneaking(false);
                this.setSprinting(false);
            }
        }
        else
        {
            this.setSneaking(false);
            this.setSprinting(false);
        }
    }
    
    public int getVariant()
    {
        return MathHelper.clamp(((Integer)this.dataManager.get(DATA_VARIANT_ID)).intValue(), 0, 3);
    }
    
    public void setVariant(int variantIn)
    {
        this.dataManager.set(DATA_VARIANT_ID, Integer.valueOf(variantIn));
    }
    
    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setRandomStrength();
        int i;

        if (livingdata instanceof EntityMonkey.GroupData)
        {
            i = ((EntityMonkey.GroupData)livingdata).variant;
        }
        else
        {
            i = this.rand.nextInt(4);
            livingdata = new EntityMonkey.GroupData(i);
        }

        this.setVariant(i);
        return livingdata;
    }
    
    protected boolean canDespawn()
    {
        return !this.isTamed() && this.ticksExisted > 2400;
    }
    
    private boolean isTamed() {
		return false;
	}


	public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (this.isTamed())
        {
            if (this.isOwner(player) && !this.world.isRemote && !this.isBreedingItem(itemstack))
            {
                ((EntityAISit) this.aiSit).setSitting(!this.isSneaking());
            }
        }
        else if ((this.aiTempt == null || this.aiTempt.isRunning()) && itemstack.getItem() == ItemInit.Banana && player.getDistanceSq(this) < 9.0D)
        {
            if (!player.capabilities.isCreativeMode)
            {
                itemstack.shrink(1);
            }

            if (!this.world.isRemote)
            {
                if (this.rand.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player))
                {
                    this.world.setEntityState(this, (byte)7);
                }
                else
                {
                    this.world.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.processInteract(player, hand);
    }
    
	private boolean isOwner(EntityPlayer player) {
		return false;
	}


	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}
	@Override
	public float getEyeHeight()
	{
		return 0.5F;
	}
	
	public boolean isMoving()
    {
        return ((Boolean)this.dataManager.get(MOVING)).booleanValue();
    }
	
    private void setMoving(boolean moving)
    {
        this.dataManager.set(MOVING, Boolean.valueOf(moving));
    }
	
	
	@Override
	protected ResourceLocation getLootTable() 
	{
		return LootTableHandler.MONKEY;
	}
	
	
	protected SoundEvent getAmbientSound() 
	{
		return SoundsHandler.ENTITY_MONKEY_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) 
	{
		return SoundsHandler.ENTITY_MONKEY_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() 
	{
		return SoundsHandler.ENTITY_MONKEY_DEATH;
	}
	
    protected float getSoundVolume()
    {
        return 0.15F;
    }
    
    public EntityMonkey createChild(EntityAgeable ageable)
    {
        EntityMonkey entitymonkey = new EntityMonkey(this.world);
        this.setOffspringAttributes(ageable, entitymonkey);
        EntityMonkey entitymonkey1 = (EntityMonkey)ageable;
        int i = this.rand.nextInt(Math.max(this.getStrength(), entitymonkey1.getStrength())) + 1;

        if (this.rand.nextFloat() < 0.03F)
        {
            ++i;
        }

        entitymonkey.setStrength(i);
        entitymonkey.setVariant(this.rand.nextBoolean() ? this.getVariant() : entitymonkey1.getVariant());
        return entitymonkey;
    }
    
    private void setOffspringAttributes(EntityAgeable ageable, EntityMonkey entitymonkey) 
    {
	}

	static class GroupData implements IEntityLivingData
    {
        public int variant;

        private GroupData(int variantIn)
        {
            this.variant = variantIn;
        }
    }
}
