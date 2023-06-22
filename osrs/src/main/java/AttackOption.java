import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("AttackOption")
public enum AttackOption implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	field1081(2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	field1082(4);

	// $FF: renamed from: id int
	@ObfuscatedName("ap")
	@Export("id")
	final int field_34;

	AttackOption(int var3) {
		this.field_34 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field_34;
	}
}
