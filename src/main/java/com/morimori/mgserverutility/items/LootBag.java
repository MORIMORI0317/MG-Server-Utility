package com.morimori.mgserverutility.items;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class LootBag {
	public static Map<ItemStack, Integer> RECORD_LOOT = new HashMap<>();
	public static Map<ItemStack, Integer> YJ_LOOT = new HashMap<>();
	public static Map<ItemStack, Integer> INM_LOOT = new HashMap<>();

	public static void init() {
		RECORD_LOOT.put(new ItemStack(MODItems.CYCLOPS_RECORD), 4);
		RECORD_LOOT.put(new ItemStack(MODItems.HOLOGRAM_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.MARENOL_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.MOPEMOPE_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.CHAOS_MUSIC_RECORD), 5);
		RECORD_LOOT.put(new ItemStack(MODItems.SNAKE_EATER_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.TAKARAZIMA_RECORD), 1);

		YJ_LOOT.put(new ItemStack(MODItems.YSYOU_RECORD), 2);
		YJ_LOOT.put(new ItemStack(MODItems.HAKUSINKARATEBU_RECORD), 2);
		YJ_LOOT.put(new ItemStack(MODItems.YJINTABYU_RECORD), 3);
		YJ_LOOT.put(new ItemStack(MODItems.CYCLOPS_RECORD), 5);

		INM_LOOT.put(new ItemStack(MODItems.YJ_LOTTERY_BAG), 1);
		INM_LOOT.put(new ItemStack(MODItems.YATTAZE_RECORD), 3);

	}
}
