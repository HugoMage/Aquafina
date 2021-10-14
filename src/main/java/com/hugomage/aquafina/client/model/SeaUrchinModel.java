package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.GiantStarfishEntity;
import com.hugomage.aquafina.entity.SeaUrchinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class SeaUrchinModel<T extends SeaUrchinEntity> extends EntityModel<T>  {
    private final ModelRenderer urchin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    public SeaUrchinModel() {
        texWidth = 64;
        texHeight = 64;

        urchin = new ModelRenderer(this);
        urchin.setPos(0.0F, 22.0F, 0.0F);
        urchin.texOffs(30, 0).addBox(0.0F, -4.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);
        urchin.texOffs(0, 30).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 5.0F, 0.0F, false);
        urchin.texOffs(0, 20).addBox(-5.0F, 1.0F, -5.0F, 10.0F, 0.0F, 9.0F, 0.0F, false);
        urchin.texOffs(0, 10).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 0.0F, 9.0F, 0.0F, false);
        urchin.texOffs(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 0.0F, 9.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(2.0F, -2.0F, -1.0F);
        urchin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.5672F);
        cube_r1.texOffs(30, 10).addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-2.0F, -2.0F, -1.0F);
        urchin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.5672F);
        cube_r2.texOffs(30, 20).addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;

    }






    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.urchin).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}