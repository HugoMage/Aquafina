package com.hugomage.aquafina.entity;

import com.hugomage.aquafina.registry.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class SpongeBobEntity extends AbstractGroupFishEntity {
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 10000000).add(Attributes.ATTACK_DAMAGE, 7D).add(Attributes.MOVEMENT_SPEED, 1.0);
    }

    public SpongeBobEntity(EntityType<? extends SpongeBobEntity> type, World worldIn) {
        super(type, worldIn);
        this.moveControl = new MoveHelperController(this);
    }


    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(5, new RandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));

    }

    public void aiStep() {
        if (!this.isInWater() && this.onGround && this.verticalCollision) {
            this.onGround = false;
            this.hasImpulse = false;
        }

        super.aiStep();
    }


    @Override
    protected ItemStack getBucketItemStack()  {
        return new ItemStack(RegistryHandler.SPONGEBOB_BUCKET.get());
    }

    protected PathNavigator createNavigation(World world) {
        return new GroundPathNavigator(this, world);
    }
    static class MoveHelperController extends MovementController {
        public final SpongeBobEntity sponge;

        MoveHelperController(SpongeBobEntity sponge) {
            super(sponge);
            this.sponge = sponge;
        }
        public void tick() {
            if (this.sponge.isEyeInFluid(FluidTags.WATER)) {
                this.sponge.setDeltaMovement(this.sponge.getDeltaMovement().add(0.0D, 0.0D, 0.0D));
            }

            if (this.operation == Action.MOVE_TO && !this.sponge.getNavigation().isDone()) {
                double d0 = this.wantedX - this.sponge.getX();
                double d1 = this.wantedY - this.sponge.getY();
                double d2 = this.wantedZ - this.sponge.getZ();
                double d3 = (double) MathHelper.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                d1 = d1 / d3;
                float f = (float)(MathHelper.atan2(d2, d0) * (double)(180F / (float)Math.PI)) - 90.0F;
                this.sponge.yRot = this.rotlerp(this.sponge.yRot, f, 90.0F);
                this.sponge.yBodyRot = this.sponge.yRot;
                float f1 = (float)(this.speedModifier * this.sponge.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                this.sponge.setSpeed(MathHelper.lerp(0.125F, this.sponge.getSpeed(), f1));
                this.sponge.setDeltaMovement(this.sponge.getDeltaMovement().add(0.0D, (double)this.sponge.getSpeed() * d1 * 0.1D, 0.0D));
            } else {
                this.sponge.setSpeed(0.0F);
            }
        }
    }
    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return new ItemStack(RegistryHandler.YETI_CRAB_SPAWN_EGG.get());
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
