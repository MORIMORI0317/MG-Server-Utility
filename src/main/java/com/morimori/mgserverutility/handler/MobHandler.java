package com.morimori.mgserverutility.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.items.MODItems;
import com.morimori.mgserverutility.util.EntityHelper;
import com.morimori.mgserverutility.util.ItemHelper;
import com.morimori.mgserverutility.util.MathHelper;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@EventBusSubscriber(modid = MGServerUtility.MODID)

public class MobHandler {

	private static HashMap<ItemArmor.ArmorMaterial, Item> Head_map = new HashMap<ItemArmor.ArmorMaterial, Item>();
	private static HashMap<ItemArmor.ArmorMaterial, Item> Chest_map = new HashMap<ItemArmor.ArmorMaterial, Item>();
	private static HashMap<ItemArmor.ArmorMaterial, Item> Legs_map = new HashMap<ItemArmor.ArmorMaterial, Item>();
	private static HashMap<ItemArmor.ArmorMaterial, Item> Feet_map = new HashMap<ItemArmor.ArmorMaterial, Item>();
	private static Set<ItemArmor.ArmorMaterial> ArmorMaterials = new HashSet<ItemArmor.ArmorMaterial>();
	private static List<Item> MainHand = new ArrayList<Item>();
	private static List<Item> OffHand = new ArrayList<Item>();

	public static void init() {
		for (Item i : ForgeRegistries.ITEMS) {
			if (i instanceof ItemArmor) {
				ItemArmor ia = (ItemArmor) i;

				switch (ia.armorType) {
				case CHEST:
					Chest_map.put((((ItemArmor) i).getArmorMaterial()), i);
					ArmorMaterials.add(((ItemArmor) i).getArmorMaterial());
					break;
				case FEET:
					Feet_map.put((((ItemArmor) i).getArmorMaterial()), i);
					ArmorMaterials.add(((ItemArmor) i).getArmorMaterial());
					break;
				case HEAD:
					Head_map.put((((ItemArmor) i).getArmorMaterial()), i);
					ArmorMaterials.add(((ItemArmor) i).getArmorMaterial());
					break;
				case LEGS:
					Legs_map.put((((ItemArmor) i).getArmorMaterial()), i);
					ArmorMaterials.add(((ItemArmor) i).getArmorMaterial());
					break;
				default:
					break;
				}

			}
			if (i instanceof ItemSword || i instanceof ItemAxe || i instanceof ItemPickaxe || i instanceof ItemSpade
					|| i instanceof ItemHoe || i instanceof ItemFishingRod || i == Items.STICK)
				MainHand.add(i);

			if (i instanceof ItemShield || i == Items.TOTEM_OF_UNDYING)
				OffHand.add(i);
		}
	}

	@SubscribeEvent
	public static void onMobSpawn(LivingSpawnEvent.SpecialSpawn e) {
		Random r = new Random();

		EntityLiving enty = (EntityLiving) e.getEntityLiving();

		if (enty instanceof EntityZombie || enty instanceof AbstractSkeleton || enty instanceof EntityVindicator
				|| enty instanceof EntityVindicator) {
			if (r.nextInt(10) == 0) {

				List<Item> MainHanditem = new ArrayList<Item>();
				MainHanditem.addAll(MainHand);

				List<Item> OffHanditem = new ArrayList<Item>();
				OffHanditem.addAll(OffHand);

				List<ItemArmor.ArmorMaterial> aromerlist = new ArrayList<ItemArmor.ArmorMaterial>(
						ArmorMaterials);
				ItemArmor.ArmorMaterial aromer = aromerlist.get(r.nextInt(aromerlist.size()));

				EntityHelper.setEquipment(enty,
						new ItemStack(MainHanditem.get(r.nextInt(MainHanditem.size()))),
						new ItemStack(OffHanditem.get(r.nextInt(OffHanditem.size()))),
						new ItemStack(Head_map.get(aromer)),
						new ItemStack(Chest_map.get(aromer)),
						new ItemStack(Legs_map.get(aromer)),
						new ItemStack(Feet_map.get(aromer)));

			}

		}
	}

	@SubscribeEvent
	public static void onDrop(LivingDropsEvent e) {
		Random r = new Random();
/*
		if (!e.getEntityLiving().isNonBoss() || e.getEntityLiving() instanceof SCPEntity)
			addDropItem(e, new ItemStack(MODItems.RECORD_LOTTERY_BAG));
*/
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
