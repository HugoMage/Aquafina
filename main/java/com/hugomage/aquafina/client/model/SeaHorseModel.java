package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.SeaHorseEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SeaHorseModel<T extends SeaHorseEntity> extends EntityModel<T>  {
    private final ModelRenderer hor;
    private final ModelRenderer tail;
    private final ModelRenderer body;
    private final ModelRenderer back_fin;
    private final ModelRenderer head;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
	public SeaHorseModel() {
        texWidth = 32;
        texHeight = 32;

        hor = new ModelRenderer(this);
        hor.setPos(0.0F, 21.0F, 0.0F);


        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 3.0F, 0.0F);
        hor.addChild(tail);
        tail.texOffs(0, 0).addBox(0.0F, -0.2611F, -4.0171F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, 0.0F);
        hor.addChild(body);
        body.texOffs(9, 9).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

        back_fin = new ModelRenderer(this);
        back_fin.setPos(0.0F, 0.0F, 2.0F);
        body.addChild(back_fin);
        back_fin.texOffs(0, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, -1.0F, 1.0F);
        hor.addChild(head);
        head.texOffs(13, 0).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -2.0F, -2.0F);
        head.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        cube_r1.texOffs(0, 13).addBox(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, -3.0F, 1.0F);
        head.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        cube_r2.texOffs(7, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.hor.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.hor).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}