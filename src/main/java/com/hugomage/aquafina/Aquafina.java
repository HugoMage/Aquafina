package com.hugomage.aquafina;

import com.hugomage.aquafina.entity.*;
import com.hugomage.aquafina.registry.ModEntityTypes;
import com.hugomage.aquafina.events.ClientEvents;
import com.hugomage.aquafina.registry.RegistryHandler;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("aquafina")
public class Aquafina {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "aquafina";

    public Aquafina() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::registerClient);
        bus.addListener(this::registerEntityAttributes);
        bus.addListener(this::registerCommon);

        ModEntityTypes.ENTITY_TYPES.register(bus);
        RegistryHandler.BLOCKS.register(bus);
        RegistryHandler.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, AquafinaConfig.Common.SPEC);
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
        event.put(ModEntityTypes.OARFISH.get(), OarfishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SALMONSHARK.get(), SalmonSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.GIANTSTARFISH.get(), SalmonSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.ROYALGRAMMA.get(), RoyalGrammaEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.FOOTBALLFISH.get(), FootballFishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.YETICRAB.get(), YetiCrabEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.ANGELFISH.get(), AngelFishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.GOBLINSHARK.get(), GoblinSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SPIDERCRAB.get(), SpiderCrabEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SLEEPERSHARK.get(), SleeperSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.DUMBOCTOPUS.get(), DumboOctopusEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.HORSESHOECRAB.get(), HorseShoeCrabEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SEAURCHIN.get(), SeaUrchinEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.MORAYEEL.get(), MorayEelEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.ROCKFISH.get(), RockFishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.STARFISH.get(), StarfishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.GUITARSHARK.get(), GuitarSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.COWNOSERAY.get(), CowNoseRayEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SEASKATER.get(), SeaSkaterEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.COCONUTCRAB.get(), CoconutCrabEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.GOLIATHGROUPER.get(), GoliathGrouperEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.WOBBEGONG.get(), WobbegongEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.EAGLERAY.get(), EagleRayEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.FOXFACE.get(), EagleRayEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SEASPIDER.get(), SeaSpiderEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.LIONMANE.get(), LionManJellyfishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.ICEFISH.get(), IceFishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.MANOWAR.get(), ManOWarEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.BASKINGSHARK.get(), BaskingSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.REEFGOBY.get(), ReefGobyEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.MAHIMAHI.get(), MahiMahiEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SLENDER_SUNFISH.get(), SlenderSunfishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.CUCUMBER.get(), SeaCucumberEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.MARLIN.get(), MarlinEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.LEMONSHARK.get(), LemonSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.BULLSHARK.get(), BullSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.MOLA_MOLA.get(), MolaMolaEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.BOXFISH.get(), BoxfishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.ROUGHSHARK.get(), RoughSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.PIRANHA.get(), PiranhaEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.RIVERSHARK.get(), RiverSharkEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.TOEBITER.get(), ToeBiterEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.ARAPAIMA.get(), ArapaimaEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.GIANTSTINGRAY.get(), GiantStingrayEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.TIGERFISH.get(), TigerFishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.PADDLEFISH.get(), PaddleFish.setCustomAttributes().build());
        event.put(ModEntityTypes.TILAPIA.get(), TilapiaEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.GOLIATHCATFISH.get(), GoliathCatfishEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.BELUGASTURGEON.get(), BelugaSturgeonEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.FATCARP.get(), FatCarpEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SPONGEBOB.get(), FatCarpEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.TRIOP.get(), TriopEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.JUNGLEBLOWFISH.get(), JungleBlowfish.setCustomAttributes().build());
    }

    private void registerClient(FMLClientSetupEvent event) {
        ClientEvents.init();
    }
}
