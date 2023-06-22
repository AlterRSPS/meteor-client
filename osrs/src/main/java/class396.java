import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class396 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	class392 field3662;
	@ObfuscatedName("an")
	int field3660;
	@ObfuscatedName("av")
	int field3661;

	@ObfuscatedSignature(
		descriptor = "(Lpk;II)V"
	)
	class396(class392 var1, int var2, int var3) {
		super();
		this.field3660 = 0;
		this.field3661 = 0;
		this.field3662 = var1;
		this.field3660 = var2;
		this.field3661 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-75"
	)
	public String method2095() {
		if (this.method2098()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method2099());

			for (int var2 = this.field3660; var2 < this.field3661; ++var2) {
				class394 var3 = this.field3662.method2016(var2);
				var1.append(var3.field3635);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "757218987"
	)
	boolean method2096(int var1) {
		return this.field3662.method2047() == 2 || this.field3662.method2047() == 1 && (!this.field3662.field3622 || this.field3661 - 1 != var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method2098() {
		return this.field3661 == this.field3660;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-398217773"
	)
	public int method2099() {
		return this.field3661 - this.field3660;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I)Z",
		garbageValue = "1875232175"
	)
	boolean method2100(class394 var1) {
		if (this.field3662.field3625 == 2) {
			return true;
		} else if (this.field3662.field3625 == 0) {
			return false;
		} else {
			return this.field3662.method2017() != var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1575995118"
	)
	int method2101() {
		if (this.method2098()) {
			return 0;
		} else {
			class394 var1 = this.field3662.method2016(this.field3661 - 1);
			if (var1.field3635 == '\n') {
				return 0;
			} else if (this.method2100(var1)) {
				return this.field3662.field3631.advances[42];
			} else {
				int var2 = this.field3662.field3631.advances[var1.field3635];
				if (var2 == 0) {
					return var1.field3635 == '\t' ? this.field3662.field3631.advances[32] * 3 : this.field3662.field3631.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;",
		garbageValue = "1159401741"
	)
	public class473 method2102() {
		if (this.method2098()) {
			return new class473(0, 0);
		} else {
			class394 var1 = this.field3662.method2016(this.field3661 - 1);
			return new class473(var1.field3636 + this.method2101(), var1.field3637 * -493099907);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lpb;",
		garbageValue = "1223310421"
	)
	public class394 method2103(int var1) {
		return var1 >= 0 && var1 < this.method2099() ? this.field3662.method2016(this.field3660 + var1) : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lqp;",
		garbageValue = "660938077"
	)
	public static class438 method2097() {
		synchronized(class438.field3813) {
			if (class438.field3812 == 0) {
				return new class438();
			} else {
				class438.field3813[--class438.field3812].method2261();
				return class438.field3813[class438.field3812];
			}
		}
	}
}
