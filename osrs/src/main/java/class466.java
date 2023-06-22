import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class466 extends class468 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field3907;
	@ObfuscatedName("at")
	int field3909;
	@ObfuscatedName("an")
	int field3908;

	public class466(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field3909 = 0;
		this.field3908 = 0;
		this.field3909 = var1;
		this.field3908 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-29"
	)
	public int method2327() {
		double var1 = this.method2332();
		return (int)Math.round(var1 * (double)(this.field3908 - this.field3909) + (double)this.field3909);
	}
}
