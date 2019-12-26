package com.morimori.mgserverutility.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;

public class ItemIkisuginithiSword extends ItemSword {

	public ItemIkisuginithiSword(ToolMaterial material) {
		super(material);

	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

		for (int c = 0; c < 128; c++) {
			target.attackEntityFrom(DamageSource.OUT_OF_WORLD, Integer.MAX_VALUE);
		}
		return true;
	}

}
