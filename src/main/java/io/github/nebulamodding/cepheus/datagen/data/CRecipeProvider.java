package io.github.nebulamodding.cepheus.datagen.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public CRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        craftingRecipes(output);
        cookingRecipes(output);
        stonecuttingRecipes(output);
    }

    private void craftingRecipes(RecipeOutput output) {

    }

    private void cookingRecipes(RecipeOutput output) {

    }

    private void stonecuttingRecipes(RecipeOutput output) {

    }
}
