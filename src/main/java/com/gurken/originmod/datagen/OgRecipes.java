package com.gurken.originmod.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.function.Consumer;

public class OgRecipes extends RecipeProvider {

    public OgRecipes(DataGenerator generatorIn) { super(generatorIn); }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

    }
}
