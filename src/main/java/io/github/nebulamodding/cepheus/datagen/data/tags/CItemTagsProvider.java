package io.github.nebulamodding.cepheus.datagen.data.tags;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import io.github.nebulamodding.cepheus.registry.item.CItems;
import io.github.nebulamodding.cepheus.registry.CTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CItemTagsProvider extends ItemTagsProvider {
    public CItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), Cepheus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        /*
        Tool Tags
         */

        // None applied yet :^

        /*
        Block Variant Tags
         */

        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
        copy(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.DOORS, ItemTags.DOORS);
        copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);
        copy(BlockTags.WOODEN_TRAPDOORS, ItemTags.WOODEN_TRAPDOORS);
        copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);
        copy(BlockTags.STONE_BUTTONS, ItemTags.STONE_BUTTONS);
        copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);

        /*
        Ore Tags
         */

        copy(BlockTags.COAL_ORES, ItemTags.COAL_ORES);
        copy(BlockTags.IRON_ORES, ItemTags.IRON_ORES);
        copy(BlockTags.COPPER_ORES, ItemTags.COPPER_ORES);
        copy(BlockTags.GOLD_ORES, ItemTags.GOLD_ORES);
        copy(BlockTags.REDSTONE_ORES, ItemTags.REDSTONE_ORES);
        copy(BlockTags.EMERALD_ORES, ItemTags.EMERALD_ORES);
        copy(BlockTags.LAPIS_ORES, ItemTags.LAPIS_ORES);
        copy(BlockTags.DIAMOND_ORES, ItemTags.DIAMOND_ORES);
        copy(CTags.EUBlockTags.ORES_OBDURIUM, CTags.EUItemTags.ORES_OBDURIUM);
        copy(CTags.EUBlockTags.ORES_MALUNITE, CTags.EUItemTags.ORES_MALUNITE);
        copy(CTags.EUBlockTags.ORES_LUTRUM, CTags.EUItemTags.ORES_LUTRUM);
        copy(Tags.Blocks.ORE_RATES_DENSE, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SINGULAR, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SPARSE, Tags.Items.ORE_RATES_SPARSE);
        copy(CTags.EUBlockTags.ORE_BEARING_GROUND_BLUESCHIST, CTags.EUItemTags.ORE_BEARING_GROUND_BLUESCHIST);
        copy(CTags.EUBlockTags.ORE_BEARING_GROUND_BLUE_SHALE, CTags.EUItemTags.ORE_BEARING_GROUND_BLUE_SHALE);
        copy(CTags.EUBlockTags.ORE_BEARING_GROUND_WATER_ICE, CTags.EUItemTags.ORE_BEARING_GROUND_WATER_ICE);
        copy(CTags.EUBlockTags.ORE_BEARING_GROUND_NITROGEN_ICE, CTags.EUItemTags.ORE_BEARING_GROUND_NITROGEN_ICE);
        copy(CTags.EUBlockTags.ORE_BEARING_GROUND_OXYGEN_ICE, CTags.EUItemTags.ORE_BEARING_GROUND_OXYGEN_ICE);
        copy(CTags.EUBlockTags.ORES_IN_GROUND_BLUESCHIST, CTags.EUItemTags.ORES_IN_GROUND_BLUESCHIST);
        copy(CTags.EUBlockTags.ORES_IN_GROUND_BLUE_SHALE, CTags.EUItemTags.ORES_IN_GROUND_BLUE_SHALE);
        copy(CTags.EUBlockTags.ORES_IN_GROUND_WATER_ICE, CTags.EUItemTags.ORES_IN_GROUND_WATER_ICE);
        copy(CTags.EUBlockTags.ORES_IN_GROUND_NITROGEN_ICE, CTags.EUItemTags.ORES_IN_GROUND_NITROGEN_ICE);
        copy(CTags.EUBlockTags.ORES_IN_GROUND_OXYGEN_ICE, CTags.EUItemTags.ORES_IN_GROUND_OXYGEN_ICE);
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(CTags.EUItemTags.INGOTS_OBDURIUM)
                .addTag(CTags.EUItemTags.INGOTS_MALUNITE)
                .addTag(CTags.EUItemTags.INGOTS_LUTRUM)
        ;
        tag(ItemTags.TRIM_MATERIALS)
                .addTag(CTags.EUItemTags.INGOTS_OBDURIUM)
                .addTag(CTags.EUItemTags.INGOTS_MALUNITE)
                .addTag(CTags.EUItemTags.INGOTS_LUTRUM)
        ;
        tag(Tags.Items.RAW_MATERIALS)
                .addTag(CTags.EUItemTags.RAW_MATERIALS_OBDURIUM)
                .addTag(CTags.EUItemTags.RAW_MATERIALS_MALUNITE)
                .addTag(CTags.EUItemTags.RAW_MATERIALS_LUTRUM)
        ;
        tag(Tags.Items.NUGGETS)
                .addTag(CTags.EUItemTags.NUGGETS_OBDURIUM)
                .addTag(CTags.EUItemTags.NUGGETS_MALUNITE)
                .addTag(CTags.EUItemTags.NUGGETS_LUTRUM)
        ;
        tag(Tags.Items.INGOTS)
                .addTag(CTags.EUItemTags.INGOTS_OBDURIUM)
                .addTag(CTags.EUItemTags.INGOTS_MALUNITE)
                .addTag(CTags.EUItemTags.INGOTS_LUTRUM)
        ;
        tag(CTags.EUItemTags.PLATES)
                .addTag(CTags.EUItemTags.PLATES_OBDURIUM)
                .addTag(CTags.EUItemTags.PLATES_MALUNITE)
                .addTag(CTags.EUItemTags.PLATES_LUTRUM)
        ;
        tag(Tags.Items.RODS)
                .addTag(CTags.EUItemTags.RODS_OBDURIUM)
                .addTag(CTags.EUItemTags.RODS_MALUNITE)
                .addTag(CTags.EUItemTags.RODS_LUTRUM)
        ;
        tag(CTags.EUItemTags.RAW_MATERIALS_OBDURIUM)
                .add(CItems.OBDURIUM_ITEMS.get("raw_obdurium").get())
        ;
        tag(CTags.EUItemTags.NUGGETS_OBDURIUM)
                .add(CItems.OBDURIUM_ITEMS.get("obdurium_nugget").get())
        ;
        tag(CTags.EUItemTags.INGOTS_OBDURIUM)
                .add(CItems.OBDURIUM_ITEMS.get("obdurium_ingot").get())
        ;
        tag(CTags.EUItemTags.PLATES_OBDURIUM)
                .add(CItems.OBDURIUM_ITEMS.get("obdurium_plate").get())
        ;
        tag(CTags.EUItemTags.RODS_OBDURIUM)
                .add(CItems.OBDURIUM_ITEMS.get("obdurium_rod").get())
        ;
        tag(CTags.EUItemTags.RAW_MATERIALS_MALUNITE)
                .add(CItems.MALUNITE_ITEMS.get("raw_malunite").get())
        ;
        tag(CTags.EUItemTags.NUGGETS_MALUNITE)
                .add(CItems.MALUNITE_ITEMS.get("malunite_nugget").get())
        ;
        tag(CTags.EUItemTags.INGOTS_MALUNITE)
                .add(CItems.MALUNITE_ITEMS.get("malunite_ingot").get())
        ;
        tag(CTags.EUItemTags.PLATES_MALUNITE)
                .add(CItems.MALUNITE_ITEMS.get("malunite_plate").get())
        ;
        tag(CTags.EUItemTags.RODS_MALUNITE)
                .add(CItems.MALUNITE_ITEMS.get("malunite_rod").get())
        ;
        tag(CTags.EUItemTags.RAW_MATERIALS_LUTRUM)
                .add(CItems.LUTRUM_ITEMS.get("raw_lutrum").get())
        ;
        tag(CTags.EUItemTags.NUGGETS_LUTRUM)
                .add(CItems.LUTRUM_ITEMS.get("lutrum_nugget").get())
        ;
        tag(CTags.EUItemTags.INGOTS_LUTRUM)
                .add(CItems.LUTRUM_ITEMS.get("lutrum_ingot").get())
        ;
        tag(CTags.EUItemTags.PLATES_LUTRUM)
                .add(CItems.LUTRUM_ITEMS.get("lutrum_plate").get())
        ;
        tag(CTags.EUItemTags.RODS_LUTRUM)
                .add(CItems.LUTRUM_ITEMS.get("lutrum_rod").get())
        ;

        /*
        Stone Tags
         */

        copy(Tags.Blocks.STONES, Tags.Items.STONES);
        copy(Tags.Blocks.COBBLESTONES, Tags.Items.COBBLESTONES);
        copy(CTags.EUBlockTags.COBBLESTONES_BLUESCHIST, CTags.EUItemTags.COBBLESTONES_BLUESCHIST);
        copy(CTags.EUBlockTags.COBBLESTONES_BLUE_SHALE, CTags.EUItemTags.COBBLESTONES_BLUE_SHALE);
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(CBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get().asItem())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("cobbled_blue_shale").get().asItem())
        ;
        tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(CBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get().asItem())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("cobbled_blue_shale").get().asItem())
        ;

        /*
        Storage Block Tags
         */

        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(CTags.EUBlockTags.STORAGE_BLOCKS_BRUMA, CTags.EUItemTags.STORAGE_BLOCKS_BRUMA);
        copy(CTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM, CTags.EUItemTags.STORAGE_BLOCKS_OBDURIUM);
        copy(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM, CTags.EUItemTags.STORAGE_BLOCKS_RAW_OBDURIUM);
        copy(CTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE, CTags.EUItemTags.STORAGE_BLOCKS_MALUNITE);
        copy(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE, CTags.EUItemTags.STORAGE_BLOCKS_RAW_MALUNITE);
        copy(CTags.EUBlockTags.STORAGE_BLOCKS_LUTRUM, CTags.EUItemTags.STORAGE_BLOCKS_LUTRUM);
        copy(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_LUTRUM, CTags.EUItemTags.STORAGE_BLOCKS_RAW_LUTRUM);

        /*
        Soil Tags
         */

        copy(BlockTags.DIRT, ItemTags.DIRT);

        /*
        Tree Tags
         */

        copy(BlockTags.LEAVES, ItemTags.LEAVES);
        copy(BlockTags.LOGS, ItemTags.LOGS);
        copy(Tags.Blocks.STRIPPED_LOGS, Tags.Items.STRIPPED_LOGS);
        copy(Tags.Blocks.STRIPPED_WOODS, Tags.Items.STRIPPED_WOODS);
        copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);
        copy(BlockTags.PLANKS, ItemTags.PLANKS);
        copy(CTags.EUBlockTags.MAYURA_LOGS, CTags.EUItemTags.MAYURA_LOGS);
        copy(CTags.EUBlockTags.GRIMWOOD_LOGS, CTags.EUItemTags.GRIMWOOD_LOGS);

        /*
        Plant Tags
         */

        copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
        copy(BlockTags.TALL_FLOWERS, ItemTags.TALL_FLOWERS);
        tag(Tags.Items.CROPS_WHEAT)
                .add(CItems.BRUMA.get())
        ;
        tag(Tags.Items.CROPS)
                .add(CItems.BRUMA.get())
        ;

        /*
        Miscellaneous Tags
         */

        tag(ItemTags.GOAT_FOOD)
                .add(CItems.BRUMA.get())
        ;
        tag(ItemTags.LLAMA_FOOD)
                .add(CItems.BRUMA.get())
                .add(CBlocks.BRUMA_BLOCK.get().asItem())
        ;
        tag(ItemTags.COW_FOOD)
                .add(CItems.BRUMA.get())
        ;
        tag(ItemTags.SHEEP_FOOD)
                .add(CItems.BRUMA.get())
        ;
        tag(ItemTags.HORSE_FOOD)
                .add(CItems.BRUMA.get())
                .add(CBlocks.BRUMA_BLOCK.get().asItem())
        ;
        tag(ItemTags.LLAMA_TEMPT_ITEMS)
                .add(CBlocks.BRUMA_BLOCK.get().asItem())
        ;
        tag(ItemTags.HORSE_TEMPT_ITEMS)
        ;
        tag(Tags.Items.FOODS_BREAD)
                .add(CItems.BRUMA_LOAF.get())
        ;
    }
}