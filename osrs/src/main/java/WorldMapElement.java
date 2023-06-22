import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lht;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("ax")
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ap")
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ab")
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ak")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	public int field1497;
	@ObfuscatedName("af")
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("aa")
	public boolean field1493;
	@ObfuscatedName("aj")
	public boolean field1494;
	@ObfuscatedName("ad")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ac")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ag")
	int[] field1491;
	@ObfuscatedName("ar")
	int field1488;
	@ObfuscatedName("ah")
	int field1487;
	@ObfuscatedName("az")
	int field1490;
	@ObfuscatedName("au")
	int field1489;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("horizontalAlignment")
	public class192 horizontalAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("verticalAlignment")
	public class195 verticalAlignment;
	@ObfuscatedName("aw")
	int[] field1492;
	@ObfuscatedName("ay")
	byte[] field1485;
	@ObfuscatedName("al")
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		super();
		this.sprite1 = -1 * -1162693119;
		this.sprite2 = -1 * -1697338597;
		this.textSize = 0;
		this.field1493 = true;
		this.field1494 = false;
		this.menuActions = new String[5];
		this.field1488 = Integer.MAX_VALUE;
		this.field1487 = Integer.MAX_VALUE;
		this.field1490 = Integer.MIN_VALUE;
		this.field1489 = Integer.MIN_VALUE;
		this.horizontalAlignment = class192.field1545;
		this.verticalAlignment = class195.field1605;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "-70"
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
		garbageValue = "1492165512"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method2518() * -1162693119;
		} else if (var2 == 2) {
			this.sprite2 = var1.method2518() * -1697338597;
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1497 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field1493 = false;
				}

				if ((var3 & 2) == 2) {
					this.field1494 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field1491 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field1491[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1492 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1492.length; ++var5) {
					this.field1492[var5] = var1.readInt();
				}

				this.field1485 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field1485[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method2518();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method2518();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					class192[] var6 = new class192[]{class192.field1546, class192.field1547, class192.field1545};
					this.horizontalAlignment = (class192)GameObject.findEnumerated(var6, var1.readUnsignedByte());
				} else if (var2 == 30) {
					class195[] var7 = new class195[]{class195.field1605, class195.field1607, class195.field1606};
					this.verticalAlignment = (class195)GameObject.findEnumerated(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2112078621"
	)
	void method940() {
		if (this.field1491 != null) {
			for (int var1 = 0; var1 < this.field1491.length; var1 += 2) {
				if (this.field1491[var1] < this.field1488) {
					this.field1488 = this.field1491[var1];
				} else if (this.field1491[var1] > this.field1490) {
					this.field1490 = this.field1491[var1];
				}

				if (this.field1491[var1 + 1] < this.field1487) {
					this.field1487 = this.field1491[var1 + 1];
				} else if (this.field1491[var1 + 1] > this.field1489) {
					this.field1489 = this.field1491[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)Ltm;",
		garbageValue = "1127460703"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1 * -961459711;
		return this.getSprite(var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ltm;",
		garbageValue = "1995009325"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class107.SpriteBuffer_getSprite(class410.WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2095862653"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}
}
