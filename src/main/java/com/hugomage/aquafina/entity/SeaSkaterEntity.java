package com.hugomage.aquafina.entity;

import com.hugomage.aquafina.registry.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.*;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class SeaSkaterEntity extends WaterMobEntity {
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 10).add(Attributes.ATTACK_DAMAGE, 7D).add(Attributes.MOVEMENT_SPEED, 0.3);
    }
    protected PathNavigator createNavigation(World p_175447_1_) {
        return new SeaSkaterEntity.WaterPathNavigator(this, p_175447_1_);
    }
    static class WaterPathNavigator extends SwimmerPathNavigator {
        WaterPathNavigator(SeaSkaterEntity p_i231565_1_, World p_i231565_2_) {
            super(p_i231565_1_, p_i231565_2_);
        }

        protected PathFinder createPathFinder(int p_179679_1_) {
            this.nodeEvaluator = new WalkNodeProcessor();
            return new PathFinder(this.nodeEvaluator, p_179679_1_);
        }

        public boolean isStableDestination(BlockPos p_188555_1_) {
            return this.level.getBlockState(p_188555_1_).is(Blocks.WATER) || super.isStableDestination(p_188555_1_);
        }
    }
    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return new ItemStack(RegistryHandler.SEA_SPAWN_EGG.get());
    }
    public SeaSkaterEntity(EntityType<? extends SeaSkaterEntity> type, World worldIn) {
        super(type, worldIn);
        this.maxUpStep = 0.0f;
        this.setPathfindingMalus(PathNodeType.WATER, -0.0F);
        this.setPathfindingMalus(PathNodeType.LAVA, 0.0F);
        this.setPathfindingMalus(PathNodeType.DANGER_FIRE, 0.0F);
        this.setPathfindingMalus(PathNodeType.DAMAGE_FIRE, 0.0F);
    }
    public boolean isOnFire() {
        return false;
    }
    public float getWalkTargetValue(BlockPos p_205022_1_, IWorldReader p_205022_2_) {
        if (p_205022_2_.getBlockState(p_205022_1_).getFluidState().is(FluidTags.WATER)) {
            return 10.0F;
        } else {
            return this.isInWater() ? Float.NEGATIVE_INFINITY : 1.0F;
        }
    }
    public void tick() {


       super.tick();
        this.floatStrider();
    }

    private void floatStrider() {
        if (this.isInWater()) {
            ISelectionContext iselectioncontext = ISelectionContext.of(this);
            if (iselectioncontext.isAbove(FlowingFluidBlock.STABLE_SHAPE, this.blockPosition(), true) && !this.level.getFluidState(this.blockPosition().above()).is(FluidTags.WATER)) {
                this.onGround = true;
            } else {
                this.setDeltaMovement(this.getDeltaMovement().scale(0.5D).add(0.0D, 0.05D, 0.0D));
            }
        }

    }
    @Override
    protected void registerGoals() {

        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.0D, 60));

    }
    public boolean canStandOnFluid(Fluid p_230285_1_) {
        return p_230285_1_.is(FluidTags.WATER);
    }


    protected ItemStack getBucketItemStack() {
            return null;
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
