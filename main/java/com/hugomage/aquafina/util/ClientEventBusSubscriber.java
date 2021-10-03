package com.hugomage.aquafina.util;

import com.hugomage.aquafina.Aquafina;

import com.hugomage.aquafina.client.renderer.*;
import com.hugomage.aquafina.init.ModEntityTypes;
import com.hugomage.aquafina.item.ModSpawnEggItem;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Aquafina.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    public static void init() {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SALMONSHARK.get(), com.hugomage.aquafina.client.renderer.SalmonSharkRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GIANTSTARFISH.get(), com.hugomage.aquafina.client.renderer.GiantStarfishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.OARFISH.get(), com.hugomage.aquafina.client.renderer.OarFishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ROYALGRAMMA.get(), com.hugomage.aquafina.client.renderer.RoyalGrammaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.FOOTBALLFISH.get(), com.hugomage.aquafina.client.renderer.FootballFishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.YETICRAB.get(), com.hugomage.aquafina.client.renderer.YetiCrabRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ANGELFISH.get(), com.hugomage.aquafina.client.renderer.AngelFishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOBLINSHARK.get(), com.hugomage.aquafina.client.renderer.GoblinSharkRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SPIDERCRAB.get(), com.hugomage.aquafina.client.renderer.SpiderCrabRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SLEEPERSHARK.get(), com.hugomage.aquafina.client.renderer.SleeperSharkRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DUMBOCTOPUS.get(), com.hugomage.aquafina.client.renderer.DumboOctopusRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.HORSESHOECRAB.get(), com.hugomage.aquafina.client.renderer.HorseShoeCrabRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SEAURCHIN.get(), com.hugomage.aquafina.client.renderer.SeaUrchinRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MORAYEEL.get(), com.hugomage.aquafina.client.renderer.MorayEelRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ROCKFISH.get(), com.hugomage.aquafina.client.renderer.RockFishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.STARFISH.get(), com.hugomage.aquafina.client.renderer.StarfishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GUITARSHARK.get(), com.hugomage.aquafina.client.renderer.GuitarSharkRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COWNOSERAY.get(), com.hugomage.aquafina.client.renderer.CowNoseRayRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SEASKATER.get(), com.hugomage.aquafina.client.renderer.SeaSkaterRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COCONUTCRAB.get(), com.hugomage.aquafina.client.renderer.CoconutCrabRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOLIATHGROUPER.get(), com.hugomage.aquafina.client.renderer.GoliathGroperRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.WOBBEGONG.get(), com.hugomage.aquafina.client.renderer.WobbegongRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EAGLERAY.get(), com.hugomage.aquafina.client.renderer.EagleRayRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.FOXFACE.get(), com.hugomage.aquafina.client.renderer.FoxFaceFishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SEASPIDER.get(), com.hugomage.aquafina.client.renderer.SeaSpiderRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LIONMANE.get(), com.hugomage.aquafina.client.renderer.LionManeJellyfishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ICEFISH.get(), com.hugomage.aquafina.client.renderer.IceFishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MANOWAR.get(), com.hugomage.aquafina.client.renderer.ManOWarRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BASKINGSHARK.get(), com.hugomage.aquafina.client.renderer.BaskingSharkRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REEFGOBY.get(), com.hugomage.aquafina.client.renderer.ReefGobyRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SLENDER_SUNFISH.get(), com.hugomage.aquafina.client.renderer.SlenderSunfishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MAHIMAHI.get(), com.hugomage.aquafina.client.renderer.MahiMahiRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CUCUMBER.get(), com.hugomage.aquafina.client.renderer.SeaCucmberRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MARLIN.get(), com.hugomage.aquafina.client.renderer.MarlinRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BULLSHARK.get(), com.hugomage.aquafina.client.renderer.BullSharkRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LEMONSHARK.get(), com.hugomage.aquafina.client.renderer.LemonSharkRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MOLA_MOLA.get(), com.hugomage.aquafina.client.renderer.MolaMolaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BOXFISH.get(), com.hugomage.aquafina.client.renderer.BoxfishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ROUGHSHARK.get(), com.hugomage.aquafina.client.renderer.RoughSharkRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.PIRANHA.get(), PiranhaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ARAPAIMA.get(), ArapaimaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GIANTSTINGRAY.get(), GiantStingrayRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TIGERFISH.get(), TigerfishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RIVERSHARK.get(), RiverSharkRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.PADDLEFISH.get(), PaddleFishRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TILAPIA.get(), TilapiaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TOEBITER.get(), ToeBiterRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOLIATHCATFISH.get(), GoliathRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.FATCARP.get(), FatCarpRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BELUGASTURGEON.get(), BelugaSturgeonRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SPONGEBOB.get(), SpongeBobRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TRIOP.get(), TriopRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JUNGLEBLOWFISH.get(), JungleBlowfishRenderer::new);
        RenderTypeLookup.setRenderLayer(RegistryHandler.STUFFED_PIRANHA.get(), RenderType.cutout());

    }


    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void itemColors(ColorHandlerEvent.Item event) {
        ItemColors handler = event.getItemColors();
        IItemColor eggColor = (stack, tintIndex) -> ((ModSpawnEggItem) stack.getItem()).getColor(tintIndex);
        for (ModSpawnEggItem e : ModSpawnEggItem.UNADDED_EGGS) handler.register(eggColor, e);
    }

}
