package com.hugomage.aquafina.entity;

import com.hugomage.aquafina.registry.RegistryHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class SeaUrchinEntity extends AbstractGroupFishEntity {
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return
                MobEntity.createMobAttributes()
                        .add(Attributes.MAX_HEALTH, 2)
                        .add(Attributes.KNOCKBACK_RESISTANCE, 7D)
                        .add(Attributes.MOVEMENT_SPEED, 0.0)
                        .add(Attributes.ARMOR, 12D);
    }

    public SeaUrchinEntity(EntityType<? extends SeaUrchinEntity> type, World worldIn) {
        super(type, worldIn);
        this.moveControl = new MoveHelperController(this);
        this.setPathfindingMalus(PathNodeType.WATER, 1.0F);
        this.maxUpStep = 0.0f;
    }
    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return new ItemStack(RegistryHandler.SEAURCHIN_SPAWN_EGG.get());
    }
    protected PathNavigator createNavigation(World world) {
        return new GroundPathNavigator(this, world);
    }

    public void push (Entity entityIn) {
    }
    public void playerTouch(PlayerEntity p_70100_1_) {
            p_70100_1_.addEffect(new EffectInstance(Effects.POISON, 60, 0));
    }
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.pushthrough = 1F;
    }
    public float getPickRadius() {
        return 0.0F;
    }

    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));

    }

    public void aiStep() {
        if (!this.isInWater() && this.onGround && this.verticalCollision) {
            this.onGround = false;
            this.hasImpulse = false;
        }

        super.aiStep();
    }

    static class MoveHelperController extends MovementController {
        public final SeaUrchinEntity ray;

        MoveHelperController(SeaUrchinEntity ray) {
            super(ray);
            this.ray = ray;
        }
    }
        @Override
        protected ItemStack getBucketItemStack() {
            return null;
        }
    protected ActionResultType mobInteract(PlayerEntity p_230254_1_, Hand p_230254_2_) {
        ItemStack itemstack = p_230254_1_.getItemInHand(p_230254_2_);
        if (itemstack.getItem() == Items.WATER_BUCKET && this.isAlive()) {
            return ActionResultType.sidedSuccess(this.level.isClientSide);
        } else {
            return super.mobInteract(p_230254_1_, p_230254_2_);
        }
    }
    static class SwimGoal extends RandomSwimmingGoal {
        private final SeaUrchinEntity fish;

        public SwimGoal(SeaUrchinEntity fish) {
            super(fish, 1.0D, 40);
            this.fish = fish;
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
