package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.RockFishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class RockfishModel<T extends RockFishEntity> extends EntityModel<T>  {
    private final ModelRenderer fish;
    private final ModelRenderer tail;
    private final ModelRenderer body_root;
    private final ModelRenderer body;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r2;
    private final ModelRenderer mouth;
    private final ModelRenderer cube_r3;
	public RockfishModel() {
        texWidth = 32;
        texHeight = 32;

        fish = new ModelRenderer(this);
        fish.setPos(0.0F, 23.0F, -1.0F);


        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 3.0F);
        fish.addChild(tail);
        tail.texOffs(11, 11).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        tail.texOffs(0, 0).addBox(0.0F, -2.0F, 2.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, 0.0F, 3.0F);
        fish.addChild(body_root);


        body = new ModelRenderer(this);
        body.setPos(0.0F, -1.0F, -3.0F);
        body_root.addChild(body);
        body.texOffs(0, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
        body.texOffs(0, 11).addBox(0.0F, -4.0F, -1.0F, 0.0F, 3.0F, 5.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-2.0F, 0.0F, -5.0F);
        body_root.addChild(right_fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        cube_r1.texOffs(8, 17).addBox(0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(2.0F, 0.0F, -5.0F);
        body_root.addChild(left_fin);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        cube_r2.texOffs(17, 14).addBox(0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

        mouth = new ModelRenderer(this);
        mouth.setPos(0.0F, 1.0F, -6.0F);
        body_root.addChild(mouth);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        mouth.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        cube_r3.texOffs(15, 0).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, false);
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