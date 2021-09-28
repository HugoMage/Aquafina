package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.SeaSpiderEntity;
import com.hugomage.aquafina.entity.YetiCrabEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SeaSpiderModel<T extends SeaSpiderEntity> extends EntityModel<T>  {
    private final ModelRenderer crabe;
    private final ModelRenderer body_block;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_leg_1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer left_leg_2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer left_leg_3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer left_leg_4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer right_leg_1;
    private final ModelRenderer cube_r6;
    private final ModelRenderer right_leg_2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer right_leg_3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer right_leg_4;
    private final ModelRenderer cube_r9;
	public SeaSpiderModel() {
        texWidth = 64;
        texHeight = 64;

        crabe = new ModelRenderer(this);
        crabe.setPos(0.0F, 15.0F, 0.0F);


        body_block = new ModelRenderer(this);
        body_block.setPos(0.0F, 0.0F, 0.0F);
        crabe.addChild(body_block);
        body_block.texOffs(39, 40).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, -2.0F);
        body_block.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        cube_r1.texOffs(0, 21).addBox(0.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        left_leg_1 = new ModelRenderer(this);
        left_leg_1.setPos(2.0F, 1.0F, -2.0F);
        crabe.addChild(left_leg_1);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-1.0F, 1.0F, 1.0F);
        left_leg_1.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.48F, -0.2182F);
        cube_r2.texOffs(32, 11).addBox(0.0F, -2.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);

        left_leg_2 = new ModelRenderer(this);
        left_leg_2.setPos(2.0F, 1.0F, 0.0F);
        crabe.addChild(left_leg_2);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-1.0F, 1.0F, 0.0F);
        left_leg_2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -0.2182F);
        cube_r3.texOffs(21, 0).addBox(0.0F, -2.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);

        left_leg_3 = new ModelRenderer(this);
        left_leg_3.setPos(2.0F, 1.0F, 0.0F);
        crabe.addChild(left_leg_3);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(-1.0F, 1.0F, 0.0F);
        left_leg_3.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0579F, -0.2555F, -0.2256F);
        cube_r4.texOffs(0, 32).addBox(0.0F, -2.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);

        left_leg_4 = new ModelRenderer(this);
        left_leg_4.setPos(1.0F, 1.0F, 1.0F);
        crabe.addChild(left_leg_4);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, -1.0F);
        left_leg_4.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.1745F, 0.2618F, 0.0F);
        cube_r5.texOffs(11, 11).addBox(0.0F, -2.0F, 0.0F, 0.0F, 10.0F, 10.0F, 0.0F, false);

        right_leg_1 = new ModelRenderer(this);
        right_leg_1.setPos(-1.0F, 1.0F, -2.0F);
        crabe.addChild(right_leg_1);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(1.0F, 1.0F, 1.0F);
        right_leg_1.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -0.48F, 0.2182F);
        cube_r6.texOffs(42, 0).addBox(-10.0F, -2.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);

        right_leg_2 = new ModelRenderer(this);
        right_leg_2.setPos(-1.0F, 1.0F, 0.0F);
        crabe.addChild(right_leg_2);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(1.0F, 1.0F, 0.0F);
        right_leg_2.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, 0.2182F);
        cube_r7.texOffs(42, 22).addBox(-10.0F, -2.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);

        right_leg_3 = new ModelRenderer(this);
        right_leg_3.setPos(-1.0F, 1.0F, 0.0F);
        crabe.addChild(right_leg_3);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(1.0F, 1.0F, 0.0F);
        right_leg_3.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0579F, 0.2555F, 0.2256F);
        cube_r8.texOffs(21, 32).addBox(-10.0F, -2.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);

        right_leg_4 = new ModelRenderer(this);
        right_leg_4.setPos(0.0F, 1.0F, 1.0F);
        crabe.addChild(right_leg_4);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.0F, 0.0F, -1.0F);
        right_leg_4.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.1745F, -0.2182F, 0.0F);
        cube_r9.texOffs(0, 0).addBox(0.0F, -2.0F, 0.0F, 0.0F, 10.0F, 10.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 0.5f;
        float speed = 0.1f;
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