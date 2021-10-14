package com.hugomage.aquafina.client.model;


import com.google.common.collect.ImmutableList;
import com.hugomage.aquafina.entity.DumboOctopusEntity;
import com.hugomage.aquafina.entity.LionManJellyfishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class LionManeJellyfishModel<T extends LionManJellyfishEntity> extends EntityModel<T>  {
    private final ModelRenderer lly;
    private final ModelRenderer head;
    private final ModelRenderer thing;
    private final ModelRenderer tentacle_4;
    private final ModelRenderer cube_r1;
    private final ModelRenderer tentacle_3;
    private final ModelRenderer cube_r2;
    private final ModelRenderer tentacle_2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tentacle_1;
    private final ModelRenderer cube_r4;
	public LionManeJellyfishModel() {
        texWidth = 256;
        texHeight = 256;

        lly = new ModelRenderer(this);
        lly.setPos(0.0F, -12.0F, 0.0F);


        head = new ModelRenderer(this);
        head.setPos(0.0F, 2.0F, 0.0F);
        lly.addChild(head);
        head.texOffs(98, 86).addBox(-9.0F, -12.0F, -9.0F, 18.0F, 15.0F, 18.0F, 0.0F, false);

        thing = new ModelRenderer(this);
        thing.setPos(0.0F, 3.0F, 0.0F);
        head.addChild(thing);
        thing.texOffs(0, 0).addBox(0.0F, 0.0F, -5.0F, 0.0F, 18.0F, 10.0F, 0.0F, false);
        thing.texOffs(33, 0).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 18.0F, 0.0F, 0.0F, false);

        tentacle_4 = new ModelRenderer(this);
        tentacle_4.setPos(0.0F, 5.0F, -8.0F);
        lly.addChild(tentacle_4);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        tentacle_4.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        cube_r1.texOffs(98, 43).addBox(-16.0F, 0.0F, 0.0F, 32.0F, 42.0F, 0.0F, 0.0F, false);

        tentacle_3 = new ModelRenderer(this);
        tentacle_3.setPos(-8.0F, 5.0F, 0.0F);
        lly.addChild(tentacle_3);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        tentacle_3.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0873F);
        cube_r2.texOffs(0, 0).addBox(0.0F, 0.0F, -16.0F, 0.0F, 42.0F, 32.0F, 0.0F, false);

        tentacle_2 = new ModelRenderer(this);
        tentacle_2.setPos(8.0F, 5.0F, 0.0F);
        lly.addChild(tentacle_2);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        tentacle_2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -0.0873F);
        cube_r3.texOffs(33, 43).addBox(0.0F, 0.0F, -16.0F, 0.0F, 42.0F, 32.0F, 0.0F, false);

        tentacle_1 = new ModelRenderer(this);
        tentacle_1.setPos(0.0F, 5.0F, 8.0F);
        lly.addChild(tentacle_1);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, 0.0F, 0.0F);
        tentacle_1.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        cube_r4.texOffs(65, 0).addBox(-16.0F, 0.0F, 0.0F, 32.0F, 42.0F, 0.0F, 0.0F, false);
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
        ImmutableList.of(this.lly).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}