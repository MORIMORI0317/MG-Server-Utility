package com.morimori.mgserverutility.hac;

import com.morimori.mgserverutility.blocks.MODBlocks;
import com.morimori.mgserverutility.items.MGArmorMaterial;

import defeatedcrow.hac.api.climate.ClimateAPI;
import defeatedcrow.hac.api.climate.DCAirflow;
import defeatedcrow.hac.api.climate.DCHumidity;
import defeatedcrow.hac.api.damage.DamageAPI;

public class MGHeatAndClimeit {
	public static void preInit() {

	}

	public static void Init() {

	}

	public static void posInit() {

		DamageAPI.armorRegister.registerMaterial(MGArmorMaterial.IKISUGINITHI, Integer.MAX_VALUE, Integer.MAX_VALUE);
		ClimateAPI.registerBlock.registerAirBlock(MODBlocks.OOD_TELEPORT_BLOCK, 0, DCAirflow.WIND);
		ClimateAPI.registerBlock.registerHumBlock(MODBlocks.OOD_TELEPORT_BLOCK, 0, DCHumidity.DRY);

	}
}
