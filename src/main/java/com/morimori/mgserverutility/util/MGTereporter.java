package com.morimori.mgserverutility.util;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ITeleporter;

public class MGTereporter extends Thread implements ITeleporter {
	public final double posX, posY, posZ;
	public final int dim;
	public final @Nullable Entity entity;

	public static MGTereporter of(double x, double y, double z, int dim, @Nullable Entity target) {
		return new MGTereporter(x, y, z, dim, target);
	}

	public static MGTereporter of(@Nullable Entity entity) {
		return new MGTereporter(entity.posX, entity.posY, entity.posZ, entity.dimension, entity);
	}

	public static MGTereporter of(BlockPos pos, int dim, @Nullable Entity entity) {
		return new MGTereporter(pos.getX() + 0.5D, pos.getY() + 0.1D, pos.getZ() + 0.5D, dim, entity);
	}

	private MGTereporter(double x, double y, double z, int d, @Nullable Entity target) {
		posX = x;
		posY = y;
		posZ = z;
		dim = d;
		entity = target;
	}

	@Override
	public void placeEntity(World world, Entity entity, float yaw) {
		entity.motionX = entity.motionY = entity.motionZ = 0D;
		entity.fallDistance = 0F;

		if (entity instanceof EntityPlayerMP && ((EntityPlayerMP) entity).connection != null) {
			((EntityPlayerMP) entity).connection.setPlayerLocation(posX, posY, posZ, yaw, entity.rotationPitch);
		} else {
			entity.setLocationAndAngles(posX, posY, posZ, yaw, entity.rotationPitch);
		}
	}

	@Override
	public void run() {
		try {

			this.sleep(250);
			if (entity == null || entity.world.isRemote) {
				this.stop();
			} else if (dim != entity.dimension) {
				entity.changeDimension(dim, this);
				this.stop();
			} else {
				placeEntity(entity.world, entity, entity.rotationYaw);
				this.stop();
			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		this.stop();
	}
}