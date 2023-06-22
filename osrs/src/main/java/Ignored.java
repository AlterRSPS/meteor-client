import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("gj")
	static String field3748;
	// $FF: renamed from: id int
	@ObfuscatedName("at")
	@Export("id")
	int field_48;

	Ignored() {
		super();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)I",
		garbageValue = "-516310647"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.field_48 - var1.field_48;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)I",
		garbageValue = "615597391"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	@ObfuscatedName("compareTo")
	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
