package com.morimori.mgserverutility.items;

import com.morimori.mgserverutility.blocks.MODBlocks;

import alexiy.secure.contain.protect.registration.SCPBlocks;
import alexiy.secure.contain.protect.registration.SCPItems;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class MIDOreDictionary {
	public static void registOredict() {
		OreDictionary.registerOre("ingotVanadiumSteel", MODItems.VANADIUM_STEEL_INGOT);
		OreDictionary.registerOre("blockVanadiumSteel", MODBlocks.VANADIUM_STEEL_BLOCK);
		OreDictionary.registerOre("gemCarbon", Items.COAL);
		OreDictionary.registerOre("ingotTelekillAlloy", SCPItems.telekillIngot);
		OreDictionary.registerOre("blockTelekillAlloy", SCPBlocks.telekillBlock);
		OreDictionary.registerOre("oreTelekillAlloy", SCPBlocks.telekillOre);
		OreDictionary.registerOre("gearIron", SCPItems.cog);
		OreDictionary.registerOre("ingotBladeWood", SCPItems.treeMaterial);
		OreDictionary.registerOre("ingotVoid", MODItems.VOID_INGOT);
		OreDictionary.registerOre("nuggetVoid", MODItems.VOID_NUGGET);
	}
}
