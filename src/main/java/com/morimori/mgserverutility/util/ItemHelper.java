package com.morimori.mgserverutility.util;

import java.util.Random;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemHelper {
	public static Item RandomItem(int i) {
		Random r = new Random(i);
		return ForgeRegistries.ITEMS.getValues().get(r.nextInt(ForgeRegistries.ITEMS.getValues().size()));
	}

	public static Item RandomItem() {
		Random r = new Random();
		return RandomItem(r.nextInt(114514));
	}
}
