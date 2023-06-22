import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class9 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	public static final class9 field17;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	public static final class9 field16;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field19;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field18;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field20;
	@ObfuscatedName("ap")
	int field23;
	@ObfuscatedName("ab")
	String field24;
	@ObfuscatedName("ak")
	boolean field22;
	@ObfuscatedName("ae")
	boolean field21;

	static {
		field17 = new class9(0, "POST", true, true);
		field16 = new class9(1, "GET", true, false);
		field19 = new class9(2, "PUT", false, true);
		field18 = new class9(3, "PATCH", false, true);
		field20 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		super();
		this.field23 = var1;
		this.field24 = var2;
		this.field22 = var3;
		this.field21 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field23;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-54"
	)
	boolean method27() {
		return this.field22;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "95"
	)
	public String method28() {
		return this.field24;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-29965637"
	)
	boolean method29() {
		return this.field21;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	static void method32() {
		Login.worldSelectOpen = false;
		Decimator.leftTitleSprite.drawAt(Login.xPadding, 0);
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		class13.logoSprite.drawAt(Login.xPadding + 382 - class13.logoSprite.subWidth / 2, 18);
	}
}
