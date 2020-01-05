package com.morimori.mgserverutility;

import org.apache.logging.log4j.Logger;

import com.morimori.mgserverutility.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MGserverUtility.MODID, name = MGserverUtility.NAME, version = MGserverUtility.VERSION)
public class MGserverUtility {
	public static final String MODID = "mgserverutility";
	public static final String NAME = "MG Server Utility";
	public static final String VERSION = "Build 0";

	@SidedProxy(clientSide = "com.morimori.mgserverutility.proxy.ClientProxy", serverSide = "com.morimori.mgserverutility.proxy.ServerProxy")
	public static CommonProxy Proxy;

	public static Logger LOGGER;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		LOGGER = e.getModLog();
		Proxy.preInit();

	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		Proxy.init();

	}

	@EventHandler
	public void posInit(FMLPostInitializationEvent e) {
		Proxy.posInit();
	}
}
