package com.hugomage.aquafina.entity;

import com.hugomage.aquafina.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.SwimmerPathNavigator;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class GoliathCatfishEntity extends WaterMobEntity {
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 35).add(Attributes.ATTACK_DAMAGE, 7D).add(Attributes.MOVEMENT_SPEED, 2);
    }

    public static boolean checkFishSpawnRules(EntityType<? extends WaterMobEntity> type, IWorld worldIn, SpawnReason reason, BlockPos p_223363_3_, Random randomIn) {
        return worldIn.getBlockState(p_223363_3_).is(Blocks.WATER) && worldIn.getBlockState(p_223363_3_.above()).is(Blocks.WATER) && worldIn.getLevelData().getDayTime() < 12000 && worldIn.getLevelData().getDayTime() > 24000 && randomIn.nextFloat() > 0.7F;
    }
    private static final Ingredient TEMPT_INGREDIENT = Ingredient.of(Items.COD, Items.SALMON);
    public GoliathCatfishEntity(EntityType<? extends GoliathCatfishEntity> type, World world) {
        super(type, world);
        this.moveControl = new GoliathCatfishEntity.MoveHelperController(this);

    }

    public static boolean checkGoliathCatfishSpawns(EntityType<GoliathCatfishEntity> p_223364_0_, IWorld p_223364_1_, SpawnReason p_223364_2_, BlockPos p_223364_3_, Random p_223364_4_) {
        if (p_223364_3_.getY() > 45 && p_223364_3_.getY() < p_223364_1_.getSeaLevel()) {
            Optional<RegistryKey<Biome>> optional = p_223364_1_.getBiomeName(p_223364_3_);
            return (!Objects.equals(optional, Optional.of(Biomes.SWAMP)) || !Objects.equals(optional, Optional.of(Biomes.SWAMP_HILLS))) && p_223364_1_.getFluidState(p_223364_3_).is(FluidTags.WATER);
        } else {
            return false;
        }
    }
    protected PathNavigator createNavigation(World worldIn) {
        return new SwimmerPathNavigator(this, worldIn);
    }
    static class MoveHelperController extends MovementController {
        private final GoliathCatfishEntity sturgeonEntity;

        public MoveHelperController(GoliathCatfishEntity sturgeonEntity) {
            super(sturgeonEntity);
            this.sturgeonEntity = sturgeonEntity;
        }}
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new GoliathCatfishEntity.SwimGoal(this));


    }
    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return new ItemStack(RegistryHandler.GOLIATH_CATFISH_SPAWN_EGG.get());
    }
    public boolean isFood(ItemStack p_70877_1_) {
        return TEMPT_INGREDIENT.test(p_70877_1_);
    }

    public ActionResultType mobInteract(PlayerEntity p_230254_1_, Hand p_230254_2_) {
        ItemStack itemstack = p_230254_1_.getItemInHand(p_230254_2_);
        Item item = itemstack.getItem();
                if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                    if (!p_230254_1_.abilities.instabuild) {
                        itemstack.shrink(1);
                    }

                    this.heal((float)item.getFoodProperties().getNutrition());
                    return ActionResultType.SUCCESS;
                }
        return super.mobInteract(p_230254_1_, p_230254_2_);
    }






    static class SwimGoal extends RandomSwimmingGoal {
        private final GoliathCatfishEntity fish;

        public SwimGoal(GoliathCatfishEntity fish) {
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
