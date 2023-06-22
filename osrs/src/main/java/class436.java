import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public class class436 {
	@ObfuscatedName("at")
	float field3802;
	@ObfuscatedName("an")
	float field3801;
	@ObfuscatedName("av")
	float field3803;

	static {
		new class436(0.0F, 0.0F, 0.0F);
		new class436(1.0F, 1.0F, 1.0F);
		new class436(1.0F, 0.0F, 0.0F);
		new class436(0.0F, 1.0F, 0.0F);
		new class436(0.0F, 0.0F, 1.0F);
		AbstractSocket.method2213(100);
	}

	class436(float var1, float var2, float var3) {
		super();
		this.field3802 = var1;
		this.field3801 = var2;
		this.field3803 = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "55"
	)
	final float method2251() {
		return (float)Math.sqrt((double)(this.field3801 * this.field3801 + this.field3802 * this.field3802 + this.field3803 * this.field3803));
	}

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		return this.field3802 + ", " + this.field3801 + ", " + this.field3803;
	}
}
