package com.morimori.mgserverutility.items;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemAppleD extends ItemFood {

	public ItemAppleD(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			if (new Random().nextInt(100) == 1) {
				if (player.getHeldItemOffhand().getItem() == Items.TOTEM_OF_UNDYING) {
					ItemStack item = player.getHeldItemOffhand();
					item = new ItemStack(MODItems.IKISUGITHI_TOTEM, item.getCount());
					player.setHeldItem(EnumHand.OFF_HAND, item);
				}
				if (player.getHeldItemMainhand().getItem() == Items.TOTEM_OF_UNDYING) {
					ItemStack item = player.getHeldItemMainhand();
					item = new ItemStack(MODItems.IKISUGITHI_TOTEM, item.getCount());
					player.setHeldItem(EnumHand.MAIN_HAND, item);
				}
			}
		}
	}

}
