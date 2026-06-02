package com.example.docs.fluid;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.material.FlowingFluid;

import com.example.docs.ExampleMod;
import com.example.docs.fluid.custom.AcidFluid;

import net.minecraft.world.level.material.Fluid;

// :::register
public class ModFluids {
	public static final ResourceKey<Fluid> ACID_FLOWING_KEY = key("flowing_acid");
	public static final ResourceKey<Fluid> ACID_STILL_KEY = key("flowing_acid");

	public static final FlowingFluid ACID_FLOWING = register(ACID_FLOWING_KEY, new AcidFluid.Flowing());
	public static final FlowingFluid ACID_STILL = register(ACID_STILL_KEY, new AcidFluid.Source());

	private static FlowingFluid register(ResourceKey<Fluid> name, FlowingFluid fluid) {
		return Registry.register(BuiltInRegistries.FLUID, name, fluid);
	}

	private static ResourceKey<Fluid> key(String name) {
		return ResourceKey.create(Registries.FLUID, Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, name));
	}

	public static void initialize() {
	}
}
// :::register
