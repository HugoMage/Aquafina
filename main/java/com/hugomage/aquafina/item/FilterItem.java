package com.hugomage.aquafina.item;

import com.hugomage.aquafina.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FilterItem extends Item {
    public FilterItem() {
        super(new Properties()
                .durability(256)
                .tab(ItemGroup.TAB_TOOLS));
    }

    public boolean mineBlock(ItemStack p_179218_1_, World p_179218_2_, BlockState p_179218_3_, BlockPos p_179218_4_, LivingEntity p_179218_5_) {
        if (!p_179218_2_.isClientSide && !p_179218_3_.getBlock().is(BlockTags.FIRE)) {
            p_179218_1_.hurtAndBreak(1, p_179218_5_, (p_220036_0_) -> {
                p_220036_0_.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
            });
        }

        return p_179218_3_.is(RegistryHandler.PLASTIC_SAND.get()) || p_179218_3_.is(RegistryHandler.SHELL_SAND.get()) || super.mineBlock(p_179218_1_, p_179218_2_, p_179218_3_, p_179218_4_, p_179218_5_);
    }

    public boolean isCorrectToolForDrops(BlockState p_150897_1_) {
        return p_150897_1_.is(RegistryHandler.PLASTIC_SAND.get()) || p_150897_1_.is(RegistryHandler.SHELL_SAND.get());
    }

    public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
        if (!p_150893_2_.is(RegistryHandler.PLASTIC_SAND.get()) && !p_150893_2_.is(RegistryHandler.SHELL_SAND.get())) {
            return super.getDestroySpeed(p_150893_1_, p_150893_2_);
        } else {
            return 15.0F;
        }
    }
}
