package com.morimori.mgserverutility.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.MGSoundEvents;
import com.morimori.mgserverutility.MODCreativeTab;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class MODItems {

	public static Item VANADIUM_STEEL_INGOT = new Item()
			.setRegistryName(MGServerUtility.MODID, "vanadium_steel_ingot")
			.setUnlocalizedName("vanadium_steel_ingot")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item NAQUADAH_ALLOY_INGOT = new Item()
			.setRegistryName(MGServerUtility.MODID, "naquadah_alloy_ingot")
			.setUnlocalizedName("naquadah_alloy_ingot")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item TUNGSTEN_STEEL_INGOT = new Item()
			.setRegistryName(MGServerUtility.MODID, "tungsten_steel_ingot")
			.setUnlocalizedName("tungsten_steel_ingot")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item ULTIMET_INGOT = new Item()
			.setRegistryName(MGServerUtility.MODID, "ultimet_ingot")
			.setUnlocalizedName("ultimet_ingot")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item NAQUADAH_INGOT = new Item()
			.setRegistryName(MGServerUtility.MODID, "naquadah_ingot")
			.setUnlocalizedName("naquadah_ingot")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item KAME_STEEL_INGOT = new Item()
			.setRegistryName(MGServerUtility.MODID, "kame_steel_ingot")
			.setUnlocalizedName("kame_steel_ingot")
			.setCreativeTab(MODCreativeTab.MGTAB);

	public static Item VOID_INGOT = new Item()
			.setRegistryName(MGServerUtility.MODID, "void_ingot")
			.setUnlocalizedName("void_ingot")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item VOID_NUGGET = new Item()
			.setRegistryName(MGServerUtility.MODID, "void_nugget")
			.setUnlocalizedName("void_nugget")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item CYCLOPS_RECORD = new IItemRecord("cyclops", MGSoundEvents.CYCLOPS_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "cyclops_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item HOLOGRAM_RECORD = new IItemRecord("hologram", MGSoundEvents.HOLOGRAM_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "hologram_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item YATTAZE_RECORD = new IItemRecord("yattaze", MGSoundEvents.YATTAZE_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "yattaze_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item MARENOL_RECORD = new IItemRecord("marenol", MGSoundEvents.MARENOL_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "marenol_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item MOPEMOPE_RECORD = new IItemRecord("mopemope", MGSoundEvents.MOPEMOPE_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "mopemope_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_RECORD = new IItemRecord(
			"break_the_night_aran_remix_redalice", MGSoundEvents.BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_MUSIC)
					.setRegistryName(MGServerUtility.MODID, "break_the_night_aran_remix_redalice_record")
					.setUnlocalizedName("record")
					.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item CHAOS_MUSIC_RECORD = new IItemRecord("chaos_music", MGSoundEvents.CHAOS_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "chaos_music_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item SNAKE_EATER_RECORD = new IItemRecord("snake_eater", MGSoundEvents.SNAKE_EATER_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "snake_eater_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item TAKARAZIMA_RECORD = new IItemRecord("sakanak", MGSoundEvents.TAKARAZIMA_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "sakanak_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item YSYOU_RECORD = new IItemRecord("ysyou", MGSoundEvents.YSYOU_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "ysyou_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item HAKUSINKARATEBU_RECORD = new IItemRecord("hakusinkaratebu", MGSoundEvents.HAKUSINKARATEBU_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "hakusinkaratebu_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item YJINTABYU_RECORD = new IItemRecord("yjintabyu-", MGSoundEvents.YJINTABYU_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "yjintabyu_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item KONGYO_RECORD = new IItemRecord("kongyo", MGSoundEvents.KONGYO_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "kongyo_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item IEVAN_POLKKA_RECORD = new IItemRecord("ievan_polkka", MGSoundEvents.IEVAN_POLKKA_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "ievan_polkka_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item EVANGELION_8TH_APOSTLE_RECORD = new IItemRecord("evangelion_8th_apostle",
			MGSoundEvents.EVANGELION_8TH_APOSTLE_MUSIC)
					.setRegistryName(MGServerUtility.MODID, "evangelion_8th_apostle_record")
					.setUnlocalizedName("record")
					.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item SOVIET_MARCH_RECORD = new IItemRecord("soviet_march", MGSoundEvents.SOVIET_MARCH_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "soviet_march_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item PEPSIMAN_THEME_RECORD = new IItemRecord("pepsiman_theme", MGSoundEvents.PEPSIMAN_THEME_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "pepsiman_theme_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item AWAKENING_RECORD = new IItemRecord("awakening", MGSoundEvents.AWAKENING_MUSIC)
			.setRegistryName(MGServerUtility.MODID, "awakening_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);
	public static Item KEIZOKU_HIGH_RECORD = new IItemRecord("keizoku_high_school", MGSoundEvents.KEIZOKU_HIGH_SCHOOL)
			.setRegistryName(MGServerUtility.MODID, "keizoku_high_school_record")
			.setUnlocalizedName("record")
			.setCreativeTab(MODCreativeTab.MGTAB);

	public static Item RECORD_LOTTERY_BAG = new ItemLotteryLootBag("record", LootBag.RECORD_LOOT)
			.setRegistryName(MGServerUtility.MODID, "record_lottery_loot_bag")
			.setUnlocalizedName("record_lottery_loot_bag").setCreativeTab(MODCreativeTab.MGTAB);

	public static Item YJ_LOTTERY_BAG = new ItemLotteryLootBag("yj", LootBag.YJ_LOOT)
			.setRegistryName(MGServerUtility.MODID, "yj_lottery_loot_bag")
			.setUnlocalizedName("yj_lottery_loot_bag").setCreativeTab(MODCreativeTab.MGTAB);

	public static Item INM_LOTTERY_BAG = new ItemLotteryLootBag("inm", LootBag.INM_LOOT)
			.setRegistryName(MGServerUtility.MODID, "inm_lottery_loot_bag")
			.setUnlocalizedName("inm_lottery_loot_bag").setCreativeTab(MODCreativeTab.MGTAB);

	public static Item BLADE_LOTTERY_BAG = new ItemLotteryLootBag("blade", LootBag.BLADE_LOOT)
			.setRegistryName(MGServerUtility.MODID, "blade_lottery_loot_bag")
			.setUnlocalizedName("blade_lottery_loot_bag").setCreativeTab(MODCreativeTab.MGTAB);

	public static Item HEAD_LOTTERY_BAG = new ItemLotteryLootBag("head", LootBag.HEAD_LOOT, true)
			.setRegistryName(MGServerUtility.MODID, "head_lottery_loot_bag")
			.setUnlocalizedName("head_lottery_loot_bag").setCreativeTab(MODCreativeTab.MGTAB);

	public static Item GUN_LOTTERY_BAG = new ItemLotteryLootBag("gun", LootBag.GUN_LOOT)
			.setRegistryName(MGServerUtility.MODID, "gun_lottery_loot_bag")
			.setUnlocalizedName("gun_lottery_loot_bag").setCreativeTab(MODCreativeTab.MGTAB);

	public static Item TEST_ITEM = new ItemTest()
			.setRegistryName(MGServerUtility.MODID, "test")
			.setUnlocalizedName("test")
			.setCreativeTab(MODCreativeTab.MGTAB);

	public static Item IKISUGINITHI_SWORD = new ItemIkisuginithiSword(MGToolMaterial.iKISUGINITHI)
			.setRegistryName(MGServerUtility.MODID, "ikisuginithi_sword")
			.setUnlocalizedName("ikisuginithi_sword")
			.setCreativeTab(MODCreativeTab.MGTAB);

	public static Item iKISUGINITHI_HELMET = new ItemIkisuginithiAromer(MGArmorMaterial.IKISUGINITHI, 1,
			EntityEquipmentSlot.HEAD)
					.setRegistryName(MGServerUtility.MODID, "ikisuginithi_helmet")
					.setUnlocalizedName("ikisuginithi_helmet")
					.setCreativeTab(MODCreativeTab.MGTAB);

	public static Item iKISUGINITHI_CHESTPLATE = new ItemIkisuginithiAromer(MGArmorMaterial.IKISUGINITHI, 1,
			EntityEquipmentSlot.CHEST)
					.setRegistryName(MGServerUtility.MODID, "ikisuginithi_chestplate")
					.setUnlocalizedName("ikisuginithi_chestplate")
					.setCreativeTab(MODCreativeTab.MGTAB);

	public static Item iKISUGINITHI_LEGGINGS = new ItemIkisuginithiAromer(MGArmorMaterial.IKISUGINITHI, 2,
			EntityEquipmentSlot.LEGS)
					.setRegistryName(MGServerUtility.MODID, "ikisuginithi_leggings")
					.setUnlocalizedName("ikisuginithi_leggings")
					.setCreativeTab(MODCreativeTab.MGTAB);

	public static Item iKISUGINITHI_BOOTS = new ItemIkisuginithiAromer(MGArmorMaterial.IKISUGINITHI, 1,
			EntityEquipmentSlot.FEET)
					.setRegistryName(MGServerUtility.MODID, "ikisuginithi_boots")
					.setUnlocalizedName("ikisuginithi_boots")
					.setCreativeTab(MODCreativeTab.MGTAB);

	public static Item ITEM_LOTTERY_BAG = new ItemItemLotteryLootBag("item", LootBag.GUN_LOOT)
			.setRegistryName(MGServerUtility.MODID, "item_lottery_loot_bag")
			.setUnlocalizedName("item_lottery_loot_bag").setCreativeTab(MODCreativeTab.MGTAB);

	public static List<Item> registerItemList() {
		List<Item> l = new ArrayList<Item>();
		l.addAll(Arrays.asList(
				VANADIUM_STEEL_INGOT,
				VOID_INGOT,
				VOID_NUGGET,
				CYCLOPS_RECORD,
				HOLOGRAM_RECORD,
				YATTAZE_RECORD,
				MARENOL_RECORD,
				MOPEMOPE_RECORD,
				BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_RECORD,
				CHAOS_MUSIC_RECORD,
				SNAKE_EATER_RECORD,
				TAKARAZIMA_RECORD,
				YSYOU_RECORD,
				HAKUSINKARATEBU_RECORD,
				YJINTABYU_RECORD,
				RECORD_LOTTERY_BAG,
				YJ_LOTTERY_BAG,
				INM_LOTTERY_BAG,
				NAQUADAH_ALLOY_INGOT,
				TUNGSTEN_STEEL_INGOT,
				ULTIMET_INGOT,
				NAQUADAH_INGOT,
				KAME_STEEL_INGOT,
				KONGYO_RECORD,
				IEVAN_POLKKA_RECORD,
				EVANGELION_8TH_APOSTLE_RECORD,
				SOVIET_MARCH_RECORD,
				PEPSIMAN_THEME_RECORD,
				AWAKENING_RECORD,
				KEIZOKU_HIGH_RECORD,
				BLADE_LOTTERY_BAG,
				HEAD_LOTTERY_BAG,
				GUN_LOTTERY_BAG,
				ITEM_LOTTERY_BAG,

				IKISUGINITHI_SWORD,
				iKISUGINITHI_HELMET,
				iKISUGINITHI_CHESTPLATE,
				iKISUGINITHI_LEGGINGS,
				iKISUGINITHI_BOOTS

		));

		return l;
	}

	public static List<Item> hideItemList() {
		List<Item> l = new ArrayList<Item>();
		l.addAll(Arrays.asList(
				YJINTABYU_RECORD,
				HAKUSINKARATEBU_RECORD,
				YSYOU_RECORD,
				TAKARAZIMA_RECORD,
				SNAKE_EATER_RECORD,
				CHAOS_MUSIC_RECORD,
				BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_RECORD,
				YATTAZE_RECORD,
				MOPEMOPE_RECORD,
				MARENOL_RECORD,
				YATTAZE_RECORD,
				HOLOGRAM_RECORD,
				CYCLOPS_RECORD,
				KONGYO_RECORD,
				IEVAN_POLKKA_RECORD,
				EVANGELION_8TH_APOSTLE_RECORD,
				SOVIET_MARCH_RECORD,
				PEPSIMAN_THEME_RECORD,
				AWAKENING_RECORD,
				KEIZOKU_HIGH_RECORD,
				IKISUGINITHI_SWORD,
				iKISUGINITHI_HELMET,
				iKISUGINITHI_CHESTPLATE,
				iKISUGINITHI_LEGGINGS,
				iKISUGINITHI_BOOTS,
				KAME_STEEL_INGOT

		));

		return l;
	}

	public static void posInit() {

		LootBag.posInit();

	}
}
