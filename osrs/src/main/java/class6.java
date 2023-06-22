import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public enum class6 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	field6(0, 0);

	@ObfuscatedName("an")
	public final int field8;
	@ObfuscatedName("av")
	final int field7;

	class6(int var3, int var4) {
		this.field8 = var3;
		this.field7 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-728527563"
	)
	static void method16() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}
}
