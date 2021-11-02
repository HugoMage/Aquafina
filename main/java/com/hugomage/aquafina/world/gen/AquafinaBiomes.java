package com.hugomage.aquafina.world.gen;

import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.AquafinaConfig;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraft.world.gen.surfacebuilders.DefaultSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;
import static com.hugomage.aquafina.Aquafina.MOD_ID;

public class AquafinaBiomes {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, Aquafina.MOD_ID);

    // Dummy biomes to reserve the numeric ID safely for the json biomes to overwrite.
    // No static variable to hold as these dummy biomes should NOT be held and referenced elsewhere.
    static {
        //HotOcean("hot_ocean", BiomeMaker::theVoidBiome);
        PlasticOcean("plastic_ocean", BiomeMaker::theVoidBiome);
        //ShallowOcean("shallow_ocean", BiomeMaker::theVoidBiome);
    }

    public static RegistryObject<Biome> HotOcean(String name, Supplier<Biome> biome) {
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(MOD_ID, name)), AquafinaConfig.Common.INSTANCE.HotOceanSpawnWeight.get()));
        return BIOMES.register(name, biome);
    }
    public static RegistryObject<Biome> PlasticOcean(String name, Supplier<Biome> biome) {
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(MOD_ID, name)), AquafinaConfig.Common.INSTANCE.PlasticOceanSpawnWeight.get()));
        return BIOMES.register(name, biome);
    }
    public static RegistryObject<Biome> ShallowOcean(String name, Supplier<Biome> biome) {
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(MOD_ID, name)), AquafinaConfig.Common.INSTANCE.ShallowOceanSpawnWeight.get()));
        return BIOMES.register(name, biome);
    }

    public static final DeferredRegister<SurfaceBuilder<?>> BUILDERS = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, Aquafina.MOD_ID);

    static
    {
        BUILDERS.register("aquafina", () -> new DefaultSurfaceBuilder(SurfaceBuilderConfig.CODEC));
    }
}
