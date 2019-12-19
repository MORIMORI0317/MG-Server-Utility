package com.morimori.mgserverutility.handler;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.items.LootBag;
import com.morimori.mgserverutility.util.FileLoader;
import com.morimori.mgserverutility.util.ItemHelper;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@EventBusSubscriber(modid = MGServerUtility.MODID)
public class PlayerHandler {
	@SubscribeEvent
	public static void onPlayerJoin(PlayerLoggedInEvent e) {

		FileLoader.addWirteTextFile("mgsververutility_joinplayerlist.txt", e.player.getName());
		LootBag.HEAD_LOOT.put(ItemHelper.createPlayerHead(e.player.getName()), 1);

	}
}
