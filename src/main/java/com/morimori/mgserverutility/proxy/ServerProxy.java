package com.morimori.mgserverutility.proxy;

import com.morimori.mgserverutility.MGserverUtility;

public class ServerProxy extends CommonProxy {
	@Override
	public void preInit() {
		super.preInit();
		MGserverUtility.LOGGER.info("Server PreIniting...");
	}

	@Override
	public void init() {
		super.init();
		MGserverUtility.LOGGER.info("Server Initing...");
	}

	@Override
	public void posInit() {
		super.posInit();
		MGserverUtility.LOGGER.info("Server PostIniting...");
	}
}