package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.MorayEelModel;
import com.hugomage.aquafina.client.model.OarFishModel;
import com.hugomage.aquafina.entity.MorayEelEntity;
import com.hugomage.aquafina.entity.OarfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class MorayEelRenderer extends MobRenderer<MorayEelEntity, MorayEelModel<MorayEelEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/green_moray_eel.png");


    public MorayEelRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MorayEelModel<>(), 0.2F);
    }
    protected void setupRotations(MorayEelEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(MorayEelEntity entity) {
        return TEXTURE;
    }
}

