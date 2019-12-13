package com.morimori.mgserverutility.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemLotteryLootBag extends Item {

	private Map<ItemStack, Integer> ItemList;

	public ItemLotteryLootBag(String name, Map<ItemStack, Integer> itemlistIn) {
		this.ItemList = itemlistIn;
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);

		worldIn.playSound((EntityPlayer) null, playerIn.posX, playerIn.posY, playerIn.posZ,
				SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		Random r = new Random();
		if (!worldIn.isRemote) {

			List<ItemStack> l = new ArrayList<ItemStack>();
			for (ItemStack it : ItemList.keySet()) {

				for (int i = 0; i < ItemList.get(it); i++) {
					l.add(it);
				}

			}
			ItemStack dropitem = l.get(r.nextInt(l.size())).copy();

			if (!dropitem.isEmpty()) {
				if (!playerIn.inventory.addItemStackToInventory(dropitem))
					playerIn.dropItem(dropitem, false, true);

				if (!playerIn.capabilities.isCreativeMode)
					itemstack.shrink(1);

			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}

}
