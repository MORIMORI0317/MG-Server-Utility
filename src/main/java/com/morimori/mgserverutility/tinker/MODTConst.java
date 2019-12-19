package com.morimori.mgserverutility.tinker;

import com.buuz135.industrial.proxy.FluidsRegistry;
import com.morimori.mgserverutility.fluids.MODFluids;

import alexiy.secure.contain.protect.SCP;
import alexiy.secure.contain.protect.registration.SCPBlocks;
import defeatedcrow.hac.main.MainInit;
import mekanism.common.MekanismFluids;
import net.minecraftforge.fluids.FluidStack;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.shared.TinkerFluids;

public class MODTConst {
	public static void preinit() {

	}

	public static void init() {
		MekanismFluids.FusionFuel.getFluid().setTemperature(8300);
	}

	public static void postinit() {

		TinkerRegistry.registerAlloy(
				new FluidStack(MODFluids.MOLTEN_DATA_EXPUNGED, 72),
				new FluidStack(SCPBlocks.youthFluid, 10),
				new FluidStack(SCP.redFluid, 10),
				new FluidStack(MODFluids.MOLTEN_TELEKILL_ALLOY, 144),
				new FluidStack(MODFluids.MOLTEN_VOID, 500),
				new FluidStack(TinkerFluids.blood, 1000),
				new FluidStack(MekanismFluids.FusionFuel.getFluid(), 250));

		TinkerRegistry.registerAlloy(
				new FluidStack(MODFluids.MOLTEN_VOID, 144),
				new FluidStack(TinkerFluids.manyullyn, 10),
				new FluidStack(TinkerFluids.obsidian, 10),
				new FluidStack(FluidsRegistry.SLUDGE, 10),
				new FluidStack(MainInit.mazai, 10),
				new FluidStack(MainInit.coffee, 10));

		TinkerRegistry.registerSmelteryFuel(new FluidStack(MekanismFluids.FusionFuel.getFluid(), 50), 1000);

	}
}
