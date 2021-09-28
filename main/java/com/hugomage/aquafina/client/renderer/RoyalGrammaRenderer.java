package com.hugomage.aquafina.client.renderer;


import com.google.common.collect.Maps;
import com.hugomage.aquafina.Aquafina;

import com.hugomage.aquafina.client.model.RoyalGrammaModel;
import com.hugomage.aquafina.entity.RoyalGrammaEntity;

import com.hugomage.aquafina.entity.StarfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

import java.util.Map;

public class RoyalGrammaRenderer extends MobRenderer<RoyalGrammaEntity, RoyalGrammaModel<RoyalGrammaEntity>> {

    protected static final ResourceLocation CLASSIC = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/classic_royal_gramma.png");
    protected static final ResourceLocation HALFPURPLE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/half_purple_royal_gramma.png");
    protected static final ResourceLocation HALFYELLOW = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/half_yellow_royal_gramma.png");
    protected static final ResourceLocation NORMALPURPLE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/normal_royal_gramma_purple.png");
    protected static final ResourceLocation NORMALYELLOW = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/normal_royal_gramma_yellow.png");
    protected static final ResourceLocation PINKY = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/pinky_royal_gramma.png");
    protected static final ResourceLocation FULLPURPLE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/royal_gramma_full_purple.png");
    protected static final ResourceLocation FULLYELLOW = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/royal_gramma_full_yellow.png");
    protected static final ResourceLocation UPBANDED = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/up_banded_royal_gramma.png");

    public RoyalGrammaRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RoyalGrammaModel<>(), 0.2F);
    }
    protected void setupRotations(RoyalGrammaEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(RoyalGrammaEntity entity) {
        if(entity.getVariant() == 1){
            return HALFPURPLE;
        }
        if(entity.getVariant() == 2) {
            return HALFYELLOW;
        }
        if(entity.getVariant() == 3) {
            return NORMALPURPLE;
        }
        if(entity.getVariant() == 4) {
            return NORMALYELLOW;
        }
        if(entity.getVariant() == 5) {
            return PINKY;
        }
        if(entity.getVariant() == 6) {
            return FULLPURPLE;
        }
        if(entity.getVariant() == 7) {
            return FULLYELLOW;
        }
        if(entity.getVariant() == 8) {
            return UPBANDED;
        }
        return CLASSIC;
    }}

