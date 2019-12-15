package com.morimori.mgserverutility.jei;

import com.morimori.mgserverutility.items.MODItems;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.ISubtypeRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@JEIPlugin
public class MGJeiPlugin implements IModPlugin {

	@Override
	public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {

	}

	@Override
	public void registerIngredients(IModIngredientRegistration ingredientRegistration) {

	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {

	}

	@Override
	public void register(IModRegistry registry) {

		for (Item i : MODItems.hideItemList()) {
			registry.getJeiHelpers().getIngredientBlacklist().addIngredientToBlacklist(new ItemStack(i));

		}

	}
}
