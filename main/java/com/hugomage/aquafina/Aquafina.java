package com.hugomage.aquafina;

import com.hugomage.aquafina.entity.*;
import com.hugomage.aquafina.init.ModEntityTypes;
import com.hugomage.aquafina.util.ClientEventBusSubscriber;
import com.hugomage.aquafina.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.CallbackI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("aquafina")
public class Aquafina
{

    // Directly reference a log4j logger.
    public static final List<Runnable> CALLBACKS = new ArrayList<>();
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "aquafina";
    private static final String ID = "aquafina";
    public Aquafina() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, AquafinaConfig.Common.SPEC);
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerClient);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerEntityAttributes);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerCommon);
        // Register ourselves for server and other game events we are interested in
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        RegistryHandler.init();

    }
    private void registerCommon(FMLCommonSetupEvent event) {
        EntitySpawnPlacementRegistry.register(ModEntityTypes.OARFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.SALMONSHARK.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.GIANTSTARFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.FOOTBALLFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.YETICRAB.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.GOBLINSHARK.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.OCEAN_FLOOR, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.SPIDERCRAB.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.OCEAN_FLOOR, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.SLEEPERSHARK.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, WaterMobEntity::checkMobSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.DUMBOCTOPUS.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.HORSESHOECRAB.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.SEAURCHIN.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.OCEAN_FLOOR, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.MORAYEEL.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.ROCKFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.STARFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.COCONUTCRAB.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::checkAnimalSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.SEASKATER.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, WaterMobEntity::checkMobSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.GUITARSHARK.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.COWNOSERAY.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.WOBBEGONG.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.EAGLERAY.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.PIRANHA.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.GIANTSTINGRAY.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.ARAPAIMA.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ArapaimaEntity::checkArapaimaSpawns);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.TIGERFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.RIVERSHARK.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.PADDLEFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.TILAPIA.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.TOEBITER.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.GOLIATHCATFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, GoliathCatfishEntity::checkGoliathCatfishSpawns);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.BELUGASTURGEON.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BelugaSturgeonEntity::checkBelugaSpawns);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.MANOWAR.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.CUCUMBER.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.BULLSHARK.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.ROYALGRAMMA.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.ANGELFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.FOXFACE.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.REEFGOBY.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.LEMONSHARK.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.BOXFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.ROUGHSHARK.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.SEASPIDER.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.OCEAN_FLOOR, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.LIONMANE.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, WaterMobEntity::checkMobSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.ICEFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.BASKINGSHARK.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.SLENDER_SUNFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.MAHIMAHI.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.MARLIN.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.MOLA_MOLA.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.FATCARP.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.SPONGEBOB.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.TRIOP.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);
        EntitySpawnPlacementRegistry.register(ModEntityTypes.JUNGLEBLOWFISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::checkFishSpawnRules);

    }
    private void registerEntityAttributes(EntityAttributeCreationEvent event) {
        GlobalEntityTypeAttributes.put(ModEntityTypes.OARFISH.get(), OarfishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.SALMONSHARK.get(), SalmonSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.GIANTSTARFISH.get(), SalmonSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.ROYALGRAMMA.get(), RoyalGrammaEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.FOOTBALLFISH.get(), FootballFishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.YETICRAB.get(), YetiCrabEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.ANGELFISH.get(), AngelFishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.GOBLINSHARK.get(), GoblinSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.SPIDERCRAB.get(), SpiderCrabEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.SLEEPERSHARK.get(), SleeperSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.DUMBOCTOPUS.get(), DumboOctopusEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.HORSESHOECRAB.get(), HorseShoeCrabEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.SEAURCHIN.get(), SeaUrchinEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.MORAYEEL.get(), MorayEelEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.ROCKFISH.get(), RockFishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.STARFISH.get(), StarfishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.GUITARSHARK.get(), GuitarSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.COWNOSERAY.get(), CowNoseRayEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.SEASKATER.get(), SeaSkaterEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.COCONUTCRAB.get(), CoconutCrabEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.GOLIATHGROUPER.get(), GoliathGrouperEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.WOBBEGONG.get(), WobbegongEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.EAGLERAY.get(), EagleRayEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.FOXFACE.get(), EagleRayEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.SEASPIDER.get(), SeaSpiderEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.LIONMANE.get(), LionManJellyfishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.ICEFISH.get(), IceFishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.MANOWAR.get(), ManOWarEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.BASKINGSHARK.get(), BaskingSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.REEFGOBY.get(), ReefGobyEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.MAHIMAHI.get(), MahiMahiEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.SLENDER_SUNFISH.get(), SlenderSunfishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.CUCUMBER.get(), SeaCucumberEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.MARLIN.get(), MarlinEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.LEMONSHARK.get(), LemonSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.BULLSHARK.get(), BullSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.MOLA_MOLA.get(), MolaMolaEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.BOXFISH.get(), BoxfishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.ROUGHSHARK.get(), RoughSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.PIRANHA.get(), PiranhaEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.RIVERSHARK.get(), RiverSharkEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.TOEBITER.get(), ToeBiterEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.ARAPAIMA.get(), ArapaimaEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.GIANTSTINGRAY.get(), GiantStingrayEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.TIGERFISH.get(), TigerFishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.PADDLEFISH.get(), PaddleFish.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.TILAPIA.get(), TilapiaEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.GOLIATHCATFISH.get(), GoliathCatfishEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.BELUGASTURGEON.get(), BelugaSturgeonEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.FATCARP.get(), FatCarpEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.SPONGEBOB.get(), FatCarpEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.TRIOP.get(), TriopEntity.setCustomAttributes().build());
        GlobalEntityTypeAttributes.put(ModEntityTypes.JUNGLEBLOWFISH.get(), JungleBlowfish.setCustomAttributes().build());

    }
    private void registerClient(FMLClientSetupEvent event) {
        ClientEventBusSubscriber.init();
        CALLBACKS.forEach(Runnable::run);
        CALLBACKS.clear();
    }
    private void setup(final FMLCommonSetupEvent event)
    {
        {




        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }}



    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
