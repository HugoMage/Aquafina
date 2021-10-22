package com.hugomage.aquafina.util;

import com.hugomage.aquafina.Aquafina;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidWithNoiseConfig;

public class AquafinaConfiguredFeatures {
    public static final ConfiguredFeature<?, ?> TUBE_WORM_HOT = AquafinaFeatures.TUBEWORM.get().configured(new ProbabilityConfig(.5F)).range(32);


    public static void registerConfiguredFeatures() {
        Registry<ConfiguredFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_FEATURE;
        Registry.register(registry, new ResourceLocation(Aquafina.MOD_ID, "tube_worm_hot"), TUBE_WORM_HOT);

    }


}
