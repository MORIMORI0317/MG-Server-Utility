package com.morimori.mgserverutility.client.pcsystem;

import com.morimori.mgserverutility.config.MGConfig;

public class MGMain {
	public static void preInit() {
		if (MGConfig.isEffectTray)
			MGNotificationIcon.main();
	}

	public static void init() {

	}

	public static void posInit() {

	}
}
