package com.morimori.mgserverutility.client.render;

import com.morimori.mgserverutility.tile.TileOODTereporter;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class OODTereporterRenderer extends TileEntitySpecialRenderer<TileOODTereporter> {

	private static final ResourceLocation END_GATEWAY_BEAM_TEXTURE = new ResourceLocation(
			"mgserverutility:textures/blocks/out_of_dimention.png");
	public static Minecraft mc = Minecraft.getMinecraft();

	@Override
	public void render(TileOODTereporter tileEntity, double x, double y, double z, float partialTicks, int destroyStage,
			float alpha) {

		renderIcon(tileEntity, x, y, z, partialTicks);
		/*
				float RX = ObfuscationReflectionHelper.getPrivateValue(RenderManager.class,
						Minecraft.getMinecraft().getRenderManager(), "playerViewX");
				float RY = ObfuscationReflectionHelper.getPrivateValue(RenderManager.class,
						Minecraft.getMinecraft().getRenderManager(), "playerViewY");
				float RZ = ObfuscationReflectionHelper.getPrivateValue(RenderManager.class,
						Minecraft.getMinecraft().getRenderManager(), "playerViewZ");
				float in = 0.2f * 0;
		*/

	}

	public void renderIcon(TileOODTereporter tileEntity, double posX, double posY, double posZ,
			float partialTicks) {

		GlStateManager.pushMatrix();
		mc.getTextureManager().bindTexture(END_GATEWAY_BEAM_TEXTURE);
		GlStateManager.translate(posX + 0.5f, posY + 0.5f, posZ + 0.5f);
		//	GlStateManager.enableRescaleNormal();
		//	GlStateManager.enableBlend();
		GlStateManager.depthMask(false);

		//	GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);

		GlStateManager.scale(0.5F * 2, 0.5F * 2, 0.5F * 2);
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();

		//	GlStateManager.rotate(180.0F - RX, 1.0F, 0.0F, 0.0F);
		GlStateManager.rotate(180.0F - mc.getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(-mc.getRenderManager().playerViewX, 1.0F, 0.0F, 0.0F);

		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
		bufferbuilder.pos(-0.5D, -0.25D, 0.0D).tex(0.0D, 1.0D).normal(0.0F, 1.0F, 0.0F).endVertex();
		bufferbuilder.pos(0.5D, -0.25D, 0.0D).tex(1.0D, 1.0D).normal(0.0F, 1.0F, 0.0F).endVertex();
		bufferbuilder.pos(0.5D, 0.75D, 0.0D).tex(1.0D, 0.0D).normal(0.0F, 1.0F, 0.0F).endVertex();
		bufferbuilder.pos(-0.5D, 0.75D, 0.0D).tex(0.0D, 0.0D).normal(0.0F, 1.0F, 0.0F).endVertex();
		tessellator.draw();
		GlStateManager.depthMask(true);
		GlStateManager.disableBlend();
		GlStateManager.disableRescaleNormal();
		GlStateManager.popMatrix();
	}
}