package com.morimori.mgserverutility.items;

import java.util.HashMap;
import java.util.Map;

import com.morimori.mgserverutility.util.FileLoader;
import com.morimori.mgserverutility.util.ItemHelper;

import nc.item.NCItemRecord;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import svenhjol.charm.tweaks.item.CharmItemRecord;
import techguns.TGuns;

public class LootBag {
	public static Map<ItemStack, Integer> RECORD_LOOT = new HashMap<>();
	public static Map<ItemStack, Integer> YJ_LOOT = new HashMap<>();
	public static Map<ItemStack, Integer> INM_LOOT = new HashMap<>();
	public static Map<ItemStack, Integer> BLADE_LOOT = new HashMap<>();
	public static Map<ItemStack, Integer> HEAD_LOOT = new HashMap<>();
	public static Map<ItemStack, Integer> GUN_LOOT = new HashMap<>();

	public static void posInit() {
		RECORD_LOOT.put(new ItemStack(MODItems.HOLOGRAM_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.MARENOL_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.MOPEMOPE_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.CHAOS_MUSIC_RECORD), 5);
		RECORD_LOOT.put(new ItemStack(MODItems.SNAKE_EATER_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.TAKARAZIMA_RECORD), 1);
		RECORD_LOOT.put(new ItemStack(MODItems.KONGYO_RECORD), 2);
		RECORD_LOOT.put(new ItemStack(MODItems.IEVAN_POLKKA_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.EVANGELION_8TH_APOSTLE_RECORD), 2);
		RECORD_LOOT.put(new ItemStack(MODItems.SOVIET_MARCH_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.PEPSIMAN_THEME_RECORD), 2);
		RECORD_LOOT.put(new ItemStack(MODItems.AWAKENING_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.KEIZOKU_HIGH_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.FIGHTFORQUIESCENCE_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.ENDUREEMPTINESS_RECORD), 3);
		RECORD_LOOT.put(new ItemStack(MODItems.HARUNOKOE_RECORD), 2);

		for (Item i : ForgeRegistries.ITEMS) {
			if (i instanceof CharmItemRecord)
				RECORD_LOOT.put(new ItemStack(i), 40);

			if (i instanceof NCItemRecord)
				RECORD_LOOT.put(new ItemStack(i), 30);

		}

		RECORD_LOOT.put(new ItemStack(Items.RECORD_11), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_13), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_BLOCKS), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_CAT), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_CHIRP), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_FAR), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_MALL), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_MELLOHI), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_STAL), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_STRAD), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_WAIT), 50);
		RECORD_LOOT.put(new ItemStack(Items.RECORD_WARD), 50);

		YJ_LOOT.put(new ItemStack(MODItems.YSYOU_RECORD), 2);
		YJ_LOOT.put(new ItemStack(MODItems.HAKUSINKARATEBU_RECORD), 2);
		YJ_LOOT.put(new ItemStack(MODItems.YJINTABYU_RECORD), 3);
		YJ_LOOT.put(new ItemStack(MODItems.CYCLOPS_RECORD), 5);

		INM_LOOT.put(new ItemStack(MODItems.YJ_LOTTERY_BAG), 1);
		INM_LOOT.put(new ItemStack(MODItems.YATTAZE_RECORD), 3);
		INM_LOOT.put(new ItemStack(MODItems.HUKIGENNAKAZITU_RECORD), 3);
		INM_LOOT.put(new ItemStack(MODItems.HUNNYOURESUTORAN_RECORD), 2);
		FileLoader.arrangeTextFile("mgsververutility_joinplayerlist.txt");
		for (String str : FileLoader.loadTextFile("mgsververutility_joinplayerlist.txt")) {
			HEAD_LOOT.put(ItemHelper.createPlayerHead(str), 1);
		}

		GUN_LOOT.put(new ItemStack(TGuns.handcannon), 50);
		GUN_LOOT.put(new ItemStack(TGuns.m4), 15);
		GUN_LOOT.put(new ItemStack(TGuns.thompson), 20);
		GUN_LOOT.put(new ItemStack(TGuns.pistol), 15);
		GUN_LOOT.put(new ItemStack(TGuns.lmg), 9);
		GUN_LOOT.put(new ItemStack(TGuns.boltaction), 15);
		GUN_LOOT.put(new ItemStack(TGuns.biogun), 5);
		GUN_LOOT.put(new ItemStack(TGuns.rocketlauncher), 9);
		GUN_LOOT.put(new ItemStack(TGuns.sawedoff), 30);
		GUN_LOOT.put(new ItemStack(TGuns.flamethrower), 9);
		GUN_LOOT.put(new ItemStack(TGuns.ak47), 20);
		GUN_LOOT.put(new ItemStack(TGuns.minigun), 3);
		GUN_LOOT.put(new ItemStack(TGuns.combatshotgun), 15);
		GUN_LOOT.put(new ItemStack(TGuns.revolver), 20);
		GUN_LOOT.put(new ItemStack(TGuns.grimreaper), 3);
		GUN_LOOT.put(new ItemStack(TGuns.pdw), 5);
		GUN_LOOT.put(new ItemStack(TGuns.as50), 9);
		GUN_LOOT.put(new ItemStack(TGuns.teslagun), 5);
		GUN_LOOT.put(new ItemStack(TGuns.m4_infiltrator), 8);
		GUN_LOOT.put(new ItemStack(TGuns.goldenrevolver), 10);
		GUN_LOOT.put(new ItemStack(TGuns.pulserifle), 5);
		GUN_LOOT.put(new ItemStack(TGuns.lasergun), 4);
		GUN_LOOT.put(new ItemStack(TGuns.blasterrifle), 5);
		GUN_LOOT.put(new ItemStack(TGuns.alienblaster), 5);
		GUN_LOOT.put(new ItemStack(TGuns.netherblaster), 8);
		GUN_LOOT.put(new ItemStack(TGuns.powerhammer), 15);
		GUN_LOOT.put(new ItemStack(TGuns.grenadelauncher), 10);
		GUN_LOOT.put(new ItemStack(TGuns.aug), 13);
		GUN_LOOT.put(new ItemStack(TGuns.sonicshotgun), 6);
		GUN_LOOT.put(new ItemStack(TGuns.chainsaw), 12);
		GUN_LOOT.put(new ItemStack(TGuns.scatterbeamrifle), 4);
		GUN_LOOT.put(new ItemStack(TGuns.nucleardeathray), 2);
		GUN_LOOT.put(new ItemStack(TGuns.mac10), 14);
		GUN_LOOT.put(new ItemStack(TGuns.mibgun), 6);
		GUN_LOOT.put(new ItemStack(TGuns.vector), 13);
		GUN_LOOT.put(new ItemStack(TGuns.scar), 9);
		GUN_LOOT.put(new ItemStack(TGuns.gaussrifle), 3);
		GUN_LOOT.put(new ItemStack(TGuns.guidedmissilelauncher), 7);
		GUN_LOOT.put(new ItemStack(TGuns.miningdrill), 6);
		GUN_LOOT.put(new ItemStack(TGuns.tfg), 1);
		{
			ItemStack nuker = new ItemStack(TGuns.rocketlauncher);
			NBTTagCompound nukertag = new NBTTagCompound();
			NBTTagCompound nukernametag = new NBTTagCompound();
			nukernametag.setString("LocName", "item.nukel.name");
			nukertag.setTag("display", nukernametag);
			nukertag.setString("ammovariant", "nuke");
			nukertag.setShort("ammo", (short) 1);
			nukertag.setByte("camo", (byte) 0);
			nuker.setTagCompound(nukertag);
			GUN_LOOT.put(nuker, 1);
		}

	}

}
