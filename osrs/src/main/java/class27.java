import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
public class class27 {
	@ObfuscatedName("ab")
	int[] field79;
	@ObfuscatedName("ak")
	int[] field80;

	public class27() {
		super();
		this.field79 = new int[112];
		this.field80 = new int[192];
		Arrays.fill(this.field79, 3);
		Arrays.fill(this.field80, 3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "116036003"
	)
	public void method94(int var1, int var2) {
		if (this.method103(var1) && this.method105(var2)) {
			this.field79[var1] = var2;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "21"
	)
	public void method95(char var1, int var2) {
		if (this.method104(var1) && this.method105(var2)) {
			this.field80[var1] = var2;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "125718608"
	)
	public int method97(int var1) {
		return this.method103(var1) ? this.field79[var1] : 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "-11"
	)
	public int method98(char var1) {
		return this.method104(var1) ? this.field80[var1] : 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1565428468"
	)
	public boolean method99(int var1) {
		return this.method103(var1) && (this.field79[var1] == 1 || this.field79[var1] == 3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1964583469"
	)
	public boolean method100(char var1) {
		return this.method104(var1) && (this.field80[var1] == 1 || this.field80[var1] == 3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1607220221"
	)
	public boolean method101(int var1) {
		return this.method103(var1) && (this.field79[var1] == 2 || this.field79[var1] == 3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-42"
	)
	public boolean method102(char var1) {
		return this.method104(var1) && (this.field80[var1] == 2 || this.field80[var1] == 3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2085268656"
	)
	boolean method103(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1585815968"
	)
	boolean method104(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "125198705"
	)
	boolean method105(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZS)V",
		garbageValue = "-1726"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		class100.method581(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-52"
	)
	static long method106() {
		return Client.playerUUID;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)V",
		garbageValue = "1"
	)
	static final void method107(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		class270.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
	}
}
