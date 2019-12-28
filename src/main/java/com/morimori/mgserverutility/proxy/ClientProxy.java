package com.morimori.mgserverutility.proxy;

import com.morimori.mgserverutility.client.pcsystem.MGMain;
import com.morimori.mgserverutility.client.render.OODTereporterRenderer;
import com.morimori.mgserverutility.tile.TileOODTereporter;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	public static void clientPreInit() {
		MGMain.preInit();
		ClientRegistry.bindTileEntitySpecialRenderer(TileOODTereporter.class, new OODTereporterRenderer());
	}

	public static void clientInit() {
		MGMain.init();
	}

	public void postInit() {
		MGMain.posInit();
	}

}
