package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.GiantStingrayEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class GiantStingrayModel<T extends GiantStingrayEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer tail;
    private final ModelRenderer body;
    private final ModelRenderer right_fin;
    private final ModelRenderer left_fin;
	public GiantStingrayModel() {
        texWidth = 128;
        texHeight = 128;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 23.0F, 0.0F);


        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 17.0F);
        fishe.addChild(tail);
        tail.texOffs(41, 60).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 23.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(-3.0F, 1.0F, 0.0F);
        fishe.addChild(body);
        body.texOffs(0, 60).addBox(0.0F, -1.0F, -12.0F, 6.0F, 1.0F, 29.0F, 0.0F, false);
        body.texOffs(67, 0).addBox(0.0F, -2.0F, -9.0F, 6.0F, 1.0F, 11.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-3.0F, 0.0F, 0.0F);
        fishe.addChild(right_fin);
        right_fin.texOffs(0, 30).addBox(-19.0F, 0.0F, -12.0F, 19.0F, 1.0F, 29.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(3.0F, 0.0F, 0.0F);
        fishe.addChild(left_fin);
        left_fin.texOffs(0, 0).addBox(0.0F, 0.0F, -12.0F, 19.0F, 1.0F, 29.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.2F) * degree * 0.4F * f1 + 0.1F;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.2F) * degree * -0.4F * f1 - 0.1F;
        this.tail.yRot = MathHelper.cos(f * speed * 0.3F) * degree * 0.2F * f1;
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