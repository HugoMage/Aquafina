package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.MahiMahiEntity;
import com.hugomage.aquafina.entity.SlenderSunfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SlenderSunfishModel<T extends SlenderSunfishEntity> extends EntityModel<T>  {
    private final ModelRenderer fosh;
    private final ModelRenderer fin_2;
    private final ModelRenderer fin_1;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body;

    public SlenderSunfishModel() {
        texWidth = 32;
        texHeight = 32;

        fosh = new ModelRenderer(this);
        fosh.setPos(0.0F, 21.0F, 2.0F);


        fin_2 = new ModelRenderer(this);
        fin_2.setPos(0.0F, 3.0F, 4.0F);
        fosh.addChild(fin_2);
        fin_2.texOffs(14, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 4.0F, 2.0F, 0.0F, false);

        fin_1 = new ModelRenderer(this);
        fin_1.setPos(0.0F, -4.0F, 4.0F);
        fosh.addChild(fin_1);
        fin_1.texOffs(0, 0).addBox(0.0F, -5.0F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(1.0F, 0.0F, -4.0F);
        fosh.addChild(left_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        cube_r1.texOffs(11, 17).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-1.0F, 0.0F, -4.0F);
        fosh.addChild(right_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
        cube_r2.texOffs(17, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, -1.0F, -2.0F);
        fosh.addChild(body);
        body.texOffs(0, 0).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 7.0F, 9.0F, 0.0F, false);
        body.texOffs(0, 17).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.fosh.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.left_fin.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.xRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
        this.fin_1.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.fin_2.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.fosh).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}