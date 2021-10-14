package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.SeaCucumberEntity;
import com.hugomage.aquafina.entity.SeaSpiderEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SeaCucumberModel<T extends SeaCucumberEntity> extends EntityModel<T>  {
    private final ModelRenderer cucumber;
    private final ModelRenderer body_3;
    private final ModelRenderer body_2;
    private final ModelRenderer body_1;
	public SeaCucumberModel() {
        texWidth = 32;
        texHeight = 32;

        cucumber = new ModelRenderer(this);
        cucumber.setPos(0.0F, 22.0F, 0.0F);


        body_3 = new ModelRenderer(this);
        body_3.setPos(0.0F, 1.0F, 3.0F);
        cucumber.addChild(body_3);
        body_3.texOffs(0, 11).addBox(-1.0F, -2.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        body_2 = new ModelRenderer(this);
        body_2.setPos(0.0F, 1.0F, 0.0F);
        cucumber.addChild(body_2);
        body_2.texOffs(0, 0).addBox(-2.0F, -3.0F, -3.0F, 5.0F, 4.0F, 6.0F, 0.0F, false);

        body_1 = new ModelRenderer(this);
        body_1.setPos(0.0F, 1.0F, -3.0F);
        cucumber.addChild(body_1);
        body_1.texOffs(13, 11).addBox(-1.0F, -2.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 0.5f;
        float speed = 0.1f;

    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.cucumber).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}