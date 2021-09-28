package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.CoconutCrabModel;
import com.hugomage.aquafina.client.model.HorseShoeCrabModel;
import com.hugomage.aquafina.entity.CoconutCrabEntity;
import com.hugomage.aquafina.entity.HorseShoeCrabEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CoconutCrabRenderer extends MobRenderer<CoconutCrabEntity, CoconutCrabModel<CoconutCrabEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/blue_coconut_crab.png");
    protected static final ResourceLocation PINK = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/purple_coconut_crab.png");


    public CoconutCrabRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CoconutCrabModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(CoconutCrabEntity entity) {
        if(entity.getVariant() == 1){
            return PINK;
        }
        return TEXTURE;
    }
}

