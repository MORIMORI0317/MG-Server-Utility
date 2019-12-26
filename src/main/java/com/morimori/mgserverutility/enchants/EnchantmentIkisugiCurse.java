package com.morimori.mgserverutility.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentIkisugiCurse extends Enchantment {

	protected EnchantmentIkisugiCurse(Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots) {
		super(rarityIn, typeIn, slots);
		this.setName("ikisugi_curse");

	}

	public int getMaxLevel() {
		return 1;
	}

	public int getMaxEnchantability(int enchantmentLevel) {
		return 50;
	}

	public int getMinEnchantability(int enchantmentLevel) {
		return 25;
	}

	public boolean isTreasureEnchantment() {
		return true;
	}

	public boolean isCurse() {
		return true;
	}
}
