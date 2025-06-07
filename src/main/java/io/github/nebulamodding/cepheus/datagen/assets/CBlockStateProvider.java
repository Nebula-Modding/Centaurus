package io.github.nebulamodding.cepheus.datagen.assets;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CBlockStateProvider extends BlockStateProvider {
    public CBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cepheus.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        final List<DeferredBlock<? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having blockstates and models provided
        excludedBlocks.add(CBlocks.MAYURA_WOOD);
        excludedBlocks.add(CBlocks.STRIPPED_MAYURA_WOOD);
        excludedBlocks.add(CBlocks.MAYURA_STAIRS);
        excludedBlocks.add(CBlocks.MAYURA_SLAB);
        excludedBlocks.add(CBlocks.MAYURA_FENCE);
        excludedBlocks.add(CBlocks.MAYURA_FENCE_GATE);
        excludedBlocks.add(CBlocks.MAYURA_DOOR);
        excludedBlocks.add(CBlocks.MAYURA_TRAPDOOR);
        excludedBlocks.add(CBlocks.MAYURA_PRESSURE_PLATE);
        excludedBlocks.add(CBlocks.MAYURA_BUTTON);
        excludedBlocks.add(CBlocks.MAYURA_SAPLING);
        excludedBlocks.add(CBlocks.GRIMWOOD_WOOD);
        excludedBlocks.add(CBlocks.STRIPPED_GRIMWOOD_WOOD);
        excludedBlocks.add(CBlocks.GRIMWOOD_STAIRS);
        excludedBlocks.add(CBlocks.GRIMWOOD_SLAB);
        excludedBlocks.add(CBlocks.GRIMWOOD_FENCE);
        excludedBlocks.add(CBlocks.GRIMWOOD_FENCE_GATE);
        excludedBlocks.add(CBlocks.GRIMWOOD_DOOR);
        excludedBlocks.add(CBlocks.GRIMWOOD_TRAPDOOR);
        excludedBlocks.add(CBlocks.GRIMWOOD_PRESSURE_PLATE);
        excludedBlocks.add(CBlocks.GRIMWOOD_BUTTON);
        excludedBlocks.add(CBlocks.GRIMWOOD_SAPLING);
        excludedBlocks.add(CBlocks.FRIGUS_GRASS_BLOCK);
        excludedBlocks.add(CBlocks.FRIGUS_DIRT_PATH);
        excludedBlocks.add(CBlocks.FRIGUS_FARMLAND);
        excludedBlocks.add(CBlocks.FRIGUS_MUD_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.FRIGUS_MUD_BRICK_SLAB);
        excludedBlocks.add(CBlocks.FRIGUS_MUD_BRICK_WALL);
        excludedBlocks.add(CBlocks.FRIGUS_SHORT_GRASS);
        excludedBlocks.add(CBlocks.VIVIAN);
        excludedBlocks.add(CBlocks.WICKUL);
        excludedBlocks.add(CBlocks.ICEFLOWER);
        excludedBlocks.add(CBlocks.BLUESCHIST_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_slab"));
        excludedBlocks.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_wall"));
        excludedBlocks.add(CBlocks.BLUE_SHALE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.BLUE_SHALE_TILE_STAIRS);
        excludedBlocks.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_brick_slab"));
        excludedBlocks.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_tile_slab"));
        excludedBlocks.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_brick_slab"));
        excludedBlocks.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_tile_slab"));
        excludedBlocks.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_brick_wall"));
        excludedBlocks.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_tile_wall"));
        excludedBlocks.add(CBlocks.PERMAFROST_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.PERMAFROST_TILE_STAIRS);
        excludedBlocks.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"));
        excludedBlocks.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"));
        excludedBlocks.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"));
        excludedBlocks.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"));
        excludedBlocks.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"));
        excludedBlocks.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"));
        excludedBlocks.add(CBlocks.KARCASS_STONE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.KARCASS_STONE_BLOCKS_CONTINUED.get("karcass_stone_brick_slab"));
        excludedBlocks.add(CBlocks.KARCASS_STONE_BLOCKS_CONTINUED.get("karcass_stone_brick_wall"));
        excludedBlocks.add(CBlocks.WATER_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_slab"));
        excludedBlocks.add(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_wall"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_WATER_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_slab"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_wall"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_WATER_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_slab"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_wall"));
        excludedBlocks.add(CBlocks.BLACK_WATER_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_slab"));
        excludedBlocks.add(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_wall"));
        excludedBlocks.add(CBlocks.METHANE_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_slab"));
        excludedBlocks.add(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_wall"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_METHANE_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_slab"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_wall"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_METHANE_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_slab"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_wall"));
        excludedBlocks.add(CBlocks.CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_slab"));
        excludedBlocks.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_wall"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_slab"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_wall"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_slab"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_wall"));
        excludedBlocks.add(CBlocks.AMMONIA_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_slab"));
        excludedBlocks.add(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_wall"));
        excludedBlocks.add(CBlocks.NITROGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_slab"));
        excludedBlocks.add(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_wall"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_slab"));
        excludedBlocks.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_wall"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_slab"));
        excludedBlocks.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_wall"));
        excludedBlocks.add(CBlocks.RED_NITROGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_slab"));
        excludedBlocks.add(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_wall"));
        excludedBlocks.add(CBlocks.SULFUR_DIOXIDE_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_slab"));
        excludedBlocks.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_wall"));
        excludedBlocks.add(CBlocks.OXYGEN_ICE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_slab"));
        excludedBlocks.add(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_wall"));
        excludedBlocks.add(CBlocks.CUT_SALT_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_slab"));
        excludedBlocks.add(CBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_wall"));
        excludedBlocks.add(CBlocks.GRAPHITE_CLUSTER);
        excludedBlocks.add(CBlocks.CUT_GRAPHITE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_slab"));
        excludedBlocks.add(CBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_wall"));
        excludedBlocks.add(CBlocks.CUT_SULFUR_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_slab"));
        excludedBlocks.add(CBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_wall"));
        excludedBlocks.add(CBlocks.TUMOR);
        excludedBlocks.add(CBlocks.GRISTLED_FLESH);
        excludedBlocks.add(CBlocks.SHORT_GRISTLES);
        excludedBlocks.add(CBlocks.TALL_GRISTLES);
        excludedBlocks.add(CBlocks.GORESLATE_BRICK_STAIRS);
        excludedBlocks.add(CBlocks.GORESLATE_TILE_STAIRS);
        excludedBlocks.add(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_slab"));
        excludedBlocks.add(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_slab"));
        excludedBlocks.add(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_slab"));
        excludedBlocks.add(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_slab"));
        excludedBlocks.add(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_wall"));
        excludedBlocks.add(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_wall"));
        excludedBlocks.add(CBlocks.CHISELED_LUTRUM);
        excludedBlocks.add(CBlocks.LUTRUM_GRATE);
        excludedBlocks.add(CBlocks.LUTRUM_WINDOW);
        excludedBlocks.add(CBlocks.LUTRUM_BARS);
        excludedBlocks.add(CBlocks.LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.LUTRUM_TRAPDOOR);
        excludedBlocks.add(CBlocks.LUTRUM_BULB);
        excludedBlocks.add(CBlocks.EXPOSED_CHISELED_LUTRUM);
        excludedBlocks.add(CBlocks.EXPOSED_LUTRUM_GRATE);
        excludedBlocks.add(CBlocks.EXPOSED_LUTRUM_WINDOW);
        excludedBlocks.add(CBlocks.EXPOSED_LUTRUM_BARS);
        excludedBlocks.add(CBlocks.EXPOSED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.EXPOSED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(CBlocks.EXPOSED_LUTRUM_BULB);
        excludedBlocks.add(CBlocks.WEATHERED_CHISELED_LUTRUM);
        excludedBlocks.add(CBlocks.WEATHERED_LUTRUM_GRATE);
        excludedBlocks.add(CBlocks.WEATHERED_LUTRUM_WINDOW);
        excludedBlocks.add(CBlocks.WEATHERED_LUTRUM_BARS);
        excludedBlocks.add(CBlocks.WEATHERED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WEATHERED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(CBlocks.WEATHERED_LUTRUM_BULB);
        excludedBlocks.add(CBlocks.OXIDIZED_CHISELED_LUTRUM);
        excludedBlocks.add(CBlocks.OXIDIZED_LUTRUM_GRATE);
        excludedBlocks.add(CBlocks.OXIDIZED_LUTRUM_WINDOW);
        excludedBlocks.add(CBlocks.OXIDIZED_LUTRUM_BARS);
        excludedBlocks.add(CBlocks.OXIDIZED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.OXIDIZED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(CBlocks.OXIDIZED_LUTRUM_BULB);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_BLOCK);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_SHEET_METAL);
        excludedBlocks.add(CBlocks.WAXED_CHISELED_LUTRUM);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_GRATE);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_WINDOW);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_PLATING);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_PLATING_STAIRS);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_PLATING_SLAB);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_PLATING_PRESSURE_PLATE);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_PLATING_BUTTON);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_PILLAR);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_BARS);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_BULB);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_SHEET_METAL);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_CHISELED_LUTRUM);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_GRATE);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_WINDOW);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_STAIRS);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_SLAB);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_BUTTON);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_PILLAR);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_BARS);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(CBlocks.WAXED_EXPOSED_LUTRUM_BULB);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_SHEET_METAL);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_CHISELED_LUTRUM);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_GRATE);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_WINDOW);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_STAIRS);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_SLAB);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_BUTTON);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_PILLAR);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_BARS);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(CBlocks.WAXED_WEATHERED_LUTRUM_BULB);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_SHEET_METAL);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_CHISELED_LUTRUM);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_GRATE);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_WINDOW);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_STAIRS);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_SLAB);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_BUTTON);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PILLAR);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_BARS);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_DOOR);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_TRAPDOOR);
        excludedBlocks.add(CBlocks.WAXED_OXIDIZED_LUTRUM_BULB);
        excludedBlocks.add(CBlocks.OBDURIUM_GRATE);
        excludedBlocks.add(CBlocks.OBDURIUM_WINDOW);
        excludedBlocks.add(CBlocks.OBDURIUM_DOOR);
        excludedBlocks.add(CBlocks.OBDURIUM_BARS);
        excludedBlocks.add(CBlocks.OBDURIUM_TRAPDOOR);
        excludedBlocks.add(CBlocks.OBDURIUM_BULB);
        excludedBlocks.add(CBlocks.MALUNITE_GRATE);
        excludedBlocks.add(CBlocks.MALUNITE_WINDOW);
        excludedBlocks.add(CBlocks.MALUNITE_DOOR);
        excludedBlocks.add(CBlocks.MALUNITE_BARS);
        excludedBlocks.add(CBlocks.MALUNITE_TRAPDOOR);
        excludedBlocks.add(CBlocks.MALUNITE_BULB);
        excludedBlocks.add(CBlocks.POTTED_MAYURA_SAPLING);
        excludedBlocks.add(CBlocks.POTTED_GRIMWOOD_SAPLING);
        excludedBlocks.add(CBlocks.POTTED_VIVIAN);
        excludedBlocks.add(CBlocks.POTTED_WICKUL);
        excludedBlocks.add(CBlocks.POTTED_ICEFLOWER);

        /*
        Automated Block Models
         */

        // To be re-done
        for (var entry : CBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .collect(Collectors.toSet())
        ) {
            var model = new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/"));
            if (entry.get() instanceof RotatedPillarBlock pillarBlock) {
                logBlock(pillarBlock);
                simpleBlockItem(entry.get(), model);
            } else if (entry.get() instanceof StairBlock stairBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_stairs", ""));
                stairsBlock(stairBlock, texture);
                simpleBlockItem(stairBlock, model);
            } else if (entry.get() instanceof SlabBlock slabBlock) {
                ResourceLocation textureId = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_slab", ""));
                slabBlock(
                        slabBlock,
                        models().slab(name(slabBlock), textureId, textureId, textureId),
                        models().slabTop(name(slabBlock) + "_top", textureId, textureId, textureId),
                        new ModelFile.UncheckedModelFile(textureId)
                );
                simpleBlockItem(slabBlock, model);
            } else if (entry.get() instanceof WallBlock wallBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_wall", ""));
                wallBlock(wallBlock, texture);
                models().wallInventory(entry.getId().getPath() + "_inventory", texture);
                simpleBlockItem(wallBlock, new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/").withSuffix("_inventory")));
            } else if (entry.get() instanceof ButtonBlock buttonBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_button", ""));
                buttonBlock(buttonBlock, texture);
                models().buttonInventory(entry.getId().getPath() + "_inventory", texture);
                simpleBlockItem(buttonBlock, new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/").withSuffix("_inventory")));
            } else if (entry.get() instanceof PressurePlateBlock pressurePlateBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_pressure_plate", ""));
                pressurePlateBlock(pressurePlateBlock, texture);
                simpleBlockItem(pressurePlateBlock, model);
            } else {
                cubeAll(entry.get());
                simpleBlock(entry.get());
                simpleBlockItem(entry.get(), model);
            }
        }

        /*
        Manual Block Models
         */

        axisBlockWithItem(CBlocks.MAYURA_WOOD, blockLoc(CBlocks.MAYURA_LOG), blockLoc(CBlocks.MAYURA_LOG));
        axisBlockWithItem(CBlocks.STRIPPED_MAYURA_WOOD, blockLoc(CBlocks.STRIPPED_MAYURA_LOG), blockLoc(CBlocks.STRIPPED_MAYURA_LOG));
        stairsBlockWithItem(CBlocks.MAYURA_STAIRS, blockLoc(CBlocks.MAYURA_PLANKS));
        slabBlockWithItem(CBlocks.MAYURA_SLAB, blockLoc(CBlocks.MAYURA_PLANKS), blockLoc(CBlocks.MAYURA_PLANKS));
        fenceBlockWithItem(CBlocks.MAYURA_FENCE, blockLoc(CBlocks.MAYURA_PLANKS));
        fenceGateBlockWithItem(CBlocks.MAYURA_FENCE_GATE, blockLoc(CBlocks.MAYURA_PLANKS));
        doorBlockWithItem(CBlocks.MAYURA_DOOR, blockLoc(CBlocks.MAYURA_DOOR, "bottom"), blockLoc(CBlocks.MAYURA_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.MAYURA_TRAPDOOR, blockLoc(CBlocks.MAYURA_TRAPDOOR), true, "cutout");
        pressurePlateBlockWithItem(CBlocks.MAYURA_PRESSURE_PLATE, blockLoc(CBlocks.MAYURA_PLANKS));
        buttonBlockWithItem(CBlocks.MAYURA_BUTTON, blockLoc(CBlocks.MAYURA_PLANKS));
        simpleBlock(CBlocks.MAYURA_SAPLING.get(), models().cross(CBlocks.MAYURA_SAPLING.getId().getPath(), blockLoc(CBlocks.MAYURA_SAPLING)).renderType("cutout"));

        axisBlockWithItem(CBlocks.GRIMWOOD_WOOD, blockLoc(CBlocks.GRIMWOOD_LOG), blockLoc(CBlocks.GRIMWOOD_LOG));
        axisBlockWithItem(CBlocks.STRIPPED_GRIMWOOD_WOOD, blockLoc(CBlocks.STRIPPED_GRIMWOOD_LOG), blockLoc(CBlocks.STRIPPED_GRIMWOOD_LOG));
        stairsBlockWithItem(CBlocks.GRIMWOOD_STAIRS, blockLoc(CBlocks.GRIMWOOD_PLANKS));
        slabBlockWithItem(CBlocks.GRIMWOOD_SLAB, blockLoc(CBlocks.GRIMWOOD_PLANKS), blockLoc(CBlocks.GRIMWOOD_PLANKS));
        fenceBlockWithItem(CBlocks.GRIMWOOD_FENCE, blockLoc(CBlocks.GRIMWOOD_PLANKS));
        fenceGateBlockWithItem(CBlocks.GRIMWOOD_FENCE_GATE, blockLoc(CBlocks.GRIMWOOD_PLANKS));
        doorBlockWithItem(CBlocks.GRIMWOOD_DOOR, blockLoc(CBlocks.GRIMWOOD_DOOR, "bottom"), blockLoc(CBlocks.GRIMWOOD_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.GRIMWOOD_TRAPDOOR, blockLoc(CBlocks.GRIMWOOD_TRAPDOOR), true, "cutout");
        pressurePlateBlockWithItem(CBlocks.GRIMWOOD_PRESSURE_PLATE, blockLoc(CBlocks.GRIMWOOD_PLANKS));
        buttonBlockWithItem(CBlocks.GRIMWOOD_BUTTON, blockLoc(CBlocks.GRIMWOOD_PLANKS));
        simpleBlock(CBlocks.GRIMWOOD_SAPLING.get(), models().cross(CBlocks.GRIMWOOD_SAPLING.getId().getPath(), blockLoc(CBlocks.GRIMWOOD_SAPLING)).renderType("cutout"));

        simpleBlock(CBlocks.FRIGUS_SHORT_GRASS.get(), models().cross(CBlocks.FRIGUS_SHORT_GRASS.getId().getPath(), blockLoc(CBlocks.FRIGUS_SHORT_GRASS)).renderType("cutout"));
        simpleBlock(CBlocks.VIVIAN.get(), models().cross("vivian", blockLoc(CBlocks.VIVIAN)).renderType("cutout"));
        simpleBlock(CBlocks.WICKUL.get(), models().cross("wickul", blockLoc(CBlocks.WICKUL)).renderType("cutout"));
        simpleBlock(CBlocks.ICEFLOWER.get(), models().cross("iceflower", blockLoc(CBlocks.ICEFLOWER)).renderType("cutout"));

        stairsBlockWithItem(CBlocks.FRIGUS_MUD_BRICK_STAIRS, blockLoc(CBlocks.FRIGUS_MUD_BRICKS));
        slabBlockWithItem(CBlocks.FRIGUS_MUD_BRICK_SLAB, blockLoc(CBlocks.FRIGUS_MUD_BRICKS), blockLoc(CBlocks.FRIGUS_MUD_BRICKS));
        wallBlockWithItem(CBlocks.FRIGUS_MUD_BRICK_WALL, blockLoc(CBlocks.FRIGUS_MUD_BRICKS));

        stairsBlockWithItem(CBlocks.BLUESCHIST_BRICK_STAIRS, blockLoc(CBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks")));
        slabBlockWithItem(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_slab"), blockLoc(CBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks")), blockLoc(CBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks")));
        wallBlockWithItem(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_wall"), blockLoc(CBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks")));

        stairsBlockWithItem(CBlocks.BLUE_SHALE_BRICK_STAIRS, blockLoc(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_bricks")));
        stairsBlockWithItem(CBlocks.BLUE_SHALE_TILE_STAIRS, blockLoc(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_tiles")));
        slabBlockWithItem(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_brick_slab"), blockLoc(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_bricks")), blockLoc(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_bricks")));
        slabBlockWithItem(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_tile_slab"), blockLoc(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_tiles")), blockLoc(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_tiles")));
        wallBlockWithItem(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_brick_wall"), blockLoc(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_bricks")));
        wallBlockWithItem(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_tile_wall"), blockLoc(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_tiles")));

        stairsBlockWithItem(CBlocks.PERMAFROST_BRICK_STAIRS, blockLoc(CBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        stairsBlockWithItem(CBlocks.PERMAFROST_TILE_STAIRS, blockLoc(CBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));
        slabBlockWithItem(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"), blockLoc(CBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")), blockLoc(CBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        slabBlockWithItem(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"), blockLoc(CBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")), blockLoc(CBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));
        wallBlockWithItem(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"), blockLoc(CBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks")));
        wallBlockWithItem(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"), blockLoc(CBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles")));

        stairsBlockWithItem(CBlocks.KARCASS_STONE_BRICK_STAIRS, blockLoc(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone_bricks")));
        slabBlockWithItem(CBlocks.KARCASS_STONE_BLOCKS_CONTINUED.get("karcass_stone_brick_slab"), blockLoc(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone_bricks")), blockLoc(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone_bricks")));
        wallBlockWithItem(CBlocks.KARCASS_STONE_BLOCKS_CONTINUED.get("karcass_stone_brick_wall"), blockLoc(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone_bricks")));

        stairsBlockWithItem(CBlocks.WATER_ICE_BRICK_STAIRS, blockLoc(CBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")));
        slabBlockWithItem(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_slab"), blockLoc(CBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")), blockLoc(CBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")));
        wallBlockWithItem(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_wall"), blockLoc(CBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks")));
        stairsBlockWithItem(CBlocks.THOLIN_POOR_WATER_ICE_BRICK_STAIRS, blockLoc(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")));
        slabBlockWithItem(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_slab"), blockLoc(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")), blockLoc(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")));
        wallBlockWithItem(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_wall"), blockLoc(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks")));
        stairsBlockWithItem(CBlocks.THOLIN_RICH_WATER_ICE_BRICK_STAIRS, blockLoc(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")));
        slabBlockWithItem(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_slab"), blockLoc(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")), blockLoc(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")));
        wallBlockWithItem(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_wall"), blockLoc(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks")));
        stairsBlockWithItem(CBlocks.BLACK_WATER_ICE_BRICK_STAIRS, blockLoc(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")));
        slabBlockWithItem(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_slab"), blockLoc(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")), blockLoc(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")));
        wallBlockWithItem(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_wall"), blockLoc(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks")));

        stairsBlockWithItem(CBlocks.METHANE_ICE_BRICK_STAIRS, blockLoc(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")));
        slabBlockWithItem(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_slab"), blockLoc(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")), blockLoc(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")));
        wallBlockWithItem(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_wall"), blockLoc(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks")));
        stairsBlockWithItem(CBlocks.THOLIN_POOR_METHANE_ICE_BRICK_STAIRS, blockLoc(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")));
        slabBlockWithItem(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_slab"), blockLoc(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")), blockLoc(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")));
        wallBlockWithItem(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_wall"), blockLoc(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks")));
        stairsBlockWithItem(CBlocks.THOLIN_RICH_METHANE_ICE_BRICK_STAIRS, blockLoc(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")));
        slabBlockWithItem(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_slab"), blockLoc(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")), blockLoc(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")));
        wallBlockWithItem(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_wall"), blockLoc(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks")));

        stairsBlockWithItem(CBlocks.CARBON_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")));
        slabBlockWithItem(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_slab"), blockLoc(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")), blockLoc(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")));
        wallBlockWithItem(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_wall"), blockLoc(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks")));
        stairsBlockWithItem(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")));
        slabBlockWithItem(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_slab"), blockLoc(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")), blockLoc(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")));
        wallBlockWithItem(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_wall"), blockLoc(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks")));
        stairsBlockWithItem(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")));
        slabBlockWithItem(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_slab"), blockLoc(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")), blockLoc(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")));
        wallBlockWithItem(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_wall"), blockLoc(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks")));

        stairsBlockWithItem(CBlocks.AMMONIA_ICE_BRICK_STAIRS, blockLoc(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")));
        slabBlockWithItem(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_slab"), blockLoc(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")), blockLoc(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")));
        wallBlockWithItem(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_wall"), blockLoc(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks")));

        stairsBlockWithItem(CBlocks.NITROGEN_ICE_BRICK_STAIRS, blockLoc(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")));
        slabBlockWithItem(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_slab"), blockLoc(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")), blockLoc(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")));
        wallBlockWithItem(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_wall"), blockLoc(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks")));
        stairsBlockWithItem(CBlocks.THOLIN_POOR_NITROGEN_ICE_BRICK_STAIRS, blockLoc(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")));
        slabBlockWithItem(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_slab"), blockLoc(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")), blockLoc(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")));
        wallBlockWithItem(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_wall"), blockLoc(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks")));
        stairsBlockWithItem(CBlocks.THOLIN_RICH_NITROGEN_ICE_BRICK_STAIRS, blockLoc(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")));
        slabBlockWithItem(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_slab"), blockLoc(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")), blockLoc(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")));
        wallBlockWithItem(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_wall"), blockLoc(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks")));
        stairsBlockWithItem(CBlocks.RED_NITROGEN_ICE_BRICK_STAIRS, blockLoc(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")));
        slabBlockWithItem(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_slab"), blockLoc(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")), blockLoc(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")));
        wallBlockWithItem(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_wall"), blockLoc(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks")));

        stairsBlockWithItem(CBlocks.SULFUR_DIOXIDE_ICE_BRICK_STAIRS, blockLoc(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")));
        slabBlockWithItem(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_slab"), blockLoc(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")), blockLoc(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")));
        wallBlockWithItem(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_wall"), blockLoc(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks")));

        stairsBlockWithItem(CBlocks.OXYGEN_ICE_BRICK_STAIRS, blockLoc(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")));
        slabBlockWithItem(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_slab"), blockLoc(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")), blockLoc(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")));
        wallBlockWithItem(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_wall"), blockLoc(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks")));

        stairsBlockWithItem(CBlocks.CUT_SALT_BRICK_STAIRS, blockLoc(CBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")));
        slabBlockWithItem(CBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_slab"), blockLoc(CBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")), blockLoc(CBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")));
        wallBlockWithItem(CBlocks.CUT_SALT_BLOCKS_CONTINUED.get("cut_salt_brick_wall"), blockLoc(CBlocks.CUT_SALT_BLOCKS.get("cut_salt_bricks")));

        stairsBlockWithItem(CBlocks.CUT_GRAPHITE_BRICK_STAIRS, blockLoc(CBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")));
        slabBlockWithItem(CBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_slab"), blockLoc(CBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")), blockLoc(CBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")));
        wallBlockWithItem(CBlocks.CUT_GRAPHITE_BLOCKS_CONTINUED.get("cut_graphite_brick_wall"), blockLoc(CBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite_bricks")));

        stairsBlockWithItem(CBlocks.CUT_SULFUR_BRICK_STAIRS, blockLoc(CBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")));
        slabBlockWithItem(CBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_slab"), blockLoc(CBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")), blockLoc(CBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")));
        wallBlockWithItem(CBlocks.CUT_SULFUR_BLOCKS_CONTINUED.get("cut_sulfur_brick_wall"), blockLoc(CBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur_bricks")));

        simpleBlockWithItem(CBlocks.GRISTLED_FLESH.get(), models().cubeBottomTop("gristled_flesh", blockLoc(CBlocks.GRISTLED_FLESH), blockLoc(CBlocks.FLESH_BLOCK), blockLoc(CBlocks.GRISTLE_BLOCK)));
        simpleBlock(CBlocks.SHORT_GRISTLES.get(), models().cross(CBlocks.SHORT_GRISTLES.getId().getPath(), blockLoc(CBlocks.SHORT_GRISTLES)).renderType("cutout"));
        simpleBlock(CBlocks.TALL_GRISTLES.get(), models().cross(CBlocks.TALL_GRISTLES.getId().getPath(), blockLoc(CBlocks.TALL_GRISTLES)).renderType("cutout"));
        stairsBlockWithItem(CBlocks.GORESLATE_BRICK_STAIRS, blockLoc(CBlocks.GORESLATE_BLOCKS.get("goreslate_bricks")));
        stairsBlockWithItem(CBlocks.GORESLATE_TILE_STAIRS, blockLoc(CBlocks.GORESLATE_BLOCKS.get("goreslate_tiles")));
        slabBlockWithItem(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_slab"), blockLoc(CBlocks.GORESLATE_BLOCKS.get("goreslate_bricks")), blockLoc(CBlocks.GORESLATE_BLOCKS.get("goreslate_bricks")));
        slabBlockWithItem(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_slab"), blockLoc(CBlocks.GORESLATE_BLOCKS.get("goreslate_tiles")), blockLoc(CBlocks.GORESLATE_BLOCKS.get("goreslate_tiles")));
        wallBlockWithItem(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_brick_wall"), blockLoc(CBlocks.GORESLATE_BLOCKS.get("goreslate_bricks")));
        wallBlockWithItem(CBlocks.GORESLATE_BLOCKS_CONTINUED.get("goreslate_tile_wall"), blockLoc(CBlocks.GORESLATE_BLOCKS.get("goreslate_tiles")));

        simpleBlockWithItem(CBlocks.CHISELED_LUTRUM.get(), models().cubeColumn("chiseled_lutrum", blockLoc(CBlocks.CHISELED_LUTRUM), blockLoc(CBlocks.CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(CBlocks.LUTRUM_GRATE.get(), models().cubeAll("lutrum_grate", blockLoc(CBlocks.LUTRUM_WINDOW)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.LUTRUM_WINDOW.get(), models().cubeAll("lutrum_window", blockLoc(CBlocks.LUTRUM_WINDOW)).renderType("cutout"));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.LUTRUM_BARS.get(), blockLoc(CBlocks.LUTRUM_BARS), blockLoc(CBlocks.LUTRUM_BARS), "translucent");
        doorBlockWithItem(CBlocks.LUTRUM_DOOR, blockLoc(CBlocks.LUTRUM_DOOR, "bottom"), blockLoc(CBlocks.LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.LUTRUM_TRAPDOOR, blockLoc(CBlocks.LUTRUM_TRAPDOOR), true, "cutout");
        simpleBlockWithItem(CBlocks.EXPOSED_CHISELED_LUTRUM.get(), models().cubeColumn("exposed_chiseled_lutrum", blockLoc(CBlocks.EXPOSED_CHISELED_LUTRUM), blockLoc(CBlocks.EXPOSED_CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(CBlocks.EXPOSED_LUTRUM_GRATE.get(), models().cubeAll("exposed_lutrum_grate", blockLoc(CBlocks.EXPOSED_LUTRUM_GRATE)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.EXPOSED_LUTRUM_WINDOW.get(), models().cubeAll("exposed_lutrum_window", blockLoc(CBlocks.EXPOSED_LUTRUM_WINDOW)).renderType("translucent"));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.EXPOSED_LUTRUM_BARS.get(), blockLoc(CBlocks.EXPOSED_LUTRUM_BARS), blockLoc(CBlocks.EXPOSED_LUTRUM_BARS), "cutout");
        doorBlockWithItem(CBlocks.EXPOSED_LUTRUM_DOOR, blockLoc(CBlocks.EXPOSED_LUTRUM_DOOR, "bottom"), blockLoc(CBlocks.EXPOSED_LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.EXPOSED_LUTRUM_TRAPDOOR, blockLoc(CBlocks.EXPOSED_LUTRUM_TRAPDOOR), true, "cutout");
        simpleBlockWithItem(CBlocks.WEATHERED_CHISELED_LUTRUM.get(), models().cubeColumn("weathered_chiseled_lutrum", blockLoc(CBlocks.WEATHERED_CHISELED_LUTRUM), blockLoc(CBlocks.WEATHERED_CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(CBlocks.WEATHERED_LUTRUM_GRATE.get(), models().cubeAll("weathered_lutrum_grate", blockLoc(CBlocks.WEATHERED_LUTRUM_GRATE)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.WEATHERED_LUTRUM_WINDOW.get(), models().cubeAll("weathered_lutrum_window", blockLoc(CBlocks.WEATHERED_LUTRUM_WINDOW)).renderType("translucent"));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.WEATHERED_LUTRUM_BARS.get(), blockLoc(CBlocks.WEATHERED_LUTRUM_BARS), blockLoc(CBlocks.WEATHERED_LUTRUM_BARS), "cutout");
        doorBlockWithItem(CBlocks.WEATHERED_LUTRUM_DOOR, blockLoc(CBlocks.WEATHERED_LUTRUM_DOOR, "bottom"), blockLoc(CBlocks.WEATHERED_LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.WEATHERED_LUTRUM_TRAPDOOR, blockLoc(CBlocks.WEATHERED_LUTRUM_TRAPDOOR), true, "cutout");
        simpleBlockWithItem(CBlocks.OXIDIZED_CHISELED_LUTRUM.get(), models().cubeColumn("oxidized_chiseled_lutrum", blockLoc(CBlocks.OXIDIZED_CHISELED_LUTRUM), blockLoc(CBlocks.OXIDIZED_CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(CBlocks.OXIDIZED_LUTRUM_GRATE.get(), models().cubeAll("oxidized_lutrum_grate", blockLoc(CBlocks.OXIDIZED_LUTRUM_GRATE)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.OXIDIZED_LUTRUM_WINDOW.get(), models().cubeAll("oxidized_lutrum_window", blockLoc(CBlocks.OXIDIZED_LUTRUM_WINDOW)).renderType("translucent"));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.OXIDIZED_LUTRUM_BARS.get(), blockLoc(CBlocks.OXIDIZED_LUTRUM_BARS), blockLoc(CBlocks.OXIDIZED_LUTRUM_BARS), "cutout");
        doorBlockWithItem(CBlocks.OXIDIZED_LUTRUM_DOOR, blockLoc(CBlocks.OXIDIZED_LUTRUM_DOOR, "bottom"), blockLoc(CBlocks.OXIDIZED_LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.OXIDIZED_LUTRUM_TRAPDOOR, blockLoc(CBlocks.OXIDIZED_LUTRUM_TRAPDOOR), true, "cutout");

        simpleBlockWithItem(CBlocks.WAXED_LUTRUM_BLOCK.get(), models().cubeAll("lutrum_block", blockLoc(CBlocks.LUTRUM_BLOCK)));
        simpleBlockWithItem(CBlocks.WAXED_LUTRUM_SHEET_METAL.get(), models().cubeAll("lutrum_sheet_metal", blockLoc(CBlocks.LUTRUM_SHEET_METAL)));
        simpleBlockWithItem(CBlocks.WAXED_CHISELED_LUTRUM.get(), models().cubeColumn("chiseled_lutrum", blockLoc(CBlocks.CHISELED_LUTRUM), blockLoc(CBlocks.CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(CBlocks.WAXED_LUTRUM_GRATE.get(), models().cubeAll("lutrum_grate", blockLoc(CBlocks.LUTRUM_GRATE)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.WAXED_LUTRUM_WINDOW.get(), models().cubeAll("lutrum_window", blockLoc(CBlocks.LUTRUM_WINDOW)).renderType("translucent"));
        simpleBlockWithItem(CBlocks.WAXED_LUTRUM_PLATING.get(), models().cubeAll("lutrum_plating", blockLoc(CBlocks.LUTRUM_PLATING)));
        stairsBlockWithItem(CBlocks.WAXED_LUTRUM_PLATING_STAIRS, blockLoc(CBlocks.LUTRUM_PLATING));
        slabBlockWithItem(CBlocks.WAXED_LUTRUM_PLATING_SLAB, blockLoc(CBlocks.LUTRUM_PLATING), blockLoc(CBlocks.LUTRUM_PLATING));
        pressurePlateBlockWithItem(CBlocks.WAXED_LUTRUM_PLATING_PRESSURE_PLATE, blockLoc(CBlocks.LUTRUM_PLATING));
        buttonBlockWithItem(CBlocks.WAXED_LUTRUM_PLATING_BUTTON, blockLoc(CBlocks.LUTRUM_PLATING));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.WAXED_LUTRUM_BARS.get(), blockLoc(CBlocks.LUTRUM_BARS), blockLoc(CBlocks.LUTRUM_BARS), "cutout");
        doorBlockWithItem(CBlocks.WAXED_LUTRUM_DOOR, blockLoc(CBlocks.LUTRUM_DOOR, "bottom"), blockLoc(CBlocks.LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.WAXED_LUTRUM_TRAPDOOR, blockLoc(CBlocks.LUTRUM_TRAPDOOR), true, "cutout");
        simpleBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM.get(), models().cubeAll("exposed_lutrum", blockLoc(CBlocks.EXPOSED_LUTRUM)));
        simpleBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_SHEET_METAL.get(), models().cubeAll("exposed_lutrum_sheet_metal", blockLoc(CBlocks.EXPOSED_LUTRUM_SHEET_METAL)));
        simpleBlockWithItem(CBlocks.WAXED_EXPOSED_CHISELED_LUTRUM.get(), models().cubeColumn("exposed_chiseled_lutrum", blockLoc(CBlocks.EXPOSED_CHISELED_LUTRUM), blockLoc(CBlocks.EXPOSED_CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_GRATE.get(), models().cubeAll("exposed_lutrum_grate", blockLoc(CBlocks.EXPOSED_LUTRUM_GRATE)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_WINDOW.get(), models().cubeAll("exposed_lutrum_window", blockLoc(CBlocks.EXPOSED_LUTRUM_WINDOW)).renderType("translucent"));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.WAXED_EXPOSED_LUTRUM_BARS.get(), blockLoc(CBlocks.EXPOSED_LUTRUM_BARS), blockLoc(CBlocks.EXPOSED_LUTRUM_BARS), "cutout");
        simpleBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING.get(), models().cubeAll("exposed_lutrum_plating", blockLoc(CBlocks.EXPOSED_LUTRUM_PLATING)));
        stairsBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_STAIRS, blockLoc(CBlocks.EXPOSED_LUTRUM_PLATING));
        slabBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_SLAB, blockLoc(CBlocks.EXPOSED_LUTRUM_PLATING), blockLoc(CBlocks.EXPOSED_LUTRUM_PLATING));
        pressurePlateBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE, blockLoc(CBlocks.EXPOSED_LUTRUM_PLATING));
        buttonBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_BUTTON, blockLoc(CBlocks.EXPOSED_LUTRUM_PLATING));
        doorBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_DOOR, blockLoc(CBlocks.EXPOSED_LUTRUM_DOOR, "bottom"), blockLoc(CBlocks.EXPOSED_LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.WAXED_EXPOSED_LUTRUM_TRAPDOOR, blockLoc(CBlocks.EXPOSED_LUTRUM_TRAPDOOR), true, "cutout");
        simpleBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM.get(), models().cubeAll("weathered_lutrum", blockLoc(CBlocks.WEATHERED_LUTRUM)));
        simpleBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_SHEET_METAL.get(), models().cubeAll("weathered_lutrum_sheet_metal", blockLoc(CBlocks.WEATHERED_LUTRUM_SHEET_METAL)));
        simpleBlockWithItem(CBlocks.WAXED_WEATHERED_CHISELED_LUTRUM.get(), models().cubeColumn("weathered_chiseled_lutrum", blockLoc(CBlocks.WEATHERED_CHISELED_LUTRUM), blockLoc(CBlocks.WEATHERED_CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_GRATE.get(), models().cubeAll("weathered_lutrum_grate", blockLoc(CBlocks.WEATHERED_LUTRUM_GRATE)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_WINDOW.get(), models().cubeAll("weathered_lutrum_window", blockLoc(CBlocks.WEATHERED_LUTRUM_WINDOW)).renderType("translucent"));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.WAXED_WEATHERED_LUTRUM_BARS.get(), blockLoc(CBlocks.WEATHERED_LUTRUM_BARS), blockLoc(CBlocks.WEATHERED_LUTRUM_BARS), "cutout");
        simpleBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING.get(), models().cubeAll("weathered_lutrum_plating", blockLoc(CBlocks.WEATHERED_LUTRUM_PLATING)));
        stairsBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_STAIRS, blockLoc(CBlocks.WEATHERED_LUTRUM_PLATING));
        slabBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_SLAB, blockLoc(CBlocks.WEATHERED_LUTRUM_PLATING), blockLoc(CBlocks.WEATHERED_LUTRUM_PLATING));
        pressurePlateBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE, blockLoc(CBlocks.WEATHERED_LUTRUM_PLATING));
        buttonBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_BUTTON, blockLoc(CBlocks.WEATHERED_LUTRUM_PLATING));
        doorBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_DOOR, blockLoc(CBlocks.WEATHERED_LUTRUM_DOOR, "bottom"), blockLoc(CBlocks.WEATHERED_LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.WAXED_WEATHERED_LUTRUM_TRAPDOOR, blockLoc(CBlocks.WEATHERED_LUTRUM_TRAPDOOR), true, "cutout");
        simpleBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM.get(), models().cubeAll("oxidized_lutrum", blockLoc(CBlocks.OXIDIZED_LUTRUM)));
        simpleBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_SHEET_METAL.get(), models().cubeAll("oxidized_lutrum_sheet_metal", blockLoc(CBlocks.OXIDIZED_LUTRUM_SHEET_METAL)));
        simpleBlockWithItem(CBlocks.WAXED_OXIDIZED_CHISELED_LUTRUM.get(), models().cubeColumn("oxidized_chiseled_lutrum", blockLoc(CBlocks.OXIDIZED_CHISELED_LUTRUM), blockLoc(CBlocks.OXIDIZED_CHISELED_LUTRUM, "top")));
        simpleBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_GRATE.get(), models().cubeAll("oxidized_lutrum_grate", blockLoc(CBlocks.OXIDIZED_LUTRUM_GRATE)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_WINDOW.get(), models().cubeAll("oxidized_lutrum_window", blockLoc(CBlocks.OXIDIZED_LUTRUM_WINDOW)).renderType("translucent"));
        simpleBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING.get(), models().cubeAll("oxidized_lutrum_plating", blockLoc(CBlocks.OXIDIZED_LUTRUM_PLATING)));
        stairsBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_STAIRS, blockLoc(CBlocks.OXIDIZED_LUTRUM_PLATING));
        slabBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_SLAB, blockLoc(CBlocks.OXIDIZED_LUTRUM_PLATING), blockLoc(CBlocks.OXIDIZED_LUTRUM_PLATING));
        pressurePlateBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE, blockLoc(CBlocks.OXIDIZED_LUTRUM_PLATING));
        buttonBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_BUTTON, blockLoc(CBlocks.OXIDIZED_LUTRUM_PLATING));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.WAXED_OXIDIZED_LUTRUM_BARS.get(), blockLoc(CBlocks.OXIDIZED_LUTRUM_BARS), blockLoc(CBlocks.OXIDIZED_LUTRUM_BARS), "cutout");
        doorBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_DOOR, blockLoc(CBlocks.OXIDIZED_LUTRUM_DOOR, "bottom"), blockLoc(CBlocks.OXIDIZED_LUTRUM_DOOR, "top"), "cutout");
        trapDoorBlockWithItem(CBlocks.WAXED_OXIDIZED_LUTRUM_TRAPDOOR, blockLoc(CBlocks.OXIDIZED_LUTRUM_TRAPDOOR), true, "cutout");

        simpleBlockWithItem(CBlocks.OBDURIUM_GRATE.get(), models().cubeAll("obdurium_grate", blockLoc(CBlocks.OBDURIUM_GRATE)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.OBDURIUM_WINDOW.get(), models().cubeAll("obdurium_window", blockLoc(CBlocks.OBDURIUM_WINDOW)).renderType("translucent"));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.OBDURIUM_BARS.get(), blockLoc(CBlocks.OBDURIUM_BARS), blockLoc(CBlocks.OBDURIUM_BARS), "cutout");
        doorBlockWithItem(CBlocks.OBDURIUM_DOOR, blockLoc(CBlocks.OBDURIUM_DOOR, "bottom"), blockLoc(CBlocks.OBDURIUM_DOOR, "top"), "translucent");
        trapDoorBlockWithItem(CBlocks.OBDURIUM_TRAPDOOR, blockLoc(CBlocks.OBDURIUM_TRAPDOOR), true, "translucent");

        simpleBlockWithItem(CBlocks.MALUNITE_GRATE.get(), models().cubeAll("malunite_grate", blockLoc(CBlocks.MALUNITE_GRATE)).renderType("cutout"));
        simpleBlockWithItem(CBlocks.MALUNITE_WINDOW.get(), models().cubeAll("malunite_window", blockLoc(CBlocks.MALUNITE_WINDOW)).renderType("translucent"));
        paneBlockWithRenderType((IronBarsBlock) CBlocks.MALUNITE_BARS.get(), blockLoc(CBlocks.MALUNITE_BARS), blockLoc(CBlocks.MALUNITE_BARS), "cutout");
        doorBlockWithItem(CBlocks.MALUNITE_DOOR, blockLoc(CBlocks.MALUNITE_DOOR, "bottom"), blockLoc(CBlocks.MALUNITE_DOOR, "top"), "translucent");
        trapDoorBlockWithItem(CBlocks.MALUNITE_TRAPDOOR, blockLoc(CBlocks.MALUNITE_TRAPDOOR), true, "translucent");

        simpleBlock(CBlocks.POTTED_MAYURA_SAPLING.get(), models().withExistingParent(CBlocks.POTTED_MAYURA_SAPLING.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(CBlocks.MAYURA_SAPLING)).renderType("cutout"));
        simpleBlock(CBlocks.POTTED_GRIMWOOD_SAPLING.get(), models().withExistingParent(CBlocks.POTTED_GRIMWOOD_SAPLING.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(CBlocks.GRIMWOOD_SAPLING)).renderType("cutout"));
        simpleBlock(CBlocks.POTTED_VIVIAN.get(), models().withExistingParent(CBlocks.POTTED_VIVIAN.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(CBlocks.VIVIAN)).renderType("cutout"));
        simpleBlock(CBlocks.POTTED_WICKUL.get(), models().withExistingParent(CBlocks.POTTED_WICKUL.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(CBlocks.WICKUL)).renderType("cutout"));
        simpleBlock(CBlocks.POTTED_ICEFLOWER.get(), models().withExistingParent(CBlocks.POTTED_ICEFLOWER.getId().getPath(), mcLoc("flower_pot_cross")).texture("plant", blockLoc(CBlocks.ICEFLOWER)).renderType("cutout"));
    }

    /*
    Helpers
     */

    private void simpleBlock(DeferredBlock<? extends Block> block) {
        super.simpleBlock(block.get());
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }

    public void simpleBlockWithoutItem(DeferredBlock<? extends Block> block, ModelFile model) {
        super.simpleBlock(block.get(), model);
    }

    public void axisBlockWithItem(DeferredBlock<Block> block, ResourceLocation side, ResourceLocation end) {
        super.axisBlock((RotatedPillarBlock) block.get(), side, end);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }

    private void stairsBlockWithItem(DeferredBlock<Block> block, ResourceLocation texture) {
        super.stairsBlock((StairBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }

    private void slabBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation doubleSlab, ResourceLocation texture) {
        super.slabBlock((SlabBlock) block.get(), doubleSlab, texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }

    private void fenceBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.fenceBlock((FenceBlock) block.get(), texture);
        models().fenceInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }

    private void fenceGateBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.fenceGateBlock((FenceGateBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }

    private void pressurePlateBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.pressurePlateBlock((PressurePlateBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }

    public void buttonBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.buttonBlock((ButtonBlock) block.get(), texture);
        models().buttonInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }

    public void wallBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.wallBlock((WallBlock) block.get(), texture);
        models().wallInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }

    public void doorBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation bottom, ResourceLocation top) {
        super.doorBlock((DoorBlock) block.get(), bottom, top);
    }

    public void doorBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation bottom, ResourceLocation top, String renderType) {
        super.doorBlockWithRenderType((DoorBlock) block.get(), bottom, top, renderType);
    }

    public void trapDoorBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture, boolean orientable) {
        super.trapdoorBlock((TrapDoorBlock) block.get(), texture, orientable);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_bottom")));
    }

    public void trapDoorBlockWithItem(DeferredBlock<? extends Block> block, ResourceLocation texture, boolean orientable, String renderType) {
        super.trapdoorBlockWithRenderType((TrapDoorBlock) block.get(), texture, orientable, renderType);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_bottom")));
    }

    private ResourceLocation extend(ResourceLocation rl, String suffix) {
        return ResourceLocation.fromNamespaceAndPath(rl.getNamespace(), rl.getPath() + suffix);
    }

    private ResourceLocation blockLoc(DeferredBlock<? extends Block> block) {
        return modLoc("block/" + block.getId().getPath());
    }

    public ResourceLocation blockLoc(DeferredBlock<? extends Block> block, String suffix) {
        return modLoc("block/" + block.getId().getPath() + "_" + suffix);
    }

    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }
}