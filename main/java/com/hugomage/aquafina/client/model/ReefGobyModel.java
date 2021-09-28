package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.ReefGobyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ReefGobyModel<T extends ReefGobyEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer body_blocks;
    private final ModelRenderer right_fin;
    private final ModelRenderer left_fin;
    private final ModelRenderer tail;
    private final ModelRenderer top_fin;
	public ReefGobyModel() {
        texWidth = 32;
        texHeight = 32;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 23.0F, 1.0F);


        body_blocks = new ModelRenderer(this);
        body_blocks.setPos(0.0F, 0.0F, -1.0F);
        fishe.addChild(body_blocks);
        body_blocks.texOffs(0, 0).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
        body_blocks.texOffs(0, 0).addBox(0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-1.0F, 1.0F, -2.0F);
        fishe.addChild(right_fin);
        right_fin.texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(1.0F, 1.0F, -2.0F);
        fishe.addChild(left_fin);
        left_fin.texOffs(4, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 3.0F);
        fishe.addChild(tail);
        tail.texOffs(0, 11).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        top_fin = new ModelRenderer(this);
        top_fin.setPos(0.0F, -1.0F, -2.0F);
        fishe.addChild(top_fin);
        top_fin.texOffs(0, 11).addBox(0.0F, -4.0F, -1.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.fishe.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
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