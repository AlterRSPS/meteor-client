import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	GrandExchangeOfferAgeComparator() {
		super();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lod;Lod;I)I",
		garbageValue = "1963540389"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1);
	}

	@Export("compare")
	@ObfuscatedName("compare")
	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@Export("equals")
	@ObfuscatedName("equals")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CIB)Ljava/lang/String;",
		garbageValue = "1"
	)
	public static String method1931(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}
}
