package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.CowNoseRayModel;
import com.hugomage.aquafina.client.model.GuitarSharkSharkModel;
import com.hugomage.aquafina.entity.CowNoseRayEntity;
import com.hugomage.aquafina.entity.GuitarSharkEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GuitarSharkRenderer extends MobRenderer<GuitarSharkEntity, GuitarSharkSharkModel<GuitarSharkEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/gitarfish.png");


    public GuitarSharkRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GuitarSharkSharkModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(GuitarSharkEntity entity) {
        return TEXTURE;
    }
}

