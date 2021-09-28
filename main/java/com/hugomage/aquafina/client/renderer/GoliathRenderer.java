package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.GoliathCatfishModel;
import com.hugomage.aquafina.entity.GoliathCatfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class GoliathRenderer extends MobRenderer<GoliathCatfishEntity, GoliathCatfishModel<GoliathCatfishEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/giant_catfish.png");


    public GoliathRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GoliathCatfishModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(GoliathCatfishEntity entity) {
        return TEXTURE;
    }
}

