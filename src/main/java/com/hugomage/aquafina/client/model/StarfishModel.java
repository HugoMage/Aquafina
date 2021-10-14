package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.GiantStarfishEntity;
import com.hugomage.aquafina.entity.StarfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class StarfishModel<T extends StarfishEntity> extends EntityModel<T>  {
    private final ModelRenderer fish;
    private final ModelRenderer body;
    private final ModelRenderer head_maybe;
    private final ModelRenderer right_leg;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_arm;
    private final ModelRenderer cube_r2;
    private final ModelRenderer left_leg;
    private final ModelRenderer cube_r3;
    private final ModelRenderer right_arm;
    private final ModelRenderer cube_r4;
    public StarfishModel() {
        texWidth = 32;
        texHeight = 32;

        fish = new ModelRenderer(this);
        fish.setPos(0.0F, 23.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        fish.addChild(body);
        body.texOffs(0, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

        head_maybe = new ModelRenderer(this);
        head_maybe.setPos(0.0F, 0.0F, 2.0F);
        fish.addChild(head_maybe);
        head_maybe.texOffs(0, 13).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setPos(2.0F, 0.0F, -2.0F);
        fish.addChild(right_leg);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-2.0F, 0.0F, 0.0F);
        right_leg.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
        cube_r1.texOffs(9, 9).addBox(0.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setPos(-2.0F, 0.0F, 2.0F);
        fish.addChild(left_arm);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, -3.0F);
        left_arm.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        cube_r2.texOffs(15, 5).addBox(-4.0872F, 0.0F, 0.9981F, 4.0F, 1.0F, 2.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setPos(-2.0F, 0.0F, -2.0F);
        fish.addChild(left_leg);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(2.0F, 0.0F, 0.0F);
        left_leg.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.2182F, 0.0F);
        cube_r3.texOffs(0, 7).addBox(-2.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setPos(2.0F, 0.0F, 2.0F);
        fish.addChild(right_arm);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, -3.0F);
        right_arm.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        cube_r4.texOffs(13, 0).addBox(0.0F, 0.0F, 1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
    }



    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;

    }






    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.fish).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}