package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.SalmonSharkEntity;
import com.hugomage.aquafina.entity.TriopEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class TriopModel<T extends TriopEntity> extends EntityModel<T>  {
    private final ModelRenderer thing;
    private final ModelRenderer body;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer left_whisker;
    private final ModelRenderer right_whisker;

	public TriopModel() {
        texWidth = 32;
        texHeight = 32;

        thing = new ModelRenderer(this);
        thing.setPos(0.0F, 24.0F, -1.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 1.0F);
        thing.addChild(body);
        body.texOffs(14, 8).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        body.texOffs(0, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 3.0F);
        thing.addChild(tail);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, -3.0F);
        tail.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        cube_r1.texOffs(7, 9).addBox(1.0261F, -1.0F, 2.8191F, 0.0F, 1.0F, 6.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, -3.0F);
        tail.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        cube_r2.texOffs(0, 7).addBox(-1.0261F, -1.0F, 2.8191F, 0.0F, 1.0F, 6.0F, 0.0F, false);

        left_whisker = new ModelRenderer(this);
        left_whisker.setPos(2.0F, 0.0F, -2.0F);
        thing.addChild(left_whisker);
        left_whisker.texOffs(13, 0).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 3.0F, 0.0F, false);

        right_whisker = new ModelRenderer(this);
        right_whisker.setPos(-2.0F, 0.0F, -2.0F);
        thing.addChild(right_whisker);
        right_whisker.texOffs(14, 4).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 3.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.thing.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.thing).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}