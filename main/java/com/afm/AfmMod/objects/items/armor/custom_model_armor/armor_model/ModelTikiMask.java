package com.afm.AfmMod.objects.items.armor.custom_model_armor.armor_model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelMicrochipStrength - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelTikiMask extends ModelBiped 
{
    public ModelRenderer tikimask;
    public ModelRenderer stringpart1;
    public ModelRenderer stringpart2;
    public ModelRenderer stringpart3;
    public ModelRenderer rightwing;
    public ModelRenderer leftwing;
    public ModelRenderer topofmask;
    public ModelRenderer rightwingcube;
    public ModelRenderer leftwingcube;

    public ModelTikiMask() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.rightwingcube = new ModelRenderer(this, 100, 0);
        this.rightwingcube.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.rightwingcube.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.stringpart3 = new ModelRenderer(this, 57, 13);
        this.stringpart3.setRotationPoint(-1.0F, 4.0F, 1.0F);
        this.stringpart3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
        this.topofmask = new ModelRenderer(this, 100, 50);
        this.topofmask.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.topofmask.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
        this.tikimask = new ModelRenderer(this, 60, 0);
        this.tikimask.setRotationPoint(-4.0F, -8.0F, -6.0F);
        this.tikimask.addBox(0.0F, 0.0F, 0.0F, 8, 8, 2, 0.0F);
        this.leftwingcube = new ModelRenderer(this, 100, 0);
        this.leftwingcube.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.leftwingcube.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.rightwing = new ModelRenderer(this, 50, 0);
        this.rightwing.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.leftwing = new ModelRenderer(this, 50, 50);
        this.leftwing.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.stringpart1 = new ModelRenderer(this, 58, 14);
        this.stringpart1.setRotationPoint(8.0F, 4.0F, 1.0F);
        this.stringpart1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.stringpart2 = new ModelRenderer(this, 59, 22);
        this.stringpart2.setRotationPoint(0.0F, 4.0F, 10.0F);
        this.stringpart2.addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        this.rightwing.addChild(this.rightwingcube);
        this.tikimask.addChild(this.stringpart3);
        this.tikimask.addChild(this.topofmask);
        this.leftwing.addChild(this.leftwingcube);
        this.tikimask.addChild(this.rightwing);
        this.tikimask.addChild(this.leftwing);
        this.tikimask.addChild(this.stringpart1);
        this.tikimask.addChild(this.stringpart2);
        this.bipedHead.addChild(this.tikimask);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
