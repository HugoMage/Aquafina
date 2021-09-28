package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.YetiCrabEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class YetiCrabModel<T extends YetiCrabEntity> extends EntityModel<T>  {
    private final ModelRenderer crab;
    private final ModelRenderer body_root;
    private final ModelRenderer left_leg_1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r1_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer right_leg_1;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r3_r1;
    private final ModelRenderer right_leg_2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r4_r1;
    private final ModelRenderer left_leg_2;
    private final ModelRenderer cube_r2_r1;
    private final ModelRenderer body;
    private final ModelRenderer antennas;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer right_arm;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer left_arm;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
	public YetiCrabModel() {
        texWidth = 64;
        texHeight = 64;

        crab = new ModelRenderer(this);
        crab.setPos(0.0F, 23.0F, 0.0F);


        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, 1.0F, 0.0F);
        crab.addChild(body_root);


        left_leg_1 = new ModelRenderer(this);
        left_leg_1.setPos(3.0F, -1.0F, 1.0F);
        body_root.addChild(left_leg_1);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_leg_1.addChild(cube_r1);


        cube_r1_r1 = new ModelRenderer(this);
        cube_r1_r1.setPos(0.0F, 0.0F, 0.0F);
        cube_r1.addChild(cube_r1_r1);
        setRotationAngle(cube_r1_r1, 0.0F, 0.0F, 0.3054F);
        cube_r1_r1.texOffs(20, 34).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 2.0F);
        left_leg_1.addChild(cube_r2);


        right_leg_1 = new ModelRenderer(this);
        right_leg_1.setPos(-2.0F, -1.0F, 1.0F);
        body_root.addChild(right_leg_1);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        right_leg_1.addChild(cube_r3);


        cube_r3_r1 = new ModelRenderer(this);
        cube_r3_r1.setPos(0.0F, 0.0F, 0.0F);
        cube_r3.addChild(cube_r3_r1);
        setRotationAngle(cube_r3_r1, 0.0F, 0.0F, -0.3054F);
        cube_r3_r1.texOffs(37, 32).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        right_leg_2 = new ModelRenderer(this);
        right_leg_2.setPos(-2.0F, -1.0F, 3.0F);
        body_root.addChild(right_leg_2);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        right_leg_2.addChild(cube_r4);


        cube_r4_r1 = new ModelRenderer(this);
        cube_r4_r1.setPos(0.0F, 0.0F, 0.0F);
        cube_r4.addChild(cube_r4_r1);
        setRotationAngle(cube_r4_r1, 0.0F, 0.0F, -0.3054F);
        cube_r4_r1.texOffs(37, 34).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        left_leg_2 = new ModelRenderer(this);
        left_leg_2.setPos(3.0F, -1.0F, 3.0F);
        body_root.addChild(left_leg_2);


        cube_r2_r1 = new ModelRenderer(this);
        cube_r2_r1.setPos(0.0F, 0.0F, 0.0F);
        left_leg_2.addChild(cube_r2_r1);
        setRotationAngle(cube_r2_r1, 0.0F, 0.0F, 0.3054F);
        cube_r2_r1.texOffs(20, 34).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, -2.0F, 0.0F);
        body_root.addChild(body);
        body.texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
        body.texOffs(18, 0).addBox(-2.0F, -1.0F, -4.0F, 5.0F, 3.0F, 2.0F, 0.0F, false);

        antennas = new ModelRenderer(this);
        antennas.setPos(0.0F, 0.0F, 0.0F);
        body_root.addChild(antennas);


        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(0.0F, 0.0F, -4.0F);
        antennas.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.2182F, 0.0F);
        cube_r15.texOffs(0, 0).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(1.0F, 0.0F, -4.0F);
        antennas.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, -0.2182F, 0.0F);
        cube_r16.texOffs(0, 0).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setPos(-2.0F, 0.0F, -2.0F);
        crab.addChild(right_arm);
        right_arm.texOffs(0, 24).addBox(-3.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
        right_arm.texOffs(16, 17).addBox(-4.0F, -2.0F, -12.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
        right_arm.texOffs(29, 37).addBox(-3.0F, -1.0F, -14.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 1.0F, 0.0F);
        right_arm.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.0436F);
        cube_r5.texOffs(38, 37).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.0F, -8.0F);
        right_arm.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
        cube_r6.texOffs(32, 16).addBox(0.0F, 0.0F, -4.0F, 1.0F, 0.0F, 7.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, 1.0F, -8.0F);
        right_arm.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, 0.6109F);
        cube_r7.texOffs(0, 33).addBox(0.0F, 0.0F, -4.0F, 1.0F, 0.0F, 7.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(-4.0F, 1.0F, -8.0F);
        right_arm.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, -0.3054F);
        cube_r8.texOffs(10, 37).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 0.0F, 7.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(-4.0F, 0.0F, -8.0F);
        right_arm.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.3927F);
        cube_r9.texOffs(37, 24).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 0.0F, 7.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setPos(3.0F, 0.0F, -2.0F);
        crab.addChild(left_arm);
        left_arm.texOffs(19, 6).addBox(1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
        left_arm.texOffs(20, 29).addBox(1.0F, -1.0F, -14.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        left_arm.texOffs(0, 12).addBox(0.0F, -2.0F, -12.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(0.0F, 1.0F, 0.0F);
        left_arm.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.0436F);
        cube_r10.texOffs(20, 37).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(0.0F, 0.0F, -9.0F);
        left_arm.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, -0.48F);
        cube_r11.texOffs(27, 29).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 0.0F, 7.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(0.0F, 1.0F, -9.0F);
        left_arm.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, -0.48F);
        cube_r12.texOffs(30, 0).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 0.0F, 7.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(4.0F, 1.0F, -9.0F);
        left_arm.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, 0.4363F);
        cube_r13.texOffs(29, 8).addBox(0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 7.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(4.0F, 0.0F, -9.0F);
        left_arm.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.0F, 0.3054F);
        cube_r14.texOffs(10, 29).addBox(0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 7.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.crab.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.left_leg_1.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.left_leg_2.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
        this.right_leg_1.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_leg_2.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
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