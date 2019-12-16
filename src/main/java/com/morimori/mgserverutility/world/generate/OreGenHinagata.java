package com.morimori.mgserverutility.world.generate;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreGenHinagata {

	public static void oregen(IBlockState state, World world, Random random, int x, int z, int maxY, int minY, int size,
			int chance) {
		int i = 0;
		int haba = maxY - minY;
		BlockMatcher okerutokoro = BlockMatcher.forBlock(Blocks.STONE);

		for (i = 0; i < chance; i++) {

			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(haba), z + random.nextInt(16));
			IBlockState posblock = world.getBlockState(pos);
			if (posblock.getBlock().isReplaceableOreGen(posblock, world, pos, okerutokoro)) {
				WorldGenMinable generator = new WorldGenMinable(state, size);
				generator.generate(world, random, pos);
			}
		}
	}

}
