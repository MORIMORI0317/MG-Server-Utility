package com.morimori.mgserverutility.slashblade;

import java.util.Map.Entry;

import com.morimori.mgserverutility.items.LootBag;
import com.morimori.mgserverutility.slashblade.blades.BladeNull;
import com.morimori.mgserverutility.slashblade.blades.BladeTest;
import com.morimori.mgserverutility.slashblade.blades.BladeYj;

import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.util.ResourceLocationRaw;
import net.minecraft.item.ItemStack;

public class MGSlashblade {
	public static void preInit() {

	}

	public static void Init() {
		BladeTest.init();
		BladeYj.init();
		BladeNull.init();
	}

	public static void posInit() {
		for (Entry<ResourceLocationRaw, ItemStack> i : SlashBlade.BladeRegistry.entrySet()) {
			LootBag.BLADE_LOOT.put(i.getValue(), 1);

		}
	}

}
