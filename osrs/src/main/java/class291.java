import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public class class291 {
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("ki")
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-248616806"
	)
	public static void method1604() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}
}
