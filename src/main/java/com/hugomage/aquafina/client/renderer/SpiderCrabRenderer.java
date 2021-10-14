package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.SpiderCrabModel;
import com.hugomage.aquafina.client.model.YetiCrabModel;
import com.hugomage.aquafina.entity.SpiderCrabEntity;
import com.hugomage.aquafina.entity.YetiCrabEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SpiderCrabRenderer extends MobRenderer<SpiderCrabEntity, SpiderCrabModel<SpiderCrabEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/spider_crab.png");


    public SpiderCrabRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SpiderCrabModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getTextureLocation(SpiderCrabEntity entity) {
        return TEXTURE;
    }
}

