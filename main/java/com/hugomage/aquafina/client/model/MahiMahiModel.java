package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.IceFishEntity;
import com.hugomage.aquafina.entity.MahiMahiEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class MahiMahiModel<T extends MahiMahiEntity> extends EntityModel<T>  {
    private final ModelRenderer fesh;
    private final ModelRenderer tail;
    private final ModelRenderer tail_fin;
    private final ModelRenderer body;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_fin;

    public MahiMahiModel() {
        texWidth = 64;
        texHeight = 64;

        fesh = new ModelRenderer(this);
        fesh.setPos(0.0F, 21.0F, 0.0F);


        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 1.0F, 7.0F);
        fesh.addChild(tail);
        tail.texOffs(0, 0).addBox(0.0F, -5.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        tail.texOffs(19, 0).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);
        tail.texOffs(16, 21).addBox(0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);

        tail_fin = new ModelRenderer(this);
        tail_fin.setPos(0.0F, -1.0F, 3.0F);
        tail.addChild(tail_fin);
        tail_fin.texOffs(0, 0).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        fesh.addChild(body);
        body.texOffs(0, 21).addBox(-1.0F, -3.0F, -9.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        body.texOffs(0, 0).addBox(-1.0F, -3.0F, -7.0F, 2.0F, 6.0F, 14.0F, 0.0F, false);
        body.texOffs(19, 0).addBox(0.0F, -5.0F, -4.0F, 0.0F, 2.0F, 11.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-1.0F, 1.0F, -4.0F);
        fesh.addChild(right_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        cube_r1.texOffs(7, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(1.0F, 1.0F, -4.0F);
        fesh.addChild(left_fin);
        setRotationAngle(left_fin, 0.0F, 0.2618F, 0.0F);
        left_fin.texOffs(9, 21).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.fesh.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.fesh).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}