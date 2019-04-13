package com.afm.AfmMod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSillyMonkey - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelMonkey extends ModelBase
{
    public ModelRenderer MonkeyHead;
    public ModelRenderer Body;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer Nose;
    public ModelRenderer Ears;
    public ModelRenderer Tail1;
    public ModelRenderer Tail2;

    public ModelMonkey() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Tail2 = new ModelRenderer(this, 39, 0);
        this.Tail2.mirror = true;
        this.Tail2.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Tail2.addBox(-1.0F, -12.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(Tail2, 1.1344640137963142F, 0.0F, 0.0F);
        this.LeftArm = new ModelRenderer(this, 21, 0);
        this.LeftArm.setRotationPoint(4.0F, 17.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -1.0F, -1.5F, 2, 8, 3, 0.0F);
        this.RightArm = new ModelRenderer(this, 21, 0);
        this.RightArm.setRotationPoint(-4.0F, 17.0F, 0.0F);
        this.RightArm.addBox(-1.0F, -1.0F, -1.5F, 2, 8, 3, 0.0F);
        this.Ears = new ModelRenderer(this, 34, 24);
        this.Ears.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ears.addBox(-4.5F, -6.0F, -2.0F, 9, 5, 3, 0.0F);
        this.RightLeg = new ModelRenderer(this, 9, 0);
        this.RightLeg.setRotationPoint(-2.0F, 16.0F, 7.0F);
        this.RightLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.setRotateAngle(RightLeg, 0.0F, 0.17453292519943295F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 9, 0);
        this.LeftLeg.setRotationPoint(2.0F, 16.0F, 7.0F);
        this.LeftLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.setRotateAngle(LeftLeg, 0.0F, -0.17453292519943295F, 0.0F);
        this.MonkeyHead = new ModelRenderer(this, 0, 19);
        this.MonkeyHead.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.MonkeyHead.addBox(-3.5F, -7.0F, -4.0F, 7, 7, 6, 0.0F);
        this.Body = new ModelRenderer(this, 42, 11);
        this.Body.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Body.addBox(-3.0F, 0.0F, -2.5F, 6, 8, 5, 0.0F);
        this.setRotateAngle(Body, 1.3089969389957472F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 26, 28);
        this.Nose.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Nose.addBox(-1.5F, -3.0F, -5.0F, 3, 3, 1, 0.0F);
        this.Tail1 = new ModelRenderer(this, 39, 0);
        this.Tail1.setRotationPoint(0.0F, 8.0F, 2.0F);
        this.Tail1.addBox(-1.0F, -12.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(Tail1, -2.356194490192345F, 0.0F, 0.0F);
        this.Tail1.addChild(this.Tail2);
        this.MonkeyHead.addChild(this.Ears);
        this.MonkeyHead.addChild(this.Nose);
        this.Body.addChild(this.Tail1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.LeftArm.render(f5);
        this.RightArm.render(f5);
        this.RightLeg.render(f5);
        this.LeftLeg.render(f5);
        this.MonkeyHead.render(f5);
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.MonkeyHead.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.MonkeyHead.rotateAngleX = headPitch * 0.017453292F;
    }
}
