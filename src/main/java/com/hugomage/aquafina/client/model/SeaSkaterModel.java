package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.SeaSkaterEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SeaSkaterModel<T extends SeaSkaterEntity> extends EntityModel<T>  {
    private final ModelRenderer bug;
    private final ModelRenderer body_root;
    private final ModelRenderer body;
    private final ModelRenderer right_leg_2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_leg_1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer left_leg_2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer left_leg_1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer head;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
	public SeaSkaterModel() {
        texWidth = 64;
        texHeight = 64;

        bug = new ModelRenderer(this);
        bug.setPos(0.0F, 22.0F, 0.0F);


        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, 2.0F, 0.0F);
        bug.addChild(body_root);


        body = new ModelRenderer(this);
        body.setPos(0.0F, -1.0F, 0.0F);
        body_root.addChild(body);
        body.texOffs(0, 13).addBox(-1.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        body.texOffs(0, 0).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 4.0F, 8.0F, 0.0F, false);

        right_leg_2 = new ModelRenderer(this);
        right_leg_2.setPos(-3.0F, -2.0F, 3.0F);
        body_root.addChild(right_leg_2);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        right_leg_2.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3491F);
        cube_r1.texOffs(0, 23).addBox(-6.0F, 0.0F, -1.0F, 6.0F, 0.0F, 9.0F, 0.0F, false);

        right_leg_1 = new ModelRenderer(this);
        right_leg_1.setPos(-3.0F, -2.0F, -1.0F);
        body_root.addChild(right_leg_1);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        right_leg_1.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
        cube_r2.texOffs(0, 13).addBox(-6.0F, 0.0F, -8.0F, 6.0F, 0.0F, 9.0F, 0.0F, false);

        left_leg_2 = new ModelRenderer(this);
        left_leg_2.setPos(3.0F, -2.0F, 3.0F);
        body_root.addChild(left_leg_2);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        left_leg_2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3491F);
        cube_r3.texOffs(22, 14).addBox(0.0F, 0.0F, -1.0F, 6.0F, 0.0F, 9.0F, 0.0F, false);

        left_leg_1 = new ModelRenderer(this);
        left_leg_1.setPos(3.0F, -2.0F, -1.0F);
        body_root.addChild(left_leg_1);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        left_leg_1.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3491F);
        cube_r4.texOffs(22, 4).addBox(0.0F, 0.0F, -8.0F, 6.0F, 0.0F, 9.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 1.0F, -4.0F);
        bug.addChild(head);
        head.texOffs(0, 33).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(-2.0F, 0.0F, -1.0F);
        head.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.6981F);
        cube_r5.texOffs(21, 0).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(2.0F, 0.0F, -1.0F);
        head.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.6981F);
        cube_r6.texOffs(0, 18).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(-1.0F, 1.0F, -2.0F);
        head.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0873F, 0.0F);
        cube_r7.texOffs(22, 24).addBox(0.0F, -1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(1.0F, 1.0F, -2.0F);
        head.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, -0.0873F, 0.0F);
        cube_r8.texOffs(28, 28).addBox(0.0F, -1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;

    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.bug).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}