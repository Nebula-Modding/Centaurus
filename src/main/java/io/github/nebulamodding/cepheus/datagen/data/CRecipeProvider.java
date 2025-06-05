package io.github.nebulamodding.cepheus.datagen.data;

import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class CRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public CRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        doorBuilder(CBlocks.MAYURA_DOOR.get(), Ingredient.of(CBlocks.MAYURA_PLANKS.get())).group("mayura")
                .unlockedBy("has_mayura", has(CBlocks.MAYURA_PLANKS.get())).save(recipeOutput);
    }
}
