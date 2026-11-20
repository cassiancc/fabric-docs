package com.example.docs.fluid;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;

import com.example.docs.fluid.custom.AcidFluid;
import com.example.docs.item.ModItemIds;

// #region register
public class ModFluids {
	public static final FlowingFluid ACID = register(ModFluidIds.ACID,
			new AcidFluid(Fluid.Properties.of().bucketItem(ModItemIds.ACID_BUCKET)));

	private static FlowingFluid register(ResourceKey<Fluid> key, FlowingFluid fluid) {
		return Registry.register(BuiltInRegistries.FLUID, key, fluid);
	}

	public static void initialize() {
	}
}
// #endregion register
