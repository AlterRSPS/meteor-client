import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("as")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("ap")
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("az")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1324290995"
	)
	public static String method901(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var3 = var0[var1];
			return var3 == null ? "null" : var3.toString();
		} else {
			int var8 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var8; ++var5) {
				CharSequence var6 = var0[var5];
				if (var6 == null) {
					var4 += 4;
				} else {
					var4 += var6.length();
				}
			}

			StringBuilder var9 = new StringBuilder(var4);

			for (int var10 = var1; var10 < var8; ++var10) {
				CharSequence var7 = var0[var10];
				if (var7 == null) {
					var9.append("null");
				} else {
					var9.append(var7);
				}
			}

			return var9.toString();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "53"
	)
	public static boolean method900(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CLoj;I)I",
		garbageValue = "1972392533"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-158956344"
	)
	static final int method902(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lmb;IIII)V",
		garbageValue = "670377109"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3003 == null) {
			throw new RuntimeException();
		} else {
			var0.field3003[var1] = var2;
			var0.field3004[var1] = var3;
		}
	}
}
