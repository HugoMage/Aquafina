package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.FootballFishEntity;
import com.hugomage.aquafina.entity.SalmonSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class FootballFishModel<T extends FootballFishEntity> extends EntityModel<T>  {
    private final ModelRenderer body;
    private final ModelRenderer tailfin;
    private final ModelRenderer backfin;
    private final ModelRenderer backfin2;
    private final ModelRenderer lure;
    private final ModelRenderer jaw;
    private final ModelRenderer teeth;
    private final ModelRenderer rightfin;
    private final ModelRenderer leftfin;

	public FootballFishModel() {
        texWidth = 64;
        texHeight = 64;

        body = new ModelRenderer(this);
        body.setPos(0.0F, 24.0F, 0.0F);
        body.texOffs(0, 0).addBox(-5.5F, -12.0F, -7.0F, 11.0F, 12.0F, 14.0F, 0.0F, false);

        tailfin = new ModelRenderer(this);
        tailfin.setPos(0.0F, -5.25F, 7.0F);
        body.addChild(tailfin);
        tailfin.texOffs(0, 0).addBox(0.0F, -3.75F, 0.0F, 0.0F, 7.0F, 5.0F, 0.0F, false);

        backfin = new ModelRenderer(this);
        backfin.setPos(0.0F, -4.75F, 0.0F);
        tailfin.addChild(backfin);
        backfin.texOffs(4, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        backfin2 = new ModelRenderer(this);
        backfin2.setPos(0.0F, 4.25F, 0.0F);
        tailfin.addChild(backfin2);
        backfin2.texOffs(0, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        lure = new ModelRenderer(this);
        lure.setPos(0.0F, -12.0F, -1.0F);
        body.addChild(lure);
        lure.texOffs(0, 14).addBox(0.0F, -7.0F, -10.0F, 0.0F, 7.0F, 12.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setPos(0.0F, -4.0F, -6.0F);
        body.addChild(jaw);
        jaw.texOffs(24, 26).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 3.0F, 3.0F, 0.0F, false);

        teeth = new ModelRenderer(this);
        teeth.setPos(0.0F, 0.0F, -1.0F);
        jaw.addChild(teeth);
        teeth.texOffs(22, 32).addBox(-5.0F, -3.0F, -2.0F, 10.0F, 3.0F, 2.0F, 0.0F, false);

        rightfin = new ModelRenderer(this);
        rightfin.setPos(-5.5F, -5.5F, 2.0F);
        body.addChild(rightfin);
        setRotationAngle(rightfin, 0.0F, -0.3054F, 0.0F);
        rightfin.texOffs(6, 30).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

        leftfin = new ModelRenderer(this);
        leftfin.setPos(5.5F, -5.5F, 2.0F);
        body.addChild(leftfin);
        setRotationAngle(leftfin, 0.0F, 0.3054F, 0.0F);
        leftfin.texOffs(0, 30).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.body.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.3F * f1;
        this.body.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tailfin.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.backfin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.backfin2.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.body).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}