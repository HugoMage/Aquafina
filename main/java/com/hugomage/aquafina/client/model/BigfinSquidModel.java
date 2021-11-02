package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.BigFinSquidEntity;
import com.hugomage.aquafina.entity.LionManJellyfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class BigfinSquidModel<T extends BigFinSquidEntity> extends EntityModel<T>  {
    private final ModelRenderer squid;
    private final ModelRenderer body;
    private final ModelRenderer fin;
    private final ModelRenderer cube_r1;
    private final ModelRenderer tentacles;
	public BigfinSquidModel() {
        texWidth = 128;
        texHeight = 128;

        squid = new ModelRenderer(this);
        squid.setPos(0.0F, 24.0F, 1.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        squid.addChild(body);
        body.texOffs(33, 8).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

        fin = new ModelRenderer(this);
        fin.setPos(0.0F, -5.0F, 0.0F);
        body.addChild(fin);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        fin.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        cube_r1.texOffs(25, 0).addBox(-5.0F, -6.0F, 0.0F, 10.0F, 7.0F, 0.0F, 0.0F, false);

        tentacles = new ModelRenderer(this);
        tentacles.setPos(0.0F, 0.0F, 0.0F);
        squid.addChild(tentacles);
        tentacles.texOffs(33, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        tentacles.texOffs(0, 0).addBox(-4.0F, 2.0F, -4.0F, 8.0F, 113.0F, 8.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.squid).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}