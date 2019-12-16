package com.morimori.mgserverutility.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class MGBiomes {
	public static Biome OUTOFDIMENSION = new BiomeVoid(
			new BiomeProperties("OutOfDimension").setTemperature(0F).setWaterColor(74));

	public static void init() {
		registerBiome(OUTOFDIMENSION, "outofdimension", BiomeType.WARM, Type.VOID, Type.COLD, Type.DRY, Type.END,
				Type.DEAD);
	}

	public static void registerBiome(Biome biomes, String name, BiomeType Btyape, Type... tyape) {
		biomes.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biomes);
		BiomeDictionary.addTypes(biomes, tyape);
		BiomeManager.addBiome(Btyape, new BiomeEntry(biomes, 3));

	}
}
