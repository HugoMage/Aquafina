package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.GiantStarfishModel;
import com.hugomage.aquafina.entity.GiantStarfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GiantStarfishRenderer extends MobRenderer<GiantStarfishEntity, GiantStarfishModel<GiantStarfishEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/giant_starfish.png");


    public GiantStarfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GiantStarfishModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getTextureLocation(GiantStarfishEntity entity) {
        return TEXTURE;
    }
}

