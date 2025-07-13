package org.nebulamodding.centaurus.registry;

import org.nebulamodding.centaurus.Centaurus;
import org.nebulamodding.centaurus.registry.block.CBlocks;
import org.nebulamodding.centaurus.registry.item.CItems;
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
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Centaurus.MOD_ID);

    public static String CREATIVE_TAB_TITLE = "itemGroup.centaurus";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CENTAURUS = CREATIVE_MODE_TAB.register(Centaurus.MOD_ID, () ->
            CreativeModeTab.builder()
                    .title(Component.translatable(CREATIVE_TAB_TITLE))
                    .icon(() -> new ItemStack(CBlocks.FRIGIAN_GRASS_BLOCK.get()))
                    .build()
    );

    public static void buildCreativeTab(BuildCreativeModeTabContentsEvent event) {
        final List<DeferredBlock<? extends Block>> excludedItems = new ArrayList<>();
        // Blocks excluded from the creative menu
        //excludedItems.add(CBlocks.TEMPBLOCKTEST);

        if(event.getTab() == CENTAURUS.get()) {
            CItems.ITEMS.getEntries()
                    .stream()
                    .filter(i -> !excludedItems.contains(i))
                    .forEach(item -> event.accept(item.get()));
        }
    }
}