package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.PaddleFish;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class PaddleFishModel<T extends PaddleFish> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body_root;
    private final ModelRenderer body;
    private final ModelRenderer paddle;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r3;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body_fins;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;

    public PaddleFishModel() {
        texWidth = 64;
        texHeight = 64;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 24.0F, 0.0F);


        tail = new ModelRenderer(this);
        tail.setPos(0.5F, -3.1663F, 5.4021F);
        fishe.addChild(tail);
        tail.texOffs(18, 20).addBox(-2.5F, -1.8337F, -0.4021F, 5.0F, 4.0F, 5.0F, 0.0F, false);
        tail.texOffs(25, 30).addBox(-1.5F, -1.8337F, 4.5979F, 3.0F, 3.0F, 2.0F, 0.0F, false);
        tail.texOffs(0, 31).addBox(-0.5F, -4.8337F, 0.5979F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        tail.texOffs(22, 0).addBox(-0.5F, 2.1663F, 0.5979F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-0.5F, 0.1663F, 6.5979F);
        tail.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        cube_r1.texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-0.5F, 0.1663F, 6.5979F);
        tail.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        cube_r2.texOffs(22, 0).addBox(0.0F, -1.9981F, -0.0872F, 1.0F, 2.0F, 7.0F, 0.0F, false);

        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, -3.0F, 0.0F);
        fishe.addChild(body_root);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, 0.0F);
        body_root.addChild(body);
        body.texOffs(0, 0).addBox(-2.0F, -3.0F, -6.0F, 5.0F, 5.0F, 11.0F, 0.0F, false);

        paddle = new ModelRenderer(this);
        paddle.setPos(0.0F, -2.0F, -6.0F);
        body_root.addChild(paddle);
        paddle.texOffs(0, 25).addBox(-1.0F, 0.0F, -4.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
        paddle.texOffs(0, 17).addBox(-2.0F, 0.0F, -10.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(3.0F, 2.0F, 0.0F);
        body_root.addChild(left_fin);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3491F);
        cube_r3.texOffs(30, 14).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-2.0F, 2.0F, 0.0F);
        body_root.addChild(right_fin);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
        cube_r4.texOffs(12, 30).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);

        body_fins = new ModelRenderer(this);
        body_fins.setPos(0.0F, 3.0F, 5.0F);
        body_root.addChild(body_fins);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, -1.0F);
        body_fins.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
        cube_r5.texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(1.0F, 0.0F, -1.0F);
        body_fins.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
        cube_r6.texOffs(0, 7).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.body_root.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }





    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.fishe).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}