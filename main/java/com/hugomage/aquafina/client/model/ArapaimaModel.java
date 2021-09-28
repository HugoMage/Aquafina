package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.ArapaimaEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ArapaimaModel<T extends ArapaimaEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer body_root;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r2;
    private final ModelRenderer back_fins;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer tail_root;
    private final ModelRenderer tail_2_block;
    private final ModelRenderer tail;
    private final ModelRenderer tail_fin;
	public ArapaimaModel() {
        texHeight = 128;
        texWidth = 128;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 20.0F, 3.0F);


        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, 0.0F, 7.0F);
        fishe.addChild(body_root);


        left_fin = new ModelRenderer(this);
        left_fin.setPos(4.0F, 3.0F, -21.0F);
        body_root.addChild(left_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        cube_r1.texOffs(8, 8).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-4.0F, 3.0F, -21.0F);
        body_root.addChild(right_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.1745F, 0.0F);
        cube_r2.texOffs(8, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);

        back_fins = new ModelRenderer(this);
        back_fins.setPos(0.0F, 0.0F, -3.0F);
        body_root.addChild(back_fins);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-4.0F, 3.0F, -2.0F);
        back_fins.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        cube_r3.texOffs(0, 8).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(4.0F, 3.0F, -2.0F);
        back_fins.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        cube_r4.texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, -1.0F, -3.0F);
        body_root.addChild(body);
        body.texOffs(0, 0).addBox(-4.0F, -4.0F, -24.0F, 8.0F, 9.0F, 26.0F, 0.0F, false);
        body.texOffs(0, 47).addBox(-4.0F, 0.0F, -31.0F, 8.0F, 5.0F, 7.0F, 0.0F, false);

        tail_root = new ModelRenderer(this);
        tail_root.setPos(0.0F, 0.0F, 7.0F);
        fishe.addChild(tail_root);


        tail_2_block = new ModelRenderer(this);
        tail_2_block.setPos(0.0F, 0.0F, -1.0F);
        tail_root.addChild(tail_2_block);
        tail_2_block.texOffs(40, 35).addBox(-4.0F, -5.0F, 0.0F, 8.0F, 9.0F, 12.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 12.0F);
        tail_2_block.addChild(tail);
        tail.texOffs(42, 0).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 12.0F, 0.0F, false);
        tail.texOffs(0, 23).addBox(0.0F, -10.0F, -4.0F, 0.0F, 6.0F, 18.0F, 0.0F, false);
        tail.texOffs(0, 9).addBox(0.0F, 3.0F, -12.0F, 0.0F, 6.0F, 26.0F, 0.0F, false);

        tail_fin = new ModelRenderer(this);
        tail_fin.setPos(0.0F, 0.0F, 12.0F);
        tail.addChild(tail_fin);
        tail_fin.texOffs(0, 0).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T  entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.body_root.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.3F * f1;
        this.tail_root.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.2F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.2F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.2F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.2F * f1;
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