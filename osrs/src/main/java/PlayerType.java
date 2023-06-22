import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("PlayerType")
public enum PlayerType implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3446(6, 22, false, false, true),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3453(7, 41, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3449(8, 42, false, false, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3450(9, 43, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3455(10, 44, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3445(11, 45, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3452(12, 46, false, false, true),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3448(13, 47, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3447(14, 48, false, false, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3451(15, 49, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	field3457(16, 52, false, false, true);

	// $FF: renamed from: id int
	@ObfuscatedName("ah")
	@Export("id")
	final int field_59;
	@ObfuscatedName("az")
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("au")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("ai")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.field_59 = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field_59;
	}
}
