package org.nebulamodding.centaurus.datagen.data.loot;

import org.nebulamodding.centaurus.registry.block.CBlocks;
import org.nebulamodding.centaurus.registry.item.CItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CBlockLootProvider extends BlockLootSubProvider {
    public CBlockLootProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        // region Exclusions
        final List<DeferredHolder<Block, ? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having a drop automatically provided
        excludedBlocks.add(CBlocks.MAYURA_DOOR);
        excludedBlocks.add(CBlocks.MAYURA_LEAVES);
        excludedBlocks.add(CBlocks.GRIMWOOD_DOOR);
        excludedBlocks.add(CBlocks.GRIMWOOD_LEAVES);
        excludedBlocks.add(CBlocks.FRIGIAN_GRASS_BLOCK);
        excludedBlocks.add(CBlocks.FRIGIAN_DIRT_PATH);
        excludedBlocks.add(CBlocks.FRIGIAN_FARMLAND);
        excludedBlocks.add(CBlocks.BLUESCHIST);
        excludedBlocks.add(CBlocks.BLUESLATE);
        excludedBlocks.add(CBlocks.BLUESCHIST_COAL_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_IRON_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_COPPER_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_GOLD_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_REDSTONE_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_EMERALD_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_LAPIS_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_DIAMOND_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_LUTRUM_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_OBDURIUM_ORE);
        excludedBlocks.add(CBlocks.BLUESCHIST_MALUNITE_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_COAL_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_IRON_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_COPPER_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_GOLD_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_REDSTONE_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_EMERALD_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_LAPIS_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_DIAMOND_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_LUTRUM_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_OBDURIUM_ORE);
        excludedBlocks.add(CBlocks.BLUESLATE_MALUNITE_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_COAL_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_IRON_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_COPPER_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_GOLD_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_REDSTONE_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_EMERALD_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_LAPIS_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_DIAMOND_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_LUTRUM_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_OBDURIUM_ORE);
        excludedBlocks.add(CBlocks.WATER_ICE_MALUNITE_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_COAL_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_IRON_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_COPPER_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_GOLD_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_REDSTONE_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_EMERALD_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_LAPIS_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_DIAMOND_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_LUTRUM_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_MALUNITE_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_COAL_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_IRON_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_COPPER_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_GOLD_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_REDSTONE_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_EMERALD_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_LAPIS_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_DIAMOND_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_LUTRUM_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_MALUNITE_ORE);
        excludedBlocks.add(CBlocks.BRAINROCK);
        excludedBlocks.add(CBlocks.LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.EXPOSED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WEATHERED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.OXIDIZED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.OBDURIUM_DOOR);
        excludedBlocks.add(CBlocks.MALUNITE_DOOR);
        excludedBlocks.add(CBlocks.POTTED_MAYURA_SAPLING);
        excludedBlocks.add(CBlocks.POTTED_GRIMWOOD_SAPLING);
        excludedBlocks.add(CBlocks.POTTED_VIVIAN);
        excludedBlocks.add(CBlocks.POTTED_WICKUL);
        excludedBlocks.add(CBlocks.POTTED_ICEFLOWER);
        // endregion

        // region Leaf Drops
        add(CBlocks.MAYURA_LEAVES.get(), b -> createLeavesDrops(b, CBlocks.MAYURA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(CBlocks.GRIMWOOD_LEAVES.get(), b -> createLeavesDrops(b, CBlocks.GRIMWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        // endregion

        // region Body-Specific Blocks
        add(CBlocks.FRIGIAN_GRASS_BLOCK.get(), b -> createSingleItemTable(CBlocks.FRIGIAN_DIRT.get()));
        add(CBlocks.FRIGIAN_DIRT_PATH.get(), b -> createSingleItemTable(CBlocks.FRIGIAN_DIRT.get()));
        add(CBlocks.FRIGIAN_FARMLAND.get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.FRIGIAN_DIRT.get()));
        // endregion

        // region Stones
        add(CBlocks.BLUESCHIST.get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.COBBLED_BLUESCHIST.get()));
        add(CBlocks.BLUESLATE.get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.COBBLED_BLUESLATE.get()));
        add(CBlocks.KARCASS_STONE.get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.KARCASS_COBBLESTONE.get()));
        // endregion

        // region Door Drops
        add(CBlocks.MAYURA_DOOR.get(), this::createDoorTable);
        add(CBlocks.GRIMWOOD_DOOR.get(), this::createDoorTable);
        add(CBlocks.LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.EXPOSED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.WEATHERED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.OXIDIZED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.WAXED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.WAXED_EXPOSED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.WAXED_WEATHERED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.WAXED_OXIDIZED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.OBDURIUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.MALUNITE_DOOR.get(), this::createDoorTable);
        // endregion

        // region Ore Drops
        add(CBlocks.BLUESCHIST_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.BLUESCHIST_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.BLUESCHIST_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.BLUESCHIST_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.BLUESCHIST_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.BLUESCHIST_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.BLUESCHIST_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.BLUESCHIST_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.BLUESCHIST_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.BLUESCHIST_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_OBDURIUM.get()));
        add(CBlocks.BLUESCHIST_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_MALUNITE.get()));

        add(CBlocks.BLUESLATE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.BLUESLATE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.BLUESLATE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.BLUESLATE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.BLUESLATE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.BLUESLATE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.BLUESLATE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.BLUESLATE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.BLUESLATE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.BLUESLATE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_OBDURIUM.get()));
        add(CBlocks.BLUESLATE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_MALUNITE.get()));

        add(CBlocks.WATER_ICE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.WATER_ICE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.WATER_ICE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.WATER_ICE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.WATER_ICE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.WATER_ICE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.WATER_ICE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.WATER_ICE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.WATER_ICE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.WATER_ICE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_OBDURIUM.get()));
        add(CBlocks.WATER_ICE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_MALUNITE.get()));

        add(CBlocks.NITROGEN_ICE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.NITROGEN_ICE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.NITROGEN_ICE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.NITROGEN_ICE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.NITROGEN_ICE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.NITROGEN_ICE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.NITROGEN_ICE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.NITROGEN_ICE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.NITROGEN_ICE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_OBDURIUM.get()));
        add(CBlocks.NITROGEN_ICE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_MALUNITE.get()));

        add(CBlocks.OXYGEN_ICE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.OXYGEN_ICE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.OXYGEN_ICE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.OXYGEN_ICE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.OXYGEN_ICE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.OXYGEN_ICE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.OXYGEN_ICE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.OXYGEN_ICE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.OXYGEN_ICE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_OBDURIUM.get()));
        add(CBlocks.OXYGEN_ICE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.RAW_MALUNITE.get()));
        // endregion

        // region Potted Plant Drops
        dropPottedContents(CBlocks.POTTED_MAYURA_SAPLING.get());
        dropPottedContents(CBlocks.POTTED_VIVIAN.get());
        dropPottedContents(CBlocks.POTTED_WICKUL.get());
        dropPottedContents(CBlocks.POTTED_ICEFLOWER.get());
        dropPottedContents(CBlocks.POTTED_GRIMWOOD_SAPLING.get());
        // endregion

        // region Automated Loot Tables
        CBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> dropSelf(entry.get()));
        // endregion
    }

    // region Helpers
    protected LootTable.Builder createLutrumOreDrops(Block block) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                block,
                this.applyExplosionDecay(
                        block,
                        LootItem.lootTableItem(CItems.RAW_LUTRUM)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return CBlocks.BLOCKS.getEntries()
                .stream()
                .map(DeferredHolder::get)
                .collect(Collectors.toSet());
    }
    // endregion
}