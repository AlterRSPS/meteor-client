import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("at")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("an")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("av")
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ab")
	static byte[][][] field831;
	@ObfuscatedName("aa")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ad")
	static int[] field837;
	@ObfuscatedName("ac")
	static int[][][] field838;
	@ObfuscatedName("az")
	static final int[] field845;
	@ObfuscatedName("au")
	static final int[] field842;
	@ObfuscatedName("ai")
	static final int[] field840;
	@ObfuscatedName("aq")
	static final int[] field841;
	@ObfuscatedName("aw")
	static final int[] field843;
	@ObfuscatedName("ay")
	static final int[] field844;
	@ObfuscatedName("al")
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("am")
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field845 = new int[]{1, 2, 4, 8};
		field842 = new int[]{16, 32, 64, 128};
		field840 = new int[]{1, 0, -1, 0};
		field841 = new int[]{0, -1, 0, 1};
		field843 = new int[]{1, -1, -1, 1};
		field844 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-31660228"
	)
	static final int method441(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILiz;[Lic;)V"
	)
	static final void method442(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method2516();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = class175.getObjectDefinition(var11);
					int var22 = var2 + Canvas.method77(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					int var23 = var3 + class226.method1208(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
						int var24 = var1;
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) {
							var24 = var1 - 1;
						}

						CollisionMap var25 = null;
						if (var24 >= 0) {
							var25 = var9[var24];
						}

						SpriteMask.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
					}
				}
			}
		}
	}
}
