import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class126 {
	@ObfuscatedName("ub")
	static int field1188;
	@ObfuscatedName("at")
	public final int field1202;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	public class126 field1201;
	@ObfuscatedName("av")
	float[][] field1194;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	final class438[] field1200;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	class438[] field1199;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	class438[] field1198;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	class438 field1195;
	@ObfuscatedName("ak")
	boolean field1190;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	class438 field1196;
	@ObfuscatedName("af")
	boolean field1189;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	class438 field1197;
	@ObfuscatedName("aa")
	float[][] field1191;
	@ObfuscatedName("aj")
	float[][] field1193;
	@ObfuscatedName("ad")
	float[][] field1192;

	@ObfuscatedSignature(
		descriptor = "(ILtz;Z)V"
	)
	public class126(int var1, Buffer var2, boolean var3) {
		super();
		this.field1195 = new class438();
		this.field1190 = true;
		this.field1196 = new class438();
		this.field1189 = true;
		this.field1197 = new class438();
		this.field1202 = var2.readShort();
		this.field1200 = new class438[var1];
		this.field1199 = new class438[this.field1200.length];
		this.field1198 = new class438[this.field1200.length];
		this.field1194 = new float[this.field1200.length][3];

		for (int var4 = 0; var4 < this.field1200.length; ++var4) {
			this.field1200[var4] = new class438(var2, var3);
			this.field1194[var4][0] = var2.method2506();
			this.field1194[var4][1] = var2.method2506();
			this.field1194[var4][2] = var2.method2506();
		}

		this.method678();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "580765599"
	)
	void method678() {
		this.field1191 = new float[this.field1200.length][3];
		this.field1193 = new float[this.field1200.length][3];
		this.field1192 = new float[this.field1200.length][3];
		class438 var1 = class396.method2097();

		for (int var2 = 0; var2 < this.field1200.length; ++var2) {
			class438 var3 = this.method679(var2);
			var1.method2263(var3);
			var1.method2271();
			this.field1191[var2] = var1.method2260();
			this.field1193[var2][0] = var3.field3814[12];
			this.field1193[var2][1] = var3.field3814[13];
			this.field1193[var2][2] = var3.field3814[14];
			this.field1192[var2] = var3.method2272();
		}

		var1.method2257();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqp;",
		garbageValue = "9"
	)
	class438 method679(int var1) {
		return this.field1200[var1];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lqp;",
		garbageValue = "1829867791"
	)
	class438 method680(int var1) {
		if (this.field1199[var1] == null) {
			this.field1199[var1] = new class438(this.method679(var1));
			if (this.field1201 != null) {
				this.field1199[var1].method2267(this.field1201.method680(var1));
			} else {
				this.field1199[var1].method2267(class438.field3811);
			}
		}

		return this.field1199[var1];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqp;",
		garbageValue = "105"
	)
	class438 method681(int var1) {
		if (this.field1198[var1] == null) {
			this.field1198[var1] = new class438(this.method680(var1));
			this.field1198[var1].method2271();
		}

		return this.field1198[var1];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqp;I)V",
		garbageValue = "-1088629176"
	)
	void method682(class438 var1) {
		this.field1195.method2263(var1);
		this.field1190 = true;
		this.field1189 = true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lqp;",
		garbageValue = "882573661"
	)
	class438 method683() {
		return this.field1195;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lqp;",
		garbageValue = "-1922889317"
	)
	class438 method684() {
		if (this.field1190) {
			this.field1196.method2263(this.method683());
			if (this.field1201 != null) {
				this.field1196.method2267(this.field1201.method684());
			}

			this.field1190 = false;
		}

		return this.field1196;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lqp;",
		garbageValue = "-2072769178"
	)
	public class438 method685(int var1) {
		if (this.field1189) {
			this.field1197.method2263(this.method681(var1));
			this.field1197.method2267(this.method684());
			this.field1189 = false;
		}

		return this.field1197;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1185833224"
	)
	float[] method686(int var1) {
		return this.field1191[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-16"
	)
	float[] method687(int var1) {
		return this.field1193[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1165674685"
	)
	float[] method688(int var1) {
		return this.field1192[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lik;",
		garbageValue = "-839433864"
	)
	static class213[] method677() {
		return new class213[]{class213.field1884, class213.field1882, class213.field1881, class213.field1883, class213.field1886, class213.field1885, class213.field1879};
	}
}
