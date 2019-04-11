package com.afm.AfmMod.entity.render;

import com.afm.AfmMod.entity.EntityPoacher;
import com.afm.AfmMod.entity.model.ModelPoacher;
import com.afm.AfmMod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPoacher extends RenderLiving<EntityPoacher>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/poacher.png");

	public RenderPoacher(RenderManager manager) 
	{
		super(manager , new ModelPoacher(), 0.5F);
	}
	
	@Override
    protected ResourceLocation getEntityTexture(EntityPoacher entity) 
	{
		return TEXTURES;
	}
	
	
	@Override
	protected void applyRotations(EntityPoacher entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
