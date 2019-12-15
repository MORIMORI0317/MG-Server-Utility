package com.morimori.mgserverutility.client.handler;

import java.util.ArrayList;
import java.util.List;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.items.ItemAnyIngot;

import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = MGServerUtility.MODID, value = Side.CLIENT)
public class RenderHandler {
	public static List<Item> colerItem = new ArrayList<Item>();

	@SubscribeEvent
	public static void onRenderLivingPre(RenderLivingEvent.Pre<EntityLivingBase> e) {

	}

	@SubscribeEvent
	public static void onItemColor(final ColorHandlerEvent.Item e) {
		ItemColors Color = e.getItemColors();

		for (Item i : colerItem) {
			if (i instanceof ItemAnyIngot) {

				Color.registerItemColorHandler(((ItemAnyIngot) i).getColor(), i);

			}
		}
	}
}
