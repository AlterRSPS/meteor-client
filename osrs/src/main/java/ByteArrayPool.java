import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ap")
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ab")
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ak")
	static int field3675;
	@ObfuscatedName("ae")
	static int field3673;
	@ObfuscatedName("af")
	static int field3674;
	@ObfuscatedName("ao")
	static int field3676;
	@ObfuscatedName("aa")
	static int field3671;
	@ObfuscatedName("aj")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ad")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ac")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ag")
	static byte[][] field3669;
	@ObfuscatedName("au")
	static ArrayList field3680;
	@ObfuscatedName("ko")
	@Export("cameraZ")
	static int cameraZ;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field3675 = 0;
		field3673 = 1000;
		field3674 = 250;
		field3676 = 100;
		field3671 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field3669 = new byte[50][];
		field3680 = new ArrayList();
		field3680.clear();
		field3680.add(100);
		field3680.add(5000);
		field3680.add(10000);
		field3680.add(30000);
		new HashMap();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "968818845"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var2;
		if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) {
			var2 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var2;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) {
			var2 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var2;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) {
			var2 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var2;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field3675 > 0) {
			var2 = field3669[--field3675];
			field3669[field3675] = null;
			return var2;
		} else {
			int var4;
			if (JagexCache.ByteArrayPool_arrays != null) {
				for (var4 = 0; var4 < class152.ByteArrayPool_alternativeSizes.length; ++var4) {
					if ((class152.ByteArrayPool_alternativeSizes[var4] == var0 || var0 < class152.ByteArrayPool_alternativeSizes[var4] && var1) && PendingSpawn.ByteArrayPool_altSizeArrayCounts[var4] > 0) {
						byte[] var3 = JagexCache.ByteArrayPool_arrays[var4][--PendingSpawn.ByteArrayPool_altSizeArrayCounts[var4]];
						JagexCache.ByteArrayPool_arrays[var4][PendingSpawn.ByteArrayPool_altSizeArrayCounts[var4]] = null;
						return var3;
					}
				}
			}

			if (var1 && class152.ByteArrayPool_alternativeSizes != null) {
				for (var4 = 0; var4 < class152.ByteArrayPool_alternativeSizes.length; ++var4) {
					if (var0 <= class152.ByteArrayPool_alternativeSizes[var4] && PendingSpawn.ByteArrayPool_altSizeArrayCounts[var4] < JagexCache.ByteArrayPool_arrays[var4].length) {
						return new byte[class152.ByteArrayPool_alternativeSizes[var4]];
					}
				}
			}

			return new byte[var0];
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "548182647"
	)
	static int method2108(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == 1600) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == 1601) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class327 var7;
			if (var0 == 1602) {
				if (var3.type == 12) {
					var7 = var3.method1847();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.method1779().method2021();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == 1603) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth * 83109607;
				return 1;
			} else if (var0 == 1604) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight * 2136913233;
				return 1;
			} else if (var0 == 1605) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == 1606) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == 1607) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == 1608) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == 1609) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == 1611) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == 1612) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == 1614) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class322 var4;
				if (var0 == 1617) {
					var4 = var3.method1848();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2852 * 631831443 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method1848();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2851 * -1059584737 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method1847();
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method1780().method2021() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method1848();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2853 * 513797185 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method1847();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1790() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method1847();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1791() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method1847();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1792() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method1847();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method1782() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method1847();
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method1781().method2095() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method1847();
						int var5 = var7 != null ? var7.method1786() : 0;
						int var6 = var7 != null ? var7.method1785() : 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1785() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1794() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1793() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1795() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method1847();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1796() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method1849();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method97(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
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
