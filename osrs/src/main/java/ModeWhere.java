import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("ModeWhere")
public enum ModeWhere implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3582("", 0, new class368[]{class368.field3554, class368.field3555}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3578("", 1, new class368[]{class368.field3556, class368.field3554, class368.field3555}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3583("", 2, new class368[]{class368.field3556, class368.field3553, class368.field3554}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3581("", 3, new class368[]{class368.field3556}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3584("", 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3580("", 5, new class368[]{class368.field3556, class368.field3554}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3573("", 6, new class368[]{class368.field3554}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3577("", 8, new class368[]{class368.field3556, class368.field3554}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3574("", 9, new class368[]{class368.field3556, class368.field3553}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3575("", 10, new class368[]{class368.field3556}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3579("", 11, new class368[]{class368.field3556}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3572("", 12, new class368[]{class368.field3556, class368.field3554}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field3576("", 13, new class368[]{class368.field3556});

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("ld")
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	// $FF: renamed from: id int
	@ObfuscatedName("ad")
	@Export("id")
	final int field_60;
	@ObfuscatedName("ac")
	final Set field3586;

	static {
		$values();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Log;)V"
	)
	ModeWhere(String var3, int var4, class368[] var5) {
		this.field3586 = new HashSet();
		this.field_60 = var4;
		class368[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class368 var8 = var6[var7];
			this.field3586.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3586 = new HashSet();
		this.field_60 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field_60;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhj;",
		garbageValue = "251391217"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-149482019"
	)
	public static int method1955(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1878732942"
	)
	public static int method1956(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Loo;",
		garbageValue = "0"
	)
	@Export("$values")
	static ModeWhere[] $values() {
		return new ModeWhere[]{field3574, field3578, field3572, field3581, field3576, field3573, field3582, field3583, field3575, field3577, field3584, field3579, field3580};
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1816115459"
	)
	static int method1960(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.keyHandlerInstance.getKeyPressed(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.keyHandlerInstance.method1106(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.keyHandlerInstance.method1108(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1505941389"
	)
	static int method1962(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 5504) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == 5505) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == 5506) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == 5530) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == 5531) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lhy;IIII)V",
		garbageValue = "816261218"
	)
	static void method1961(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class10.clientPreferences.getAreaSoundEffectsVolume() != 0) {
			if (var0.animMayaFrameSounds != null && var0.animMayaFrameSounds.containsKey(var1)) {
				ClientPreferences.method552((Integer)var0.animMayaFrameSounds.get(var1), var2, var3);
			}
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "-29045386"
	)
	static final void method1963(Widget var0) {
		if (var0.buttonType == 1) {
			class27.method107(var0.buttonText, "", 24, 0, 0, var0.field_9 * 1486786309, var0.itemId);
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = BuddyRankComparator.Widget_getSpellActionName(var0);
			if (var1 != null) {
				class27.method107(var1, Strings.colorStartTag(65280) + var0.field3053, 25, 0, -1, var0.field_9 * 1486786309, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			class138.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.field_9 * 1486786309);
		}

		if (var0.buttonType == 4) {
			class138.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.field_9 * 1486786309);
		}

		if (var0.buttonType == 5) {
			class138.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.field_9 * 1486786309);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class138.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.field_9 * 1486786309);
		}

		if (var0.isIf3) {
			int var2;
			if (Client.isSpellSelected) {
				var2 = StudioGame.getWidgetFlags(var0);
				boolean var5 = (var2 >> 21 & 1) != 0;
				if (var5 && (class125.selectedSpellFlags & 32) == 32) {
					class27.method107(Client.field597, Client.field598 + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex * 112312013, var0.field_9 * 1486786309, var0.itemId);
				}
			} else {
				for (int var7 = 9; var7 >= 5; --var7) {
					String var6 = class147.method770(var0, var7);
					if (var6 != null) {
						class27.method107(var6, var0.dataText, 1007, var7 + 1, var0.childIndex * 112312013, var0.field_9 * 1486786309, var0.itemId);
					}
				}

				var1 = BuddyRankComparator.Widget_getSpellActionName(var0);
				if (var1 != null) {
					class27.method107(var1, var0.dataText, 25, 0, var0.childIndex * 112312013, var0.field_9 * 1486786309, var0.itemId);
				}

				for (var2 = 4; var2 >= 0; --var2) {
					String var3;
					if (!class60.method315(StudioGame.getWidgetFlags(var0), var2) && var0.onOp == null) {
						var3 = null;
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) {
						var3 = var0.actions[var2];
					} else {
						var3 = null;
					}

					if (var3 != null) {
						class270.insertMenuItem(var3, var0.dataText, 57, var2 + 1, var0.childIndex * 112312013, var0.field_9 * 1486786309, var0.itemId, var0.prioritizeMenuEntry);
					}
				}

				if (JagexCache.method900(StudioGame.getWidgetFlags(var0))) {
					class138.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex * 112312013, var0.field_9 * 1486786309);
				}
			}
		}

	}
}
