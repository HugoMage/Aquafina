package com.hugomage.aquafina.entity;

import com.hugomage.aquafina.util.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class SeaCucumberEntity extends AbstractGroupFishEntity {
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 30).add(Attributes.ATTACK_DAMAGE, 7D).add(Attributes.MOVEMENT_SPEED, 1.0);
    }
    private static final DataParameter<Integer> DATA_VARIANT_ID = EntityDataManager.defineId(CoconutCrabEntity.class, DataSerializers.INT);

    public SeaCucumberEntity(EntityType<? extends SeaCucumberEntity> type, World worldIn) {
        super(type, worldIn);
        this.moveControl = new MoveHelperController(this);
        this.setPathfindingMalus(PathNodeType.WATER, 1.0F);
        this.maxUpStep = 0.0f;
    }
    public void addAdditionalSaveData(CompoundNBT compound) {
        super.addAdditionalSaveData(compound);
        compound.putInt("variant", this.getVariant());

    }
    public int getVariant() {
        return this.entityData.get(DATA_VARIANT_ID);
    }
    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return new ItemStack(RegistryHandler.SEACUCUMBER_SPAWN_EGG.get());
    }
    private void setVariant(int variant) {
        this.entityData.set(DATA_VARIANT_ID, variant);
    }
    @Nullable
    public ILivingEntityData finalizeSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
        if(this.random.nextInt(2) == 0){
            this.setVariant(1);
        }else if(random.nextInt(2) == 0){
            this.setVariant(2);
        }else if(random.nextInt(2) == 0){
            this.setVariant(3);
        }
        return super.finalizeSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
    }
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_VARIANT_ID, 0);
    }

    public void readAdditionalSaveData(CompoundNBT compound) {
        super.readAdditionalSaveData(compound);
        this.setVariant(compound.getInt("variant"));

    }
    protected PathNavigator createNavigation(World world) {
        return new GroundPathNavigator(this, world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));


    }

    public void aiStep() {
        if (!this.isInWater() && this.onGround && this.verticalCollision) {
            this.onGround = false;
            this.hasImpulse = false;
        }

        super.aiStep();
    }

    static class MoveHelperController extends MovementController {
        public final SeaCucumberEntity ray;

        MoveHelperController(SeaCucumberEntity ray) {
            super(ray);
            this.ray = ray;
        }
        public void tick() {
            if (this.ray.isEyeInFluid(FluidTags.WATER)) {
                this.ray.setDeltaMovement(this.ray.getDeltaMovement().add(0.0D, 0.0D, 0.0D));
            }

            if (this.operation == Action.MOVE_TO && !this.ray.getNavigation().isDone()) {
                double d0 = this.wantedX - this.ray.getX();
                double d1 = this.wantedY - this.ray.getY();
                double d2 = this.wantedZ - this.ray.getZ();
                double d3 = (double) MathHelper.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                d1 = d1 / d3;
                float f = (float)(MathHelper.atan2(d2, d0) * (double)(180F / (float)Math.PI)) - 90.0F;
                this.ray.yRot = this.rotlerp(this.ray.yRot, f, 90.0F);
                this.ray.yBodyRot = this.ray.yRot;
                float f1 = (float)(this.speedModifier * this.ray.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                this.ray.setSpeed(MathHelper.lerp(0.125F, this.ray.getSpeed(), f1));
                this.ray.setDeltaMovement(this.ray.getDeltaMovement().add(0.0D, (double)this.ray.getSpeed() * d1 * 0.1D, 0.0D));
            } else {
                this.ray.setSpeed(0.0F);
            }
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
        private final SeaCucumberEntity fish;

        public SwimGoal(SeaCucumberEntity fish) {
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
