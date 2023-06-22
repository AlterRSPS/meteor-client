import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1022;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("uo")
	static int field1021;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	IndexedSprite[] field1039;
	@ObfuscatedName("ab")
	int[] field1031;
	@ObfuscatedName("ak")
	int field1027;
	@ObfuscatedName("ae")
	int[] field1033;
	@ObfuscatedName("af")
	int[] field1034;
	@ObfuscatedName("ao")
	int[] field1037;
	@ObfuscatedName("aa")
	int[] field1030;
	@ObfuscatedName("aj")
	int field1026;
	@ObfuscatedName("ad")
	int field1024;
	@ObfuscatedName("ac")
	int[] field1032;
	@ObfuscatedName("ag")
	int[] field1035;
	@ObfuscatedName("ar")
	int[] field1038;
	@ObfuscatedName("ah")
	int[] field1036;
	@ObfuscatedName("az")
	int field1029;
	@ObfuscatedName("au")
	int field1028;
	@ObfuscatedName("ai")
	int field1025;

	@ObfuscatedSignature(
		descriptor = "([Ltj;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		super();
		this.field1031 = new int[256];
		this.field1027 = 0;
		this.field1026 = 0;
		this.field1024 = 0;
		this.field1029 = 0;
		this.field1028 = 0;
		this.field1025 = 0;
		this.field1039 = var1;
		this.initColors();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1396331421"
	)
	@Export("initColors")
	void initColors() {
		this.field1034 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1034[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1034[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1034[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1034[var1 + 192] = 16777215;
		}

		this.field1037 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1037[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1037[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1037[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1037[var1 + 192] = 16777215;
		}

		this.field1030 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1030[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1030[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1030[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1030[var1 + 192] = 16777215;
		}

		this.field1033 = new int[256];
		this.field1029 = 0;
		this.field1038 = new int[32768];
		this.field1036 = new int[32768];
		this.method517((IndexedSprite)null);
		this.field1032 = new int[32768];
		this.field1035 = new int[32768];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-888845669"
	)
	void method509() {
		this.field1034 = null;
		this.field1037 = null;
		this.field1030 = null;
		this.field1033 = null;
		this.field1038 = null;
		this.field1036 = null;
		this.field1032 = null;
		this.field1035 = null;
		this.field1029 = 0;
		this.field1028 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-693157530"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1032 == null) {
			this.initColors();
		}

		if (this.field1025 == 0) {
			this.field1025 = var2;
		}

		int var3 = var2 - this.field1025;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1025 = var2;
		if (var3 > 0) {
			this.method511(var3);
		}

		this.method514(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "81"
	)
	final void method511(int var1) {
		this.field1029 += var1 * 128;
		int var2;
		if (this.field1029 > this.field1038.length) {
			this.field1029 -= this.field1038.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method517(this.field1039[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1032[var2 + var3] - this.field1038[var2 + this.field1029 & this.field1038.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1032[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1032[var8 + var9] = 255;
				} else {
					this.field1032[var8 + var9] = 0;
				}
			}
		}

		if (this.field1026 > 0) {
			this.field1026 -= var1 * 4;
		}

		if (this.field1024 > 0) {
			this.field1024 -= var1 * 4;
		}

		if (this.field1026 == 0 && this.field1024 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1026 = 1024;
			}

			if (var7 == 1) {
				this.field1024 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1031[var7] = this.field1031[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1031[var7] = (int)(Math.sin((double)this.field1027 / 14.0D) * 16.0D + Math.sin((double)this.field1027 / 15.0D) * 14.0D + Math.sin((double)this.field1027 / 16.0D) * 12.0D);
			++this.field1027;
		}

		this.field1028 += var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1028 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1032[var12 + (var13 << 7)] = 192;
			}

			this.field1028 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1032[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1032[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1035[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1035[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1035[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1032[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2006466006"
	)
	final int method513(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2117632308"
	)
	final void method514(int var1) {
		int var2 = this.field1033.length;
		if (this.field1026 > 0) {
			this.method515(this.field1026, this.field1037);
		} else if (this.field1024 > 0) {
			this.method515(this.field1024, this.field1030);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1033[var3] = this.field1034[var3];
			}
		}

		this.method516(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "1720728483"
	)
	final void method515(int var1, int[] var2) {
		int var3 = this.field1033.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1033[var4] = this.method513(this.field1034[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1033[var4] = var2[var4];
			} else {
				this.field1033[var4] = this.method513(var2[var4], this.field1034[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2056253148"
	)
	final void method516(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1031[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= WorldMapSectionType.rasterProvider.width) {
				var7 = WorldMapSectionType.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * WorldMapSectionType.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1032[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1033[var10];
					int var14 = WorldMapSectionType.rasterProvider.pixels[var8];
					WorldMapSectionType.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltj;B)V",
		garbageValue = "0"
	)
	final void method517(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1038.length; ++var2) {
			this.field1038[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1038[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1036[var5] = (this.field1038[var5 + 1] + this.field1038[var5 + 128] + this.field1038[var5 - 128] + this.field1038[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1038;
			this.field1038 = this.field1036;
			this.field1036 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1038[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-784910213"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)[Lfp;",
		garbageValue = "25777"
	)
	static class137[] method512() {
		return new class137[]{class137.field1294, class137.field1291, class137.field1295, class137.field1293, class137.field1296, class137.field1292, class137.field1288, class137.field1290, class137.field1289};
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-59"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class435.ItemDefinition_fileCount; ++var4) {
			ItemComposition var5 = class300.ItemDefinition_get(var4);
			if ((!var1 || var5.isTradable) && var5.noteTemplate == -1 && var5.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class105.foundItemIdCount = -1;
					class18.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class18.foundItemIds = var2;
		class13.foundItemIndex = 0;
		class105.foundItemIdCount = var3;
		String[] var8 = new String[class105.foundItemIdCount];

		for (int var9 = 0; var9 < class105.foundItemIdCount; ++var9) {
			var8[var9] = class300.ItemDefinition_get(var2[var9]).name;
		}

		short[] var10 = class18.foundItemIds;
		Archive.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
