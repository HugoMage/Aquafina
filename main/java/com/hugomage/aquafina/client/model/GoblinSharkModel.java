package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.GoblinSharkEntity;
import com.hugomage.aquafina.entity.SalmonSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class GoblinSharkModel<T extends GoblinSharkEntity> extends EntityModel<T>  {
    private final ModelRenderer fish;
    private final ModelRenderer body_root;
    private final ModelRenderer body_fins;
    private final ModelRenderer body;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r2;
    private final ModelRenderer tail;
	public GoblinSharkModel() {
        texWidth = 128;
        texHeight = 128;

        fish = new ModelRenderer(this);
        fish.setPos(0.0F, 18.0F, 2.0F);


        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, 0.0F, 13.0F);
        fish.addChild(body_root);


        body_fins = new ModelRenderer(this);
        body_fins.setPos(0.0F, -4.0F, -15.0F);
        body_root.addChild(body_fins);
        body_fins.texOffs(19, 49).addBox(-1.0F, -2.0F, 9.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
        body_fins.texOffs(48, 14).addBox(-1.0F, -5.0F, -2.0F, 1.0F, 5.0F, 7.0F, 0.0F, false);
        body_fins.texOffs(0, 40).addBox(-1.0F, 10.0F, 8.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, -15.0F);
        body_root.addChild(body);
        body.texOffs(0, 0).addBox(-3.0F, -5.0F, -23.0F, 5.0F, 4.0F, 9.0F, 0.0F, false);
        body.texOffs(0, 0).addBox(-5.0F, -5.0F, -14.0F, 9.0F, 10.0F, 29.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(4.0F, 4.0F, -18.0F);
        body_root.addChild(left_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 1.0F);
        left_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.0436F, 0.2182F);
        cube_r1.texOffs(43, 42).addBox(0.0F, 0.0F, -2.0F, 8.0F, 1.0F, 7.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-5.0F, 4.0F, -18.0F);
        body_root.addChild(right_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 1.0F);
        right_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0436F, -0.2182F);
        cube_r2.texOffs(19, 40).addBox(-8.0F, 0.0F, -2.0F, 8.0F, 1.0F, 7.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 13.0F);
        fish.addChild(tail);
        tail.texOffs(48, 0).addBox(-3.0F, -3.0F, -1.0F, 5.0F, 6.0F, 7.0F, 0.0F, false);
        tail.texOffs(0, 14).addBox(-3.0F, -3.0F, 6.0F, 5.0F, 4.0F, 9.0F, 0.0F, false);
        tail.texOffs(0, 40).addBox(-1.0F, -3.0F, 1.0F, 1.0F, 8.0F, 16.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.body_root.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.fish).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}