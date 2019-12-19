package com.morimori.mgserverutility.slashblade.blades;

import mods.flammpfeil.slashblade.ItemSlashBladeNamed;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class BladeTest {
	public static void init() {
		registBlade();
		registRecipe();
	}

	public static String NAME = "flammpfeil.slashblade.named.mgsvu.test";

	public static void registBlade() {

		ItemStack blade = new ItemStack(SlashBlade.bladeNamed, 1, 0);
		NBTTagCompound tag = new NBTTagCompound();
		blade.setTagCompound(tag);

		ItemSlashBladeNamed.CurrentItemName.set(tag, NAME);
		ItemSlashBladeNamed.CustomMaxDamage.set(tag, 60);
		ItemSlashBlade.setBaseAttackModifier(tag, 4 + Item.ToolMaterial.DIAMOND.getAttackDamage());

		ItemSlashBlade.TextureName.set(tag, "named/test/test");
		ItemSlashBlade.ModelName.set(tag, "named/test/test");
		ItemSlashBlade.SpecialAttackType.set(tag, 810);
		ItemSlashBlade.StandbyRenderType.set(tag, 2);
		ItemSlashBladeNamed.IsDefaultBewitched.set(tag, true);
		ItemSlashBlade.SummonedSwordColor.set(tag, 0x71d971);

		blade.addEnchantment(Enchantments.POWER, 3);
		blade.addEnchantment(Enchantments.FORTUNE, 3);

		SlashBlade.registerCustomItemStack(NAME, blade);
		ItemSlashBladeNamed.NamedBlades.add(NAME);

	}

	public static void registRecipe() {

	}
}
