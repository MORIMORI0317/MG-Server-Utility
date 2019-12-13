package com.morimori.mgserverutility;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import slimeknights.mantle.client.CreativeTab;

public class MODCreativeTab extends CreativeTab {

	public static CreativeTab MGTAB = new MODCreativeTab("mg_scp_tab", new ItemStack(Items.APPLE));

	public MODCreativeTab(String label, ItemStack backupIcon) {
		super(label, backupIcon);

	}

}
