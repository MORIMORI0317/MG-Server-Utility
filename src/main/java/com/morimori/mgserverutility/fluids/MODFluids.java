package com.morimori.mgserverutility.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import slimeknights.tconstruct.library.Util;
import slimeknights.tconstruct.library.fluid.FluidMolten;

public class MODFluids {
	public static Fluid MOLTEN_TELEKILL_ALLOY = new FluidMolten("telekillalloy", 3430212);
	public static Fluid MOLTEN_VANADIUM_STEEL = new FluidMolten("vanadiumsteel", 13882323);
	public static Fluid MOLTEN_DATA_EXPUNGED = new FluidMolten("dataexpunged", 0);
	public static Fluid MOLTEN_VOID = new FluidMolten("void", 3083066);

	public static void regFluid() {

		FluidRegister(MOLTEN_TELEKILL_ALLOY, 450);
		FluidRegister(MOLTEN_VANADIUM_STEEL, 450);
		FluidRegister(MOLTEN_DATA_EXPUNGED, -273);
		FluidRegister(MOLTEN_VOID, 0);

	}

	private static void FluidRegister(Fluid fluid, int temp) {
		fluid.setTemperature(temp);
		fluid.setUnlocalizedName(Util.prefix(fluid.getName()));
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
