package io.github.nebulamodding.cepheus.registry;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import io.github.nebulamodding.cepheus.registry.item.CItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;

public class CCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cepheus.MOD_ID);

    public static String CREATIVE_TAB_TITLE = "itemGroup.cepheus";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CEPHEUS = CREATIVE_MODE_TABS.register("cepheus", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable(CREATIVE_TAB_TITLE))
                    .icon(() -> new ItemStack(CBlocks.FRIGUS_GRASS_BLOCK.get()))
                    .build());

    public static void buildCreativeTab(BuildCreativeModeTabContentsEvent event) {
        final List<DeferredBlock<? extends Block>> excludedItems = new ArrayList<>();
        // Blocks excluded from the creative menu
        excludedItems.add(CBlocks.POTTED_MAYURA_SAPLING);
        excludedItems.add(CBlocks.POTTED_GRIMWOOD_SAPLING);
        excludedItems.add(CBlocks.POTTED_VIVIAN);
        excludedItems.add(CBlocks.POTTED_WICKUL);
        excludedItems.add(CBlocks.POTTED_ICEFLOWER);

        if(event.getTab() == CEPHEUS.get()) {
            CItems.ITEMS.getEntries()
                    .stream()
                    .filter(b -> !excludedItems.contains(b))
                    .forEach(item -> event.accept(item.get()));
        }
    }
}