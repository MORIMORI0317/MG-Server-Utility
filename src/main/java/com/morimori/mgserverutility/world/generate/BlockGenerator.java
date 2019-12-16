package com.morimori.mgserverutility.world.generate;

import java.util.Random;

import com.morimori.mgserverutility.blocks.MODBlocks;
import com.morimori.mgserverutility.world.biome.MGBiomes;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class BlockGenerator implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {

		generateore(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);

	}

	public void generateore(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {

		if (world.getBiome(new BlockPos(chunkX * 16, 60, chunkZ * 16)) == MGBiomes.OUTOFDIMENSION) {
			OreGenHinagata.oregen(MODBlocks.NAQUADAH_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16,
					0,
					3 + random.nextInt(5), 6);
			OreGenHinagata.oregen(MODBlocks.NAQUADAH_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 12,
					2,
					3 + random.nextInt(5), 1);
		} else {
			OreGenHinagata.oregen(MODBlocks.NAQUADAH_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16,
					0,
					3 + random.nextInt(5), 1);

		}
	}

}
