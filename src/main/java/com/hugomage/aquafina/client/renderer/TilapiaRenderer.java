package com.hugomage.aquafina.client.renderer;


import com.google.common.collect.Maps;
import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.TilapiaModel;


import com.hugomage.aquafina.entity.TilapiaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

import java.util.Map;

public class TilapiaRenderer extends MobRenderer<TilapiaEntity, TilapiaModel<TilapiaEntity>> {

    public static final Map<Integer, ResourceLocation> TEXTURES = Util.make(Maps.newHashMap(), (hashMap) -> {
        hashMap.put(0, new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_fins_tilapia.png"));
        hashMap.put(1, new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_fins_tilapia.png"));
        hashMap.put(2, new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_fins_tilapia.png"));

    });

    public TilapiaRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new TilapiaModel<>(), 0.2F);
    }
    protected void setupRotations(TilapiaEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(TilapiaEntity entity) {
        return TEXTURES.getOrDefault(entity.getVariant(), TEXTURES.get(0));
    }}

