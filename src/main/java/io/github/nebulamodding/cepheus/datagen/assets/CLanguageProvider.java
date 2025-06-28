package io.github.nebulamodding.cepheus.datagen.assets;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import io.github.nebulamodding.cepheus.registry.item.CItems;
import io.github.nebulamodding.cepheus.registry.CCreativeTab;
import io.github.nebulamodding.cepheus.registry.CTags;
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
        super(output, Cepheus.MOD_ID, "en_us");
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
        add(CTags.BlockTags.COBBLESTONES_BLUESCHIST, "Blueschist Cobblestones");
        add(CTags.BlockTags.COBBLESTONES_BLUESLATE, "Blue Shale Cobblestones");
        add(CTags.BlockTags.COBBLESTONES_KARCASS_STONE, "Karcass Cobblestones");
        add(CTags.BlockTags.ORE_BEARING_GROUND_BLUESCHIST, "Blueschist Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_BLUESLATE, "Blue Shale Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_KARCASS_STONE, "Karcass Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_WATER_ICE, "Water Ice Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_METHANE_ICE, "Methane Ice Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_NITROGEN_ICE, "Nitrogen Ice Ore Bearing Ground");
        add(CTags.BlockTags.ORE_BEARING_GROUND_OXYGEN_ICE, "Oxygen Ice Ore Bearing Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_BLUESCHIST, "Blueschist Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_BLUESLATE, "Blue Shale Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_KARCASS_STONE, "Karcass Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_WATER_ICE, "Water Ice Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_METHANE_ICE, "Methane Ice Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_NITROGEN_ICE, "Nitrogen Ice Ores In Ground");
        add(CTags.BlockTags.ORES_IN_GROUND_OXYGEN_ICE, "Oxygen Ice Ores In Ground");
        add(CTags.BlockTags.ORES_LUTRUM, "Lutrum Ores");
        add(CTags.BlockTags.ORES_OBDURIUM, "Obdurium Ores");
        add(CTags.BlockTags.ORES_MALUNITE, "Malunite Ores");
        add(CTags.BlockTags.STORAGE_BLOCKS_BRUMA, "Bruma Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_LUTRUM, "Lutrum Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_RAW_LUTRUM, "Raw Lutrum Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(CTags.BlockTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");
        // Cepheus-Specific Tags
        add(CTags.BlockTags.NEEDS_LUTRUM_TOOL, "Needs Lutrum Tool");
        add(CTags.BlockTags.NEEDS_OBDURIUM_TOOL, "Needs Obdurium Tool");
        add(CTags.BlockTags.NEEDS_MALUNITE_TOOL, "Needs Malunite Tool");
        add(CTags.BlockTags.BASE_STONE_FRIGUS, "Frigus Base Stones");
        add(CTags.BlockTags.FRIGUS_CARVER_REPLACEABLES, "Frigus Carver Replaceables");
        add(CTags.BlockTags.BLUESCHIST_ORE_REPLACEABLES, "Blueschist Ore Replaceables");
        add(CTags.BlockTags.BLUESLATE_ORE_REPLACEABLES, "Blue Shale Ore Replaceables");
        add(CTags.BlockTags.KARCASS_STONE_ORE_REPLACEABLES, "Karcass Ore Replaceables");
        add(CTags.BlockTags.CONVERTABLE_TO_FRIGUS_MUD, "Convertable to Frigus Mud");
        add(CTags.BlockTags.MAYURA_LOGS, "Mayura Logs");
        add(CTags.BlockTags.GRIMWOOD_LOGS, "Grimwood Logs");

        // Block Item Tags
        add(CTags.ItemTags.COBBLESTONES_BLUESCHIST, "Blueschist Cobblestones");
        add(CTags.ItemTags.COBBLESTONES_BLUESLATE, "Blue Shale Cobblestones");
        add(CTags.ItemTags.COBBLESTONES_KARCASS_STONE, "Karcass Cobblestones");
        add(CTags.ItemTags.ORE_BEARING_GROUND_BLUESCHIST, "Blueschist Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_BLUESLATE, "Blue Shale Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_KARCASS_STONE, "Karcass Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_WATER_ICE, "Water Ice Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_METHANE_ICE, "Methane Ice Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_NITROGEN_ICE, "Nitrogen Ice Ore Bearing Ground");
        add(CTags.ItemTags.ORE_BEARING_GROUND_OXYGEN_ICE, "Oxygen Ice Ore Bearing Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_BLUESCHIST, "Blueschist Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_BLUESLATE, "Blue Shale Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_KARCASS_STONE, "Karcass Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_WATER_ICE, "Water Ice Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_METHANE_ICE, "Methane Ice Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_NITROGEN_ICE, "Nitrogen Ice Ores In Ground");
        add(CTags.ItemTags.ORES_IN_GROUND_OXYGEN_ICE, "Oxygen Ice Ores In Ground");
        add(CTags.ItemTags.ORES_LUTRUM, "Lutrum Ores");
        add(CTags.ItemTags.ORES_OBDURIUM, "Obdurium Ores");
        add(CTags.ItemTags.ORES_MALUNITE, "Malunite Ores");
        add(CTags.ItemTags.STORAGE_BLOCKS_BRUMA, "Bruma Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_LUTRUM, "Lutrum Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_RAW_LUTRUM, "Raw Lutrum Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(CTags.ItemTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");
        // Cepheus-Specific Tags
        add(CTags.ItemTags.MAYURA_LOGS, "Mayura Logs");
        add(CTags.ItemTags.GRIMWOOD_LOGS, "Grimwood Logs");

        // Item Tags
        add(CTags.ItemTags.PLATES, "Plates");
        add(CTags.ItemTags.RAW_MATERIALS_LUTRUM, "Lutrum Raw Materials");
        add(CTags.ItemTags.NUGGETS_LUTRUM, "Lutrum Nuggets");
        add(CTags.ItemTags.INGOTS_LUTRUM, "Lutrum Ingots");
        add(CTags.ItemTags.PLATES_LUTRUM, "Lutrum Plates");
        add(CTags.ItemTags.RODS_LUTRUM, "Lutrum Rods");
        add(CTags.ItemTags.RAW_MATERIALS_OBDURIUM, "Obdurium Raw Materials");
        add(CTags.ItemTags.NUGGETS_OBDURIUM, "Obdurium Nuggets");
        add(CTags.ItemTags.INGOTS_OBDURIUM, "Obdurium Ingots");
        add(CTags.ItemTags.PLATES_OBDURIUM, "Obdurium Plates");
        add(CTags.ItemTags.RODS_OBDURIUM, "Obdurium Rods");
        add(CTags.ItemTags.RAW_MATERIALS_MALUNITE, "Malunite Raw Materials");
        add(CTags.ItemTags.NUGGETS_MALUNITE, "Malunite Nuggets");
        add(CTags.ItemTags.INGOTS_MALUNITE, "Malunite Ingots");
        add(CTags.ItemTags.PLATES_MALUNITE, "Malunite Plates");
        add(CTags.ItemTags.RODS_MALUNITE, "Malunite Rods");
        // endregion

        // region GUI Translations
        add(CCreativeTab.CREATIVE_TAB_TITLE, "Cepheus");

        // region Cygnus GUI Translations
        add("planet.cygnus.ceres", "Ceres");
        add("planet.cygnus.jupiter", "Jupiter");
        add("planet.cygnus.io", "Io");
        add("planet.cygnus.europa", "Europa");
        add("planet.cygnus.ganymede", "Ganymede");
        add("planet.cygnus.callisto", "Callisto");
        add("planet.cygnus.saturn", "Saturn");
        add("planet.cygnus.titan", "Titan");
        add("planet.cygnus.iapetus", "Iapetus");
        add("planet.cygnus.uranus", "Uranus");
        add("planet.cygnus.neptune", "Neptune");
        add("planet.cygnus.triton", "Triton");
        add("planet.cygnus.pluto", "Pluto");
        add("planet.cygnus.charon", "Charon");
        add("planet.cygnus.styx", "Styx");
        add("planet.cygnus.nix", "Nix");
        add("planet.cygnus.kerberos", "Kerberos");
        add("planet.cygnus.hydra", "Hydra");
        add("planet.cygnus.eris", "Eris");
        add("planet.cygnus.dysnomia", "Dysnomia");

        add("star.cepheus.alpha_centauri", "Alpha Centauri");
        add("star.cepheus.alpha_centauri_a", "Rigil Kentaurus");
        add("star.cepheus.alpha_centauri_b", "Toliman");
        add("planet.cepheus.asano", "Asano");
        add("planet.cepheus.indra", "Indra");
        add("star.cepheus.proxima_centauri", "Proxima Centauri");
        add("planet.cepheus.proxima_centauri", "Proxima Centauri");
        add("planet.cepheus.accola", "Accola");
        add("planet.cepheus.vicinus", "Vicinus");
        add("planet.cepheus.ignis", "Ignis");
        add("planet.cepheus.frigus", "Frigus");

        add("star.cepheus.sentinel", "Sentinel");
        add("planet.cepheus.vanguard", "Vanguard");
        add("planet.cepheus.alkridge", "Alkridge");
        add("planet.cepheus.arx", "Arx");
        add("planet.cepheus.castra", "Castra");
        add("planet.cepheus.obia", "Obia");
        add("planet.cepheus.kador", "Kador");

        add("star.cepheus.hades", "Hades");
        add("planet.cepheus.infurnix", "Infurnix");
        add("planet.cepheus.him", "Him."); // I know literally 0 people will check the source code :sob:
        add("planet.cepheus.why_did", "Obtutus");
        add("planet.cepheus.you_leave_us", "Vultus");
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