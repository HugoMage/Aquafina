package com.hugomage.aquafina.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.*;
import net.minecraft.stats.Stats;
import net.minecraft.world.World;

public class FriedToeBiterBucket extends Item {

    public FriedToeBiterBucket() {
        super(new Properties().tab(ItemGroup.TAB_FOOD).fireResistant().food(new Food.Builder().nutrition(5).build()));
    }

    public ItemStack finishUsingItem(ItemStack p_77654_1_, World p_77654_2_, LivingEntity p_77654_3_) {
        if (p_77654_3_ instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)p_77654_3_;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, p_77654_1_);
            serverplayerentity.awardStat(Stats.ITEM_USED.get(this));
        }

        if (p_77654_3_ instanceof PlayerEntity && !((PlayerEntity)p_77654_3_).abilities.instabuild) {
            p_77654_1_.shrink(1);
        }

        return p_77654_1_.isEmpty() ? new ItemStack(Items.BUCKET) : p_77654_1_;
    }

    public UseAction getUseAnimation(ItemStack p_77661_1_) {
        return UseAction.EAT;
    }
}
