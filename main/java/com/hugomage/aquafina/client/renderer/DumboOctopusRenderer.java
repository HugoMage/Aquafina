package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.DumboOctopusModel;
import com.hugomage.aquafina.client.model.OarFishModel;
import com.hugomage.aquafina.entity.DumboOctopusEntity;
import com.hugomage.aquafina.entity.OarfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class DumboOctopusRenderer extends MobRenderer<DumboOctopusEntity, DumboOctopusModel<DumboOctopusEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/yellow_dumbo_octopus.png");
    protected static final ResourceLocation PINK = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/pink_dumbo_octopus.png");


    public DumboOctopusRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DumboOctopusModel<>(), 0.2F);
    }
    protected void setupRotations(DumboOctopusEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }
    @Override
    public ResourceLocation getTextureLocation(DumboOctopusEntity entity) {
        if(entity.getVariant() == 1){
            return PINK;
        }
        return TEXTURE;
    }
}

