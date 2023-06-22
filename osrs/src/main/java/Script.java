import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("an")
	String field814;
	@ObfuscatedName("av")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("as")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ax")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ap")
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("ab")
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ak")
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ae")
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lsv;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
		super();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsv;",
		garbageValue = "-1348069017"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}
}
