package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.CowNoseRayModel;
import com.hugomage.aquafina.client.model.HorseShoeCrabModel;
import com.hugomage.aquafina.entity.CowNoseRayEntity;
import com.hugomage.aquafina.entity.HorseShoeCrabEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CowNoseRayRenderer extends MobRenderer<CowNoseRayEntity, CowNoseRayModel<CowNoseRayEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/cownose_ray.png");


    public CowNoseRayRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CowNoseRayModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(CowNoseRayEntity entity) {
        return TEXTURE;
    }
}

