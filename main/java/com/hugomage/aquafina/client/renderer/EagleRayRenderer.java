package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.CowNoseRayModel;
import com.hugomage.aquafina.client.model.EagleRayModel;
import com.hugomage.aquafina.entity.CowNoseRayEntity;
import com.hugomage.aquafina.entity.EagleRayEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EagleRayRenderer extends MobRenderer<EagleRayEntity, EagleRayModel<EagleRayEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/eagle_ray.png");


    public EagleRayRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new EagleRayModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(EagleRayEntity entity) {
        return TEXTURE;
    }
}

