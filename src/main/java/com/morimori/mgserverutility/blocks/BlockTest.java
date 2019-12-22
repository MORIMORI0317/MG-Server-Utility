package com.morimori.mgserverutility.blocks;

import com.morimori.mgserverutility.config.MGConfig;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTest extends Block {

	public BlockTest(Material materialIn) {
		super(Material.PORTAL);
		setHardness(2F);
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		if (worldIn.provider.getDimension() == 0) {
			return super.canPlaceBlockAt(worldIn, pos);
		} else if (worldIn.provider.getDimension() == MGConfig.OOD_ID) {
			return super.canPlaceBlockAt(worldIn, pos);
		} else {
			return false;
		}
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			//FROM OVERWORLD TO MINING DIM
			if (worldIn.provider.getDimension() == 0) {
				World otherWorld = worldIn.getMinecraftServer().getWorld(MGConfig.OOD_ID);
				otherWorld.getBlockState(pos);
				BlockPos otherWorldPos = otherWorld.getHeight(pos);
				boolean foundBlock = false;
				BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos(0, 0, 0);

				for (int y = 0; y < 256; y++) {
					for (int x = pos.getX() - 6; x < pos.getX() + 6; x++) {
						for (int z = pos.getZ() - 6; z < pos.getZ() + 6; z++) {
							mutableBlockPos.setPos(x, y, z);
							if (otherWorld.getBlockState(mutableBlockPos).getBlock() == Blocks.AIR) {
								otherWorldPos = new BlockPos(x, y + 1, z);
								foundBlock = true;
								break;
							}
						}
					}
				}
				if (foundBlock) {

				}
				if (!foundBlock) {
					otherWorld.setBlockState(otherWorldPos.down(), Blocks.AIR.getDefaultState());
				//	MGTereporter.of(target.getPosition().getX(), 110,target.getPosition().getZ(), MGConfig.OOD_ID, target).run();
				}
			}

			//FROM MINING DIM TO OVERWORLD
			if (worldIn.provider.getDimension() == MGConfig.OOD_ID) {
				World overWorld = worldIn.getMinecraftServer().getWorld(0);
				overWorld.getBlockState(pos);
				BlockPos overWorldPos = overWorld.getHeight(pos);
				boolean foundBlock = false;
				BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos(0, 0, 0);

				for (int y = 0; y < 256; y++) {
					for (int x = pos.getX() - 6; x < pos.getX() + 6; x++) {
						for (int z = pos.getZ() - 6; z < pos.getZ() + 6; z++) {
							mutableBlockPos.setPos(x, y, z);
							if (overWorld.getBlockState(mutableBlockPos).getBlock() == Blocks.AIR) {
								overWorldPos = new BlockPos(x, y + 1, z);
								foundBlock = true;
								break;
							}
						}
					}
				}
				if (foundBlock) {

				}
				if (!foundBlock) {
					overWorld.setBlockState(overWorldPos.down(), Blocks.AIR.getDefaultState());

				}
			}
		}
		return true;
	}
}