package com.morimori.mgserverutility.client.handler;

import com.morimori.mgserverutility.MGServerUtility;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = MGServerUtility.MODID, value = Side.CLIENT)
public class RenderHandler {
	public static final ResourceLocation bloodstone = new ResourceLocation("scp", "shaders/bloodstone.json");

	@SubscribeEvent
	public static void onHUDrender(RenderGameOverlayEvent.Post e) {
		//RenderHelper.setShaders(bloodstone);

		GlStateManager.color(0, 0, 1);

	}

	/*
	@SubscribeEvent
	public static void onItemColor(final ColorHandlerEvent.Item e) {
		ItemColors Color = e.getItemColors();

		for (Item i : colerItem) {
			if (i instanceof ItemAnyIngot) {

				Color.registerItemColorHandler(new IItemColor() {

					@Override
					public int colorMultiplier(ItemStack stack, int tintIndex) {

						return ((ItemAnyIngot) i).getColor();
					}
				}, i);

			}
		}
	}

		@SubscribeEvent
		public static void onBlockColor(final ColorHandlerEvent.Block e) {
			BlockColors Color = e.getBlockColors();

			for (Block b : ForgeRegistries.BLOCKS) {
				Color.registerBlockColorHandler(new IBlockColor() {

					@Override
					public int colorMultiplier(IBlockState state, IBlockAccess worldIn, BlockPos pos, int tintIndex) {

						return new Random().nextInt(13882323);
					}
				}, b);
			}

		}*/
}
