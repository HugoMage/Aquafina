package com.hugomage.aquafina.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FreshSoup extends Item {

    public FreshSoup() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                                .nutrition(6)
                        .effect(new EffectInstance(Effects.WATER_BREATHING,300, 3), 1.0f).build()

        )


        );
    }
}
