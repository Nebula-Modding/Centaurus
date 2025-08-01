package org.nebulamodding.centaurus.datagen.data.tags;

import org.nebulamodding.centaurus.Centaurus;
import org.nebulamodding.centaurus.registry.block.CBlocks;
import org.nebulamodding.centaurus.registry.item.CItems;
import org.nebulamodding.centaurus.registry.CTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CItemTagProvider extends ItemTagsProvider {
    public CItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), Centaurus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        // region Tool Tags
        // None applied yet :^
        // endregion

        // region Tree Tags
        copy(net.minecraft.tags.BlockTags.LEAVES, net.minecraft.tags.ItemTags.LEAVES);
        copy(net.minecraft.tags.BlockTags.LOGS, net.minecraft.tags.ItemTags.LOGS);
        copy(Tags.Blocks.STRIPPED_LOGS, Tags.Items.STRIPPED_LOGS);
        copy(Tags.Blocks.STRIPPED_WOODS, Tags.Items.STRIPPED_WOODS);
        copy(net.minecraft.tags.BlockTags.LOGS_THAT_BURN, net.minecraft.tags.ItemTags.LOGS_THAT_BURN);
        copy(net.minecraft.tags.BlockTags.PLANKS, net.minecraft.tags.ItemTags.PLANKS);
        copy(CTags.BlockTags.MAYURA_LOGS, CTags.ItemTags.MAYURA_LOGS);
        copy(CTags.BlockTags.GRIMWOOD_LOGS, CTags.ItemTags.GRIMWOOD_LOGS);
        // endregion

        //region Plant Tags
        copy(net.minecraft.tags.BlockTags.SAPLINGS, net.minecraft.tags.ItemTags.SAPLINGS);
        copy(net.minecraft.tags.BlockTags.SMALL_FLOWERS, net.minecraft.tags.ItemTags.SMALL_FLOWERS);
        copy(net.minecraft.tags.BlockTags.TALL_FLOWERS, net.minecraft.tags.ItemTags.TALL_FLOWERS);
        tag(Tags.Items.CROPS)
                .addTag(CTags.ItemTags.CROPS_BRUMA)
                .addTag(CTags.ItemTags.CROPS_AZURE_ROOT)
        ;
        tag(Tags.Items.CROPS_WHEAT)
                .add(CItems.BRUMA.get())
        ;
        tag(CTags.ItemTags.CROPS_BRUMA)
                .add(CItems.BRUMA.get())
        ;
        tag(CTags.ItemTags.CROPS_AZURE_ROOT)
                .add(CItems.AZURE_ROOT.get())
        ;
        // endregion

        // region Soil Tags
        copy(net.minecraft.tags.BlockTags.DIRT, net.minecraft.tags.ItemTags.DIRT);
        // endregion

        //region Stone Tags
        copy(Tags.Blocks.STONES, Tags.Items.STONES);
        copy(Tags.Blocks.COBBLESTONES, Tags.Items.COBBLESTONES);
        copy(CTags.BlockTags.COBBLESTONES_SILICATE_STONE, CTags.ItemTags.COBBLESTONES_SILICATE_STONE);
        copy(CTags.BlockTags.COBBLESTONES_BLUESCHIST, CTags.ItemTags.COBBLESTONES_BLUESCHIST);
        copy(CTags.BlockTags.COBBLESTONES_BLUESLATE, CTags.ItemTags.COBBLESTONES_BLUESLATE);
        copy(CTags.BlockTags.COBBLESTONES_KARCASS_STONE, CTags.ItemTags.COBBLESTONES_KARCASS_STONE);
        tag(net.minecraft.tags.ItemTags.STONE_CRAFTING_MATERIALS)
                .add(CBlocks.SILICATE_COBBLESTONE.get().asItem())
                .add(CBlocks.COBBLED_BLUESCHIST.get().asItem())
                .add(CBlocks.COBBLED_BLUESLATE.get().asItem())
                .add(CBlocks.KARCASS_COBBLESTONE.get().asItem())
        ;
        tag(net.minecraft.tags.ItemTags.STONE_TOOL_MATERIALS)
                .add(CBlocks.SILICATE_COBBLESTONE.get().asItem())
                .add(CBlocks.COBBLED_BLUESCHIST.get().asItem())
                .add(CBlocks.COBBLED_BLUESLATE.get().asItem())
                .add(CBlocks.KARCASS_COBBLESTONE.get().asItem())
        ;
        // endregion

        // region Ore Tags
        copy(net.minecraft.tags.BlockTags.COAL_ORES, net.minecraft.tags.ItemTags.COAL_ORES);
        copy(net.minecraft.tags.BlockTags.IRON_ORES, net.minecraft.tags.ItemTags.IRON_ORES);
        copy(net.minecraft.tags.BlockTags.COPPER_ORES, net.minecraft.tags.ItemTags.COPPER_ORES);
        copy(net.minecraft.tags.BlockTags.GOLD_ORES, net.minecraft.tags.ItemTags.GOLD_ORES);
        copy(net.minecraft.tags.BlockTags.REDSTONE_ORES, net.minecraft.tags.ItemTags.REDSTONE_ORES);
        copy(net.minecraft.tags.BlockTags.EMERALD_ORES, net.minecraft.tags.ItemTags.EMERALD_ORES);
        copy(net.minecraft.tags.BlockTags.LAPIS_ORES, net.minecraft.tags.ItemTags.LAPIS_ORES);
        copy(net.minecraft.tags.BlockTags.DIAMOND_ORES, net.minecraft.tags.ItemTags.DIAMOND_ORES);
        copy(CTags.BlockTags.ORES_LUTRUM, CTags.ItemTags.ORES_LUTRUM);
        copy(CTags.BlockTags.ORES_OBDURIUM, CTags.ItemTags.ORES_OBDURIUM);
        copy(CTags.BlockTags.ORES_MALUNITE, CTags.ItemTags.ORES_MALUNITE);
        copy(Tags.Blocks.ORE_RATES_DENSE, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SINGULAR, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SPARSE, Tags.Items.ORE_RATES_SPARSE);
        copy(CTags.BlockTags.ORE_BEARING_GROUND_SILICATE_STONE, CTags.ItemTags.ORE_BEARING_GROUND_SILICATE_STONE);
        copy(CTags.BlockTags.ORE_BEARING_GROUND_BLUESCHIST, CTags.ItemTags.ORE_BEARING_GROUND_BLUESCHIST);
        copy(CTags.BlockTags.ORE_BEARING_GROUND_BLUESLATE, CTags.ItemTags.ORE_BEARING_GROUND_BLUESLATE);
        copy(CTags.BlockTags.ORE_BEARING_GROUND_KARCASS_STONE, CTags.ItemTags.ORE_BEARING_GROUND_KARCASS_STONE);
        copy(CTags.BlockTags.ORE_BEARING_GROUND_WATER_ICE, CTags.ItemTags.ORE_BEARING_GROUND_WATER_ICE);
        copy(CTags.BlockTags.ORE_BEARING_GROUND_NITROGEN_ICE, CTags.ItemTags.ORE_BEARING_GROUND_NITROGEN_ICE);
        copy(CTags.BlockTags.ORE_BEARING_GROUND_OXYGEN_ICE, CTags.ItemTags.ORE_BEARING_GROUND_OXYGEN_ICE);
        copy(CTags.BlockTags.ORES_IN_GROUND_SILICATE_STONE, CTags.ItemTags.ORES_IN_GROUND_SILICATE_STONE);
        copy(CTags.BlockTags.ORES_IN_GROUND_BLUESCHIST, CTags.ItemTags.ORES_IN_GROUND_BLUESCHIST);
        copy(CTags.BlockTags.ORES_IN_GROUND_BLUESLATE, CTags.ItemTags.ORES_IN_GROUND_BLUESLATE);
        copy(CTags.BlockTags.ORES_IN_GROUND_KARCASS_STONE, CTags.ItemTags.ORES_IN_GROUND_KARCASS_STONE);
        copy(CTags.BlockTags.ORES_IN_GROUND_WATER_ICE, CTags.ItemTags.ORES_IN_GROUND_WATER_ICE);
        copy(CTags.BlockTags.ORES_IN_GROUND_NITROGEN_ICE, CTags.ItemTags.ORES_IN_GROUND_NITROGEN_ICE);
        copy(CTags.BlockTags.ORES_IN_GROUND_OXYGEN_ICE, CTags.ItemTags.ORES_IN_GROUND_OXYGEN_ICE);
        tag(net.minecraft.tags.ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(CTags.ItemTags.INGOTS_LUTRUM)
                .addTag(CTags.ItemTags.INGOTS_OBDURIUM)
                .addTag(CTags.ItemTags.INGOTS_MALUNITE)
        ;
        tag(net.minecraft.tags.ItemTags.TRIM_MATERIALS)
                .addTag(CTags.ItemTags.INGOTS_LUTRUM)
                .addTag(CTags.ItemTags.INGOTS_OBDURIUM)
                .addTag(CTags.ItemTags.INGOTS_MALUNITE)
        ;
        tag(Tags.Items.RAW_MATERIALS)
                .addTag(CTags.ItemTags.RAW_MATERIALS_LUTRUM)
                .addTag(CTags.ItemTags.RAW_MATERIALS_OBDURIUM)
                .addTag(CTags.ItemTags.RAW_MATERIALS_MALUNITE)
        ;
        tag(Tags.Items.NUGGETS)
                .addTag(CTags.ItemTags.NUGGETS_LUTRUM)
                .addTag(CTags.ItemTags.NUGGETS_OBDURIUM)
                .addTag(CTags.ItemTags.NUGGETS_MALUNITE)
        ;
        tag(Tags.Items.INGOTS)
                .addTag(CTags.ItemTags.INGOTS_LUTRUM)
                .addTag(CTags.ItemTags.INGOTS_OBDURIUM)
                .addTag(CTags.ItemTags.INGOTS_MALUNITE)
        ;
        tag(CTags.ItemTags.PLATES)
                .addTag(CTags.ItemTags.PLATES_LUTRUM)
                .addTag(CTags.ItemTags.PLATES_OBDURIUM)
                .addTag(CTags.ItemTags.PLATES_MALUNITE)
        ;
        tag(Tags.Items.RODS)
                .addTag(CTags.ItemTags.RODS_LUTRUM)
                .addTag(CTags.ItemTags.RODS_OBDURIUM)
                .addTag(CTags.ItemTags.RODS_MALUNITE)
        ;
        tag(CTags.ItemTags.RAW_MATERIALS_LUTRUM)
                .add(CItems.RAW_LUTRUM.get())
        ;
        tag(CTags.ItemTags.NUGGETS_LUTRUM)
                .add(CItems.LUTRUM_NUGGET.get())
        ;
        tag(CTags.ItemTags.INGOTS_LUTRUM)
                .add(CItems.LUTRUM_INGOT.get())
        ;
        tag(CTags.ItemTags.PLATES_LUTRUM)
                .add(CItems.LUTRUM_SHEET.get())
        ;
        tag(CTags.ItemTags.RODS_LUTRUM)
                .add(CItems.LUTRUM_ROD.get())
        ;
        tag(CTags.ItemTags.RAW_MATERIALS_OBDURIUM)
                .add(CItems.RAW_OBDURIUM.get())
        ;
        tag(CTags.ItemTags.NUGGETS_OBDURIUM)
                .add(CItems.OBDURIUM_NUGGET.get())
        ;
        tag(CTags.ItemTags.INGOTS_OBDURIUM)
                .add(CItems.OBDURIUM_INGOT.get())
        ;
        tag(CTags.ItemTags.PLATES_OBDURIUM)
                .add(CItems.OBDURIUM_SHEET.get())
        ;
        tag(CTags.ItemTags.RODS_OBDURIUM)
                .add(CItems.OBDURIUM_ROD.get())
        ;
        tag(CTags.ItemTags.RAW_MATERIALS_MALUNITE)
                .add(CItems.RAW_MALUNITE.get())
        ;
        tag(CTags.ItemTags.NUGGETS_MALUNITE)
                .add(CItems.MALUNITE_NUGGET.get())
        ;
        tag(CTags.ItemTags.INGOTS_MALUNITE)
                .add(CItems.MALUNITE_INGOT.get())
        ;
        tag(CTags.ItemTags.PLATES_MALUNITE)
                .add(CItems.MALUNITE_SHEET.get())
        ;
        tag(CTags.ItemTags.RODS_MALUNITE)
                .add(CItems.MALUNITE_ROD.get())
        ;
        // endregion

        //region Block Variant Tags
        copy(net.minecraft.tags.BlockTags.STAIRS, net.minecraft.tags.ItemTags.STAIRS);
        copy(net.minecraft.tags.BlockTags.WOODEN_STAIRS, net.minecraft.tags.ItemTags.WOODEN_STAIRS);
        copy(net.minecraft.tags.BlockTags.SLABS, net.minecraft.tags.ItemTags.SLABS);
        copy(net.minecraft.tags.BlockTags.WOODEN_SLABS, net.minecraft.tags.ItemTags.WOODEN_SLABS);
        copy(net.minecraft.tags.BlockTags.FENCES, net.minecraft.tags.ItemTags.FENCES);
        copy(net.minecraft.tags.BlockTags.WOODEN_FENCES, net.minecraft.tags.ItemTags.WOODEN_FENCES);
        copy(net.minecraft.tags.BlockTags.FENCE_GATES, net.minecraft.tags.ItemTags.FENCE_GATES);
        copy(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);
        copy(net.minecraft.tags.BlockTags.WALLS, net.minecraft.tags.ItemTags.WALLS);
        copy(net.minecraft.tags.BlockTags.DOORS, net.minecraft.tags.ItemTags.DOORS);
        copy(net.minecraft.tags.BlockTags.WOODEN_DOORS, net.minecraft.tags.ItemTags.WOODEN_DOORS);
        copy(net.minecraft.tags.BlockTags.TRAPDOORS, net.minecraft.tags.ItemTags.TRAPDOORS);
        copy(net.minecraft.tags.BlockTags.WOODEN_TRAPDOORS, net.minecraft.tags.ItemTags.WOODEN_TRAPDOORS);
        copy(net.minecraft.tags.BlockTags.WOODEN_PRESSURE_PLATES, net.minecraft.tags.ItemTags.WOODEN_PRESSURE_PLATES);
        copy(net.minecraft.tags.BlockTags.BUTTONS, net.minecraft.tags.ItemTags.BUTTONS);
        copy(net.minecraft.tags.BlockTags.STONE_BUTTONS, net.minecraft.tags.ItemTags.STONE_BUTTONS);
        copy(net.minecraft.tags.BlockTags.WOODEN_BUTTONS, net.minecraft.tags.ItemTags.WOODEN_BUTTONS);
        // endregion

        // region Storage Block Tags
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(CTags.BlockTags.STORAGE_BLOCKS_BRUMA, CTags.ItemTags.STORAGE_BLOCKS_BRUMA);
        copy(CTags.BlockTags.STORAGE_BLOCKS_LUTRUM, CTags.ItemTags.STORAGE_BLOCKS_LUTRUM);
        copy(CTags.BlockTags.STORAGE_BLOCKS_RAW_LUTRUM, CTags.ItemTags.STORAGE_BLOCKS_RAW_LUTRUM);
        copy(CTags.BlockTags.STORAGE_BLOCKS_OBDURIUM, CTags.ItemTags.STORAGE_BLOCKS_OBDURIUM);
        copy(CTags.BlockTags.STORAGE_BLOCKS_RAW_OBDURIUM, CTags.ItemTags.STORAGE_BLOCKS_RAW_OBDURIUM);
        copy(CTags.BlockTags.STORAGE_BLOCKS_MALUNITE, CTags.ItemTags.STORAGE_BLOCKS_MALUNITE);
        copy(CTags.BlockTags.STORAGE_BLOCKS_RAW_MALUNITE, CTags.ItemTags.STORAGE_BLOCKS_RAW_MALUNITE);
        // endregion

        // region Food Tags
        tag(net.minecraft.tags.ItemTags.GOAT_FOOD)
                .add(CItems.BRUMA.get())
        ;
        tag(net.minecraft.tags.ItemTags.LLAMA_FOOD)
                .add(CItems.BRUMA.get())
                .add(CBlocks.BRUMA_BLOCK.get().asItem())
        ;
        tag(net.minecraft.tags.ItemTags.COW_FOOD)
                .add(CItems.BRUMA.get())
        ;
        tag(net.minecraft.tags.ItemTags.SHEEP_FOOD)
                .add(CItems.BRUMA.get())
        ;
        tag(ItemTags.PIG_FOOD)
                .add(CItems.AZURE_ROOT.get())
        ;
        tag(net.minecraft.tags.ItemTags.HORSE_FOOD)
                .add(CItems.BRUMA.get())
                .add(CBlocks.BRUMA_BLOCK.get().asItem())
        ;
        tag(ItemTags.WOLF_FOOD)
                .add(CItems.FLESH.get())
                .add(CItems.COOKED_FLESH.get())
                .add(CItems.VEIN_STALK.get())
        ;
        tag(net.minecraft.tags.ItemTags.LLAMA_TEMPT_ITEMS)
                .add(CBlocks.BRUMA_BLOCK.get().asItem())
        ;
        tag(net.minecraft.tags.ItemTags.HORSE_TEMPT_ITEMS)
        ;
        tag(Tags.Items.FOODS_BREAD)
                .add(CItems.BRUMA_LOAF.get())
        ;
        tag(Tags.Items.FOODS_GOLDEN)
                .add(CItems.GOLDEN_AZURE_ROOT.get())
                .add(CItems.ENCHANTED_GOLDEN_AZURE_ROOT.get())
        ;
        tag(Tags.Items.FOODS_FRUIT)
        ;
        tag(Tags.Items.FOODS_VEGETABLE)
                .add(CItems.AZURE_ROOT.get())
                .add(CItems.GOLDEN_AZURE_ROOT.get())
                .add(CItems.ENCHANTED_GOLDEN_AZURE_ROOT.get())
        ;
        tag(ItemTags.MEAT)
                .add(CItems.FLESH.get())
                .add(CItems.COOKED_FLESH.get())
                .add(CItems.VEIN_STALK.get())
        ;
        tag(Tags.Items.FOODS_COOKED_MEAT)
                .add(CItems.COOKED_FLESH.get())
        ;
        tag(Tags.Items.FOODS_FOOD_POISONING)
                .add(CItems.FLESH.get())
        ;
        // endregion

        // region Compatibility Tags
        tag(CTags.ItemTags.CREATE_CRUSHED_RAW_MATERIALS)
                .add(CItems.CRUSHED_RAW_LUTRUM.get())
                .add(CItems.CRUSHED_RAW_OBDURIUM.get())
                .add(CItems.CRUSHED_RAW_MALUNITE.get())
        ;
        // endregion

        // region Miscellaneous Tags
        tag(ItemTags.PIGLIN_LOVED)
                .add(CItems.GOLDEN_AZURE_ROOT.get())
                .add(CItems.ENCHANTED_GOLDEN_AZURE_ROOT.get())
        ;
        // endregion
    }
}