import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public static AbstractArchive field1522;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("ax")
	public int field1534;
	@ObfuscatedName("ak")
	@Export("int1")
	public int int1;
	@ObfuscatedName("ae")
	@Export("int2")
	public int int2;
	@ObfuscatedName("af")
	@Export("int3")
	public int int3;
	@ObfuscatedName("ao")
	public int field1533;
	@ObfuscatedName("aa")
	@Export("int5")
	public int int5;
	@ObfuscatedName("aj")
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ad")
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ac")
	@Export("width")
	public int width;
	@ObfuscatedName("ag")
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	public HealthBarDefinition() {
		super();
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1533 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "536910502"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-2057188465"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method2518();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method2518();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "-553105347"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1522, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "-235452519"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1522, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnw;",
		garbageValue = "2145594899"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_hardcoreIronman, PlayerType.field3450, PlayerType.field3449, PlayerType.field3451, PlayerType.PlayerType_ironman, PlayerType.field3448, PlayerType.field3452, PlayerType.field3453, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field3457, PlayerType.field3445, PlayerType.PlayerType_normal, PlayerType.field3446, PlayerType.field3447, PlayerType.field3455, PlayerType.PlayerType_jagexModerator};
	}
}
