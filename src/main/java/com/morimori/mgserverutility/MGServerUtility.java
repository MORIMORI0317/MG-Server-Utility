package com.morimori.mgserverutility;

import org.apache.logging.log4j.Logger;

import com.morimori.mgserverutility.SCP.MODClockworksRecipes;
import com.morimori.mgserverutility.fluids.MODFluids;
import com.morimori.mgserverutility.items.MIDOreDictionary;
import com.morimori.mgserverutility.items.MODItems;
import com.morimori.mgserverutility.proxy.ClientProxy;
import com.morimori.mgserverutility.proxy.CommonProxy;
import com.morimori.mgserverutility.tinker.MODMaterials;
import com.morimori.mgserverutility.tinker.MODTConst;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MGServerUtility.MODID, name = MGServerUtility.NAME, version = MGServerUtility.VERSION)

public class MGServerUtility {
	public static final String MODID = "mgserverutility";
	public static final String NAME = "MG Server Utility";
	public static final String VERSION = "Build 5";

	public static Logger LOGGER;

	@SidedProxy(clientSide = "com.morimori.mgserverutility.proxy.ClientProxy", serverSide = "com.morimori.mgserverutility.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		LOGGER = event.getModLog();
		proxy.preInit();

		if (event.getSide().isClient()) {
			ClientProxy.clientPreInit();
		}
		proxy.preInit();

		MODFluids.regFluid();

		MODMaterials.preInit();
		MODTConst.preinit();
		MODClockworksRecipes.preInit();

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		if (event.getSide().isClient()) {
			ClientProxy.clientInit();
		}
		proxy.init();
		MODMaterials.init();
		MODTConst.init();
		MIDOreDictionary.registOredict();
		MODItems.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		MODTConst.postinit();

	}



}
