package com.hugomage.aquafina.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ToeBiterLeg extends Item {

    public ToeBiterLeg() {
        super(new Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(1).saturationMod(0.1F).build()));
    }
}
