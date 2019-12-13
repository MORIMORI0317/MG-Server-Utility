package com.morimori.mgserverutility.util;

import java.util.Random;

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
}
