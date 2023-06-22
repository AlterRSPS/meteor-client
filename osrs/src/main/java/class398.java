import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public class class398 {
	@ObfuscatedName("at")
	int field3665;
	@ObfuscatedName("an")
	int field3663;
	@ObfuscatedName("av")
	int field3666;
	@ObfuscatedName("as")
	int field3664;

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field3665).length();
		int var3 = 10 - Integer.toString(this.field3666).length();
		int var4 = 10 - Integer.toString(this.field3663).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field3665 + var5 + "Created: " + this.field3663 + var7 + "Total used: " + this.field3666 + var6 + "Max-In-Use: " + this.field3664;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2116295117"
	)
	public static int method2106(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}
}
