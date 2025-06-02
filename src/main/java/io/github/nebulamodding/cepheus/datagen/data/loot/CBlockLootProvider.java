package io.github.nebulamodding.cepheus.datagen.data.loot;

import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import io.github.nebulamodding.cepheus.registry.item.CItems;
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
        final List<DeferredHolder<Block, ? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having a drop automatically provided
        excludedBlocks.add(CBlocks.MAYURA_DOOR);
        excludedBlocks.add(CBlocks.MAYURA_LEAVES);
        excludedBlocks.add(CBlocks.GRIMWOOD_DOOR);
        excludedBlocks.add(CBlocks.GRIMWOOD_LEAVES);
        excludedBlocks.add(CBlocks.FRIGUS_GRASS_BLOCK);
        excludedBlocks.add(CBlocks.FRIGUS_DIRT_PATH);
        excludedBlocks.add(CBlocks.FRIGUS_FARMLAND);
        excludedBlocks.add(CBlocks.BLUESCHIST_BLOCKS.get("blueschist"));
        excludedBlocks.add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale"));
        excludedBlocks.add(CBlocks.WATER_ICE_BLOCKS.get("water_ice"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice"));
        excludedBlocks.add(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice"));
        excludedBlocks.add(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice"));
        excludedBlocks.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice"));
        excludedBlocks.add(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice"));
        excludedBlocks.add(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice"));
        excludedBlocks.add(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice"));
        excludedBlocks.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice"));
        excludedBlocks.add(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice"));
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
        excludedBlocks.add(CBlocks.BLUE_SHALE_COAL_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_IRON_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_COPPER_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_GOLD_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_REDSTONE_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_EMERALD_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_LAPIS_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_DIAMOND_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_LUTRUM_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_OBDURIUM_ORE);
        excludedBlocks.add(CBlocks.BLUE_SHALE_MALUNITE_ORE);
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
        //excludedBlocks.add(CBlocks.WAXED_LUTRUM_DOOR);
        //excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_DOOR);
        //excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_DOOR);
        //excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.OBDURIUM_DOOR);
        excludedBlocks.add(CBlocks.MALUNITE_DOOR);
        excludedBlocks.add(CBlocks.POTTED_MAYURA_SAPLING);
        excludedBlocks.add(CBlocks.POTTED_GRIMWOOD_SAPLING);
        excludedBlocks.add(CBlocks.POTTED_VIVIAN);
        excludedBlocks.add(CBlocks.POTTED_WICKUL);
        excludedBlocks.add(CBlocks.POTTED_ICEFLOWER);

        /*
        Manual Loot Tables
         */

        add(CBlocks.MAYURA_LEAVES.get(), b -> createLeavesDrops(b, CBlocks.MAYURA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(CBlocks.GRIMWOOD_LEAVES.get(), b -> createLeavesDrops(b, CBlocks.GRIMWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(CBlocks.FRIGUS_GRASS_BLOCK.get(), b -> createSingleItemTable(CBlocks.FRIGUS_DIRT.get()));
        add(CBlocks.FRIGUS_DIRT_PATH.get(), b -> createSingleItemTable(CBlocks.FRIGUS_DIRT.get()));
        add(CBlocks.FRIGUS_FARMLAND.get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.FRIGUS_DIRT.get()));
        add(CBlocks.BLUESCHIST_BLOCKS.get("blueschist").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get()));
        add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.BLUE_SHALE_BLOCKS.get("cobbled_blue_shale").get()));
        add(CBlocks.WATER_ICE_BLOCKS.get("water_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.WATER_ICE_BLOCKS.get("cobbled_water_ice").get()));
        add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_cobbled_water_ice").get()));
        add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_cobbled_water_ice").get()));
        add(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.BLACK_WATER_ICE_BLOCKS.get("cobbled_black_water_ice").get()));
        add(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.METHANE_ICE_BLOCKS.get("cobbled_methane_ice").get()));
        add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_cobbled_methane_ice").get()));
        add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_cobbled_methane_ice").get()));
        add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_carbon_dioxide_ice").get()));
        add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_cobbled_carbon_dioxide_ice").get()));
        add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_cobbled_carbon_dioxide_ice").get()));
        add(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.AMMONIA_ICE_BLOCKS.get("cobbled_ammonia_ice").get()));
        add(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.NITROGEN_ICE_BLOCKS.get("cobbled_nitrogen_ice").get()));
        add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_cobbled_nitrogen_ice").get()));
        add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_cobbled_nitrogen_ice").get()));
        add(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.RED_NITROGEN_ICE_BLOCKS.get("cobbled_red_nitrogen_ice").get()));
        add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("cobbled_sulfur_dioxide_ice").get()));
        add(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice").get(), b -> createSingleItemTableWithSilkTouch(b, CBlocks.OXYGEN_ICE_BLOCKS.get("cobbled_oxygen_ice").get()));

        /*
        Door Drops
         */

        add(CBlocks.MAYURA_DOOR.get(), this::createDoorTable);
        add(CBlocks.GRIMWOOD_DOOR.get(), this::createDoorTable);
        add(CBlocks.LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.EXPOSED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.WEATHERED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.OXIDIZED_LUTRUM_DOOR.get(), this::createDoorTable);
        //add(CBlocks.WAXED_LUTRUM_DOOR.get(), this::createDoorTable);
        //add(CBlocks.WAXED_EXPOSED_LUTRUM_DOOR.get(), this::createDoorTable);
        //add(CBlocks.WAXED_WEATHERED_LUTRUM_DOOR.get(), this::createDoorTable);
        //add(CBlocks.WAXED_OXIDIZED_LUTRUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.OBDURIUM_DOOR.get(), this::createDoorTable);
        add(CBlocks.MALUNITE_DOOR.get(), this::createDoorTable);

        /*
        Ore Drops
         */

        add(CBlocks.BLUESCHIST_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.BLUESCHIST_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.BLUESCHIST_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.BLUESCHIST_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.BLUESCHIST_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.BLUESCHIST_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.BLUESCHIST_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.BLUESCHIST_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.BLUESCHIST_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.BLUESCHIST_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(CBlocks.BLUESCHIST_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.MALUNITE_ITEMS.get("raw_malunite").get()));
        add(CBlocks.BLUE_SHALE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.BLUE_SHALE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.BLUE_SHALE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.BLUE_SHALE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.BLUE_SHALE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.BLUE_SHALE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.BLUE_SHALE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.BLUE_SHALE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.BLUE_SHALE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.BLUE_SHALE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(CBlocks.BLUE_SHALE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.MALUNITE_ITEMS.get("raw_malunite").get()));
        add(CBlocks.WATER_ICE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.WATER_ICE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.WATER_ICE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.WATER_ICE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.WATER_ICE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.WATER_ICE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.WATER_ICE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.WATER_ICE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.WATER_ICE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.WATER_ICE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(CBlocks.WATER_ICE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.MALUNITE_ITEMS.get("raw_malunite").get()));
        add(CBlocks.NITROGEN_ICE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.NITROGEN_ICE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.NITROGEN_ICE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.NITROGEN_ICE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.NITROGEN_ICE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.NITROGEN_ICE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.NITROGEN_ICE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.NITROGEN_ICE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.NITROGEN_ICE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(CBlocks.NITROGEN_ICE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.MALUNITE_ITEMS.get("raw_malunite").get()));
        add(CBlocks.OXYGEN_ICE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        add(CBlocks.OXYGEN_ICE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        add(CBlocks.OXYGEN_ICE_COPPER_ORE.get(), this::createCopperOreDrops);
        add(CBlocks.OXYGEN_ICE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        add(CBlocks.OXYGEN_ICE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        add(CBlocks.OXYGEN_ICE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        add(CBlocks.OXYGEN_ICE_LAPIS_ORE.get(), this::createLapisOreDrops);
        add(CBlocks.OXYGEN_ICE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        add(CBlocks.OXYGEN_ICE_LUTRUM_ORE.get(), this::createLutrumOreDrops);
        add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE.get(), (block) -> this.createOreDrop(block, CItems.OBDURIUM_ITEMS.get("raw_obdurium").get()));
        add(CBlocks.OXYGEN_ICE_MALUNITE_ORE.get(), (block) -> this.createOreDrop(block, CItems.MALUNITE_ITEMS.get("raw_malunite").get()));

        /*
        Potted Plant Loot Tables
         */

        dropPottedContents(CBlocks.POTTED_MAYURA_SAPLING.get());
        dropPottedContents(CBlocks.POTTED_VIVIAN.get());
        dropPottedContents(CBlocks.POTTED_WICKUL.get());
        dropPottedContents(CBlocks.POTTED_ICEFLOWER.get());
        dropPottedContents(CBlocks.POTTED_GRIMWOOD_SAPLING.get());

        /*
        Automated Loot Tables
         */

        CBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> dropSelf(entry.get()));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return CBlocks.BLOCKS.getEntries()
                .stream()
                .map(DeferredHolder::get)
                .collect(Collectors.toSet());
    }
    protected LootTable.Builder createLutrumOreDrops(Block block) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                block,
                this.applyExplosionDecay(
                        block,
                        LootItem.lootTableItem(CItems.LUTRUM_ITEMS.get("raw_lutrum"))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}