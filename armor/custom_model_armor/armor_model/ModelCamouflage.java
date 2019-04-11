package com.afm.AfmMod.objects.items.armor.custom_model_armor.armor_model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelMicrochipStrength - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelCamouflage extends ModelBiped 
{
    public ModelRenderer Camoflage;

    public ModelCamouflage() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Camoflage = new ModelRenderer(this, 50, 50);
        this.Camoflage.setRotationPoint(-9.0F, -1.0F, -8.0F);
        this.Camoflage.addBox(0.0F, 0.0F, 0.0F, 18, 17, 16, 0.0F);
        this.bipedBody.addChild(this.Camoflage);
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
