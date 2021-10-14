package com.hugomage.aquafina.entity;

import com.hugomage.aquafina.util.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.DolphinLookController;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.passive.fish.TropicalFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class LemonSharkEntity extends AbstractGroupFishEntity {
    private float tx;
    private float ty;
    private float tz;
    public float xBodyRot;
    public float xBodyRotO;
    public float zBodyRot;
    public float zBodyRotO;
    public float tentacleMovement;
    public float oldTentacleMovement;
    public float tentacleAngle;
    public float oldTentacleAngle;
    private float speed;
    private float tentacleSpeed;
    private float rotateSpeed;
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 20).add(Attributes.ATTACK_DAMAGE, 3D).add(Attributes.MOVEMENT_SPEED, 1.0);
    }
    protected ActionResultType mobInteract(PlayerEntity p_230254_1_, Hand p_230254_2_) {
        ItemStack itemstack = p_230254_1_.getItemInHand(p_230254_2_);
        if (itemstack.getItem() == Items.WATER_BUCKET && this.isAlive()) {
            return ActionResultType.sidedSuccess(this.level.isClientSide);
        } else {
            return super.mobInteract(p_230254_1_, p_230254_2_);
        }
    }
    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return new ItemStack(RegistryHandler.LEMON_SHARK_SPAWN_EGG.get());
    }
    public LemonSharkEntity(EntityType<? extends LemonSharkEntity> type, World world) {
        super(type, world);
        this.moveControl = new LemonSharkEntity.MoveHelperController(this);
        this.lookControl = new DolphinLookController(this, 10);
    }
    public boolean canBeLeashed(PlayerEntity p_184652_1_) {
        return true;
    }
    static class MoveHelperController extends MovementController {
        private final LemonSharkEntity dolphin;

        public MoveHelperController(LemonSharkEntity p_i48945_1_) {
            super(p_i48945_1_);
            this.dolphin = p_i48945_1_;
        }

        public void tick() {
            if (this.dolphin.isInWater()) {
                this.dolphin.setDeltaMovement(this.dolphin.getDeltaMovement().add(0.0D, 0.005D, 0.0D));
            }

            if (this.operation == MovementController.Action.MOVE_TO && !this.dolphin.getNavigation().isDone()) {
                double d0 = this.wantedX - this.dolphin.getX();
                double d1 = this.wantedY - this.dolphin.getY();
                double d2 = this.wantedZ - this.dolphin.getZ();
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                if (d3 < (double)2.5000003E-7F) {
                    this.mob.setZza(0.0F);
                } else {
                    float f = (float)(MathHelper.atan2(d2, d0) * (double)(180F / (float)Math.PI)) - 90.0F;
                    this.dolphin.yRot = this.rotlerp(this.dolphin.yRot, f, 10.0F);
                    this.dolphin.yBodyRot = this.dolphin.yRot;
                    this.dolphin.yHeadRot = this.dolphin.yRot;
                    float f1 = (float)(this.speedModifier * this.dolphin.getAttributeValue(Attributes.MOVEMENT_SPEED));
                    if (this.dolphin.isInWater()) {
                        this.dolphin.setSpeed(f1 * 0.02F);
                        float f2 = -((float)(MathHelper.atan2(d1, (double)MathHelper.sqrt(d0 * d0 + d2 * d2)) * (double)(180F / (float)Math.PI)));
                        f2 = MathHelper.clamp(MathHelper.wrapDegrees(f2), -85.0F, 85.0F);
                        this.dolphin.xRot = this.rotlerp(this.dolphin.xRot, f2, 5.0F);
                        float f3 = MathHelper.cos(this.dolphin.xRot * ((float)Math.PI / 180F));
                        float f4 = MathHelper.sin(this.dolphin.xRot * ((float)Math.PI / 180F));
                        this.dolphin.zza = f3 * f1;
                        this.dolphin.yya = -f4 * f1;
                    } else {
                        this.dolphin.setSpeed(f1 * 0.1F);
                    }

                }
            } else {
                this.dolphin.setSpeed(0.0F);
                this.dolphin.setXxa(0.0F);
                this.dolphin.setYya(0.0F);
                this.dolphin.setZza(0.0F);
            }
        }
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new LemonSharkEntity.SwimGoal(this));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.0D, true));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, TropicalFishEntity.class, true));



    }

    @Override
    protected ItemStack getBucketItemStack() {
        return null;
    }

    public void setMovementVector(float p_175568_1_, float p_175568_2_, float p_175568_3_) {
        this.tx = p_175568_1_;
        this.ty = p_175568_2_;
        this.tz = p_175568_3_;
    }

    public boolean hasMovementVector() {
        return this.tx != 0.0F || this.ty != 0.0F || this.tz != 0.0F;
    }
    static class SwimGoal extends RandomSwimmingGoal {
        private final LemonSharkEntity fish;

        public SwimGoal(LemonSharkEntity fish) {
            super(fish, 1.4D, 40);
            this.fish = fish;
        }
        public void tick() {
            int i = this.fish.getNoActionTime();
            if (i > 100) {
                this.fish.setMovementVector(0.0F, 0.0F, 0.0F);
            } else if (this.fish.getRandom().nextInt(50) == 0 || !this.fish.hasMovementVector()) {
                float f = this.fish.getRandom().nextFloat() * ((float)Math.PI * 2F);
                float f1 = MathHelper.cos(f) * 0.2F;
                float f2 = -0.1F + this.fish.getRandom().nextFloat() * 0.2F;
                float f3 = MathHelper.sin(f) * 0.2F;
                this.fish.setMovementVector(f1, f2, f3);
            }

        }
        public boolean canUse() {
            return super.canUse();
        }
    }



    protected SoundEvent getAmbientSound() {
        return SoundEvents.COD_AMBIENT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.COD_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.COD_HURT;
    }

    protected SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }


}
