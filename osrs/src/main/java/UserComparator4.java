import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("uc")
	static int field1158;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		super();
		this.reversed = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;B)I",
		garbageValue = "8"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 * 819600821 - var2.int2 * 819600821 : var2.int2 * 819600821 - var1.int2 * 819600821;
	}

	@Export("compare")
	@ObfuscatedName("compare")
	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	@Export("equals")
	@ObfuscatedName("equals")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;I)V",
		garbageValue = "-72085475"
	)
	public static void method645(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		NPCComposition.field1559 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "3"
	)
	static final int method646(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
