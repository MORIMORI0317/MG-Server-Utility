package com.morimori.mgserverutility.blocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.MODCreativeTab;
import com.morimori.mgserverutility.fluids.MODFluids;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import slimeknights.tconstruct.smeltery.block.BlockTinkerFluid;

public class MODBlocks {

	public static Block VANADIUM_STEEL_BLOCK = new Block(Material.IRON).setRegistryName(MGServerUtility.MODID,
			"vanadium_steel_block").setHardness(1.5f).setResistance(3).setCreativeTab(MODCreativeTab.MGTAB)
			.setUnlocalizedName("vanadium_steel_block");
	public static Block VOID_BLOCK = new Block(Material.IRON).setRegistryName(MGServerUtility.MODID,
			"void_block").setHardness(1.5f).setResistance(3).setCreativeTab(MODCreativeTab.MGTAB)
			.setUnlocalizedName("void_block");

	public static Block NAQUADAH_ORE = new Block(Material.IRON).setRegistryName(MGServerUtility.MODID,
			"naquadah_ore").setHardness(1.5f).setResistance(3).setCreativeTab(MODCreativeTab.MGTAB)
			.setUnlocalizedName("naquadah_ore");

	public static Block OOD_BLOCK = new Block(Material.IRON).setRegistryName(MGServerUtility.MODID,
			"out_of_dimension_block").setHardness(1.5f).setResistance(3).setCreativeTab(MODCreativeTab.MGTAB)
			.setUnlocalizedName("out_of_dimension_block");

	public static Block TEST_BLOCK = new BlockTest(Material.IRON).setRegistryName(MGServerUtility.MODID,
			"test_block").setHardness(1.5f).setResistance(3).setCreativeTab(MODCreativeTab.MGTAB)
			.setUnlocalizedName("test_block");

	public static Block MOLTEN_TELEKILL_ALLOY_BLOCK = new BlockTinkerFluid(MODFluids.MOLTEN_TELEKILL_ALLOY,
			Material.LAVA).setRegistryName(MGServerUtility.MODID, "molten_telekill_alloy_fluid");
	public static Block MOLTEN_VANADIUM_STEEL_BLOCK = new BlockTinkerFluid(MODFluids.MOLTEN_VANADIUM_STEEL,
			Material.LAVA).setRegistryName(MGServerUtility.MODID, "molten_vanadium_steel_fluid");
	public static Block MOLTEN_DATA_EXPUNGEDL_BLOCK = new BlockTinkerFluid(MODFluids.MOLTEN_DATA_EXPUNGED,
			Material.WATER).setRegistryName(MGServerUtility.MODID, "molten_data_expunged_fluid");
	public static Block MOLTEN_VOID_BLOCK = new BlockTinkerFluid(MODFluids.MOLTEN_VOID,
			Material.WATER).setRegistryName(MGServerUtility.MODID, "molten_void_fluid");

	public static Block MOLTEN_NAQUADAH_ALLOY_BLOCK = new BlockTinkerFluid(MODFluids.MOLTEN_NAQUADAH_ALLOY,
			Material.LAVA).setRegistryName(MGServerUtility.MODID, "molten_naquadah_alloy_fluid");
	public static Block MOLTEN_TUNGSTEN_STEEL_BLOCK = new BlockTinkerFluid(MODFluids.MOLTEN_TUNGSTEN_STEEL,
			Material.LAVA).setRegistryName(MGServerUtility.MODID, "molten_tungsten_steel_fluid");
	public static Block MOLTEN_ULTIMET_BLOCK = new BlockTinkerFluid(MODFluids.MOLTEN_ULTIMET,
			Material.LAVA).setRegistryName(MGServerUtility.MODID, "molten_ultimet_fluid");
	public static Block MOLTEN_NAQUADAH_BLOCK = new BlockTinkerFluid(MODFluids.MOLTEN_NAQUADAH,
			Material.LAVA).setRegistryName(MGServerUtility.MODID, "molten_naquadah_fluid");

	public static List<Block> registerBlockList() {
		List<Block> l = new ArrayList<Block>();
		l.addAll(Arrays.asList(
				VANADIUM_STEEL_BLOCK,
				TEST_BLOCK,
				OOD_BLOCK,
				NAQUADAH_ORE,
				VOID_BLOCK

		));
		return l;
	}

	public static List<Block> registerBlockOnryList() {
		List<Block> l = new ArrayList<Block>();
		l.addAll(Arrays.asList(

				MOLTEN_TELEKILL_ALLOY_BLOCK,
				MOLTEN_VANADIUM_STEEL_BLOCK,
				MOLTEN_DATA_EXPUNGEDL_BLOCK,
				MOLTEN_VOID_BLOCK,
				MOLTEN_NAQUADAH_ALLOY_BLOCK,
				MOLTEN_TUNGSTEN_STEEL_BLOCK,
				MOLTEN_ULTIMET_BLOCK,
				MOLTEN_NAQUADAH_BLOCK

		));
		return l;
	}

}
