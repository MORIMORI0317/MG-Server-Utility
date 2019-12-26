package com.morimori.mgserverutility.blocks;

import com.morimori.mgserverutility.config.MGConfig;
import com.morimori.mgserverutility.tile.TileOODTereporter;
import com.morimori.mgserverutility.util.MGTereporter;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOODTereporter extends Block implements ITileEntityProvider {

	public BlockOODTereporter(Material materialIn) {
		super(materialIn);

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
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    public boolean isFullCube(IBlockState state)
    {

        return false;
    }
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

}
