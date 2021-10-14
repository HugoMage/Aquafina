package com.hugomage.aquafina.item;

import com.hugomage.aquafina.registry.RegistryHandler;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.*;
import net.minecraft.stats.Stats;
import net.minecraft.world.World;

public class FriedToeBiterLeg extends Item {

    public FriedToeBiterLeg() {
        super(new Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(3).saturationMod(0.3F).build()));
    }

    public ItemStack finishUsingItem(ItemStack stack, World level, LivingEntity entity) {
        if (entity instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)entity;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, stack);
            serverplayerentity.awardStat(Stats.ITEM_USED.get(this));
        }

        if (entity instanceof PlayerEntity && !((PlayerEntity)entity).abilities.instabuild) {
            stack.shrink(1);
        }

        return stack.isEmpty() ? new ItemStack(RegistryHandler.SPIDER_CRAB_LEG.get()) : stack;
    }
}
