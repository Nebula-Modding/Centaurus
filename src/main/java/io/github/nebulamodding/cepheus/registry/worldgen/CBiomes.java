package io.github.nebulamodding.cepheus.registry.worldgen;

import io.github.nebulamodding.cepheus.Cepheus;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class CBiomes {

    /*
    Frigus
     */

    public static final ResourceKey<Biome>
            FRIGIAN_PLAINS = create("frigian_plains"),
            FRIGIAN_GLACIERS = create("frigian_glaciers"),
            MAYURA_FOREST = create("mayura_forest");

    /*
    Kador
     */

    public static final ResourceKey<Biome>
            BLIGHTED_FOREST = create("blighted_forest");

    /*
    Karnis
     */

    public static final ResourceKey<Biome>
            GRISTLED_WASTES = create("gristled_wastes");

    /*
    Helpers
     */

    public static ResourceKey<Biome> create(String name) {
        return ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Cepheus.MOD_ID, name));
    }
}