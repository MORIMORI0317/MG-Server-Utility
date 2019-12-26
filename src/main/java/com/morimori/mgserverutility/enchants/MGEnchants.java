package com.morimori.mgserverutility.enchants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.morimori.mgserverutility.MGServerUtility;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class MGEnchants {
	public static Enchantment Ikisugi = new EnchantmentIkisugiCurse(Rarity.UNCOMMON, EnumEnchantmentType.ALL,
			EntityEquipmentSlot.values()).setRegistryName(MGServerUtility.MODID, "ikisugi_curse");

	public static List<Enchantment> registerEnchantmentList() {
		List<Enchantment> l = new ArrayList<Enchantment>();
		l.addAll(Arrays.asList(
				Ikisugi

		));
		return l;

	}
}
