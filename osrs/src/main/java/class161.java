import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class161 extends class142 {
	@ObfuscatedName("at")
	int field1394;
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
	class161(class145 var1) {
		super();
		this.this$0 = var1;
		this.field1394 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		this.field1394 = var1.readUnsignedShort();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.method801(this.field1394);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "-1137232353"
	)
	public static long method833(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILtz;I)Lhe;",
		garbageValue = "-1861148269"
	)
	public static ObjTypeCustomisation method834(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		ObjTypeCustomisation var5 = new ObjTypeCustomisation(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.recol != null && var7.length == var5.recol.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.recol[var7[var9]] = var10;
					}
				}
			}
		}

		if (var4) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.retex != null && var7.length == var5.retex.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.retex[var7[var9]] = var10;
					}
				}
			}
		}

		return var5;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	static void method835() {
		FaceNormal.Tiles_underlays = null;
		class74.Tiles_overlays = null;
		Player.Tiles_shapes = null;
		Tiles.field831 = null;
		Tiles.field838 = null;
		class305.field2754 = null;
		Canvas.field66 = null;
		UserComparator5.Tiles_hue = null;
		class210.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		class149.Tiles_hueMultiplier = null;
		Tiles.field837 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "60"
	)
	static int method838(int var0, Script var1, boolean var2) {
		Widget var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == 2600) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == 2601) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == 2602) {
			Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == 2603) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth * 83109607;
			return 1;
		} else if (var0 == 2604) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight * 2136913233;
			return 1;
		} else if (var0 == 2605) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == 2606) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == 2607) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == 2608) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == 2609) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == 2611) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == 2612) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == 2614) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class322 var4;
			if (var0 == 2617) {
				var4 = var3.method1848();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2852 * 631831443 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method1848();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2851 * -1059584737 : 0;
				return 1;
			} else {
				class327 var7;
				if (var0 == 2619) {
					var7 = var3.method1847();
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method1780().method2021() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method1848();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2853 * 513797185 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method1847();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1790() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method1847();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1791() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method1847();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1792() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method1847();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method1782() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method1847();
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method1781().method2095() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method1847();
						int var5 = var7 != null ? var7.method1786() : 0;
						int var6 = var7 != null ? var7.method1785() : 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1785() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1794() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1793() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1795() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1796() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method1849();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method97(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method1849();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method98((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method1847();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method1783() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
