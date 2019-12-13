package com.morimori.mgserverutility.tinker.traits;

import java.util.Random;

import com.morimori.mgserverutility.util.ItemHelper;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitDataExpunged extends AbstractTrait {
	public TraitDataExpunged() {
		super("dataexpunged", 0);
	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical, boolean wasHit) {
		Random r = new Random();
		if (r.nextInt(10) == 0) {
			if (!player.getEntityWorld().isRemote) {

				player.getEntityWorld().playSound((EntityPlayer) null, player.getPosition(),
						SoundEvents.BLOCK_ENDERCHEST_OPEN, SoundCategory.PLAYERS, 3 + r.nextFloat(), 1 + r.nextFloat());
				player.replaceItemInInventory(r.nextInt(26), new ItemStack(ItemHelper.RandomItem()));
			}
		}
	}

	@Override
	public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player,
			boolean wasEffective) {
		Random r = new Random();
		if (r.nextInt(10) == 0) {
			if (!player.getEntityWorld().isRemote) {

				player.getEntityWorld().playSound((EntityPlayer) null, player.getPosition(),
						SoundEvents.BLOCK_ENDERCHEST_OPEN, SoundCategory.PLAYERS, 3 + r.nextFloat(), 1 + r.nextFloat());
				player.replaceItemInInventory(r.nextInt(26), new ItemStack(ItemHelper.RandomItem()));
			}
		}
	}

}
