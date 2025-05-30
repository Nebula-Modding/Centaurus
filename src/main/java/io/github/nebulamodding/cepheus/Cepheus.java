package io.github.nebulamodding.cepheus;

import io.github.nebulamodding.cepheus.datagen.CDataGeneration;
import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import io.github.nebulamodding.cepheus.registry.CCreativeTab;
import io.github.nebulamodding.cepheus.registry.item.CItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
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
        CBlocks.BLOCKS.register(eventBus);
        CItems.ITEMS.register(eventBus);
        CCreativeTab.CREATIVE_MODE_TABS.register(eventBus);

        eventBus.addListener(CCreativeTab::buildCreativeTab);
        eventBus.addListener(CDataGeneration::gatherData);

        eventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, CConfig.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.MAYURA_SAPLING.getId(), CBlocks.POTTED_MAYURA_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.GRIMWOOD_SAPLING.getId(), CBlocks.POTTED_GRIMWOOD_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.VIVIAN.getId(), CBlocks.POTTED_VIVIAN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.WICKUL.getId(), CBlocks.POTTED_WICKUL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(CBlocks.ICEFLOWER.getId(), CBlocks.POTTED_ICEFLOWER);
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
