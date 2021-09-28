package com.hugomage.aquafina.client.renderer;


import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.client.model.SeaSpiderModel;
import com.hugomage.aquafina.client.model.YetiCrabModel;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.SeaSpiderEntity;
import com.hugomage.aquafina.entity.YetiCrabEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SeaSpiderRenderer extends MobRenderer<SeaSpiderEntity, SeaSpiderModel<SeaSpiderEntity>> {

    protected static final ResourceLocation STRIPES = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/red_sea_spider.png");
    protected static final ResourceLocation YELLOW = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/yellow_sea_spider.png");
    protected static final ResourceLocation ORANGE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/orange_sea_spider.png");
    protected static final ResourceLocation TEXTURE = new ResourceLocation(Aquafina.MOD_ID, "textures/entity/reef_sea_spider.png");


    public SeaSpiderRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SeaSpiderModel<>(), 0.2F);
    }
    @Override
    public ResourceLocation getTextureLocation(SeaSpiderEntity entity) {
        if(entity.getVariant() == 1){
            return TEXTURE;
        }
        if(entity.getVariant() == 2) {
            return YELLOW;
        }
        if(entity.getVariant() == 3) {
            return ORANGE;
        }
        return STRIPES;
    }}


