package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.ArapaimaModel;
import com.hugomage.aquafina.client.model.SpongeBobModel;
import com.hugomage.aquafina.entity.ArapaimaEntity;
import com.hugomage.aquafina.entity.SpongeBobEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class SpongeBobRenderer extends MobRenderer<SpongeBobEntity, SpongeBobModel<SpongeBobEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/sponge_bob.png");


    public SpongeBobRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SpongeBobModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(SpongeBobEntity entity) {
        return TEXTURE;
    }
}

