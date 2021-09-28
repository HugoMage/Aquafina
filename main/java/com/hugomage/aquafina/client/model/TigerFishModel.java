package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.TigerFishEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class TigerFishModel<T extends TigerFishEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer tail;
    private final ModelRenderer body_root;
    private final ModelRenderer body;
    private final ModelRenderer down_fins;
    private final ModelRenderer up_fin;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r2;
    private final ModelRenderer head;
    private final ModelRenderer mouth_up;
    private final ModelRenderer mouth_down;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
	public TigerFishModel() {
        texWidth = 64;
        texHeight = 64;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 21.0F, -2.0F);


        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 9.0F);
        fishe.addChild(tail);
        tail.texOffs(0, 24).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        tail.texOffs(0, 0).addBox(0.0F, -4.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        tail.texOffs(0, 0).addBox(0.0F, -5.0F, 4.0F, 0.0F, 8.0F, 4.0F, 0.0F, false);

        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, 0.0F, 2.0F);
        fishe.addChild(body_root);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        body_root.addChild(body);
        body.texOffs(0, 0).addBox(-3.0F, -5.0F, -8.0F, 6.0F, 8.0F, 15.0F, 0.0F, false);

        down_fins = new ModelRenderer(this);
        down_fins.setPos(0.0F, 3.0F, 1.0F);
        body_root.addChild(down_fins);
        down_fins.texOffs(0, 34).addBox(0.0F, 0.0F, 1.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
        down_fins.texOffs(9, 0).addBox(0.0F, 0.0F, -3.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        up_fin = new ModelRenderer(this);
        up_fin.setPos(0.0F, -5.0F, 1.0F);
        body_root.addChild(up_fin);
        up_fin.texOffs(9, 34).addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-3.0F, 2.0F, -5.0F);
        body_root.addChild(right_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.5672F);
        cube_r1.texOffs(28, 8).addBox(-4.0F, 0.0F, -1.0F, 4.0F, 0.0F, 3.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(3.0F, 2.0F, -5.0F);
        body_root.addChild(left_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5672F);
        cube_r2.texOffs(33, 24).addBox(0.0F, 0.0F, -1.0F, 4.0F, 0.0F, 3.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, -6.0F);
        fishe.addChild(head);


        mouth_up = new ModelRenderer(this);
        mouth_up.setPos(0.0F, -2.0F, 0.0F);
        head.addChild(mouth_up);
        mouth_up.texOffs(19, 24).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        mouth_down = new ModelRenderer(this);
        mouth_down.setPos(0.0F, 0.0F, 0.0F);
        head.addChild(mouth_down);
        setRotationAngle(mouth_down, 0.3491F, 0.0F, 0.0F);
        mouth_down.texOffs(28, 0).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-2.0F, 0.0F, -1.0F);
        mouth_down.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0436F);
        cube_r3.texOffs(33, 29).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(2.0F, 0.0F, -1.0F);
        mouth_down.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.0436F);
        cube_r4.texOffs(4, 8).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, 0.0F, false);
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