package com.example.docs.appearance;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.fabricmc.api.ModInitializer;

import com.example.docs.ExampleMod;

public class ExampleModAppearance implements ModInitializer {
	// :::block
	public static final Block WAXCAP_BLOCK = Registry.register(
					BuiltInRegistries.BLOCK,
					ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "waxcap"),
					new Block(BlockBehaviour.Properties.of()
									.noCollission()
									.instabreak()
									.offsetType(BlockBehaviour.OffsetType.XYZ)
					));
	// :::block
	// :::item
	public static final Item WAXCAP_BLOCK_ITEM = Registry.register(
					BuiltInRegistries.ITEM,
					ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "waxcap"),
					new BlockItem(WAXCAP_BLOCK, new Item.Properties()
	));
	// :::item
	@Override
	public void onInitialize() {
	}
}
