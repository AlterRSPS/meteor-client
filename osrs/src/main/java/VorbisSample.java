import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	static class60 field266;
	@ObfuscatedName("ak")
	static int field275;
	@ObfuscatedName("ae")
	static int field274;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lcs;"
	)
	static VorbisCodebook[] field267;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	static VorbisFloor[] field265;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lbm;"
	)
	static class46[] field261;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	static VorbisMapping[] field264;
	@ObfuscatedName("ad")
	static boolean[] field263;
	@ObfuscatedName("ac")
	static int[] field276;
	@ObfuscatedName("ag")
	static boolean field262;
	@ObfuscatedName("aq")
	static float[] field270;
	@ObfuscatedName("aw")
	static float[] field271;
	@ObfuscatedName("ay")
	static float[] field272;
	@ObfuscatedName("al")
	static float[] field268;
	@ObfuscatedName("am")
	static float[] field269;
	@ObfuscatedName("bs")
	static float[] field273;
	@ObfuscatedName("bc")
	static int[] field277;
	@ObfuscatedName("bj")
	static int[] field278;
	@ObfuscatedName("at")
	byte[][] field282;
	@ObfuscatedName("an")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("av")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("as")
	@Export("start")
	int start;
	@ObfuscatedName("ax")
	@Export("end")
	int end;
	@ObfuscatedName("ap")
	boolean field279;
	@ObfuscatedName("ar")
	float[] field284;
	@ObfuscatedName("ah")
	int field285;
	@ObfuscatedName("az")
	int field290;
	@ObfuscatedName("au")
	boolean field280;
	@ObfuscatedName("ai")
	float[] field283;
	@ObfuscatedName("bo")
	@Export("samples")
	byte[] samples;
	@ObfuscatedName("bq")
	int field292;
	@ObfuscatedName("bg")
	int field291;

	static {
		field266 = new class60();
		field262 = false;
	}

	VorbisSample(byte[] var1) {
		super();
		this.read(var1);
	}

	@ObfuscatedName("an")
	@Export("read")
	void read(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		this.sampleRate = var2.readInt();
		this.sampleCount = var2.readInt();
		this.start = var2.readInt();
		this.end = var2.readInt();
		if (this.end < 0) {
			this.end = ~this.end;
			this.field279 = true;
		}

		int var3 = var2.readInt();
		this.field282 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.readUnsignedByte();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5);
			this.field282[var4] = var7;
		}

	}

	@ObfuscatedName("as")
	float[] method289(int var1) {
		class60 var2 = new class60();
		var2.method317(this.field282[var1], 0);
		this.field283 = new float[field274];
		var2.method316();
		int var3 = var2.method314(Tile.iLog(field276.length - 1));
		boolean var4 = field263[var3];
		int var5 = var4 ? field274 : field275;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method316() != 0;
			var7 = var2.method316() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field275 >> 2);
			var10 = (field275 >> 2) + (var5 >> 2);
			var11 = field275 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field275 >> 2);
			var13 = (field275 >> 2) + (var5 - (var5 >> 2));
			var14 = field275 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = field264[field276[var3]];
		int var16 = var15.field247;
		int var17 = var15.field250[var16];
		class59 var18 = field265[var17].method187(var2);
		boolean var19 = !var18.method309();

		int var20;
		for (var20 = 0; var20 < var15.field248; ++var20) {
			class46 var21 = field261[var15.field249[var20]];
			float[] var22 = this.field283;
			var21.method218(var22, var5 >> 1, var19, var2);
		}

		if (var18.method309()) {
			var16 = var15.field247;
			int var10000 = var15.field250[var16];
			var18.method307(this.field283, var5 >> 1);
		}

		int var43;
		int var44;
		if (!var18.method309()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field283[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var43 = var5 >> 2;
			var44 = var5 >> 3;
			float[] var23 = this.field283;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var45 = var4 ? field268 : field270;
			float[] var25 = var4 ? field269 : field271;
			float[] var26 = var4 ? field273 : field272;
			int[] var27 = var4 ? field278 : field277;

			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var43; ++var28) {
				var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
				var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
				var31 = var45[var28 * 2];
				var32 = var45[var28 * 2 + 1];
				var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var44; ++var28) {
				var29 = var23[var20 + var28 * 4 + 3];
				var30 = var23[var20 + var28 * 4 + 1];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var20 + var28 * 4 + 3] = var29 + var31;
				var23[var20 + var28 * 4 + 1] = var30 + var32;
				var33 = var45[var20 - 4 - var28 * 4];
				var34 = var45[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
				var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
			}

			var28 = Tile.iLog(var5 - 1);

			int var49;
			int var50;
			int var51;
			int var52;
			for (var49 = 0; var49 < var28 - 3; ++var49) {
				var50 = var5 >> var49 + 2;
				var51 = 8 << var49;

				for (var52 = 0; var52 < 2 << var49; ++var52) {
					int var53 = var5 - var50 * var52 * 2;
					int var54 = var5 - var50 * (var52 * 2 + 1);

					for (int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
						int var36 = var35 * 4;
						float var37 = var23[var53 - 1 - var36];
						float var38 = var23[var53 - 3 - var36];
						float var39 = var23[var54 - 1 - var36];
						float var40 = var23[var54 - 3 - var36];
						var23[var53 - 1 - var36] = var37 + var39;
						var23[var53 - 3 - var36] = var38 + var40;
						float var41 = var45[var35 * var51];
						float var42 = var45[var35 * var51 + 1];
						var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (var49 = 1; var49 < var44 - 1; ++var49) {
				var50 = var27[var49];
				if (var49 < var50) {
					var51 = var49 * 8;
					var52 = var50 * 8;
					var33 = var23[var51 + 1];
					var23[var51 + 1] = var23[var52 + 1];
					var23[var52 + 1] = var33;
					var33 = var23[var51 + 3];
					var23[var51 + 3] = var23[var52 + 3];
					var23[var52 + 3] = var33;
					var33 = var23[var51 + 5];
					var23[var51 + 5] = var23[var52 + 5];
					var23[var52 + 5] = var33;
					var33 = var23[var51 + 7];
					var23[var51 + 7] = var23[var52 + 7];
					var23[var52 + 7] = var33;
				}
			}

			for (var49 = 0; var49 < var20; ++var49) {
				var23[var49] = var23[var49 * 2 + 1];
			}

			for (var49 = 0; var49 < var44; ++var49) {
				var23[var5 - 1 - var49 * 2] = var23[var49 * 4];
				var23[var5 - 2 - var49 * 2] = var23[var49 * 4 + 1];
				var23[var5 - var43 - 1 - var49 * 2] = var23[var49 * 4 + 2];
				var23[var5 - var43 - 2 - var49 * 2] = var23[var49 * 4 + 3];
			}

			for (var49 = 0; var49 < var44; ++var49) {
				var30 = var26[var49 * 2];
				var31 = var26[var49 * 2 + 1];
				var32 = var23[var20 + var49 * 2];
				var33 = var23[var20 + var49 * 2 + 1];
				var34 = var23[var5 - 2 - var49 * 2];
				float var55 = var23[var5 - 1 - var49 * 2];
				float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
				var23[var20 + var49 * 2] = (var32 + var34 + var56) * 0.5F;
				var23[var5 - 2 - var49 * 2] = (var32 + var34 - var56) * 0.5F;
				var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
				var23[var20 + var49 * 2 + 1] = (var33 - var55 + var56) * 0.5F;
				var23[var5 - 1 - var49 * 2] = (-var33 + var55 + var56) * 0.5F;
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var23[var20 + var49 * 2] * var25[var49 * 2] + var23[var20 + var49 * 2 + 1] * var25[var49 * 2 + 1];
				var23[var20 - 1 - var49] = var23[var20 + var49 * 2] * var25[var49 * 2 + 1] - var23[var20 + var49 * 2 + 1] * var25[var49 * 2];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49 + (var5 - var43)] = -var23[var49];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var23[var43 + var49];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var43 + var49] = -var23[var43 - var49 - 1];
			}

			for (var49 = 0; var49 < var43; ++var49) {
				var23[var20 + var49] = var23[var5 - var49 - 1];
			}

			float[] var57;
			for (var49 = var9; var49 < var10; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
				var57 = this.field283;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var49 = var12; var49 < var13; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field283;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var46 = null;
		if (this.field285 > 0) {
			var43 = var5 + this.field285 >> 2;
			var46 = new float[var43];
			int var47;
			if (!this.field280) {
				for (var44 = 0; var44 < this.field290; ++var44) {
					var47 = var44 + (this.field285 >> 1);
					var46[var44] += this.field284[var47];
				}
			}

			if (var18.method309()) {
				for (var44 = var9; var44 < var5 >> 1; ++var44) {
					var47 = var46.length - (var5 >> 1) + var44;
					var46[var47] += this.field283[var44];
				}
			}
		}

		float[] var48 = this.field284;
		this.field284 = this.field283;
		this.field283 = var48;
		this.field285 = var5;
		this.field290 = var13 - (var5 >> 1);
		this.field280 = !var18.method309();
		return var46;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I)Lbp;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.samples == null) {
				this.field285 = 0;
				this.field284 = new float[field274];
				this.samples = new byte[this.sampleCount];
				this.field292 = 0;
				this.field291 = 0;
			}

			for (; this.field291 < this.field282.length; ++this.field291) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method289(this.field291);
				if (var2 != null) {
					int var3 = this.field292;
					int var4 = var2.length;
					if (var4 > this.sampleCount - var3) {
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.samples[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field292;
					}

					this.field292 = var3;
				}
			}

			this.field284 = null;
			byte[] var7 = this.samples;
			this.samples = null;
			return new RawSound(this.sampleRate, var7, this.start, this.end, this.field279);
		}
	}

	@ObfuscatedName("at")
	@Export("float32Unpack")
	static float float32Unpack(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	@ObfuscatedName("av")
	static void method288(byte[] var0) {
		class60 var1 = field266;
		var1.method317(var0, 0);
		field275 = 1 << var1.method314(4);
		field274 = 1 << var1.method314(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field274 : field275;
			var4 = var3 >> 1;
			var5 = var3 >> 2;
			var6 = var3 >> 3;
			float[] var19 = new float[var4];

			for (int var8 = 0; var8 < var5; ++var8) {
				var19[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3);
				var19[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3));
			}

			float[] var20 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var20[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
				var20[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
			}

			float[] var21 = new float[var5];

			for (int var10 = 0; var10 < var6; ++var10) {
				var21[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3);
				var21[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3));
			}

			int[] var22 = new int[var6];
			int var11 = Tile.iLog(var6 - 1);

			for (int var12 = 0; var12 < var6; ++var12) {
				int var16 = var12;
				int var17 = var11;

				int var18;
				for (var18 = 0; var17 > 0; --var17) {
					var18 = var18 << 1 | var16 & 1;
					var16 >>>= 1;
				}

				var22[var12] = var18;
			}

			if (var2 != 0) {
				field268 = var19;
				field269 = var20;
				field273 = var21;
				field278 = var22;
			} else {
				field270 = var19;
				field271 = var20;
				field272 = var21;
				field277 = var22;
			}
		}

		var2 = var1.method314(8) + 1;
		field267 = new VorbisCodebook[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field267[var3] = new VorbisCodebook();
		}

		var3 = var1.method314(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method314(16);
		}

		var3 = var1.method314(6) + 1;
		field265 = new VorbisFloor[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field265[var4] = new VorbisFloor();
		}

		var4 = var1.method314(6) + 1;
		field261 = new class46[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field261[var5] = new class46();
		}

		var5 = var1.method314(6) + 1;
		field264 = new VorbisMapping[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field264[var6] = new VorbisMapping();
		}

		var6 = var1.method314(6) + 1;
		field263 = new boolean[var6];
		field276 = new int[var6];

		for (int var7 = 0; var7 < var6; ++var7) {
			field263[var7] = var1.method316() != 0;
			var1.method314(16);
			var1.method314(16);
			field276[var7] = var1.method314(8);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnq;)Z"
	)
	static boolean method290(AbstractArchive var0) {
		if (!field262) {
			byte[] var1 = var0.takeFile(0, 0);
			if (var1 == null) {
				return false;
			}

			method288(var1);
			field262 = true;
		}

		return true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnq;II)Lca;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method290(var0)) {
			var0.tryLoadFile(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.takeFile(var1, var2);
			return var3 == null ? null : new VorbisSample(var3);
		}
	}
}
