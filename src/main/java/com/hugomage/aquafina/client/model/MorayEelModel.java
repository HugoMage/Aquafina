package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.MorayEelEntity;
import com.hugomage.aquafina.entity.OarfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class MorayEelModel<T extends MorayEelEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer tail;

    public MorayEelModel() {
        texWidth = 64;
        texHeight = 64;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 22.0F, 6.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, -1.0F, -3.0F);
        fishe.addChild(body);
        body.texOffs(0, 0).addBox(-3.0F, -4.0F, -10.0F, 6.0F, 7.0F, 21.0F, 0.0F, false);
        body.texOffs(0, 29).addBox(0.0F, -7.0F, -7.0F, 0.0F, 11.0F, 18.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, -1.0F, -13.0F);
        fishe.addChild(head);
        head.texOffs(0, 0).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, -2.0F, 8.0F);
        fishe.addChild(tail);
        tail.texOffs(37, 29).addBox(0.0F, -6.0F, 0.0F, 0.0F, 11.0F, 13.0F, 0.0F, false);
        tail.texOffs(34, 0).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 5.0F, 11.0F, 0.0F, false);
    }



    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 0.8f;
        float speed = 1.0f;
        this.body.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;

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