package org.nebulamodding.centaurus.registry;

import org.nebulamodding.centaurus.Centaurus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CTags {
    public static class BlockTags {

        /*
        Blocks
         */

        public static final TagKey<Block>
                // region Common Tags
                // Cobblestones
                COBBLESTONES_SILICATE_STONE = commonBlockTag("cobblestones/silicate_stone"),
                COBBLESTONES_BLUESCHIST = commonBlockTag("cobblestones/blueschist"),
                COBBLESTONES_BLUESLATE = commonBlockTag("cobblestones/blueslate"),
                COBBLESTONES_KARCASS_STONE = commonBlockTag("cobblestones/karcass_stone"),

                // Ore Bearing Ground
                ORE_BEARING_GROUND_SILICATE_STONE = commonBlockTag("ore_bearing_ground/silicate_stone"),
                ORE_BEARING_GROUND_BLUESCHIST = commonBlockTag("ore_bearing_ground/blueschist"),
                ORE_BEARING_GROUND_BLUESLATE = commonBlockTag("ore_bearing_ground/blueslate"),
                ORE_BEARING_GROUND_KARCASS_STONE = commonBlockTag("ore_bearing_ground/karcass_stone"),
                ORE_BEARING_GROUND_WATER_ICE = commonBlockTag("ore_bearing_ground/water_ice"),
                ORE_BEARING_GROUND_METHANE_ICE = commonBlockTag("ore_bearing_ground/methane_ice"),
                ORE_BEARING_GROUND_NITROGEN_ICE = commonBlockTag("ore_bearing_ground/nitrogen_ice"),
                ORE_BEARING_GROUND_OXYGEN_ICE = commonBlockTag("ore_bearing_ground/oxygen_ice"),

                // Ores
                ORES_LUTRUM = commonBlockTag("ores/lutrum"),
                ORES_OBDURIUM = commonBlockTag("ores/obdurium"),
                ORES_MALUNITE = commonBlockTag("ores/malunite"),
        
                // Ores In Ground
                ORES_IN_GROUND_SILICATE_STONE = commonBlockTag("ores_in_ground/silicate_stone"),
                ORES_IN_GROUND_BLUESCHIST = commonBlockTag("ores_in_ground/blueschist"),
                ORES_IN_GROUND_BLUESLATE = commonBlockTag("ores_in_ground/blueslate"),
                ORES_IN_GROUND_KARCASS_STONE = commonBlockTag("ores_in_ground/karcass_stone"),
                ORES_IN_GROUND_WATER_ICE = commonBlockTag("ores_in_ground/water_ice"),
                ORES_IN_GROUND_METHANE_ICE = commonBlockTag("ores_in_ground/methane_ice"),
                ORES_IN_GROUND_NITROGEN_ICE = commonBlockTag("ores_in_ground/nitrogen_ice"),
                ORES_IN_GROUND_OXYGEN_ICE = commonBlockTag("ores_in_ground/oxygen_ice"),

                // Storage Blocks
                STORAGE_BLOCKS_BRUMA = commonBlockTag("storage_blocks/bruma"),
                STORAGE_BLOCKS_LUTRUM = commonBlockTag("storage_blocks/lutrum"),
                STORAGE_BLOCKS_RAW_LUTRUM = commonBlockTag("storage_blocks/raw_lutrum"),
                STORAGE_BLOCKS_OBDURIUM = commonBlockTag("storage_blocks/obdurium"),
                STORAGE_BLOCKS_RAW_OBDURIUM = commonBlockTag("storage_blocks/raw_obdurium"),
                STORAGE_BLOCKS_MALUNITE = commonBlockTag("storage_blocks/malunite"),
                STORAGE_BLOCKS_RAW_MALUNITE = commonBlockTag("storage_blocks/raw_malunite"),
                // endregion

                // region Centaurus-Specific Tags
                // Needs Tools
                NEEDS_OBDURIUM_TOOL = blockTag("needs_obdurium_tool"),
                NEEDS_MALUNITE_TOOL = blockTag("needs_malunite_tool"),
                NEEDS_LUTRUM_TOOL = blockTag("needs_lutrum_tool"),

                // Logs
                MAYURA_LOGS = blockTag("mayura_logs"),
                GRIMWOOD_LOGS = blockTag("grimwood_logs"),

                // Base Stones
                BASE_STONE_FRIGUS = blockTag("base_stone_frigus"),

                // Carver Replacables
                FRIGUS_CARVER_REPLACEABLES = blockTag("frigus_carver_replaceables"),

                // Ore Replacables
                SILICATE_STONE_ORE_REPLACEABLES = blockTag("silicate_stone_ore_replaceables"),
                BLUESCHIST_ORE_REPLACEABLES = blockTag("blueschist_ore_replaceables"),
                BLUESLATE_ORE_REPLACEABLES = blockTag("blueslate_ore_replaceables"),
                KARCASS_STONE_ORE_REPLACEABLES = blockTag("karcass_stone_ore_replaceables"),

                // Convertable to Mud
                CONVERTABLE_TO_FRIGUS_MUD = blockTag("convertable_to_frigus_mud"),
                // endregion

                // region Mod Compatibility Tags
                CREATE_FAN_TRANSPARENT = otherBlockTag("create", "fan_transparent");
                // endregion
    }

    public static class ItemTags {

        /*
        Block Items
         */

        public static final TagKey<Item>
                // region Common Item Tags
                // Cobblestones
                COBBLESTONES_SILICATE_STONE = commonItemTag("cobblestones/silicate_stone"),
                COBBLESTONES_BLUESCHIST = commonItemTag("cobblestones/blueschist"),
                COBBLESTONES_BLUESLATE = commonItemTag("cobblestones/blueslate"),
                COBBLESTONES_KARCASS_STONE = commonItemTag("cobblestones/karcass_stone"),

                // Ore Bearing Ground
                ORE_BEARING_GROUND_SILICATE_STONE = commonItemTag("ore_bearing_ground/silicate_stone"),
                ORE_BEARING_GROUND_BLUESCHIST = commonItemTag("ore_bearing_ground/blueschist"),
                ORE_BEARING_GROUND_BLUESLATE = commonItemTag("ore_bearing_ground/blueslate"),
                ORE_BEARING_GROUND_KARCASS_STONE = commonItemTag("ore_bearing_ground/karcass_stone"),
                ORE_BEARING_GROUND_WATER_ICE = commonItemTag("ore_bearing_ground/water_ice"),
                ORE_BEARING_GROUND_METHANE_ICE = commonItemTag("ore_bearing_ground/methane_ice"),
                ORE_BEARING_GROUND_NITROGEN_ICE = commonItemTag("ore_bearing_ground/nitrogen_ice"),
                ORE_BEARING_GROUND_OXYGEN_ICE = commonItemTag("ore_bearing_ground/oxygen_ice"),

                // Ores
                ORES_LUTRUM = commonItemTag("ores/lutrum"),
                ORES_OBDURIUM = commonItemTag("ores/obdurium"),
                ORES_MALUNITE = commonItemTag("ores/malunite"),

                // Ores In Ground
                ORES_IN_GROUND_SILICATE_STONE = commonItemTag("ores_in_ground/silicate_stone"),
                ORES_IN_GROUND_BLUESCHIST = commonItemTag("ores_in_ground/blueschist"),
                ORES_IN_GROUND_BLUESLATE = commonItemTag("ores_in_ground/blueslate"),
                ORES_IN_GROUND_KARCASS_STONE = commonItemTag("ores_in_ground/karcass_stone"),
                ORES_IN_GROUND_WATER_ICE = commonItemTag("ores_in_ground/water_ice"),
                ORES_IN_GROUND_METHANE_ICE = commonItemTag("ores_in_ground/methane_ice"),
                ORES_IN_GROUND_NITROGEN_ICE = commonItemTag("ores_in_ground/nitrogen_ice"),
                ORES_IN_GROUND_OXYGEN_ICE = commonItemTag("ores_in_ground/oxygen_ice"),

                // Storage Blocks
                STORAGE_BLOCKS_BRUMA = commonItemTag("storage_blocks/bruma"),
                STORAGE_BLOCKS_LUTRUM = commonItemTag("storage_blocks/lutrum"),
                STORAGE_BLOCKS_RAW_LUTRUM = commonItemTag("storage_blocks/raw_lutrum"),
                STORAGE_BLOCKS_OBDURIUM = commonItemTag("storage_blocks/obdurium"),
                STORAGE_BLOCKS_RAW_OBDURIUM = commonItemTag("storage_blocks/raw_obdurium"),
                STORAGE_BLOCKS_MALUNITE = commonItemTag("storage_blocks/malunite"),
                STORAGE_BLOCKS_RAW_MALUNITE = commonItemTag("storage_blocks/raw_malunite"),
                // endregion

                // region Centaurus-Specific Tags
                // Logs
                MAYURA_LOGS = itemTag("mayura_logs"),
                GRIMWOOD_LOGS = itemTag("grimwood_logs"),
                // endregion

                // region Mod Compatibility Tags
                CREATE_CRUSHED_RAW_MATERIALS = otherItemTag("create", "crushed_raw_materials");
                // endregion

        /*
        Items
         */

        public static final TagKey<Item>
                // region Common Tags
                // Crops
                CROPS_BRUMA = commonItemTag("crops/bruma"),
                CROPS_AZURE_ROOT = commonItemTag("crops/azure_root"),
        
                // Ores
                PLATES = commonItemTag("plates"),

                RAW_MATERIALS_LUTRUM = commonItemTag("raw_material/lutrum"),
                RAW_MATERIALS_OBDURIUM = commonItemTag("raw_material/obdurium"),
                RAW_MATERIALS_MALUNITE = commonItemTag("raw_material/malunite"),
                NUGGETS_LUTRUM = commonItemTag("nuggets/lutrum"),
                NUGGETS_OBDURIUM = commonItemTag("nuggets/obdurium"),
                NUGGETS_MALUNITE = commonItemTag("nuggets/malunite"),
                INGOTS_LUTRUM = commonItemTag("ingots/lutrum"),
                INGOTS_OBDURIUM = commonItemTag("ingots/obdurium"),
                INGOTS_MALUNITE = commonItemTag("ingots/malunite"),
                PLATES_LUTRUM = commonItemTag("plates/lutrum"),
                PLATES_OBDURIUM = commonItemTag("plates/obdurium"),
                PLATES_MALUNITE = commonItemTag("plates/malunite"),
                RODS_LUTRUM = commonItemTag("rods/lutrum"),
                RODS_OBDURIUM = commonItemTag("rods/obdurium"),
                RODS_MALUNITE = commonItemTag("rods/malunite");
                // endregion

                // region Centaurus-Specific Tags
                // None yet! :^
                // endregion
    }
    // region Helpers
    public static TagKey<Block> commonBlockTag(String name) {
        return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }

    public static TagKey<Item> commonItemTag(String name) {
        return net.minecraft.tags.ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }

    public static TagKey<Block> blockTag(String name) {
        return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath(Centaurus.MOD_ID, name));
    }

    public static TagKey<Item> itemTag(String name) {
        return net.minecraft.tags.ItemTags.create(ResourceLocation.fromNamespaceAndPath(Centaurus.MOD_ID, name));
    }

    public static TagKey<Block> otherBlockTag(String namespace, String name) {
        return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath(namespace, name));
    }

    public static TagKey<Item> otherItemTag(String namespace, String name) {
        return net.minecraft.tags.ItemTags.create(ResourceLocation.fromNamespaceAndPath(namespace, name));
    }
    // endregion
}