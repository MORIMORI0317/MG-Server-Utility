package com.morimori.mgserverutility.client.handler;

import java.util.Random;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.items.MODItems;
import com.morimori.mgserverutility.util.EntityHelper;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = MGServerUtility.MODID, value = Side.CLIENT)
public class RenderHandler {
	//	public static final ResourceLocation bloodstone = new ResourceLocation("scp", "shaders/bloodstone.json");

	@SubscribeEvent
	public static void onRenderLivingPre(RenderLivingEvent.Pre<EntityLivingBase> e) {
		Random r = new Random();
		if (EntityHelper.isIkisugithi(e.getEntity()))
			GlStateManager.color(r.nextFloat(), r.nextFloat(), r.nextFloat());

	}

	@SubscribeEvent
	public static void onItemColor(final ColorHandlerEvent.Item e) {
		ItemColors Color = e.getItemColors();
		Random r = new Random();
		Color.registerItemColorHandler(new IItemColor() {
			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {

				return r.nextInt(Integer.MAX_VALUE);
			}
		}, MODItems.IKISUGINITHI_SWORD);

		Color.registerItemColorHandler(new IItemColor() {
			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {

				return r.nextInt(Integer.MAX_VALUE);
			}
		}, MODItems.iKISUGINITHI_HELMET);

		Color.registerItemColorHandler(new IItemColor() {
			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {

				return r.nextInt(Integer.MAX_VALUE);
			}
		}, MODItems.iKISUGINITHI_CHESTPLATE);

		Color.registerItemColorHandler(new IItemColor() {
			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {

				return r.nextInt(Integer.MAX_VALUE);
			}
		}, MODItems.iKISUGINITHI_LEGGINGS);

		Color.registerItemColorHandler(new IItemColor() {
			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {

				return r.nextInt(Integer.MAX_VALUE);
			}
		}, MODItems.iKISUGINITHI_BOOTS);

		Color.registerItemColorHandler(new IItemColor() {
			@Override
			public int colorMultiplier(ItemStack stack, int tintIndex) {

				return r.nextInt(Integer.MAX_VALUE);
			}
		}, MODItems.IKISUGITHI_TOTEM);

	}
	/*
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
