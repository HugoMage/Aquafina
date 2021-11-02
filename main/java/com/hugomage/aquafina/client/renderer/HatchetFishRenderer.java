package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.HatchetFishModel;
import com.hugomage.aquafina.client.model.SnailFishModel;
import com.hugomage.aquafina.entity.HatchetFishEntity;
import com.hugomage.aquafina.entity.SnailFishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class HatchetFishRenderer extends MobRenderer<HatchetFishEntity, HatchetFishModel<HatchetFishEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/hatchetfish.png");


    public HatchetFishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new HatchetFishModel<>(), 0.2F);
    }
    protected void setupRotations(HatchetFishEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(HatchetFishEntity entity) {
        return TEXTURE;
    }
}

