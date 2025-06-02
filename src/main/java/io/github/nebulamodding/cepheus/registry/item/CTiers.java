package io.github.nebulamodding.cepheus.registry.item;

import io.github.nebulamodding.cepheus.registry.CTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class CTiers {
    public static final Tier
            LUTRUM = new SimpleTier(CTags.CBlockTags.NEEDS_LUTRUM_TOOL, 527, 7, 3, 17, () -> Ingredient.of(CItems.LUTRUM_ITEMS.get("lutrum_ingot"))),
            OBDURIUM = new SimpleTier(CTags.CBlockTags.NEEDS_OBDURIUM_TOOL, 9327, 2, 5, 15, () -> Ingredient.of(CItems.OBDURIUM_ITEMS.get("obdurium_ingot"))),
            MALUNITE = new SimpleTier(CTags.CBlockTags.NEEDS_MALUNITE_TOOL, 713, 7, 3, 22, () -> Ingredient.of(CItems.MALUNITE_ITEMS.get("malunite_ingot")));
}