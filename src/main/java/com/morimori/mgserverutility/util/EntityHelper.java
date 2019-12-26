package com.morimori.mgserverutility.util;

import java.util.Random;

import com.google.common.collect.Lists;
import com.morimori.mgserverutility.MGSoundEvents;
import com.morimori.mgserverutility.enchants.MGEnchants;
import com.morimori.mgserverutility.items.MODItems;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.SoundCategory;
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

	public static boolean isIkisugithi(Entity en) {
		int co = 0;
		for (ItemStack item : en.getArmorInventoryList()) {
			Item ite = item.getItem();
			if (ite == MODItems.iKISUGINITHI_BOOTS)
				co++;
			if (ite == MODItems.iKISUGINITHI_LEGGINGS)
				co++;
			if (ite == MODItems.iKISUGINITHI_CHESTPLATE)
				co++;
			if (ite == MODItems.iKISUGINITHI_HELMET)
				co++;
		}
		if (co == 4)
			return true;

		return false;
	}

	public static int hasIkisugiCures(Entity en) {
		int co = 0;
		for (ItemStack item : en.getArmorInventoryList()) {

			if (EnchantmentHelper.getEnchantmentLevel(MGEnchants.Ikisugi, item) != 0)
				co++;
			if (EnchantmentHelper.getEnchantmentLevel(MGEnchants.Ikisugi, item) != 0)
				co++;
			if (EnchantmentHelper.getEnchantmentLevel(MGEnchants.Ikisugi, item) != 0)
				co++;
			if (EnchantmentHelper.getEnchantmentLevel(MGEnchants.Ikisugi, item) != 0)
				co++;
		}

		return co;
	}

	public static void ikisugCures(EntityLivingBase en, boolean isbougu) {
		if (!isbougu) {
			en.world.playSound((EntityPlayer) null, en.getPosition(),
					MGSoundEvents.SoundLisRandom(MGSoundEvents.YJJakenSworlSoundlist),
					SoundCategory.VOICE, 10, 1);
		} else {
			en.world.playSound((EntityPlayer) null, en.getPosition(),
					MGSoundEvents.SoundLisRandom(MGSoundEvents.YJJakenShieldSoundlist),
					SoundCategory.VOICE, 10, 1);
		}
	}

	public static void ikisugCures(EntityLivingBase en) {
		ikisugCures(en, false);

	}
}
