package com.hugomage.aquafina.init;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Aquafina.MOD_ID);

    // Fish

    public static final RegistryObject<EntityType<OarfishEntity>> OARFISH = ENTITY_TYPES.register("oarfish", ()->
            EntityType.Builder.of(OarfishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.0f,0.8f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "oarfish").toString()));
    public static final RegistryObject<EntityType<SalmonSharkEntity>> SALMONSHARK = ENTITY_TYPES.register("salmon_shark", ()->
            EntityType.Builder.of(SalmonSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.9f,0.6f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "salmon_shark").toString()));
    public static final RegistryObject<EntityType<GiantStarfishEntity>> GIANTSTARFISH = ENTITY_TYPES.register("giant_starfish", ()->
            EntityType.Builder.of(GiantStarfishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "giant_starfish").toString()));
    public static final RegistryObject<EntityType<RoyalGrammaEntity>> ROYALGRAMMA = ENTITY_TYPES.register("royal_gramma", ()->
            EntityType.Builder.of(RoyalGrammaEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.3f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "royal_gramma").toString()));
    public static final RegistryObject<EntityType<FootballFishEntity>> FOOTBALLFISH = ENTITY_TYPES.register("football_fish", ()->
            EntityType.Builder.of(FootballFishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.0f,0.8f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "football_fish").toString()));
    public static final RegistryObject<EntityType<YetiCrabEntity>> YETICRAB = ENTITY_TYPES.register("yeti_crab", ()->
            EntityType.Builder.of(YetiCrabEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.8f,0.6f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "yeti_crab").toString()));
    public static final RegistryObject<EntityType<AngelFishEntity>> ANGELFISH = ENTITY_TYPES.register("angelfish", ()->
            EntityType.Builder.of(AngelFishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.3f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "angelfish").toString()));
    public static final RegistryObject<EntityType<GoblinSharkEntity>> GOBLINSHARK = ENTITY_TYPES.register("goblin_shark", ()->
            EntityType.Builder.of(GoblinSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.4f,0.6f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "goblin_shark").toString()));
    public static final RegistryObject<EntityType<SpiderCrabEntity>> SPIDERCRAB = ENTITY_TYPES.register("spider_crab", ()->
            EntityType.Builder.of(SpiderCrabEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.0f,0.6f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "spider_crab").toString()));
    public static final RegistryObject<EntityType<SleeperSharkEntity>> SLEEPERSHARK = ENTITY_TYPES.register("sleeper_shark", ()->
            EntityType.Builder.of(SleeperSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.4f,1.1f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "sleeper_shark").toString()));
    public static final RegistryObject<EntityType<DumboOctopusEntity>> DUMBOCTOPUS = ENTITY_TYPES.register("dumbo_octopus", ()->
            EntityType.Builder.of(DumboOctopusEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.3f,0.4f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "dumbo_octopus").toString()));
    public static final RegistryObject<EntityType<HorseShoeCrabEntity>> HORSESHOECRAB = ENTITY_TYPES.register("horseshoe_crab", ()->
            EntityType.Builder.of(HorseShoeCrabEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.5f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "horseshoe_crab").toString()));
    public static final RegistryObject<EntityType<SeaUrchinEntity>> SEAURCHIN = ENTITY_TYPES.register("sea_urchin", ()->
            EntityType.Builder.of(SeaUrchinEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "sea_urchin").toString()));
    public static final RegistryObject<EntityType<MorayEelEntity>> MORAYEEL = ENTITY_TYPES.register("moray_eel", ()->
            EntityType.Builder.of(MorayEelEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.0f,0.5f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "moray_eel").toString()));
    public static final RegistryObject<EntityType<GuitarSharkEntity>> GUITARSHARK = ENTITY_TYPES.register("guitar_shark", ()->
            EntityType.Builder.of(GuitarSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.0f,0.5f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "guitar_shark").toString()));
    public static final RegistryObject<EntityType<RockFishEntity>> ROCKFISH = ENTITY_TYPES.register("rockfish", ()->
            EntityType.Builder.of(RockFishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "rockfish").toString()));
    public static final RegistryObject<EntityType<FoxFaceFishEntity>> FOXFACE = ENTITY_TYPES.register("foxface_fish", ()->
            EntityType.Builder.of(FoxFaceFishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "foxface_fish").toString()));
    public static final RegistryObject<EntityType<GoliathGrouperEntity>> GOLIATHGROUPER = ENTITY_TYPES.register("goliath_grouper", ()->
            EntityType.Builder.of(GoliathGrouperEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.0f,1.0f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "rockfish").toString()));
    public static final RegistryObject<EntityType<CowNoseRayEntity>> COWNOSERAY = ENTITY_TYPES.register("cownose_ray", ()->
            EntityType.Builder.of(CowNoseRayEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "cownose_ray").toString()));
    public static final RegistryObject<EntityType<StarfishEntity>> STARFISH = ENTITY_TYPES.register("starfish", ()->
            EntityType.Builder.of(StarfishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.5f,0.2f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "starfish").toString()));
    public static final RegistryObject<EntityType<SeaSkaterEntity>> SEASKATER = ENTITY_TYPES.register("sea_skater", ()->
            EntityType.Builder.of(SeaSkaterEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.6f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "sea_skater").toString()));
    public static final RegistryObject<EntityType<CoconutCrabEntity>> COCONUTCRAB = ENTITY_TYPES.register("coconut_crab", ()->
            EntityType.Builder.of(CoconutCrabEntity::new, EntityClassification.CREATURE)
                    .sized(0.6f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "coconut_crab").toString()));
    public static final RegistryObject<EntityType<WobbegongEntity>> WOBBEGONG = ENTITY_TYPES.register("wobbegong", ()->
            EntityType.Builder.of(WobbegongEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.0f,0.5f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "wobbegong").toString()));
    public static final RegistryObject<EntityType<EagleRayEntity>> EAGLERAY = ENTITY_TYPES.register("eagle_ray", ()->
            EntityType.Builder.of(EagleRayEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "eagle_ray").toString()));
    public static final RegistryObject<EntityType<SeaSpiderEntity>> SEASPIDER = ENTITY_TYPES.register("sea_spider", ()->
            EntityType.Builder.of(SeaSpiderEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.0f,0.6f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "sea_spider").toString()));
    public static final RegistryObject<EntityType<LionManJellyfishEntity>> LIONMANE = ENTITY_TYPES.register("lion_mane_jellyfish", ()->
            EntityType.Builder.of(LionManJellyfishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.3f,2.0f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "lion_mane_jellyfish").toString()));
    public static final RegistryObject<EntityType<IceFishEntity>> ICEFISH = ENTITY_TYPES.register("ice_fish", ()->
            EntityType.Builder.of(IceFishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "ice_fish").toString()));
    public static final RegistryObject<EntityType<ManOWarEntity>> MANOWAR = ENTITY_TYPES.register("man_o_war", ()->
            EntityType.Builder.of(ManOWarEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "man_o_war").toString()));
    public static final RegistryObject<EntityType<BaskingSharkEntity>> BASKINGSHARK = ENTITY_TYPES.register("basking_shark", ()->
            EntityType.Builder.of(BaskingSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.5f,1.8f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "basking_shark").toString()));
    public static final RegistryObject<EntityType<ReefGobyEntity>> REEFGOBY = ENTITY_TYPES.register("reef_goby", ()->
            EntityType.Builder.of(ReefGobyEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "reef_goby").toString()));
    public static final RegistryObject<EntityType<BoxfishEntity>> BOXFISH = ENTITY_TYPES.register("boxfish", ()->
            EntityType.Builder.of(BoxfishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "boxfish").toString()));
    public static final RegistryObject<EntityType<RoughSharkEntity>> ROUGHSHARK = ENTITY_TYPES.register("rough_shark", ()->
            EntityType.Builder.of(RoughSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "rough_shark").toString()));
    public static final RegistryObject<EntityType<SlenderSunfishEntity>> SLENDER_SUNFISH = ENTITY_TYPES.register("slender_sunfish", ()->
            EntityType.Builder.of(SlenderSunfishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.5f,0.5f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "slender_sunfish").toString()));
    public static final RegistryObject<EntityType<MahiMahiEntity>> MAHIMAHI = ENTITY_TYPES.register("mahi_mahi", ()->
            EntityType.Builder.of(MahiMahiEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.5f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "mahi_mahi").toString()));
    public static final RegistryObject<EntityType<SeaCucumberEntity>> CUCUMBER = ENTITY_TYPES.register("sea_cucumber", ()->
            EntityType.Builder.of(SeaCucumberEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.4f,0.5f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "sea_cucumber").toString()));
    public static final RegistryObject<EntityType<MarlinEntity>> MARLIN = ENTITY_TYPES.register("marlin", ()->
            EntityType.Builder.of(MarlinEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.4f,1.1f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "marlin").toString()));
    public static final RegistryObject<EntityType<LemonSharkEntity>> LEMONSHARK = ENTITY_TYPES.register("lemon_shark", ()->
            EntityType.Builder.of(LemonSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.4f,1.1f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "lemon_shark").toString()));
    public static final RegistryObject<EntityType<BullSharkEntity>> BULLSHARK = ENTITY_TYPES.register("bull_shark", ()->
            EntityType.Builder.of(BullSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.4f,1.1f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "bull_shark").toString()));
    public static final RegistryObject<EntityType<MolaMolaEntity>> MOLA_MOLA = ENTITY_TYPES.register("mola_mola", ()->
            EntityType.Builder.of(MolaMolaEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.5f,0.5f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "mola_mola").toString()));
    public static final RegistryObject<EntityType<PiranhaEntity>> PIRANHA = ENTITY_TYPES.register("piranha", ()->
            EntityType.Builder.of(PiranhaEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.3f,0.4f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "piranha").toString()));
    public static final RegistryObject<EntityType<TriopEntity>> TRIOP = ENTITY_TYPES.register("triop", ()->
            EntityType.Builder.of(TriopEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.3f,0.4f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "triop").toString()));
    public static final RegistryObject<EntityType<ArapaimaEntity>> ARAPAIMA = ENTITY_TYPES.register("arapaima", ()->
            EntityType.Builder.of(ArapaimaEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.0f,0.6f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "arapaima").toString()));
    public static final RegistryObject<EntityType<GiantStingrayEntity>> GIANTSTINGRAY = ENTITY_TYPES.register("giant_stingray", ()->
            EntityType.Builder.of(GiantStingrayEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.5f,0.3f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "giant_stingray").toString()));

    public static final RegistryObject<EntityType<TigerFishEntity>> TIGERFISH = ENTITY_TYPES.register("tigerfish", ()->
            EntityType.Builder.of(TigerFishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.6f,0.7f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "tigerfish").toString()));
    public static final RegistryObject<EntityType<FatCarpEntity>> FATCARP = ENTITY_TYPES.register("fat_carp", ()->
            EntityType.Builder.of(FatCarpEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.6f,0.7f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "fat_carp").toString()));
    public static final RegistryObject<EntityType<RiverSharkEntity>> RIVERSHARK = ENTITY_TYPES.register("river_shark", ()->
            EntityType.Builder.of(RiverSharkEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.6f,0.7f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "river_shark").toString()));
    public static final RegistryObject<EntityType<PaddleFish>> PADDLEFISH = ENTITY_TYPES.register("paddlefish", ()->
            EntityType.Builder.of(PaddleFish::new, EntityClassification.WATER_CREATURE)
                    .sized(0.6f,0.5f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "paddlefish").toString()));
    public static final RegistryObject<EntityType<TilapiaEntity>> TILAPIA = ENTITY_TYPES.register("tilapia", ()->
            EntityType.Builder.of(TilapiaEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.5f,0.5f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "tilapia").toString()));
    public static final RegistryObject<EntityType<ToeBiterEntity>> TOEBITER = ENTITY_TYPES.register("toe_biter", ()->
            EntityType.Builder.of(ToeBiterEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.5f,0.4f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "toe_biter").toString()));
    public static final RegistryObject<EntityType<SpongeBobEntity>> SPONGEBOB = ENTITY_TYPES.register("spongebob", ()->
            EntityType.Builder.of(SpongeBobEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(0.5f,0.4f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "spongebob").toString()));
    public static final RegistryObject<EntityType<GoliathCatfishEntity>> GOLIATHCATFISH = ENTITY_TYPES.register("goliath_catfish", ()->
            EntityType.Builder.of(GoliathCatfishEntity::new, EntityClassification.WATER_CREATURE)
                    .sized(1.4f,1.0f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "goliath_catfish").toString()));
    public static final RegistryObject<EntityType<BelugaSturgeonEntity>> BELUGASTURGEON = ENTITY_TYPES.register("beluga_sturgeon", ()->
            EntityType.Builder.of(BelugaSturgeonEntity::new, EntityClassification.CREATURE)
                    .sized(1.4f,1.1f)
                    .build(new ResourceLocation(Aquafina.MOD_ID, "beluga_sturgeon").toString()));





}




