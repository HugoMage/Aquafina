package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.MolaMolaEntity;
import com.hugomage.aquafina.entity.SlenderSunfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class MolaMolaModel<T extends MolaMolaEntity> extends EntityModel<T>  {
    private final ModelRenderer fish;
    private final ModelRenderer body;
    private final ModelRenderer down_fin;
    private final ModelRenderer up_fin;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r2;

    public MolaMolaModel() {
        texWidth = 128;
        texHeight = 128;

        fish = new ModelRenderer(this);
        fish.setPos(0.0F, 11.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 3.0F, 0.0F);
        fish.addChild(body);
        body.texOffs(0, 0).addBox(-2.0F, -5.0F, -16.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
        body.texOffs(0, 0).addBox(-3.0F, -17.0F, -14.0F, 5.0F, 27.0F, 26.0F, 0.0F, false);

        down_fin = new ModelRenderer(this);
        down_fin.setPos(0.0F, 13.0F, 7.0F);
        fish.addChild(down_fin);
        down_fin.texOffs(19, 54).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 18.0F, 8.0F, 0.0F, false);

        up_fin = new ModelRenderer(this);
        up_fin.setPos(0.0F, -14.0F, 7.0F);
        fish.addChild(up_fin);
        up_fin.texOffs(0, 54).addBox(-1.0F, -18.0F, -4.0F, 1.0F, 18.0F, 8.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(2.0F, 3.0F, -6.0F);
        fish.addChild(left_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.48F, 0.0F);
        cube_r1.texOffs(0, 10).addBox(0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-3.0F, 3.0F, -6.0F);
        fish.addChild(right_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.48F, 0.0F);
        cube_r2.texOffs(7, 6).addBox(0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.fish.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.left_fin.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.xRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
        this.up_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.down_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
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