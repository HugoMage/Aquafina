package com.hugomage.aquafina.entity;

import com.hugomage.aquafina.registry.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.pathfinding.SwimmerPathNavigator;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class ArapaimaEntity extends AnimalEntity {
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 30).add(Attributes.ATTACK_DAMAGE, 7D).add(Attributes.MOVEMENT_SPEED, 0.2);
    }
    private static final Ingredient TEMPT_INGREDIENT = Ingredient.of(Items.COD, Items.SALMON);
    public ArapaimaEntity(EntityType<? extends ArapaimaEntity> type, World world) {
        super(type, world);
        this.moveControl = new ArapaimaEntity.MoveHelperController(this);
        this.setPathfindingMalus(PathNodeType.WATER, 0.0F);
    }
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1.0D, 100));
        this.goalSelector.addGoal(0, new BreatheAirGoal(this));
        this.goalSelector.addGoal(0, new FindWaterGoal(this));
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
    }
    public boolean isFood(ItemStack p_70877_1_) {
        return TEMPT_INGREDIENT.test(p_70877_1_);
    }

    protected PathNavigator createNavigation(World p_175447_1_) {
        return new SwimmerPathNavigator(this, p_175447_1_);
    }
    public void baseTick() {
        int lvt_1_1_ = this.getAirSupply();
        super.baseTick();
        this.updateAir(lvt_1_1_);
    }
    static class MoveHelperController extends MovementController {
        private final ArapaimaEntity fish;

        MoveHelperController(ArapaimaEntity p_i48857_1_) {
            super(p_i48857_1_);
            this.fish = p_i48857_1_;
        }

        public void tick() {
            if (this.fish.isEyeInFluid(FluidTags.WATER)) {
                this.fish.setDeltaMovement(this.fish.getDeltaMovement().add(0.0D, 0.005D, 0.0D));
            }
            if (this.operation == Action.MOVE_TO && !this.fish.getNavigation().isDone()) {
                double lvt_1_1_ = this.wantedX - this.fish.getX();
                double lvt_3_1_ = this.wantedY - this.fish.getY();
                double lvt_5_1_ = this.wantedZ - this.fish.getZ();
                double lvt_7_1_ = (double) MathHelper.sqrt(lvt_1_1_ * lvt_1_1_ + lvt_3_1_ * lvt_3_1_ + lvt_5_1_ * lvt_5_1_);
                lvt_3_1_ /= lvt_7_1_;
                float lvt_9_1_ = (float)(MathHelper.atan2(lvt_5_1_, lvt_1_1_) * 57.2957763671875D) - 90.0F;
                this.fish.yRot = this.rotlerp(this.fish.yRot, lvt_9_1_, 90.0F);
                this.fish.yBodyRot = this.fish.yRot;
                float lvt_10_1_ = (float)(this.speedModifier * this.fish.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                this.fish.setSpeed(MathHelper.lerp(0.125F, this.fish.getSpeed(), lvt_10_1_));
                this.fish.setDeltaMovement(this.fish.getDeltaMovement().add(0.0D, (double)this.fish.getSpeed() * lvt_3_1_ * 0.1D, 0.0D));
            } else {
                this.fish.setSpeed(0.0F);
            }
        }
    }

    public boolean isPushedByFluid() {
        return false;
    }
    public CreatureAttribute getMobType() {
        return CreatureAttribute.WATER;
    }
    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return new ItemStack(RegistryHandler.ARAPAIMA_SPAWN_EGG.get());
    }
    public static boolean checkArapaimaSpawns(EntityType<ArapaimaEntity> p_223364_0_, IWorld p_223364_1_, SpawnReason p_223364_2_, BlockPos p_223364_3_, Random p_223364_4_) {
        if (p_223364_3_.getY() > 45 && p_223364_3_.getY() < p_223364_1_.getSeaLevel()) {
            Optional<RegistryKey<Biome>> optional = p_223364_1_.getBiomeName(p_223364_3_);
            return (!Objects.equals(optional, Optional.of(Biomes.JUNGLE)) || !Objects.equals(optional, Optional.of(Biomes.BAMBOO_JUNGLE))) && p_223364_1_.getFluidState(p_223364_3_).is(FluidTags.WATER);
        } else {
            return false;
        }
    }
    public static boolean checkFishSpawnRules(EntityType<? extends AbstractFishEntity> p_223363_0_, IWorld p_223363_1_, SpawnReason p_223363_2_, BlockPos p_223363_3_, Random p_223363_4_) {
        return p_223363_1_.getBlockState(p_223363_3_).is(Blocks.WATER) && p_223363_1_.getBlockState(p_223363_3_.above()).is(Blocks.WATER);
    }
    protected void updateAir(int air) {
        if (this.isAlive() && !this.isInWaterOrBubble()) {
            this.setAirSupply(air - 1);
            if (this.getAirSupply() == -20) {
                this.setAirSupply(0);
                this.hurt(DamageSource.DROWN, 2.0F);
            }
        } else {
            this.setAirSupply(300);
        }
    }
    public ActionResultType mobInteract(PlayerEntity p_230254_1_, Hand p_230254_2_) {
        ItemStack itemstack = p_230254_1_.getItemInHand(p_230254_2_);
        Item item = itemstack.getItem();
        if (!this.level.isClientSide) {
            this.playSound(SoundEvents.DOLPHIN_EAT, 1.0F, 1.0F);
        }
                if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                    if (!p_230254_1_.abilities.instabuild) {
                        itemstack.shrink(1);
                    }
                    double d0 = this.random.nextGaussian() * 0.02D;
                    double d1 = this.random.nextGaussian() * 0.02D;
                    double d2 = this.random.nextGaussian() * 0.02D;
                    this.heal((float)item.getFoodProperties().getNutrition());
                    this.level.addParticle(ParticleTypes.SPLASH, this.getRandomX(1.0D), this.getRandomY() + 0.5D, this.getRandomZ(1.0D), 0.0D, 0.0D, 0.0D);return ActionResultType.SUCCESS;
                }
        return super.mobInteract(p_230254_1_, p_230254_2_);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
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
