package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.GoblinSharkModel;
import com.hugomage.aquafina.client.model.LemonSharkModel;
import com.hugomage.aquafina.entity.GoblinSharkEntity;
import com.hugomage.aquafina.entity.LemonSharkEntity;
import com.hugomage.aquafina.entity.LionManJellyfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class LemonSharkRenderer extends MobRenderer<LemonSharkEntity, LemonSharkModel<LemonSharkEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/lemon_shark.png");


    public LemonSharkRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new LemonSharkModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(LemonSharkEntity entity) {
        return TEXTURE;
    }
}

