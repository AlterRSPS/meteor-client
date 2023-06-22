import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	static final PrivateChatMode field4181;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	public static final PrivateChatMode field4180;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	static final PrivateChatMode field4182;
	// $FF: renamed from: id int
	@ObfuscatedName("as")
	@Export("id")
	public final int field_65;

	static {
		field4181 = new PrivateChatMode(0);
		field4180 = new PrivateChatMode(1);
		field4182 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		super();
		this.field_65 = var1;
	}
}
