import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rv")
public class class452 {
	@ObfuscatedName("ax")
	static final int[] field3847;
	@ObfuscatedName("ap")
	static final int[] field3846;
	@ObfuscatedName("aq")
	@Export("operatingSystemName")
	static String operatingSystemName;

	static {
		field3847 = new int[16384];
		field3846 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field3847[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field3846[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
