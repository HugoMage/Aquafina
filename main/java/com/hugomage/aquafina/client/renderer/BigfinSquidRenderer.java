package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.BigfinSquidModel;
import com.hugomage.aquafina.client.model.LionManeJellyfishModel;
import com.hugomage.aquafina.entity.BigFinSquidEntity;
import com.hugomage.aquafina.entity.LionManJellyfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class BigfinSquidRenderer extends MobRenderer<BigFinSquidEntity, BigfinSquidModel<BigFinSquidEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/big_fin_squid.png");


    public BigfinSquidRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BigfinSquidModel<>(), 0.2F);
    }
    protected void setupRotations(BigFinSquidEntity p_225621_1_, MatrixStack p_225621_2_, float p_225621_3_, float p_225621_4_, float p_225621_5_) {
        float f = MathHelper.lerp(p_225621_5_, p_225621_1_.xBodyRotO, p_225621_1_.xBodyRot);
        float f1 = MathHelper.lerp(p_225621_5_, p_225621_1_.zBodyRotO, p_225621_1_.zBodyRot);
        p_225621_2_.translate(0.0D, 0.5D, 0.0D);
        p_225621_2_.mulPose(Vector3f.YP.rotationDegrees(180.0F - p_225621_4_));
        p_225621_2_.mulPose(Vector3f.XP.rotationDegrees(f));
        p_225621_2_.mulPose(Vector3f.YP.rotationDegrees(f1));
        p_225621_2_.translate(0.0D, (double)-1.2F, 0.0D);
    }
    @Override
    public ResourceLocation getTextureLocation(BigFinSquidEntity entity) {
        return TEXTURE;
    }
}

