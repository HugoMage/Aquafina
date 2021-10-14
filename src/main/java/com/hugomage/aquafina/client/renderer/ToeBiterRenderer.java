package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.ToeBiterModel;

import com.hugomage.aquafina.entity.ToeBiterEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
public class ToeBiterRenderer extends MobRenderer<ToeBiterEntity, ToeBiterModel<ToeBiterEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/toe_biter.png");


    public ToeBiterRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ToeBiterModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getTextureLocation(ToeBiterEntity entity) {
        return TEXTURE;
    }
}

