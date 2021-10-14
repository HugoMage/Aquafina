package com.hugomage.aquafina.client.renderer;

import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.GiantStingrayModel;
import com.hugomage.aquafina.entity.GiantStingrayEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GiantStingrayRenderer extends MobRenderer<GiantStingrayEntity, GiantStingrayModel<GiantStingrayEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/giant_ray.png");


    public GiantStingrayRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GiantStingrayModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getTextureLocation(GiantStingrayEntity entity) {
        return TEXTURE;
    }
}

