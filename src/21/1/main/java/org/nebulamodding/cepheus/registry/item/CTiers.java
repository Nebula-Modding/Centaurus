package org.nebulamodding.cepheus.registry.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import org.nebulamodding.cepheus.registry.CTags;

public class CTiers {
    public static final Tier
            LUTRUM = new SimpleTier(CTags.BlockTags.NEEDS_LUTRUM_TOOL, 527, 7, 3, 17, () -> Ingredient.of(CTags.ItemTags.INGOTS_LUTRUM)), // todo: make the same as copper
            OBDURIUM = new SimpleTier(CTags.BlockTags.NEEDS_OBDURIUM_TOOL, 9327, 2, 5, 15, () -> Ingredient.of(CTags.ItemTags.INGOTS_OBDURIUM)),
            MALUNITE = new SimpleTier(CTags.BlockTags.NEEDS_MALUNITE_TOOL, 713, 7, 3, 22, () -> Ingredient.of(CTags.ItemTags.INGOTS_MALUNITE));
}