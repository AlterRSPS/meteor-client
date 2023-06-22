import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public enum class127 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1207(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1205(1, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1208(2, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1206(3, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1209(4, 4);

	@ObfuscatedName("ai")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("varclan")
	static class442 varclan;
	@ObfuscatedName("ap")
	final int field1211;
	@ObfuscatedName("ab")
	final int field1210;

	class127(int var3, int var4) {
		this.field1211 = var3;
		this.field1210 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1210;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "266"
	)
	static final void method689(String var0) {
		ParamComposition.method1010(var0 + " is already on your friend list");
	}
}
