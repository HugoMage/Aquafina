package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.BelugaSturgeonEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class BelugaSturgeonModel<T extends BelugaSturgeonEntity> extends EntityModel<T>  {
    private final ModelRenderer fish;
    private final ModelRenderer body;
    private final ModelRenderer tail_root;
    private final ModelRenderer tail_1_block;
    private final ModelRenderer tail_2_block;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r2;

    public BelugaSturgeonModel() {
        texWidth = 128;
        texHeight = 128;

        fish = new ModelRenderer(this);
        fish.setPos(0.0F, 18.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, -1.0F, -7.0F);
        fish.addChild(body);
        body.texOffs(0, 0).addBox(-7.0F, -10.0F, -15.0F, 13.0F, 17.0F, 30.0F, 0.0F, false);

        tail_root = new ModelRenderer(this);
        tail_root.setPos(0.0F, 0.0F, 15.0F);
        body.addChild(tail_root);


        tail_1_block = new ModelRenderer(this);
        tail_1_block.setPos(0.0F, 1.0F, 0.0F);
        tail_root.addChild(tail_1_block);
        tail_1_block.texOffs(0, 48).addBox(-7.0F, -11.0F, 0.0F, 13.0F, 17.0F, 17.0F, 0.0F, false);

        tail_2_block = new ModelRenderer(this);
        tail_2_block.setPos(0.0F, -2.0F, 17.0F);
        tail_1_block.addChild(tail_2_block);
        tail_2_block.texOffs(57, 0).addBox(-5.0F, -6.0F, -1.0F, 9.0F, 11.0F, 12.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, 11.0F);
        tail_2_block.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        cube_r5.texOffs(0, 48).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 7.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.0F, 11.0F);
        tail_2_block.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        cube_r6.texOffs(0, 0).addBox(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 9.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, -6.0F, 2.0F);
        tail_2_block.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        cube_r7.texOffs(15, 12).addBox(-1.0F, -6.0F, 0.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.0F, 5.0F, 3.0F);
        tail_2_block.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        cube_r8.texOffs(0, 18).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, -15.0F);
        body.addChild(head);
        head.texOffs(61, 48).addBox(-6.0F, -7.0F, -8.0F, 11.0F, 12.0F, 8.0F, 0.0F, false);
        head.texOffs(12, 0).addBox(-2.0F, -7.0F, -10.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-2.0F, -4.0F, -9.0F);
        head.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3491F);
        cube_r3.texOffs(0, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(1.0F, -4.0F, -9.0F);
        head.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
        cube_r4.texOffs(0, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(6.0F, 3.0F, -18.0F);
        fish.addChild(left_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1745F);
        cube_r1.texOffs(54, 78).addBox(0.0F, 0.0F, -2.0F, 8.0F, 1.0F, 7.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-7.0F, 3.0F, -18.0F);
        fish.addChild(right_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2182F);
        cube_r2.texOffs(61, 69).addBox(-8.0F, 0.0F, -2.0F, 8.0F, 1.0F, 7.0F, 0.0F, false);
    }



    @Override
    public void setupAnim(T  entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.body.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.3F * f1;
        this.tail_root.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.2F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.2F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.2F * f1;
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