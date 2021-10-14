package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.AngelFishModel;
import com.hugomage.aquafina.client.model.ReefGobyModel;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.ReefGobyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class ReefGobyRenderer extends MobRenderer<ReefGobyEntity, ReefGobyModel<ReefGobyEntity>> {

    protected static final ResourceLocation BICOLOR = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/fire_reef_goby.png");
    protected static final ResourceLocation EMPEROR = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/yellow_reef_goby.png");
    protected static final ResourceLocation FIRE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/bluebanded_reef_goby.png");

    public ReefGobyRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ReefGobyModel<>(), 0.2F);
    }
    protected void setupRotations(ReefGobyEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(ReefGobyEntity entity) {
        if(entity.getVariant() == 1){
            return EMPEROR;
        }
        if(entity.getVariant() == 2) {
            return FIRE;
        }
        return BICOLOR;
    }}

