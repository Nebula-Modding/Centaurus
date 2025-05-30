package io.github.nebulamodding.cepheus.datagen.data;

import io.github.nebulamodding.cepheus.Cepheus;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class CBuiltinEntriesProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder REGISTRY_SET_BUILDER = new RegistrySetBuilder()
            //.add(Registries.BIOME, EUBiomes::bootstrap)
            //.add(Registries.CONFIGURED_CARVER, EUCarvers::bootstrap)
            //.add(Registries.CONFIGURED_FEATURE, EUConfiguredFeatures::bootstrap)
            //.add(Registries.DAMAGE_TYPE, EUDamageTypes::bootstrap)
            //.add(Registries.DIMENSION_TYPE, EUDimensions::bootstrap)
            //.add(Registries.ENCHANTMENT, EUEnchantments::bootstrap)
            //.add(Registries.LEVEL_STEM, EUWorldgen::bootstrap)
            //.add(Registries.NOISE_SETTINGS, EUWorldgen::bootstrap)
            //.add(Registries.PAINTING_VARIANT, EUPaintings::bootstrap)
            //.add(Registries.PLACED_FEATURE, EUPlacedFeatures::bootstrap)
            //.add(Registries.PROCESSOR_LIST, EUProcessorLists::bootstrap)
            //.add(Registries.STRUCTURE, EUStructures::bootstrap)
            //.add(Registries.STRUCTURE_SET, EUStructureSets::bootstrap)
            //.add(Registries.TEMPLATE_POOL, EUTemplatePools::bootstrap)
            ;
    public CBuiltinEntriesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, REGISTRY_SET_BUILDER, Set.of(Cepheus.MOD_ID));
    }
}
