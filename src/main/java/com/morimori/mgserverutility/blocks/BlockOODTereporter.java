package com.morimori.mgserverutility.blocks;

import javax.annotation.Nullable;

import com.morimori.mgserverutility.config.MGConfig;
import com.morimori.mgserverutility.tile.TileOODTereporter;
import com.morimori.mgserverutility.util.MGTereporter;
import com.morimori.mgserverutility.world.biome.MGBiomes;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOODTereporter extends Block implements ITileEntityProvider {

	public BlockOODTereporter(Material materialIn) {
		super(materialIn);
		this.setTickRandomly(true);

	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileOODTereporter();
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		if (playerIn.dimension != MGConfig.OOD_ID) {
			MGTereporter
					.of(playerIn.getPosition().getX(), 110, playerIn.getPosition().getZ(), MGConfig.OOD_ID, playerIn)
					.start();
		}

		return true;
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	public boolean isFullCube(IBlockState state) {

		return false;
	}

	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return NULL_AABB;
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if (entityIn.dimension != MGConfig.OOD_ID) {
			MGTereporter
					.of(entityIn.getPosition().getX(), 110, entityIn.getPosition().getZ(), MGConfig.OOD_ID, entityIn)
					.start();
		}
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {

		return worldIn.getBiome(pos) != MGBiomes.OUTOFDIMENSION;
	}

}
