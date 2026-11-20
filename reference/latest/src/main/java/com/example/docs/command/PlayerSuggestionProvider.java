package com.example.docs.command;

import com.mojang.brigadier.suggestion.SuggestionProvider;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.suggestions.SuggestionContext;
import net.minecraft.commands.suggestions.SuggestionProviders;

// #region suggestion_provider
public class PlayerSuggestionProvider {
	public static SuggestionProvider<CommandSourceStack> PLAYER_SUGGESTIONS = SuggestionProviders.serverOnly((server, context, builder) -> {
		return SuggestionContext.suggest(context.getSource().onlinePlayerNames(), builder);
	});
}
// #endregion suggestion_provider
