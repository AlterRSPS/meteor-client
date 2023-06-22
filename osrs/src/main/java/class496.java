import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("th")
public class class496 {
	@ObfuscatedName("av")
	static final int field4061;
	@ObfuscatedName("as")
	static final int field4060;
	@ObfuscatedName("ag")
	@Export("cacheGamebuild")
	static int cacheGamebuild;

	static {
		field4061 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field4060 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}
}
