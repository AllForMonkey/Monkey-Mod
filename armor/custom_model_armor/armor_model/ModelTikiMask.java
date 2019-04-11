package com.afm.AfmMod.objects.items.armor.custom_model_armor.armor_model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelMicrochipStrength - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelTikiMask extends ModelBiped {
    public ModelRenderer Tiki_Mask;
    public ModelRenderer String;
    public ModelRenderer String2;
    public ModelRenderer String3;

    public ModelTikiMask() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.String2 = new ModelRenderer(this, 59, 22);
        this.String2.setRotationPoint(0.0F, 4.0F, 10.0F);
        this.String2.addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        this.String3 = new ModelRenderer(this, 57, 13);
        this.String3.setRotationPoint(-1.0F, 4.0F, 1.0F);
        this.String3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
        this.Tiki_Mask = new ModelRenderer(this, 60, 0);
        this.Tiki_Mask.setRotationPoint(-4.0F, -8.0F, -6.0F);
        this.Tiki_Mask.addBox(0.0F, 0.0F, 0.0F, 8, 8, 2, 0.0F);
        this.String = new ModelRenderer(this, 58, 14);
        this.String.setRotationPoint(8.0F, 4.0F, 1.0F);
        this.String.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.Tiki_Mask.addChild(this.String2);
        this.Tiki_Mask.addChild(this.String3);
        this.Tiki_Mask.addChild(this.String);
        this.bipedHead.addChild(this.Tiki_Mask);
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
