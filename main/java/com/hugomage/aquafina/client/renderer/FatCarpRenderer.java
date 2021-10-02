package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.BullSharkModel;
import com.hugomage.aquafina.client.model.FatCarpModel;
import com.hugomage.aquafina.entity.BullSharkEntity;
import com.hugomage.aquafina.entity.FatCarpEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class FatCarpRenderer extends MobRenderer<FatCarpEntity, FatCarpModel<FatCarpEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/fat_carp.png");


    public FatCarpRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new FatCarpModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(FatCarpEntity entity) {
        return TEXTURE;
    }
}

