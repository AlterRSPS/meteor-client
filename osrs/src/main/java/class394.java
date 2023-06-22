import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class394 {
	@ObfuscatedName("gp")
	static int field3634;
	@ObfuscatedName("at")
	public char field3635;
	@ObfuscatedName("an")
	public int field3636;
	@ObfuscatedName("av")
	public int field3637;

	class394() {
		super();
		this.field3636 = 0;
		this.field3637 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "85"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}
}
