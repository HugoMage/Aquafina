package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.SalmonSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SalmonSharkModel<T extends SalmonSharkEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe_au_chocolat;
    private final ModelRenderer body_root;
    private final ModelRenderer body_blocks;
    private final ModelRenderer top_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r2;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;

	public SalmonSharkModel() {
        texWidth = 64;
        texHeight = 64;

        fishe_au_chocolat = new ModelRenderer(this);
        fishe_au_chocolat.setPos(0.0F, 21.0F, -1.0F);


        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, 0.0F, 0.0F);
        fishe_au_chocolat.addChild(body_root);


        body_blocks = new ModelRenderer(this);
        body_blocks.setPos(0.0F, 0.0F, -1.0F);
        body_root.addChild(body_blocks);
        body_blocks.texOffs(0, 0).addBox(-2.0F, -3.0F, -4.0F, 5.0F, 6.0F, 11.0F, 0.0F, false);
        body_blocks.texOffs(17, 18).addBox(-2.0F, -3.0F, -6.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);

        top_fin = new ModelRenderer(this);
        top_fin.setPos(0.0F, -3.0F, 1.0F);
        body_root.addChild(top_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, -2.0F);
        top_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        cube_r1.texOffs(0, 0).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(3.0F, 0.0F, -1.0F);
        body_root.addChild(left_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.0873F, 0.1309F);
        cube_r2.texOffs(0, 28).addBox(0.0F, 0.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-2.0F, 0.0F, -1.0F);
        body_root.addChild(right_fin);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0873F, -0.1309F);
        cube_r3.texOffs(14, 26).addBox(-4.0F, 0.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 6.0F);
        fishe_au_chocolat.addChild(tail);
        tail.texOffs(0, 18).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 4.0F);
        tail.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        cube_r4.texOffs(26, 28).addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, -1.0F, 4.0F);
        tail.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        cube_r5.texOffs(22, 0).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
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
        ImmutableList.of(this.fishe_au_chocolat).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}