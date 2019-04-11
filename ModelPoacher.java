package com.afm.AfmMod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelIllager - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPoacher extends ModelBase {
    public ModelRenderer head;
    public ModelRenderer rightarm;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer leftarm;
    public ModelRenderer body;
    public ModelRenderer nose;
    public ModelRenderer axehandle;
    public ModelRenderer axehandlepart2;
    public ModelRenderer axehandlepart3;
    public ModelRenderer axehandlepart4;
    public ModelRenderer axehandlepart5;
    public ModelRenderer axehandlepart6;
    public ModelRenderer axehandlepart7;
    public ModelRenderer axe;
    public ModelRenderer axehandlepart9;
    public ModelRenderer axehandlepart10;
    public ModelRenderer axehandlepart11;
    public ModelRenderer axehandle14;
    public ModelRenderer axepart2;
    public ModelRenderer axepart5;
    public ModelRenderer axepart3;
    public ModelRenderer axepart4;
    public ModelRenderer axepart6;
    public ModelRenderer axepart7;
    public ModelRenderer axepart8;
    public ModelRenderer axepart9;
    public ModelRenderer axepart10;
    public ModelRenderer axepart11;
    public ModelRenderer axepart12;
    public ModelRenderer axepart13;

    public ModelPoacher() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.axehandlepart6 = new ModelRenderer(this, 0, 50);
        this.axehandlepart6.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.axehandlepart6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.axehandlepart11 = new ModelRenderer(this, 0, 50);
        this.axehandlepart11.setRotationPoint(4.0F, 0.0F, -8.0F);
        this.axehandlepart11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 46);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.axe = new ModelRenderer(this, 50, 10);
        this.axe.setRotationPoint(2.0F, 0.0F, -8.0F);
        this.axe.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.axepart6 = new ModelRenderer(this, 50, 10);
        this.axepart6.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.axepart6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.axehandle = new ModelRenderer(this, 0, 50);
        this.axehandle.setRotationPoint(-3.0F, 10.0F, -2.0F);
        this.axehandle.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.axepart3 = new ModelRenderer(this, 0, 40);
        this.axepart3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.axepart3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.nose = new ModelRenderer(this, 24, 0);
        this.nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.nose.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.axepart2 = new ModelRenderer(this, 50, 10);
        this.axepart2.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.axepart2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.axepart4 = new ModelRenderer(this, 0, 40);
        this.axepart4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.axepart4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.axepart10 = new ModelRenderer(this, 0, 40);
        this.axepart10.setRotationPoint(2.0F, 0.0F, 3.0F);
        this.axepart10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.axehandlepart7 = new ModelRenderer(this, 0, 50);
        this.axehandlepart7.setRotationPoint(1.0F, 0.0F, -6.0F);
        this.axehandlepart7.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.axehandlepart5 = new ModelRenderer(this, 0, 50);
        this.axehandlepart5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.axehandlepart5.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 22);
        this.leftleg.mirror = true;
        this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.axepart8 = new ModelRenderer(this, 0, 40);
        this.axepart8.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.axepart8.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.axepart13 = new ModelRenderer(this, 0, 40);
        this.axepart13.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.axepart13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 46);
        this.leftarm.mirror = true;
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.axepart12 = new ModelRenderer(this, 0, 40);
        this.axepart12.setRotationPoint(2.0F, 0.0F, -1.0F);
        this.axepart12.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.axehandlepart3 = new ModelRenderer(this, 0, 50);
        this.axehandlepart3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.axehandlepart3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.axehandle14 = new ModelRenderer(this, 0, 50);
        this.axehandle14.setRotationPoint(1.0F, 0.0F, -7.0F);
        this.axehandle14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.axehandlepart9 = new ModelRenderer(this, 0, 50);
        this.axehandlepart9.setRotationPoint(3.0F, 0.0F, -9.0F);
        this.axehandlepart9.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.body = new ModelRenderer(this, 16, 20);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F);
        this.axepart11 = new ModelRenderer(this, 0, 40);
        this.axepart11.setRotationPoint(3.0F, 0.0F, 2.0F);
        this.axepart11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.axepart5 = new ModelRenderer(this, 50, 10);
        this.axepart5.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.axepart5.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.axehandlepart10 = new ModelRenderer(this, 0, 50);
        this.axehandlepart10.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.axehandlepart10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.axehandlepart4 = new ModelRenderer(this, 0, 50);
        this.axehandlepart4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.axehandlepart4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.axepart9 = new ModelRenderer(this, 0, 40);
        this.axepart9.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.axepart9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.axepart7 = new ModelRenderer(this, 50, 10);
        this.axepart7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.axepart7.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 22);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.axehandlepart2 = new ModelRenderer(this, 0, 50);
        this.axehandlepart2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.axehandlepart2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.axehandle.addChild(this.axehandlepart6);
        this.axehandle.addChild(this.axehandlepart11);
        this.axehandle.addChild(this.axe);
        this.axepart5.addChild(this.axepart6);
        this.rightarm.addChild(this.axehandle);
        this.axepart2.addChild(this.axepart3);
        this.head.addChild(this.nose);
        this.axe.addChild(this.axepart2);
        this.axepart2.addChild(this.axepart4);
        this.axepart5.addChild(this.axepart10);
        this.axehandle.addChild(this.axehandlepart7);
        this.axehandle.addChild(this.axehandlepart5);
        this.axepart5.addChild(this.axepart8);
        this.axepart5.addChild(this.axepart13);
        this.axepart5.addChild(this.axepart12);
        this.axehandle.addChild(this.axehandlepart3);
        this.axehandle.addChild(this.axehandle14);
        this.axehandle.addChild(this.axehandlepart9);
        this.axepart5.addChild(this.axepart11);
        this.axe.addChild(this.axepart5);
        this.axehandle.addChild(this.axehandlepart10);
        this.axehandle.addChild(this.axehandlepart4);
        this.axepart5.addChild(this.axepart9);
        this.axepart5.addChild(this.axepart7);
        this.axehandle.addChild(this.axehandlepart2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.rightarm.render(f5);
        this.head.render(f5);
        this.leftleg.render(f5);
        this.leftarm.render(f5);
        this.body.render(f5);
        this.rightleg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.head.rotateAngleX = headPitch * 0.017453292F;
    }
}
