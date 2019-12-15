package com.morimori.mgserverutility.items;

import com.morimori.mgserverutility.config.MGConfig;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemTest extends Item {
	public ItemTest() {

	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		playerIn.changeDimension(MGConfig.OOD_ID);
//		playerIn.dimension =MGConfig.OOD_ID;

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
}
