package com.hugomage.aquafina.util;

import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.world.gen.features.TubeWormFeature;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AquafinaFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Aquafina.MOD_ID);

    public static final RegistryObject<Feature<ProbabilityConfig>> TUBEWORM = FEATURES.register("tube_worm_feature", () -> new TubeWormFeature(ProbabilityConfig.CODEC));
}


