package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.SpongeBobEntity;
import com.hugomage.aquafina.entity.YetiCrabEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SpongeBobModel<T extends SpongeBobEntity> extends EntityModel<T>  {
    private final ModelRenderer spunch;
    private final ModelRenderer body;
    private final ModelRenderer right_arm;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_arm;
    private final ModelRenderer cube_r2;
    private final ModelRenderer left_leg;
    private final ModelRenderer right_leg;
	public SpongeBobModel() {
        texWidth = 16;
        texHeight = 16;

        spunch = new ModelRenderer(this);
        spunch.setPos(0.0F, 20.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 4.0F, 0.0F);
        spunch.addChild(body);
        body.texOffs(0, 0).addBox(-3.0F, -8.0F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
        body.texOffs(0, 9).addBox(0.0F, -6.0F, -3.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setPos(-3.0F, -1.0F, 0.5F);
        spunch.addChild(right_arm);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, -0.5F);
        right_arm.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3491F);
        cube_r1.texOffs(5, 9).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setPos(3.0F, -1.0F, 0.5F);
        spunch.addChild(left_arm);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, -0.5F);
        left_arm.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
        cube_r2.texOffs(8, 9).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setPos(1.0F, 2.0F, 0.0F);
        spunch.addChild(left_leg);
        left_leg.texOffs(11, 9).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setPos(-1.0F, 2.0F, 0.0F);
        spunch.addChild(right_leg);
        right_leg.texOffs(11, 12).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.left_leg.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_leg.xRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;

    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.spunch).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}