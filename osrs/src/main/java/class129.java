import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class129 {
	@ObfuscatedName("at")
	boolean field1220;
	@ObfuscatedName("an")
	boolean field1217;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	class127 field1223;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	class127 field1222;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lex;"
	)
	class124[] field1221;
	@ObfuscatedName("ap")
	boolean field1218;
	@ObfuscatedName("ab")
	float field1225;
	@ObfuscatedName("ak")
	float field1232;
	@ObfuscatedName("ae")
	float field1228;
	@ObfuscatedName("af")
	float field1229;
	@ObfuscatedName("ao")
	float field1233;
	@ObfuscatedName("aa")
	float field1224;
	@ObfuscatedName("aj")
	float field1231;
	@ObfuscatedName("ad")
	float field1227;
	@ObfuscatedName("ac")
	float field1226;
	@ObfuscatedName("ag")
	float field1230;
	@ObfuscatedName("ar")
	boolean field1219;
	@ObfuscatedName("ah")
	int field1237;
	@ObfuscatedName("az")
	float[] field1236;
	@ObfuscatedName("au")
	int field1239;
	@ObfuscatedName("ai")
	int field1238;
	@ObfuscatedName("aq")
	float field1234;
	@ObfuscatedName("aw")
	float field1235;

	class129() {
		super();
		this.field1219 = true;
		this.field1237 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)I",
		garbageValue = "1263530556"
	)
	int method693(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		UserComparator5.method656(var1.readUnsignedByte());
		this.field1223 = class90.method465(var1.readUnsignedByte());
		this.field1222 = class90.method465(var1.readUnsignedByte());
		this.field1220 = var1.readUnsignedByte() != 0;
		this.field1221 = new class124[var3];
		class124 var4 = null;

		for (int var5 = 0; var5 < var3; ++var5) {
			class124 var6 = new class124();
			var6.method674(var1, var2);
			this.field1221[var5] = var6;
			if (var4 != null) {
				var4.field1175 = var6;
			}

			var4 = var6;
		}

		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1311556489"
	)
	void method694() {
		this.field1239 = this.field1221[0].field1181;
		this.field1238 = this.field1221[this.method701() - 1].field1181;
		this.field1236 = new float[this.method698() + 1];

		for (int var1 = this.method696(); var1 <= this.method697(); ++var1) {
			this.field1236[var1 - this.method696()] = class130.method703(this, (float)var1);
		}

		this.field1221 = null;
		this.field1234 = class130.method703(this, (float)(this.method696() - 1));
		this.field1235 = class130.method703(this, (float)(this.method697() + 1));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1736495931"
	)
	public float method695(int var1) {
		if (var1 < this.method696()) {
			return this.field1234;
		} else {
			return var1 > this.method697() ? this.field1235 : this.field1236[var1 - this.method696()];
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "53"
	)
	int method696() {
		return this.field1239;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2116116780"
	)
	int method697() {
		return this.field1238;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	int method698() {
		return this.method697() - this.method696();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1020771596"
	)
	int method699(float var1) {
		if (this.field1237 >= 0 && (float)this.field1221[this.field1237].field1181 <= var1 && (this.field1221[this.field1237].field1175 == null || (float)this.field1221[this.field1237].field1175.field1181 > var1)) {
			return this.field1237;
		} else if (var1 >= (float)this.method696() && var1 <= (float)this.method697()) {
			int var2 = this.method701();
			int var3 = this.field1237;
			if (var2 > 0) {
				int var4 = 0;
				int var5 = var2 - 1;

				do {
					int var6 = var4 + var5 >> 1;
					if (var1 < (float)this.field1221[var6].field1181) {
						if (var1 > (float)this.field1221[var6 - 1].field1181) {
							var3 = var6 - 1;
							break;
						}

						var5 = var6 - 1;
					} else {
						if (var1 <= (float)this.field1221[var6].field1181) {
							var3 = var6;
							break;
						}

						if (var1 < (float)this.field1221[var6 + 1].field1181) {
							var3 = var6;
							break;
						}

						var4 = var6 + 1;
					}
				} while(var4 <= var5);
			}

			if (var3 != this.field1237) {
				this.field1237 = var3;
				this.field1219 = true;
			}

			return this.field1237;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FB)Lex;",
		garbageValue = "121"
	)
	class124 method700(float var1) {
		int var2 = this.method699(var1);
		return var2 >= 0 && var2 < this.field1221.length ? this.field1221[var2] : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1739870079"
	)
	int method701() {
		return this.field1221 == null ? 0 : this.field1221.length;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1861125214"
	)
	static final void method702(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method1200(var17, var18, var19);
			Rasterizer3D.method1202(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.method1200(var17, var19, var20);
			Rasterizer3D.method1202(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
