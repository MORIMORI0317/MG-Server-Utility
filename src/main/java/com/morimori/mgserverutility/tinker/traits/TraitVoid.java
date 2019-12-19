package com.morimori.mgserverutility.tinker.traits;

import java.util.Random;

import com.morimori.mgserverutility.MGSoundEvents;
import com.morimori.mgserverutility.config.MGConfig;
import com.morimori.mgserverutility.util.MGTereporter;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.world.BlockEvent;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitVoid extends AbstractTrait {

	public TraitVoid() {
		super("voidnic", 3083066);

	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical, boolean wasHit) {

		if (target.isNonBoss() && target.dimension != MGConfig.OOD_ID) {

			player.world.playSound((EntityPlayer) null, target.getPosition(), MGSoundEvents.TEREPORTOUTOOFDIMENTION,
					SoundCategory.AMBIENT, 15, 1);
			player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, target.getPosition().getX(),
					target.getPosition().getY(),
					target.getPosition().getZ(), 10, 10, 10, 100);
			Random r = new Random();

			int x = target.getPosition().getX();
			int y = target.getPosition().getY();
			int z = target.getPosition().getZ();

			player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x, y, z, 1, 1, 1);

			MGTereporter
					.of(target.getPosition().getX(), 110,
							target.getPosition().getZ(), MGConfig.OOD_ID)
					.teleport(target);

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
