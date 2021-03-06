package com.morimori.mgserverutility.proxy;

import com.morimori.mgserverutility.MGserverUtility;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		super.preInit();
		MGserverUtility.LOGGER.info("Client PreIniting...");
	}

	@Override
	public void init() {
		super.init();
		MGserverUtility.LOGGER.info("Client Initing...");
	}

	@Override
	public void posInit() {
		super.posInit();
		MGserverUtility.LOGGER.info("Client PostIniting...");
	}
}
