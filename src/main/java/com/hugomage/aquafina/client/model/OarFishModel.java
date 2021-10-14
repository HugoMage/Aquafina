package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.OarfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class OarFishModel<T extends OarfishEntity> extends EntityModel<T>  {
    private final ModelRenderer fishe;
    private final ModelRenderer body_root;
    private final ModelRenderer body;
    private final ModelRenderer top_fins;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body_fin;
    private final ModelRenderer left_oar;
    private final ModelRenderer cube_r3;
    private final ModelRenderer right_oar;
    private final ModelRenderer cube_r4;
    private final ModelRenderer right_fin;
    private final ModelRenderer cube_r5;
    private final ModelRenderer left_fin;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail;

    public OarFishModel() {
        texWidth = 128;
        texHeight = 128;

        fishe = new ModelRenderer(this);
        fishe.setPos(0.0F, 21.0F, 7.0F);


        body_root = new ModelRenderer(this);
        body_root.setPos(0.0F, 1.0F, 8.0F);
        fishe.addChild(body_root);


        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);
        body_root.addChild(body);
        body.texOffs(0, 0).addBox(-2.0F, -3.0F, -37.0F, 4.0F, 5.0F, 37.0F, 0.0F, false);
        body.texOffs(0, 0).addBox(-2.0F, -1.0F, -38.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

        top_fins = new ModelRenderer(this);
        top_fins.setPos(0.0F, -3.0F, -34.0F);
        body_root.addChild(top_fins);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 1.0F);
        top_fins.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.3488F, -0.0149F, 0.041F);
        cube_r1.texOffs(31, 43).addBox(0.0F, -11.0F, -1.0F, 0.0F, 11.0F, 8.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 1.0F);
        top_fins.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.0436F);
        cube_r2.texOffs(46, 0).addBox(0.0F, -11.0F, -1.0F, 0.0F, 11.0F, 8.0F, 0.0F, false);

        body_fin = new ModelRenderer(this);
        body_fin.setPos(0.0F, -3.0F, -15.0F);
        body_root.addChild(body_fin);
        body_fin.texOffs(0, 43).addBox(0.0F, -2.0F, -15.0F, 0.0F, 2.0F, 30.0F, 0.0F, false);

        left_oar = new ModelRenderer(this);
        left_oar.setPos(0.0F, 2.0F, -32.0F);
        body_root.addChild(left_oar);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 1.0F);
        left_oar.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.132F, 0.1298F, -0.0172F);
        cube_r3.texOffs(0, 0).addBox(-0.0086F, 0.0F, -0.8695F, 0.0F, 4.0F, 14.0F, 0.0F, false);

        right_oar = new ModelRenderer(this);
        right_oar.setPos(0.0F, 2.0F, -32.0F);
        body_root.addChild(right_oar);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 1.0F);
        right_oar.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.1314F, -0.0865F, 0.0114F);
        cube_r4.texOffs(0, 43).addBox(-0.0038F, 0.0F, -1.0872F, 0.0F, 4.0F, 14.0F, 0.0F, false);

        right_fin = new ModelRenderer(this);
        right_fin.setPos(-2.0F, 0.0F, -32.0F);
        body_root.addChild(right_fin);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, 0.0F);
        right_fin.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, -0.2182F, 0.0F);
        cube_r5.texOffs(0, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        left_fin = new ModelRenderer(this);
        left_fin.setPos(2.0F, 0.0F, -32.0F);
        body_root.addChild(left_fin);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.0F, 0.0F);
        left_fin.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.2182F, 0.0F);
        cube_r6.texOffs(5, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 1.0F, 8.0F);
        fishe.addChild(tail);
        tail.texOffs(31, 43).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 24.0F, 0.0F, false);
        tail.texOffs(46, 0).addBox(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 25.0F, 0.0F, false);
    }



    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 0.8f;
        float speed = 1.0f;
        this.body_root.yRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tail.yRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.left_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * -1.8F * f1;
        this.right_fin.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 1.8F * f1;
    }





    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.fishe).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}