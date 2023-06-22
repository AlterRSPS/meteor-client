import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("as")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	// $FF: renamed from: x int
	@ObfuscatedName("at")
	@Export("x")
	int field_50;
	// $FF: renamed from: y int
	@ObfuscatedName("an")
	@Export("y")
	int field_51;
	// $FF: renamed from: z int
	@ObfuscatedName("av")
	@Export("z")
	int field_52;

	FaceNormal() {
		super();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1944292281"
	)
	static int method1292(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		FloorOverlayDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var3 = new FloorOverlayDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4), var0);
			}

			var3.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		if (var2 == null) {
			return var1;
		} else {
			int var5;
			if (var2.secondaryRgb >= 0) {
				var5 = var2.secondaryHue;
				int var6 = var2.secondarySaturation;
				int var7 = var2.secondaryLightness;
				if (var7 > 179) {
					var6 /= 2;
				}

				if (var7 > 192) {
					var6 /= 2;
				}

				if (var7 > 217) {
					var6 /= 2;
				}

				if (var7 > 243) {
					var6 /= 2;
				}

				int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10);
				int var9 = SecureRandomCallable.method444(var8, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216;
			} else {
				int var10;
				if (var2.texture >= 0) {
					var10 = SecureRandomCallable.method444(Rasterizer3D.field2014.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
					return Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
				} else if (var2.primaryRgb == 16711935) {
					return var1;
				} else {
					var10 = Occluder.method1297(var2.hue, var2.saturation, var2.lightness);
					var5 = SecureRandomCallable.method444(var10, 96);
					return Rasterizer3D.Rasterizer3D_colorPalette[var5] | -16777216;
				}
			}
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lhy;IIII)V",
		garbageValue = "-680386934"
	)
	static void method1293(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class10.clientPreferences.getAreaSoundEffectsVolume() != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				ClientPreferences.method552(var0.soundEffects[var1], var2, var3);
			}
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1206794042"
	)
	static boolean method1294(int var0) {
		for (int var1 = 0; var1 < Client.field533; ++var1) {
			if (Client.field580[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
