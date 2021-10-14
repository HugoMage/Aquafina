package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.GiantStarfishModel;
import com.hugomage.aquafina.client.model.StarfishModel;
import com.hugomage.aquafina.entity.GiantStarfishEntity;
import com.hugomage.aquafina.entity.StarfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class StarfishRenderer extends MobRenderer<StarfishEntity, StarfishModel<StarfishEntity>> {

    protected static final ResourceLocation YELLOW = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/yellow_starfish.png");
    protected static final ResourceLocation ORANGE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/orange_starfish.png");
    protected static final ResourceLocation BLUE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/blue_starfish.png");
    protected static final ResourceLocation PATRICK = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/patrick.png");


    public StarfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new StarfishModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getTextureLocation(StarfishEntity entity) {
        if(entity.getVariant() == 1){
            return ORANGE;
        }
        if(entity.getVariant() == 2) {
            return BLUE;
        }
        if(entity.getVariant() == 3) {
            return PATRICK;
        }
        return YELLOW;
    }
}

