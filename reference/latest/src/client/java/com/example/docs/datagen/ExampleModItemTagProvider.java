package com.example.docs.datagen;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;

import com.example.docs.ExampleMod;

// :::datagen-tags:provider
public class ExampleModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
	// :::datagen-tags:provider
	// :::datagen-tags:tag-key
	public static final TagKey<Item> SMELLY_ITEMS = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, "smelly_items"));
	// :::datagen-tags:tag-key
	// :::datagen-tags:provider
	public ExampleModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void addTags(HolderLookup.Provider wrapperLookup) {
		// :::datagen-tags:provider
		// :::datagen-tags:build
		builder(SMELLY_ITEMS)
				.add(ItemIds.SLIME_BALL)
				.add(ItemIds.ROTTEN_FLESH)
				.addOptionalTag(ItemTags.DIRT)
				.add(BlockItemIds.OAK_PLANKS)
				.forceAddTag(ItemTags.BANNERS)
				.setReplace(true);
		// :::datagen-tags:build
		// :::datagen-tags:provider
	}
}
// :::datagen-tags:provider
