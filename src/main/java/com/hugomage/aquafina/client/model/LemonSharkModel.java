package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.BullSharkEntity;
import com.hugomage.aquafina.entity.LemonSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class LemonSharkModel<T extends LemonSharkEntity> extends EntityModel<T>  {
    private final ModelRenderer fish;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r3;
    private final ModelRenderer let_fin;
    private final ModelRenderer cube_r4;

    public LemonSharkModel() {
        texWidth = 128;
        texHeight = 128;

        fish = new ModelRenderer(this);
        fish.setPos(0.0F, 20.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        fish.addChild(body);
        body.texOffs(0, 0).addBox(-6.0F, -6.0F, -13.0F, 11.0F, 10.0F, 30.0F, 0.0F, false);
        body.texOffs(21, 49).addBox(-1.0F, -12.0F, -7.0F, 1.0F, 6.0F, 8.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, -13.0F);
        fish.addChild(head);
        head.texOffs(0, 0).addBox(-4.0F, -4.0F, -6.0F, 7.0F, 8.0F, 6.0F, 0.0F, false);
        head.texOffs(40, 49).addBox(-4.0F, -4.0F, -10.0F, 7.0F, 5.0F, 4.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 1.0F, 17.0F);
        fish.addChild(tail);
        tail.texOffs(0, 15).addBox(-3.0F, -4.0F, 0.0F, 5.0F, 5.0F, 7.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -2.0F, 7.0F);
        tail.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        cube_r1.texOffs(53, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, -2.0F, 6.0F);
        tail.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        cube_r2.texOffs(0, 49).addBox(-1.0F, -6.0F, 0.0F, 1.0F, 6.0F, 9.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-6.0F, 3.0F, -4.0F);
        fish.addChild(right_fin);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, -1.0F);
        right_fin.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.1309F, -0.1309F);
        cube_r3.texOffs(0, 41).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 1.0F, 6.0F, 0.0F, false);

        let_fin = new ModelRenderer(this);
        let_fin.setPos(5.0F, 3.0F, -4.0F);
        fish.addChild(let_fin);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, -1.0F);
        let_fin.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -0.1309F, 0.1309F);
        cube_r4.texOffs(31, 41).addBox(0.0F, 0.0F, -1.0F, 9.0F, 1.0F, 6.0F, 0.0F, false);
    }
    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.fish.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.let_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
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