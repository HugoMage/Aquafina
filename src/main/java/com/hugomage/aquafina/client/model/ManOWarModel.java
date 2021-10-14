package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.LionManJellyfishEntity;
import com.hugomage.aquafina.entity.ManOWarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ManOWarModel<T extends ManOWarEntity> extends EntityModel<T>  {
    private final ModelRenderer war;
    private final ModelRenderer tentacle_4;
    private final ModelRenderer tentacle_3;
    private final ModelRenderer tentacle_2;
    private final ModelRenderer tentacle_1;
    private final ModelRenderer body;
	public ManOWarModel() {
        texWidth = 32;
        texHeight = 32;

        war = new ModelRenderer(this);
        war.setPos(0.0F, 23.0F, 0.0F);


        tentacle_4 = new ModelRenderer(this);
        tentacle_4.setPos(0.0F, 1.0F, 0.0F);
        war.addChild(tentacle_4);
        tentacle_4.texOffs(21, 0).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 9.0F, 0.0F, 0.0F, false);

        tentacle_3 = new ModelRenderer(this);
        tentacle_3.setPos(0.0F, 1.0F, 2.0F);
        war.addChild(tentacle_3);
        tentacle_3.texOffs(0, 16).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 9.0F, 0.0F, 0.0F, false);

        tentacle_2 = new ModelRenderer(this);
        tentacle_2.setPos(2.0F, 1.0F, 0.0F);
        war.addChild(tentacle_2);
        tentacle_2.texOffs(11, 21).addBox(0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 2.0F, 0.0F, false);

        tentacle_1 = new ModelRenderer(this);
        tentacle_1.setPos(-3.0F, 1.0F, 0.0F);
        war.addChild(tentacle_1);
        tentacle_1.texOffs(16, 21).addBox(0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 2.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, 0.0F);
        war.addChild(body);
        body.texOffs(0, 0).addBox(-4.0F, -7.0F, 1.0F, 10.0F, 5.0F, 0.0F, 0.0F, false);
        body.texOffs(0, 6).addBox(-3.0F, -5.0F, -1.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
        body.texOffs(13, 12).addBox(1.0F, -4.0F, -1.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 0.1f;
        this.tentacle_1.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.tentacle_2.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.tentacle_3.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.tentacle_4.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;


    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.war).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}