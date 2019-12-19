package com.morimori.mgserverutility.tinker;

import static slimeknights.tconstruct.library.utils.HarvestLevels.*;

import com.morimori.mgserverutility.fluids.MODFluids;
import com.morimori.mgserverutility.tinker.traits.MODTraits;

import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.BowMaterialStats;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.tools.TinkerMaterials;

public class MODMaterials {
	public static final Material telekillalloy = new Material("telekillalloy", 3430212);
	public static final Material vanadiumsteel = new Material("vanadiumsteel", 13882323);
	public static final Material carbon = new Material("carbon", 1973790);
	public static final Material blade_wood = new Material("bladewood", 14338522);
	public static final Material data_expunged = new Material("dataexpunged", 0);
	public static final Material voidnic = new Material("void", 3083066);

	public static final Material naquadahalloy = new Material("naquadahalloy", 2302755);
	public static final Material tungstensteel = new Material("tungstensteel", 2964308);
	public static final Material ultimet = new Material("ultimet", 9085907);

	public static void preInit() {
		TinkerRegistry.addMaterialStats(telekillalloy,
				new HeadMaterialStats(1000, 15.40f, 8.00f, COBALT),
				new HandleMaterialStats(1.05f, 200),
				new ExtraMaterialStats(10));
		TinkerRegistry.integrate(telekillalloy, MODFluids.MOLTEN_TELEKILL_ALLOY, "TelekillAlloy").toolforge()
				.preInit();
		TinkerMaterials.materials.add(telekillalloy);
		TinkerRegistry.addMaterialStats(telekillalloy, new BowMaterialStats(0.3f, 3.25f, 6f));

		TinkerRegistry.addMaterialStats(vanadiumsteel,
				new HeadMaterialStats(1920, 8, 18, HarvestLevels.COBALT),
				new HandleMaterialStats(3.5f, 2560),
				new ExtraMaterialStats(5120));
		TinkerRegistry.integrate(vanadiumsteel, MODFluids.MOLTEN_VANADIUM_STEEL, "VanadiumSteel").toolforge()
				.preInit();
		TinkerMaterials.materials.add(vanadiumsteel);
		TinkerRegistry.addMaterialStats(vanadiumsteel, new BowMaterialStats(2, 64, 64));

		TinkerRegistry.addMaterialStats(carbon,
				new HeadMaterialStats(64, 1, 1, HarvestLevels.DIAMOND),
				new HandleMaterialStats(1.5f, -100),
				new ExtraMaterialStats(50));
		TinkerRegistry.integrate(carbon, "Carbon").toolforge()
				.preInit();
		TinkerMaterials.materials.add(carbon);
		TinkerRegistry.addMaterialStats(carbon, new BowMaterialStats(Integer.MAX_VALUE, 65536, 1));

		TinkerRegistry.addMaterialStats(blade_wood,
				new HeadMaterialStats(3500, 19, 10, HarvestLevels.COBALT),
				new HandleMaterialStats(0.5f, 500),
				new ExtraMaterialStats(15));
		TinkerRegistry.integrate(blade_wood, "BladeWood").toolforge()
				.preInit();
		TinkerMaterials.materials.add(blade_wood);
		TinkerRegistry.addMaterialStats(blade_wood, new BowMaterialStats(0.1f, 5, 7f));

		TinkerRegistry.addMaterialStats(data_expunged,
				new HeadMaterialStats(3317, 11f, 15f, 5),
				new HandleMaterialStats(5f, 2317),
				new ExtraMaterialStats(1317));
		TinkerRegistry.integrate(data_expunged, MODFluids.MOLTEN_DATA_EXPUNGED).toolforge()
				.preInit();
		TinkerMaterials.materials.add(data_expunged);
		TinkerRegistry.addMaterialStats(data_expunged, new BowMaterialStats(3f, 317f, 10f));

		TinkerRegistry.addMaterialStats(voidnic,
				new HeadMaterialStats(1000, 15.40f, 8.00f, COBALT),
				new HandleMaterialStats(1.05f, 200),
				new ExtraMaterialStats(10));
		TinkerRegistry.integrate(voidnic, MODFluids.MOLTEN_VOID, "Void").toolforge()
				.preInit();
		TinkerMaterials.materials.add(voidnic);
		TinkerRegistry.addMaterialStats(voidnic, new BowMaterialStats(0.3f, 3.25f, 6f));

		TinkerRegistry.addMaterialStats(naquadahalloy,
				new HeadMaterialStats(16384, 16, 16, 5),
				new HandleMaterialStats(4.5f, 5000),
				new ExtraMaterialStats(500));
		TinkerRegistry.integrate(naquadahalloy, MODFluids.MOLTEN_NAQUADAH_ALLOY, "NaquadahAlloy").toolforge()
				.preInit();
		TinkerMaterials.materials.add(naquadahalloy);
		TinkerRegistry.addMaterialStats(naquadahalloy, new BowMaterialStats(0.05f, 4, 666));

		TinkerRegistry.addMaterialStats(tungstensteel,
				new HeadMaterialStats(2560, 32, 16, COBALT),
				new HandleMaterialStats(3.5f, 1000),
				new ExtraMaterialStats(-100));
		TinkerRegistry.integrate(tungstensteel, MODFluids.MOLTEN_TUNGSTEN_STEEL, "TungstenSteel").toolforge()
				.preInit();
		TinkerMaterials.materials.add(tungstensteel);
		TinkerRegistry.addMaterialStats(tungstensteel, new BowMaterialStats(1, 5, 10));

		TinkerRegistry.addMaterialStats(ultimet,
				new HeadMaterialStats(4096, 16, 24, 5),
				new HandleMaterialStats(4, 2560),
				new ExtraMaterialStats(1000));
		TinkerRegistry.integrate(ultimet, MODFluids.MOLTEN_ULTIMET, "Ultimet").toolforge()
				.preInit();
		TinkerMaterials.materials.add(ultimet);
		TinkerRegistry.addMaterialStats(ultimet, new BowMaterialStats(0.05f, 1024, 256));

		TinkerRegistry.integrate(MODFluids.MOLTEN_NAQUADAH, "Naquadah").toolforge()
				.preInit();

	}

	public static void init() {
		telekillalloy.addCommonItems("TelekillAlloy");
		telekillalloy.addTrait(MODTraits.SCPProof);

		vanadiumsteel.addCommonItems("VanadiumSteel");
		vanadiumsteel.addTrait(MODTraits.Katasugi);

		carbon.setCraftable(true);
		carbon.addItemIngot("gemCarbon");
		carbon.addItemIngot("ingotCarbon");

		blade_wood.setCraftable(true);
		blade_wood.addItemIngot("ingotBladeWood");

		data_expunged.addTrait(MODTraits.DataExpunged);

		voidnic.addCommonItems("Void");
		voidnic.addTrait(MODTraits.Voidnic);

		naquadahalloy.addCommonItems("NaquadahAlloy");

		tungstensteel.addCommonItems("TungstenSteel");

		ultimet.addCommonItems("Ultimet");

	}

}
