package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.HatchetFishEntity;
import com.hugomage.aquafina.entity.PlecostomusEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class PlecostomusModel<T extends PlecostomusEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r4;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r5;
	public PlecostomusModel() {
        texWidth = 64;
        texHeight = 64;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 23.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 4.0F);
        fishe.addChild(body);
        body.texOffs(0, 0).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -3.0F, -4.0F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        cube_r1.texOffs(0, 12).addBox(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 7.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 1.0F, -3.0F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        cube_r2.texOffs(22, 13).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, -1.0F, -7.0F);
        body.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        cube_r3.texOffs(16, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 4.0F);
        fishe.addChild(tail);
        tail.texOffs(15, 12).addBox(0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-2.0F, 1.0F, -1.0F);
        fishe.addChild(right_fin);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.1309F);
        cube_r4.texOffs(8, 12).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(2.0F, 1.0F, -1.0F);
        fishe.addChild(left_fin);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.1309F);
        cube_r5.texOffs(22, 9).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.fishe.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.fishe).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}