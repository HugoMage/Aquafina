package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.SleeperSharkModel;
import com.hugomage.aquafina.entity.SleeperSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.AbstractEyesLayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EndermanModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;

public class SleeperSharkEyesRenderer<T extends SleeperSharkEntity, M extends SleeperSharkModel<T>> extends LayerRenderer<T, M> {
    private static final RenderType SLEEPERSHARKEYE = RenderType.eyes(new ResourceLocation("textures/entity/pacific_sleeper_shark_eyes_layer.png"));

    public SleeperSharkEyesRenderer(IEntityRenderer<T, M> rendererIn) {
        super(rendererIn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.getRenderType());
        if (entitylivingbaseIn.level.getMaxLocalRawBrightness(entitylivingbaseIn.blockPosition()) < 11) {
            this.getParentModel().renderToBuffer(matrixStackIn, ivertexbuilder,  2000, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public RenderType getRenderType() {
        return SLEEPERSHARKEYE;
    }

}