package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.BelugaSturgeonModel;
import com.hugomage.aquafina.entity.BelugaSturgeonEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BelugaSturgeonRenderer extends MobRenderer<BelugaSturgeonEntity, BelugaSturgeonModel<BelugaSturgeonEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/beluga_sturgeon.png");


    public BelugaSturgeonRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BelugaSturgeonModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(BelugaSturgeonEntity entity) {
        return TEXTURE;
    }
}

