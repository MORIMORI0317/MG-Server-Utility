package com.morimori.mgserverutility.items;

import com.morimori.mgserverutility.client.handler.RenderHandler;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemAnyIngot extends Item {
	int colorIn;

	public ItemAnyIngot(int colorIn) {
		this.colorIn = colorIn;
		RenderHandler.colerItem.add(this);
	}

	public ItemAnyIngot(String colorIn) {
		this(Integer.parseInt(colorIn, 16));
	}

	public IItemColor getColor() {
		return new IItemColor() {

			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {

				return colorIn;
			}
		};
	}
}
