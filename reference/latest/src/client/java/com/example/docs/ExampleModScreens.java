package com.example.docs;

import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.client.core.registries.ClientRegistries;
import net.minecraft.client.gui.screens.MenuScreens;

import net.fabricmc.api.ClientModInitializer;

import com.example.docs.menu.ModMenuTypes;
import com.example.docs.rendering.screens.inventory.DirtChestScreen;

import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

// #region register_screens
public class ExampleModScreens implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		MenuScreens.register((WritableRegistry<MenuScreens.ScreenConstructor<?,?>>) BuiltInClientRegistries.MENU_SCREEN, ModMenuTypes.DIRT_CHEST, DirtChestScreen::new);
	}
}
// #endregion register_screens
