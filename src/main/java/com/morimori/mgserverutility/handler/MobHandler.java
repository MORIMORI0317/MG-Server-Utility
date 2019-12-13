package com.morimori.mgserverutility.handler;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.items.MODItems;

import alexiy.secure.contain.protect.api.SCPEntity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MGServerUtility.MODID)

public class MobHandler {
	@SubscribeEvent
	public static void onJoin(EntityJoinWorldEvent e) {
		//		if (e.getEntity() instanceof EntityZombie) {
		//			e.getEntity().setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(MODItems.CYCLOPS_RECORD));
		//		}
	}

	@SubscribeEvent
	public static void onDrop(LivingDropsEvent e) {

		if (!e.getEntityLiving().isNonBoss() || e.getEntityLiving() instanceof SCPEntity)
			addDropItem(e, new ItemStack(MODItems.RECORD_LOOT_BAG));

	}

	public static void addDropItem(LivingDropsEvent e, ItemStack item) {

		EntityItem itemE = new EntityItem(e.getEntity().world, e.getEntity().posX, e.getEntity().posY,
				e.getEntity().posZ, item);
		itemE.setDefaultPickupDelay();

		e.getDrops().add(itemE);
	}

}
