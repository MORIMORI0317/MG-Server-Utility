package com.morimori.mgserverutility.handler;

import java.util.Date;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.items.MODItems;

import alexiy.secure.contain.protect.api.SCPEntity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MGServerUtility.MODID)

public class MobHandler {

	@SubscribeEvent
	public static void onDrop(LivingDropsEvent e) {

		if (!e.getEntityLiving().isNonBoss() || e.getEntityLiving() instanceof SCPEntity) {
			addDropItem(e, new ItemStack(MODItems.RECORD_LOTTERY_BAG));

		}

		if (isYJtime()) {
			addDropItem(e, new ItemStack(MODItems.YJ_LOTTERY_BAG));

		}

	}

	public static void addDropItem(LivingDropsEvent e, ItemStack item) {

		EntityItem itemE = new EntityItem(e.getEntity().world, e.getEntity().posX, e.getEntity().posY,
				e.getEntity().posZ, item);
		itemE.setDefaultPickupDelay();

		e.getDrops().add(itemE);
	}

	public static Boolean isYJtime() {
		Date date = new Date();

		if ((date.getHours() == 8 && date.getMinutes() == 10) || (date.getHours() == 20 && date.getMinutes() == 10))
			return true;

		if ((date.getHours() == 7 && date.getMinutes() == 19) || (date.getHours() == 19 && date.getMinutes() == 19))
			return true;

		if ((date.getHours() == 11 && date.getMinutes() == 45 && date.getSeconds() == 15)
				|| (date.getHours() == 23 && date.getMinutes() == 45 && date.getSeconds() == 15))
			return true;

		if ((date.getHours() == 4 && date.getMinutes() == 4) || (date.getHours() == 16 && date.getMinutes() == 4))
			return true;

		if ((date.getHours() == 9 && date.getMinutes() == 31) || (date.getHours() == 21 && date.getMinutes() == 31))
			return true;

		return false;

	}

}
