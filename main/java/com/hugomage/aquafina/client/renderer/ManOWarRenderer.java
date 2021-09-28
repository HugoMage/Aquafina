package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.LionManeJellyfishModel;
import com.hugomage.aquafina.client.model.ManOWarModel;
import com.hugomage.aquafina.entity.LionManJellyfishEntity;
import com.hugomage.aquafina.entity.ManOWarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class ManOWarRenderer extends MobRenderer<ManOWarEntity, ManOWarModel<ManOWarEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/man_o_war.png");


    public ManOWarRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ManOWarModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(ManOWarEntity entity) {
        return TEXTURE;
    }
}

