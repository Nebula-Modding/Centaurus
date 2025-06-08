package io.github.nebulamodding.cepheus.registry.item;

import io.github.nebulamodding.cepheus.registry.CTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class CTiers {
    public static final Tier
            LUTRUM = new SimpleTier(CTags.BlockTags.NEEDS_LUTRUM_TOOL, 527, 7, 3, 17, () -> Ingredient.of(CTags.ItemTags.INGOTS_LUTRUM)),
            OBDURIUM = new SimpleTier(CTags.BlockTags.NEEDS_OBDURIUM_TOOL, 9327, 2, 5, 15, () -> Ingredient.of(CTags.ItemTags.INGOTS_OBDURIUM)),
            MALUNITE = new SimpleTier(CTags.BlockTags.NEEDS_MALUNITE_TOOL, 713, 7, 3, 22, () -> Ingredient.of(CTags.ItemTags.INGOTS_MALUNITE));
}