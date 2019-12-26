package com.morimori.mgserverutility.items;

import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Nullable;

import com.morimori.mgserverutility.util.ItemHelper;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemItemLotteryLootBag extends ItemLotteryLootBag {

	public ItemItemLotteryLootBag(String name, Map<ItemStack, Integer> itemlistIn) {
		super(name, itemlistIn);

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

				ItemHelper.addPlayerItem(playerIn, ItemHelper.RandomItem());

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
		tooltip.add(TextFormatting.GRAY + I18n.format("item.blade_lottery_loot_bag.item.desc"));
	}
}
