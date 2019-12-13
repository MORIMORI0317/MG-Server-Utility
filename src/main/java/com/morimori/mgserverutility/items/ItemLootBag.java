package com.morimori.mgserverutility.items;

import java.util.List;
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

public class ItemLootBag extends Item {

	private List<ItemStack> ItemList;

	public ItemLootBag(String name, List<ItemStack> itemlist) {
		this.ItemList = itemlist;
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);

		worldIn.playSound((EntityPlayer) null, playerIn.posX, playerIn.posY, playerIn.posZ,
				SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		Random r = new Random();
		//		for (int i = 0; i < itemstack.getItemDamage() + 1; i++) {

		if (!worldIn.isRemote) {
			ItemStack dropitem = ItemList.get(r.nextInt(ItemList.size())).copy();
			if (!playerIn.inventory.addItemStackToInventory(dropitem))
				playerIn.dropItem(dropitem, false, true);
		}

		if (!playerIn.capabilities.isCreativeMode)
			itemstack.shrink(1);

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}

}
