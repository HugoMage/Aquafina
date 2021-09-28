package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.GoliathCatfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class GoliathCatfishModel<T extends GoliathCatfishEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer body;
    private final ModelRenderer head_root;
    private final ModelRenderer head;
    private final ModelRenderer whiskers;
    private final ModelRenderer left_whisker_2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_whisker_1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer right_whisker_2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer right_whisker_1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r5;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail;
	public GoliathCatfishModel() {
        texWidth = 128;
        texHeight = 128;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 18.0F, 5.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, -3.0F);
        fishe.addChild(body);
        body.texOffs(0, 0).addBox(-10.0F, -9.0F, -11.0F, 20.0F, 14.0F, 22.0F, 0.0F, false);

        head_root = new ModelRenderer(this);
        head_root.setPos(0.0F, -2.0F, -11.0F);
        body.addChild(head_root);


        head = new ModelRenderer(this);
        head.setPos(0.0F, 1.0F, 0.0F);
        head_root.addChild(head);
        head.texOffs(72, 47).addBox(-8.0F, -3.0F, -9.0F, 16.0F, 6.0F, 1.0F, 0.0F, false);
        head.texOffs(63, 0).addBox(-9.0F, -6.0F, -8.0F, 18.0F, 10.0F, 9.0F, 0.0F, false);

        whiskers = new ModelRenderer(this);
        whiskers.setPos(0.0F, 1.0F, -4.0F);
        head_root.addChild(whiskers);


        left_whisker_2 = new ModelRenderer(this);
        left_whisker_2.setPos(9.0F, 2.0F, 0.0F);
        whiskers.addChild(left_whisker_2);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_whisker_2.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        cube_r1.texOffs(0, 5).addBox(0.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F, 0.0F, false);

        left_whisker_1 = new ModelRenderer(this);
        left_whisker_1.setPos(9.0F, -1.0F, -3.0F);
        whiskers.addChild(left_whisker_1);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, -2.0F, 0.0F);
        left_whisker_1.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.9163F, 0.0F);
        cube_r2.texOffs(72, 42).addBox(0.0F, 0.0F, 0.0F, 20.0F, 4.0F, 0.0F, 0.0F, false);

        right_whisker_2 = new ModelRenderer(this);
        right_whisker_2.setPos(-9.0F, 2.0F, 0.0F);
        whiskers.addChild(right_whisker_2);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        right_whisker_2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
        cube_r3.texOffs(0, 0).addBox(-8.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F, 0.0F, false);

        right_whisker_1 = new ModelRenderer(this);
        right_whisker_1.setPos(-9.0F, -1.0F, -3.0F);
        whiskers.addChild(right_whisker_1);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, -2.0F, 0.0F);
        right_whisker_1.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.9163F, 0.0F);
        cube_r4.texOffs(72, 37).addBox(-20.0F, 0.0F, 0.0F, 20.0F, 4.0F, 0.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(10.0F, 2.0F, -12.0F);
        fishe.addChild(left_fin);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.3491F, 0.0F);
        cube_r5.texOffs(9, 10).addBox(0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 4.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-10.0F, 2.0F, -12.0F);
        fishe.addChild(right_fin);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
        cube_r6.texOffs(0, 10).addBox(0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 4.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(1.0F, -2.0F, 7.0F);
        fishe.addChild(tail);
        tail.texOffs(0, 67).addBox(-7.0F, -4.0F, 15.0F, 12.0F, 8.0F, 10.0F, 0.0F, false);
        tail.texOffs(0, 37).addBox(-10.0F, -5.0F, -1.0F, 18.0F, 12.0F, 17.0F, 0.0F, false);
        tail.texOffs(45, 41).addBox(-1.0F, -6.0F, 5.0F, 0.0F, 18.0F, 26.0F, 0.0F, false);
        tail.texOffs(0, 37).addBox(-1.0F, -7.0F, 5.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T  entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.body.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.3F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.2F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.2F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.2F * f1;
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