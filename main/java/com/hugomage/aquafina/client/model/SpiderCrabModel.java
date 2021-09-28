package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.SpiderCrabEntity;
import com.hugomage.aquafina.entity.YetiCrabEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SpiderCrabModel<T extends SpiderCrabEntity> extends EntityModel<T>  {
    private final ModelRenderer crab;
    private final ModelRenderer body;
    private final ModelRenderer left_arm;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer right_arm;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer left_leg_4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer left_leg_3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer left_leg_2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer left_leg_1;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer right_leg_4;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer right_leg_3;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer right_leg_2;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer right_leg_1;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
	public SpiderCrabModel() {
        texWidth = 64;
        texHeight = 64;

        crab = new ModelRenderer(this);
        crab.setPos(-2.0F, 16.0F, -1.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, -1.0F);
        crab.addChild(body);
        body.texOffs(6, 13).addBox(-3.0F, -1.0F, -5.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
        body.texOffs(0, 18).addBox(3.0F, -1.0F, -5.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
        body.texOffs(0, 0).addBox(-4.0F, -2.0F, -4.0F, 9.0F, 3.0F, 9.0F, 0.0F, false);
        body.texOffs(19, 37).addBox(-2.0F, -2.0F, -6.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setPos(5.0F, 0.0F, -4.0F);
        crab.addChild(left_arm);
        setRotationAngle(left_arm, 0.0F, 0.1745F, 0.0F);
        left_arm.texOffs(0, 32).addBox(-1.0F, -1.0F, -1.0F, 9.0F, 1.0F, 2.0F, 0.0F, false);
        left_arm.texOffs(16, 15).addBox(6.0F, -1.0F, -12.0F, 2.0F, 1.0F, 11.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(7.0F, 0.0F, -12.0F);
        left_arm.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0436F, 0.0F);
        cube_r1.texOffs(16, 15).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(7.0F, 0.0F, -12.0F);
        left_arm.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.1309F, 0.0F);
        cube_r2.texOffs(0, 13).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setPos(-4.0F, 0.0F, -3.0F);
        crab.addChild(right_arm);
        setRotationAngle(right_arm, 0.0F, -0.1745F, 0.0F);
        right_arm.texOffs(29, 31).addBox(-8.0F, -1.0F, -2.0F, 9.0F, 1.0F, 2.0F, 0.0F, false);
        right_arm.texOffs(0, 13).addBox(-8.0F, -1.0F, -13.0F, 2.0F, 1.0F, 11.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-7.0F, 0.0F, -13.0F);
        right_arm.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.0436F, 0.0F);
        cube_r3.texOffs(0, 5).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(-7.0F, 0.0F, -13.0F);
        right_arm.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.1309F, 0.0F);
        cube_r4.texOffs(0, 0).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        left_leg_4 = new ModelRenderer(this);
        left_leg_4.setPos(5.0F, 1.0F, 4.0F);
        crab.addChild(left_leg_4);
        setRotationAngle(left_leg_4, 0.0674F, -0.1611F, -0.3981F);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(8.0F, -1.0F, 0.0F);
        left_leg_4.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.0873F);
        cube_r5.texOffs(32, 23).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(8.0F, -1.0F, 0.0F);
        left_leg_4.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 1.309F);
        cube_r6.texOffs(28, 4).addBox(0.0F, 0.0F, -1.0F, 14.0F, 0.0F, 1.0F, 0.0F, false);

        left_leg_3 = new ModelRenderer(this);
        left_leg_3.setPos(5.0F, 1.0F, 2.0F);
        crab.addChild(left_leg_3);
        setRotationAngle(left_leg_3, -0.0038F, -0.0872F, -0.3543F);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(8.0F, -1.0F, 0.0F);
        left_leg_3.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -0.0873F);
        cube_r7.texOffs(37, 8).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(8.0F, -1.0F, 0.0F);
        left_leg_3.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 1.309F);
        cube_r8.texOffs(30, 29).addBox(0.0F, 0.0F, -1.0F, 14.0F, 0.0F, 1.0F, 0.0F, false);

        left_leg_2 = new ModelRenderer(this);
        left_leg_2.setPos(5.0F, 1.0F, 0.0F);
        crab.addChild(left_leg_2);
        setRotationAngle(left_leg_2, 0.0F, 0.0F, -0.3981F);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(8.0F, -1.0F, 0.0F);
        left_leg_2.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, 1.309F);
        cube_r9.texOffs(0, 30).addBox(0.0F, 0.0F, -1.0F, 14.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(8.0F, -1.0F, 0.0F);
        left_leg_2.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, -0.0873F);
        cube_r10.texOffs(0, 36).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);

        left_leg_1 = new ModelRenderer(this);
        left_leg_1.setPos(5.0F, 1.0F, -2.0F);
        crab.addChild(left_leg_1);
        setRotationAngle(left_leg_1, 0.0F, 0.0873F, -0.3981F);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(8.0F, -1.0F, 0.0F);
        left_leg_1.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, 1.309F);
        cube_r11.texOffs(28, 6).addBox(0.0F, 0.0F, -1.0F, 14.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(8.0F, -1.0F, 0.0F);
        left_leg_1.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, -0.0873F);
        cube_r12.texOffs(22, 35).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);

        right_leg_4 = new ModelRenderer(this);
        right_leg_4.setPos(-4.0F, 1.0F, 4.0F);
        crab.addChild(right_leg_4);
        setRotationAngle(right_leg_4, 0.0F, 0.1309F, 0.4854F);


        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(-8.0F, -1.0F, 0.0F);
        right_leg_4.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, 0.0873F);
        cube_r13.texOffs(32, 21).addBox(0.0F, 0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(-8.0F, -1.0F, 0.0F);
        right_leg_4.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.0F, -1.309F);
        cube_r14.texOffs(28, 2).addBox(-14.0F, 0.0F, -1.0F, 14.0F, 0.0F, 1.0F, 0.0F, false);

        right_leg_3 = new ModelRenderer(this);
        right_leg_3.setPos(-4.0F, 1.0F, 2.0F);
        crab.addChild(right_leg_3);
        setRotationAngle(right_leg_3, 0.0F, 0.0873F, 0.4854F);


        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(-8.0F, -1.0F, 0.0F);
        right_leg_3.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, -1.309F);
        cube_r15.texOffs(16, 13).addBox(-14.0F, 0.0F, -1.0F, 14.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(-8.0F, -1.0F, 0.0F);
        right_leg_3.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, 0.0873F);
        cube_r16.texOffs(32, 15).addBox(0.0F, 0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);

        right_leg_2 = new ModelRenderer(this);
        right_leg_2.setPos(-4.0F, 1.0F, 0.0F);
        crab.addChild(right_leg_2);
        setRotationAngle(right_leg_2, 0.0F, 0.0F, 0.4854F);


        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(-8.0F, -1.0F, 0.0F);
        right_leg_2.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, -1.309F);
        cube_r17.texOffs(0, 28).addBox(-14.0F, 0.0F, -1.0F, 14.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(-8.0F, -1.0F, 0.0F);
        right_leg_2.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, 0.0873F);
        cube_r18.texOffs(32, 17).addBox(0.0F, 0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);

        right_leg_1 = new ModelRenderer(this);
        right_leg_1.setPos(-4.0F, 1.0F, -2.0F);
        crab.addChild(right_leg_1);
        setRotationAngle(right_leg_1, 0.0F, -0.0873F, 0.4854F);


        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(-8.0F, -1.0F, 0.0F);
        right_leg_1.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.0F, -1.309F);
        cube_r19.texOffs(28, 0).addBox(-14.0F, 0.0F, -1.0F, 14.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(-8.0F, -1.0F, 0.0F);
        right_leg_1.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, 0.0873F);
        cube_r20.texOffs(32, 19).addBox(0.0F, 0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 1.0f;
        this.crab.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.left_leg_1.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.left_leg_2.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
        this.right_leg_1.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_leg_2.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
        this.left_leg_3.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.left_leg_4.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
        this.right_leg_3.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_leg_4.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;


    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.crab).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}