package com.example.docs.datagen;

import net.minecraft.data.recipes.BrewingProvider;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;

import com.example.docs.potion.ExampleModPotions;

public class ExampleModBrewingProvider extends BrewingProvider {
	protected ExampleModBrewingProvider(RecipeOutput output) {
		super(output);
	}

	@Override
	protected void addContainers() {

	}

	@Override
	protected void addContainerTransformations() {

	}

	@Override
	protected void buildMixes() {
	// #region register_recipes
	buildMix(
				// Input potion.
				Potions.WATER,
				// Ingredient
				Items.POTATO,
				// Output potion.
				ExampleModPotions.TATER_POTION
);
	// #endregion register_recipes
	}
}
