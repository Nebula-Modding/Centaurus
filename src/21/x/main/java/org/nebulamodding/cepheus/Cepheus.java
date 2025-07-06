package org.nebulamodding.cepheus;

import org.nebulamodding.cepheus.events.CEvents;
import org.nebulamodding.cepheus.registry.CCreativeTab;
import org.nebulamodding.cepheus.registry.CSoundEvents;
import org.nebulamodding.cepheus.registry.block.CBlocks;
import org.nebulamodding.cepheus.registry.item.CItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(Cepheus.MOD_ID)
public class Cepheus {
    public static final String MOD_ID = "cepheus";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Cepheus(IEventBus eventBus, ModContainer modContainer) {
        eventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        eventBus.addListener(CCreativeTab::buildCreativeTab);
        CCreativeTab.CREATIVE_MODE_TAB.register(eventBus);
        CBlocks.BLOCKS.register(eventBus);
        CItems.ITEMS.register(eventBus);
        CSoundEvents.SOUND_EVENTS.register(eventBus);
        CEvents.gatherEvents(eventBus);
        modContainer.registerConfig(ModConfig.Type.COMMON, CConfig.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
