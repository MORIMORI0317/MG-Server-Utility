package com.morimori.mgserverutility.handler;

import com.morimori.mgserverutility.MGServerUtility;
import com.morimori.mgserverutility.MGSoundEvents;
import com.morimori.mgserverutility.blocks.MODBlocks;
import com.morimori.mgserverutility.items.ItemAnyIngot;
import com.morimori.mgserverutility.items.MODItems;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber(modid = MGServerUtility.MODID)

public class RegisterHandler {
	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> e) {
		e.getRegistry().registerAll(
				MGSoundEvents.CYCLOPS_MUSIC,
				MGSoundEvents.HOLOGRAM_MUSIC,
				MGSoundEvents.MARENOL_MUSIC,
				MGSoundEvents.YATTAZE_MUSIC,
				MGSoundEvents.MOPEMOPE_MUSIC,
				MGSoundEvents.BREAK_THE_NIGHT_ARAN_REMIX_REDALICE_MUSIC,
				MGSoundEvents.CHAOS_MUSIC,
				MGSoundEvents.SNAKE_EATER_MUSIC,
				MGSoundEvents.TAKARAZIMA_MUSIC,
				MGSoundEvents.YSYOU_MUSIC,
				MGSoundEvents.HAKUSINKARATEBU_MUSIC,
				MGSoundEvents.YJINTABYU_MUSIC

		);

	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> e) {

		MODItems.registerItemList().forEach(i -> {
			MGServerUtility.LOGGER.info("Registing Item " + i.getRegistryName());
			e.getRegistry().register(i);
		});

		MODBlocks.registerBlockList().forEach(i -> {
			MGServerUtility.LOGGER.info("Registing BlockItem " + i.getRegistryName());
			e.getRegistry().register(
					new ItemBlock(i).setRegistryName(i.getRegistryName()));
		});

	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> e) {

		MODBlocks.registerBlockList().forEach(i -> {
			MGServerUtility.LOGGER.info("Registing Block " + i.getRegistryName());
			e.getRegistry().register(i);
		});

		MODBlocks.registerBlockOnryList().forEach(i -> {
			MGServerUtility.LOGGER.info("Registing Block " + i.getRegistryName());
			e.getRegistry().register(i);
		});

	}

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		MODItems.registerItemList().forEach(i -> {

			if (!(i instanceof ItemAnyIngot)) {
				MGServerUtility.LOGGER.info("Registing ItemModel " + i.getRegistryName());
				ModelLoader.setCustomModelResourceLocation(i, 0,
						new ModelResourceLocation(i.getRegistryName(), "inventory"));
			}

			if (i instanceof ItemAnyIngot) {
				MGServerUtility.LOGGER.info("Registing AnyIngotItemModel " + i.getRegistryName());
				ModelLoader.setCustomModelResourceLocation(i, 0,
						new ModelResourceLocation(MGServerUtility.MODID + ":any_ingot", "inventory"));
			}

		});

		MODBlocks.registerBlockList().forEach(i -> {

			MGServerUtility.LOGGER.info("Registing BlockItemModel " + i.getRegistryName());

			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(i), 0,
					new ModelResourceLocation(i.getRegistryName(),
							"inventory"));

		});

		registerFluidModel(MODBlocks.MOLTEN_TELEKILL_ALLOY_BLOCK, "telkill");
		registerFluidModel(MODBlocks.MOLTEN_VANADIUM_STEEL_BLOCK, "vana");
		registerFluidModel(MODBlocks.MOLTEN_DATA_EXPUNGEDL_BLOCK, "datae");
		registerFluidModel(MODBlocks.MOLTEN_VOID_BLOCK, "void");

	}

	@SideOnly(Side.CLIENT)
	private static void registerFluidModel(Block fluidBlock, String name) {

		final ModelResourceLocation modelResourceLocation = new ModelResourceLocation(
				MGServerUtility.MODID + ":fluid_block",
				name);

		ModelLoader.setCustomStateMapper(fluidBlock, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState p_178132_1_) {
				return modelResourceLocation;
			}
		});
	}
}
