import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("an")
	@Export("plane")
	int plane;
	// $FF: renamed from: x int
	@ObfuscatedName("av")
	@Export("x")
	int field_6;
	// $FF: renamed from: y int
	@ObfuscatedName("as")
	@Export("y")
	int field_7;
	@ObfuscatedName("ax")
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ap")
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ab")
	int field685;
	@ObfuscatedName("ak")
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("af")
	int field686;
	@ObfuscatedName("ao")
	int field690;
	@ObfuscatedName("aa")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("aj")
	int field687;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
		super();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field685 = var2.int7 * 128;
			this.field686 = var2.int5;
			this.field690 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field685 = 0;
			this.field686 = 0;
			this.field690 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			KitDefinition.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;I)V",
		garbageValue = "1503120743"
	)
	public static void method408(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Ley;",
		garbageValue = "1661675157"
	)
	static class127[] method410() {
		return new class127[]{class127.field1207, class127.field1205, class127.field1208, class127.field1206, class127.field1209};
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "145020276"
	)
	static int method411(int var0, Script var1, boolean var2) {
		if (var0 == 6500) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class497.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var3;
			if (var0 == 6501) {
				var3 = class17.worldListStart();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.field_72;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var3 = class171.getNextWorldListWorld();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.field_72;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				World var4;
				int var5;
				int var7;
				if (var0 == 6506) {
					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var4 = null;

					for (var5 = 0; var5 < World.World_count; ++var5) {
						if (var7 == World.World_worlds[var5].field_72) {
							var4 = World.World_worlds[var5];
							break;
						}
					}

					if (var4 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field_72;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					Interpreter.Interpreter_intStackSize -= 4;
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
					class309.sortWorldList(var7, var10, var5, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var8;
						ParamComposition var9;
						if (var0 == 6513) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = ModeWhere.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Bounds.getNpcDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Bounds.getNpcDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6514) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = ModeWhere.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class175.getObjectDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class175.getObjectDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6515) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = ModeWhere.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class300.ItemDefinition_get(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6516) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = ModeWhere.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class139.StructDefinition_getStructDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class139.StructDefinition_getStructDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6518) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--class149.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class149.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6524) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field423;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var7 >= 0 && var7 < World.World_count) {
						var4 = World.World_worlds[var7];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field_72;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
