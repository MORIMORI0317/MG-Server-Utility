package com.morimori.mgserverutility.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.MGSoundEvents;
import com.morimori.mgserverutility.MODCreativeTab;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MODItems {

	public static List<ItemStack> RECPRD_LOOT_LIST = new ArrayList<ItemStack>();

	public static Item VANADIUM_STEEL_INGOT = new Item()
			.setRegistryName(MGServerUtility.MODID, "vanadium_steel_ingot")
			.setUnlocalizedName("vanadium_steel_ingot")
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

	public static Item RECORD_LOOT_BAG = new ItemLootBag("record", RECPRD_LOOT_LIST)
			.setRegistryName(MGServerUtility.MODID, "record_loot_bag")
			.setUnlocalizedName("record_loot_bag").setCreativeTab(MODCreativeTab.MGTAB);

	public static Item RECORD_LOTTERY_BAG = new ItemLotteryLootBag("record", LootBag.RECORD_LOOT)
			.setRegistryName(MGServerUtility.MODID, "record_lottery_loot_bag")
			.setUnlocalizedName("record_loot_bag").setCreativeTab(MODCreativeTab.MGTAB);

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
				RECORD_LOOT_BAG,
				BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_RECORD,
				CHAOS_MUSIC_RECORD,
				SNAKE_EATER_RECORD,
				TAKARAZIMA_RECORD,
				YSYOU_RECORD,
				HAKUSINKARATEBU_RECORD,
				YJINTABYU_RECORD,
				RECORD_LOTTERY_BAG

		));

		return l;
	}

	public static void init() {
		RECPRD_LOOT_LIST.addAll(Arrays.asList(
				new ItemStack(CYCLOPS_RECORD),
				new ItemStack(HOLOGRAM_RECORD),
				new ItemStack(YATTAZE_RECORD),
				new ItemStack(MARENOL_RECORD),
				new ItemStack(MOPEMOPE_RECORD),
				new ItemStack(BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_RECORD),
				new ItemStack(CHAOS_MUSIC_RECORD),
				new ItemStack(SNAKE_EATER_RECORD),
				new ItemStack(TAKARAZIMA_RECORD),
				new ItemStack(YSYOU_RECORD),
				new ItemStack(HAKUSINKARATEBU_RECORD),
				new ItemStack(YJINTABYU_RECORD)

		));
		LootBag.init();
	}
}
