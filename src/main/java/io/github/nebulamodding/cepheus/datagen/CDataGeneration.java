package io.github.nebulamodding.cepheus.datagen;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.datagen.assets.CBlockStateProvider;
import io.github.nebulamodding.cepheus.datagen.assets.CItemModelProvider;
import io.github.nebulamodding.cepheus.datagen.assets.CLanguageProvider;
import io.github.nebulamodding.cepheus.datagen.data.CDataMapProvider;
import io.github.nebulamodding.cepheus.datagen.data.CRecipeProvider;
import io.github.nebulamodding.cepheus.datagen.data.loot.CLootTableProvider;
import io.github.nebulamodding.cepheus.datagen.data.tags.CBlockTagProvider;
import io.github.nebulamodding.cepheus.datagen.data.tags.CItemTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class CDataGeneration {
    public static void gatherData(GatherDataEvent event) {
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
            // Generates the assets
            if (event.includeClient()) {
                generator.addProvider(true, new CLanguageProvider(output));
                generator.addProvider(true, new CBlockStateProvider(output, existingFileHelper));
                generator.addProvider(true, new CItemModelProvider(output, existingFileHelper));
            }
            // Generates the data
            if (event.includeServer()) {
                CBlockTagProvider blockTagsProvider = new CBlockTagProvider(output, lookupProvider, existingFileHelper); generator.addProvider(true, blockTagsProvider);
                generator.addProvider(true, new CItemTagProvider(output, event.getLookupProvider(), blockTagsProvider, existingFileHelper));
                generator.addProvider(true, new CLootTableProvider(output, lookupProvider));
                generator.addProvider(true, new CRecipeProvider(output, lookupProvider));
                generator.addProvider(true, new CDataMapProvider(output, lookupProvider));
            }
        } catch (RuntimeException e) {
            Cepheus.LOGGER.error("Failed to gather Cepheus's data", e);
        }
    }
}