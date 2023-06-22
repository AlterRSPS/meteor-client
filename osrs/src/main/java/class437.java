import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class class437 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	public static class437[] field3805;
	@ObfuscatedName("an")
	static int field3806;
	@ObfuscatedName("av")
	public static int field3804;
	@ObfuscatedName("as")
	float field3809;
	@ObfuscatedName("ax")
	float field3810;
	@ObfuscatedName("ap")
	float field3808;
	@ObfuscatedName("ab")
	float field3807;

	static {
		field3805 = new class437[0];
		field3806 = 100;
		field3805 = new class437[100];
		field3804 = 0;
		new class437();
	}

	public class437() {
		super();
		this.method2255();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	public void method2252() {
		synchronized(field3805) {
			if (field3804 < field3806 - 1) {
				field3805[++field3804 - 1] = this;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1858320120"
	)
	void method2253(float var1, float var2, float var3, float var4) {
		this.field3809 = var1;
		this.field3810 = var2;
		this.field3808 = var3;
		this.field3807 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFFS)V",
		garbageValue = "19512"
	)
	public void method2254(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F));
		float var6 = (float)Math.cos((double)(var4 * 0.5F));
		this.field3809 = var1 * var5;
		this.field3810 = var2 * var5;
		this.field3808 = var5 * var3;
		this.field3807 = var6;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "978687872"
	)
	public final void method2255() {
		this.field3808 = 0.0F;
		this.field3810 = 0.0F;
		this.field3809 = 0.0F;
		this.field3807 = 1.0F;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqj;I)V",
		garbageValue = "-682588791"
	)
	public final void method2256(class437 var1) {
		this.method2253(var1.field3807 * this.field3809 + var1.field3809 * this.field3807 + this.field3808 * var1.field3810 - var1.field3808 * this.field3810, var1.field3810 * this.field3807 + (var1.field3807 * this.field3810 - var1.field3809 * this.field3808) + var1.field3808 * this.field3809, this.field3807 * var1.field3808 + (this.field3808 * var1.field3807 + this.field3810 * var1.field3809 - this.field3809 * var1.field3810), this.field3807 * var1.field3807 - var1.field3809 * this.field3809 - var1.field3810 * this.field3810 - var1.field3808 * this.field3808);
	}

	@Export("equals")
	@ObfuscatedName("equals")
	public boolean equals(Object var1) {
		if (!(var1 instanceof class437)) {
			return false;
		} else {
			class437 var2 = (class437)var1;
			return var2.field3809 == this.field3809 && var2.field3810 == this.field3810 && var2.field3808 == this.field3808 && this.field3807 == var2.field3807;
		}
	}

	@Export("hashCode")
	@ObfuscatedName("hashCode")
	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field3809 + var2 * 31.0F;
		var2 = 31.0F * var2 + this.field3810;
		var2 = this.field3808 + var2 * 31.0F;
		var2 = var2 * 31.0F + this.field3807;
		return (int)var2;
	}

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		return this.field3809 + "," + this.field3810 + "," + this.field3808 + "," + this.field3807;
	}
}
