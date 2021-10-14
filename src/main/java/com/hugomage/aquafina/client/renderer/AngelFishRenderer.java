package com.hugomage.aquafina.client.renderer;


import com.google.common.collect.Maps;
import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.AngelFishModel;
import com.hugomage.aquafina.client.model.RoyalGrammaModel;
import com.hugomage.aquafina.entity.AngelFishEntity;
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

public class AngelFishRenderer extends MobRenderer<AngelFishEntity, AngelFishModel<AngelFishEntity>> {

    protected static final ResourceLocation BICOLOR = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/bicolor_angelfish.png");
    protected static final ResourceLocation EMPEROR = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/emperor_angelfish.png");
    protected static final ResourceLocation FIRE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/fire_angelfish.png");
    protected static final ResourceLocation QUEEN = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/queen_angelfish.png");

    public AngelFishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new AngelFishModel<>(), 0.2F);
    }
    protected void setupRotations(AngelFishEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(AngelFishEntity entity) {
        if(entity.getVariant() == 1){
            return EMPEROR;
        }
        if(entity.getVariant() == 2) {
            return FIRE;
        }
        if(entity.getVariant() == 3) {
            return QUEEN;
        }
        return BICOLOR;
    }}

