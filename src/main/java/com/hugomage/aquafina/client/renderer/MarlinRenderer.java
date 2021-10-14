package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.MarlinModel;
import com.hugomage.aquafina.client.model.SleeperSharkModel;
import com.hugomage.aquafina.entity.MarlinEntity;
import com.hugomage.aquafina.entity.SleeperSharkEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MarlinRenderer extends MobRenderer<MarlinEntity, MarlinModel<MarlinEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/marlin.png");


    public MarlinRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MarlinModel<>(), 0.2F);

    }

    @Override
    public ResourceLocation getTextureLocation(MarlinEntity entity) {
        return TEXTURE;
    }
}

