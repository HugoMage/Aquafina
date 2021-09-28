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
    private final ModelRenderer octo;
    private final ModelRenderer head_root;
    private final ModelRenderer head;
    private final ModelRenderer left_ear;
    private final ModelRenderer cube_r1;
    private final ModelRenderer right_ear;
    private final ModelRenderer cube_r2;
    private final ModelRenderer tentacle_4;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tentacle_3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tentacle_2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tentacle_1;
    private final ModelRenderer cube_r6;
	public DumboOctopusModel() {
        texWidth = 32;
        texHeight = 32;

        octo = new ModelRenderer(this);
        octo.setPos(0.0F, 23.0F, -1.0F);


        head_root = new ModelRenderer(this);
        head_root.setPos(0.0F, 0.0F, 0.0F);
        octo.addChild(head_root);


        head = new ModelRenderer(this);
        head.setPos(0.0F, -1.0F, 0.0F);
        head_root.addChild(head);
        head.texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

        left_ear = new ModelRenderer(this);
        left_ear.setPos(2.0F, -2.0F, 0.0F);
        head_root.addChild(left_ear);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        left_ear.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.9163F);
        cube_r1.texOffs(5, 9).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

        right_ear = new ModelRenderer(this);
        right_ear.setPos(-2.0F, -2.0F, 0.0F);
        head_root.addChild(right_ear);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        right_ear.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.9163F);
        cube_r2.texOffs(5, 11).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

        tentacle_4 = new ModelRenderer(this);
        tentacle_4.setPos(2.0F, 1.0F, 0.0F);
        octo.addChild(tentacle_4);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        tentacle_4.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0873F);
        cube_r3.texOffs(0, 9).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);

        tentacle_3 = new ModelRenderer(this);
        tentacle_3.setPos(-2.0F, 1.0F, 0.0F);
        octo.addChild(tentacle_3);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        tentacle_3.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.0873F);
        cube_r4.texOffs(9, 9).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);

        tentacle_2 = new ModelRenderer(this);
        tentacle_2.setPos(0.0F, 1.0F, 2.0F);
        octo.addChild(tentacle_2);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, 0.0F);
        tentacle_2.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        cube_r5.texOffs(13, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);

        tentacle_1 = new ModelRenderer(this);
        tentacle_1.setPos(0.0F, 1.0F, -2.0F);
        octo.addChild(tentacle_1);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.0F, 0.0F);
        tentacle_1.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        cube_r6.texOffs(14, 9).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);
    }


    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        float degree = 1.0f;
        float speed = 3.0f;
        this.octo.zRot = MathHelper.cos(f * speed * 0.4F) * degree * 0.5F * f1;
        this.tentacle_1.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.tentacle_2.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.tentacle_3.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;
        this.tentacle_4.xRot = MathHelper.cos(f * speed * 0.4F) * degree * -0.5F * f1;


    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.octo).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}