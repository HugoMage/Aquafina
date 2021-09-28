package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.BullSharkModel;
import com.hugomage.aquafina.client.model.LemonSharkModel;
import com.hugomage.aquafina.entity.BullSharkEntity;
import com.hugomage.aquafina.entity.LemonSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class BullSharkRenderer extends MobRenderer<BullSharkEntity, BullSharkModel<BullSharkEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/bull_shark.png");


    public BullSharkRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BullSharkModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(BullSharkEntity entity) {
        return TEXTURE;
    }
}

