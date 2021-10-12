package com.hugomage.aquafina.entity;

import com.hugomage.aquafina.util.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class RoughSharkEntity extends AbstractGroupFishEntity {
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 14).add(Attributes.ATTACK_DAMAGE, 2D).add(Attributes.MOVEMENT_SPEED, 1.0);
    }

    public RoughSharkEntity(EntityType<? extends RoughSharkEntity> type, World world) {
        super(type, world);
    }
    public boolean canBeLeashed(PlayerEntity p_184652_1_) {
        return true;
    }


    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new RoughSharkEntity.SwimGoal(this));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.0D, true));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, SalmonEntity.class, true));



    }
    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return new ItemStack(RegistryHandler.ROUGHSHARK_SPAWN_EGG.get());
    }
    @Override
    protected ItemStack getBucketItemStack()  {
        return new ItemStack(RegistryHandler.ROUGHSHARK_BUCKET.get());
    }

    static class SwimGoal extends RandomSwimmingGoal {
        private final RoughSharkEntity fish;

        public SwimGoal(RoughSharkEntity fish) {
            super(fish, 1.4D, 40);
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
