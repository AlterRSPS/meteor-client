import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class130 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1244;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1241;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1245;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1243;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1246;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	static final class130 field1242;
	@ObfuscatedName("jg")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("ab")
	final int field1247;
	@ObfuscatedName("ak")
	final int field1249;
	@ObfuscatedName("ae")
	final int field1248;

	static {
		field1244 = new class130(0, 0, (String)null, 0);
		field1241 = new class130(1, 1, (String)null, 9);
		field1245 = new class130(2, 2, (String)null, 3);
		field1243 = new class130(3, 3, (String)null, 6);
		field1246 = new class130(4, 4, (String)null, 1);
		field1242 = new class130(5, 5, (String)null, 3);
	}

	class130(int var1, int var2, String var3, int var4) {
		super();
		this.field1247 = var1;
		this.field1249 = var2;
		this.field1248 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1249;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1244171306"
	)
	int method704() {
		return this.field1248;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Leq;FB)F",
		garbageValue = "-5"
	)
	static float method703(class129 var0, float var1) {
		if (var0 != null && var0.method701() != 0) {
			if (var1 < (float)var0.field1221[0].field1181) {
				return var0.field1223 == class127.field1207 ? var0.field1221[0].field1176 : class72.method420(var0, var1, true);
			} else if (var1 > (float)var0.field1221[var0.method701() - 1].field1181) {
				return var0.field1222 == class127.field1207 ? var0.field1221[var0.method701() - 1].field1176 : class72.method420(var0, var1, false);
			} else if (var0.field1217) {
				return var0.field1221[0].field1176;
			} else {
				class124 var2 = var0.method700(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if (0.0D == (double)var2.field1180 && (double)var2.field1177 == 0.0D) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1180 && var2.field1177 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1175 != null) {
						if (var0.field1219) {
							var5 = (float)var2.field1181;
							float var9 = var2.field1176;
							var6 = var2.field1180 * 0.33333334F + var5;
							float var10 = var9 + var2.field1177 * 0.33333334F;
							float var8 = (float)var2.field1175.field1181;
							float var12 = var2.field1175.field1176;
							var7 = var8 - var2.field1175.field1179 * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.field1175.field1178;
							if (var0.field1220) {
								float var15 = var10;
								float var16 = var11;
								if (var0 != null) {
									float var17 = var8 - var5;
									if (0.0D != (double)var17) {
										float var18 = var6 - var5;
										float var19 = var7 - var5;
										float[] var20 = new float[]{var18 / var17, var19 / var17};
										var0.field1218 = 0.33333334F == var20[0] && 0.6666667F == var20[1];
										float var21 = var20[0];
										float var22 = var20[1];
										if ((double)var20[0] < 0.0D) {
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) {
											var20[1] = 1.0F;
										}

										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) {
											SoundSystem.method209(var20);
										}

										if (var20[0] != var21) {
											float var10000 = var5 + var17 * var20[0];
											if ((double)var21 != 0.0D) {
												var15 = var9 + (var10 - var9) * var20[0] / var21;
											}
										}

										if (var22 != var20[1]) {
											float var14 = var17 * var20[1] + var5;
											if ((double)var22 != 1.0D) {
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var20[1]) / (1.0D - (double)var22));
											}
										}

										var0.field1225 = var5;
										var0.field1232 = var8;
										float var23 = var20[0];
										float var24 = var20[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.field1224 = var27 - var26 - var28;
										var0.field1233 = var28 + var28 + var28;
										var0.field1229 = var25 + var25 + var25;
										var0.field1228 = 0.0F;
										var25 = var15 - var9;
										var26 = var16 - var15;
										var27 = var12 - var16;
										var28 = var26 - var25;
										var0.field1230 = var27 - var26 - var28;
										var0.field1226 = var28 + var28 + var28;
										var0.field1227 = var25 + var25 + var25;
										var0.field1231 = var9;
									}
								}
							} else {
								class370.method1950(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.field1219 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1176;
					} else if (var4) {
						return var1 != (float)var2.field1181 && var2.field1175 != null ? var2.field1175.field1176 : var2.field1176;
					} else if (var0.field1220) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var1 == var0.field1225) {
								var6 = 0.0F;
							} else if (var0.field1232 == var1) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1225) / (var0.field1232 - var0.field1225);
							}

							if (var0.field1218) {
								var7 = var6;
							} else {
								class125.field1186[3] = var0.field1224;
								class125.field1186[2] = var0.field1233;
								class125.field1186[1] = var0.field1229;
								class125.field1186[0] = var0.field1228 - var6;
								class125.field1185[0] = 0.0F;
								class125.field1185[1] = 0.0F;
								class125.field1185[2] = 0.0F;
								class125.field1185[3] = 0.0F;
								class125.field1185[4] = 0.0F;
								int var29 = class72.method418(class125.field1186, 3, 0.0F, true, 1.0F, true, class125.field1185);
								if (var29 == 1) {
									var7 = class125.field1185[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = var0.field1231 + var7 * (var0.field1227 + var7 * (var7 * var0.field1230 + var0.field1226));
						}

						return var5;
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1225;
							var5 = var6 * ((var0.field1229 + var6 * var0.field1228) * var6 + var0.field1233) + var0.field1224;
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "109"
	)
	static int method706(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class327.method1811() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
