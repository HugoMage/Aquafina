package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.CoelacanthEntity;
import com.hugomage.aquafina.entity.RoughSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class CoelacanthModel<T extends CoelacanthEntity> extends EntityModel<T>  {
    private final ModelRenderer coalcant;
    private final ModelRenderer head;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body;
    private final ModelRenderer tail;

    public CoelacanthModel() {
        texWidth = 128;
        texHeight = 128;

        coalcant = new ModelRenderer(this);
        coalcant.setPos(0.0F, 16.0F, 0.0F);


        head = new ModelRenderer(this);
        head.setPos(0.0F, 2.0F, -11.0F);
        coalcant.addChild(head);
        head.texOffs(27, 36).addBox(-3.0F, -6.0F, -7.0F, 6.0F, 10.0F, 7.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(4.0F, 5.0F, -5.0F);
        coalcant.addChild(left_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.2618F, 0.0F);
        cube_r1.texOffs(9, 13).addBox(0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-4.0F, 5.0F, -5.0F);
        coalcant.addChild(right_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
        cube_r2.texOffs(0, 13).addBox(0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, 0.0F);
        coalcant.addChild(body);
        body.texOffs(0, 0).addBox(-4.0F, -7.0F, -11.0F, 8.0F, 14.0F, 21.0F, 0.0F, false);
        body.texOffs(38, 0).addBox(-1.0F, 7.0F, 2.0F, 2.0F, 3.0F, 7.0F, 0.0F, false);
        body.texOffs(0, 36).addBox(0.0F, -11.0F, -5.0F, 0.0F, 4.0F, 13.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 2.0F, 10.0F);
        coalcant.addChild(tail);
        tail.texOffs(44, 44).addBox(0.0F, -7.0F, 0.0F, 0.0F, 12.0F, 10.0F, 0.0F, false);
        tail.texOffs(0, 0).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 8.0F, 4.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.coalcant.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.coalcant).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}