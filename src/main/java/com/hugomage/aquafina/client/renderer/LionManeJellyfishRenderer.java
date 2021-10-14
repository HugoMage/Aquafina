package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.DumboOctopusModel;
import com.hugomage.aquafina.client.model.LionManeJellyfishModel;
import com.hugomage.aquafina.entity.DumboOctopusEntity;
import com.hugomage.aquafina.entity.LionManJellyfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class LionManeJellyfishRenderer extends MobRenderer<LionManJellyfishEntity, LionManeJellyfishModel<LionManJellyfishEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/lion_mane_jellyfish.png");


    public LionManeJellyfishRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new LionManeJellyfishModel<>(), 0.2F);
    }
    protected void setupRotations(LionManJellyfishEntity p_225621_1_, MatrixStack p_225621_2_, float p_225621_3_, float p_225621_4_, float p_225621_5_) {
        float f = MathHelper.lerp(p_225621_5_, p_225621_1_.xBodyRotO, p_225621_1_.xBodyRot);
        float f1 = MathHelper.lerp(p_225621_5_, p_225621_1_.zBodyRotO, p_225621_1_.zBodyRot);
        p_225621_2_.translate(0.0D, 0.5D, 0.0D);
        p_225621_2_.mulPose(Vector3f.YP.rotationDegrees(180.0F - p_225621_4_));
        p_225621_2_.mulPose(Vector3f.XP.rotationDegrees(f));
        p_225621_2_.mulPose(Vector3f.YP.rotationDegrees(f1));
        p_225621_2_.translate(0.0D, (double)-1.2F, 0.0D);
    }
    @Override
    public ResourceLocation getTextureLocation(LionManJellyfishEntity entity) {
        return TEXTURE;
    }
}

