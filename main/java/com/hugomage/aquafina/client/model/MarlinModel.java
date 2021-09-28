package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.BaskingSharkEntity;
import com.hugomage.aquafina.entity.MarlinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class MarlinModel<T extends MarlinEntity> extends EntityModel<T>  {
    private final ModelRenderer dish;
    private final ModelRenderer body;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r2;
    private final ModelRenderer tail_root;
    private final ModelRenderer tail_1;
    private final ModelRenderer tail_2;
	public MarlinModel() {
        texWidth = 128;
        texHeight = 128;

        dish = new ModelRenderer(this);
        dish.setPos(0.0F, 17.0F, 3.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, 10.0F);
        dish.addChild(body);
        body.texOffs(0, 46).addBox(0.0F, -19.0F, -20.0F, 0.0F, 11.0F, 20.0F, 0.0F, false);
        body.texOffs(0, 0).addBox(-5.0F, -8.0F, -31.0F, 10.0F, 14.0F, 31.0F, 0.0F, false);
        body.texOffs(41, 46).addBox(0.0F, -1.0F, -51.0F, 0.0F, 2.0F, 20.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(5.0F, 2.0F, -22.0F);
        body.addChild(left_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.3491F, 0.0F);
        cube_r1.texOffs(21, 46).addBox(0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 8.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-5.0F, 2.0F, -22.0F);
        body.addChild(right_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.3491F, 0.0F);
        cube_r2.texOffs(0, 46).addBox(0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 8.0F, 0.0F, false);

        tail_root = new ModelRenderer(this);
        tail_root.setPos(0.0F, 1.0F, 10.0F);
        dish.addChild(tail_root);


        tail_1 = new ModelRenderer(this);
        tail_1.setPos(0.0F, -1.0F, 0.0F);
        tail_root.addChild(tail_1);
        tail_1.texOffs(52, 0).addBox(-4.0F, -6.0F, 0.0F, 8.0F, 12.0F, 9.0F, 0.0F, false);
        tail_1.texOffs(38, 46).addBox(0.0F, 6.0F, 6.0F, 0.0F, 6.0F, 3.0F, 0.0F, false);
        tail_1.texOffs(0, 17).addBox(0.0F, -10.0F, 0.0F, 0.0F, 4.0F, 9.0F, 0.0F, false);

        tail_2 = new ModelRenderer(this);
        tail_2.setPos(0.0F, 0.0F, 9.0F);
        tail_1.addChild(tail_2);
        tail_2.texOffs(28, 69).addBox(0.0F, -10.0F, 8.0F, 0.0F, 19.0F, 13.0F, 0.0F, false);
        tail_2.texOffs(0, 0).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 8.0F, 8.0F, 0.0F, false);
        tail_2.texOffs(19, 17).addBox(0.0F, 4.0F, 0.0F, 0.0F, 8.0F, 5.0F, 0.0F, false);
        tail_2.texOffs(0, 17).addBox(0.0F, -8.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 0.5f;
        this.dish.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail_root.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.tail_1.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.tail_2.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;

    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.dish).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}