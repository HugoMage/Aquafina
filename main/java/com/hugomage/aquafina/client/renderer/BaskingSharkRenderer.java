package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.BaskingSharkModel;
import com.hugomage.aquafina.client.model.SleeperSharkModel;
import com.hugomage.aquafina.entity.BaskingSharkEntity;
import com.hugomage.aquafina.entity.SleeperSharkEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BaskingSharkRenderer extends MobRenderer<BaskingSharkEntity, BaskingSharkModel<BaskingSharkEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/basking_shark.png");


    public BaskingSharkRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BaskingSharkModel<>(), 0.2F);

    }

    @Override
    public ResourceLocation getTextureLocation(BaskingSharkEntity entity) {
        return TEXTURE;
    }
}

