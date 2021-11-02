package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.HatchetFishEntity;
import com.hugomage.aquafina.entity.TripodFishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class TripodFishModel<T extends TripodFishEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer left_leg;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_leg;
    private final ModelRenderer cube_r2;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r3;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
	public TripodFishModel() {
        texWidth = 32;
        texHeight = 32;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 14.0F, 0.0F);


        left_leg = new ModelRenderer(this);
        left_leg.setPos(0.0F, 1.0F, -1.0F);
        fishe.addChild(left_leg);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_leg.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
        cube_r1.texOffs(16, 11).addBox(0.0F, 0.0F, -1.0F, 0.0F, 9.0F, 2.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setPos(0.0F, 1.0F, -1.0F);
        fishe.addChild(right_leg);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        right_leg.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
        cube_r2.texOffs(11, 11).addBox(0.0F, 0.0F, -1.0F, 0.0F, 9.0F, 2.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(1.0F, 0.0F, -1.0F);
        fishe.addChild(left_fin);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.3927F, 0.0F);
        cube_r3.texOffs(7, 20).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-1.0F, 0.0F, -1.0F);
        fishe.addChild(right_fin);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -0.3927F, 0.0F);
        cube_r4.texOffs(0, 19).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, -1.0F, 4.0F);
        fishe.addChild(tail);
        tail.texOffs(0, 0).addBox(0.0F, -2.0F, 0.0F, 0.0F, 13.0F, 5.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, -1.0F, 0.0F);
        fishe.addChild(body);
        body.texOffs(11, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 3.0F, 7.0F, 0.0F, false);
        body.texOffs(6, 0).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 2.0F, 2.0F);
        body.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        cube_r5.texOffs(14, 4).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, -1.0F, 1.0F);
        body.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        cube_r6.texOffs(0, 0).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
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