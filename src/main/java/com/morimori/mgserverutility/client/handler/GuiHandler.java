package com.morimori.mgserverutility.client.handler;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.config.MGConfig;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.client.event.GuiScreenEvent.ActionPerformedEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = MGServerUtility.MODID, value = Side.CLIENT)
public class GuiHandler {
	public static boolean isNotise;

	@SubscribeEvent
	public static void onGui(GuiScreenEvent.InitGuiEvent.Post e) {
		if (e.getGui() instanceof GuiMainMenu) {

			if (!MGConfig.isMultibuttun) {
				e.getButtonList()
						.add(new GuiButton(114, e.getButtonList().get(1).x, e.getButtonList().get(1).y,
								I18n.format("menu.joinserver")));

				e.getButtonList().remove(e.getButtonList().get(1));

			} else {
				e.getButtonList()
						.add(new GuiButton(114, e.getButtonList().get(1).x, e.getButtonList().get(1).y,
								98, e.getButtonList().get(1).height,
								I18n.format("menu.joinserver")));

				e.getButtonList().get(1).x = e.getGui().width / 2 + 2;
				e.getButtonList().get(1).width = 98;
			}

		}
		if (e.getGui() instanceof GuiChat && MGConfig.isEffectTray) {

			e.getButtonList()
					.add(new GuiButton(1919419, 0, 0, I18n.format("option.isnotise", isNotise)));

		}
	}

	@SubscribeEvent
	public static void action(ActionPerformedEvent.Post e) {

		if (e.getGui() instanceof GuiMainMenu && e.getButton().id == 114) {

			Minecraft.getMinecraft().displayGuiScreen(new GuiConnecting(e.getGui(), Minecraft.getMinecraft(),
					new ServerData(I18n.format("selectServer.defaultName"), MGConfig.ServerIp, false)));

		}
		if (e.getGui() instanceof GuiChat && e.getButton().id == 1919419) {

			if (isNotise)
				isNotise = false;
			else
				isNotise = true;

			e.getButton().displayString = I18n.format("option.isnotise", isNotise);

		}
	}

	@SubscribeEvent
	public static void onOpenGUI(GuiOpenEvent e) {

	}
}
