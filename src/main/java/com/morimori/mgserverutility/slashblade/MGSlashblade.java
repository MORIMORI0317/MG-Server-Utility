package com.morimori.mgserverutility.slashblade;

import com.morimori.mgserverutility.items.LootBag;
import com.morimori.mgserverutility.slashblade.blades.BladeMurasamablade;
import com.morimori.mgserverutility.slashblade.blades.BladeNull;
import com.morimori.mgserverutility.slashblade.blades.BladeYj;

import cn.mmf.slashblade_tic.item.RegisterLoader;
import mods.flammpfeil.slashblade.ItemSlashBladeNamed;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class MGSlashblade {
	public static void preInit() {

	}

	public static void Init() {
		//	BladeTest.init();
		BladeYj.init();
		BladeNull.init();
		BladeMurasamablade.init();
	}

	public static void posInit() {
		for (String bladename : ItemSlashBladeNamed.NamedBlades) {
			if (bladename != "flammpfeil.slashblade.named.mgsvu.yj")
				LootBag.BLADE_LOOT.put(SlashBlade.getCustomBlade(bladename), 1);
		}
		for (String bladename : ItemSlashBladeNamed.NamedBlades) {
			if (bladename != "flammpfeil.slashblade.named.mgsvu.yj") {
				ItemStack blade = SlashBlade.getCustomBlade(bladename);
				NBTTagCompound tag = ItemSlashBlade.getItemTagCompound(blade);
				if (!getItemstackWithNBT(tag).isEmpty())
					LootBag.BLADE_LOOT.put(getItemstackWithNBT(tag), 3);
			}
		}
		{
			LootBag.YJ_LOOT.put(SlashBlade.getCustomBlade("flammpfeil.slashblade.named.mgsvu.yj"), 1);
			ItemStack yjblade = SlashBlade.getCustomBlade("flammpfeil.slashblade.named.mgsvu.yj");
			NBTTagCompound yjtag = ItemSlashBlade.getItemTagCompound(yjblade);
			LootBag.YJ_LOOT.put(getItemstackWithNBT(yjtag), 2);
		}
	}

	private static ItemStack getItemstackWithNBT(NBTTagCompound tag_paper2) {
		ItemStack paper = new ItemStack(RegisterLoader.blade_model_paper);
		NBTTagCompound tag_result = ItemSlashBlade.getItemTagCompound(paper);
		ItemSlashBlade.ModelName.set(tag_result,
				ItemSlashBlade.ModelName.exists(tag_paper2) ? ItemSlashBlade.ModelName.get(tag_paper2) : "blade");
		ItemSlashBlade.TextureName.set(tag_result,
				ItemSlashBlade.TextureName.exists(tag_paper2) ? ItemSlashBlade.TextureName.get(tag_paper2) : "blade");
		ItemSlashBladeNamed.CurrentItemName.set(tag_result,
				ItemSlashBladeNamed.CurrentItemName.exists(tag_paper2)
						? ItemSlashBladeNamed.CurrentItemName.get(tag_paper2)
						: "flammpfeil.slashblade.named");
		ItemSlashBlade.StandbyRenderType.set(tag_result,
				ItemSlashBlade.StandbyRenderType.exists(tag_paper2) ? ItemSlashBlade.StandbyRenderType.get(tag_paper2)
						: 0);
		ItemSlashBladeNamed.SummonedSwordColor.set(tag_result,
				ItemSlashBladeNamed.SummonedSwordColor.exists(tag_paper2)
						? ItemSlashBladeNamed.SummonedSwordColor.get(tag_paper2)
						: 0x3333FF);
		ItemSlashBladeNamed.SpecialAttackType.set(tag_result,
				ItemSlashBlade.SpecialAttackType.exists(tag_paper2) ? ItemSlashBlade.SpecialAttackType.get(tag_paper2)
						: 0);
		if (tag_paper2.hasKey("SB.SEffect"))
			tag_result.setTag("SB.SEffect", tag_paper2.getCompoundTag("SB.SEffect"));
		return paper;
	}

}