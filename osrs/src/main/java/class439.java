import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class439 {
	@ObfuscatedName("at")
	float field3824;
	@ObfuscatedName("an")
	float field3820;
	@ObfuscatedName("av")
	float field3825;
	@ObfuscatedName("as")
	float field3823;
	@ObfuscatedName("ax")
	float field3826;
	@ObfuscatedName("ap")
	float field3822;
	@ObfuscatedName("ab")
	float field3816;
	@ObfuscatedName("ak")
	float field3819;
	@ObfuscatedName("ae")
	float field3817;
	@ObfuscatedName("af")
	float field3818;
	@ObfuscatedName("ao")
	float field3821;
	@ObfuscatedName("aa")
	float field3815;

	static {
		new class439();
	}

	class439() {
		super();
		this.method2274();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1851005339"
	)
	void method2274() {
		this.field3815 = 0.0F;
		this.field3821 = 0.0F;
		this.field3818 = 0.0F;
		this.field3819 = 0.0F;
		this.field3816 = 0.0F;
		this.field3822 = 0.0F;
		this.field3823 = 0.0F;
		this.field3825 = 0.0F;
		this.field3820 = 0.0F;
		this.field3817 = 1.0F;
		this.field3826 = 1.0F;
		this.field3824 = 1.0F;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-16"
	)
	void method2275(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field3820;
		float var5 = this.field3826;
		float var6 = this.field3819;
		float var7 = this.field3821;
		this.field3820 = var2 * var4 - var3 * this.field3825;
		this.field3825 = var4 * var3 + this.field3825 * var2;
		this.field3826 = var5 * var2 - var3 * this.field3822;
		this.field3822 = var5 * var3 + this.field3822 * var2;
		this.field3819 = var2 * var6 - var3 * this.field3817;
		this.field3817 = var2 * this.field3817 + var3 * var6;
		this.field3821 = var2 * var7 - this.field3815 * var3;
		this.field3815 = var2 * this.field3815 + var7 * var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1629816296"
	)
	void method2277(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field3824;
		float var5 = this.field3823;
		float var6 = this.field3816;
		float var7 = this.field3818;
		this.field3824 = var3 * this.field3825 + var2 * var4;
		this.field3825 = this.field3825 * var2 - var4 * var3;
		this.field3823 = var3 * this.field3822 + var2 * var5;
		this.field3822 = this.field3822 * var2 - var3 * var5;
		this.field3816 = var3 * this.field3817 + var2 * var6;
		this.field3817 = var2 * this.field3817 - var6 * var3;
		this.field3818 = var2 * var7 + var3 * this.field3815;
		this.field3815 = this.field3815 * var2 - var3 * var7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1031514623"
	)
	void method2278(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field3824;
		float var5 = this.field3823;
		float var6 = this.field3816;
		float var7 = this.field3818;
		this.field3824 = var4 * var2 - var3 * this.field3820;
		this.field3820 = var3 * var4 + this.field3820 * var2;
		this.field3823 = var5 * var2 - var3 * this.field3826;
		this.field3826 = this.field3826 * var2 + var5 * var3;
		this.field3816 = var6 * var2 - var3 * this.field3819;
		this.field3819 = var2 * this.field3819 + var3 * var6;
		this.field3818 = var2 * var7 - this.field3821 * var3;
		this.field3821 = var2 * this.field3821 + var3 * var7;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1520938784"
	)
	void method2279(float var1, float var2, float var3) {
		this.field3818 += var1;
		this.field3821 += var2;
		this.field3815 += var3;
	}

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		return this.field3824 + "," + this.field3823 + "," + this.field3816 + "," + this.field3818 + "\n" + this.field3820 + "," + this.field3826 + "," + this.field3819 + "," + this.field3821 + "\n" + this.field3825 + "," + this.field3822 + "," + this.field3817 + "," + this.field3815;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "102"
	)
	public static int method2273(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbl;I)V",
		garbageValue = "-1900979009"
	)
	public static final void method2276(class51 var0) {
		AbstractUserComparator.pcmPlayerProvider = var0;
	}
}
