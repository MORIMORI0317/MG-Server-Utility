package com.morimori.mgserverutility.handler;

import java.util.Random;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.items.MODItems;
import com.morimori.mgserverutility.util.ItemHelper;
import com.morimori.mgserverutility.util.MathHelper;

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
		Random r = new Random();

		if (!e.getEntityLiving().isNonBoss() || e.getEntityLiving() instanceof SCPEntity)
			addDropItem(e, new ItemStack(MODItems.RECORD_LOTTERY_BAG));

		if (MathHelper.isYJtime())
			addDropItem(e,
					new ItemHelper().createLootBag(MODItems.YJ_LOTTERY_BAG, r.nextInt((e.getLootingLevel()) + 3)));

	}

	public static void addDropItem(LivingDropsEvent e, ItemStack item) {

		EntityItem itemE = new EntityItem(e.getEntity().world, e.getEntity().posX, e.getEntity().posY,
				e.getEntity().posZ, item);
		itemE.setDefaultPickupDelay();

		e.getDrops().add(itemE);
	}

}
