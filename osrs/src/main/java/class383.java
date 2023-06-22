import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oq")
public class class383 {
	@ObfuscatedName("at")
	static char[] field3605;
	@ObfuscatedName("an")
	static char[] field3604;
	@ObfuscatedName("av")
	static char[] field3606;
	@ObfuscatedName("as")
	static int[] field3607;

	static {
		field3605 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3605[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3605[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3605[var0] = (char)(var0 + 48 - 52);
		}

		field3605[62] = '+';
		field3605[63] = '/';
		field3604 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3604[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3604[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3604[var0] = (char)(var0 + 48 - 52);
		}

		field3604[62] = '*';
		field3604[63] = '-';
		field3606 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3606[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3606[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3606[var0] = (char)(var0 + 48 - 52);
		}

		field3606[62] = '-';
		field3606[63] = '_';
		field3607 = new int[128];

		for (var0 = 0; var0 < field3607.length; ++var0) {
			field3607[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3607[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3607[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3607[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3607;
		field3607[43] = 62;
		var2[42] = 62;
		int[] var1 = field3607;
		field3607[47] = 63;
		var1[45] = 63;
	}
}
