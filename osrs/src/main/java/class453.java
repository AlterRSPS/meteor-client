import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public class class453 {
	@ObfuscatedName("aj")
	static final int[] field3849;
	@ObfuscatedName("ad")
	static final int[] field3848;

	static {
		field3849 = new int[2048];
		field3848 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field3849[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field3848[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "17"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (Client.loadInterface(var0)) {
			class210.runComponentCloseListeners(class16.Widget_interfaceComponents[var0], var1);
		}
	}
}
