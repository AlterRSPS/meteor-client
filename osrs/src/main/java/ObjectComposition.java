import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("at")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ObjectDefinition_cached")
	public static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ObjectDefinition_cachedEntities")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ObjectDefinition_cachedModels")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lit;"
	)
	static ModelData[] field1689;
	// $FF: renamed from: id int
	@ObfuscatedName("ae")
	@Export("id")
	public int field_13;
	@ObfuscatedName("af")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ao")
	@Export("models")
	int[] models;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ad")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ac")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ag")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ar")
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ah")
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("az")
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("au")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("ai")
	@Export("int1")
	public int int1;
	@ObfuscatedName("aq")
	@Export("clipType")
	int clipType;
	@ObfuscatedName("aw")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("ay")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("al")
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("am")
	@Export("int2")
	public int int2;
	@ObfuscatedName("bs")
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bc")
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bj")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bo")
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("bq")
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("bg")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("bf")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("bd")
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("ba")
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("bn")
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("bb")
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("bx")
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("be")
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("bh")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("bp")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("bw")
	@Export("int3")
	public int int3;
	@ObfuscatedName("bi")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bk")
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bv")
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bz")
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("bm")
	@Export("int7")
	public int int7;
	@ObfuscatedName("br")
	@Export("int5")
	public int int5;
	@ObfuscatedName("bu")
	@Export("int6")
	public int int6;
	@ObfuscatedName("by")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("bt")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false;
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
		field1689 = new ModelData[4];
	}

	ObjectComposition() {
		super();
		this.name = "null";
		this.sizeX = 1;
		this.sizeY = 1;
		this.interactType = 2;
		this.boolean1 = true;
		this.int1 = -1;
		this.clipType = -1;
		this.nonFlatShading = false;
		this.modelClipped = false;
		this.animationId = -1 * -436594675;
		this.int2 = 16;
		this.ambient = 0;
		this.contrast = 0;
		this.actions = new String[5];
		this.mapIconId = -1;
		this.mapSceneId = -1;
		this.isRotated = false;
		this.clipped = true;
		this.modelSizeX = 128;
		this.modelHeight = 128;
		this.modelSizeY = 128;
		this.offsetX = 0;
		this.offsetHeight = 0;
		this.offsetY = 0;
		this.boolean2 = false;
		this.isSolid = false;
		this.int3 = -1;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.ambientSoundId = -1;
		this.int7 = 0;
		this.int5 = 0;
		this.int6 = 0;
		this.boolean3 = true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) {
			this.int1 = 0;
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) {
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) {
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "1428580968"
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
		garbageValue = "-341895746"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 3 * var3;
				} else {
					this.models = new int[var3];
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
						this.models[var4] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 2 * var3;
				} else {
					this.models = null;
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) {
			this.interactType = 0;
			this.boolean1 = false;
		} else if (var2 == 18) {
			this.boolean1 = false;
		} else if (var2 == 19) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) {
			this.nonFlatShading = true;
		} else if (var2 == 23) {
			this.modelClipped = true;
		} else if (var2 == 24) {
			this.animationId = var1.readUnsignedShort() * -436594675;
			if (this.animationId * -1100220731 == 65535) {
				this.animationId = -1 * -436594675;
			}
		} else if (var2 == 27) {
			this.interactType = 1;
		} else if (var2 == 28) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) {
			this.ambient = var1.readByte();
		} else if (var2 == 39) {
			this.contrast = var1.readByte() * 25;
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
		} else if (var2 == 61) {
			var1.readUnsignedShort();
		} else if (var2 == 62) {
			this.isRotated = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) {
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) {
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) {
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) {
			var1.readUnsignedByte();
		} else if (var2 == 70) {
			this.offsetX = var1.readShort();
		} else if (var2 == 71) {
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort();
		} else if (var2 == 73) {
			this.boolean2 = true;
		} else if (var2 == 74) {
			this.isSolid = true;
		} else if (var2 == 75) {
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.ambientSoundId = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte();
			} else if (var2 == 79) {
				this.int5 = var1.readUnsignedShort();
				this.int6 = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte();
				var3 = var1.readUnsignedByte();
				this.soundEffectIds = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) {
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) {
				this.boolean3 = false;
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
			if (var2 == 92) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-49"
	)
	public final boolean method1032(int var1) {
		if (this.models != null) {
			for (int var4 = 0; var4 < this.models.length; ++var4) {
				if (this.models[var4] == var1) {
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true;
		} else if (this.modelIds == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) {
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0);
			}

			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "119"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0);
			}

			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lim;",
		garbageValue = "1775636691"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.field_13 << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.field_13 << 10));
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			if (!this.nonFlatShading) {
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64);
				var10.contrast = (short)(this.contrast + 768);
				var10.calculateVertexNormals();
				var9 = var10;
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
		}

		if (this.nonFlatShading) {
			var9 = ((ModelData)var9).copyModelData();
		}

		if (this.clipType >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method1158(var3, var4, var5, var6, true, this.clipType);
			}
		}

		return (Renderable)var9;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Ljd;",
		garbageValue = "1744989838"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.field_13 << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.field_13 << 10));
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var9, var7);
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType);
		}

		return var9;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILhy;IB)Ljd;",
		garbageValue = "-10"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) {
			var9 = (long)(var2 + (this.field_13 << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.field_13 << 10));
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9);
		if (var11 == null) {
			ModelData var12 = this.getModelData(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var11, var9);
		}

		if (var7 == null && this.clipType == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType >= 0) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lit;",
		garbageValue = "-1913327230"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null;
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.modelIds == null) {
				return null;
			}

			var4 = this.isRotated;
			if (var1 == 2 && var2 > 3) {
				var4 = !var4;
			}

			var5 = this.modelIds.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				var7 = this.modelIds[var6];
				if (var4) {
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7);
				if (var3 == null) {
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0);
					if (var3 == null) {
						return null;
					}

					if (var4) {
						var3.method1167();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7);
				}

				if (var5 > 1) {
					field1689[var6] = var3;
				}
			}

			if (var5 > 1) {
				var3 = new ModelData(field1689, var5);
			}
		} else {
			int var9 = -1;

			for (var5 = 0; var5 < this.models.length; ++var5) {
				if (this.models[var5] == var1) {
					var9 = var5;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var5 = this.modelIds[var9];
			boolean var10 = this.isRotated ^ var2 > 3;
			if (var10) {
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5);
			if (var3 == null) {
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method1167();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5);
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
			var4 = false;
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
			var11 = false;
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true);
		if (var1 == 4 && var2 > 3) {
			var8.method1163(256);
			var8.changeOffset(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var8.method1160();
		} else if (var2 == 2) {
			var8.method1161();
		} else if (var2 == 3) {
			var8.method1162();
		}

		if (this.recolorFrom != null) {
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
			}
		}

		if (this.retextureFrom != null) {
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
			}
		}

		if (var4) {
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) {
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lhx;",
		garbageValue = "-892315242"
	)
	@Export("transform")
	public final ObjectComposition transform() {
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

		return var2 != -1 ? class175.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1117153245"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "153510909"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class165.method854(this.params, var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1773825529"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != -1) {
					ObjectComposition var2 = class175.getObjectDefinition(this.transforms[var1]);
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmr;S)V",
		garbageValue = "1351"
	)
	public static void method1027(class312 var0) {
		class304.field2748.remove(var0);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lli;Ltq;I)Llm;",
		garbageValue = "-2139754397"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.field_58);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lgr;IIS)Lbi;",
		garbageValue = "19542"
	)
	public static final PcmPlayer method1028(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = AbstractUserComparator.pcmPlayerProvider.player();
				var3.samples = new int[(class347.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field194 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (class260.field2373 > 0 && class382.soundSystem == null) {
					class382.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class382.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class382.soundSystem != null) {
					if (class382.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					class382.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
