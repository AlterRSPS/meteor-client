import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public enum class138 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1301(1, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1299(0, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1302(2, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1300(4, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1303(3, 4);

	@ObfuscatedName("ap")
	public final int field1305;
	// $FF: renamed from: id int
	@ObfuscatedName("ab")
	@Export("id")
	final int field_35;

	class138(int var3, int var4) {
		this.field1305 = var3;
		this.field_35 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field_35;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-1617334204"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class270.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false);
	}
}
