package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.GoblinSharkModel;
import com.hugomage.aquafina.client.model.SleeperSharkModel;
import com.hugomage.aquafina.entity.GoblinSharkEntity;
import com.hugomage.aquafina.entity.SleeperSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EndermanEyesLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class SleeperSharkRenderer extends MobRenderer<SleeperSharkEntity, SleeperSharkModel<SleeperSharkEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/pacific_sleeper_shark.png");


    public SleeperSharkRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SleeperSharkModel<>(), 0.2F);

    }

    @Override
    public ResourceLocation getTextureLocation(SleeperSharkEntity entity) {
        return TEXTURE;
    }
}

