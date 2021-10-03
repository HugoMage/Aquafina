package com.hugomage.aquafina.util;



import com.hugomage.aquafina.Aquafina;
import com.hugomage.aquafina.init.ModEntityTypes;
import com.hugomage.aquafina.item.*;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Aquafina.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Aquafina.MOD_ID);


    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }



    // Items
    public static final RegistryObject<Item> RAW_ANGELFISH = ITEMS.register("raw_angelfish", FishItemBase::new);
    public static final RegistryObject<Item> RAW_FOOTBALL_FISH = ITEMS.register("raw_football_fish", FishItemBase::new);
    public static final RegistryObject<Item> RAW_FOXFACE_FISH = ITEMS.register("raw_foxface_fish", FishItemBase::new);
    public static final RegistryObject<Item> RAW_ROYAL_GRAMMA = ITEMS.register("raw_royal_gramma", FishItemBase::new);
    public static final RegistryObject<Item> RAW_STARFISH = ITEMS.register("raw_starfish", FishItemBase::new);
    public static final RegistryObject<Item> SPIDERCRABLEG = ITEMS.register("spider_crab_leg", ItemBase::new);
    public static final RegistryObject<FriedToeBiterLeg> FULLSPIDERCRABLEG = ITEMS.register("meaty_spider_crab_leg", FriedToeBiterLeg::new);
    public static final RegistryObject<Item> RAW_PIRANHA = ITEMS.register("raw_piranha", FishItemBase::new);
    public static final RegistryObject<Item> CAVIAR = ITEMS.register("beluga_caviar", FishItemBase::new);
    public static final RegistryObject<Item> RAW_TILAPIA = ITEMS.register("raw_tilapia", FishItemBase::new);
    public static final RegistryObject<Item> FRIED_TOEBITER = ITEMS.register("bucket_of_fried_toe_biter", FriedToeBiterBucket::new);
    public static final RegistryObject<Item> RAW_STINGRAY = ITEMS.register("raw_stingray_slice", rawstingrayItemBase::new);
    public static final RegistryObject<Item> TOEBITER_LEG = ITEMS.register("toe_biter_leg", ToeBiterLeg::new);
    public static final RegistryObject<Item> FRIED_TOEBITER_LEG = ITEMS.register("fried_toe_biter_leg", FriedToeBiterLeg::new);
    public static final RegistryObject<Item> COOKED_STINGRAY = ITEMS.register("cooked_stingray_slice", cookedstingrayItemBase::new);
    public static final RegistryObject<Item> PIRANHA_MEAL = ITEMS.register("piranha_meal", ItemBase::new);
    public static final RegistryObject<Item> RAW_TIGERFISH = ITEMS.register("raw_tigerfish", FishItemBase::new);
    public static final RegistryObject<Item> FRESH_SOUP = ITEMS.register("fresh_soup", FreshSoup::new);



    // SpawnEgg
    public static final RegistryObject<ModSpawnEggItem> OARFISH_SPAWN_EGG = ITEMS.register("oarfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.OARFISH, 0xc7cce4, 0xbb042c, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> SALMON_SHARK_SPAWN_EGG = ITEMS.register("salmon_shark_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.SALMONSHARK, 0x576491, 0x101010, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> GIANT_STARFISH_SPAWN_EGG = ITEMS.register("giant_starfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.GIANTSTARFISH, 0xe5841b, 0xfad6af, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> ROYAL_GRAMMA_SPAWN_EGG = ITEMS.register("royal_gramma_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.ROYALGRAMMA, 0xf8c243, 0x9b21be, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> FOOTBALLFISH_SPAWN_EGG = ITEMS.register("football_fish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.FOOTBALLFISH, 0x501c3d, 0xf1f2ff, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> YETI_CRAB_SPAWN_EGG = ITEMS.register("yeti_crab_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.YETICRAB, 0xfdefe5, 0xfcdbba, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> ANGELFISH_SPAWN_EGG = ITEMS.register("angelfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.ANGELFISH, 0xf8c243, 0xEB1965, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> GOBLIN_SHARK_SPAWN_EGG = ITEMS.register("goblin_shark_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.GOBLINSHARK, 0xf8b7b7, 0xf895a1, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> SPIDER_CRAB_SPAWN_EGG = ITEMS.register("spider_crab_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.SPIDERCRAB, 0xfa6b3f, 0xf5bba4, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> SLEEPER_SHARK_SPAWN_EGG = ITEMS.register("sleeper_shark_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.SLEEPERSHARK, 0x847c7a, 0xffffff, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> DUMBO_OCTOPUS_SPAWN_EGG = ITEMS.register("dumbo_octopus_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.DUMBOCTOPUS, 0xffdf55, 0xffa13c, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> HORSESHOECRAB_SPAWN_EGG = ITEMS.register("horseshoe_crab_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.HORSESHOECRAB, 0x522f24, 0x281511, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> SEAURCHIN_SPAWN_EGG = ITEMS.register("sea_urchin_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.SEAURCHIN, 0x5a1d27, 0x431025, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> MORAYEEL_SPAWN_EGG = ITEMS.register("moray_eel_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.MORAYEEL, 0x365412, 0x5a4f0a, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> ROCKFISH_SPAWN_EGG = ITEMS.register("rockfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.ROCKFISH, 0x5d2432, 0x000000, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> STARFISH_SPAWN_EGG = ITEMS.register("starfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.STARFISH, 0xEBC619, 0xF1E19A, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> COWNOSE_SPAWN_EGG = ITEMS.register("cownose_ray_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.COWNOSERAY, 0x542712, 0xffe0b5, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> GUITAR_SPAWN_EGG = ITEMS.register("guitar_shark_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.GUITARSHARK, 0x566a78, 0xc9e0f0, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> SEA_SPAWN_EGG = ITEMS.register("sea_skater_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.SEASKATER, 0x8dafe0, 0x6483b0, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> COCONUTCRAB_SPAWN_EGG = ITEMS.register("coconut_crab_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.COCONUTCRAB, 0x4240db, 0x151433, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> GOLIATH_GROUPER_SPAWN_EGG = ITEMS.register("goliath_grouper_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.GOLIATHGROUPER, 0x6e2941, 0xd9a3b5, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> WOBBEGONG_SPAWN_EGG = ITEMS.register("wobbegong_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.WOBBEGONG, 0xed895a, 0xc26438, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> EAGLE_RAY_SPAWN_EGG = ITEMS.register("eagle_ray_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.EAGLERAY, 0x2c306b, 0xbdc1ff, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> FOXFACE_SPAWN_EGG = ITEMS.register("foxface_fish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.FOXFACE, 0xdebb21, 0x292824, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> SEASPIDER_SPAWN_EGG = ITEMS.register("sea_spider_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.SEASPIDER, 0x121212, 0xc4c2c2, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> LIONMANE_SPAWN_EGG = ITEMS.register("lion_mane_jellyfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.LIONMANE, 0xad571a, 0xd94141, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> ICEFISH_SPAWN_EGG = ITEMS.register("ice_fish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.ICEFISH, 0x756363, 0xa89494, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> MANOWAR_SPAWN_EGG = ITEMS.register("man_o_war_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.MANOWAR, 0x447191, 0x31214d, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> BASKING_SHARK_SPAWN_EGG = ITEMS.register("basking_shark_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.BASKINGSHARK, 0x302521, 0xe4edf2, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> REEF_GOBY_SPAWN_EGG = ITEMS.register("reef_goby_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.REEFGOBY, 0xfad7f2, 0xed666d, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> SLENDER_SUNFISH_SPAWN_EGG = ITEMS.register("slender_sunfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.SLENDER_SUNFISH, 0xb1c0de, 0x273d69, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> MAHIMAHI_SPAWN_EGG = ITEMS.register("mahi_mahi_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.MAHIMAHI, 0x148f1a, 0xe3e33b, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> SEACUCUMBER_SPAWN_EGG = ITEMS.register("sea_cucumber_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.CUCUMBER, 0x32452d, 0x22301f, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> MARLIN_SPAWN_EGG = ITEMS.register("marlin_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.MARLIN, 0x2d32c4, 0xbfc42d, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> LEMON_SHARK_SPAWN_EGG = ITEMS.register("lemon_shark_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.LEMONSHARK, 0xe6c019, 0xfceda9, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> BULL_SPAWN_EGG = ITEMS.register("bull_shark_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.BULLSHARK, 0x6e6c63, 0x999999, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> MOLA_MOLA_SPAWN_EGG = ITEMS.register("mola_mola_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.MOLA_MOLA, 0x6d7a91, 0x9db0d1, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> BOXFISH_SPAWN_EGG = ITEMS.register("boxfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.BOXFISH, 0xf0ddad, 0xfacd5a, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> ROUGHSHARK_SPAWN_EGG = ITEMS.register("rough_shark_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.ROUGHSHARK, 0x171716, 0x0d0b0b, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> PIRANHA_SPAWN_EGG = ITEMS.register("piranha_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.PIRANHA, 0x758779, 0xf26f27, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> ARAPAIMA_SPAWN_EGG = ITEMS.register("arapaima_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.ARAPAIMA, 0x706e6a, 0x860505, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> GIANTSTINGRAY_SPAWN_EGG = ITEMS.register("giant_stingray_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.GIANTSTINGRAY, 0x562e24, 0xf2e1d2, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> TIGERFISH_SPAWN_EGG = ITEMS.register("tigerfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.TIGERFISH, 0xb19054, 0x8c0928, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> RIVERSHARK_SPAWN_EGG = ITEMS.register("river_shark_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.RIVERSHARK, 0x3b3167, 0xd6cdb6, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> PADDLEFISH_SPAWN_EGG = ITEMS.register("paddlefish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.PADDLEFISH, 0x5d4538, 0x966f67, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> TILAPIA_SPAWN_EGG = ITEMS.register("tilapia_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.TILAPIA, 0x495064, 0x661a27, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> TOEBITER_SPAWN_EGG = ITEMS.register("toe_biter_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.TOEBITER, 0x48231b, 0x992020, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> GOLIATH_CATFISH_SPAWN_EGG = ITEMS.register("goliath_catfish_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.GOLIATHCATFISH, 0x564641, 0xd09f7d, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> BELUGA_STURGEON_SPAWN_EGG = ITEMS.register("beluga_sturgeon_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.BELUGASTURGEON, 0x98a2a9, 0xeadacf, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> FAT_CARP_SPAWN_EGG = ITEMS.register("fat_carp_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.FATCARP, 0x4c521b, 0xf6ba78, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> TRIOP_SPAWN_EGG = ITEMS.register("triop_spawn_egg",() -> new ModSpawnEggItem(ModEntityTypes.TRIOP, 0x7b8752, 0xcfccb5, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));


    // Bucket
    public static final RegistryObject<Item> ANGELFISH_BUCKET = ITEMS.register("bucket_of_angelfish", () -> new FishBucketItem(ModEntityTypes.ANGELFISH, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> COCONUT_BUCKET = ITEMS.register("bucket_of_coconut_crab", () -> new FishBucketItem(ModEntityTypes.COCONUTCRAB, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> FOOTBALLFISH_BUCKET = ITEMS.register("bucket_of_football_fish", () -> new FishBucketItem(ModEntityTypes.FOOTBALLFISH, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> FOXFACE_BUCKET = ITEMS.register("bucket_of_foxface_fish", () -> new FishBucketItem(ModEntityTypes.ANGELFISH, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> ROYAL_GRAMMA_BUCKET = ITEMS.register("bucket_of_royal_gramma", () -> new FishBucketItem(ModEntityTypes.ROYALGRAMMA, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> STARFISH_BUCKET = ITEMS.register("bucket_of_starfish", () -> new FishBucketItem(ModEntityTypes.STARFISH, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> PIRANHA_BUCKET = ITEMS.register("bucket_of_piranha", () -> new FishBucketItem(ModEntityTypes.PIRANHA, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> TOEBITER_BUCKET = ITEMS.register("bucket_of_toe_biter", () -> new FishBucketItem(ModEntityTypes.TOEBITER, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> TIGERFISH_BUCKET = ITEMS.register("bucket_of_tigerfish", () -> new FishBucketItem(ModEntityTypes.TIGERFISH, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> PADDLEFISH_BUCKET = ITEMS.register("bucket_of_paddlefish", () -> new FishBucketItem(ModEntityTypes.PADDLEFISH, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> TILAPIA_BUCKET = ITEMS.register("bucket_of_tilapia", () -> new FishBucketItem(ModEntityTypes.TILAPIA, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));

    public static final RegistryObject<Item> MAHIMAHI_BUCKET = ITEMS.register("bucket_of_mahi_mahi", () -> new FishBucketItem(ModEntityTypes.MAHIMAHI, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> BOXFISH_BUCKET = ITEMS.register("bucket_of_boxfish", () -> new FishBucketItem(ModEntityTypes.BOXFISH, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> HORSESHOECRAB_BUCKET = ITEMS.register("bucket_of_horseshoe_crab", () -> new FishBucketItem(ModEntityTypes.HORSESHOECRAB, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> TILAPIA_ICEFISH = ITEMS.register("bucket_of_ice_fish", () -> new FishBucketItem(ModEntityTypes.ICEFISH, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> YETICRAB_BUCKET = ITEMS.register("bucket_of_yeti_crab", () -> new FishBucketItem(ModEntityTypes.YETICRAB, () -> Fluids.WATER, new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));


    // Armor

    //tools



    // Blocks
    public static final RegistryObject<com.hugomage.aquafina.blocks.StuffedPiranha> STUFFED_PIRANHA = BLOCKS.register("stuffed_piranha", com.hugomage.aquafina.blocks.StuffedPiranha::new);

    // Block Items
    public static final RegistryObject<Item> STUFFED_PIRANHA_ITEM = ITEMS.register("stuffed_piranha", () -> new BlockItem(STUFFED_PIRANHA.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));


}