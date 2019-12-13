package com.morimori.mgserverutility.items;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class LootBag {
	public static Map<ItemStack, Integer> RECORD_LOOT = new HashMap<>();

	public static void init() {
		RECORD_LOOT.put(new ItemStack(MODItems.BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_RECORD), 5);
		RECORD_LOOT.put(new ItemStack(MODItems.HOLOGRAM_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.CYCLOPS_RECORD), 1);

	}
}
