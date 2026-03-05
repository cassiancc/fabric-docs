package com.example.docs.appearance;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class ExampleModAppearanceClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// :::item_tint_source
		ColorProviderRegistry.ITEM.register((itemStack, i) -> {
			ClientLevel clientLevel = Minecraft.getInstance().level;
			if (clientLevel != null && clientLevel.isRaining()) {
				return 0x00BFFF;
			}

			return 0xFFEFD5; // Color code in hex format
		});
		// :::item_tint_source
		// :::color_provider
		ColorProviderRegistry.BLOCK.register((blockState, blockAndTintGetter, blockPos, i) -> {
			if (blockAndTintGetter != null && blockPos != null) {
				BlockState stateBelow = blockAndTintGetter.getBlockState(blockPos.below());

				if (stateBelow.is(Blocks.GRASS_BLOCK)) {
					return 0x98FB98; // Color code in hex format
				}
			}

			return 0xFFDAB9; // Color code in hex format
		}, ExampleModAppearance.WAXCAP_BLOCK);
		// :::color_provider

		// :::block_render_layer_map
		BlockRenderLayerMap.INSTANCE.putBlock(ExampleModAppearance.WAXCAP_BLOCK, RenderType.cutout());
		// :::block_render_layer_map
	}
}
