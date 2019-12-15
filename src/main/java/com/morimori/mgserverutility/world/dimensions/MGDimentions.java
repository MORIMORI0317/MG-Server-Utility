package com.morimori.mgserverutility.world.dimensions;

import com.morimori.mgserverutility.config.MGConfig;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class MGDimentions {

	public static DimensionType OUT_OF_THIS_DIMENSION;

	public static void init() {
		OUT_OF_THIS_DIMENSION = DimensionType.register("Out of This Dimension", "_outofthisdimension", MGConfig.OOD_ID,
				OutOfThisDimensionProvider.class, true);

		DimensionManager.registerDimension(OUT_OF_THIS_DIMENSION.getId(), OUT_OF_THIS_DIMENSION);
	}
}
