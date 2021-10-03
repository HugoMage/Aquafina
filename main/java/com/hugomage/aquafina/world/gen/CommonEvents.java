package com.hugomage.aquafina.world.gen;

import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.AquafinaConfig;
import com.hugomage.aquafina.init.ModEntityTypes;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Aquafina.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonEvents {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void registerBiomes(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.Category.SWAMP) {
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.GIANTSTINGRAY.get(),  AquafinaConfig.Common.INSTANCE.GiantStingraySpawnWeight.get(), 1, 2));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.GOLIATHCATFISH.get(),  AquafinaConfig.Common.INSTANCE.GoliathCatfishSpawnWeight.get(), 1, 1));

        }

        if (event.getCategory() == Biome.Category.ICY) {
            event.getSpawns().getSpawner(EntityClassification.CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.BELUGASTURGEON.get(),  AquafinaConfig.Common.INSTANCE.BelugaSturgeonSpawnWeight.get(), 1, 1));

        }
        if (event.getCategory() == Biome.Category.RIVER) {
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.RIVERSHARK.get(),  AquafinaConfig.Common.INSTANCE.RiverSharkSpawnWeight.get(), 1, 1));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.PADDLEFISH.get(),  AquafinaConfig.Common.INSTANCE.PaddleFishSpawnWeight.get(), 1, 2));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.TOEBITER.get(),  AquafinaConfig.Common.INSTANCE.ToeBiterSpawnWeight.get(), 1, 2));
            event.getSpawns().getSpawner(EntityClassification.CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.BELUGASTURGEON.get(),  AquafinaConfig.Common.INSTANCE.BelugaSturgeonSpawnWeight.get(), 1, 1));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.FATCARP.get(),  AquafinaConfig.Common.INSTANCE.FatCarpSpawnWeight.get(), 1, 2));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.TRIOP.get(),  AquafinaConfig.Common.INSTANCE.TriopSpawnWeight.get(), 1, 2));

        }
        if (event.getCategory() == Biome.Category.JUNGLE) {
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.ARAPAIMA.get(),  AquafinaConfig.Common.INSTANCE.ArapaimaSpawnWeight.get(), 1, 3));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.PIRANHA.get(),  AquafinaConfig.Common.INSTANCE.PiranhaSpawnWeight.get(), 2, 5));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.TIGERFISH.get(),  AquafinaConfig.Common.INSTANCE.TigerfishSpawnWeight.get(), 1, 4));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.JUNGLEBLOWFISH.get(),  AquafinaConfig.Common.INSTANCE.JungleBlowfishSpawnWeight.get(), 1, 2));

        }

        if (event.getCategory() == Biome.Category.BEACH) {
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.DUMBOCTOPUS.get(),  AquafinaConfig.Common.INSTANCE.DumboOctopusSpawnWeight.get(), 1, 2));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.HORSESHOECRAB.get(),  AquafinaConfig.Common.INSTANCE.HorseShoeCrabSpawnWeight.get(), 1, 2));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.SEAURCHIN.get(),  AquafinaConfig.Common.INSTANCE.SeaUrchinSpawnWeight.get(), 1, 2));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.GUITARSHARK.get(),  AquafinaConfig.Common.INSTANCE.GuitarSharkSpawnWeight.get(), 1, 1));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.SEASKATER.get(),  AquafinaConfig.Common.INSTANCE.SeaSkaterSpawnWeight.get(), 1, 2));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.COCONUTCRAB.get(),  AquafinaConfig.Common.INSTANCE.CoconutCrabSpawnWeight.get(), 1, 1));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.COWNOSERAY.get(),  AquafinaConfig.Common.INSTANCE.CowNoseRaySpawnWeight.get(), 1, 1));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.MANOWAR.get(),  AquafinaConfig.Common.INSTANCE.ManOWarSpawnWeight.get(), 1, 1));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.CUCUMBER.get(),  AquafinaConfig.Common.INSTANCE.SeaCucumberSpawnWeight.get(), 1, 1));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.BULLSHARK.get(),  AquafinaConfig.Common.INSTANCE.BullSharkSpawnWeight.get(), 1, 1));

        }


        if (event.getName() != null) {
            String name = event.getName().getPath();
            if (name.equals("ocean") || event.getName().equals(new ResourceLocation("minecraft", "deep_ocean"))) {
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.OARFISH.get(),  AquafinaConfig.Common.INSTANCE.OarfishSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.FOOTBALLFISH.get(),  AquafinaConfig.Common.INSTANCE.FootballFishSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.YETICRAB.get(),  AquafinaConfig.Common.INSTANCE.YetiCrabSpawnWeight.get(), 2, 6));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.GOBLINSHARK.get(),  AquafinaConfig.Common.INSTANCE.GoblinSharkSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.SPIDERCRAB.get(),  AquafinaConfig.Common.INSTANCE.SpiderCrabSpawnWeight.get(), 1, 3));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.CUCUMBER.get(),  AquafinaConfig.Common.INSTANCE.SeaCucumberSpawnWeight.get(), 1, 1));

            }
            if (name.equals("warm_ocean") || event.getName().equals(new ResourceLocation("minecraft", "deep_warm_ocean"))) {
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.GIANTSTARFISH.get(),  AquafinaConfig.Common.INSTANCE.GiantStarfishSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.MORAYEEL.get(),  AquafinaConfig.Common.INSTANCE.MorayEelSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.ROCKFISH.get(),  AquafinaConfig.Common.INSTANCE.RockfishSpawnWeight.get(), 1, 2));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.STARFISH.get(),  AquafinaConfig.Common.INSTANCE.StarfishSpawnWeight.get(), 1, 3));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.EAGLERAY.get(),  AquafinaConfig.Common.INSTANCE.EagleRaySpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.WOBBEGONG.get(),  AquafinaConfig.Common.INSTANCE.WobbegongSpawnWeight.get(), 1, 2));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.GOLIATHGROUPER.get(),  AquafinaConfig.Common.INSTANCE.GoliathGrouperSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.ROYALGRAMMA.get(),  AquafinaConfig.Common.INSTANCE.RoyalGrammaSpawnWeight.get(), 1, 3));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.ANGELFISH.get(),  AquafinaConfig.Common.INSTANCE.AngelfishSpawnWeight.get(), 1, 3));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.FOXFACE.get(),  AquafinaConfig.Common.INSTANCE.FoxfaceFishSpawnWeight.get(), 1, 3));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.REEFGOBY.get(),  AquafinaConfig.Common.INSTANCE.ReefGobySpawnWeight.get(), 1, 3));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.CUCUMBER.get(),  AquafinaConfig.Common.INSTANCE.SeaCucumberSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.LEMONSHARK.get(),  AquafinaConfig.Common.INSTANCE.LemonSharkSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.BOXFISH.get(),  AquafinaConfig.Common.INSTANCE.BoxFishSpawnWeight.get(), 1, 4));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.ROUGHSHARK.get(),  AquafinaConfig.Common.INSTANCE.RoughSharkSpawnWeight.get(), 1, 2));

            }
            if (name.equals("cold_ocean") || event.getName().equals(new ResourceLocation("minecraft", "deep_cold_ocean"))) {
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.SALMONSHARK.get(),  AquafinaConfig.Common.INSTANCE.SalmonSharkSpawnWeight.get(), 1, 2));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.SLEEPERSHARK.get(),  AquafinaConfig.Common.INSTANCE.SleeperSharkSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.SEASPIDER.get(),  AquafinaConfig.Common.INSTANCE.SeaSpiderSpawnWeight.get(), 1, 4));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.LIONMANE.get(),  AquafinaConfig.Common.INSTANCE.LionManeJellyfishSpawnWeight.get(), 1, 2));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.ICEFISH.get(),  AquafinaConfig.Common.INSTANCE.IceFishSpawnWeight.get(), 1, 2));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.BASKINGSHARK.get(),  AquafinaConfig.Common.INSTANCE.BaskingSharkSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.SLENDER_SUNFISH.get(),  AquafinaConfig.Common.INSTANCE.SlenderSunfishSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.MAHIMAHI.get(),  AquafinaConfig.Common.INSTANCE.MahiMahiSpawnWeight.get(), 1, 2));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.CUCUMBER.get(),  AquafinaConfig.Common.INSTANCE.SeaCucumberSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.MARLIN.get(),  AquafinaConfig.Common.INSTANCE.MarlinSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.MOLA_MOLA.get(),  AquafinaConfig.Common.INSTANCE.MolaMolaSpawnWeight.get(), 1, 1));
}
            if (event.getName().equals(new ResourceLocation("jellyfishing:jellyfish_fields"))) {
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.STARFISH.get(),  AquafinaConfig.Common.INSTANCE.StarfishSpawnWeight.get(), 1, 3));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.GIANTSTARFISH.get(),  AquafinaConfig.Common.INSTANCE.GiantStarfishSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.CUCUMBER.get(),  AquafinaConfig.Common.INSTANCE.SeaCucumberSpawnWeight.get(), 1, 1));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.LIONMANE.get(),  AquafinaConfig.Common.INSTANCE.LionManeJellyfishSpawnWeight.get(), 1, 2));
                event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(ModEntityTypes.SPONGEBOB.get(),  AquafinaConfig.Common.INSTANCE.SpongeBobSpawnWeight.get(), 1, 1));

            }
            if (event.getName().equals(new ResourceLocation("minecraft:frozen_river"))) {
                event.getSpawns().getSpawner(EntityClassification.WATER_AMBIENT).add(new MobSpawnInfo.Spawners(ModEntityTypes.BELUGASTURGEON.get(),  AquafinaConfig.Common.INSTANCE.BelugaSturgeonSpawnWeight.get(), 1, 1));
            }

        }

    }
}
