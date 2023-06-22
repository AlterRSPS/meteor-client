import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class101 {
	@ObfuscatedName("jw")
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("at")
	int field1076;
	@ObfuscatedName("an")
	int field1074;
	@ObfuscatedName("av")
	int field1077;
	@ObfuscatedName("as")
	int field1075;

	class101(int var1, int var2, int var3, int var4) {
		super();
		this.field1076 = var1;
		this.field1074 = var2;
		this.field1077 = var3;
		this.field1075 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1658985569"
	)
	int method583() {
		return this.field1076;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-9232805"
	)
	int method584() {
		return this.field1074;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-880543502"
	)
	int method585() {
		return this.field1077;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "22"
	)
	int method586() {
		return this.field1075;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1592485699"
	)
	static int method587(int var0) {
		return var0 * 3 + 600;
	}
}
