import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("at")
	@Export("width")
	int width;
	@ObfuscatedName("an")
	@Export("height")
	int height;
	// $FF: renamed from: x int
	@ObfuscatedName("av")
	@Export("x")
	int field_56;
	// $FF: renamed from: y int
	@ObfuscatedName("as")
	@Export("y")
	int field_57;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lje;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		super();
		this.this$0 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lsw;",
		garbageValue = "1075897911"
	)
	public static class490 method1529(int var0) {
		int var1 = class488.field4038[var0];
		if (var1 == 1) {
			return class490.field4041;
		} else if (var1 == 2) {
			return class490.field4042;
		} else {
			return var1 == 3 ? class490.field4040 : null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Ljava/lang/String;Ljava/lang/String;I)[Ltj;",
		garbageValue = "-2037926568"
	)
	public static IndexedSprite[] method1530(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			byte[] var7 = var0.takeFile(var3, var4);
			boolean var6;
			if (var7 == null) {
				var6 = false;
			} else {
				UserComparator2.SpriteBuffer_decode(var7);
				var6 = true;
			}

			IndexedSprite[] var5;
			if (!var6) {
				var5 = null;
			} else {
				IndexedSprite[] var8 = new IndexedSprite[class515.SpriteBuffer_spriteCount];

				for (int var9 = 0; var9 < class515.SpriteBuffer_spriteCount; ++var9) {
					IndexedSprite var10 = var8[var9] = new IndexedSprite();
					var10.width = class330.SpriteBuffer_spriteWidth;
					var10.height = class489.SpriteBuffer_spriteHeight;
					var10.xOffset = class515.SpriteBuffer_xOffsets[var9];
					var10.yOffset = class402.SpriteBuffer_yOffsets[var9];
					var10.subWidth = class515.SpriteBuffer_spriteWidths[var9];
					var10.subHeight = class515.SpriteBuffer_spriteHeights[var9];
					var10.palette = class515.SpriteBuffer_spritePalette;
					var10.pixels = class515.SpriteBuffer_pixels[var9];
				}

				TextureProvider.method1309();
				var5 = var8;
			}

			return var5;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Ljava/lang/String;Ljava/lang/String;B)Ltj;",
		garbageValue = "115"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			byte[] var7 = var0.takeFile(var3, var4);
			boolean var6;
			if (var7 == null) {
				var6 = false;
			} else {
				UserComparator2.SpriteBuffer_decode(var7);
				var6 = true;
			}

			IndexedSprite var5;
			if (!var6) {
				var5 = null;
			} else {
				IndexedSprite var8 = new IndexedSprite();
				var8.width = class330.SpriteBuffer_spriteWidth;
				var8.height = class489.SpriteBuffer_spriteHeight;
				var8.xOffset = class515.SpriteBuffer_xOffsets[0];
				var8.yOffset = class402.SpriteBuffer_yOffsets[0];
				var8.subWidth = class515.SpriteBuffer_spriteWidths[0];
				var8.subHeight = class515.SpriteBuffer_spriteHeights[0];
				var8.palette = class515.SpriteBuffer_spritePalette;
				var8.pixels = class515.SpriteBuffer_pixels[0];
				TextureProvider.method1309();
				var5 = var8;
			}

			return var5;
		}
	}
}
