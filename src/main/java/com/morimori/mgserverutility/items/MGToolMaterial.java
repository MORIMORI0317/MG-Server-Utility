package com.morimori.mgserverutility.items;

import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class MGToolMaterial {
	public static ToolMaterial iKISUGINITHI = EnumHelper
			.addToolMaterial("ikisuginithi", Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,
					Integer.MAX_VALUE)
			.setRepairItem(new ItemStack(Items.DIAMOND));
}
