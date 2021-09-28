package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.YetiCrabModel;
import com.hugomage.aquafina.entity.YetiCrabEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class YetiCrabRenderer extends MobRenderer<YetiCrabEntity, YetiCrabModel<YetiCrabEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/yeti_crab.png");


    public YetiCrabRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new YetiCrabModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getTextureLocation(YetiCrabEntity entity) {
        return TEXTURE;
    }
}

