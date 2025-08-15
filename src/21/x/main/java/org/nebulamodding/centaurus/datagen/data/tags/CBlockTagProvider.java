package org.nebulamodding.centaurus.datagen.data.tags;

import org.nebulamodding.centaurus.Centaurus;
import org.nebulamodding.centaurus.registry.block.CBlocks;
import org.nebulamodding.centaurus.registry.CTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CBlockTagProvider extends BlockTagsProvider {
    public CBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Centaurus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // region Common Tag Lists
        // Lists with collections of blocks with multiple of the same tag to save on lines of code and make this file more readable
        final List<DeferredBlock<? extends Block>> silicateStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> blueschistOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> blueslateOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> karcassStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> waterIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> methaneIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> nitrogenIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> oxygenIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeStairs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeSlabs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeWalls = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stonePressurePlates = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stoneButtons = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> ices = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> needsStonePickaxe = new ArrayList<>();
        
        // region Ores
        silicateStoneOres.add(CBlocks.PLACEHOLDER_BLOCK); // Todo: add silicate stone ores
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_COAL_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_IRON_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_COPPER_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_GOLD_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_REDSTONE_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_EMERALD_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_LAPIS_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_DIAMOND_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_LUTRUM_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_OBDURIUM_ORE);
        //silicateStoneOres.add(CBlocks.SILICATE_STONE_MALUNITE_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_COAL_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_IRON_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_COPPER_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_GOLD_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_REDSTONE_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_EMERALD_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_LAPIS_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_DIAMOND_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_LUTRUM_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_OBDURIUM_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_MALUNITE_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_COAL_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_IRON_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_COPPER_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_GOLD_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_REDSTONE_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_EMERALD_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_LAPIS_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_DIAMOND_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_LUTRUM_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_OBDURIUM_ORE);
        blueslateOres.add(CBlocks.BLUESLATE_MALUNITE_ORE);
        karcassStoneOres.add(CBlocks.PLACEHOLDER_BLOCK); // Todo: add karcass stone ores
        //karcassStoneOres.add(CBlocks.KARCASS_COAL_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_IRON_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_COPPER_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_GOLD_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_REDSTONE_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_EMERALD_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_LAPIS_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_DIAMOND_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_LUTRUM_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_OBDURIUM_ORE);
        //karcassStoneOres.add(CBlocks.KARCASS_MALUNITE_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_COAL_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_IRON_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_COPPER_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_GOLD_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_REDSTONE_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_EMERALD_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_LAPIS_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_DIAMOND_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_LUTRUM_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_OBDURIUM_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_MALUNITE_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_COAL_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_IRON_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_COPPER_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_GOLD_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_REDSTONE_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_EMERALD_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_LAPIS_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_DIAMOND_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_LUTRUM_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_MALUNITE_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_COAL_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_IRON_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_COPPER_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_GOLD_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_REDSTONE_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_EMERALD_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_LAPIS_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_DIAMOND_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_LUTRUM_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_MALUNITE_ORE);
        // endregion

        // region Building Blocks
        // Silicate Stone
        pickaxeStairs.add(CBlocks.SILICATE_STONE_STAIRS);
        pickaxeStairs.add(CBlocks.SILICATE_COBBLESTONE_STAIRS);
        pickaxeStairs.add(CBlocks.POLISHED_SILICATE_STONE_STAIRS);
        pickaxeStairs.add(CBlocks.SILICATE_STONE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.SILICATE_STONE_SLAB);
        pickaxeSlabs.add(CBlocks.SILICATE_COBBLESTONE_SLAB);
        pickaxeSlabs.add(CBlocks.POLISHED_SILICATE_STONE_SLAB);
        pickaxeSlabs.add(CBlocks.SILICATE_STONE_BRICK_SLAB);
        pickaxeWalls.add(CBlocks.SILICATE_STONE_WALL);
        pickaxeWalls.add(CBlocks.SILICATE_COBBLESTONE_WALL);
        pickaxeWalls.add(CBlocks.POLISHED_SILICATE_STONE_WALL);
        pickaxeWalls.add(CBlocks.SILICATE_STONE_BRICK_WALL);
        stonePressurePlates.add(CBlocks.SILICATE_STONE_PRESSURE_PLATE);
        stoneButtons.add(CBlocks.SILICATE_STONE_BUTTON);
        // Frigus Mud
        pickaxeStairs.add(CBlocks.FRIGIAN_MUD_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.FRIGIAN_MUD_BRICK_SLAB);
        pickaxeWalls.add(CBlocks.FRIGIAN_MUD_BRICK_WALL);
        // Blueschist
        pickaxeStairs.add(CBlocks.BLUESCHIST_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_BLUESCHIST_STAIRS);
        pickaxeStairs.add(CBlocks.POLISHED_BLUESCHIST_STAIRS);
        pickaxeStairs.add(CBlocks.BLUESCHIST_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.BLUESCHIST_SLAB);
        pickaxeSlabs.add(CBlocks.COBBLED_BLUESCHIST_SLAB);
        pickaxeSlabs.add(CBlocks.POLISHED_BLUESCHIST_SLAB);
        pickaxeSlabs.add(CBlocks.BLUESCHIST_BRICK_SLAB);
        pickaxeWalls.add(CBlocks.BLUESCHIST_WALL);
        pickaxeWalls.add(CBlocks.COBBLED_BLUESCHIST_WALL);
        pickaxeWalls.add(CBlocks.POLISHED_BLUESCHIST_WALL);
        pickaxeWalls.add(CBlocks.BLUESCHIST_BRICK_WALL);
        stonePressurePlates.add(CBlocks.BLUESCHIST_PRESSURE_PLATE);
        stoneButtons.add(CBlocks.BLUESCHIST_BUTTON);
        // Blueslate
        pickaxeStairs.add(CBlocks.BLUESLATE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_BLUESLATE_STAIRS);
        pickaxeStairs.add(CBlocks.POLISHED_BLUESLATE_STAIRS);
        pickaxeStairs.add(CBlocks.BLUESLATE_BRICK_STAIRS);
        pickaxeStairs.add(CBlocks.BLUESLATE_TILE_STAIRS);
        pickaxeSlabs.add(CBlocks.BLUESLATE_SLAB);
        pickaxeSlabs.add(CBlocks.COBBLED_BLUESLATE_SLAB);
        pickaxeSlabs.add(CBlocks.POLISHED_BLUESLATE_SLAB);
        pickaxeSlabs.add(CBlocks.BLUESLATE_BRICK_SLAB);
        pickaxeSlabs.add(CBlocks.BLUESLATE_TILE_SLAB);
        pickaxeWalls.add(CBlocks.BLUESLATE_WALL);
        pickaxeWalls.add(CBlocks.COBBLED_BLUESLATE_WALL);
        pickaxeWalls.add(CBlocks.POLISHED_BLUESLATE_WALL);
        pickaxeWalls.add(CBlocks.BLUESLATE_BRICK_WALL);
        pickaxeWalls.add(CBlocks.BLUESLATE_TILE_WALL);
        // Permafrost
        pickaxeStairs.add(CBlocks.PERMAFROST_STAIRS);
        pickaxeStairs.add(CBlocks.POLISHED_PERMAFROST_STAIRS);
        pickaxeStairs.add(CBlocks.PERMAFROST_BRICK_STAIRS);
        pickaxeStairs.add(CBlocks.PERMAFROST_TILE_STAIRS);
        pickaxeSlabs.add(CBlocks.PERMAFROST_SLAB);
        pickaxeSlabs.add(CBlocks.POLISHED_PERMAFROST_SLAB);
        pickaxeSlabs.add(CBlocks.PERMAFROST_BRICK_SLAB);
        pickaxeSlabs.add(CBlocks.PERMAFROST_TILE_SLAB);
        pickaxeWalls.add(CBlocks.PERMAFROST_WALL);
        pickaxeWalls.add(CBlocks.POLISHED_PERMAFROST_WALL);
        pickaxeWalls.add(CBlocks.PERMAFROST_BRICK_WALL);
        pickaxeWalls.add(CBlocks.PERMAFROST_TILE_WALL);
        // Karcass Stone
        pickaxeStairs.add(CBlocks.KARCASS_STONE_STAIRS);
        pickaxeStairs.add(CBlocks.KARCASS_COBBLESTONE_STAIRS);
        pickaxeStairs.add(CBlocks.POLISHED_KARCASS_STONE_STAIRS);
        pickaxeStairs.add(CBlocks.KARCASS_STONE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.KARCASS_STONE_SLAB);
        pickaxeSlabs.add(CBlocks.KARCASS_COBBLESTONE_SLAB);
        pickaxeSlabs.add(CBlocks.POLISHED_KARCASS_STONE_SLAB);
        pickaxeSlabs.add(CBlocks.KARCASS_STONE_BRICK_SLAB);
        pickaxeWalls.add(CBlocks.KARCASS_STONE_WALL);
        pickaxeWalls.add(CBlocks.KARCASS_COBBLESTONE_WALL);
        pickaxeWalls.add(CBlocks.POLISHED_KARCASS_STONE_WALL);
        pickaxeWalls.add(CBlocks.KARCASS_STONE_BRICK_WALL);
        stonePressurePlates.add(CBlocks.KARCASS_STONE_PRESSURE_PLATE);
        stoneButtons.add(CBlocks.KARCASS_STONE_BUTTON);
        // endregion

        // region Needs Stone Pickaxe
        needsStonePickaxe.add(CBlocks.LUTRUM_BLOCK);
        needsStonePickaxe.add(CBlocks.LUTRUM_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.CHISELED_LUTRUM);
        needsStonePickaxe.add(CBlocks.LUTRUM_GRATE);
        needsStonePickaxe.add(CBlocks.LUTRUM_WINDOW);
        needsStonePickaxe.add(CBlocks.LUTRUM_PLATING);
        needsStonePickaxe.add(CBlocks.LUTRUM_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.LUTRUM_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.LUTRUM_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.LUTRUM_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.LUTRUM_PILLAR);
        needsStonePickaxe.add(CBlocks.LUTRUM_BARS);
        needsStonePickaxe.add(CBlocks.LUTRUM_DOOR);
        needsStonePickaxe.add(CBlocks.LUTRUM_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.LUTRUM_BULB);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.EXPOSED_CHISELED_LUTRUM);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_GRATE);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_WINDOW);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_PLATING);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_PILLAR);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_BARS);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_DOOR);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.EXPOSED_LUTRUM_BULB);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.WEATHERED_CHISELED_LUTRUM);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_GRATE);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_WINDOW);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_PLATING);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_PILLAR);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_BARS);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_DOOR);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.WEATHERED_LUTRUM_BULB);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.OXIDIZED_CHISELED_LUTRUM);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_GRATE);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_WINDOW);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_PLATING);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_PILLAR);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_BARS);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_DOOR);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.OXIDIZED_LUTRUM_BULB);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_BLOCK);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.WAXED_CHISELED_LUTRUM);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_GRATE);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_WINDOW);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_PLATING);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_PILLAR);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_BARS);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_DOOR);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.WAXED_LUTRUM_BULB);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_CHISELED_LUTRUM);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_GRATE);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_WINDOW);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_PILLAR);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_BARS);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_DOOR);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.WAXED_EXPOSED_LUTRUM_BULB);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_CHISELED_LUTRUM);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_GRATE);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_WINDOW);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_PILLAR);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_BARS);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_DOOR);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.WAXED_WEATHERED_LUTRUM_BULB);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_CHISELED_LUTRUM);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_GRATE);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_WINDOW);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_PILLAR);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_BARS);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_DOOR);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.WAXED_OXIDIZED_LUTRUM_BULB);
        needsStonePickaxe.add(CBlocks.RAW_LUTRUM_BLOCK);
        needsStonePickaxe.add(CBlocks.LUTRUM_AMALGAMATE_BLOCK);
        needsStonePickaxe.add(CBlocks.OBDURIUM_BLOCK);
        needsStonePickaxe.add(CBlocks.CHISELED_OBDURIUM);
        needsStonePickaxe.add(CBlocks.OBDURIUM_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.OBDURIUM_GRATE);
        needsStonePickaxe.add(CBlocks.OBDURIUM_WINDOW);
        needsStonePickaxe.add(CBlocks.OBDURIUM_PLATING);
        needsStonePickaxe.add(CBlocks.OBDURIUM_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.OBDURIUM_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.OBDURIUM_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.OBDURIUM_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.OBDURIUM_PILLAR);
        needsStonePickaxe.add(CBlocks.OBDURIUM_BARS);
        needsStonePickaxe.add(CBlocks.OBDURIUM_DOOR);
        needsStonePickaxe.add(CBlocks.OBDURIUM_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.OBDURIUM_BULB);
        needsStonePickaxe.add(CBlocks.RAW_OBDURIUM_BLOCK);
        needsStonePickaxe.add(CBlocks.MALUNITE_BLOCK);
        needsStonePickaxe.add(CBlocks.CHISELED_MALUNITE);
        needsStonePickaxe.add(CBlocks.MALUNITE_SHEET_METAL);
        needsStonePickaxe.add(CBlocks.MALUNITE_GRATE);
        needsStonePickaxe.add(CBlocks.MALUNITE_WINDOW);
        needsStonePickaxe.add(CBlocks.MALUNITE_PLATING);
        needsStonePickaxe.add(CBlocks.MALUNITE_PLATING_STAIRS);
        needsStonePickaxe.add(CBlocks.MALUNITE_PLATING_SLAB);
        needsStonePickaxe.add(CBlocks.MALUNITE_PLATING_PRESSURE_PLATE);
        needsStonePickaxe.add(CBlocks.MALUNITE_PLATING_BUTTON);
        needsStonePickaxe.add(CBlocks.MALUNITE_PILLAR);
        needsStonePickaxe.add(CBlocks.MALUNITE_BARS);
        needsStonePickaxe.add(CBlocks.MALUNITE_DOOR);
        needsStonePickaxe.add(CBlocks.MALUNITE_TRAPDOOR);
        needsStonePickaxe.add(CBlocks.MALUNITE_BULB);
        needsStonePickaxe.add(CBlocks.RAW_MALUNITE_BLOCK);
        // endregion
        // endregion

        // region Tool Tags
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_SHOVEL)
                .add(CBlocks.FRIGIAN_GRASS_BLOCK.get())
                .add(CBlocks.FRIGIAN_DIRT_PATH.get())
                .add(CBlocks.FRIGIAN_DIRT.get())
                .add(CBlocks.COARSE_FRIGIAN_DIRT.get())
                .add(CBlocks.FRIGIAN_FARMLAND.get())
                .add(CBlocks.FRIGIAN_MUD.get())
        ;
        silicateStoneOres.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        blueschistOres.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        blueslateOres.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        karcassStoneOres.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        waterIceOres.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        nitrogenIceOres.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        oxygenIceOres.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeStairs.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeSlabs.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        stonePressurePlates.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        needsStonePickaxe.forEach(entry -> tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE)
                // Silicate Stone
                .add(CBlocks.SILICATE_STONE.get())
                .add(CBlocks.SILICATE_COBBLESTONE.get())
                .add(CBlocks.CHISELED_SILICATE_STONE.get())
                .add(CBlocks.POLISHED_SILICATE_STONE.get())
                .add(CBlocks.SILICATE_STONE_BRICKS.get())
                .add(CBlocks.CRACKED_SILICATE_STONE_BRICKS.get())
                .add(CBlocks.SILICATE_STONE_PILLAR.get())
                // Blueschist
                .add(CBlocks.BLUESCHIST.get())
                .add(CBlocks.COBBLED_BLUESCHIST.get())
                .add(CBlocks.CHISELED_BLUESCHIST.get())
                .add(CBlocks.POLISHED_BLUESCHIST.get())
                .add(CBlocks.BLUESCHIST_BRICKS.get())
                .add(CBlocks.CRACKED_BLUESCHIST_BRICKS.get())
                .add(CBlocks.BLUESCHIST_PILLAR.get())
                // Blueslate
                .add(CBlocks.BLUESLATE.get())
                .add(CBlocks.COBBLED_BLUESLATE.get())
                .add(CBlocks.CHISELED_BLUESLATE.get())
                .add(CBlocks.POLISHED_BLUESLATE.get())
                .add(CBlocks.BLUESLATE_BRICKS.get())
                .add(CBlocks.CRACKED_BLUESLATE_BRICKS.get())
                .add(CBlocks.BLUESLATE_TILES.get())
                .add(CBlocks.BLUESLATE_PILLAR.get())
                // Permafrost
                .add(CBlocks.PERMAFROST.get())
                .add(CBlocks.CHISELED_PERMAFROST.get())
                .add(CBlocks.POLISHED_PERMAFROST.get())
                .add(CBlocks.PERMAFROST_BRICKS.get())
                .add(CBlocks.CRACKED_PERMAFROST_BRICKS.get())
                .add(CBlocks.PERMAFROST_TILES.get())
                .add(CBlocks.PERMAFROST_PILLAR.get())
                // Karcass Stone
                .add(CBlocks.KARCASS_STONE.get())
                .add(CBlocks.KARCASS_COBBLESTONE.get())
                .add(CBlocks.CHISELED_KARCASS_STONE.get())
                .add(CBlocks.POLISHED_KARCASS_STONE.get())
                .add(CBlocks.KARCASS_STONE_BRICKS.get())
                .add(CBlocks.CRACKED_KARCASS_STONE_BRICKS.get())
                .add(CBlocks.KARCASS_STONE_PILLAR.get())
                // Plating
                .add(CBlocks.MALUNITE_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.MALUNITE_PLATING_BUTTON.get())
                // Miscellaneous
                .add(CBlocks.PACKED_FRIGIAN_MUD.get())
                .add(CBlocks.FRIGIAN_MUD_BRICKS.get())
        ;
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_AXE)
                .add(CBlocks.FRIGIAN_SHORT_GRASS.get())
                .add(CBlocks.SHORT_GRISTLES.get())
                .add(CBlocks.TALL_GRISTLES.get())
                .add(CBlocks.MAYURA_LOG.get())
                .add(CBlocks.MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(CBlocks.MAYURA_PLANKS.get())
                .add(CBlocks.MAYURA_FENCE_GATE.get())
                .add(CBlocks.GRIMWOOD_LOG.get())
                .add(CBlocks.GRIMWOOD_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
                .add(CBlocks.GRIMWOOD_PLANKS.get())
                .add(CBlocks.GRIMWOOD_FENCE_GATE.get())
        ;
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_HOE)
                .add(CBlocks.MAYURA_LEAVES.get())
                .add(CBlocks.GRIMWOOD_LEAVES.get())
                .add(CBlocks.BRUMA_BLOCK.get())
        ;
        tag(net.minecraft.tags.BlockTags.SWORD_EFFICIENT)
                .add(CBlocks.FRIGIAN_SHORT_GRASS.get())
                .add(CBlocks.SHORT_GRISTLES.get())
                .add(CBlocks.TALL_GRISTLES.get())
        ;
        needsStonePickaxe.forEach(entry -> tag(BlockTags.NEEDS_STONE_TOOL).add(entry.get()));
        tag(net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL)
                .add(CBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(CBlocks.BLUESCHIST_IRON_ORE.get())
                .add(CBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(CBlocks.BLUESCHIST_LUTRUM_ORE.get())
                .add(CBlocks.BLUESLATE_COPPER_ORE.get())
                .add(CBlocks.BLUESLATE_IRON_ORE.get())
                .add(CBlocks.BLUESLATE_LAPIS_ORE.get())
                .add(CBlocks.BLUESLATE_LUTRUM_ORE.get())
                .add(CBlocks.WATER_ICE_COPPER_ORE.get())
                .add(CBlocks.WATER_ICE_IRON_ORE.get())
                .add(CBlocks.WATER_ICE_LAPIS_ORE.get())
                .add(CBlocks.WATER_ICE_LUTRUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.NITROGEN_ICE_IRON_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LUTRUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.OXYGEN_ICE_IRON_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LUTRUM_ORE.get())
        ;
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL)
                .add(CBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(CBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(CBlocks.BLUESCHIST_EMERALD_ORE.get())
                .add(CBlocks.BLUESCHIST_DIAMOND_ORE.get())
                .add(CBlocks.BLUESCHIST_OBDURIUM_ORE.get())
                .add(CBlocks.BLUESCHIST_MALUNITE_ORE.get())
                .add(CBlocks.BLUESLATE_GOLD_ORE.get())
                .add(CBlocks.BLUESLATE_REDSTONE_ORE.get())
                .add(CBlocks.BLUESLATE_EMERALD_ORE.get())
                .add(CBlocks.BLUESLATE_DIAMOND_ORE.get())
                .add(CBlocks.BLUESLATE_OBDURIUM_ORE.get())
                .add(CBlocks.BLUESLATE_MALUNITE_ORE.get())
                .add(CBlocks.WATER_ICE_GOLD_ORE.get())
                .add(CBlocks.WATER_ICE_REDSTONE_ORE.get())
                .add(CBlocks.WATER_ICE_EMERALD_ORE.get())
                .add(CBlocks.WATER_ICE_DIAMOND_ORE.get())
                .add(CBlocks.WATER_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.WATER_ICE_MALUNITE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_MALUNITE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_MALUNITE_ORE.get())
        ;
        tag(net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL)
        ;
        tag(net.minecraft.tags.BlockTags.INCORRECT_FOR_WOODEN_TOOL)
        ;
        tag(net.minecraft.tags.BlockTags.INCORRECT_FOR_STONE_TOOL)
        ;
        tag(net.minecraft.tags.BlockTags.INCORRECT_FOR_IRON_TOOL)
        ;
        tag(net.minecraft.tags.BlockTags.INCORRECT_FOR_GOLD_TOOL)
        ;
        tag(net.minecraft.tags.BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
        ;
        // endregion

        //region Tree Tags
        tag(net.minecraft.tags.BlockTags.LEAVES)
                .add(CBlocks.MAYURA_LEAVES.get())
                .add(CBlocks.GRIMWOOD_LEAVES.get())
        ;
        tag(net.minecraft.tags.BlockTags.LOGS)
                .add(CBlocks.MAYURA_LOG.get())
                .add(CBlocks.MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(CBlocks.GRIMWOOD_LOG.get())
                .add(CBlocks.GRIMWOOD_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        tag(Tags.Blocks.STRIPPED_LOGS)
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
        ;
        tag(Tags.Blocks.STRIPPED_WOODS)
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        tag(net.minecraft.tags.BlockTags.LOGS_THAT_BURN)
                .add(CBlocks.MAYURA_LOG.get())
                .add(CBlocks.MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(CBlocks.GRIMWOOD_LOG.get())
                .add(CBlocks.GRIMWOOD_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        tag(net.minecraft.tags.BlockTags.PLANKS)
                .add(CBlocks.MAYURA_PLANKS.get())
                .add(CBlocks.GRIMWOOD_PLANKS.get())
        ;
        tag(CTags.BlockTags.MAYURA_LOGS)
                .add(CBlocks.MAYURA_LOG.get())
                .add(CBlocks.MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
        ;
        tag(CTags.BlockTags.GRIMWOOD_LOGS)
                .add(CBlocks.GRIMWOOD_LOG.get())
                .add(CBlocks.GRIMWOOD_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        // endregion

        // region Plant Tags
        tag(net.minecraft.tags.BlockTags.REPLACEABLE_BY_TREES)
                .add(CBlocks.FRIGIAN_SHORT_GRASS.get())
                .add(CBlocks.SHORT_GRISTLES.get())
                .add(CBlocks.TALL_GRISTLES.get())
        ;
        tag(net.minecraft.tags.BlockTags.SAPLINGS)
                .add(CBlocks.MAYURA_SAPLING.get())
                .add(CBlocks.GRIMWOOD_SAPLING.get())
        ;
        tag(net.minecraft.tags.BlockTags.SMALL_FLOWERS)
                .add(CBlocks.VIVIAN.get())
                .add(CBlocks.WICKUL.get())
                .add(CBlocks.ICEFLOWER.get())
        ;
        tag(net.minecraft.tags.BlockTags.TALL_FLOWERS)
        ;
        tag(net.minecraft.tags.BlockTags.FLOWER_POTS)
                .add(CBlocks.POTTED_VIVIAN.get())
                .add(CBlocks.POTTED_WICKUL.get())
                .add(CBlocks.POTTED_ICEFLOWER.get())
        ;
        // endregion

        // region Soil Tags
        tag(net.minecraft.tags.BlockTags.DIRT)
                .add(CBlocks.FRIGIAN_GRASS_BLOCK.get())
                .add(CBlocks.FRIGIAN_DIRT.get())
                .add(CBlocks.COARSE_FRIGIAN_DIRT.get())
                .add(CBlocks.FRIGIAN_MUD.get())
                .add(CBlocks.GRISTLED_FLESH.get())
        ;
        tag(CTags.BlockTags.CONVERTABLE_TO_FRIGUS_MUD)
                .add(CBlocks.FRIGIAN_DIRT.get())
                .add(CBlocks.COARSE_FRIGIAN_DIRT.get())
        ;
        tag(net.minecraft.tags.BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(CBlocks.FRIGIAN_GRASS_BLOCK.get())
                .add(CBlocks.GRISTLED_FLESH.get())
                .add(CBlocks.GRISTLE_BLOCK.get())
        ;
        tag(net.minecraft.tags.BlockTags.SNIFFER_DIGGABLE_BLOCK)
                .add(CBlocks.FRIGIAN_GRASS_BLOCK.get())
                .add(CBlocks.FRIGIAN_DIRT.get())
                .add(CBlocks.COARSE_FRIGIAN_DIRT.get())
        ;
        tag(net.minecraft.tags.BlockTags.VALID_SPAWN)
                .add(CBlocks.FRIGIAN_GRASS_BLOCK.get())
                .add(CBlocks.GRISTLED_FLESH.get())
                .add(CBlocks.GRISTLE_BLOCK.get())
        ;
        tag(Tags.Blocks.VILLAGER_FARMLANDS)
                .add(CBlocks.FRIGIAN_FARMLAND.get())
        ;
        // endregion

        // region Stone Tags
        tag(Tags.Blocks.STONES)
                .add(CBlocks.SILICATE_STONE.get())
                .add(CBlocks.BLUESCHIST.get())
                .add(CBlocks.BLUESLATE.get())
                .add(CBlocks.PERMAFROST.get())
                .add(CBlocks.KARCASS_STONE.get())
        ;
        tag(Tags.Blocks.COBBLESTONES)
                .addTag(CTags.BlockTags.COBBLESTONES_SILICATE_STONE)
                .addTag(CTags.BlockTags.COBBLESTONES_BLUESCHIST)
                .addTag(CTags.BlockTags.COBBLESTONES_BLUESLATE)
                .addTag(CTags.BlockTags.COBBLESTONES_KARCASS_STONE)
        ;
        tag(CTags.BlockTags.COBBLESTONES_SILICATE_STONE)
                .add(CBlocks.SILICATE_COBBLESTONE.get())
        ;
        tag(CTags.BlockTags.COBBLESTONES_BLUESCHIST)
                .add(CBlocks.COBBLED_BLUESCHIST.get())
        ;
        tag(CTags.BlockTags.COBBLESTONES_BLUESLATE)
                .add(CBlocks.COBBLED_BLUESLATE.get())
        ;
        tag(CTags.BlockTags.COBBLESTONES_KARCASS_STONE)
                .add(CBlocks.KARCASS_COBBLESTONE.get())
        ;

        // Base Stone Tags
        tag(CTags.BlockTags.BASE_STONE_FRIGUS)
                .add(CBlocks.BLUESCHIST.get())
                .add(CBlocks.BLUESLATE.get())
                .add(CBlocks.PERMAFROST.get())
        ;
        // endregion

        // region Ore Tags
        tag(net.minecraft.tags.BlockTags.COAL_ORES)
                .add(CBlocks.BLUESCHIST_COAL_ORE.get())
                .add(CBlocks.BLUESLATE_COAL_ORE.get())
                .add(CBlocks.WATER_ICE_COAL_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COAL_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COAL_ORE.get())
        ;
        tag(net.minecraft.tags.BlockTags.IRON_ORES)
                .add(CBlocks.BLUESCHIST_IRON_ORE.get())
                .add(CBlocks.BLUESLATE_IRON_ORE.get())
                .add(CBlocks.WATER_ICE_IRON_ORE.get())
                .add(CBlocks.NITROGEN_ICE_IRON_ORE.get())
                .add(CBlocks.OXYGEN_ICE_IRON_ORE.get())
        ;
        tag(net.minecraft.tags.BlockTags.COPPER_ORES)
                .add(CBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(CBlocks.BLUESLATE_COPPER_ORE.get())
                .add(CBlocks.WATER_ICE_COPPER_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COPPER_ORE.get())
        ;
        tag(net.minecraft.tags.BlockTags.GOLD_ORES)
                .add(CBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(CBlocks.BLUESLATE_GOLD_ORE.get())
                .add(CBlocks.WATER_ICE_GOLD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_GOLD_ORE.get())
        ;
        tag(net.minecraft.tags.BlockTags.REDSTONE_ORES)
                .add(CBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(CBlocks.BLUESLATE_REDSTONE_ORE.get())
                .add(CBlocks.WATER_ICE_REDSTONE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_REDSTONE_ORE.get())
        ;
        tag(net.minecraft.tags.BlockTags.EMERALD_ORES)
                .add(CBlocks.BLUESCHIST_EMERALD_ORE.get())
                .add(CBlocks.BLUESLATE_EMERALD_ORE.get())
                .add(CBlocks.WATER_ICE_EMERALD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_EMERALD_ORE.get())
        ;
        tag(net.minecraft.tags.BlockTags.LAPIS_ORES)
                .add(CBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(CBlocks.BLUESLATE_LAPIS_ORE.get())
                .add(CBlocks.WATER_ICE_LAPIS_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LAPIS_ORE.get())
        ;
        tag(net.minecraft.tags.BlockTags.DIAMOND_ORES)
                .add(CBlocks.BLUESCHIST_DIAMOND_ORE.get())
                .add(CBlocks.BLUESLATE_DIAMOND_ORE.get())
                .add(CBlocks.WATER_ICE_DIAMOND_ORE.get())
                .add(CBlocks.NITROGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.OXYGEN_ICE_DIAMOND_ORE.get())
        ;
        tag(CTags.BlockTags.ORES_LUTRUM)
                .add(CBlocks.BLUESCHIST_LUTRUM_ORE.get())
                .add(CBlocks.BLUESLATE_LUTRUM_ORE.get())
                .add(CBlocks.WATER_ICE_LUTRUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LUTRUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LUTRUM_ORE.get())
        ;
        tag(CTags.BlockTags.LUTRUM_CHESTS)
                //.add(CBlocks.LUTRUM_CHEST.get())
                //.add(CBlocks.EXPOSED_LUTRUM_CHEST.get())
                //.add(CBlocks.WEATHERED_LUTRUM_CHEST.get())
                //.add(CBlocks.OXIDIZED_LUTRUM_CHEST.get())
                //.add(CBlocks.WAXED_LUTRUM_CHEST.get())
                //.add(CBlocks.WAXED_EXPOSED_LUTRUM_CHEST.get())
                //.add(CBlocks.WAXED_WEATHERED_LUTRUM_CHEST.get())
                //.add(CBlocks.WAXED_OXIDIZED_LUTRUM_CHEST.get())
        ;
        tag(CTags.BlockTags.LUTRUM)
                .add(CBlocks.LUTRUM_BLOCK.get())
                .add(CBlocks.EXPOSED_LUTRUM.get())
                .add(CBlocks.WEATHERED_LUTRUM.get())
                .add(CBlocks.OXIDIZED_LUTRUM.get())
                .add(CBlocks.WAXED_LUTRUM_BLOCK.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM.get())
        ;
        tag(CTags.BlockTags.LUTRUM_GOLEM_STATUES)
                //.add(CBlocks.LUTRUM_GOLEM_STATUE.get())
                //.add(CBlocks.EXPOSED_LUTRUM_GOLEM_STATUE.get())
                //.add(CBlocks.WEATHERED_LUTRUM_GOLEM_STATUE.get())
                //.add(CBlocks.OXIDIZED_LUTRUM_GOLEM_STATUE.get())
                //.add(CBlocks.WAXED_LUTRUM_GOLEM_STATUE.get())
                //.add(CBlocks.WAXED_EXPOSED_LUTRUM_GOLEM_STATUE.get())
                //.add(CBlocks.WAXED_WEATHERED_LUTRUM_GOLEM_STATUE.get())
                //.add(CBlocks.WAXED_OXIDIZED_LUTRUM_GOLEM_STATUE.get())
        ;
        tag(CTags.BlockTags.ORES_OBDURIUM)
                .add(CBlocks.BLUESCHIST_OBDURIUM_ORE.get())
                .add(CBlocks.BLUESLATE_OBDURIUM_ORE.get())
                .add(CBlocks.WATER_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE.get())
        ;
        tag(CTags.BlockTags.ORES_MALUNITE)
                .add(CBlocks.BLUESCHIST_MALUNITE_ORE.get())
                .add(CBlocks.BLUESLATE_MALUNITE_ORE.get())
                .add(CBlocks.WATER_ICE_MALUNITE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_MALUNITE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_MALUNITE_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_DENSE)
                .add(CBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(CBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(CBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(CBlocks.BLUESCHIST_LUTRUM_ORE.get())
                .add(CBlocks.BLUESLATE_COPPER_ORE.get())
                .add(CBlocks.BLUESLATE_REDSTONE_ORE.get())
                .add(CBlocks.BLUESLATE_LAPIS_ORE.get())
                .add(CBlocks.BLUESLATE_LUTRUM_ORE.get())
                .add(CBlocks.WATER_ICE_COPPER_ORE.get())
                .add(CBlocks.WATER_ICE_REDSTONE_ORE.get())
                .add(CBlocks.WATER_ICE_LAPIS_ORE.get())
                .add(CBlocks.WATER_ICE_LUTRUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.NITROGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LUTRUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.OXYGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LUTRUM_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_SINGULAR)
                .add(CBlocks.BLUESCHIST_COAL_ORE.get())
                .add(CBlocks.BLUESCHIST_IRON_ORE.get())
                .add(CBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(CBlocks.BLUESCHIST_EMERALD_ORE.get())
                .add(CBlocks.BLUESCHIST_DIAMOND_ORE.get())
                .add(CBlocks.BLUESCHIST_OBDURIUM_ORE.get())
                .add(CBlocks.BLUESCHIST_MALUNITE_ORE.get())
                .add(CBlocks.BLUESLATE_COAL_ORE.get())
                .add(CBlocks.BLUESLATE_IRON_ORE.get())
                .add(CBlocks.BLUESLATE_GOLD_ORE.get())
                .add(CBlocks.BLUESLATE_EMERALD_ORE.get())
                .add(CBlocks.BLUESLATE_DIAMOND_ORE.get())
                .add(CBlocks.BLUESLATE_OBDURIUM_ORE.get())
                .add(CBlocks.BLUESLATE_MALUNITE_ORE.get())
                .add(CBlocks.WATER_ICE_COAL_ORE.get())
                .add(CBlocks.WATER_ICE_IRON_ORE.get())
                .add(CBlocks.WATER_ICE_GOLD_ORE.get())
                .add(CBlocks.WATER_ICE_EMERALD_ORE.get())
                .add(CBlocks.WATER_ICE_DIAMOND_ORE.get())
                .add(CBlocks.WATER_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.WATER_ICE_MALUNITE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COAL_ORE.get())
                .add(CBlocks.NITROGEN_ICE_IRON_ORE.get())
                .add(CBlocks.NITROGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_MALUNITE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COAL_ORE.get())
                .add(CBlocks.OXYGEN_ICE_IRON_ORE.get())
                .add(CBlocks.OXYGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_MALUNITE_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_SPARSE)
        ;
        tag(CTags.BlockTags.ORE_BEARING_GROUND_SILICATE_STONE)
                .add(CBlocks.SILICATE_STONE.get())
        ;
        tag(CTags.BlockTags.SILICATE_STONE_ORE_REPLACEABLES)
                .add(CBlocks.SILICATE_STONE.get())
        ;
        tag(CTags.BlockTags.ORE_BEARING_GROUND_BLUESCHIST)
                .add(CBlocks.BLUESCHIST.get())
        ;
        tag(CTags.BlockTags.BLUESCHIST_ORE_REPLACEABLES)
                .add(CBlocks.BLUESCHIST.get())
                .add(CBlocks.PERMAFROST.get())
        ;
        tag(CTags.BlockTags.ORE_BEARING_GROUND_BLUESLATE)
                .add(CBlocks.BLUESLATE.get())
        ;
        tag(CTags.BlockTags.BLUESLATE_ORE_REPLACEABLES)
                .add(CBlocks.BLUESLATE.get())
        ;
        tag(CTags.BlockTags.ORE_BEARING_GROUND_KARCASS_STONE)
                .add(CBlocks.KARCASS_STONE.get())
        ;
        tag(CTags.BlockTags.KARCASS_STONE_ORE_REPLACEABLES)
                .add(CBlocks.KARCASS_STONE.get())
        ;
        tag(CTags.BlockTags.ORE_BEARING_GROUND_WATER_ICE)
        ;
        tag(CTags.BlockTags.ORE_BEARING_GROUND_NITROGEN_ICE)
        ;
        tag(CTags.BlockTags.ORE_BEARING_GROUND_OXYGEN_ICE)
        ;
        silicateStoneOres.forEach(entry -> tag(CTags.BlockTags.ORES_IN_GROUND_SILICATE_STONE).add(entry.get()));
        blueschistOres.forEach(entry -> tag(CTags.BlockTags.ORES_IN_GROUND_BLUESCHIST).add(entry.get()));
        blueslateOres.forEach(entry -> tag(CTags.BlockTags.ORES_IN_GROUND_BLUESLATE).add(entry.get()));
        karcassStoneOres.forEach(entry -> tag(CTags.BlockTags.ORES_IN_GROUND_KARCASS_STONE).add(entry.get()));
        waterIceOres.forEach(entry -> tag(CTags.BlockTags.ORES_IN_GROUND_WATER_ICE).add(entry.get()));
        nitrogenIceOres.forEach(entry -> tag(CTags.BlockTags.ORES_IN_GROUND_NITROGEN_ICE).add(entry.get()));
        oxygenIceOres.forEach(entry -> tag(CTags.BlockTags.ORES_IN_GROUND_OXYGEN_ICE).add(entry.get()));
        // endregion

        // region Carver Replaceable Tags
        tag(CTags.BlockTags.FRIGUS_CARVER_REPLACEABLES)
                .addTag(CTags.BlockTags.BASE_STONE_FRIGUS)
                .addTag(net.minecraft.tags.BlockTags.DIRT)
                .addTag(net.minecraft.tags.BlockTags.SAND)
                .addTag(net.minecraft.tags.BlockTags.COPPER_ORES)
                .addTag(net.minecraft.tags.BlockTags.IRON_ORES)
                .addTag(net.minecraft.tags.BlockTags.SNOW)
                .add(Blocks.PACKED_ICE)
                .add(Blocks.RAW_COPPER_BLOCK)
                .add(Blocks.RAW_IRON_BLOCK)
                .add(Blocks.WATER)
        ;
        // endregion

        // region Block Variant Tags
        pickaxeStairs.forEach(entry -> tag(net.minecraft.tags.BlockTags.STAIRS).add(entry.get()));
        tag(net.minecraft.tags.BlockTags.STAIRS)
                .add(CBlocks.LUTRUM_PLATING_STAIRS.get())
                .add(CBlocks.EXPOSED_LUTRUM_PLATING_STAIRS.get())
                .add(CBlocks.WEATHERED_LUTRUM_PLATING_STAIRS.get())
                .add(CBlocks.OXIDIZED_LUTRUM_PLATING_STAIRS.get())
                .add(CBlocks.WAXED_LUTRUM_PLATING_STAIRS.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_STAIRS.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_STAIRS.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_STAIRS.get())
                .add(CBlocks.OBDURIUM_PLATING_STAIRS.get())
                .add(CBlocks.MALUNITE_PLATING_STAIRS.get())
        ;
        tag(net.minecraft.tags.BlockTags.WOODEN_STAIRS)
                .add(CBlocks.MAYURA_STAIRS.get())
                .add(CBlocks.GRIMWOOD_STAIRS.get())
        ;
        pickaxeSlabs.forEach(entry -> tag(net.minecraft.tags.BlockTags.SLABS).add(entry.get()));
        tag(net.minecraft.tags.BlockTags.SLABS)
                .add(CBlocks.LUTRUM_PLATING_SLAB.get())
                .add(CBlocks.EXPOSED_LUTRUM_PLATING_SLAB.get())
                .add(CBlocks.WEATHERED_LUTRUM_PLATING_SLAB.get())
                .add(CBlocks.OXIDIZED_LUTRUM_PLATING_SLAB.get())
                .add(CBlocks.WAXED_LUTRUM_PLATING_SLAB.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_SLAB.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_SLAB.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_SLAB.get())
                .add(CBlocks.OBDURIUM_PLATING_SLAB.get())
                .add(CBlocks.MALUNITE_PLATING_SLAB.get())
        ;
        tag(net.minecraft.tags.BlockTags.WOODEN_SLABS)
                .add(CBlocks.MAYURA_SLAB.get())
                .add(CBlocks.GRIMWOOD_SLAB.get())
        ;
        tag(net.minecraft.tags.BlockTags.FENCES)
        ;
        tag(net.minecraft.tags.BlockTags.WOODEN_FENCES)
                .add(CBlocks.MAYURA_FENCE.get())
                .add(CBlocks.GRIMWOOD_FENCE.get())
        ;
        tag(net.minecraft.tags.BlockTags.FENCE_GATES)
                .add(CBlocks.MAYURA_FENCE_GATE.get())
                .add(CBlocks.GRIMWOOD_FENCE_GATE.get())
        ;
        tag(Tags.Blocks.FENCE_GATES)
        ;
        tag(Tags.Blocks.FENCE_GATES_WOODEN)
                .add(CBlocks.MAYURA_FENCE_GATE.get())
                .add(CBlocks.GRIMWOOD_FENCE_GATE.get())
        ;
        pickaxeWalls.forEach(entry -> tag(net.minecraft.tags.BlockTags.WALLS).add(entry.get()));
        tag(net.minecraft.tags.BlockTags.WALLS)
        ;
        tag(net.minecraft.tags.BlockTags.DOORS)
                .add(CBlocks.LUTRUM_DOOR.get())
                .add(CBlocks.EXPOSED_LUTRUM_DOOR.get())
                .add(CBlocks.WEATHERED_LUTRUM_DOOR.get())
                .add(CBlocks.OXIDIZED_LUTRUM_DOOR.get())
                .add(CBlocks.WAXED_LUTRUM_DOOR.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM_DOOR.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM_DOOR.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM_DOOR.get())
                .add(CBlocks.OBDURIUM_DOOR.get())
                .add(CBlocks.MALUNITE_DOOR.get())
        ;
        tag(net.minecraft.tags.BlockTags.WOODEN_DOORS)
                .add(CBlocks.MAYURA_DOOR.get())
                .add(CBlocks.GRIMWOOD_DOOR.get())
        ;
        tag(net.minecraft.tags.BlockTags.TRAPDOORS)
                .add(CBlocks.LUTRUM_TRAPDOOR.get())
                .add(CBlocks.EXPOSED_LUTRUM_TRAPDOOR.get())
                .add(CBlocks.WEATHERED_LUTRUM_TRAPDOOR.get())
                .add(CBlocks.OXIDIZED_LUTRUM_TRAPDOOR.get())
                .add(CBlocks.WAXED_LUTRUM_TRAPDOOR.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM_TRAPDOOR.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM_TRAPDOOR.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM_TRAPDOOR.get())
                .add(CBlocks.OBDURIUM_TRAPDOOR.get())
                .add(CBlocks.MALUNITE_TRAPDOOR.get())
        ;
        tag(net.minecraft.tags.BlockTags.WOODEN_TRAPDOORS)
                .add(CBlocks.MAYURA_TRAPDOOR.get())
                .add(CBlocks.GRIMWOOD_TRAPDOOR.get())
        ;
        tag(net.minecraft.tags.BlockTags.PRESSURE_PLATES)
                .add(CBlocks.LUTRUM_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.WAXED_LUTRUM_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.OBDURIUM_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.MALUNITE_PLATING_PRESSURE_PLATE.get())
        ;
        stonePressurePlates.forEach(entry -> tag(net.minecraft.tags.BlockTags.STONE_PRESSURE_PLATES).add(entry.get()));
        tag(net.minecraft.tags.BlockTags.STONE_PRESSURE_PLATES)
        ;
        tag(net.minecraft.tags.BlockTags.WOODEN_PRESSURE_PLATES)
                .add(CBlocks.MAYURA_PRESSURE_PLATE.get())
                .add(CBlocks.GRIMWOOD_PRESSURE_PLATE.get())
        ;
        tag(net.minecraft.tags.BlockTags.BUTTONS)
                .add(CBlocks.LUTRUM_PLATING_BUTTON.get())
                .add(CBlocks.EXPOSED_LUTRUM_PLATING_BUTTON.get())
                .add(CBlocks.WEATHERED_LUTRUM_PLATING_BUTTON.get())
                .add(CBlocks.OXIDIZED_LUTRUM_PLATING_BUTTON.get())
                .add(CBlocks.WAXED_LUTRUM_PLATING_BUTTON.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM_PLATING_BUTTON.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM_PLATING_BUTTON.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM_PLATING_BUTTON.get())
                .add(CBlocks.OBDURIUM_PLATING_BUTTON.get())
                .add(CBlocks.MALUNITE_PLATING_BUTTON.get())
        ;
        stoneButtons.forEach(entry -> tag(net.minecraft.tags.BlockTags.STONE_BUTTONS).add(entry.get()));
        tag(net.minecraft.tags.BlockTags.STONE_BUTTONS)
        ;
        tag(net.minecraft.tags.BlockTags.WOODEN_BUTTONS)
                .add(CBlocks.MAYURA_BUTTON.get())
                .add(CBlocks.GRIMWOOD_BUTTON.get())
        ;
        // endregion

        // region Storage Block Tags
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(CTags.BlockTags.STORAGE_BLOCKS_BRUMA)
                .addTag(CTags.BlockTags.STORAGE_BLOCKS_LUTRUM)
                .addTag(CTags.BlockTags.STORAGE_BLOCKS_RAW_LUTRUM)
                .addTag(CTags.BlockTags.STORAGE_BLOCKS_OBDURIUM)
                .addTag(CTags.BlockTags.STORAGE_BLOCKS_RAW_OBDURIUM)
                .addTag(CTags.BlockTags.STORAGE_BLOCKS_MALUNITE)
                .addTag(CTags.BlockTags.STORAGE_BLOCKS_RAW_MALUNITE)
        ;
        tag(CTags.BlockTags.STORAGE_BLOCKS_BRUMA)
                .add(CBlocks.BRUMA_BLOCK.get())
        ;
        tag(CTags.BlockTags.STORAGE_BLOCKS_LUTRUM)
                .add(CBlocks.LUTRUM_BLOCK.get())
        ;
        tag(CTags.BlockTags.STORAGE_BLOCKS_RAW_LUTRUM)
                .add(CBlocks.RAW_LUTRUM_BLOCK.get())
        ;
        tag(CTags.BlockTags.STORAGE_BLOCKS_OBDURIUM)
                .add(CBlocks.OBDURIUM_BLOCK.get())
        ;
        tag(CTags.BlockTags.STORAGE_BLOCKS_RAW_OBDURIUM)
                .add(CBlocks.RAW_OBDURIUM_BLOCK.get())
        ;
        tag(CTags.BlockTags.STORAGE_BLOCKS_MALUNITE)
                .add(CBlocks.MALUNITE_BLOCK.get())
        ;
        tag(CTags.BlockTags.STORAGE_BLOCKS_RAW_MALUNITE)
                .add(CBlocks.RAW_MALUNITE_BLOCK.get())
        ;
        // endregion

        // region Compatibility Tags
        tag(CTags.BlockTags.CREATE_FAN_TRANSPARENT)
                .add(CBlocks.LUTRUM_GRATE.get())
                .add(CBlocks.EXPOSED_LUTRUM_GRATE.get())
                .add(CBlocks.WEATHERED_LUTRUM_GRATE.get())
                .add(CBlocks.OXIDIZED_LUTRUM_GRATE.get())
                .add(CBlocks.WAXED_LUTRUM_GRATE.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM_GRATE.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM_GRATE.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM_GRATE.get())
                .add(CBlocks.LUTRUM_BARS.get())
                .add(CBlocks.EXPOSED_LUTRUM_BARS.get())
                .add(CBlocks.WEATHERED_LUTRUM_BARS.get())
                .add(CBlocks.OXIDIZED_LUTRUM_BARS.get())
                .add(CBlocks.WAXED_LUTRUM_BARS.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM_BARS.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM_BARS.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM_BARS.get())
                .add(CBlocks.OBDURIUM_GRATE.get())
                .add(CBlocks.OBDURIUM_BARS.get())
                .add(CBlocks.MALUNITE_GRATE.get())
                .add(CBlocks.MALUNITE_GRATE.get())
        ;
        // endregion

        // region Miscellaneous Tags
        tag(BlockTags.IMPERMEABLE)
                // Prevents dripping particles from forming if fluid is above
                .add(CBlocks.LUTRUM_WINDOW.get())
                .add(CBlocks.EXPOSED_LUTRUM_WINDOW.get())
                .add(CBlocks.WEATHERED_LUTRUM_WINDOW.get())
                .add(CBlocks.OXIDIZED_LUTRUM_WINDOW.get())
                .add(CBlocks.WAXED_LUTRUM_WINDOW.get())
                .add(CBlocks.WAXED_EXPOSED_LUTRUM_WINDOW.get())
                .add(CBlocks.WAXED_WEATHERED_LUTRUM_WINDOW.get())
                .add(CBlocks.WAXED_OXIDIZED_LUTRUM_WINDOW.get())
                .add(CBlocks.OBDURIUM_WINDOW.get())
                .add(CBlocks.MALUNITE_WINDOW.get())
        ;
        tag(net.minecraft.tags.BlockTags.ENCHANTMENT_POWER_TRANSMITTER)
                // Prevents blocks from interfering with enchanting
                .add(CBlocks.FRIGIAN_SHORT_GRASS.get())
                .add(CBlocks.SHORT_GRISTLES.get())
                .add(CBlocks.TALL_GRISTLES.get())
        ;
        tag(net.minecraft.tags.BlockTags.REPLACEABLE)
                .add(CBlocks.FRIGIAN_SHORT_GRASS.get())
                .add(CBlocks.SHORT_GRISTLES.get())
                .add(CBlocks.TALL_GRISTLES.get()).add(CBlocks.FRIGIAN_SHORT_GRASS.get())
        ;
        // endregion
    }
}