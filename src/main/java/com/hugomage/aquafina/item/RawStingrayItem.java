package com.hugomage.aquafina.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RawStingrayItem extends Item {

    public RawStingrayItem() {
        super(new Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(2).build()));
    }
}
