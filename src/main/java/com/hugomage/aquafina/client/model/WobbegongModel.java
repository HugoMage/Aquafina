package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.GuitarSharkEntity;
import com.hugomage.aquafina.entity.WobbegongEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class WobbegongModel<T extends WobbegongEntity> extends EntityModel<T>  {
    private final ModelRenderer shark;
    private final ModelRenderer body;
    private final ModelRenderer whisker;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_fin;
    private final ModelRenderer left_fin;
    private final ModelRenderer tail;
    private final ModelRenderer tail_fin;
    public WobbegongModel() {
        texWidth = 64;
        texHeight = 64;
        shark = new ModelRenderer(this);
        shark.setPos(0.0F, 23.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        shark.addChild(body);
        body.texOffs(0, 0).addBox(-3.0F, -2.0F, -8.0F, 6.0F, 3.0F, 14.0F, 0.0F, false);
        body.texOffs(0, 18).addBox(0.0F, -4.0F, 2.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);

        whisker = new ModelRenderer(this);
        whisker.setPos(0.0F, 0.0F, -8.0F);
        shark.addChild(whisker);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        whisker.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        cube_r1.texOffs(21, 18).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 0.0F, 2.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-3.0F, 0.0F, -2.0F);
        shark.addChild(right_fin);
        right_fin.texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(3.0F, 0.0F, -2.0F);
        shark.addChild(left_fin);
        left_fin.texOffs(0, 6).addBox(0.0F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 6.0F);
        shark.addChild(tail);
        tail.texOffs(0, 0).addBox(0.0F, -2.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        tail.texOffs(8, 18).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

        tail_fin = new ModelRenderer(this);
        tail_fin.setPos(0.0F, 0.0F, 4.0F);
        tail.addChild(tail_fin);
        tail_fin.texOffs(0, 18).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.shark.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.shark).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}