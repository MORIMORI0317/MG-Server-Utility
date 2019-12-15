package com.morimori.mgserverutility.world.dimensions;

import java.util.List;
import java.util.Random;

import com.morimori.mgserverutility.blocks.MODBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;

public class ChunkGeneratorOutOf implements IChunkGenerator {
	private World world;

	public ChunkGeneratorOutOf(World worldIn) {
		world = worldIn;
	}

	public void genSurface(Chunk chunk) {
		for (int x = 0; x < 16; x++)
			for (int z = 0; z < 16; z++)
				chunk.setBlockState(new BlockPos(x, 0, z), Blocks.BEDROCK.getDefaultState());
	}

	@Override
	public void populate(int x, int z) {
	}

	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		return false;
	}

	@Override
	public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		return world.getBiome(pos).getSpawnableList(creatureType);
	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {

	}

	@Override
	public Chunk generateChunk(int x, int z) {
		Random r = new Random();
		int a = r.nextInt(10);
		ChunkPrimer primer = new ChunkPrimer();
		IBlockState STONE = Blocks.STONE.getDefaultState();
		IBlockState OODB = MODBlocks.OOD_BLOCK.getDefaultState();
		IBlockState BEDROCK = Blocks.BEDROCK.getDefaultState();
		int x1, y1, z1;
		for (x1 = 0; x1 < 16; x1++) {
			for (z1 = 0; z1 < 16; z1++) {
				primer.setBlockState(x1, 0, z1, BEDROCK);

			}
		}
		for (x1 = 0; x1 < 16; x1++) {
			for (y1 = 1; y1 < 100; y1++) {
				for (z1 = 0; z1 < 16; z1++) {
					primer.setBlockState(x1, y1, z1, STONE);
				}
			}
		}

		for (x1 = 0; x1 < 16; x1++) {
			for (y1 = 100; y1 < 100 + a; y1++) {
				for (z1 = 0; z1 < 16; z1++) {
					primer.setBlockState(x1, y1, z1, OODB);
				}
			}
		}

		for (x1 = 0; x1 < 16; x1++) {
			for (z1 = 0; z1 < 16; z1++) {
				primer.setBlockState(x1, 100 + a, z1, OODB);

			}
		}
		Chunk chunk = new Chunk(this.world, primer, x, z);

		byte[] biomeArray = chunk.getBiomeArray();
		byte id = (byte) Biome.getIdForBiome(Biomes.PLAINS);
		for (int i = 0; i < biomeArray.length; ++i) {
			biomeArray[i] = id;
		}

		chunk.generateSkylightMap();
		return chunk;
	}

	@Override
	public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position,
			boolean findUnexplored) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}