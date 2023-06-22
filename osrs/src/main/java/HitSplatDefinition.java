import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("uw")
	static int field1664;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public static AbstractArchive field1661;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("aa")
	@Export("fontId")
	int fontId;
	@ObfuscatedName("aj")
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ad")
	public int field1676;
	@ObfuscatedName("ac")
	int field1669;
	@ObfuscatedName("ag")
	int field1670;
	@ObfuscatedName("ar")
	int field1673;
	@ObfuscatedName("ah")
	int field1671;
	@ObfuscatedName("az")
	public int field1682;
	@ObfuscatedName("au")
	public int field1679;
	@ObfuscatedName("ai")
	public int field1677;
	@ObfuscatedName("aq")
	String field1675;
	@ObfuscatedName("aw")
	public int field1680;
	@ObfuscatedName("ay")
	public int field1681;
	@ObfuscatedName("al")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("am")
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bs")
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		super();
		this.fontId = -1;
		this.textColor = 16777215;
		this.field1676 = 70;
		this.field1669 = -1;
		this.field1670 = -1;
		this.field1673 = -1;
		this.field1671 = -1;
		this.field1682 = 0;
		this.field1679 = 0;
		this.field1677 = -1;
		this.field1675 = "";
		this.field1680 = -1;
		this.field1681 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-1923086278"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "1692063671"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method2518();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1669 = var1.method2518();
		} else if (var2 == 4) {
			this.field1673 = var1.method2518();
		} else if (var2 == 5) {
			this.field1670 = var1.method2518();
		} else if (var2 == 6) {
			this.field1671 = var1.method2518();
		} else if (var2 == 7) {
			this.field1682 = var1.readShort();
		} else if (var2 == 8) {
			this.field1675 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1676 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1679 = var1.readShort();
		} else if (var2 == 11) {
			this.field1677 = 0;
		} else if (var2 == 12) {
			this.field1680 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1681 = var1.readShort();
		} else if (var2 == 14) {
			this.field1677 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "1146309729"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
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

		return var2 != -1 ? PlayerComposition.method1717(var2) : null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1477064661"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1675;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + ChatChannel.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "1572311176"
	)
	public SpritePixels method1021() {
		if (this.field1669 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1669);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1661, this.field1669, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1669);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "1971141014"
	)
	public SpritePixels method1022() {
		if (this.field1670 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1670);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1661, this.field1670, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1670);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "-980783206"
	)
	public SpritePixels method1023() {
		if (this.field1673 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1673);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1661, this.field1673, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1673);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "-1515329169"
	)
	public SpritePixels method1024() {
		if (this.field1671 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1671);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1661, this.field1671, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1671);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lph;",
		garbageValue = "1541896410"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Bounds.method2248(field1661, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}
}
