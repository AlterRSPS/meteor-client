import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("ak")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	// $FF: renamed from: id int
	@ObfuscatedName("ad")
	@Export("id")
	int field_14;
	@ObfuscatedName("ac")
	@Export("model")
	int model;
	@ObfuscatedName("ag")
	@Export("name")
	public String name;
	@ObfuscatedName("ar")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ah")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("az")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("au")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ai")
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("aq")
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("aw")
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ay")
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("al")
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("am")
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bj")
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bo")
	@Export("price")
	public int price;
	@ObfuscatedName("bq")
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bg")
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bf")
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bd")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ba")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bn")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bx")
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("be")
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bh")
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bp")
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bw")
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bi")
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bk")
	int field1747;
	@ObfuscatedName("bv")
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bz")
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bm")
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("br")
	int field1750;
	@ObfuscatedName("bu")
	int field1751;
	@ObfuscatedName("by")
	int field1755;
	@ObfuscatedName("bt")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bl")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cs")
	@Export("note")
	public int note;
	@ObfuscatedName("cu")
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ca")
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cf")
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cw")
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("ch")
	public int field1780;
	@ObfuscatedName("cp")
	public int field1782;
	@ObfuscatedName("cy")
	@Export("team")
	public int team;
	@ObfuscatedName("cd")
	public int field1779;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cr")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cm")
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cg")
	@Export("notedId")
	int notedId;
	@ObfuscatedName("ci")
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cb")
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		super();
		this.name = "null";
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.offsetX2d = 0;
		this.offsetY2d = 0;
		this.isStackable = 0;
		this.price = 1;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleModel2 = -1;
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
		this.inventoryActions = new String[]{null, null, null, null, "Drop"};
		this.shiftClickIndex = -288132965 * -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field1747 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field1750 = -1;
		this.field1751 = -1;
		this.field1755 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.field1780 = 0;
		this.field1782 = 0;
		this.team = 0;
		this.field1779 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1088110524"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field1779 = 0;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-1883529616"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-1157807618"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) {
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.readInt();
		} else if (var2 == 13) {
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) {
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.maleHeadModel = var1.readUnsignedShort();
			this.field1747 = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) {
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
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
			} else if (var2 == 42) {
				this.shiftClickIndex = var1.readByte() * -288132965;
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 75) {
				this.field1779 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field1751 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field1750 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field1755 = var1.readUnsignedShort();
			} else if (var2 == 94) {
				var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort();
				this.countco[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) {
				this.field1780 = var1.readByte();
			} else if (var2 == 114) {
				this.field1782 = var1.readByte() * 5;
			} else if (var2 == 115) {
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) {
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lhz;I)V",
		garbageValue = "-1489726495"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lhz;B)V",
		garbageValue = "-42"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var2.recolorFrom;
		this.recolorTo = var2.recolorTo;
		this.retextureFrom = var2.retextureFrom;
		this.retextureTo = var2.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.isStackable = var2.isStackable;
		this.maleModel = var2.maleModel;
		this.maleModel1 = var2.maleModel1;
		this.maleModel2 = var2.maleModel2;
		this.femaleModel = var2.femaleModel;
		this.femaleModel1 = var2.femaleModel1;
		this.femaleModel2 = var2.femaleModel2;
		this.maleHeadModel = var2.maleHeadModel;
		this.maleHeadModel2 = var2.maleHeadModel2;
		this.femaleHeadModel = var2.femaleHeadModel;
		this.femaleHeadModel2 = var2.femaleHeadModel2;
		this.field1750 = var2.field1750;
		this.field1751 = var2.field1751;
		this.field1755 = var2.field1755;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field1779 = var2.field1779;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lhz;B)V",
		garbageValue = "10"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.isStackable = var1.isStackable;
		this.name = var2.name;
		this.price = 0;
		this.isMembersOnly = false;
		this.isTradable = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "-1399505255"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return class300.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljd;",
		garbageValue = "124"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return class300.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.field_14);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
			if (var6 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				var5 = var6.toModel(this.field1780 + 64, this.field1782 + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.field_14);
				return var5;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "558658619"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return class300.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-502224885"
	)
	public final boolean method1055(int var1) {
		int var2 = this.femaleModel;
		int var3 = this.femaleModel1;
		int var4 = this.femaleModel2;
		if (var1 == 1) {
			var2 = this.maleHeadModel;
			var3 = this.maleHeadModel2;
			var4 = this.femaleHeadModel;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "929872247"
	)
	public final ModelData method1056(int var1) {
		int var2 = this.femaleModel;
		int var3 = this.femaleModel1;
		int var4 = this.femaleModel2;
		if (var1 == 1) {
			var2 = this.maleHeadModel;
			var3 = this.maleHeadModel2;
			var4 = this.femaleHeadModel;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
					ModelData[] var8 = new ModelData[]{var5, var6, var7};
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6};
					var5 = new ModelData(var10, 2);
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field1747 != 0) {
				var5.changeOffset(0, this.field1747, 0);
			}

			int var9;
			if (this.recolorFrom != null) {
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
				}
			}

			if (this.retextureFrom != null) {
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1160105256"
	)
	public final boolean method1057(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field1750;
		if (var1 == 1) {
			var2 = this.field1751;
			var3 = this.field1755;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "-1685406318"
	)
	public final ModelData method1058(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field1750;
		if (var1 == 1) {
			var2 = this.field1751;
			var3 = this.field1755;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				ModelData[] var6 = new ModelData[]{var4, var5};
				var4 = new ModelData(var6, 2);
			}

			int var7;
			if (this.recolorFrom != null) {
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
				}
			}

			if (this.retextureFrom != null) {
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-16"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1157691"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class165.method854(this.params, var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-18695"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex * -2053704301 != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex * -2053704301 >= 0) {
				return this.inventoryActions[this.shiftClickIndex * -2053704301] != null ? this.shiftClickIndex * -2053704301 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	@Export("hasRecolor")
	boolean hasRecolor() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-502325863"
	)
	@Export("hasRetexture")
	boolean hasRetexture() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-16"
	)
	public static void method1043(String var0, String var1, int var2, int var3) throws IOException {
		JagexCache.idxCount = var3;
		class496.cacheGamebuild = var2;

		try {
			class452.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var31) {
			class452.operatingSystemName = "Unknown";
		}

		class127.formattedOperatingSystemName = class452.operatingSystemName.toLowerCase();

		try {
			class148.userHomeDirectory = System.getProperty("user.home");
			if (class148.userHomeDirectory != null) {
				class148.userHomeDirectory = class148.userHomeDirectory + "/";
			}
		} catch (Exception var30) {
		}

		try {
			if (class127.formattedOperatingSystemName.startsWith("win")) {
				if (class148.userHomeDirectory == null) {
					class148.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class148.userHomeDirectory == null) {
				class148.userHomeDirectory = System.getenv("HOME");
			}

			if (class148.userHomeDirectory != null) {
				class148.userHomeDirectory = class148.userHomeDirectory + "/";
			}
		} catch (Exception var29) {
		}

		if (class148.userHomeDirectory == null) {
			class148.userHomeDirectory = "~/";
		}

		StructComposition.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class148.userHomeDirectory, "/tmp/", ""};
		KeyHandler.cacheSubPaths = new String[]{".jagex_cache_" + class496.cacheGamebuild, ".file_store_" + class496.cacheGamebuild};
		int var18 = 0;

		File var5;
		label261:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			JagexCache.JagexCache_locationFile = new File(class148.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			Buffer var11;
			File var39;
			if (JagexCache.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

					int var12;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) {
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset);
						if (var12 == -1) {
							throw new IOException();
						}
					}

					var11.offset = 0;
					var12 = var11.readUnsignedByte();
					if (var12 < 1 || var12 > 3) {
						throw new IOException("" + var12);
					}

					int var13 = 0;
					if (var12 > 1) {
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) {
						var7 = var11.readStringCp1252NullCircumfixed();
						if (var13 == 1) {
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8();
						if (var13 == 1) {
							var8 = var11.readCESU8();
						}
					}

					var10.close();
				} catch (IOException var34) {
					var34.printStackTrace();
				}

				if (var7 != null) {
					var39 = new File(var7);
					if (!var39.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var39 = new File(var7, "test.dat");
					if (!ArchiveLoader.method447(var39, true)) {
						var7 = null;
					}
				}
			}

			if (var7 == null && var18 == 0) {
				label235:
				for (int var19 = 0; var19 < KeyHandler.cacheSubPaths.length; ++var19) {
					for (int var20 = 0; var20 < StructComposition.cacheParentPaths.length; ++var20) {
						File var21 = new File(StructComposition.cacheParentPaths[var20] + KeyHandler.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar);
						if (var21.exists() && ArchiveLoader.method447(new File(var21, "test.dat"), true)) {
							var7 = var21.toString();
							var9 = true;
							break label235;
						}
					}
				}
			}

			if (var7 == null) {
				var7 = class148.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			File var38;
			if (var8 != null) {
				var38 = new File(var8);
				var39 = new File(var7);

				try {
					File[] var41 = var38.listFiles();
					File[] var22 = var41;

					for (int var14 = 0; var14 < var22.length; ++var14) {
						File var15 = var22[var14];
						File var16 = new File(var39, var15.getName());
						boolean var17 = var15.renameTo(var16);
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var33) {
					var33.printStackTrace();
				}

				var9 = true;
			}

			if (var9) {
				var38 = new File(var7);
				var11 = null;

				try {
					AccessFile var42 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
					Buffer var43 = new Buffer(500);
					var43.writeByte(3);
					var43.writeByte(var11 != null ? 1 : 0);
					var43.writeCESU8(var38.getPath());
					if (var11 != null) {
						var43.writeCESU8("");
					}

					var42.write(var43.array, 0, var43.offset);
					var42.close();
				} catch (IOException var28) {
					var28.printStackTrace();
				}
			}

			var5 = new File(var7);
			class388.cacheDir = var5;
			if (!class388.cacheDir.exists()) {
				class388.cacheDir.mkdirs();
			}

			File[] var35 = class388.cacheDir.listFiles();
			if (var35 != null) {
				File[] var40 = var35;

				for (int var23 = 0; var23 < var40.length; ++var23) {
					File var24 = var40[var23];
					if (!ArchiveLoader.method447(var24, false)) {
						++var18;
						continue label261;
					}
				}
			}
			break;
		}

		File var4 = class388.cacheDir;
		FileSystem.FileSystem_cacheDir = var4;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;

			try {
				var5 = new File(class148.userHomeDirectory, "random.dat");
				int var26;
				if (var5.exists()) {
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
				} else {
					label186:
					for (int var25 = 0; var25 < KeyHandler.cacheSubPaths.length; ++var25) {
						for (var26 = 0; var26 < StructComposition.cacheParentPaths.length; ++var26) {
							File var37 = new File(StructComposition.cacheParentPaths[var26] + KeyHandler.cacheSubPaths[var25] + File.separatorChar + "random.dat");
							if (var37.exists()) {
								JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var37, "rw", 25L), 24, 0);
								break label186;
							}
						}
					}
				}

				if (JagexCache.JagexCache_randomDat == null) {
					RandomAccessFile var36 = new RandomAccessFile(var5, "rw");
					var26 = var36.read();
					var36.seek(0L);
					var36.write(var26);
					var36.seek(0L);
					var36.close();
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
				}
			} catch (IOException var32) {
			}

			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(UserComparator6.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(UserComparator6.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			WorldMapSection0.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];

			for (int var27 = 0; var27 < JagexCache.idxCount; ++var27) {
				WorldMapSection0.JagexCache_idxFiles[var27] = new BufferedFile(new AccessFile(UserComparator6.getFile("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIS)V",
		garbageValue = "17315"
	)
	public static void method1042(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method1042(var0, var1, var2, var5 - 1);
			method1042(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1406131464"
	)
	static boolean method1048(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "454708286"
	)
	static final void method1046() {
		ParamComposition.method1010("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmb;II)V",
		garbageValue = "903722802"
	)
	public static void method1064(Widget var0, int var1) {
		ItemComposition var2 = class300.ItemDefinition_get(var1);
		var0.field3058.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3058.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3058.equipment[var2.maleModel2] = 0;
		}

		var0.field3058.method1728();
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)Z",
		garbageValue = "20"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = ClanChannelMember.method758(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}
}
