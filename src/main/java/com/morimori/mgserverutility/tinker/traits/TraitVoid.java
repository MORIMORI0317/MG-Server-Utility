package com.morimori.mgserverutility.tinker.traits;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitVoid extends AbstractTrait {

	public TraitVoid() {
		super("voidnic", 3083066);

	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical, boolean wasHit) {

		if (!(target instanceof EntityPlayer)) {
			target.captureDrops = false;
			target.posY = -10000;
			target.setDead();
		}

	}

	@Override
	public void blockHarvestDrops(ItemStack tool, BlockEvent.HarvestDropsEvent event) {
		event.setDropChance(0);

	}

	@Override
	public void onRepair(ItemStack tool, int amount) {
		tool.setItemDamage(tool.getMaxDamage());
	}
}
