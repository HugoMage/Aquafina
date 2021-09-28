package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.AngelFishModel;
import com.hugomage.aquafina.client.model.FoxFaceFishModel;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.FoxFaceFishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class FoxFaceFishRenderer extends MobRenderer<FoxFaceFishEntity, FoxFaceFishModel<FoxFaceFishEntity>> {

    protected static final ResourceLocation BICOLOR = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/foxface_fish.png");
    protected static final ResourceLocation EMPEROR = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/black_foxface_fish.png");
    protected static final ResourceLocation FIRE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/white_foxface_fish.png");

    public FoxFaceFishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new FoxFaceFishModel<>(), 0.2F);
    }
    protected void setupRotations(FoxFaceFishEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(FoxFaceFishEntity entity) {
        if(entity.getVariant() == 1){
            return EMPEROR;
        }
        if(entity.getVariant() == 2) {
            return FIRE;
        }
        return BICOLOR;
    }}

