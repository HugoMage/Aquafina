package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.IceFishModel;
import com.hugomage.aquafina.client.model.SlenderSunfishModel;
import com.hugomage.aquafina.entity.IceFishEntity;
import com.hugomage.aquafina.entity.SlenderSunfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class SlenderSunfishRenderer extends MobRenderer<SlenderSunfishEntity, SlenderSunfishModel<SlenderSunfishEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/slender_sunfish.png");


    public SlenderSunfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SlenderSunfishModel<>(), 0.2F);
    }
    protected void setupRotations(SlenderSunfishEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }

    @Override
    public ResourceLocation getTextureLocation(SlenderSunfishEntity entity) {
        return TEXTURE;
    }
}

