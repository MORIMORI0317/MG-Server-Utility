package com.morimori.mgserverutility.client.handler;

import java.awt.TrayIcon.MessageType;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.client.pcsystem.MGNotificationIcon;
import com.morimori.mgserverutility.config.MGConfig;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = MGServerUtility.MODID, value = Side.CLIENT)
public class ChatHandler {
	@SubscribeEvent
	public static void onGui(ClientChatReceivedEvent e) {
		if (GuiHandler.isNotise && MGConfig.isEffectTray)
			MGNotificationIcon.Tray.displayMessage("チャット", e.getMessage().getUnformattedText(), MessageType.NONE);

	}
}
