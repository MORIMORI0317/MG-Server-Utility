package com.morimori.mgserverutility.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Nullable;

import com.morimori.mgserverutility.util.ItemHelper;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLotteryLootBag extends Item {

	private Map<ItemStack, Integer> ItemList;
	private boolean isHide;

	public ItemLotteryLootBag(String name, Map<ItemStack, Integer> itemlistIn) {
		this(name, itemlistIn, false);
	}

	public ItemLotteryLootBag(String name, Map<ItemStack, Integer> itemlistIn, boolean isHideIn) {
		this.ItemList = itemlistIn;
		this.isHide = isHideIn;
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);

		worldIn.playSound((EntityPlayer) null, playerIn.posX, playerIn.posY, playerIn.posZ,
				SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		Random r = new Random();
		if (!worldIn.isRemote) {
			int CO = 0;
			if (itemstack.hasTagCompound())
				CO = itemstack.getTagCompound().getInteger("cont") + 1;
			else
				CO = 1;

			for (int c = 0; c < CO; c++) {

				List<ItemStack> l = new ArrayList<ItemStack>();
				for (ItemStack it : ItemList.keySet()) {

					for (int i = 0; i < ItemList.get(it); i++) {
						l.add(it);
					}

				}

				ItemStack dropitem = l.get(r.nextInt(l.size())).copy();

				if (!dropitem.isEmpty()) {

					ItemHelper.addPlayerItem(playerIn, dropitem);
				}

			}

			if (!playerIn.capabilities.isCreativeMode)
				itemstack.shrink(1);

		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (stack.hasTagCompound()) {
			int conta = stack.getTagCompound().getInteger("cont") + 1;
			tooltip.add(TextFormatting.GRAY + I18n.format("item.blade_lottery_loot_bag.cont.desc", conta));

		} else {
			tooltip.add(TextFormatting.GRAY + I18n.format("item.blade_lottery_loot_bag.cont.desc", 1));
		}
		if (!this.isHide) {
			tooltip.add(TextFormatting.GRAY + I18n.format("item.blade_lottery_loot_bag.following.desc"));
			if (ItemList.size() <= 5) {
				for (ItemStack it : ItemList.keySet()) {
					tooltip.add(it.getRarity().getColor() + it.getDisplayName());
				}
			} else {
				int n = 0;
				for (ItemStack it : ItemList.keySet()) {
					tooltip.add(it.getRarity().getColor() + it.getDisplayName());
					n++;
					if (n >= 5) {
						tooltip.add(TextFormatting.GRAY
								+ I18n.format("container.shulkerBox.more", ItemList.size() - 5));
						break;
					}
				}
			}
		}
	}

	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			items.add(new ItemStack(this));
			items.add(ItemHelper.createLootBag(this, 1));
			items.add(ItemHelper.createLootBag(this, 7));
			items.add(ItemHelper.createLootBag(this, 63));
		}
	}
}
