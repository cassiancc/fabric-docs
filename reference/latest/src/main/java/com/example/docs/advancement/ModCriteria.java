package com.example.docs.advancement;

import net.minecraft.advancements.triggers.Criterion;
import net.minecraft.advancements.triggers.SimpleCriterionTrigger;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import com.example.docs.ExampleMod;

// :::datagen-advancements:mod-criteria
public class ModCriteria {
	// :::datagen-advancements:mod-criteria-init
	// :::datagen-advancements:mod-criteria
	public static final UseToolCriterion USE_TOOL = register("use_tool", new UseToolCriterion());

	// :::datagen-advancements:mod-criteria
	// :::datagen-advancements:new-mod-criteria
	public static final ParameterizedUseToolCriterion PARAMETERIZED_USE_TOOL = register("parameterized_use_tool", new ParameterizedUseToolCriterion());

	// :::datagen-advancements:mod-criteria
	// :::datagen-advancements:mod-criteria-init
	private static <T extends SimpleCriterionTrigger<?>> T register(String name, T criterion) {
		return Registry.register(BuiltInRegistries.TRIGGER_TYPES, Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, name), criterion);
	}

	public static void init() {
	}

	// :::datagen-advancements:new-mod-criteria
	// :::datagen-advancements:mod-criteria
}

// :::datagen-advancements:mod-criteria
