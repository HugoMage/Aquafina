package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.GuitarSharkSharkModel;
import com.hugomage.aquafina.client.model.WobbegongModel;
import com.hugomage.aquafina.entity.GuitarSharkEntity;
import com.hugomage.aquafina.entity.WobbegongEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WobbegongRenderer extends MobRenderer<WobbegongEntity, WobbegongModel<WobbegongEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/wobbegong_shark.png");


    public WobbegongRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new WobbegongModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(WobbegongEntity entity) {
        return TEXTURE;
    }
}

