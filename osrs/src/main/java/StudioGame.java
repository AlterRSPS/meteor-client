import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("StudioGame")
public enum StudioGame implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ab")
	@Export("name")
	public final String name;
	// $FF: renamed from: id int
	@ObfuscatedName("ak")
	@Export("id")
	final int field_68;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.field_68 = var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field_68;
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)I",
		garbageValue = "-1452729728"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex * -7032219729667178803L + ((long)var0.field_9 * 6060303756424023813L << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
