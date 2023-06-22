import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public enum class337 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	field3073(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	field3072(1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	field3074(2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	field3070(3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	field3075(4);

	@ObfuscatedName("aa")
	static int field3071;
	@ObfuscatedName("ap")
	final int field3076;

	class337(int var3) {
		this.field3076 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3076;
	}
}
