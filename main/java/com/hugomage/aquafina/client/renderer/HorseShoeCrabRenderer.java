package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.DumboOctopusModel;
import com.hugomage.aquafina.client.model.HorseShoeCrabModel;
import com.hugomage.aquafina.entity.DumboOctopusEntity;
import com.hugomage.aquafina.entity.HorseShoeCrabEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class HorseShoeCrabRenderer extends MobRenderer<HorseShoeCrabEntity, HorseShoeCrabModel<HorseShoeCrabEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/horseshoe_crab.png");


    public HorseShoeCrabRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new HorseShoeCrabModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(HorseShoeCrabEntity entity) {
        return TEXTURE;
    }
}

