import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ud")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("at")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("an")
	public static String field4196;
	@ObfuscatedName("ap")
	String field4197;
	@ObfuscatedName("ab")
	Throwable field4198;
}
