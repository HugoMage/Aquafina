package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.MolaMolaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class BabyMolaMolaModel<T extends MolaMolaEntity> extends EntityModel<T>  {
    private final ModelRenderer fish;
    private final ModelRenderer cube_r1;

    public BabyMolaMolaModel() {
        texWidth = 32;
        texHeight = 32;

        fish = new ModelRenderer(this);
        fish.setPos(0.0F, 22.0F, 0.0F);
        fish.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
        fish.texOffs(0, 9).addBox(0.0F, -3.0F, -1.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, -2.0F);
        fish.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        cube_r1.texOffs(0, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.fish.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.fish).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}