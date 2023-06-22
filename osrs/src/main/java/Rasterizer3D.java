import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("Rasterizer3D")
public class Rasterizer3D {
	@ObfuscatedName("at")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("an")
	static int[] field2015;
	@ObfuscatedName("av")
	static int[] field2016;
	@ObfuscatedName("as")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ax")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	public static class243 field2014;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static class227 field2017;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static final class227 field2019;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static final class227 field2018;

	static {
		Rasterizer3D_colorPalette = new int[65536];
		field2015 = new int[512];
		field2016 = new int[2048];
		Rasterizer3D_sine = new int[2048];
		Rasterizer3D_cosine = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2015[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2016[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Rasterizer3D_sine[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			Rasterizer3D_cosine[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

		field2014 = new class243();
		field2019 = new class242(field2014);
		field2018 = new class244(field2014);
		field2017 = field2019;
	}

	@ObfuscatedName("at")
	public static void method1182(boolean var0) {
		if (var0 && Rasterizer2D.field4122 != null) {
			field2017 = field2018;
		} else {
			field2017 = field2019;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljb;)V"
	)
	public static void method1183(TextureLoader var0) {
		field2014.Rasterizer3D_textureLoader = var0;
	}

	@ObfuscatedName("av")
	public static void method1184(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512);
	}

	@ObfuscatedName("as")
	@Export("Rasterizer3D_buildPalette")
	static void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; ++var5) {
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

			for (int var10 = 0; var10 < 128; ++var10) {
				double var11 = (double)var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D) {
						var19 = var11 * (1.0D + var8);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = 2.0D * var11 - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D) {
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D) {
						++var27;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var19;
					} else if (3.0D * var23 < 2.0D) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21;
					}

					if (6.0D * var6 < 1.0D) {
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (2.0D * var6 < 1.0D) {
						var15 = var19;
					} else if (3.0D * var6 < 2.0D) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21;
					}

					if (6.0D * var27 < 1.0D) {
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (2.0D * var27 < 1.0D) {
						var17 = var19;
					} else if (3.0D * var27 < 2.0D) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21;
					}
				}

				int var29 = (int)(var13 * 256.0D);
				int var20 = (int)(var15 * 256.0D);
				int var30 = (int)(var17 * 256.0D);
				int var22 = var30 + (var20 << 8) + (var29 << 16);
				var22 = Rasterizer3D_brighten(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				Rasterizer3D_colorPalette[var4++] = var22;
			}
		}

	}

	@ObfuscatedName("ax")
	@Export("Rasterizer3D_brighten")
	static int Rasterizer3D_brighten(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return var11 + (var10 << 8) + (var9 << 16);
	}

	@ObfuscatedName("ap")
	static int method1187() {
		return field2014.field2251;
	}

	@ObfuscatedName("ab")
	static int method1188() {
		return field2014.field2248;
	}

	@ObfuscatedName("ak")
	static int method1189() {
		return field2014.field2252;
	}

	@ObfuscatedName("ae")
	static int method1190() {
		return field2014.field2250;
	}

	@ObfuscatedName("af")
	static int method1191() {
		return field2014.field2253;
	}

	@ObfuscatedName("ao")
	static int method1192() {
		return field2014.field2255;
	}

	@ObfuscatedName("aa")
	public static int method1193() {
		return field2014.field2258;
	}

	@ObfuscatedName("aj")
	static int method1194() {
		return field2014.field2247;
	}

	@ObfuscatedName("ad")
	public static void method1195(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2017 == field2018) {
			field2017 = field2019;
		}

		field2017.method1215(var0, var1, var2, var3);
	}

	@ObfuscatedName("ac")
	public static void method1196() {
		method1197(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd);
	}

	@ObfuscatedName("ag")
	static void method1197(int var0, int var1, int var2, int var3) {
		field2014.field2247 = var2 - var0;
		field2014.field2249 = var3 - var1;
		method1198();
		if (field2014.Rasterizer3D_rowOffsets.length < field2014.field2249) {
			field2014.Rasterizer3D_rowOffsets = new int[class128.method691(field2014.field2249)];
		}

		int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1;

		for (int var5 = 0; var5 < field2014.field2249; ++var5) {
			field2014.Rasterizer3D_rowOffsets[var5] = var4;
			var4 += Rasterizer2D.Rasterizer2D_width;
		}

	}

	@ObfuscatedName("ar")
	public static void method1198() {
		field2014.method1364();
	}

	@ObfuscatedName("ah")
	public static void method1199(int var0, int var1) {
		int var2 = field2014.Rasterizer3D_rowOffsets[0];
		int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
		int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
		field2014.method1365(var0, var4, var1, var3);
	}

	@ObfuscatedName("az")
	public static void method1200(int var0, int var1, int var2) {
		field2014.method1366(var0, var1, var2);
	}

	@ObfuscatedName("au")
	static void method1201(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2017.vmethod1374(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("ai")
	public static void method1202(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field2017.vmethod1366(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("aq")
	static void method1203(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2017.vmethod1378(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("aw")
	static void method1204(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2017.vmethod1362(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("ay")
	static void method1205(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field2017.method1218(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
	}

	@ObfuscatedName("al")
	static void method1206(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field2017.method1219(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}
}
