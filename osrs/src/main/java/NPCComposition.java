import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	static AbstractArchive field1559;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	// $FF: renamed from: id int
	@ObfuscatedName("ap")
	@Export("id")
	public int field_12;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("ak")
	@Export("size")
	public int size;
	@ObfuscatedName("ae")
	@Export("models")
	int[] models;
	@ObfuscatedName("af")
	int[] field1568;
	@ObfuscatedName("ao")
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("aa")
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("aj")
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ad")
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ac")
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ag")
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ar")
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ah")
	@Export("runSequence")
	public int runSequence;
	@ObfuscatedName("az")
	@Export("runBackSequence")
	public int runBackSequence;
	@ObfuscatedName("au")
	@Export("runLeftSequence")
	public int runLeftSequence;
	@ObfuscatedName("ai")
	@Export("runRightSequence")
	public int runRightSequence;
	@ObfuscatedName("aq")
	@Export("crawlSequence")
	public int crawlSequence;
	@ObfuscatedName("aw")
	@Export("crawlBackSequence")
	public int crawlBackSequence;
	@ObfuscatedName("ay")
	@Export("crawlLeftSequence")
	public int crawlLeftSequence;
	@ObfuscatedName("al")
	@Export("crawlRightSequence")
	public int crawlRightSequence;
	@ObfuscatedName("am")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bs")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bc")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bj")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bo")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bq")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bg")
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bf")
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bd")
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ba")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bn")
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bb")
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bx")
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("be")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bh")
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bp")
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bw")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bi")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bk")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bv")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bz")
	@Export("headIconSpriteIndexes")
	short[] headIconSpriteIndexes;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		super();
		this.name = "null";
		this.size = 1;
		this.idleSequence = -1 * -1715570245;
		this.turnLeftSequence = -1 * -1543559101;
		this.turnRightSequence = -1 * 531240293;
		this.walkSequence = -1 * 597536279;
		this.walkBackSequence = -1 * -2105973293;
		this.walkLeftSequence = -1 * 1903502071;
		this.walkRightSequence = -1 * 363085671;
		this.runSequence = -1 * -452785299;
		this.runBackSequence = -1 * -812989361;
		this.runLeftSequence = -1 * -816921381;
		this.runRightSequence = -1 * 1183297019;
		this.crawlSequence = -1 * 432549399;
		this.crawlBackSequence = -1 * -732350005;
		this.crawlLeftSequence = -1 * 957334845;
		this.crawlRightSequence = -1 * 987737355;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1 * 1002589887;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false;
		this.headIconArchiveIds = null;
		this.headIconSpriteIndexes = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1082041138"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "1733428721"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "1323696648"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort() * -1715570245;
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort() * 597536279;
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort() * -1543559101;
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort() * 531240293;
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort() * 597536279;
			this.walkBackSequence = var1.readUnsignedShort() * -2105973293;
			this.walkLeftSequence = var1.readUnsignedShort() * 1903502071;
			this.walkRightSequence = var1.readUnsignedShort() * 363085671;
		} else if (var2 == 18) {
			var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field1568 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1568[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.readUnsignedShort() * 1002589887;
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * 5;
		} else {
			int var5;
			if (var2 == 102) {
				var3 = var1.readUnsignedByte();
				var4 = 0;

				for (var5 = var3; var5 != 0; var5 >>= 1) {
					++var4;
				}

				this.headIconArchiveIds = new int[var4];
				this.headIconSpriteIndexes = new short[var4];

				for (int var6 = 0; var6 < var4; ++var6) {
					if ((var3 & 1 << var6) == 0) {
						this.headIconArchiveIds[var6] = -1;
						this.headIconSpriteIndexes[var6] = -1;
					} else {
						this.headIconArchiveIds[var6] = var1.method2518();
						this.headIconSpriteIndexes[var6] = (short)var1.method2515();
					}
				}
			} else if (var2 == 103) {
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.isInteractable = false;
				} else if (var2 == 109) {
					this.isClickable = false;
				} else if (var2 == 111) {
					this.isFollower = true;
				} else if (var2 == 114) {
					this.runSequence = var1.readUnsignedShort() * -452785299;
				} else if (var2 == 115) {
					this.runSequence = var1.readUnsignedShort() * -452785299;
					this.runBackSequence = var1.readUnsignedShort() * -812989361;
					this.runLeftSequence = var1.readUnsignedShort() * -816921381;
					this.runRightSequence = var1.readUnsignedShort() * 1183297019;
				} else if (var2 == 116) {
					this.crawlSequence = var1.readUnsignedShort() * 432549399;
				} else if (var2 == 117) {
					this.crawlSequence = var1.readUnsignedShort() * 432549399;
					this.crawlBackSequence = var1.readUnsignedShort() * -732350005;
					this.crawlLeftSequence = var1.readUnsignedShort() * 957334845;
					this.crawlRightSequence = var1.readUnsignedShort() * 987737355;
				} else if (var2 == 249) {
					this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort();
				if (this.transformVarbit == 65535) {
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort();
				if (this.transformVarp == 65535) {
					this.transformVarp = -1;
				}

				var3 = -1;
				if (var2 == 118) {
					var3 = var1.readUnsignedShort();
					if (var3 == 65535) {
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte();
				this.transforms = new int[var4 + 2];

				for (var5 = 0; var5 <= var4; ++var5) {
					this.transforms[var5] = var1.readUnsignedShort();
					if (this.transforms[var5] == 65535) {
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3;
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhy;ILhy;ILhs;I)Ljd;",
		garbageValue = "-1881429894"
	)
	public final Model method971(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NewShit var5) {
		if (this.transforms != null) {
			NPCComposition var6 = this.transform();
			return var6 == null ? null : var6.method971(var1, var2, var3, var4, var5);
		} else {
			long var10 = (long)this.field_12;
			if (var5 != null) {
				var10 |= var5.field1555 << 16;
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var10);
			if (var8 == null) {
				ModelData var9 = this.method973(this.models, var5);
				if (var9 == null) {
					return null;
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var8, var10);
			}

			Model var12;
			if (var1 != null && var3 != null) {
				var12 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) {
				var12 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) {
				var12 = var3.transformActorModel(var8, var4);
			} else {
				var12 = var8.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var12.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var12;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)Lit;",
		garbageValue = "-1677969026"
	)
	public final ModelData method972(NewShit var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method972(var1);
		} else {
			return this.method973(this.field1568, var1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([ILhs;I)Lit;",
		garbageValue = "1176130796"
	)
	ModelData method973(int[] var1, NewShit var2) {
		int[] var3 = var1;
		if (var2 != null && var2.field1551 != null) {
			var3 = var2.field1551;
		}

		if (var3 == null) {
			return null;
		} else {
			boolean var4 = false;

			for (int var5 = 0; var5 < var3.length; ++var5) {
				if (var3[var5] != -1 && !field1559.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field1559, var3[var6], 0);
				}

				ModelData var10;
				if (var9.length == 1) {
					var10 = var9[0];
					if (var10 == null) {
						var10 = new ModelData(var9, var9.length);
					}
				} else {
					var10 = new ModelData(var9, var9.length);
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) {
					var7 = this.recolorTo;
					if (var2 != null && var2.field1553 != null) {
						var7 = var2.field1553;
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) {
						var10.recolor(this.recolorFrom[var8], var7[var8]);
					}
				}

				if (this.retextureFrom != null) {
					var7 = this.retextureTo;
					if (var2 != null && var2.field1552 != null) {
						var7 = var2.field1552;
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) {
						var10.retexture(this.retextureFrom[var8], var7[var8]);
					}
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lhd;",
		garbageValue = "-5"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class343.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Bounds.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class343.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1524676663"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1456645230"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class165.method854(this.params, var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-94"
	)
	public boolean method978() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndexes != null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1005789568"
	)
	public int[] method979() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "112"
	)
	public int method980(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1843796190"
	)
	public short[] method981() {
		return this.headIconSpriteIndexes;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "-119"
	)
	public short method982(int var1) {
		return this.headIconSpriteIndexes != null && var1 < this.headIconSpriteIndexes.length ? this.headIconSpriteIndexes[var1] : -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1813068627"
	)
	public static void method970() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3472 != 0) {
				ArchiveDiskActionHandler.field3472 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "145747520"
	)
	static int method983(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		Messages.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == 1202) {
				var3.modelType = 3;
				var3.modelId = Projectile.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				GraphicsObject.method417(var3, Projectile.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3.field3058 == null) {
					throw new RuntimeException("");
				} else {
					ItemComposition.method1064(var3, var4);
					return 1;
				}
			} else if (var0 == 1209) {
				Interpreter.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var3.field3058 == null) {
					throw new RuntimeException("");
				} else {
					class199.method1002(var3, var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3.field3058 == null) {
					throw new RuntimeException("");
				} else {
					MusicPatchPcmStream.method1691(var3, Projectile.localPlayer.appearance.field2875, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class300.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == 1205) {
				var3.itemQuantityMode = 0;
			} else if (var0 == 1212 | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.modelRotation > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.modelRotation;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1472718013"
	)
	static int method984(int var0, Script var1, boolean var2) {
		int var3;
		int var5;
		int var7;
		Object var21;
		class494 var22;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var4;
				int var6;
				if (var0 == 7502) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					var6 = class152.method782(var4);
					var7 = class481.method2418(var4);
					int var8 = class280.method1583(var4);
					DbRowType var23 = class473.getDbRowType(var3);
					DbTableType var24 = class152.getDbTableType(var6);
					int[] var25 = var24.types[var7];
					int var12 = 0;
					int var13 = var25.length;
					if (var8 >= 0) {
						if (var8 >= var13) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
						}

						var12 = var8;
						var13 = var8 + 1;
					}

					Object[] var14 = var23.getColumnType(var7);
					if (var14 == null && var24.defaultValues != null) {
						var14 = var24.defaultValues[var7];
					}

					int var15;
					int var16;
					if (var14 == null) {
						for (var15 = var12; var15 < var13; ++var15) {
							var16 = var25[var15];
							class490 var19 = WorldMapRectangle.method1529(var16);
							if (var19 == class490.field4042) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.method2434(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var25.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var25.length * var5;
								class490 var18 = WorldMapRectangle.method1529(var25[var16]);
								if (var18 == class490.field4042) {
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = 0;
					var6 = class152.method782(var4);
					var7 = class481.method2418(var4);
					DbRowType var26 = class473.getDbRowType(var3);
					DbTableType var9 = class152.getDbTableType(var6);
					int[] var10 = var9.types[var7];
					Object[] var11 = var26.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != 7504 && var0 != 7510) {
					if (var0 == 7505) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						DbRowType var28 = class473.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var28.tableId;
						return 1;
					} else if (var0 == 7506) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = -1;
						if (class158.field1387 != null && var3 >= 0 && var3 < class158.field1387.size()) {
							var4 = (Integer)class158.field1387.get(var3);
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
						return 1;
					} else if (var0 != 7507 && var0 != 7509) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var21 = class4.method8(var3);
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var22 = class53.method285(var5);
						if (var22 == null) {
							throw new RuntimeException();
						} else if (class152.method782(var5) != Client.field548) {
							throw new RuntimeException();
						} else if (class158.field1387 == null && class158.field1387.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class280.method1583(var5);
							List var20 = var22.method2462(var21, var7);
							class158.field1387 = new LinkedList(class158.field1387);
							if (var20 != null) {
								class158.field1387.retainAll(var20);
							} else {
								class158.field1387.clear();
							}

							class218.field1909 = class158.field1387.iterator();
							if (var0 == 7507) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class158.field1387.size();
							}

							return 1;
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					class494 var27 = class143.method755(var3);
					if (var27 == null) {
						throw new RuntimeException();
					} else {
						class158.field1387 = var27.method2462(0, 0);
						var5 = 0;
						if (class158.field1387 != null) {
							Client.field548 = var3;
							class218.field1909 = class158.field1387.iterator();
							var5 = class158.field1387.size();
						}

						if (var0 == 7504) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (class218.field1909 != null && class218.field1909.hasNext()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)class218.field1909.next();
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var21 = class4.method8(var3);
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var22 = class53.method285(var5);
			if (var22 == null) {
				throw new RuntimeException();
			} else {
				var7 = class280.method1583(var5);
				class158.field1387 = var22.method2462(var21, var7);
				if (class158.field1387 != null) {
					Client.field548 = class152.method782(var5);
					class218.field1909 = class158.field1387.iterator();
					if (var0 == 7500) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class158.field1387.size();
					}
				} else {
					Client.field548 = -1;
					class218.field1909 = null;
					if (var0 == 7500) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}
