package org.nebulamodding.centaurus.datagen;

import org.nebulamodding.centaurus.Centaurus;
import org.nebulamodding.centaurus.datagen.assets.CBlockStateProvider;
import org.nebulamodding.centaurus.datagen.assets.CItemModelProvider;
import org.nebulamodding.centaurus.datagen.assets.CLanguageProvider;
import org.nebulamodding.centaurus.datagen.assets.CSoundDefinitionsProvider;
import org.nebulamodding.centaurus.datagen.data.CDataMapProvider;
import org.nebulamodding.centaurus.datagen.data.CRecipeProvider;
import org.nebulamodding.centaurus.datagen.data.loot.CLootTableProvider;
import org.nebulamodding.centaurus.datagen.data.tags.CBlockTagProvider;
import org.nebulamodding.centaurus.datagen.data.tags.CItemTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Centaurus.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class CDataGeneration {
    @SubscribeEvent
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
                generator.addProvider(true, new CSoundDefinitionsProvider(output, existingFileHelper));
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
            Centaurus.LOGGER.error("Failed to gather Cepheus's data", e);
        }
    }
}