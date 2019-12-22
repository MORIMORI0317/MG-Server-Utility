package com.morimori.mgserverutility.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class RenderHelper {
	public static Minecraft mc = Minecraft.getMinecraft();

	public static void setShaders(ResourceLocation shaderLocation) {

		mc.renderEngine.bindTexture(shaderLocation);

	}
}
