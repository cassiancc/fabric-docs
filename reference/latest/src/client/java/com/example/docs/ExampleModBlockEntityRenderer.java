package com.example.docs;

import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

import net.fabricmc.api.ClientModInitializer;

import com.example.docs.block.entity.ModBlockEntities;
import com.example.docs.rendering.blockentity.CounterBlockEntityRenderer;

import net.minecraft.core.WritableRegistry;

// #region register_block_entity_renderer
public class ExampleModBlockEntityRenderer implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockEntityRenderers.register((WritableRegistry<BlockEntityRendererProvider<?,?>>) BuiltInClientRegistries.BLOCK_ENTITY_RENDERER, ModBlockEntities.COUNTER_BLOCK_ENTITY, CounterBlockEntityRenderer::new);
	}
}
// #endregion register_block_entity_renderer
