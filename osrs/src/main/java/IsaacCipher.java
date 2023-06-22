import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
@Implements("IsaacCipher")
public final class IsaacCipher {
	@ObfuscatedName("as")
	@Export("valuesRemaining")
	int valuesRemaining;
	@ObfuscatedName("ax")
	@Export("results")
	int[] results;
	// $FF: renamed from: mm int[]
	@ObfuscatedName("ap")
	@Export("mm")
	int[] field_73;
	// $FF: renamed from: aa int
	@ObfuscatedName("ab")
	@Export("aa")
	int field_74;
	// $FF: renamed from: bb int
	@ObfuscatedName("ak")
	@Export("bb")
	int field_75;
	// $FF: renamed from: cc int
	@ObfuscatedName("ae")
	@Export("cc")
	int field_76;

	public IsaacCipher(int[] var1) {
		super();
		this.field_73 = new int[256];
		this.results = new int[256];

		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.results[var2] = var1[var2];
		}

		this.method2650();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1260270923"
	)
	@Export("nextInt")
	public final int nextInt() {
		if (this.valuesRemaining == 0) {
			this.generateMoreResults();
			this.valuesRemaining = 256;
		}

		return this.results[--this.valuesRemaining];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1220606913"
	)
	public final int method2648() {
		if (this.valuesRemaining == 0) {
			this.generateMoreResults();
			this.valuesRemaining = 256;
		}

		return this.results[this.valuesRemaining - 1];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("generateMoreResults")
	final void generateMoreResults() {
		this.field_75 += ++this.field_76;

		for (int var1 = 0; var1 < 256; ++var1) {
			int var2 = this.field_73[var1];
			if ((var1 & 2) == 0) {
				if ((var1 & 1) == 0) {
					this.field_74 ^= this.field_74 << 13;
				} else {
					this.field_74 ^= this.field_74 >>> 6;
				}
			} else if ((var1 & 1) == 0) {
				this.field_74 ^= this.field_74 << 2;
			} else {
				this.field_74 ^= this.field_74 >>> 16;
			}

			this.field_74 += this.field_73[128 + var1 & 255];
			int var3;
			this.field_73[var1] = var3 = this.field_73[(var2 & 1020) >> 2] + this.field_75 + this.field_74;
			this.results[var1] = this.field_75 = this.field_73[(var3 >> 8 & 1020) >> 2] + var2;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	final void method2650() {
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;
		int var2 = -1640531527;

		int var1;
		for (var1 = 0; var1 < 4; ++var1) {
			var2 ^= var3 << 11;
			var5 += var2;
			var3 += var4;
			var3 ^= var4 >>> 2;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 8;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 >>> 16;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 << 10;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 >>> 4;
			var2 += var7;
			var8 += var9;
			var8 ^= var9 << 8;
			var3 += var8;
			var9 += var2;
			var9 ^= var2 >>> 9;
			var4 += var9;
			var2 += var3;
		}

		for (var1 = 0; var1 < 256; var1 += 8) {
			var2 += this.results[var1];
			var3 += this.results[var1 + 1];
			var4 += this.results[var1 + 2];
			var5 += this.results[var1 + 3];
			var6 += this.results[var1 + 4];
			var7 += this.results[var1 + 5];
			var8 += this.results[var1 + 6];
			var9 += this.results[var1 + 7];
			var2 ^= var3 << 11;
			var5 += var2;
			var3 += var4;
			var3 ^= var4 >>> 2;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 8;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 >>> 16;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 << 10;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 >>> 4;
			var2 += var7;
			var8 += var9;
			var8 ^= var9 << 8;
			var3 += var8;
			var9 += var2;
			var9 ^= var2 >>> 9;
			var4 += var9;
			var2 += var3;
			this.field_73[var1] = var2;
			this.field_73[var1 + 1] = var3;
			this.field_73[var1 + 2] = var4;
			this.field_73[var1 + 3] = var5;
			this.field_73[var1 + 4] = var6;
			this.field_73[var1 + 5] = var7;
			this.field_73[var1 + 6] = var8;
			this.field_73[var1 + 7] = var9;
		}

		for (var1 = 0; var1 < 256; var1 += 8) {
			var2 += this.field_73[var1];
			var3 += this.field_73[var1 + 1];
			var4 += this.field_73[var1 + 2];
			var5 += this.field_73[var1 + 3];
			var6 += this.field_73[var1 + 4];
			var7 += this.field_73[var1 + 5];
			var8 += this.field_73[var1 + 6];
			var9 += this.field_73[var1 + 7];
			var2 ^= var3 << 11;
			var5 += var2;
			var3 += var4;
			var3 ^= var4 >>> 2;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 8;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 >>> 16;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 << 10;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 >>> 4;
			var2 += var7;
			var8 += var9;
			var8 ^= var9 << 8;
			var3 += var8;
			var9 += var2;
			var9 ^= var2 >>> 9;
			var4 += var9;
			var2 += var3;
			this.field_73[var1] = var2;
			this.field_73[var1 + 1] = var3;
			this.field_73[var1 + 2] = var4;
			this.field_73[var1 + 3] = var5;
			this.field_73[var1 + 4] = var6;
			this.field_73[var1 + 5] = var7;
			this.field_73[var1 + 6] = var8;
			this.field_73[var1 + 7] = var9;
		}

		this.generateMoreResults();
		this.valuesRemaining = 256;
	}
}
