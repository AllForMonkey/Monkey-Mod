package com.afm.AfmMod.entity.render;

import com.afm.AfmMod.entity.EntityMonkey;
import com.afm.AfmMod.entity.model.ModelMonkey;
import com.afm.AfmMod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMonkey extends RenderLiving<EntityMonkey>
{
	public static final ResourceLocation[] TEXTURES = new ResourceLocation[] {new ResourceLocation(Reference.MODID + ":textures/entity/monkey.png"), new ResourceLocation (Reference.MODID + ":textures/entity/monkeysnow.png"), new ResourceLocation (Reference.MODID + ":textures/entity/monkeyblack.png"),new ResourceLocation (Reference.MODID + ":textures/entity/tanmonkey.png")};

	public RenderMonkey(RenderManager manager) 
	{
		super(manager , new ModelMonkey(), 0.5F);
	}
	
	@Override
    protected ResourceLocation getEntityTexture(EntityMonkey entity) 
	{
		return TEXTURES[entity.getVariant()];
	}
	
	
	@Override
	protected void applyRotations(EntityMonkey entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
