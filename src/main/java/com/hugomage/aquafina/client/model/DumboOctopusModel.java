package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.AngelFishEntity;
import com.hugomage.aquafina.entity.DumboOctopusEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class DumboOctopusModel<T extends DumboOctopusEntity> extends EntityModel<T>  {
    private final ModelRenderer dumb;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer tentacles;
	public DumboOctopusModel() {
        texWidth = 16;
        texHeight = 16;

        dumb = new ModelRenderer(this);
        dumb.setPos(0.0F, 23.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        dumb.addChild(body);
        body.texOffs(0, 0).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-1.0F, -2.0F, -1.0F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4363F);
        cube_r1.texOffs(10, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(2.0F, -2.0F, -1.0F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
        cube_r2.texOffs(10, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

        tentacles = new ModelRenderer(this);
        tentacles.setPos(0.0F, 1.0F, -1.0F);
        body.addChild(tentacles);
        tentacles.texOffs(0, 8).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.dumb.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;



    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.dumb).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}