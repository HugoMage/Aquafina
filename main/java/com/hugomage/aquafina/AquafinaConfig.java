package com.hugomage.aquafina;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Random;

@Mod.EventBusSubscriber(modid = com.hugomage.aquafina.Aquafina.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AquafinaConfig {
    public static int OarfishSpawnWeight;
    public static int FatCarpSpawnWeight;
    public static int GiantStarfishSpawnWeight;
    public static int SalmonSharkSpawnWeight;
    public static int FootballFishSpawnWeight;
    public static int YetiCrabSpawnWeight;
    public static int GoblinSharkSpawnWeight;
    public static int SpiderCrabSpawnWeight;
    public static int SleeperSharkSpawnWeight;
    public static int DumboOctopusSpawnWeight;
    public static int HorseShoeCrabSpawnWeight;
    public static int MorayEelSpawnWeight;
    public static int RockfishSpawnWeight;
    public static int SeaUrchinSpawnWeight;
    public static int StarfishSpawnWeight;
    public static int SeaSkaterSpawnWeight;
    public static int CoconutCrabSpawnWeight;
    public static int CowNoseRaySpawnWeight;
    public static int GuitarSharkSpawnWeight;
    public static int EagleRaySpawnWeight;
    public static int WobbegongSpawnWeight;
    public static int GoliathGrouperSpawnWeight;
    public static int PiranhaSpawnWeight;
    public static int PaddleFishSpawnWeight;
    public static int ToeBiterSpawnWeight;
    public static int TilapiaSpawnWeight;
    public static int TigerfishSpawnWeight;
    public static int GoliathCatfishSpawnWeight;
    public static int ArapaimaSpawnWeight;
    public static int RiverSharkSpawnWeight;
    public static int GiantStingraySpawnWeight;
    public static int BelugaSturgeonSpawnWeight;
    public static int ManOWarSpawnWeight;
    public static int SeaCucumberSpawnWeight;
    public static int BullSharkSpawnWeight;
    public static int RoyalGrammaSpawnWeight;
    public static int AngelfishSpawnWeight;
    public static int FoxfaceFishSpawnWeight;
    public static int ReefGobySpawnWeight;
    public static int LemonSharkSpawnWeight;
    public static int BoxFishSpawnWeight;
    public static int RoughSharkSpawnWeight;
    public static int SeaSpiderSpawnWeight;
    public static int LionManeJellyfishSpawnWeight;
    public static int IceFishSpawnWeight;
    public static int BaskingSharkSpawnWeight;
    public static int SlenderSunfishSpawnWeight;
    public static int MahiMahiSpawnWeight;
    public static int MarlinSpawnWeight;
    public static int MolaMolaSpawnWeight;
    public static int SpongeBobSpawnWeight;
    public static int TriopSpawnWeight;
    public static int JungleBlowfishSpawnWeight;

    @SubscribeEvent
    public static void configLoad(ModConfig.ModConfigEvent event) {
        try {
            ForgeConfigSpec spec = event.getConfig().getSpec();
            if (spec == Common.SPEC) Common.reload();
        }
        catch (Throwable e) {
              }
    }
    public static class Common {
        public static final Common INSTANCE;
        public static final ForgeConfigSpec SPEC;

        static {
            Pair<Common, ForgeConfigSpec> pair = new ForgeConfigSpec.Builder().configure(Common::new);
            INSTANCE = pair.getLeft();
            SPEC = pair.getRight();
        }
        public final ForgeConfigSpec.IntValue TriopSpawnWeight;
        public final ForgeConfigSpec.IntValue OarfishSpawnWeight;
        public final ForgeConfigSpec.IntValue FatCarpSpawnWeight;
        public final ForgeConfigSpec.IntValue GiantStarfishSpawnWeight;
        public final ForgeConfigSpec.IntValue SalmonSharkSpawnWeight;
        public final ForgeConfigSpec.IntValue FootballFishSpawnWeight;
        public final ForgeConfigSpec.IntValue YetiCrabSpawnWeight;
        public final ForgeConfigSpec.IntValue GoblinSharkSpawnWeight;
        public final ForgeConfigSpec.IntValue SpiderCrabSpawnWeight;
        public final ForgeConfigSpec.IntValue SleeperSharkSpawnWeight;
        public final ForgeConfigSpec.IntValue DumboOctopusSpawnWeight;
        public final ForgeConfigSpec.IntValue HorseShoeCrabSpawnWeight;
        public final ForgeConfigSpec.IntValue MorayEelSpawnWeight;
        public final ForgeConfigSpec.IntValue RockfishSpawnWeight;
        public final ForgeConfigSpec.IntValue SeaUrchinSpawnWeight;
        public final ForgeConfigSpec.IntValue StarfishSpawnWeight;
        public final ForgeConfigSpec.IntValue SeaSkaterSpawnWeight;
        public final ForgeConfigSpec.IntValue CoconutCrabSpawnWeight;
        public final ForgeConfigSpec.IntValue CowNoseRaySpawnWeight;
        public final ForgeConfigSpec.IntValue GuitarSharkSpawnWeight;
        public final ForgeConfigSpec.IntValue EagleRaySpawnWeight;
        public final ForgeConfigSpec.IntValue WobbegongSpawnWeight;
        public final ForgeConfigSpec.IntValue GoliathGrouperSpawnWeight;
        public final ForgeConfigSpec.IntValue TilapiaSpawnWeight;
        public final ForgeConfigSpec.IntValue GoliathCatfishSpawnWeight;
        public final ForgeConfigSpec.IntValue ToeBiterSpawnWeight;
        public final ForgeConfigSpec.IntValue PiranhaSpawnWeight;
        public final ForgeConfigSpec.IntValue BelugaSturgeonSpawnWeight;
        public final ForgeConfigSpec.IntValue PaddleFishSpawnWeight;
        public final ForgeConfigSpec.IntValue ArapaimaSpawnWeight;
        public final ForgeConfigSpec.IntValue RiverSharkSpawnWeight;
        public final ForgeConfigSpec.IntValue GiantStingraySpawnWeight;
        public final ForgeConfigSpec.IntValue TigerfishSpawnWeight;
        public final ForgeConfigSpec.IntValue ManOWarSpawnWeight;
        public final ForgeConfigSpec.IntValue SeaCucumberSpawnWeight;
        public final ForgeConfigSpec.IntValue BullSharkSpawnWeight;
        public final ForgeConfigSpec.IntValue RoyalGrammaSpawnWeight;
        public final ForgeConfigSpec.IntValue AngelfishSpawnWeight;
        public final ForgeConfigSpec.IntValue FoxfaceFishSpawnWeight;
        public final ForgeConfigSpec.IntValue ReefGobySpawnWeight;
        public final ForgeConfigSpec.IntValue LemonSharkSpawnWeight;
        public final ForgeConfigSpec.IntValue BoxFishSpawnWeight;
        public final ForgeConfigSpec.IntValue RoughSharkSpawnWeight;
        public final ForgeConfigSpec.IntValue SeaSpiderSpawnWeight;
        public final ForgeConfigSpec.IntValue LionManeJellyfishSpawnWeight;
        public final ForgeConfigSpec.IntValue IceFishSpawnWeight;
        public final ForgeConfigSpec.IntValue BaskingSharkSpawnWeight;
        public final ForgeConfigSpec.IntValue SlenderSunfishSpawnWeight;
        public final ForgeConfigSpec.IntValue MahiMahiSpawnWeight;
        public final ForgeConfigSpec.IntValue MarlinSpawnWeight;
        public final ForgeConfigSpec.IntValue MolaMolaSpawnWeight;
        public final ForgeConfigSpec.IntValue SpongeBobSpawnWeight;
        public final ForgeConfigSpec.IntValue JungleBlowfishSpawnWeight;
        public static void reload() {
            AquafinaConfig.TriopSpawnWeight = INSTANCE.TriopSpawnWeight.get();
            AquafinaConfig.OarfishSpawnWeight = INSTANCE.OarfishSpawnWeight.get();
            AquafinaConfig.FatCarpSpawnWeight = INSTANCE.FatCarpSpawnWeight.get();
            AquafinaConfig.FootballFishSpawnWeight = INSTANCE.FootballFishSpawnWeight.get();
            AquafinaConfig.YetiCrabSpawnWeight = INSTANCE.YetiCrabSpawnWeight.get();
            AquafinaConfig.GoblinSharkSpawnWeight = INSTANCE.GoblinSharkSpawnWeight.get();
            AquafinaConfig.SpiderCrabSpawnWeight = INSTANCE.SpiderCrabSpawnWeight.get();
            AquafinaConfig.SleeperSharkSpawnWeight = INSTANCE.SleeperSharkSpawnWeight.get();
            AquafinaConfig.SalmonSharkSpawnWeight = INSTANCE.SalmonSharkSpawnWeight.get();
            AquafinaConfig.GiantStarfishSpawnWeight = INSTANCE.GiantStarfishSpawnWeight.get();
            AquafinaConfig.DumboOctopusSpawnWeight = INSTANCE.DumboOctopusSpawnWeight.get();
            AquafinaConfig.HorseShoeCrabSpawnWeight = INSTANCE.HorseShoeCrabSpawnWeight.get();
            AquafinaConfig.HorseShoeCrabSpawnWeight = INSTANCE.HorseShoeCrabSpawnWeight.get();
            AquafinaConfig.MorayEelSpawnWeight = INSTANCE.MorayEelSpawnWeight.get();
            AquafinaConfig.RockfishSpawnWeight = INSTANCE.RockfishSpawnWeight.get();
            AquafinaConfig.SeaUrchinSpawnWeight = INSTANCE.SeaUrchinSpawnWeight.get();
            AquafinaConfig.StarfishSpawnWeight = INSTANCE.StarfishSpawnWeight.get();
            AquafinaConfig.SeaSkaterSpawnWeight = INSTANCE.SeaSkaterSpawnWeight.get();
            AquafinaConfig.CoconutCrabSpawnWeight = INSTANCE.CoconutCrabSpawnWeight.get();
            AquafinaConfig.CowNoseRaySpawnWeight = INSTANCE.CowNoseRaySpawnWeight.get();
            AquafinaConfig.GuitarSharkSpawnWeight = INSTANCE.GuitarSharkSpawnWeight.get();
            AquafinaConfig.EagleRaySpawnWeight = INSTANCE.EagleRaySpawnWeight.get();
            AquafinaConfig.WobbegongSpawnWeight = INSTANCE.WobbegongSpawnWeight.get();
            AquafinaConfig.GoliathGrouperSpawnWeight = INSTANCE.GoliathGrouperSpawnWeight.get();
            AquafinaConfig.PiranhaSpawnWeight = INSTANCE.PiranhaSpawnWeight.get();
            AquafinaConfig.TilapiaSpawnWeight = INSTANCE.TilapiaSpawnWeight.get();
            AquafinaConfig.ArapaimaSpawnWeight = INSTANCE.ArapaimaSpawnWeight.get();
            AquafinaConfig.PaddleFishSpawnWeight = INSTANCE.PaddleFishSpawnWeight.get();
            AquafinaConfig.RiverSharkSpawnWeight = INSTANCE.RiverSharkSpawnWeight.get();
            AquafinaConfig.TigerfishSpawnWeight = INSTANCE.TigerfishSpawnWeight.get();
            AquafinaConfig.GiantStingraySpawnWeight = INSTANCE.GiantStingraySpawnWeight.get();
            AquafinaConfig.GoliathCatfishSpawnWeight = INSTANCE.GoliathCatfishSpawnWeight.get();
            AquafinaConfig.BelugaSturgeonSpawnWeight = INSTANCE.BelugaSturgeonSpawnWeight.get();
            AquafinaConfig.ManOWarSpawnWeight = INSTANCE.ManOWarSpawnWeight.get();
            AquafinaConfig.SeaCucumberSpawnWeight = INSTANCE.SeaCucumberSpawnWeight.get();
            AquafinaConfig.BullSharkSpawnWeight = INSTANCE.BullSharkSpawnWeight.get();
            AquafinaConfig.RoyalGrammaSpawnWeight = INSTANCE.RoyalGrammaSpawnWeight.get();
            AquafinaConfig.AngelfishSpawnWeight = INSTANCE.AngelfishSpawnWeight.get();
            AquafinaConfig.FoxfaceFishSpawnWeight = INSTANCE.FoxfaceFishSpawnWeight.get();
            AquafinaConfig.ReefGobySpawnWeight = INSTANCE.ReefGobySpawnWeight.get();
            AquafinaConfig.LemonSharkSpawnWeight = INSTANCE.LemonSharkSpawnWeight.get();
            AquafinaConfig.BoxFishSpawnWeight = INSTANCE.BoxFishSpawnWeight.get();
            AquafinaConfig.RoughSharkSpawnWeight = INSTANCE.RoughSharkSpawnWeight.get();
            AquafinaConfig.SeaSpiderSpawnWeight = INSTANCE.SeaSpiderSpawnWeight.get();
            AquafinaConfig.LionManeJellyfishSpawnWeight = INSTANCE.LionManeJellyfishSpawnWeight.get();
            AquafinaConfig.IceFishSpawnWeight = INSTANCE.IceFishSpawnWeight.get();
            AquafinaConfig.BaskingSharkSpawnWeight = INSTANCE.BaskingSharkSpawnWeight.get();
            AquafinaConfig.SlenderSunfishSpawnWeight = INSTANCE.SlenderSunfishSpawnWeight.get();
            AquafinaConfig.MahiMahiSpawnWeight = INSTANCE.MahiMahiSpawnWeight.get();
            AquafinaConfig.MarlinSpawnWeight = INSTANCE.MarlinSpawnWeight.get();
            AquafinaConfig.MolaMolaSpawnWeight = INSTANCE.MolaMolaSpawnWeight.get();
            AquafinaConfig.SpongeBobSpawnWeight = INSTANCE.SpongeBobSpawnWeight.get();
            AquafinaConfig.JungleBlowfishSpawnWeight = INSTANCE.JungleBlowfishSpawnWeight.get();
        }
        Common(ForgeConfigSpec.Builder builder) {
            builder.push("Jungle Fighters Spawn Weight");
            PiranhaSpawnWeight = builder.comment("Spawn weight of Piranha").defineInRange("piranha_spawn_weight", 70, 0, 1000);
            ArapaimaSpawnWeight = builder.comment("Spawn weight of Arapaima").defineInRange("arapaima_spawn_weight", 70, 0, 1000);
            TigerfishSpawnWeight = builder.comment("Spawn weight of Tigerfish").defineInRange("tigerfish_spawn_weight", 40, 0, 1000);
            JungleBlowfishSpawnWeight = builder.comment("Spawn weight of Junge Blowfish").defineInRange("jungle_blowfish_spawn_weight", 40, 0, 1000);

            builder.pop();


            builder.push("River Warriors Spawn Weight");
            PaddleFishSpawnWeight = builder.comment("Spawn weight of Paddlefish").defineInRange("paddlefish_spawn_weight", 50, 0, 1000);
            FatCarpSpawnWeight = builder.comment("Spawn weight of Fat Carp").defineInRange("fat_carp_spawn_weight", 30, 0, 1000);
            TilapiaSpawnWeight = builder.comment("Spawn weight of Tilapia").defineInRange("tilapia_spawn_weight", 70, 0, 1000);
            ToeBiterSpawnWeight = builder.comment("Spawn weight of Toe Biter").defineInRange("toe_biter_spawn_weight", 30, 0, 1000);
            RiverSharkSpawnWeight = builder.comment("Spawn weight of RiverShark").defineInRange("rivershark_spawn_weight", 10, 0, 1000);
            TriopSpawnWeight = builder.comment("Spawn weight of Triop").defineInRange("triop_spawn_weight", 30, 0, 1000);
            builder.pop();


            builder.push("Swamp Knights Spawn Weight");
            GoliathCatfishSpawnWeight = builder.comment("Spawn weight of Goliath Catfish").defineInRange("goliath_catfish_spawn_weight", 5, 0, 1000);
            GiantStingraySpawnWeight = builder.comment("Spawn weight of Giant Stingrays").defineInRange("giant_stingray_spawn_weight", 5, 0, 1000);
            builder.pop();

            builder.push("Icy Soldiers Spawn Weight");
            BelugaSturgeonSpawnWeight = builder.comment("Spawn weight of Beluga Sturgeon").defineInRange("beluga_sturgeon_spawn_weight", 90, 0, 1000);
            builder.pop();

            builder.push("Deep Sea Livers Spawn Weight");
            OarfishSpawnWeight = builder.comment("Spawn weight of Oarfish").defineInRange("oarfish_spawn_weight", 10, 0, 1000);
            FootballFishSpawnWeight = builder.comment("Spawn weight of Football Fish").defineInRange("football_fish_spawn_weight", 20, 0, 1000);
            YetiCrabSpawnWeight = builder.comment("Spawn weight of Yeti Crab").defineInRange("yeti_crab_spawn_weight", 40, 0, 1000);
            SpiderCrabSpawnWeight = builder.comment("Spawn weight of Spider Crab").defineInRange("spider_crab_spawn_weight", 10, 0, 1000);
            GoblinSharkSpawnWeight = builder.comment("Spawn weight of Goblin Shark").defineInRange("goblin_shark_spawn_weight", 10, 0, 1000);
            builder.pop();

            builder.push("Cold Ocean Titans Spawn Weight");
            SleeperSharkSpawnWeight = builder.comment("Spawn weight of Sleeper Shark").defineInRange("sleeper_shark_spawn_weight", 10, 0, 1000);
            SalmonSharkSpawnWeight = builder.comment("Spawn weight of Salmon Shark").defineInRange("salmon_shark_spawn_weight", 10, 0, 1000);
            LionManeJellyfishSpawnWeight = builder.comment("Spawn weight of Lion Mane Jellyfish").defineInRange("lion_mane_jellyfish_spawn_weight", 10, 0, 1000);
            IceFishSpawnWeight = builder.comment("Spawn weight of Ice Fish").defineInRange("ice_fish_spawn_weight", 10, 0, 1000);
            BaskingSharkSpawnWeight = builder.comment("Spawn weight of Basking Shark").defineInRange("basking_shark_spawn_weight", 10, 0, 1000);
            SlenderSunfishSpawnWeight = builder.comment("Spawn weight of Slender Sunfish").defineInRange("slender_sunfish_spawn_weight", 10, 0, 1000);
            MahiMahiSpawnWeight = builder.comment("Spawn weight of Mahi Mahi").defineInRange("mahi_mahi_spawn_weight", 10, 0, 1000);
            MarlinSpawnWeight = builder.comment("Spawn weight of Marlin").defineInRange("marlin_spawn_weight", 10, 0, 1000);
            MolaMolaSpawnWeight = builder.comment("Spawn weight of Mola Mola").defineInRange("mola_mola_spawn_weight", 10, 0, 1000);
            SeaSpiderSpawnWeight = builder.comment("Spawn weight of Sea Spider").defineInRange("sea_spider_spawn_weight", 10, 0, 1000);
            builder.pop();

            builder.push("Warm Stayers Spawn Weight");
            GiantStarfishSpawnWeight = builder.comment("Spawn weight of Giant Starfish").defineInRange("giant_starfish_spawn_weight", 10, 0, 1000);
            MorayEelSpawnWeight = builder.comment("Spawn weight of Moray Eel").defineInRange("moray_eel_spawn_weight", 10, 0, 1000);
            RockfishSpawnWeight = builder.comment("Spawn weight of Rockfish").defineInRange("rockfish_spawn_weight", 10, 0, 1000);
            StarfishSpawnWeight = builder.comment("Spawn weight of Starfish").defineInRange("starfish_spawn_weight", 20, 0, 1000);
            EagleRaySpawnWeight = builder.comment("Spawn weight of Eagle Ray").defineInRange("eagle_ray_spawn_weight", 40, 0, 1000);
            GoliathGrouperSpawnWeight = builder.comment("Spawn weight of Goliath Grouper").defineInRange("goliath_grouper_spawn_weight", 40, 0, 1000);
            WobbegongSpawnWeight = builder.comment("Spawn weight of Wobbegong").defineInRange("wobbegong_spawn_weight", 30, 0, 1000);
            RoyalGrammaSpawnWeight = builder.comment("Spawn weight of Royal Gramma").defineInRange("royal_gramma_spawn_weight", 30, 0, 1000);
            AngelfishSpawnWeight = builder.comment("Spawn weight of Angelfish").defineInRange("angelfish_spawn_weight", 30, 0, 1000);
            FoxfaceFishSpawnWeight = builder.comment("Spawn weight of Foxface Fish").defineInRange("foxface_fish_spawn_weight", 30, 0, 1000);
            ReefGobySpawnWeight = builder.comment("Spawn weight of Reef Goby").defineInRange("reef_goby_spawn_weight", 30, 0, 1000);
            BoxFishSpawnWeight = builder.comment("Spawn weight of Box Fish").defineInRange("box_fish_spawn_weight", 30, 0, 1000);
            RoughSharkSpawnWeight = builder.comment("Spawn weight of Rough Shark").defineInRange("rough_shark_spawn_weight", 30, 0, 1000);
            LemonSharkSpawnWeight = builder.comment("Spawn weight of Lemon Shark").defineInRange("lemon_shark_spawn_weight", 30, 0, 1000);
            builder.pop();

            builder.push("Beach Dwellers Spawn Weight");
            DumboOctopusSpawnWeight = builder.comment("Spawn weight of Dumbo Octopus").defineInRange("dumbo_octopus_spawn_weight", 50, 0, 1000);
            HorseShoeCrabSpawnWeight = builder.comment("Spawn weight of HorseShoe Crab").defineInRange("horseshoe_crab_spawn_weight", 70, 0, 1000);
            SeaUrchinSpawnWeight = builder.comment("Spawn weight of Sea Urchin").defineInRange("sea_urchin_spawn_weight", 50, 0, 1000);
            SeaSkaterSpawnWeight = builder.comment("Spawn weight of Sea Skater").defineInRange("sea_skate_spawn_weight", 50, 0, 1000);
            CoconutCrabSpawnWeight = builder.comment("Spawn weight of Coconut Crab").defineInRange("coconut_crab_spawn_weight", 50, 0, 1000);
            CowNoseRaySpawnWeight = builder.comment("Spawn weight of Cow Nose Ray").defineInRange("cow_nose_ray_spawn_weight", 50, 0, 1000);
            GuitarSharkSpawnWeight = builder.comment("Spawn weight of Guitar Shark").defineInRange("guitar_shark_spawn_weight", 50, 0, 1000);
            ManOWarSpawnWeight = builder.comment("Spawn weight of Man O War").defineInRange("man_o_war_spawn_weight", 50, 0, 1000);
            SeaCucumberSpawnWeight = builder.comment("Spawn weight of Sea Cucumber").defineInRange("sea_cucumber_spawn_weight", 50, 0, 1000);
            BullSharkSpawnWeight = builder.comment("Spawn weight of Bull Shark").defineInRange("bull_shark_spawn_weight", 50, 0, 1000);
            SpongeBobSpawnWeight = builder.comment("Spawn weight of SpongeBob").defineInRange("spongebob_spawn_weight", 50, 0, 1000);
            builder.pop();

        }


    }

}
