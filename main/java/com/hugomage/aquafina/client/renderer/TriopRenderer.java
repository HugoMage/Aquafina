package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.BullSharkModel;
import com.hugomage.aquafina.client.model.TriopModel;
import com.hugomage.aquafina.entity.BullSharkEntity;
import com.hugomage.aquafina.entity.TriopEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TriopRenderer extends MobRenderer<TriopEntity, TriopModel<TriopEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/triop.png");


    public TriopRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new TriopModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(TriopEntity entity) {
        return TEXTURE;
    }
}

