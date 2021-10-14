package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.GiantStarfishModel;
import com.hugomage.aquafina.client.model.SeaUrchinModel;
import com.hugomage.aquafina.entity.GiantStarfishEntity;
import com.hugomage.aquafina.entity.SeaUrchinEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SeaUrchinRenderer extends MobRenderer<SeaUrchinEntity, SeaUrchinModel<SeaUrchinEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_sea_urchin.png");


    public SeaUrchinRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SeaUrchinModel<>(), 0.3F);
    }
    @Override
    public ResourceLocation getTextureLocation(SeaUrchinEntity entity) {
        return TEXTURE;
    }
}

