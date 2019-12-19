package com.morimori.mgserverutility.slashblade.blades;

import mods.flammpfeil.slashblade.ItemSlashBladeNamed;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class BladeNull {
	public static void init() {
		registBlade();
		registRecipe();
	}

	public static String NAME = "flammpfeil.slashblade.named.mgsvu.nullriot";

	public static void registBlade() {
		ItemStack blade = new ItemStack(SlashBlade.bladeNamed, 1, 0);
		NBTTagCompound tag = new NBTTagCompound();
		blade.setTagCompound(tag);

		ItemSlashBladeNamed.CurrentItemName.set(tag, NAME);
		ItemSlashBladeNamed.CustomMaxDamage.set(tag, 60);
		ItemSlashBlade.setBaseAttackModifier(tag, 4 + Item.ToolMaterial.DIAMOND.getAttackDamage());

		ItemSlashBlade.TextureName.set(tag, "named/null/nullriot");
		ItemSlashBlade.ModelName.set(tag, "named/null/nullriot");
		   ItemSlashBlade.SpecialAttackType.set(tag, 4);
           ItemSlashBlade.StandbyRenderType.set(tag, 1);
		ItemSlashBladeNamed.IsDefaultBewitched.set(tag, true);
		ItemSlashBlade.SummonedSwordColor.set(tag, 9127187);

		SlashBlade.registerCustomItemStack(NAME, blade);
		ItemSlashBladeNamed.NamedBlades.add(NAME);

	}

	public static void registRecipe() {

	}

}
