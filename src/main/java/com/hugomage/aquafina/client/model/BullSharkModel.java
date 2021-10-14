package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.BullSharkEntity;
import com.hugomage.aquafina.entity.GoblinSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class BullSharkModel<T extends BullSharkEntity> extends EntityModel<T>  {
    private final ModelRenderer shark;
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r3;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r4;
	public BullSharkModel() {
        texWidth = 128;
        texHeight = 128;

        shark = new ModelRenderer(this);
        shark.setPos(0.0F, 15.0F, 0.0F);


        head = new ModelRenderer(this);
        head.setPos(0.0F, 3.0F, -11.0F);
        shark.addChild(head);
        head.texOffs(0, 46).addBox(-7.0F, -4.0F, -8.0F, 15.0F, 10.0F, 8.0F, 0.0F, false);
        head.texOffs(62, 0).addBox(-7.0F, -4.0F, -13.0F, 15.0F, 7.0F, 5.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 3.0F, 0.0F);
        shark.addChild(body);
        body.texOffs(0, 0).addBox(-8.0F, -12.0F, -11.0F, 17.0F, 18.0F, 27.0F, 0.0F, false);
        body.texOffs(70, 63).addBox(0.0F, -20.0F, -4.0F, 1.0F, 8.0F, 9.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 3.0F, 15.0F);
        shark.addChild(tail);
        tail.texOffs(0, 65).addBox(-5.0F, -7.0F, 1.0F, 11.0F, 11.0F, 6.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -1.0F, 7.0F);
        tail.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        cube_r1.texOffs(35, 72).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 9.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(1.0F, -1.0F, 7.0F);
        tail.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        cube_r2.texOffs(0, 0).addBox(-1.0F, -7.0F, 0.0F, 1.0F, 7.0F, 12.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(9.0F, 5.0F, -4.0F);
        shark.addChild(left_fin);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, -1.0F);
        left_fin.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.0873F, 0.0873F);
        cube_r3.texOffs(36, 59).addBox(0.0F, 0.0F, -1.0F, 10.0F, 1.0F, 11.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-8.0F, 5.0F, -4.0F);
        shark.addChild(right_fin);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, -1.0F);
        right_fin.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0873F, -0.0873F);
        cube_r4.texOffs(47, 46).addBox(-10.0F, 0.0F, -1.0F, 10.0F, 1.0F, 11.0F, 0.0F, false);
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