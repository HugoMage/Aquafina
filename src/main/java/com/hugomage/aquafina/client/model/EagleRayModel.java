package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.CowNoseRayEntity;
import com.hugomage.aquafina.entity.EagleRayEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class EagleRayModel<T extends EagleRayEntity> extends EntityModel<T>  {
    private final ModelRenderer ray;
    private final ModelRenderer left_fin_2;
    private final ModelRenderer right_fin_2;
    private final ModelRenderer body;
    private final ModelRenderer tail;
    private final ModelRenderer right_fin;
    private final ModelRenderer left_fin;

	public EagleRayModel() {
        texWidth = 128;
        texHeight = 128;

        ray = new ModelRenderer(this);
        ray.setPos(0.0F, 23.0F, 0.0F);


        left_fin_2 = new ModelRenderer(this);
        left_fin_2.setPos(2.0F, -1.0F, 8.0F);
        ray.addChild(left_fin_2);
        left_fin_2.texOffs(16, 51).addBox(0.0F, 0.0F, 0.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);

        right_fin_2 = new ModelRenderer(this);
        right_fin_2.setPos(-2.0F, -1.0F, 8.0F);
        ray.addChild(right_fin_2);
        right_fin_2.texOffs(0, 49).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        ray.addChild(body);
        body.texOffs(0, 30).addBox(-6.0F, -2.0F, -7.0F, 12.0F, 3.0F, 15.0F, 0.0F, false);
        body.texOffs(32, 51).addBox(-3.0F, -2.0F, -9.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, -1.0F, 8.0F);
        ray.addChild(tail);
        tail.texOffs(35, 30).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 20.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-6.0F, -1.0F, 0.0F);
        ray.addChild(right_fin);
        right_fin.texOffs(0, 15).addBox(-20.0F, 0.0F, -5.0F, 20.0F, 1.0F, 13.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(6.0F, -1.0F, 0.0F);
        ray.addChild(left_fin);
        left_fin.texOffs(0, 0).addBox(0.0F, 0.0F, -5.0F, 20.0F, 1.0F, 13.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 1.0f;
        this.ray.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.3F * f1;
        this.tail.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.ray).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}