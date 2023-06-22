import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("an")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("as")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static class438 field2186;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static class438 field2185;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static class438 field2184;
	@ObfuscatedName("bh")
	static boolean[] field2153;
	@ObfuscatedName("bp")
	static boolean[] field2154;
	@ObfuscatedName("bw")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bi")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bk")
	static float[] field2159;
	@ObfuscatedName("bv")
	static int[] field2168;
	@ObfuscatedName("bz")
	static int[] field2170;
	@ObfuscatedName("bm")
	static int[] field2166;
	@ObfuscatedName("br")
	static int[] field2167;
	@ObfuscatedName("by")
	static char[] field2157;
	@ObfuscatedName("bt")
	static char[][] field2158;
	@ObfuscatedName("bl")
	static int[] field2165;
	@ObfuscatedName("cs")
	static int[][] field2181;
	@ObfuscatedName("cu")
	static int[] field2179;
	@ObfuscatedName("ca")
	static int[] field2171;
	@ObfuscatedName("cf")
	static int[] field2174;
	@ObfuscatedName("cw")
	static int[] field2180;
	@ObfuscatedName("ch")
	static int[] field2175;
	@ObfuscatedName("cp")
	static int[] field2177;
	@ObfuscatedName("cy")
	static float[] field2160;
	@ObfuscatedName("cd")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cv")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cr")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cm")
	static boolean field2152;
	@ObfuscatedName("cb")
	static int[] field2172;
	@ObfuscatedName("cc")
	static int[] field2173;
	@ObfuscatedName("ck")
	static int[] field2176;
	@ObfuscatedName("cq")
	static int[] field2178;
	@ObfuscatedName("cl")
	static final float field2187;
	@ObfuscatedName("ak")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ae")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("af")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ao")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("aa")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("aj")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ad")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ac")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ag")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ar")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ah")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("az")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("au")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ai")
	byte[] field2188;
	@ObfuscatedName("aq")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("aw")
	public byte field2215;
	@ObfuscatedName("ay")
	public int field2222;
	@ObfuscatedName("al")
	int[] field2203;
	@ObfuscatedName("am")
	int[] field2204;
	@ObfuscatedName("bs")
	int[] field2207;
	@ObfuscatedName("bc")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bj")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bo")
	int[][] field2210;
	@ObfuscatedName("bq")
	int[][] field2211;
	@ObfuscatedName("bg")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bf")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bd")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ba")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bn")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bb")
	@Export("radius")
	int radius;
	@ObfuscatedName("bx")
	@Export("aabb")
	HashMap aabb;
	@ObfuscatedName("cn")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("ct")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cx")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("co")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cz")
	public short field2223;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2186 = new class438();
		field2185 = new class438();
		field2184 = new class438();
		field2153 = new boolean[6500];
		field2154 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2159 = new float[6500];
		field2168 = new int[6500];
		field2170 = new int[6500];
		field2166 = new int[6500];
		field2167 = new int[6500];
		field2157 = new char[6000];
		field2158 = new char[6000][512];
		field2165 = new int[12];
		field2181 = new int[12][2000];
		field2179 = new int[2000];
		field2171 = new int[2000];
		field2174 = new int[12];
		field2180 = new int[10];
		field2175 = new int[10];
		field2177 = new int[10];
		field2160 = new float[10];
		field2152 = true;
		field2172 = Rasterizer3D.Rasterizer3D_sine;
		field2173 = Rasterizer3D.Rasterizer3D_cosine;
		field2176 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2178 = Rasterizer3D.field2016;
		field2187 = class137.method732(50);
	}

	Model() {
		super();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2215 = 0;
		this.field2222 = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
	}

	public Model(int var1, int var2, int var3, byte var4) {
		super();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2215 = 0;
		this.field2222 = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.method1312(var1, var2, var3);
		this.field2215 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2222 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljd;I)V"
	)
	public Model(Model[] var1, int var2) {
		super();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2215 = 0;
		this.field2222 = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2222 = 0;
		this.field2215 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.field2222 += var4.field2222;
				if (this.field2215 == -1) {
					this.field2215 = var4.field2215;
				}
			}
		}

		this.method1312(this.verticesCount, this.indicesCount, this.field2222);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2222 = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method1314(var1[var3]);
		}

	}

	@ObfuscatedName("at")
	void method1312(int var1, int var2, int var3) {
		this.verticesX = new int[var1];
		this.verticesY = new int[var1];
		this.verticesZ = new int[var1];
		this.indices1 = new int[var2];
		this.indices2 = new int[var2];
		this.indices3 = new int[var2];
		this.faceColors1 = new int[var2];
		this.faceColors2 = new int[var2];
		this.faceColors3 = new int[var2];
		if (var3 > 0) {
			this.field2203 = new int[var3];
			this.field2204 = new int[var3];
			this.field2207 = new int[var3];
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	void method1313(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2215 != var1.field2215)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2215);
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) {
			this.faceAlphas = new byte[var2];
			Arrays.fill(this.faceAlphas, (byte)0);
		}

		if (this.faceTextures == null && var1.faceTextures != null) {
			this.faceTextures = new short[var2];
			Arrays.fill(this.faceTextures, (short)-1);
		}

		if (this.field2188 == null && var1.field2188 != null) {
			this.field2188 = new byte[var2];
			Arrays.fill(this.field2188, (byte)-1);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	public void method1314(Model var1) {
		if (var1 != null) {
			this.method1313(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2215;
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) {
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2];
				}

				if (this.faceTextures != null) {
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1;
				}

				if (this.field2188 != null) {
					if (var1.field2188 != null && var1.field2188[var2] != -1) {
						this.field2188[this.indicesCount] = (byte)(var1.field2188[var2] + this.field2222);
					} else {
						this.field2188[this.indicesCount] = -1;
					}
				}

				++this.indicesCount;
			}

			for (var2 = 0; var2 < var1.field2222; ++var2) {
				this.field2203[this.field2222] = this.verticesCount + var1.field2203[var2];
				this.field2204[this.field2222] = this.verticesCount + var1.field2204[var2];
				this.field2207[this.field2222] = this.verticesCount + var1.field2207[var2];
				++this.field2222;
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) {
				this.verticesX[this.verticesCount] = var1.verticesX[var2];
				this.verticesY[this.verticesCount] = var1.verticesY[var2];
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2];
				++this.verticesCount;
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljd;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder();
		int var7 = var2 - this.xzRadius;
		int var8 = var2 + this.xzRadius;
		int var9 = var4 - this.xzRadius;
		int var10 = var4 + this.xzRadius;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
				return this;
			} else {
				Model var11;
				if (var5) {
					var11 = new Model();
					var11.verticesCount = this.verticesCount;
					var11.indicesCount = this.indicesCount;
					var11.field2222 = this.field2222;
					var11.verticesX = this.verticesX;
					var11.verticesZ = this.verticesZ;
					var11.indices1 = this.indices1;
					var11.indices2 = this.indices2;
					var11.indices3 = this.indices3;
					var11.faceColors1 = this.faceColors1;
					var11.faceColors2 = this.faceColors2;
					var11.faceColors3 = this.faceColors3;
					var11.faceRenderPriorities = this.faceRenderPriorities;
					var11.faceAlphas = this.faceAlphas;
					var11.field2188 = this.field2188;
					var11.faceTextures = this.faceTextures;
					var11.field2215 = this.field2215;
					var11.field2203 = this.field2203;
					var11.field2204 = this.field2204;
					var11.field2207 = this.field2207;
					var11.vertexLabels = this.vertexLabels;
					var11.faceLabelsAlpha = this.faceLabelsAlpha;
					var11.isSingleTile = this.isSingleTile;
					var11.verticesY = new int[var11.verticesCount];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = var2 + this.verticesX[var12];
						var14 = var4 + this.verticesZ[var12];
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = (-this.verticesY[var12] << 16) / super.height;
						if (var13 < var6) {
							var14 = var2 + this.verticesX[var12];
							var15 = var4 + this.verticesZ[var12];
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12];
						}
					}
				}

				var11.resetBounds();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljd;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljd;"
	)
	public Model method1317(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZLjd;[B)Ljd;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount;
		var2.indicesCount = this.indicesCount;
		var2.field2222 = this.field2222;
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
			var2.verticesX = new int[this.verticesCount + 100];
			var2.verticesY = new int[this.verticesCount + 100];
			var2.verticesZ = new int[this.verticesCount + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) {
			var2.verticesX[var4] = this.verticesX[var4];
			var2.verticesY[var4] = this.verticesY[var4];
			var2.verticesZ[var4] = this.verticesZ[var4];
		}

		if (var1) {
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3;
			if (this.faceAlphas == null) {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1;
		var2.indices2 = this.indices2;
		var2.indices3 = this.indices3;
		var2.faceColors1 = this.faceColors1;
		var2.faceColors2 = this.faceColors2;
		var2.faceColors3 = this.faceColors3;
		var2.faceRenderPriorities = this.faceRenderPriorities;
		var2.field2188 = this.field2188;
		var2.faceTextures = this.faceTextures;
		var2.field2215 = this.field2215;
		var2.field2203 = this.field2203;
		var2.field2204 = this.field2204;
		var2.field2207 = this.field2207;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2210 = this.field2210;
		var2.field2211 = this.field2211;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("aa")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (!this.aabb.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2173[var1];
			int var9 = field2172[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var11 = Tiles.method441(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				int var12 = this.verticesY[var10];
				int var13 = AABB.method1283(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
				}
			}

			AABB var14 = new AABB((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var15 = true;
			if (var14.xMidOffset < 32) {
				var14.xMidOffset = 32;
			}

			if (var14.zMidOffset < 32) {
				var14.zMidOffset = 32;
			}

			if (this.isSingleTile) {
				boolean var16 = true;
				var14.xMidOffset += 8;
				var14.zMidOffset += 8;
			}

			this.aabb.put(var1, var14);
		}
	}

	@ObfuscatedName("aj")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) {
			this.boundsType = 1;
			super.height = 0;
			this.bottomY = 0;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				if (-var3 > super.height) {
					super.height = -var3;
				}

				if (var3 > this.bottomY) {
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D);
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D);
		}
	}

	@ObfuscatedName("ad")
	void method1321() {
		if (this.boundsType != 2) {
			this.boundsType = 2;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = this.xzRadius;
			this.diameter = this.xzRadius + this.xzRadius;
		}
	}

	@ObfuscatedName("ac")
	public int method1322() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("ag")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) {
			Animation var3 = var1.frames[var2];
			Skeleton var4 = var3.skeleton;
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (int var5 = 0; var5 < var3.transformCount; ++var5) {
				int var6 = var3.transformSkeletonLabels[var5];
				this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]);
			}

			this.resetBounds();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)V"
	)
	public void method1325(class136 var1, int var2) {
		Skeleton var3 = var1.field1285;
		class226 var4 = var3.method1226();
		if (var4 != null) {
			var3.method1226().method1212(var1, var2);
			this.method1327(var3.method1226(), var1.method721());
		}

		if (var1.method722()) {
			this.method1326(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)V"
	)
	void method1326(class136 var1, int var2) {
		Skeleton var3 = var1.field1285;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1284 != null && var1.field1284[var4] != null && var1.field1284[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class129 var6 = var1.field1284[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method695(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lid;I)V"
	)
	void method1327(class226 var1, int var2) {
		this.method1347(var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Liu;ILiu;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Animation var6 = var1.frames[var2];
				Animation var7 = var3.frames[var4];
				Skeleton var8 = var6.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) {
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) {
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds();
			} else {
				this.animate(var1, var2);
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lfz;I[ZZZ)V"
	)
	public void method1329(Skeleton var1, class136 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class226 var7 = var1.method1226();
		if (var7 != null) {
			var7.method1213(var2, var3, var4, var5);
			if (var6) {
				this.method1327(var7, var2.method721());
			}
		}

		if (!var5 && var2.method722()) {
			this.method1326(var2, var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Liu;I[IZ)V"
	)
	public void method1330(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.animate(var1, var2);
		} else {
			Animation var5 = var1.frames[var2];
			Skeleton var6 = var5.skeleton;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (int var9 = 0; var9 < var5.transformCount; ++var9) {
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.transformTypes[var10] == 0) {
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
				}
			}

		}
	}

	@ObfuscatedName("ay")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.vertexLabels.length) {
					int[] var19 = this.vertexLabels[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						Model_transformTempX += this.verticesX[var12];
						Model_transformTempY += this.verticesY[var12];
						Model_transformTempZ += this.verticesZ[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				Model_transformTempX = var3 + Model_transformTempX / var7;
				Model_transformTempY = var4 + Model_transformTempY / var7;
				Model_transformTempZ = var5 + Model_transformTempZ / var7;
			} else {
				Model_transformTempX = var3;
				Model_transformTempY = var4;
				Model_transformTempZ = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] += var3;
							var10000 = this.verticesY;
							var10000[var11] += var4;
							var10000 = this.verticesZ;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field2172[var14];
								var16 = field2173[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2172[var12];
								var16 = field2173[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2172[var13];
								var16 = field2173[var13];
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128;
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128;
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128;
							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.faceLabelsAlpha.length) {
							var9 = this.faceLabelsAlpha[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("al")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("am")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bs")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bc")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2172[var1];
		int var3 = field2173[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bj")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int[] var10000 = this.verticesX;
			var10000[var4] += var1;
			var10000 = this.verticesY;
			var10000[var4] += var2;
			var10000 = this.verticesZ;
			var10000[var4] += var3;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bo")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bq")
	public final void method1338(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method1321();
		}

		int var8 = Rasterizer3D.method1187();
		int var9 = Rasterizer3D.method1188();
		int var10 = field2172[var1];
		int var11 = field2173[var1];
		int var12 = field2172[var2];
		int var13 = field2173[var2];
		int var14 = field2172[var3];
		int var15 = field2173[var3];
		int var16 = field2172[var4];
		int var17 = field2173[var4];
		int var18 = var16 * var6 + var17 * var7 >> 16;

		for (int var19 = 0; var19 < this.verticesCount; ++var19) {
			int var20 = this.verticesX[var19];
			int var21 = this.verticesY[var19];
			int var22 = this.verticesZ[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field2168[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method1193() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method1193() / var22;
			field2159[var19] = class137.method732(var22);
			if (this.field2222 > 0) {
				field2170[var19] = var20;
				field2166[var19] = var23;
				field2167[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bg")
	public final void method1339(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method1321();
		}

		int var9 = Rasterizer3D.method1187();
		int var10 = Rasterizer3D.method1188();
		int var11 = field2172[var1];
		int var12 = field2173[var1];
		int var13 = field2172[var2];
		int var14 = field2173[var2];
		int var15 = field2172[var3];
		int var16 = field2173[var3];
		int var17 = field2172[var4];
		int var18 = field2173[var4];
		int var19 = var17 * var6 + var18 * var7 >> 16;

		for (int var20 = 0; var20 < this.verticesCount; ++var20) {
			int var21 = this.verticesX[var20];
			int var22 = this.verticesY[var20];
			int var23 = this.verticesZ[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field2168[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method1193() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method1193() / var8;
			field2159[var20] = class137.method732(var8);
			if (this.field2222 > 0) {
				field2170[var20] = var21;
				field2166[var20] = var24;
				field2167[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bf")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2157[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			int var16;
			int var18;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) {
				if (this.faceColors3[var7] != -2) {
					var8 = this.indices1[var7];
					var9 = this.indices2[var7];
					var10 = this.indices3[var7];
					var11 = modelViewportXs[var8];
					var12 = modelViewportXs[var9];
					var13 = modelViewportXs[var10];
					int var14;
					if (!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
						if (var2 && ClientPacket.method1606(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var13, var6)) {
							class12.method43(var4);
							var2 = false;
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var13 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2154[var7] = false;
							var14 = Rasterizer3D.method1194();
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var14 && var12 <= var14 && var13 <= var14) {
								field2153[var7] = false;
							} else {
								field2153[var7] = true;
							}

							var15 = (field2168[var8] + field2168[var9] + field2168[var10]) / 3 + this.radius;
							field2158[var15][field2157[var15]++] = var7;
						}
					} else {
						var14 = field2170[var8];
						var15 = field2170[var9];
						var16 = field2170[var10];
						int var17 = field2166[var8];
						var18 = field2166[var9];
						int var19 = field2166[var10];
						int var20 = field2167[var8];
						int var21 = field2167[var9];
						int var22 = field2167[var10];
						var14 -= var15;
						var16 -= var15;
						var17 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var17 * var22 - var20 * var19;
						int var24 = var20 * var16 - var14 * var22;
						int var25 = var14 * var19 - var17 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2154[var7] = true;
							int var26 = (field2168[var8] + field2168[var9] + field2168[var10]) / 3 + this.radius;
							field2158[var26][field2157[var26]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) {
				for (var31 = this.diameter - 1; var31 >= 0; --var31) {
					var32 = field2157[var31];
					if (var32 > 0) {
						var27 = field2158[var31];

						for (var10 = 0; var10 < var32; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) {
					field2165[var31] = 0;
					field2174[var31] = 0;
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) {
					var32 = field2157[var31];
					if (var32 > 0) {
						var27 = field2158[var31];

						for (var10 = 0; var10 < var32; ++var10) {
							char var33 = var27[var10];
							byte var34 = this.faceRenderPriorities[var33];
							var13 = field2165[var34]++;
							field2181[var34][var13] = var33;
							if (var34 < 10) {
								int[] var35 = field2174;
								var35[var34] += var31;
							} else if (var34 == 10) {
								field2179[var13] = var31;
							} else {
								field2171[var13] = var31;
							}
						}
					}
				}

				var31 = 0;
				if (field2165[1] > 0 || field2165[2] > 0) {
					var31 = (field2174[1] + field2174[2]) / (field2165[1] + field2165[2]);
				}

				var8 = 0;
				if (field2165[3] > 0 || field2165[4] > 0) {
					var8 = (field2174[3] + field2174[4]) / (field2165[3] + field2165[4]);
				}

				var9 = 0;
				if (field2165[6] > 0 || field2165[8] > 0) {
					var9 = (field2174[8] + field2174[6]) / (field2165[8] + field2165[6]);
				}

				var11 = 0;
				var12 = field2165[10];
				int[] var28 = field2181[10];
				int[] var29 = field2179;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2165[11];
					var28 = field2181[11];
					var29 = field2171;
				}

				if (var11 < var12) {
					var10 = var29[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var31) {
						this.drawFace(var28[var11++]);
						if (var11 == var12 && var28 != field2181[11]) {
							var11 = 0;
							var12 = field2165[11];
							var28 = field2181[11];
							var29 = field2171;
						}

						if (var11 < var12) {
							var10 = var29[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var28[var11++]);
						if (var11 == var12 && var28 != field2181[11]) {
							var11 = 0;
							var12 = field2165[11];
							var28 = field2181[11];
							var29 = field2171;
						}

						if (var11 < var12) {
							var10 = var29[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var28[var11++]);
						if (var11 == var12 && var28 != field2181[11]) {
							var11 = 0;
							var12 = field2165[11];
							var28 = field2181[11];
							var29 = field2171;
						}

						if (var11 < var12) {
							var10 = var29[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2165[var15];
					int[] var30 = field2181[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var30[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var28[var11++]);
					if (var11 == var12 && var28 != field2181[11]) {
						var11 = 0;
						var28 = field2181[11];
						var12 = field2165[11];
						var29 = field2171;
					}

					if (var11 < var12) {
						var10 = var29[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	@ObfuscatedName("bd")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2154[var1]) {
			this.method1345(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.field2014.field2246 = field2153[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.field2014.field2254 = 0;
			} else {
				Rasterizer3D.field2014.field2254 = this.faceAlphas[var1] & 255;
			}

			this.method1344(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2159[var2], field2159[var3], field2159[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("ba")
	boolean method1343(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2223;
	}

	@ObfuscatedName("bn")
	final void method1344(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) {
			int var15;
			int var16;
			int var18;
			if (this.field2188 != null && this.field2188[var1] != -1) {
				int var17 = this.field2188[var1] & 255;
				var18 = this.field2203[var17];
				var15 = this.field2204[var17];
				var16 = this.field2207[var17];
			} else {
				var18 = this.indices1[var1];
				var15 = this.indices2[var1];
				var16 = this.indices3[var1];
			}

			if (this.faceColors3[var1] == -1) {
				Rasterizer3D.method1203(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2170[var18], field2170[var15], field2170[var16], field2166[var18], field2166[var15], field2166[var16], field2167[var18], field2167[var15], field2167[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method1203(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2170[var18], field2170[var15], field2170[var16], field2166[var18], field2166[var15], field2166[var16], field2167[var18], field2167[var15], field2167[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method1343(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.method1206(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2176[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.method1202(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2176[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.method1205(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.method1201(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bb")
	final void method1345(int var1) {
		int var2 = Rasterizer3D.method1187();
		int var3 = Rasterizer3D.method1188();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2167[var5];
		int var9 = field2167[var6];
		int var10 = field2167[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.field2014.field2254 = 0;
		} else {
			Rasterizer3D.field2014.field2254 = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2180[var4] = modelViewportXs[var5];
			field2175[var4] = modelViewportYs[var5];
			field2160[var4] = field2159[var7];
			field2177[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2170[var5];
			var12 = field2166[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2178[var10 - var8] * (50 - var8);
				field2180[var4] = var2 + (var11 + ((field2170[var7] - var11) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2175[var4] = var3 + (var12 + ((field2166[var7] - var12) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2160[var4] = field2187;
				field2177[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2178[var9 - var8] * (50 - var8);
				field2180[var4] = var2 + (var11 + ((field2170[var6] - var11) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2175[var4] = var3 + (var12 + ((field2166[var6] - var12) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2160[var4] = field2187;
				field2177[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2180[var4] = modelViewportXs[var6];
			field2175[var4] = modelViewportYs[var6];
			field2160[var4] = field2159[var7];
			field2177[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2170[var6];
			var12 = field2166[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2178[var8 - var9] * (50 - var9);
				field2180[var4] = var2 + (var11 + ((field2170[var5] - var11) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2175[var4] = var3 + (var12 + ((field2166[var5] - var12) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2160[var4] = field2187;
				field2177[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2178[var10 - var9] * (50 - var9);
				field2180[var4] = var2 + (var11 + ((field2170[var7] - var11) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2175[var4] = var3 + (var12 + ((field2166[var7] - var12) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2177[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2180[var4] = modelViewportXs[var7];
			field2175[var4] = modelViewportYs[var7];
			field2160[var4] = field2159[var7];
			field2177[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2170[var7];
			var12 = field2166[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2178[var9 - var10] * (50 - var10);
				field2180[var4] = var2 + (var11 + ((field2170[var6] - var11) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2175[var4] = var3 + (var12 + ((field2166[var6] - var12) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2160[var4] = field2187;
				field2177[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2178[var8 - var10] * (50 - var10);
				field2180[var4] = var2 + (var11 + ((field2170[var5] - var11) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2175[var4] = var3 + (var12 + ((field2166[var5] - var12) * var14 >> 16)) * Rasterizer3D.method1193() / 50;
				field2160[var4] = field2187;
				field2177[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2180[0];
		var12 = field2180[1];
		var13 = field2180[2];
		var14 = field2175[0];
		int var15 = field2175[1];
		int var16 = field2175[2];
		float var17 = field2160[0];
		float var18 = field2160[1];
		float var19 = field2160[2];
		Rasterizer3D.field2014.field2246 = false;
		int var20 = Rasterizer3D.method1194();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.field2014.field2246 = true;
			}

			this.method1344(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2177[0], field2177[1], field2177[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2180[3] < 0 || field2180[3] > var20) {
				Rasterizer3D.field2014.field2246 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) {
				int var23;
				int var25;
				if (this.field2188 != null && this.field2188[var1] != -1) {
					int var24 = this.field2188[var1] & 255;
					var25 = this.field2203[var24];
					var22 = this.field2204[var24];
					var23 = this.field2207[var24];
				} else {
					var25 = var5;
					var22 = var6;
					var23 = var7;
				}

				short var26 = this.faceTextures[var1];
				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.method1203(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2170[var25], field2170[var22], field2170[var23], field2166[var25], field2166[var22], field2166[var23], field2167[var25], field2167[var22], field2167[var23], var26);
					Rasterizer3D.method1203(var14, var16, field2175[3], var11, var13, field2180[3], var17, var19, field2160[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2170[var25], field2170[var22], field2170[var23], field2166[var25], field2166[var22], field2166[var23], field2167[var25], field2167[var22], field2167[var23], var26);
				} else {
					Rasterizer3D.method1203(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2177[0], field2177[1], field2177[2], field2170[var25], field2170[var22], field2170[var23], field2166[var25], field2166[var22], field2166[var23], field2167[var25], field2167[var22], field2167[var23], var26);
					Rasterizer3D.method1203(var14, var16, field2175[3], var11, var13, field2180[3], var17, var19, field2160[3], field2177[0], field2177[2], field2177[3], field2170[var25], field2170[var22], field2170[var23], field2166[var25], field2166[var22], field2166[var23], field2167[var25], field2167[var22], field2167[var23], var26);
				}
			} else {
				boolean var21 = this.method1343(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2176[this.faceColors1[var1]];
					Rasterizer3D.method1206(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.method1206(var14, var16, field2175[3], var11, var13, field2180[3], var17, var19, field2160[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2176[this.faceColors1[var1]];
					Rasterizer3D.method1202(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.method1202(var14, var16, field2175[3], var11, var13, field2180[3], var17, var19, field2160[3], var22);
				} else if (var21) {
					Rasterizer3D.method1205(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2177[0], field2177[1], field2177[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.method1205(var14, var16, field2175[3], var11, var13, field2180[3], 0.0F, 0.0F, 0.0F, field2177[0], field2177[2], field2177[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.method1201(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2177[0], field2177[1], field2177[2]);
					Rasterizer3D.method1201(var14, var16, field2175[3], var11, var13, field2180[3], var17, var19, field2160[3], field2177[0], field2177[2], field2177[3]);
				}
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILqp;)V"
	)
	void method1346(int var1, class438 var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field3814[0] * var3 + var2.field3814[4] * var4 + var2.field3814[8] * var5 + var2.field3814[12] * var6);
		this.verticesY[var1] = -((int)(var2.field3814[1] * var3 + var2.field3814[5] * var4 + var2.field3814[9] * var5 + var2.field3814[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field3814[2] * var3 + var2.field3814[6] * var4 + var2.field3814[10] * var5 + var2.field3814[14] * var6));
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lid;I)V"
	)
	void method1347(class226 var1, int var2) {
		if (this.field2210 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2210[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2211[var3];
					field2186.method2262();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class126 var8 = var1.method1210(var7);
						if (var8 != null) {
							field2185.method2264((float)var5[var6] / 255.0F);
							field2184.method2263(var8.method685(var2));
							field2184.method2267(field2185);
							field2186.method2266(field2184);
						}
					}

					this.method1346(var3, field2186);
				}
			}

		}
	}

	@ObfuscatedName("dy")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		int var11 = var5 * var8 - var4 * var6 >> 16;
		int var12 = var2 * var7 + var3 * var11 >> 16;
		int var13 = var3 * this.xzRadius >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < 3500) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method1193();
			if (var16 / var14 < Rasterizer3D.method1190()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method1193();
				if (var17 / var14 > Rasterizer3D.method1189()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.method1193();
					if (var21 / var14 > Rasterizer3D.method1192()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.method1193();
						if (var23 / var14 < Rasterizer3D.method1191()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.field2222 > 0;
							int var28 = VertexNormal.method1351();
							int var29 = ViewportMouse.ViewportMouse_y;
							boolean var31 = ViewportMouse.ViewportMouse_isInViewport;
							boolean var33 = GameEngine.method120(var9);
							boolean var34 = false;
							int var40;
							int var41;
							int var42;
							int var43;
							int var49;
							int var53;
							int var54;
							if (var33 && var31) {
								boolean var35 = false;
								if (field2152) {
									boolean var38 = ViewportMouse.ViewportMouse_isInViewport;
									boolean var36;
									if (!var38) {
										var36 = false;
									} else {
										UserComparator9.method662();
										AABB var39 = (AABB)this.aabb.get(var1);
										var40 = var39.xMid + var6;
										var41 = var7 + var39.yMid;
										var42 = var8 + var39.zMid;
										var43 = var39.xMidOffset;
										int var44 = var39.yMidOffset;
										int var45 = var39.zMidOffset;
										int var46 = class177.field1449 - var40;
										int var47 = ViewportMouse.field2232 - var41;
										int var48 = ViewportMouse.field2230 - var42;
										if (Math.abs(var46) > var43 + class393.field3632) {
											var36 = false;
										} else if (Math.abs(var47) > var44 + class337.field3071) {
											var36 = false;
										} else if (Math.abs(var48) > var45 + class136.field1277) {
											var36 = false;
										} else if (Math.abs(var48 * class1.field0 - var47 * VarpDefinition.field1480) > var45 * class337.field3071 + var44 * class136.field1277) {
											var36 = false;
										} else if (Math.abs(var46 * VarpDefinition.field1480 - var48 * ViewportMouse.field2231) > var45 * class393.field3632 + var43 * class136.field1277) {
											var36 = false;
										} else if (Math.abs(var47 * ViewportMouse.field2231 - var46 * class1.field0) > var44 * class393.field3632 + var43 * class337.field3071) {
											var36 = false;
										} else {
											var36 = true;
										}
									}

									var35 = var36;
								} else {
									var54 = var12 - var13;
									if (var54 <= 50) {
										var54 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var54;
									} else {
										var17 /= var14;
										var16 /= var54;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var54;
									} else {
										var21 /= var14;
										var23 /= var54;
									}

									var49 = var28 - Rasterizer3D.method1187();
									var53 = var29 - Rasterizer3D.method1188();
									if (var49 > var16 && var49 < var17 && var53 > var23 && var53 < var21) {
										var35 = true;
									}
								}

								if (var35) {
									if (this.isSingleTile) {
										class12.method43(var9);
									} else {
										var34 = true;
									}
								}
							}

							int var52 = Rasterizer3D.method1187();
							var54 = Rasterizer3D.method1188();
							var49 = 0;
							var53 = 0;
							if (var1 != 0) {
								var49 = field2172[var1];
								var53 = field2173[var1];
							}

							for (int var50 = 0; var50 < this.verticesCount; ++var50) {
								var40 = this.verticesX[var50];
								var41 = this.verticesY[var50];
								var42 = this.verticesZ[var50];
								if (var1 != 0) {
									var43 = var42 * var49 + var40 * var53 >> 16;
									var42 = var42 * var53 - var40 * var49 >> 16;
									var40 = var43;
								}

								var40 += var6;
								var41 += var7;
								var42 += var8;
								var43 = var42 * var4 + var5 * var40 >> 16;
								var42 = var5 * var42 - var40 * var4 >> 16;
								var40 = var43;
								var43 = var3 * var41 - var42 * var2 >> 16;
								var42 = var41 * var2 + var3 * var42 >> 16;
								field2168[var50] = var42 - var12;
								if (var42 >= 50) {
									modelViewportXs[var50] = var52 + var40 * Rasterizer3D.method1193() / var42;
									modelViewportYs[var50] = var54 + var43 * Rasterizer3D.method1193() / var42;
									field2159[var50] = class137.method732(var42);
								} else {
									modelViewportXs[var50] = -5000;
									var25 = true;
								}

								if (var27) {
									field2170[var50] = var40;
									field2166[var50] = var43;
									field2167[var50] = var42;
								}
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9);
							} catch (Exception var51) {
							}

						}
					}
				}
			}
		}
	}
}
