package com.example.docs.appearance;

import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;

import org.jetbrains.annotations.NotNull;


import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

public class ExampleModAppearanceModelProvider extends FabricModelProvider {
	public ExampleModAppearanceModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
		blockStateModelGenerator.createCrossBlock(ExampleModAppearance.WAXCAP_BLOCK, BlockModelGenerators.TintState.TINTED);
	}

	@Override
	public void generateItemModels(ItemModelGenerators itemModelGenerator) {
		itemModelGenerator.generateFlatItem(ExampleModAppearance.WAXCAP_BLOCK_ITEM, ModelTemplates.FLAT_ITEM);
	}

	@Override
	public @NotNull String getName() {
		return "ExampleModAppearanceModelProvider";
	}
}
