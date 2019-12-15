package com.morimori.mgserverutility.world.dimensions;

import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OutOfThisDimensionProvider extends WorldProvider {

	@Override
	public DimensionType getDimensionType() {
		return MGDimentions.OUT_OF_THIS_DIMENSION;
	}

	@Override
	public String getSaveFolder() {
		return "OutOfThisDimension";
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorOutOf(world);
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@Override
	public float calculateCelestialAngle(long par1, float par3) {

		return 0.5f;
	}

	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float p_76562_1_, float p_76562_2_) {
		return new Vec3d(1, 1, 1);
	}
    @SideOnly(Side.CLIENT)
    public boolean doesXZShowFog(int x, int z)
    {
        return true;
    }
	protected void generateLightBrightnessTable() {
		float f = 0.1F;

		for (int i = 0; i <= 15; ++i) {
			float f1 = 1.0F - (float) i / 15.0F;
			this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * 0.9F + 0.1F;
		}
	}
}