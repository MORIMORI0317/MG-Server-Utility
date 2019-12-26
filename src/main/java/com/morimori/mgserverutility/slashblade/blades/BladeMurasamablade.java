package com.morimori.mgserverutility.slashblade.blades;

import mods.flammpfeil.slashblade.ItemSlashBladeNamed;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class BladeMurasamablade {
	public static void init() {
		registBlade();
		registRecipe();
	}

	public static String NAME = "flammpfeil.slashblade.named.mgsvu.murasamablade";

	public static void registBlade() {
		ItemStack blade = new ItemStack(SlashBlade.bladeNamed, 1, 0);
		NBTTagCompound tag = new NBTTagCompound();
		blade.setTagCompound(tag);

		ItemSlashBladeNamed.CurrentItemName.set(tag, NAME);
		ItemSlashBladeNamed.CustomMaxDamage.set(tag, 150);
		ItemSlashBlade.setBaseAttackModifier(tag, 4 + 10);

		ItemSlashBlade.TextureName.set(tag, "named/murasamablade/murasama");
		ItemSlashBlade.ModelName.set(tag, "named/murasamablade/murasama");
		ItemSlashBlade.SpecialAttackType.set(tag, 4);
		ItemSlashBlade.StandbyRenderType.set(tag, 1);
		ItemSlashBladeNamed.IsDefaultBewitched.set(tag, true);
		ItemSlashBlade.SummonedSwordColor.set(tag, Integer.parseInt("ff0000", 16));

		SlashBlade.registerCustomItemStack(NAME, blade);
		ItemSlashBladeNamed.NamedBlades.add(NAME);

	}

	public static void registRecipe() {

	}

}