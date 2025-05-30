package io.github.nebulamodding.cepheus.datagen;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.datagen.assets.CBlockStateProvider;
import io.github.nebulamodding.cepheus.datagen.assets.CItemModelProvider;
import io.github.nebulamodding.cepheus.datagen.assets.CSoundDefinitionsProvider;
import io.github.nebulamodding.cepheus.datagen.assets.CLanguageProvider;
import io.github.nebulamodding.cepheus.datagen.data.CBuiltinEntriesProvider;
import io.github.nebulamodding.cepheus.datagen.data.loot.CLootTableProvider;
import io.github.nebulamodding.cepheus.datagen.data.tags.CBlockTagsProvider;
import io.github.nebulamodding.cepheus.datagen.data.tags.CItemTagsProvider;
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

            if (event.includeClient()) {
                // Generates the client-sided assets
                generator.addProvider(true, new CLanguageProvider(output));
                generator.addProvider(true, new CBlockStateProvider(output, existingFileHelper));
                generator.addProvider(true, new CItemModelProvider(output, existingFileHelper));
                generator.addProvider(true, new CSoundDefinitionsProvider(output, existingFileHelper));
            }
            if (event.includeServer()) {
                // Generates the server-sided data
                CBlockTagsProvider blockTagsProvider = new CBlockTagsProvider(output, event.getLookupProvider(), existingFileHelper);
                generator.addProvider(true, blockTagsProvider);
                generator.addProvider(true, new CItemTagsProvider(output, event.getLookupProvider(), blockTagsProvider, existingFileHelper));

                CompletableFuture<HolderLookup.Provider> newLookup = generator.addProvider(event.includeServer(), new CBuiltinEntriesProvider(output, event.getLookupProvider())).getRegistryProvider();
                generator.addProvider(true, new CLootTableProvider(output, newLookup));
            }
        } catch (RuntimeException e) {
            Cepheus.LOGGER.error("Failed to gather Cepheus's data", e);
        }
    }
}