import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class152 extends class142 {
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("kn")
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("at")
	int field1345;
	@ObfuscatedName("an")
	String field1346;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class152(class145 var1) {
		super();
		this.this$0 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		this.field1345 = var1.readInt();
		this.field1346 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.method807(this.field1345, this.field1346);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-987"
	)
	public static int method782(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsl;",
		garbageValue = "1"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field4049.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method2458(new Buffer(var2));
			}

			var1.method2460();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1415834229"
	)
	static final void method786(boolean var0) {
		if (var0) {
			Client.field416 = Login.field745 ? class138.field1299 : class138.field1300;
		} else {
			Client.field416 = class10.clientPreferences.method548(Login.Login_username) ? class138.field1301 : class138.field1302;
		}

	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1622212855"
	)
	static final void method787(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0;
		boolean var4 = false;
		int var5 = -1;
		int var6 = -1;
		int var7 = Players.Players_count;
		int[] var8 = Players.Players_indices;

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) {
			Object var10;
			if (var9 < var7) {
				var10 = Client.players[var8[var9]];
				if (var8[var9] == Client.combatTargetPlayerIndex) {
					var4 = true;
					var5 = var9;
					continue;
				}

				if (var10 == Projectile.localPlayer) {
					var6 = var9;
					continue;
				}
			} else {
				var10 = Client.npcs[Client.npcIndices[var9 - var7]];
			}

			class322.drawActor2d((Actor)var10, var9, var0, var1, var2, var3);
		}

		if (Client.field384 && var6 != -1) {
			class322.drawActor2d(Projectile.localPlayer, var6, var0, var1, var2, var3);
		}

		if (var4) {
			class322.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) {
			int var20 = Client.overheadTextXs[var9];
			int var11 = Client.overheadTextYs[var9];
			int var12 = Client.overheadTextXOffsets[var9];
			int var13 = Client.overheadTextAscents[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var15 = 0; var15 < var9; ++var15) {
					if (var11 + 2 > Client.overheadTextYs[var15] - Client.overheadTextAscents[var15] && var11 - var13 < Client.overheadTextYs[var15] + 2 && var20 - var12 < Client.overheadTextXs[var15] + Client.overheadTextXOffsets[var15] && var20 + var12 > Client.overheadTextXs[var15] - Client.overheadTextXOffsets[var15] && Client.overheadTextYs[var15] - Client.overheadTextAscents[var15] < var11) {
						var11 = Client.overheadTextYs[var15] - Client.overheadTextAscents[var15];
						var14 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9];
			Client.viewportTempY = Client.overheadTextYs[var9] = var11;
			String var21 = Client.overheadText[var9];
			if (Client.chatEffects == 0) {
				int var16 = 16776960;
				if (Client.overheadTextColors[var9] < 6) {
					var16 = Client.field579[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) {
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) {
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) {
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) {
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				int var18;
				if (Client.overheadTextColors[var9] == 12 && Client.field593[var9] == null) {
					var17 = var21.length();
					Client.field593[var9] = new int[var17];

					for (var18 = 0; var18 < var17; ++var18) {
						int var19 = (int)((float)var18 / (float)var17 * 64.0F);
						Client.field593[var9][var18] = class454.field3850[var19 << 10 | 896 | 64];
					}
				}

				if (Client.overheadTextEffects[var9] == 0) {
					class166.fontBold12.method2080(var21, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field593[var9]);
				}

				if (Client.overheadTextEffects[var9] == 1) {
					class166.fontBold12.method2077(var21, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field593[var9]);
				}

				if (Client.overheadTextEffects[var9] == 2) {
					class166.fontBold12.method2078(var21, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field593[var9]);
				}

				if (Client.overheadTextEffects[var9] == 3) {
					class166.fontBold12.method2079(var21, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9], Client.field593[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) {
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class166.fontBold12.stringWidth(var21) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					class166.fontBold12.method2081(var21, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field593[var9]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var9] == 5) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					var18 = 0;
					if (var17 < 25) {
						var18 = var17 - 25;
					} else if (var17 > 125) {
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class166.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					class166.fontBold12.method2080(var21, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field593[var9]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class166.fontBold12.drawCentered(var21, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

	}
}
