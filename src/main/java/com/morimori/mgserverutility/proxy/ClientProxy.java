package com.morimori.mgserverutility.proxy;

import com.morimori.mgserverutility.client.render.OODTereporterRenderer;
import com.morimori.mgserverutility.tile.TileOODTereporter;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	public static void clientPreInit() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileOODTereporter.class, new OODTereporterRenderer());
	}

	public static void clientInit() {

	}

	public void postInit() {

	}

}
