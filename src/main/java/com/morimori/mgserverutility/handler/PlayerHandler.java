package com.morimori.mgserverutility.handler;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.enchants.MGEnchants;
import com.morimori.mgserverutility.items.LootBag;
import com.morimori.mgserverutility.util.EntityHelper;
import com.morimori.mgserverutility.util.FileLoader;
import com.morimori.mgserverutility.util.ItemHelper;

import mods.flammpfeil.slashblade.ItemSlashBladeNamed;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@EventBusSubscriber(modid = MGServerUtility.MODID)
public class PlayerHandler {
	@SubscribeEvent
	public static void onPlayerJoin(PlayerLoggedInEvent e) {

		FileLoader.addWirteTextFile("mgsververutility_joinplayerlist.txt", e.player.getName());
		LootBag.HEAD_LOOT.clear();
		for (String str : FileLoader.loadTextFile("mgsververutility_joinplayerlist.txt")) {
			LootBag.HEAD_LOOT.put(ItemHelper.createPlayerHead(str), 1);
		}

	}

	@SubscribeEvent
	public static void onTickPlayerEvent(TickEvent.PlayerTickEvent e) {
		EntityPlayer player = e.player;
		if (EntityHelper.isIkisugithi(player)) {
			player.capabilities.isFlying = true;
		}
	}

	@SubscribeEvent
	public static void onAttackEntityEvent(AttackEntityEvent e) {
		if (!e.getEntityLiving().world.isRemote) {
			ItemStack handitem = e.getEntityLiving().getHeldItem(EnumHand.MAIN_HAND);
			if (EnchantmentHelper.getEnchantmentLevel(MGEnchants.Ikisugi, handitem) != 0) {
				EntityHelper.ikisugCures(e.getEntityLiving());
			} else {
				if (handitem.getItem() instanceof ItemSlashBladeNamed) {
					NBTTagCompound tag = handitem.getTagCompound();

					if (ItemSlashBladeNamed.CurrentItemName.get(tag) == "flammpfeil.slashblade.named.mgsvu.yj") {
						EntityHelper.ikisugCures(e.getEntityLiving());
					}
				}
			}

		}
	}

	@SubscribeEvent
	public static void onBlockBlaket(BlockEvent.HarvestDropsEvent e) {
		if (e.getHarvester() != null) {
			if (!e.getHarvester().world.isRemote) {
				ItemStack handitem = e.getHarvester().getHeldItem(EnumHand.MAIN_HAND);
				if (EnchantmentHelper.getEnchantmentLevel(MGEnchants.Ikisugi, handitem) != 0) {
					EntityHelper.ikisugCures(e.getHarvester());

				}
			}
		}
	}
}
