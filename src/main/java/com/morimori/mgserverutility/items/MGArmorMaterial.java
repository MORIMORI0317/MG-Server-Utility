package com.morimori.mgserverutility.items;

import com.morimori.mgserverutility.MGServerUtility;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MGArmorMaterial {
	public static ArmorMaterial IKISUGINITHI = EnumHelper
			.addArmorMaterial("ikisuginithi", MGServerUtility.MODID + ":" + "ikisuginithi", Integer.MAX_VALUE,
					new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE },
					Integer.MAX_VALUE, null, Integer.MAX_VALUE);
}
