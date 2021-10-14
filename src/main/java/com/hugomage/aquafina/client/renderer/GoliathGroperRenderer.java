package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.AngelFishModel;
import com.hugomage.aquafina.client.model.GoliathGrouperModel;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.GoliathGrouperEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class GoliathGroperRenderer extends MobRenderer<GoliathGrouperEntity, GoliathGrouperModel<GoliathGrouperEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_goliath_grouper.png");
    protected static final ResourceLocation BLUE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_goliath_grouper.png");
    protected static final ResourceLocation YELLOW = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_goliath_grouper.png");

    public GoliathGroperRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GoliathGrouperModel<>(), 0.2F);
    }
    protected void setupRotations(GoliathGrouperEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(GoliathGrouperEntity entity) {
        if(entity.getVariant() == 1){
            return BLUE;
        }
        if(entity.getVariant() == 2) {
            return YELLOW;
        }
        return TEXTURE;
    }}

