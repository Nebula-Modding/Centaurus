package org.nebulamodding.centaurus.datagen.assets;

import org.nebulamodding.centaurus.Centaurus;
import org.nebulamodding.centaurus.registry.block.CBlocks;
import org.nebulamodding.centaurus.registry.item.CItems;
import org.nebulamodding.centaurus.registry.CCreativeTab;
import org.nebulamodding.centaurus.registry.CTags;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import org.codehaus.plexus.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CLanguageProvider extends LanguageProvider {
    public CLanguageProvider(PackOutput output) {
        super(output, Centaurus.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // region Exclusions
        final List<DeferredBlock<? extends Block>> excludedBlocks = new ArrayList<>();
        final List<DeferredItem<? extends Item>> excludedItems = new ArrayList<>();
        // Blocks excluded from having a translation automatically provided
        excludedBlocks.add(CBlocks.FLESH_BLOCK);
        excludedBlocks.add(CBlocks.BRUMA_BLOCK);
        excludedBlocks.add(CBlocks.BRUMA_BLOCK);
        excludedBlocks.add(CBlocks.RAW_LUTRUM_BLOCK);
        excludedBlocks.add(CBlocks.LUTRUM_AMALGAMATE_BLOCK);
        excludedBlocks.add(CBlocks.RAW_OBDURIUM_BLOCK);
        excludedBlocks.add(CBlocks.RAW_MALUNITE_BLOCK);
        excludedBlocks.add(CBlocks.LUTRUM_BLOCK);
        excludedBlocks.add(CBlocks.WAXED_LUTRUM_BLOCK);
        excludedBlocks.add(CBlocks.OBDURIUM_BLOCK);
        excludedBlocks.add(CBlocks.MALUNITE_BLOCK);
        // Items excluded from having a translation automatically provided
        excludedItems.add(CItems.GOLDEN_AZURE_ROOT);
        excludedItems.add(CItems.ENCHANTED_GOLDEN_AZURE_ROOT);
        excludedItems.add(CItems.COOKED_FLESH);
        // endregion

        // region Block Translations
        addBlock(CBlocks.FLESH_BLOCK, "Block of Flesh");

        addBlock(CBlocks.BRUMA_BLOCK, "Bruma Bale");
        addBlock(CBlocks.RAW_OBDURIUM_BLOCK, "Block of Raw Obdurium");
        addBlock(CBlocks.RAW_MALUNITE_BLOCK, "Block of Raw Malunite");
        addBlock(CBlocks.RAW_LUTRUM_BLOCK, "Block of Raw Lutrum");
        addBlock(CBlocks.LUTRUM_AMALGAMATE_BLOCK, "Block of Lutrum Amalgamate");

        addBlock(CBlocks.LUTRUM_BLOCK, "Block of Lutrum");
        addBlock(CBlocks.WAXED_LUTRUM_BLOCK, "Waxed Block of Lutrum");
        addBlock(CBlocks.OBDURIUM_BLOCK, "Block of Obdurium");
        addBlock(CBlocks.MALUNITE_BLOCK, "Block of Malunite");
        // endregion

        // region Item Translations
        addItem(CItems.GOLDEN_AZURE_ROOT, "Golden Root");
        addItem(CItems.ENCHANTED_GOLDEN_AZURE_ROOT, "Enchanted Golden Root");
        addItem(CItems.COOKED_FLESH, "Jerky");
        // endregion

        // region Tag Translations
        // Block Tags
        add(CTags.BlockTags.COBBLESTONES_SILICATE_STONE, "Silicate Cobblestones");
        add(CTags.BlockTags.COBBLESTONES_BLUESCHIST, "Blueschist Cobblestones");
        add(CTags.BlockTags.COBBLESTONES_BLUESLATE, "Blueslate Cobblestones");
        add(CTags.BlockTags.COBBLESTONES_KARCASS_STONE, "Karcass Cobblestones");
        add(CTags.BlockTags.ORE_BEARING_GROUND_SILICATE_STONE, "Silicate Stone Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_BLUESCHIST, "Blueschist Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_BLUESLATE, "Blueslate Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_KARCASS_STONE, "Karcass Stone Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_WATER_ICE, "Water Ice Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_METHANE_ICE, "Methane Ice Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_NITROGEN_ICE, "Nitrogen Ice Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_OXYGEN_ICE, "Oxygen Ice Ore Bearing Ground");
        add(CTags.BlockTags.ORES_LUTRUM, "Lutrum Ores");
        add(CTags.BlockTags.ORES_OBDURIUM, "Obdurium Ores");
        add(CTags.BlockTags.ORES_MALUNITE, "Malunite Ores");
        add(CTags.BlockTags.ORES_IN_GROUND_SILICATE_STONE, "Silicate Stone Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_BLUESCHIST, "Blueschist Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_BLUESLATE, "Blueslate Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_KARCASS_STONE, "Karcass Stone Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_WATER_ICE, "Water Ice Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_METHANE_ICE, "Methane Ice Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_NITROGEN_ICE, "Nitrogen Ice Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_OXYGEN_ICE, "Oxygen Ice Ores In Ground");
        add(CTags.BlockTags.STORAGE_BLOCKS_BRUMA, "Bruma Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_LUTRUM, "Lutrum Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_RAW_LUTRUM, "Raw Lutrum Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");
        // Centaurus-Specific Tags
        add(CTags.BlockTags.BASE_STONE_FRIGUS, "Frigus Base Stones");
        add(CTags.BlockTags.FRIGUS_CARVER_REPLACEABLES, "Frigus Carver Replaceables");
        add(CTags.BlockTags.MAYURA_LOGS, "Mayura Logs");
        add(CTags.BlockTags.GRIMWOOD_LOGS, "Grimwood Logs");
        add(CTags.BlockTags.CONVERTABLE_TO_FRIGUS_MUD, "Convertable to Frigus Mud");
        add(CTags.BlockTags.SILICATE_STONE_ORE_REPLACEABLES, "Silicate Stone Ore Replaceables");
        add(CTags.BlockTags.BLUESCHIST_ORE_REPLACEABLES, "Blueschist Ore Replaceables");
        add(CTags.BlockTags.BLUESLATE_ORE_REPLACEABLES, "Blueslate Ore Replaceables");
        add(CTags.BlockTags.KARCASS_STONE_ORE_REPLACEABLES, "Karcass Stone Ore Replaceables");
        add(CTags.BlockTags.NEEDS_LUTRUM_TOOL, "Needs Lutrum Tool");
        add(CTags.BlockTags.NEEDS_OBDURIUM_TOOL, "Needs Obdurium Tool");
        add(CTags.BlockTags.NEEDS_MALUNITE_TOOL, "Needs Malunite Tool");

        // Block Item Tags
        add(CTags.ItemTags.COBBLESTONES_SILICATE_STONE, "Silicate Cobblestones");
        add(CTags.ItemTags.COBBLESTONES_BLUESCHIST, "Blueschist Cobblestones");
        add(CTags.ItemTags.COBBLESTONES_BLUESLATE, "Blueslate Cobblestones");
        add(CTags.ItemTags.COBBLESTONES_KARCASS_STONE, "Karcass Cobblestones");
        add(CTags.ItemTags.ORE_BEARING_GROUND_SILICATE_STONE, "Silicate Stone Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_BLUESCHIST, "Blueschist Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_BLUESLATE, "Blueslate Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_KARCASS_STONE, "Karcass Stone Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_WATER_ICE, "Water Ice Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_METHANE_ICE, "Methane Ice Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_NITROGEN_ICE, "Nitrogen Ice Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_OXYGEN_ICE, "Oxygen Ice Ore Bearing Ground");
        add(CTags.ItemTags.ORES_LUTRUM, "Lutrum Ores");
        add(CTags.ItemTags.ORES_OBDURIUM, "Obdurium Ores");
        add(CTags.ItemTags.ORES_MALUNITE, "Malunite Ores");
        add(CTags.ItemTags.ORES_IN_GROUND_SILICATE_STONE, "Silicate Stone Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_BLUESCHIST, "Blueschist Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_BLUESLATE, "Blueslate Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_KARCASS_STONE, "Karcass Stone Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_WATER_ICE, "Water Ice Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_METHANE_ICE, "Methane Ice Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_NITROGEN_ICE, "Nitrogen Ice Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_OXYGEN_ICE, "Oxygen Ice Ores In Ground");
        add(CTags.ItemTags.STORAGE_BLOCKS_BRUMA, "Bruma Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_LUTRUM, "Lutrum Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_RAW_LUTRUM, "Raw Lutrum Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");
        // Centaurus-Specific Tags
        add(CTags.ItemTags.MAYURA_LOGS, "Mayura Logs");
        add(CTags.ItemTags.GRIMWOOD_LOGS, "Grimwood Logs");

        // Item Tags
        add(CTags.ItemTags.CROPS_BRUMA, "Bruma Crops");
        add(CTags.ItemTags.CROPS_AZURE_ROOT, "Azure Root Crops");
        add(CTags.ItemTags.RAW_MATERIALS_LUTRUM, "Lutrum Raw Materials");
        add(CTags.ItemTags.RAW_MATERIALS_OBDURIUM, "Obdurium Raw Materials");
        add(CTags.ItemTags.RAW_MATERIALS_MALUNITE, "Malunite Raw Materials");
        add(CTags.ItemTags.NUGGETS_LUTRUM, "Lutrum Nuggets");
        add(CTags.ItemTags.NUGGETS_OBDURIUM, "Obdurium Nuggets");
        add(CTags.ItemTags.NUGGETS_MALUNITE, "Malunite Nuggets");
        add(CTags.ItemTags.INGOTS_LUTRUM, "Lutrum Ingots");
        add(CTags.ItemTags.INGOTS_OBDURIUM, "Obdurium Ingots");
        add(CTags.ItemTags.INGOTS_MALUNITE, "Malunite Ingots");
        add(CTags.ItemTags.PLATES_LUTRUM, "Lutrum Plates");
        add(CTags.ItemTags.PLATES_OBDURIUM, "Obdurium Plates");
        add(CTags.ItemTags.PLATES_MALUNITE, "Malunite Plates");
        add(CTags.ItemTags.RODS_LUTRUM, "Lutrum Rods");
        add(CTags.ItemTags.RODS_OBDURIUM, "Obdurium Rods");
        add(CTags.ItemTags.RODS_MALUNITE, "Malunite Rods");
        // endregion

        // region GUI Translations
        add(CCreativeTab.CREATIVE_TAB_TITLE, "Centaurus");

        // region Cygnus GUI Translations
        // Stars
        add("star.centaurus.alpha_centauri", "Alpha Centauri");
        add("star.centaurus.alpha_centauri_a", "Rigil Kentaurus");
        add("star.centaurus.alpha_centauri_b", "Toliman");
        add("star.centaurus.proxima_centauri", "Proxima Centauri");
        add("star.centaurus.sentinel", "Sentinel");
        add("star.centaurus.hades", "Hades");
        add("star.centaurus.cynon", "Cynon");
        add("star.centaurus.selloa", "Selloa");
        // Planets
        add("planet.cygnus.ceres", "Ceres");
        add("planet.cygnus.jupiter", "Jupiter");
        add("planet.cygnus.io", "Io");
        add("planet.cygnus.europa", "Europa");
        add("planet.cygnus.ganymede", "Ganymede");
        add("planet.cygnus.callisto", "Callisto");
        add("planet.cygnus.saturn", "Saturn");
        add("planet.cygnus.mimas", "Mimas");
        add("planet.cygnus.enceladus", "Enceladus");
        add("planet.cygnus.tethys", "Tethys");
        add("planet.cygnus.", "Dione");
        add("planet.cygnus.rhea", "Rhea");
        add("planet.cygnus.titan", "Titan");
        add("planet.cygnus.hyperion", "Hyperion");
        add("planet.cygnus.iapetus", "Iapetus");
        add("planet.cygnus.uranus", "Uranus");
        add("planet.cygnus.miranda", "Miranda");
        add("planet.cygnus.ariel", "Ariel");
        add("planet.cygnus.umbriel ", "Umbriel ");
        add("planet.cygnus.titania", "Titania");
        add("planet.cygnus.oberon", "Oberon");
        add("planet.cygnus.neptune", "Neptune");
        add("planet.cygnus.triton", "Triton");
        add("planet.cygnus.pluto", "Pluto");
        add("planet.cygnus.charon", "Charon");
        add("planet.cygnus.styx", "Styx");
        add("planet.cygnus.nix", "Nix");
        add("planet.cygnus.kerberos", "Kerberos");
        add("planet.cygnus.hydra", "Hydra");
        add("planet.cygnus.haumea", "Haumea");
        add("planet.cygnus.namaka", "Namaka");
        add("planet.cygnus.hiiaka", "Hiʻiaka");
        add("planet.cygnus.makemake", "Makemake");
        add("planet.cygnus.mk2", "Kenatea");
        add("planet.cygnus.eris", "Eris");
        add("planet.cygnus.dysnomia", "Dysnomia");

        add("planet.centaurus.asano", "Asano");
        add("planet.centaurus.indra", "Indra");
        add("planet.centaurus.accola", "Accola");
        add("planet.centaurus.vicinus", "Vicinus");
        add("planet.centaurus.ignis", "Ignis");
        add("planet.centaurus.frigus", "Frigus");

        add("planet.centaurus.vanguard", "Vanguard");
        add("planet.centaurus.alkridge", "Alkridge");
        add("planet.centaurus.arx", "Arx");
        add("planet.centaurus.castra", "Castra");
        add("planet.centaurus.obia", "Obia");
        add("planet.centaurus.kador", "Kador");

        add("planet.centaurus.infurnix", "Infurnix");
        add("planet.centaurus.him", "Him.");
        add("planet.centaurus.why_did", "Obtutus");
        add("planet.centaurus.you_leave_us", "Vultus");

        add("planet.centaurus.opacios", "Opacios");
        add("planet.centaurus.phanis", "Phanis");

        add("planet.centaurus.tempus", "Tempus");
        // endregion
        // endregion

        // region Automated Translations
        // Blocks
        CBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> addBlock(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))
                ));

        // Items
        CItems.ITEMS.getEntries()
                .stream()
                .filter(i -> !(i.get() instanceof BlockItem) && !excludedItems.contains(i))
                .forEach(entry -> addItem(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))
                ));
        // endregion
    }
}