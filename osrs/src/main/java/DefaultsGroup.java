import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static final DefaultsGroup field3783;
	@ObfuscatedName("an")
	@Export("group")
	final int group;

	static {
		field3783 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		super();
		this.group = var1;
	}
}
