package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.CoconutCrabEntity;
import com.hugomage.aquafina.entity.YetiCrabEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class CoconutCrabModel<T extends CoconutCrabEntity> extends EntityModel<T>  {
    private final ModelRenderer crabe;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer right_arm;
    private final ModelRenderer cube_r3;
    private final ModelRenderer left_arm;
    private final ModelRenderer cube_r4;
    private final ModelRenderer left_leg_3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer left_leg_2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer left_leg_1;
    private final ModelRenderer cube_r7;
    private final ModelRenderer right_leg_3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer right_leg_2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer right_leg_1;
    private final ModelRenderer cube_r10;
	public CoconutCrabModel() {
        texWidth = 64;
        texHeight = 64;

        crabe = new ModelRenderer(this);
        crabe.setPos(0.0F, 23.0F, -1.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        crabe.addChild(body);
        body.texOffs(0, 0).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 3.0F, 6.0F, 0.0F, false);
        body.texOffs(30, 0).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 1.0F, -4.0F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        cube_r1.texOffs(20, 1).addBox(0.0F, -1.0F, -9.0F, 0.0F, 1.0F, 9.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 1.0F, -4.0F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        cube_r2.texOffs(14, 15).addBox(0.0F, -1.0F, -9.0F, 0.0F, 1.0F, 9.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setPos(-4.0F, 0.0F, -2.0F);
        crabe.addChild(right_arm);
        right_arm.texOffs(0, 31).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-2.0F, 0.0F, -2.0F);
        right_arm.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.1309F, 0.0F);
        cube_r3.texOffs(0, 24).addBox(0.0F, -1.0F, -4.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setPos(4.0F, 0.0F, -2.0F);
        crabe.addChild(left_arm);
        left_arm.texOffs(11, 33).addBox(0.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(2.0F, 0.0F, -2.0F);
        left_arm.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.1309F, 0.0F);
        cube_r4.texOffs(15, 26).addBox(-3.0F, -1.0F, -4.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

        left_leg_3 = new ModelRenderer(this);
        left_leg_3.setPos(3.0F, 0.0F, 4.0F);
        crabe.addChild(left_leg_3);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(1.0F, 0.0F, 0.0F);
        left_leg_3.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.2182F, -0.0873F, 0.0F);
        cube_r5.texOffs(29, 24).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 4.0F, 0.0F, false);

        left_leg_2 = new ModelRenderer(this);
        left_leg_2.setPos(4.0F, 0.0F, 3.0F);
        crabe.addChild(left_leg_2);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.0F, 0.0F);
        left_leg_2.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -0.0873F, 0.2182F);
        cube_r6.texOffs(0, 17).addBox(0.0F, 0.0F, -1.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);

        left_leg_1 = new ModelRenderer(this);
        left_leg_1.setPos(4.0F, 0.0F, -1.0F);
        crabe.addChild(left_leg_1);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, 0.0F, 0.0F);
        left_leg_1.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0873F, 0.1309F);
        cube_r7.texOffs(24, 12).addBox(0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 5.0F, 0.0F, false);

        right_leg_3 = new ModelRenderer(this);
        right_leg_3.setPos(-3.0F, 0.0F, 4.0F);
        crabe.addChild(right_leg_3);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(-1.0F, 0.0F, 0.0F);
        right_leg_3.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.2182F, 0.0873F, 0.0F);
        cube_r8.texOffs(26, 29).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 4.0F, 0.0F, false);

        right_leg_2 = new ModelRenderer(this);
        right_leg_2.setPos(-4.0F, 0.0F, 3.0F);
        crabe.addChild(right_leg_2);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.0F, 0.0F, 0.0F);
        right_leg_2.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0873F, -0.2182F);
        cube_r9.texOffs(0, 10).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);

        right_leg_1 = new ModelRenderer(this);
        right_leg_1.setPos(-4.0F, 0.0F, -1.0F);
        crabe.addChild(right_leg_1);


        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(0.0F, 0.0F, 0.0F);
        right_leg_1.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, -0.0873F, -0.1309F);
        cube_r10.texOffs(24, 18).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 5.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 1.0f;
        this.crabe.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.left_leg_1.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.left_leg_2.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
        this.right_leg_1.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_leg_2.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.crabe).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}