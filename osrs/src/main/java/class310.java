import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
public class class310 {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("at")
	int field2798;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	class53 field2797;

	@ObfuscatedSignature(
		descriptor = "(ILcu;)V"
	)
	class310(int var1, class53 var2) {
		super();
		this.field2798 = var1;
		this.field2797 = var2;
	}
}
