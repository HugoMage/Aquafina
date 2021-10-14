package com.hugomage.aquafina.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class FishItem extends Item {

    public FishItem() {
        super(new Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(1).saturationMod(0.1F).build()));
    }
}
