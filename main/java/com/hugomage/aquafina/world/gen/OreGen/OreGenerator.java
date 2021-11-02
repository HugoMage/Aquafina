package com.hugomage.aquafina.world.gen.OreGen;

import com.hugomage.aquafina.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;


public class OreGenerator {
    public static void registerFeature(Block block, RuleTest surroundingBlock, int veinSize, int maxY, int veinsPerChunk){
        OreFeatureConfig feature = new OreFeatureConfig(surroundingBlock, block.defaultBlockState(), veinSize);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, Objects.requireNonNull(block.getRegistryName()), Feature.ORE.configured(feature).range(maxY).count(veinsPerChunk).squared());

    }

    public static void setupGen() {
        for(Map.Entry<RegistryKey<Biome>, Biome> biome : WorldGenRegistries.BIOME.entrySet()){

            if(biome.getValue().getBiomeCategory().equals(Biome.Category.BEACH)){
                addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistries.CONFIGURED_FEATURE.get(RegistryHandler.SHELL_SAND.getId()));
                addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistries.CONFIGURED_FEATURE.get(RegistryHandler.ROCKY_SAND.getId()));
            }
            if(biome.getValue().getBiomeCategory().equals(Biome.Category.OCEAN)){
                addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistries.CONFIGURED_FEATURE.get(RegistryHandler.SHELL_SAND.getId()));
                addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistries.CONFIGURED_FEATURE.get(RegistryHandler.ROCKY_SAND.getId()));
            }
        }
    }

    public static void addFeatureToBiome(Biome biome, GenerationStage.Decoration decoration, ConfiguredFeature<?, ?> configuredFeature){
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(biome.getGenerationSettings().features());

        while (biomeFeatures.size() <= decoration.ordinal()) {
            biomeFeatures.add(new ArrayList<>());
        }
        List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
        features.add(() -> configuredFeature);
        biomeFeatures.set(decoration.ordinal(), features);
        ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.getGenerationSettings(), biomeFeatures, "field_242484_f");
    }
}