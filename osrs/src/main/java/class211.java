import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class211 implements class29 {
	@ObfuscatedName("at")
	char[] field1863;
	@ObfuscatedName("an")
	int[] field1868;
	@ObfuscatedName("av")
	public int[] field1873;
	@ObfuscatedName("as")
	@Export("pressedKeysCount")
	public int pressedKeysCount;
	@ObfuscatedName("ax")
	int[] field1869;
	@ObfuscatedName("ap")
	int field1867;
	@ObfuscatedName("ab")
	int field1864;
	@ObfuscatedName("ak")
	int field1866;
	@ObfuscatedName("ae")
	int field1865;
	@ObfuscatedName("af")
	boolean[] field1861;
	@ObfuscatedName("ao")
	boolean[] field1862;
	@ObfuscatedName("aa")
	boolean[] field1860;
	@ObfuscatedName("aj")
	public char field1870;
	@ObfuscatedName("ad")
	public int field1871;

	public class211() {
		super();
		this.field1863 = new char[128];
		this.field1868 = new int[128];
		this.field1873 = new int[128];
		this.pressedKeysCount = 0;
		this.field1869 = new int[128];
		this.field1867 = 0;
		this.field1864 = 0;
		this.field1866 = 0;
		this.field1865 = 0;
		this.field1861 = new boolean[112];
		this.field1862 = new boolean[112];
		this.field1860 = new boolean[112];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2106714627"
	)
	@Export("vmethod3949")
	public boolean vmethod3949(int var1) {
		this.method1101(var1);
		this.field1861[var1] = true;
		this.field1862[var1] = true;
		this.field1860[var1] = false;
		this.field1873[++this.pressedKeysCount - 1] = var1;
		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "100"
	)
	@Export("vmethod3989")
	public boolean vmethod3989(int var1) {
		this.field1861[var1] = false;
		this.field1862[var1] = false;
		this.field1860[var1] = true;
		this.field1869[++this.field1867 - 1] = var1;
		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "4"
	)
	@Export("vmethod3951")
	public boolean vmethod3951(char var1) {
		int var2 = this.field1866 + 1 & 127;
		if (var2 != this.field1864) {
			this.field1868[this.field1866] = -1;
			this.field1863[this.field1866] = var1;
			this.field1866 = var2;
		}

		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "839410380"
	)
	@Export("vmethod3953")
	public boolean vmethod3953(boolean var1) {
		return false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-33"
	)
	void method1101(int var1) {
		int var2 = this.field1866 + 1 & 127;
		if (var2 != this.field1864) {
			this.field1868[this.field1866] = var1;
			this.field1863[this.field1866] = 0;
			this.field1866 = var2;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1396571827"
	)
	public void method1103() {
		this.field1864 = this.field1865;
		this.field1865 = this.field1866;
		this.pressedKeysCount = 0;
		this.field1867 = 0;
		Arrays.fill(this.field1862, false);
		Arrays.fill(this.field1860, false);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "78"
	)
	public final boolean method1104() {
		if (this.field1864 == this.field1865) {
			return false;
		} else {
			this.field1871 = this.field1868[this.field1864];
			this.field1870 = this.field1863[this.field1864];
			this.field1864 = this.field1864 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "62"
	)
	public boolean method1106(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field1862[var1] : false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-239992358"
	)
	@Export("getKeyPressed")
	public boolean getKeyPressed(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field1861[var1] : false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "170136780"
	)
	public boolean method1108(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field1860[var1] : false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "969517992"
	)
	public int[] method1109() {
		int[] var1 = new int[this.pressedKeysCount];

		for (int var2 = 0; var2 < this.pressedKeysCount; ++var2) {
			var1[var2] = this.field1873[var2];
		}

		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "834793968"
	)
	public int[] method1110() {
		int[] var1 = new int[this.field1867];

		for (int var2 = 0; var2 < this.field1867; ++var2) {
			var1[var2] = this.field1869[var2];
		}

		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "1273781008"
	)
	static int method1105(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "50"
	)
	public static void method1111(boolean var0) {
		if (var0 != ItemComposition.ItemDefinition_inMembersWorld) {
			ItemComposition.ItemDefinition_cached.clear();
			ItemComposition.ItemDefinition_cachedModels.clear();
			ItemComposition.ItemDefinition_cachedSprites.clear();
			ItemComposition.ItemDefinition_inMembersWorld = var0;
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1279967208"
	)
	static int method1112(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		int var6;
		if (var0 == 3400) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			EnumComposition var5 = Canvas.getEnum(var3);
			if (var5.outputType != 's') {
			}

			for (var6 = 0; var6 < var5.outputCount; ++var6) {
				if (var4 == var5.keys[var6]) {
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.strVals[var6];
					var5 = null;
					break;
				}
			}

			if (var5 != null) {
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.defaultStr;
			}

			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				EnumComposition var10 = Canvas.getEnum(var3);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			EnumComposition var7 = Canvas.getEnum(var9);
			if (var3 == var7.inputType && var4 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var4 == 115) {
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var4 == 115) {
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var4 == 115) {
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "11"
	)
	static int method1113(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			NPCComposition var4 = Bounds.getNpcDefinition(var3);
			Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			NPCComposition var5;
			if (var0 == 6764) {
				Interpreter.Interpreter_intStackSize -= 2;
				var5 = Bounds.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
				int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.method980(var6);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.method982(var6);
				return 1;
			} else if (var0 == 6765) {
				var5 = Bounds.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5 != null ? var5.combatLevel * -1963450049 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
