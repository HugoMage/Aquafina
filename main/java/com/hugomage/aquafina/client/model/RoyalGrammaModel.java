package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.RoyalGrammaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class RoyalGrammaModel<T extends RoyalGrammaEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer body_root;
    private final ModelRenderer body;
    private final ModelRenderer rigth_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r2;
    private final ModelRenderer tail;
    private final ModelRenderer up_fin;
	public RoyalGrammaModel() {
        texWidth = 16;
        texHeight = 16;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 23.0F, 0.0F);


        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, 0.0F, 0.0F);
        fishe.addChild(body_root);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        body_root.addChild(body);
        body.texOffs(0, 0).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);

        rigth_fin = new ModelRenderer(this);
        rigth_fin.setPos(-1.0F, 0.0F, -1.0F);
        body_root.addChild(rigth_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        rigth_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        cube_r1.texOffs(11, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(1.0F, 0.0F, -1.0F);
        body_root.addChild(left_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        cube_r2.texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 3.0F);
        body_root.addChild(tail);
        tail.texOffs(0, 10).addBox(0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

        up_fin = new ModelRenderer(this);
        up_fin.setPos(0.0F, -2.0F, 0.0F);
        body_root.addChild(up_fin);
        up_fin.texOffs(7, 10).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.body.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.rigth_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
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