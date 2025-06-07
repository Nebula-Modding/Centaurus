package io.github.nebulamodding.cepheus.datagen.data.loot;

import io.github.nebulamodding.cepheus.registry.CEntities;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public class CEntityLootProvider extends EntityLootSubProvider {
    protected CEntityLootProvider(HolderLookup.Provider registries) {
        super(FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {
        // I'm going to put something here I swear!!!
    }

    @Override
    protected @NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        return CEntities.ENTITIES.getEntries()
                .stream()
                .map(DeferredHolder::get);
    }
}
