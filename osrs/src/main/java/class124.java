import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class124 {
	@ObfuscatedName("at")
	int field1181;
	@ObfuscatedName("an")
	float field1176;
	@ObfuscatedName("av")
	float field1179;
	@ObfuscatedName("as")
	float field1178;
	@ObfuscatedName("ax")
	float field1180;
	@ObfuscatedName("ap")
	float field1177;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	class124 field1175;

	class124() {
		super();
		this.field1179 = Float.MAX_VALUE;
		this.field1178 = Float.MAX_VALUE;
		this.field1180 = Float.MAX_VALUE;
		this.field1177 = Float.MAX_VALUE;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IB)V",
		garbageValue = "-12"
	)
	void method674(Buffer var1, int var2) {
		this.field1181 = var1.readShort();
		this.field1176 = var1.method2506();
		this.field1179 = var1.method2506();
		this.field1178 = var1.method2506();
		this.field1180 = var1.method2506();
		this.field1177 = var1.method2506();
	}
}
