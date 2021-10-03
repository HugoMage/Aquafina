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
    private final ModelRenderer body;
    private final ModelRenderer legs;
    private final ModelRenderer left_leg_1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_leg_2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer left_leg_3;
    private final ModelRenderer cube_r3;
    private final ModelRenderer right_leg_1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer right_leg_2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer right_leg_3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer head;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer right_arm;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer left_arm;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
	public YetiCrabModel() {
        texWidth = 64;
        texHeight = 64;

        crab = new ModelRenderer(this);
        crab.setPos(0.0F, 22.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, 0.0F);
        crab.addChild(body);
        body.texOffs(0, 0).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);

        legs = new ModelRenderer(this);
        legs.setPos(0.0F, 1.0F, 0.0F);
        body.addChild(legs);


        left_leg_1 = new ModelRenderer(this);
        left_leg_1.setPos(2.0F, -1.0F, -1.0F);
        legs.addChild(left_leg_1);
        setRotationAngle(left_leg_1, 0.0F, 0.0436F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-0.0436F, 0.0F, -0.001F);
        left_leg_1.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2618F);
        cube_r1.texOffs(27, 27).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        left_leg_2 = new ModelRenderer(this);
        left_leg_2.setPos(2.0F, -1.0F, 1.0F);
        legs.addChild(left_leg_2);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        left_leg_2.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2618F);
        cube_r2.texOffs(24, 16).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        left_leg_3 = new ModelRenderer(this);
        left_leg_3.setPos(2.0F, -1.0F, 3.0F);
        legs.addChild(left_leg_3);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        left_leg_3.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.4363F, 0.3491F);
        cube_r3.texOffs(28, 4).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, 0.0F, false);

        right_leg_1 = new ModelRenderer(this);
        right_leg_1.setPos(-2.0F, -1.0F, -1.0F);
        legs.addChild(right_leg_1);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        right_leg_1.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2618F);
        cube_r4.texOffs(16, 27).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        right_leg_2 = new ModelRenderer(this);
        right_leg_2.setPos(-2.0F, -1.0F, 1.0F);
        legs.addChild(right_leg_2);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, 0.0F);
        right_leg_2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.2618F);
        cube_r5.texOffs(26, 0).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        right_leg_3 = new ModelRenderer(this);
        right_leg_3.setPos(-2.0F, -1.0F, 3.0F);
        legs.addChild(right_leg_3);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.0F, 0.0F);
        right_leg_3.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.4363F, -0.3491F);
        cube_r6.texOffs(28, 2).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, -2.0F);
        body.addChild(head);
        head.texOffs(15, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, 1.0F, -2.0F);
        head.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, -0.1309F, 0.0F);
        cube_r7.texOffs(23, 18).addBox(0.0F, -2.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.0F, 1.0F, -2.0F);
        head.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.1309F, 0.0F);
        cube_r8.texOffs(9, 24).addBox(0.0F, -2.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setPos(-2.0F, 1.0F, -1.0F);
        crab.addChild(right_arm);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.0F, 0.0F, 0.0F);
        right_arm.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, -0.0436F, 0.0F);
        cube_r9.texOffs(14, 16).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(-1.0F, 0.0F, -4.0F);
        right_arm.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, -0.0436F, 0.0F);
        cube_r10.texOffs(0, 11).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setPos(2.0F, 1.0F, -1.0F);
        crab.addChild(left_arm);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(1.0F, 0.0F, -4.0F);
        left_arm.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0436F, 0.0F);
        cube_r11.texOffs(16, 6).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(0.0F, 0.0F, 0.0F);
        left_arm.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0436F, 0.0F);
        cube_r12.texOffs(0, 21).addBox(0.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);
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