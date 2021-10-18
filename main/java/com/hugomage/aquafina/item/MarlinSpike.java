package com.hugomage.aquafina.item;

import com.hugomage.aquafina.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public class MarlinSpike {
    public static IItemTier MARLIN_SPIKE = new IItemTier() {

        @Override
        public int getUses() {
            return 1000;
        }

        @Override
        public float getSpeed() {
            return 8;
        }

        @Override
        public float getAttackDamageBonus() {
            return 2;
        }

        @Override
        public int getLevel() {
            return 5;
        }

        @Override
        public int getEnchantmentValue() {
            return 20;
        }

        @Override
        public Ingredient getRepairIngredient() {
            Ingredient repairMaterial = Ingredient.of(RegistryHandler.MARLIN_SPIKE.get());
            return repairMaterial;
        }


    };
}
