package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.BabyMolaMolaModel;
import com.hugomage.aquafina.client.model.MolaMolaModel;
import com.hugomage.aquafina.entity.MolaMolaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class MolaMolaRenderer extends MobRenderer<MolaMolaEntity, EntityModel<MolaMolaEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/mola_mola.png");
    protected static final ResourceLocation TEXTURE_BABY = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/baby_mola_mola.png");

    private static final MolaMolaModel<MolaMolaEntity> MODEL = new MolaMolaModel<>();
    private static final BabyMolaMolaModel<MolaMolaEntity> MODEL_BABY = new BabyMolaMolaModel<>();

    public MolaMolaRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new EntityModel<MolaMolaEntity>() {

            @Override
            public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {

            }

            @Override
            public void setupAnim(MolaMolaEntity p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

            }
        }, 0.2F);
    }
    protected void scale(MolaMolaEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        if(entitylivingbaseIn.isBaby()){
            this.model = MODEL_BABY;
        }else{
            this.model = MODEL;
        }
    }
    protected void setupRotations(MolaMolaEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        float f = 4.3F * MathHelper.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!entityLiving.isInWater()) {
            matrixStackIn.translate((double)0.1F, (double)0.1F, (double)-0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }

    @Override
    public ResourceLocation getTextureLocation(MolaMolaEntity entity) {
        return entity.isBaby() ? TEXTURE_BABY :TEXTURE;
    }
}

