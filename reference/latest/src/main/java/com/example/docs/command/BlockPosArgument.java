package com.example.docs.command;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.commands.ParseContext;
import net.minecraft.commands.arguments.SerializableArgument;
import net.minecraft.core.BlockPos;


// #region custom_argument_types
public class BlockPosArgument implements SerializableArgument<BlockPos> {

	private static final BlockPosArgument INSTANCE = new BlockPosArgument();
	public static final SerializableArgument.Type<BlockPosArgument> TYPE =
			SerializableArgument.singletonType(INSTANCE);

	public static ArgumentType<BlockPos> blockPos() {
		// Getting the argument type is done by calling `SerializableArgument#toBrigadier`.
		// If your argument has parameters in its constructor, you would add them to this
		// method and then call `toBrigadier` on the constructed argument.
		return INSTANCE.toBrigadier();
	}

	/**
	 * Parse the BlockPos from the reader in the {x, y, z} format.
	 */
	@Override
	public BlockPos parse(StringReader reader, ParseContext contex) throws CommandSyntaxException {
		try {
			// This requires the argument to be surrounded by quotation marks.
			// eg: "{1, 2, 3}"
			String string = reader.readString();

			// Remove the { and } from the string using regex.
			string = string.replace("{", "").replace("}", "");

			// Split the string into the x, y, and z values.
			String[] split = string.split(",");

			// Parse the x, y, and z values from the split string.
			int x = Integer.parseInt(split[0].trim());
			int y = Integer.parseInt(split[1].trim());
			int z = Integer.parseInt(split[2].trim());

			// Return the BlockPos.
			return new BlockPos(x, y, z);
		} catch (Exception e) {
			// Throw an exception if anything fails inside the try block.
			throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherParseException().create("Invalid BlockPos format. Expected {x, y, z}");
		}
	}

	@Override
	public Type<? extends SerializableArgument<BlockPos>> type() {
		return TYPE;
	}
}
// #endregion custom_argument_types
