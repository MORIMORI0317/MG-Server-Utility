package com.morimori.mgserverutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class MGSoundEvents {
	public static SoundEvent CYCLOPS_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "cyclops"))
			.setRegistryName(MGServerUtility.MODID, "cyclops");

	public static SoundEvent HOLOGRAM_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "hologram"))
			.setRegistryName(MGServerUtility.MODID, "hologram");

	public static SoundEvent YATTAZE_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "yattaze"))
			.setRegistryName(MGServerUtility.MODID, "yattaze");

	public static SoundEvent MARENOL_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "marenol"))
			.setRegistryName(MGServerUtility.MODID, "marenol");

	public static SoundEvent MOPEMOPE_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "mopemope"))
			.setRegistryName(MGServerUtility.MODID, "mopemope");

	public static SoundEvent BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_MUSIC = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "break_the_night_aran_remix_redalice"))
					.setRegistryName(MGServerUtility.MODID, "break_the_night_aran_remix_redalice");

	public static SoundEvent CHAOS_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "chaos_music"))
			.setRegistryName(MGServerUtility.MODID, "chaos_music");

	public static SoundEvent SNAKE_EATER_MUSIC = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "snake_eater"))
					.setRegistryName(MGServerUtility.MODID, "snake_eater");

	public static SoundEvent TAKARAZIMA_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "sakanak"))
			.setRegistryName(MGServerUtility.MODID, "sakanak");

	public static SoundEvent YSYOU_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "ysyou"))
			.setRegistryName(MGServerUtility.MODID, "ysyou");

	public static SoundEvent HAKUSINKARATEBU_MUSIC = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "hakusinkaratebu"))
					.setRegistryName(MGServerUtility.MODID, "hakusinkaratebu");

	public static SoundEvent YJINTABYU_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "yjintabyu-"))
			.setRegistryName(MGServerUtility.MODID, "yjintabyu-");

	public static SoundEvent KONGYO_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "kongyo"))
			.setRegistryName(MGServerUtility.MODID, "kongyo");

	public static SoundEvent IEVAN_POLKKA_MUSIC = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "ievan_polkka"))
					.setRegistryName(MGServerUtility.MODID, "ievan_polkka");

	public static SoundEvent EVANGELION_8TH_APOSTLE_MUSIC = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "evangelion_8th_apostle"))
					.setRegistryName(MGServerUtility.MODID, "evangelion_8th_apostle");

	public static SoundEvent SOVIET_MARCH_MUSIC = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "soviet_march"))
					.setRegistryName(MGServerUtility.MODID, "soviet_march");

	public static SoundEvent PEPSIMAN_THEME_MUSIC = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "pepsiman_theme"))
					.setRegistryName(MGServerUtility.MODID, "pepsiman_theme");

	public static SoundEvent AWAKENING_MUSIC = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "awakening"))
			.setRegistryName(MGServerUtility.MODID, "awakening");

	public static SoundEvent KEIZOKU_HIGH_SCHOOL = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "keizoku_high_school"))
					.setRegistryName(MGServerUtility.MODID, "keizoku_high_school");

	public static SoundEvent TEREPORTOUTOOFDIMENTION = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "tereportoutoofdimention"))
					.setRegistryName(MGServerUtility.MODID, "tereportoutoofdimention");

	public static SoundEvent NNA = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "nna"))
			.setRegistryName(MGServerUtility.MODID, "nna");//ンアー
	public static SoundEvent YARIMASUNEXE = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "yarimasunexe"))
			.setRegistryName(MGServerUtility.MODID, "yarimasunexe");//やりますねぇ!
	public static SoundEvent ONAON = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "onaon"))
			.setRegistryName(MGServerUtility.MODID, "onaon");//オン！アオン！
	public static SoundEvent MAZUUTISAXA = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "mazuutisaxa"))
			.setRegistryName(MGServerUtility.MODID, "mazuutisaxa");//まずうちさぁ…屋上あるんだけど…焼いてかない？
	public static SoundEvent KATAKU = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "kataku"))
			.setRegistryName(MGServerUtility.MODID, "kataku");//硬くなってんぜ
	public static SoundEvent NUWATIKARETA = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "nuwatikareta"))
			.setRegistryName(MGServerUtility.MODID, "nuwatikareta");//ヌワーチカレタモー
	public static SoundEvent BUTTIPA = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "buttipa"))
			.setRegistryName(MGServerUtility.MODID, "buttipa");//ブッチパ
	public static SoundEvent IKISUGI = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "ikisugi"))
			.setRegistryName(MGServerUtility.MODID, "ikisugi");//イキスギ
	public static SoundEvent OSUONEGAI = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "osuonegai"))
			.setRegistryName(MGServerUtility.MODID, "osuonegai");//オースお願いします
	public static SoundEvent DEDEMASUYO = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "dedemasuyo"))
			.setRegistryName(MGServerUtility.MODID, "dedemasuyo");//で、出ますよ
	public static SoundEvent FOOKIMATII = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "fookimatii"))
			.setRegistryName(MGServerUtility.MODID, "fookimatii");//foo↑気持ちィ
	public static SoundEvent IIYOKOIYO = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "114514"))
			.setRegistryName(MGServerUtility.MODID, "114514");//114514
	public static SoundEvent NIJUYONSAI = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "nijuyonsai"))
			.setRegistryName(MGServerUtility.MODID, "nijuyonsai");//24歳
	public static SoundEvent ON = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "on"))
			.setRegistryName(MGServerUtility.MODID, "on");//オン！
	public static SoundEvent ZA = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "za"))
			.setRegistryName(MGServerUtility.MODID, "za");//あー
	public static SoundEvent HUN = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "hun"))
			.setRegistryName(MGServerUtility.MODID, "hun");//フン！
	public static SoundEvent SYU = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "syu"))
			.setRegistryName(MGServerUtility.MODID, "syu");//シュー
	public static SoundEvent YOKUWAKARANAKATTADESU = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "yokuwakaranakattadesu")).setRegistryName(MGServerUtility.MODID,
					"yokuwakaranakattadesu");//よくわからなかったです
	public static SoundEvent GAKUSEIDESU = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "gakuseidesu"))
			.setRegistryName(MGServerUtility.MODID, "gakuseidesu");//学生です
	public static SoundEvent DASOUTOOMOEBA = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "dasoutoomoeba")).setRegistryName(MGServerUtility.MODID,
					"dasoutoomoeba");//出そうと思えば
	public static SoundEvent TAIZYANDSINTYOUGA = new SoundEvent(
			new ResourceLocation(MGServerUtility.MODID, "taizyuandsintyou")).setRegistryName(MGServerUtility.MODID,
					"taizyuandsintyou");//体重が・・・身長が・・・
	public static SoundEvent NU = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "nu"))
			.setRegistryName(MGServerUtility.MODID, "nu");//ヌッ
	public static SoundEvent HORAHORAHORA = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "horahorahora"))
			.setRegistryName(MGServerUtility.MODID, "horahorahora");//ホラホラホラホラ
	public static SoundEvent FA = new SoundEvent(new ResourceLocation(MGServerUtility.MODID, "fa"))
			.setRegistryName(MGServerUtility.MODID, "fa");//ファッ!?

	public static List<SoundEvent> registerSoundEventList() {
		List<SoundEvent> l = new ArrayList<SoundEvent>();
		l.addAll(Arrays.asList(
				CYCLOPS_MUSIC, YARIMASUNEXE, ONAON, MAZUUTISAXA, KATAKU, NUWATIKARETA, BUTTIPA, IKISUGI, OSUONEGAI,
				DEDEMASUYO, FOOKIMATII, IIYOKOIYO, NIJUYONSAI, ON, ZA,
				HUN, SYU, YOKUWAKARANAKATTADESU, GAKUSEIDESU, DASOUTOOMOEBA, TAIZYANDSINTYOUGA, NU, HORAHORAHORA, FA,
				HOLOGRAM_MUSIC,
				MARENOL_MUSIC,
				YATTAZE_MUSIC,
				MOPEMOPE_MUSIC,
				BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_MUSIC,
				CHAOS_MUSIC,
				SNAKE_EATER_MUSIC,
				TAKARAZIMA_MUSIC,
				YSYOU_MUSIC,
				HAKUSINKARATEBU_MUSIC,
				YJINTABYU_MUSIC,
				KONGYO_MUSIC,
				IEVAN_POLKKA_MUSIC,
				EVANGELION_8TH_APOSTLE_MUSIC,
				SOVIET_MARCH_MUSIC,
				PEPSIMAN_THEME_MUSIC,
				AWAKENING_MUSIC,
				KEIZOKU_HIGH_SCHOOL,
				TEREPORTOUTOOFDIMENTION,
				NNA

		));
		return l;

	}

	public static List<SoundEvent> YJPBlockSoundlist = new ArrayList<SoundEvent>();
	public static List<SoundEvent> YJJakenSworlSoundlist = new ArrayList<SoundEvent>();
	public static List<SoundEvent> YJJakenShieldSoundlist = new ArrayList<SoundEvent>();
	public static List<SoundEvent> YJChanseSoundlist = new ArrayList<SoundEvent>();

	public static void ListRegSound() {
		Collections.addAll(YJPBlockSoundlist, NNA, YARIMASUNEXE, ONAON, MAZUUTISAXA, KATAKU, NUWATIKARETA, BUTTIPA,
				IKISUGI, OSUONEGAI,
				DEDEMASUYO, FOOKIMATII, IIYOKOIYO, NIJUYONSAI, YOKUWAKARANAKATTADESU, GAKUSEIDESU, DASOUTOOMOEBA,
				TAIZYANDSINTYOUGA);
		Collections.addAll(YJJakenSworlSoundlist, SYU, FOOKIMATII, HORAHORAHORA

		);
		Collections.addAll(YJJakenShieldSoundlist, NNA, ON, ZA, HUN);
		Collections.addAll(YJChanseSoundlist, FA, NU);

	}

	public static SoundEvent SoundLisRandom(List<SoundEvent> list) {
		int ls = list.size();

		Random r = new Random();

		return list.get(r.nextInt(ls));
	}
}
