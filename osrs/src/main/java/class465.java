import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class465 extends class467 {
	@ObfuscatedName("at")
	int field3904;
	@ObfuscatedName("an")
	int field3901;
	@ObfuscatedName("av")
	int field3905;
	@ObfuscatedName("as")
	int field3903;
	@ObfuscatedName("ax")
	int field3906;
	@ObfuscatedName("ap")
	int field3902;

	public class465(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field3904 = 0;
		this.field3901 = 0;
		this.field3905 = 0;
		this.field3903 = 0;
		this.field3906 = 0;
		this.field3902 = 0;
		this.field3904 = var1;
		this.field3901 = var2;
		this.field3905 = var3;
		this.field3903 = var4;
		this.field3906 = var5;
		this.field3902 = var6;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1021755450"
	)
	public int vmethod2330() {
		double var1 = this.method2332();
		return (int)Math.round(var1 * (double)(this.field3903 - this.field3904) + (double)this.field3904);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1687418689"
	)
	public int vmethod2329() {
		double var1 = this.method2332();
		return (int)Math.round(var1 * (double)(this.field3906 - this.field3901) + (double)this.field3901);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1779423139"
	)
	public int vmethod2320() {
		double var1 = this.method2332();
		return (int)Math.round((double)this.field3905 + (double)(this.field3902 - this.field3905) * var1);
	}
}
