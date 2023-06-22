import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public final class class438 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	static class438[] field3813;
	@ObfuscatedName("as")
	static int field3812;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	public static final class438 field3811;
	@ObfuscatedName("ax")
	public float[] field3814;

	static {
		field3813 = new class438[0];
		class10.method33(100);
		field3811 = new class438();
	}

	public class438() {
		super();
		this.field3814 = new float[16];
		this.method2261();
	}

	@ObfuscatedSignature(
		descriptor = "(Lqp;)V"
	)
	public class438(class438 var1) {
		super();
		this.field3814 = new float[16];
		this.method2263(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Ltz;Z)V"
	)
	public class438(Buffer var1, boolean var2) {
		super();
		this.field3814 = new float[16];
		this.method2258(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1957373361"
	)
	public void method2257() {
		synchronized(field3813) {
			if (field3812 < UserComparator9.field1169 - 1) {
				field3813[++field3812 - 1] = this;
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;ZI)V",
		garbageValue = "-1884252111"
	)
	void method2258(Buffer var1, boolean var2) {
		if (var2) {
			class439 var3 = new class439();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D);
			var3.method2275(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D);
			var3.method2277(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D);
			var3.method2278(var11);
			var3.method2279((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method2269(var3);
		} else {
			for (int var13 = 0; var13 < 16; ++var13) {
				this.field3814[var13] = var1.method2506();
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "455501097"
	)
	float[] method2259() {
		float[] var1 = new float[3];
		if ((double)this.field3814[2] < 0.999D && (double)this.field3814[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field3814[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field3814[6] / var2, (double)this.field3814[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field3814[1] / var2, (double)this.field3814[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field3814[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field3814[9]), (double)this.field3814[5]);
		}

		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1221709859"
	)
	public float[] method2260() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field3814[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field3814[2];
			var6 = (double)this.field3814[10];
			double var8 = (double)this.field3814[4];
			double var10 = (double)this.field3814[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field3814[1];
			var6 = (double)this.field3814[0];
			if (this.field3814[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1068320526"
	)
	void method2261() {
		this.field3814[0] = 1.0F;
		this.field3814[1] = 0.0F;
		this.field3814[2] = 0.0F;
		this.field3814[3] = 0.0F;
		this.field3814[4] = 0.0F;
		this.field3814[5] = 1.0F;
		this.field3814[6] = 0.0F;
		this.field3814[7] = 0.0F;
		this.field3814[8] = 0.0F;
		this.field3814[9] = 0.0F;
		this.field3814[10] = 1.0F;
		this.field3814[11] = 0.0F;
		this.field3814[12] = 0.0F;
		this.field3814[13] = 0.0F;
		this.field3814[14] = 0.0F;
		this.field3814[15] = 1.0F;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-412578041"
	)
	public void method2262() {
		this.field3814[0] = 0.0F;
		this.field3814[1] = 0.0F;
		this.field3814[2] = 0.0F;
		this.field3814[3] = 0.0F;
		this.field3814[4] = 0.0F;
		this.field3814[5] = 0.0F;
		this.field3814[6] = 0.0F;
		this.field3814[7] = 0.0F;
		this.field3814[8] = 0.0F;
		this.field3814[9] = 0.0F;
		this.field3814[10] = 0.0F;
		this.field3814[11] = 0.0F;
		this.field3814[12] = 0.0F;
		this.field3814[13] = 0.0F;
		this.field3814[14] = 0.0F;
		this.field3814[15] = 0.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqp;I)V",
		garbageValue = "-1289616120"
	)
	public void method2263(class438 var1) {
		System.arraycopy(var1.field3814, 0, this.field3814, 0, 16);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "0"
	)
	public void method2264(float var1) {
		this.method2265(var1, var1, var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "377579402"
	)
	public void method2265(float var1, float var2, float var3) {
		this.method2261();
		this.field3814[0] = var1;
		this.field3814[5] = var2;
		this.field3814[10] = var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lqp;I)V",
		garbageValue = "-1768860871"
	)
	public void method2266(class438 var1) {
		for (int var2 = 0; var2 < this.field3814.length; ++var2) {
			float[] var10000 = this.field3814;
			var10000[var2] += var1.field3814[var2];
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqp;B)V",
		garbageValue = "57"
	)
	public void method2267(class438 var1) {
		float var2 = var1.field3814[12] * this.field3814[3] + this.field3814[1] * var1.field3814[4] + var1.field3814[0] * this.field3814[0] + this.field3814[2] * var1.field3814[8];
		float var3 = var1.field3814[13] * this.field3814[3] + var1.field3814[9] * this.field3814[2] + var1.field3814[1] * this.field3814[0] + this.field3814[1] * var1.field3814[5];
		float var4 = var1.field3814[2] * this.field3814[0] + this.field3814[1] * var1.field3814[6] + var1.field3814[10] * this.field3814[2] + var1.field3814[14] * this.field3814[3];
		float var5 = var1.field3814[7] * this.field3814[1] + var1.field3814[3] * this.field3814[0] + var1.field3814[11] * this.field3814[2] + var1.field3814[15] * this.field3814[3];
		float var6 = var1.field3814[12] * this.field3814[7] + var1.field3814[4] * this.field3814[5] + this.field3814[4] * var1.field3814[0] + this.field3814[6] * var1.field3814[8];
		float var7 = var1.field3814[9] * this.field3814[6] + this.field3814[4] * var1.field3814[1] + var1.field3814[5] * this.field3814[5] + var1.field3814[13] * this.field3814[7];
		float var8 = var1.field3814[10] * this.field3814[6] + this.field3814[5] * var1.field3814[6] + this.field3814[4] * var1.field3814[2] + this.field3814[7] * var1.field3814[14];
		float var9 = var1.field3814[15] * this.field3814[7] + this.field3814[6] * var1.field3814[11] + this.field3814[5] * var1.field3814[7] + var1.field3814[3] * this.field3814[4];
		float var10 = var1.field3814[12] * this.field3814[11] + this.field3814[10] * var1.field3814[8] + var1.field3814[0] * this.field3814[8] + var1.field3814[4] * this.field3814[9];
		float var11 = this.field3814[10] * var1.field3814[9] + var1.field3814[5] * this.field3814[9] + this.field3814[8] * var1.field3814[1] + var1.field3814[13] * this.field3814[11];
		float var12 = this.field3814[9] * var1.field3814[6] + this.field3814[8] * var1.field3814[2] + this.field3814[10] * var1.field3814[10] + var1.field3814[14] * this.field3814[11];
		float var13 = this.field3814[11] * var1.field3814[15] + this.field3814[10] * var1.field3814[11] + this.field3814[8] * var1.field3814[3] + this.field3814[9] * var1.field3814[7];
		float var14 = var1.field3814[0] * this.field3814[12] + this.field3814[13] * var1.field3814[4] + var1.field3814[8] * this.field3814[14] + var1.field3814[12] * this.field3814[15];
		float var15 = var1.field3814[13] * this.field3814[15] + var1.field3814[5] * this.field3814[13] + var1.field3814[1] * this.field3814[12] + var1.field3814[9] * this.field3814[14];
		float var16 = this.field3814[12] * var1.field3814[2] + this.field3814[13] * var1.field3814[6] + this.field3814[14] * var1.field3814[10] + this.field3814[15] * var1.field3814[14];
		float var17 = this.field3814[14] * var1.field3814[11] + var1.field3814[3] * this.field3814[12] + var1.field3814[7] * this.field3814[13] + this.field3814[15] * var1.field3814[15];
		this.field3814[0] = var2;
		this.field3814[1] = var3;
		this.field3814[2] = var4;
		this.field3814[3] = var5;
		this.field3814[4] = var6;
		this.field3814[5] = var7;
		this.field3814[6] = var8;
		this.field3814[7] = var9;
		this.field3814[8] = var10;
		this.field3814[9] = var11;
		this.field3814[10] = var12;
		this.field3814[11] = var13;
		this.field3814[12] = var14;
		this.field3814[13] = var15;
		this.field3814[14] = var16;
		this.field3814[15] = var17;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqj;S)V",
		garbageValue = "5361"
	)
	public void method2268(class437 var1) {
		float var2 = var1.field3807 * var1.field3807;
		float var3 = var1.field3809 * var1.field3807;
		float var4 = var1.field3810 * var1.field3807;
		float var5 = var1.field3807 * var1.field3808;
		float var6 = var1.field3809 * var1.field3809;
		float var7 = var1.field3809 * var1.field3810;
		float var8 = var1.field3808 * var1.field3809;
		float var9 = var1.field3810 * var1.field3810;
		float var10 = var1.field3810 * var1.field3808;
		float var11 = var1.field3808 * var1.field3808;
		this.field3814[0] = var6 + var2 - var11 - var9;
		this.field3814[1] = var5 + var7 + var5 + var7;
		this.field3814[2] = var8 + (var8 - var4 - var4);
		this.field3814[4] = var7 - var5 - var5 + var7;
		this.field3814[5] = var2 + var9 - var6 - var11;
		this.field3814[6] = var10 + var3 + var10 + var3;
		this.field3814[8] = var4 + var8 + var8 + var4;
		this.field3814[9] = var10 - var3 - var3 + var10;
		this.field3814[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)V",
		garbageValue = "968373442"
	)
	void method2269(class439 var1) {
		this.field3814[0] = var1.field3824;
		this.field3814[1] = var1.field3820;
		this.field3814[2] = var1.field3825;
		this.field3814[3] = 0.0F;
		this.field3814[4] = var1.field3823;
		this.field3814[5] = var1.field3826;
		this.field3814[6] = var1.field3822;
		this.field3814[7] = 0.0F;
		this.field3814[8] = var1.field3816;
		this.field3814[9] = var1.field3819;
		this.field3814[10] = var1.field3817;
		this.field3814[11] = 0.0F;
		this.field3814[12] = var1.field3818;
		this.field3814[13] = var1.field3821;
		this.field3814[14] = var1.field3815;
		this.field3814[15] = 1.0F;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "122"
	)
	float method2270() {
		return this.field3814[13] * this.field3814[8] * this.field3814[7] * this.field3814[2] + this.field3814[15] * this.field3814[9] * this.field3814[4] * this.field3814[2] + this.field3814[11] * this.field3814[6] * this.field3814[0] * this.field3814[13] + (this.field3814[10] * this.field3814[5] * this.field3814[0] * this.field3814[15] - this.field3814[14] * this.field3814[0] * this.field3814[5] * this.field3814[11] - this.field3814[0] * this.field3814[6] * this.field3814[9] * this.field3814[15]) + this.field3814[9] * this.field3814[7] * this.field3814[0] * this.field3814[14] - this.field3814[10] * this.field3814[0] * this.field3814[7] * this.field3814[13] - this.field3814[15] * this.field3814[10] * this.field3814[4] * this.field3814[1] + this.field3814[14] * this.field3814[4] * this.field3814[1] * this.field3814[11] + this.field3814[15] * this.field3814[8] * this.field3814[6] * this.field3814[1] - this.field3814[1] * this.field3814[6] * this.field3814[11] * this.field3814[12] - this.field3814[14] * this.field3814[1] * this.field3814[7] * this.field3814[8] + this.field3814[10] * this.field3814[1] * this.field3814[7] * this.field3814[12] - this.field3814[11] * this.field3814[4] * this.field3814[2] * this.field3814[13] - this.field3814[15] * this.field3814[5] * this.field3814[2] * this.field3814[8] + this.field3814[5] * this.field3814[2] * this.field3814[11] * this.field3814[12] - this.field3814[12] * this.field3814[9] * this.field3814[7] * this.field3814[2] - this.field3814[14] * this.field3814[3] * this.field3814[4] * this.field3814[9] + this.field3814[13] * this.field3814[4] * this.field3814[3] * this.field3814[10] + this.field3814[14] * this.field3814[5] * this.field3814[3] * this.field3814[8] - this.field3814[10] * this.field3814[5] * this.field3814[3] * this.field3814[12] - this.field3814[6] * this.field3814[3] * this.field3814[8] * this.field3814[13] + this.field3814[12] * this.field3814[3] * this.field3814[6] * this.field3814[9];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1611052304"
	)
	public void method2271() {
		float var1 = 1.0F / this.method2270();
		float var2 = (this.field3814[13] * this.field3814[6] * this.field3814[11] + (this.field3814[10] * this.field3814[5] * this.field3814[15] - this.field3814[5] * this.field3814[11] * this.field3814[14] - this.field3814[15] * this.field3814[9] * this.field3814[6]) + this.field3814[14] * this.field3814[7] * this.field3814[9] - this.field3814[13] * this.field3814[7] * this.field3814[10]) * var1;
		float var3 = var1 * (this.field3814[3] * this.field3814[10] * this.field3814[13] + (this.field3814[9] * this.field3814[2] * this.field3814[15] + this.field3814[11] * this.field3814[1] * this.field3814[14] + this.field3814[15] * -this.field3814[1] * this.field3814[10] - this.field3814[2] * this.field3814[11] * this.field3814[13] - this.field3814[14] * this.field3814[3] * this.field3814[9]));
		float var4 = (this.field3814[1] * this.field3814[6] * this.field3814[15] - this.field3814[14] * this.field3814[1] * this.field3814[7] - this.field3814[2] * this.field3814[5] * this.field3814[15] + this.field3814[2] * this.field3814[7] * this.field3814[13] + this.field3814[14] * this.field3814[5] * this.field3814[3] - this.field3814[13] * this.field3814[6] * this.field3814[3]) * var1;
		float var5 = (this.field3814[6] * this.field3814[3] * this.field3814[9] + (this.field3814[11] * this.field3814[5] * this.field3814[2] + this.field3814[10] * this.field3814[1] * this.field3814[7] + this.field3814[6] * -this.field3814[1] * this.field3814[11] - this.field3814[9] * this.field3814[7] * this.field3814[2] - this.field3814[3] * this.field3814[5] * this.field3814[10])) * var1;
		float var6 = (this.field3814[15] * this.field3814[8] * this.field3814[6] + -this.field3814[4] * this.field3814[10] * this.field3814[15] + this.field3814[11] * this.field3814[4] * this.field3814[14] - this.field3814[12] * this.field3814[11] * this.field3814[6] - this.field3814[7] * this.field3814[8] * this.field3814[14] + this.field3814[12] * this.field3814[10] * this.field3814[7]) * var1;
		float var7 = (this.field3814[2] * this.field3814[11] * this.field3814[12] + (this.field3814[10] * this.field3814[0] * this.field3814[15] - this.field3814[14] * this.field3814[0] * this.field3814[11] - this.field3814[8] * this.field3814[2] * this.field3814[15]) + this.field3814[3] * this.field3814[8] * this.field3814[14] - this.field3814[3] * this.field3814[10] * this.field3814[12]) * var1;
		float var8 = var1 * (this.field3814[12] * this.field3814[3] * this.field3814[6] + (this.field3814[15] * this.field3814[4] * this.field3814[2] + this.field3814[15] * this.field3814[6] * -this.field3814[0] + this.field3814[14] * this.field3814[0] * this.field3814[7] - this.field3814[2] * this.field3814[7] * this.field3814[12] - this.field3814[14] * this.field3814[3] * this.field3814[4]));
		float var9 = (this.field3814[3] * this.field3814[4] * this.field3814[10] + this.field3814[8] * this.field3814[2] * this.field3814[7] + (this.field3814[11] * this.field3814[0] * this.field3814[6] - this.field3814[10] * this.field3814[0] * this.field3814[7] - this.field3814[11] * this.field3814[2] * this.field3814[4]) - this.field3814[3] * this.field3814[6] * this.field3814[8]) * var1;
		float var10 = var1 * (this.field3814[7] * this.field3814[8] * this.field3814[13] + this.field3814[15] * this.field3814[4] * this.field3814[9] - this.field3814[13] * this.field3814[4] * this.field3814[11] - this.field3814[5] * this.field3814[8] * this.field3814[15] + this.field3814[12] * this.field3814[11] * this.field3814[5] - this.field3814[7] * this.field3814[9] * this.field3814[12]);
		float var11 = var1 * (this.field3814[9] * this.field3814[3] * this.field3814[12] + (this.field3814[15] * this.field3814[8] * this.field3814[1] + this.field3814[15] * this.field3814[9] * -this.field3814[0] + this.field3814[11] * this.field3814[0] * this.field3814[13] - this.field3814[1] * this.field3814[11] * this.field3814[12] - this.field3814[13] * this.field3814[3] * this.field3814[8]));
		float var12 = var1 * (this.field3814[13] * this.field3814[4] * this.field3814[3] + this.field3814[12] * this.field3814[7] * this.field3814[1] + (this.field3814[5] * this.field3814[0] * this.field3814[15] - this.field3814[0] * this.field3814[7] * this.field3814[13] - this.field3814[1] * this.field3814[4] * this.field3814[15]) - this.field3814[3] * this.field3814[5] * this.field3814[12]);
		float var13 = (this.field3814[9] * this.field3814[7] * this.field3814[0] + this.field3814[5] * -this.field3814[0] * this.field3814[11] + this.field3814[4] * this.field3814[1] * this.field3814[11] - this.field3814[8] * this.field3814[1] * this.field3814[7] - this.field3814[4] * this.field3814[3] * this.field3814[9] + this.field3814[3] * this.field3814[5] * this.field3814[8]) * var1;
		float var14 = (this.field3814[6] * this.field3814[9] * this.field3814[12] + (this.field3814[8] * this.field3814[5] * this.field3814[14] + this.field3814[10] * this.field3814[4] * this.field3814[13] + -this.field3814[4] * this.field3814[9] * this.field3814[14] - this.field3814[10] * this.field3814[5] * this.field3814[12] - this.field3814[13] * this.field3814[8] * this.field3814[6])) * var1;
		float var15 = (this.field3814[1] * this.field3814[10] * this.field3814[12] + (this.field3814[0] * this.field3814[9] * this.field3814[14] - this.field3814[0] * this.field3814[10] * this.field3814[13] - this.field3814[1] * this.field3814[8] * this.field3814[14]) + this.field3814[8] * this.field3814[2] * this.field3814[13] - this.field3814[12] * this.field3814[2] * this.field3814[9]) * var1;
		float var16 = (this.field3814[5] * -this.field3814[0] * this.field3814[14] + this.field3814[13] * this.field3814[6] * this.field3814[0] + this.field3814[4] * this.field3814[1] * this.field3814[14] - this.field3814[12] * this.field3814[1] * this.field3814[6] - this.field3814[13] * this.field3814[4] * this.field3814[2] + this.field3814[2] * this.field3814[5] * this.field3814[12]) * var1;
		float var17 = (this.field3814[4] * this.field3814[2] * this.field3814[9] + this.field3814[1] * this.field3814[6] * this.field3814[8] + (this.field3814[10] * this.field3814[0] * this.field3814[5] - this.field3814[9] * this.field3814[6] * this.field3814[0] - this.field3814[4] * this.field3814[1] * this.field3814[10]) - this.field3814[2] * this.field3814[5] * this.field3814[8]) * var1;
		this.field3814[0] = var2;
		this.field3814[1] = var3;
		this.field3814[2] = var4;
		this.field3814[3] = var5;
		this.field3814[4] = var6;
		this.field3814[5] = var7;
		this.field3814[6] = var8;
		this.field3814[7] = var9;
		this.field3814[8] = var10;
		this.field3814[9] = var11;
		this.field3814[10] = var12;
		this.field3814[11] = var13;
		this.field3814[12] = var14;
		this.field3814[13] = var15;
		this.field3814[14] = var16;
		this.field3814[15] = var17;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1623312614"
	)
	public float[] method2272() {
		float[] var1 = new float[3];
		class436 var2 = new class436(this.field3814[0], this.field3814[1], this.field3814[2]);
		class436 var3 = new class436(this.field3814[4], this.field3814[5], this.field3814[6]);
		class436 var4 = new class436(this.field3814[8], this.field3814[9], this.field3814[10]);
		var1[0] = var2.method2251();
		var1[1] = var3.method2251();
		var1[2] = var4.method2251();
		return var1;
	}

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method2260();
		this.method2259();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field3814[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	@Export("hashCode")
	@ObfuscatedName("hashCode")
	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field3814);
		return var3;
	}

	@Export("equals")
	@ObfuscatedName("equals")
	public boolean equals(Object var1) {
		if (!(var1 instanceof class438)) {
			return false;
		} else {
			class438 var2 = (class438)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field3814[var3] != this.field3814[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
