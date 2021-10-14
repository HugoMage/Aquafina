package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.GiantStarfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class GiantStarfishModel<T extends GiantStarfishEntity> extends EntityModel<T>  {
    private final ModelRenderer starphich;
    private final ModelRenderer body;
    private final ModelRenderer head_i_guess;
    private final ModelRenderer right_leg;
    private final ModelRenderer left_leg;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_arm;
    private final ModelRenderer cube_r2;
    private final ModelRenderer right_arm;
    public GiantStarfishModel() {
        texWidth = 64;
        texHeight = 64;

        starphich = new ModelRenderer(this);
        starphich.setPos(0.0F, 23.0F, -1.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, 1.0F);
        starphich.addChild(body);
        body.texOffs(20, 17).addBox(-3.0F, -2.0F, -4.0F, 7.0F, 2.0F, 7.0F, 0.0F, false);

        head_i_guess = new ModelRenderer(this);
        head_i_guess.setPos(0.0F, 0.0F, -3.0F);
        starphich.addChild(head_i_guess);
        head_i_guess.texOffs(17, 2).addBox(-1.0F, 0.0F, -10.0F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setPos(0.0F, 0.0F, 4.0F);
        starphich.addChild(right_leg);
        setRotationAngle(right_leg, 0.0F, -0.4363F, 0.0F);
        right_leg.texOffs(0, 12).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setPos(3.0F, 0.0F, 4.0F);
        starphich.addChild(left_leg);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-2.0F, 0.0F, 0.0F);
        left_leg.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.4363F, 0.0F);
        cube_r1.texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setPos(4.0F, 0.0F, -1.0F);
        starphich.addChild(left_arm);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 2.0F);
        left_arm.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        cube_r2.texOffs(0, 27).addBox(0.0F, 0.0F, -3.0F, 10.0F, 1.0F, 3.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setPos(-3.0F, 0.0F, 1.0F);
        starphich.addChild(right_arm);
        setRotationAngle(right_arm, 0.0F, -0.3054F, 0.0F);
        right_arm.texOffs(27, 27).addBox(-10.0F, 0.0F, -3.0F, 10.0F, 1.0F, 3.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;

    }






    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.starphich).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}