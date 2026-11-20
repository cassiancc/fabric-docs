package com.example.docs.projectile;

import com.example.docs.entity.ModEntityTypeIds;

import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.fabricmc.api.ClientModInitializer;

import com.example.docs.entity.ModEntityTypes;

import net.minecraft.core.Registry;

// #region entrypoint
public class ExampleModProjectileClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// region renderer
		EntityRenderers.register(BuiltInClientRegistries.ENTITY_RENDERER, ModEntityTypes.HOT_TATER, ThrownItemRenderer::new);
		// endregion renderer
	}
}
// #endregion entrypoint
