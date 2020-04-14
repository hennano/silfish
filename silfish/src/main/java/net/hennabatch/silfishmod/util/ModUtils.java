package net.hennabatch.silfishmod.util;

import net.minecraft.util.ResourceLocation;

public class ModUtils {

	public static ResourceLocation location(String name) {
		return new ResourceLocation(Reference.modid, name);
	}
}
