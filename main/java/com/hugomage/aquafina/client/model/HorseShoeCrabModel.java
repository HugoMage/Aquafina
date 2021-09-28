package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.HorseShoeCrabEntity;
import com.hugomage.aquafina.entity.YetiCrabEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class HorseShoeCrabModel<T extends HorseShoeCrabEntity> extends EntityModel<T>  {
    private final ModelRenderer crabe;
    private final ModelRenderer body;
    private final ModelRenderer tail;

    public HorseShoeCrabModel() {
        texWidth = 32;
        texHeight = 32;

        crabe = new ModelRenderer(this);
        crabe.setPos(0.0F, 24.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, -1.0F, 0.0F);
        crabe.addChild(body);
        body.texOffs(0, 0).addBox(-3.0F, -1.0F, -4.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
        body.texOffs(9, 9).addBox(-2.0F, 0.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 3.0F);
        crabe.addChild(tail);
        tail.texOffs(0, 9).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.crabe.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;

    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.crabe).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}