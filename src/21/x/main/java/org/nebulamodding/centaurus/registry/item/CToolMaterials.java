package org.nebulamodding.centaurus.registry.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.msrandom.multiplatform.annotations.Expect;
import net.neoforged.neoforge.common.SimpleTier;
import org.nebulamodding.centaurus.registry.CTags;

public class CToolMaterials {

    /*
    WOOD = 59, 2.0F, 0.0F, 15
    STONE = 131, 4.0F, 1.0F, 5
    COPPER = 190, 5.0F, 1.0F, 13
    IRON = 250, 6.0F, 2.0F, 14
    DIAMOND = 1561, 8.0F, 3.0F, 10
    GOLD = 32, 12.0F, 0.0F, 22
    NETHERITE = 2031, 9.0F, 4.0F, 15
     */

    public static final Tier
            LUTRUM = new SimpleTier(CTags.BlockTags.NEEDS_LUTRUM_TOOL, 190, 6.5F, 1.5F, 13, () -> Ingredient.of(CTags.ItemTags.INGOTS_LUTRUM)),
            OBDURIUM = new SimpleTier(CTags.BlockTags.NEEDS_OBDURIUM_TOOL, 9650, 1.0F, 5.0F, 15, () -> Ingredient.of(CTags.ItemTags.INGOTS_OBDURIUM)),
            MALUNITE = new SimpleTier(CTags.BlockTags.NEEDS_MALUNITE_TOOL, 720, 7.0F, 2.5F, 22, () -> Ingredient.of(CTags.ItemTags.INGOTS_MALUNITE));
}