package com.morimori.mgserverutility.network;

import com.morimori.mgserverutility.MGserverUtility;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class PacketHandler {
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE
			.newSimpleChannel(MGserverUtility.MODID);

	public static void init() {

	}
}
