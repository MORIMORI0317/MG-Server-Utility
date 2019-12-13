package com.morimori.mgserverutility.SCP;

import com.morimori.mgserverutility.items.MODItems;

import alexiy.secure.contain.protect.clockworks.ClockworksRecipes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MODClockworksRecipes {
	public static void preInit() {
		ClockworksRecipes.addVeryFineRecipe(Items.IRON_INGOT, new ItemStack(MODItems.VANADIUM_STEEL_INGOT), 200);
		ClockworksRecipes.addVeryFineRecipe(Items.IRON_INGOT, new ItemStack(MODItems.VANADIUM_STEEL_INGOT), 200);

	}
}
