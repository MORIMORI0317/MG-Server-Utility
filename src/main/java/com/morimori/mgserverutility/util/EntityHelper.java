package com.morimori.mgserverutility.util;

import java.util.Random;

import com.google.common.collect.Lists;

import net.minecraft.entity.EntityLiving;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class EntityHelper {
	public static Potion RandomPotion(int i) {
		Random r = new Random(i);
		return ForgeRegistries.POTIONS.getValues().get(r.nextInt(ForgeRegistries.POTIONS.getValues().size()));
	}

	public static Potion RandomPotion() {
		Random r = new Random();
		return RandomPotion(r.nextInt(114514));
	}

	public static void setEquipment(EntityLiving entityIn, ItemStack mainhand, ItemStack offhand, ItemStack head,
			ItemStack chest, ItemStack legs, ItemStack feet) {
		if ((entityIn.getHeldItemMainhand().isEmpty())) {
			entityIn.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, mainhand);
		}
		if ((entityIn.getHeldItemOffhand().isEmpty())) {
			entityIn.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, offhand);
		}

		if ((Lists.newArrayList(entityIn.getArmorInventoryList().iterator())).get(3).isEmpty()) {
			entityIn.setItemStackToSlot(EntityEquipmentSlot.HEAD, head);
		}
		if ((Lists.newArrayList(entityIn.getArmorInventoryList().iterator())).get(2).isEmpty()) {
			entityIn.setItemStackToSlot(EntityEquipmentSlot.CHEST, chest);
		}
		if ((Lists.newArrayList(entityIn.getArmorInventoryList().iterator())).get(1).isEmpty()) {
			entityIn.setItemStackToSlot(EntityEquipmentSlot.LEGS, legs);
		}
		if ((Lists.newArrayList(entityIn.getArmorInventoryList().iterator())).get(0).isEmpty()) {
			entityIn.setItemStackToSlot(EntityEquipmentSlot.FEET, feet);
		}
	}
}
