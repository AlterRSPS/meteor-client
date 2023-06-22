import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fm")
	public static String field3269;
	@ObfuscatedName("ke")
	public static String field3378;
	@ObfuscatedName("kp")
	public static String field3388;
	@ObfuscatedName("kk")
	public static String field3383;

	static {
		field3269 = "Please visit the support page for assistance.";
		field3378 = "";
		field3388 = "Page has opened in the browser.";
		field3383 = "";
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-74"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
