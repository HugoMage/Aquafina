package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.BaskingSharkEntity;
import com.hugomage.aquafina.entity.GoblinSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class BaskingSharkModel<T extends BaskingSharkEntity> extends EntityModel<T>  {
    private final ModelRenderer main;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r1;
    private final ModelRenderer middle;
    private final ModelRenderer tail;
    private final ModelRenderer backfin;
    private final ModelRenderer tailbottomfin;
    private final ModelRenderer tailfintop;
    private final ModelRenderer dorsalfin;
    private final ModelRenderer middlefin;
    private final ModelRenderer middlefin2;
    private final ModelRenderer fin;
    private final ModelRenderer fin2;
	public BaskingSharkModel() {
        texWidth = 256;
        texHeight = 256;

        main = new ModelRenderer(this);
        main.setPos(0.0F, 8.0F, 0.0F);
        main.texOffs(0, 0).addBox(-13.0F, -16.0F, -13.0F, 26.0F, 32.0F, 27.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, -12.0F);
        main.addChild(head);
        head.texOffs(82, 35).addBox(-10.0F, -14.0F, -25.0F, 21.0F, 10.0F, 24.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setPos(0.0F, 6.0F, -1.0F);
        head.addChild(jaw);
        jaw.texOffs(78, 101).addBox(-10.0F, -10.0F, -16.0F, 21.0F, 2.0F, 14.0F, 0.0F, false);
        jaw.texOffs(79, 0).addBox(-10.0F, 8.0F, -16.0F, 21.0F, 2.0F, 14.0F, 0.0F, false);
        jaw.texOffs(113, 117).addBox(-10.0F, -10.0F, -2.0F, 21.0F, 20.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -9.0F, -1.0F);
        jaw.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        cube_r1.texOffs(106, 16).addBox(1.0F, 8.0F, -15.0F, 16.0F, 2.0F, 14.0F, 0.0F, false);
        cube_r1.texOffs(0, 112).addBox(1.0F, -11.0F, -15.0F, 16.0F, 2.0F, 14.0F, 0.0F, false);

        middle = new ModelRenderer(this);
        middle.setPos(0.0F, -1.0F, 14.0F);
        main.addChild(middle);
        middle.texOffs(0, 59).addBox(-10.0F, -13.0F, 0.0F, 20.0F, 27.0F, 26.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 0.0F, 26.0F);
        middle.addChild(tail);
        tail.texOffs(92, 69).addBox(-5.0F, -6.0F, 0.0F, 10.0F, 13.0F, 19.0F, 0.0F, false);

        backfin = new ModelRenderer(this);
        backfin.setPos(0.0F, 0.0F, 17.0F);
        tail.addChild(backfin);
        backfin.texOffs(0, 128).addBox(-1.0F, -16.0F, 0.0F, 2.0F, 30.0F, 11.0F, 0.0F, false);

        tailbottomfin = new ModelRenderer(this);
        tailbottomfin.setPos(0.0F, 6.0F, 9.0F);
        tail.addChild(tailbottomfin);
        setRotationAngle(tailbottomfin, 0.1745F, 0.0F, 0.0F);
        tailbottomfin.texOffs(0, 59).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 7.0F, 9.0F, 0.0F, false);

        tailfintop = new ModelRenderer(this);
        tailfintop.setPos(0.0F, -5.0F, 9.0F);
        tail.addChild(tailfintop);
        setRotationAngle(tailfintop, -0.1745F, 0.0F, 0.0F);
        tailfintop.texOffs(0, 0).addBox(-1.0F, -7.0F, -4.0F, 1.0F, 7.0F, 9.0F, 0.0F, false);

        dorsalfin = new ModelRenderer(this);
        dorsalfin.setPos(0.0F, -11.0F, 9.0F);
        middle.addChild(dorsalfin);
        setRotationAngle(dorsalfin, -0.1745F, 0.0F, 0.0F);
        dorsalfin.texOffs(26, 136).addBox(-1.0F, -13.0F, -7.0F, 2.0F, 13.0F, 14.0F, 0.0F, false);

        middlefin = new ModelRenderer(this);
        middlefin.setPos(2.0F, 14.0F, 12.0F);
        middle.addChild(middlefin);
        setRotationAngle(middlefin, 0.0F, 0.0F, -0.2182F);
        middlefin.texOffs(92, 69).addBox(0.0F, 0.0F, -4.0F, 1.0F, 9.0F, 8.0F, 0.0F, false);

        middlefin2 = new ModelRenderer(this);
        middlefin2.setPos(-2.0F, 14.0F, 12.0F);
        middle.addChild(middlefin2);
        setRotationAngle(middlefin2, 0.0F, 0.0F, 0.2182F);
        middlefin2.texOffs(66, 61).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 9.0F, 8.0F, 0.0F, false);

        fin = new ModelRenderer(this);
        fin.setPos(11.0F, 15.0F, -1.0F);
        main.addChild(fin);
        setRotationAngle(fin, 0.0F, 0.0F, -0.2182F);
        fin.texOffs(79, 117).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 22.0F, 15.0F, 0.0F, false);

        fin2 = new ModelRenderer(this);
        fin2.setPos(-11.0F, 15.0F, -1.0F);
        main.addChild(fin2);
        setRotationAngle(fin2, 0.0F, 0.0F, 0.2182F);
        fin2.texOffs(45, 113).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 22.0F, 15.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 0.5f;
        this.main.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.middle.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;

    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.main).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}