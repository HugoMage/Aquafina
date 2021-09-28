package com.hugomage.aquafina.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class rawstingrayItemBase extends Item {

    public rawstingrayItemBase() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                                .nutrition(2)

                        .build()
        )


        );
    }
}
