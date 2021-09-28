package com.hugomage.aquafina.client.renderer;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.CoconutCrabModel;
import com.hugomage.aquafina.client.model.SeaCucumberModel;
import com.hugomage.aquafina.entity.CoconutCrabEntity;
import com.hugomage.aquafina.entity.SeaCucumberEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SeaCucmberRenderer extends MobRenderer<SeaCucumberEntity, SeaCucumberModel<SeaCucumberEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/green_sea_cucumber.png");
    protected static final ResourceLocation RED = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/yellow_sea_cucumber.png");
    protected static final ResourceLocation YELLOW = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_sea_cucumber.png");


    public SeaCucmberRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SeaCucumberModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(SeaCucumberEntity entity) {
        if(entity.getVariant() == 1){
            return RED;
        }
        if(entity.getVariant() == 2){
            return YELLOW;
        }
        return TEXTURE;
    }
}

