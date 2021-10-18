package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.AngelFishModel;
import com.hugomage.aquafina.client.model.SeaHorseModel;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.SeaHorseEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class SeaHorseRenderer extends MobRenderer<SeaHorseEntity, SeaHorseModel<SeaHorseEntity>> {

    protected static final ResourceLocation YELLOW = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/yellow_sea_horse.png");
    protected static final ResourceLocation BLACK = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/black_sea_horse.png");
    protected static final ResourceLocation BLUE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/blue_sea_horse.png");
    protected static final ResourceLocation GRAY = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/gray_sea_horse.png");
    protected static final ResourceLocation GREEN = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/green_sea_horse.png");
    protected static final ResourceLocation NORMAL = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/normal_sea_horse.png");
    protected static final ResourceLocation ORANGE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/orange_sea_horse.png");
    protected static final ResourceLocation PINK = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/pink_sea_horse.png");
    protected static final ResourceLocation RED = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_sea_horse.png");
    protected static final ResourceLocation ZEBRA = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/sea_zebra.png");


    public SeaHorseRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SeaHorseModel<>(), 0.2F);
    }
    protected void setupRotations(SeaHorseEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(SeaHorseEntity entity) {
        if(entity.getVariant() == 1){
            return GRAY;
        }
        if(entity.getVariant() == 2) {
            return BLACK;
        }
        if(entity.getVariant() == 3) {
            return BLUE;
        }
        if(entity.getVariant() == 4) {
            return GREEN;
        }
        if(entity.getVariant() == 5) {
            return NORMAL;
        }
        if(entity.getVariant() == 6) {
            return ORANGE;
        }
        if(entity.getVariant() == 7) {
            return PINK;
        }
        if(entity.getVariant() == 8) {
            return RED;
        }
        if(entity.getVariant() == 9) {
            return ZEBRA;
        }
        return YELLOW;
    }}

