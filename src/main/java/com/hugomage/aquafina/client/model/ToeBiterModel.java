package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.ToeBiterEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ToeBiterModel<T extends ToeBiterEntity> extends EntityModel<T>  {
    private final ModelRenderer la_creatura;
    private final ModelRenderer right_jaw;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_jaw;
    private final ModelRenderer cube_r2;
    private final ModelRenderer left_leg_2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer left_leg_1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer right_leg_2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer right_leg_1;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body;

	public ToeBiterModel() {
        texWidth = 16;
        texHeight = 16;

        texWidth = 64;
        texHeight = 64;

        la_creatura = new ModelRenderer(this);
        la_creatura.setPos(0.0F, 22.0F, 0.0F);


        right_jaw = new ModelRenderer(this);
        right_jaw.setPos(-4.0F, 1.0F, -4.0F);
        la_creatura.addChild(right_jaw);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        right_jaw.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.088F, -0.1304F, -0.0115F);
        cube_r1.texOffs(19, 15).addBox(-2.0F, 0.0F, -8.0F, 4.0F, 0.0F, 10.0F, 0.0F, false);

        left_jaw = new ModelRenderer(this);
        left_jaw.setPos(4.0F, 1.0F, -4.0F);
        la_creatura.addChild(left_jaw);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        left_jaw.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.088F, 0.1304F, 0.0115F);
        cube_r2.texOffs(0, 14).addBox(-2.0F, 0.0F, -8.0F, 4.0F, 0.0F, 10.0F, 0.0F, false);

        left_leg_2 = new ModelRenderer(this);
        left_leg_2.setPos(4.0F, 1.0F, -1.0F);
        la_creatura.addChild(left_leg_2);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        left_leg_2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        cube_r3.texOffs(26, 0).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F, 0.0F, false);

        left_leg_1 = new ModelRenderer(this);
        left_leg_1.setPos(4.0F, 1.0F, 2.0F);
        la_creatura.addChild(left_leg_1);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        left_leg_1.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.0436F, -0.0873F, 0.0F);
        cube_r4.texOffs(0, 25).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F, 0.0F, false);

        right_leg_2 = new ModelRenderer(this);
        right_leg_2.setPos(-4.0F, 1.0F, -1.0F);
        la_creatura.addChild(right_leg_2);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, 0.0F);
        right_leg_2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        cube_r5.texOffs(14, 26).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F, 0.0F, false);

        right_leg_1 = new ModelRenderer(this);
        right_leg_1.setPos(-4.0F, 1.0F, 2.0F);
        la_creatura.addChild(right_leg_1);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.0F, 0.0F);
        right_leg_1.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.0436F, 0.0873F, 0.0F);
        cube_r6.texOffs(28, 27).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 2.0F, 0.0F);
        la_creatura.addChild(body);
        body.texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 9.0F, 0.0F, false);
        body.texOffs(0, 32).addBox(-3.0F, -3.0F, 5.0F, 6.0F, 2.0F, 3.0F, 0.0F, false);
        body.texOffs(19, 33).addBox(-2.0F, -3.0F, -6.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.body.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.la_creatura.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.left_leg_2.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.left_leg_1.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_leg_1.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
        this.right_leg_2.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;

	}


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.la_creatura).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}