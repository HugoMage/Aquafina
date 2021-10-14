package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.CowNoseRayModel;
import com.hugomage.aquafina.client.model.SeaSkaterModel;
import com.hugomage.aquafina.entity.CowNoseRayEntity;
import com.hugomage.aquafina.entity.SeaSkaterEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SeaSkaterRenderer extends MobRenderer<SeaSkaterEntity, SeaSkaterModel<SeaSkaterEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/sea_skater.png");


    public SeaSkaterRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SeaSkaterModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(SeaSkaterEntity entity) {
        return TEXTURE;
    }
}

