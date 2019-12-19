package com.morimori.mgserverutility.util;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
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

	public static void addPlayerItem(EntityPlayer pl, ItemStack item) {
		if (!pl.inventory.addItemStackToInventory(item))
			pl.dropItem(item, false, true);
	}

	public static ItemStack createLootBag(Item itemIn, int cont) {
		ItemStack item = new ItemStack(itemIn);
		NBTTagCompound tag = new NBTTagCompound();
		tag.setInteger("cont", cont);
		item.setTagCompound(tag);
		return item;
	}

	public static ItemStack createPlayerHead(String name) {
		ItemStack item = new ItemStack(Items.SKULL, 1, 3);
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString("SkullOwner", name);
		item.setTagCompound(tag);
		return item;
	}

}
