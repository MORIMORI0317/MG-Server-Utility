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
	public static Fluid MOLTEN_NAQUADAH_ALLOY = new FluidMolten("naquadahalloy", 2302755);
	public static Fluid MOLTEN_TUNGSTEN_STEEL = new FluidMolten("tungstensteel", 2964308);
	public static Fluid MOLTEN_ULTIMET = new FluidMolten("ultimet", 9085907);
	public static Fluid MOLTEN_NAQUADAH = new FluidMolten("naquadah", Integer.parseInt("100F0F", 16));

	public static void regFluid() {

		FluidRegister(MOLTEN_TELEKILL_ALLOY, 450);
		FluidRegister(MOLTEN_VANADIUM_STEEL, 450);
		FluidRegister(MOLTEN_DATA_EXPUNGED, -273);
		FluidRegister(MOLTEN_VOID, 0);
		FluidRegister(MOLTEN_NAQUADAH_ALLOY, 1526);
		FluidRegister(MOLTEN_TUNGSTEN_STEEL, 900);
		FluidRegister(MOLTEN_ULTIMET, 8000);
		FluidRegister(MOLTEN_NAQUADAH, 1000);
	}

	private static void FluidRegister(Fluid fluid, int temp) {
		fluid.setTemperature(temp);
		fluid.setUnlocalizedName(Util.prefix(fluid.getName()));
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
