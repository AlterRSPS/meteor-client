import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("at")
	@Export("name")
	String name;
	@ObfuscatedName("an")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lsj;)V"
	)
	public Username(String var1, LoginType var2) {
		super();
		this.name = var1;
		this.cleanName = class406.method2119(var1, var2);
	}

	public Username(String var1) {
		super();
		this.name = var1;
		this.cleanName = class406.method2119(var1, LoginType.oldscape);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-955227925"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "11"
	)
	public String method2657() {
		return this.cleanName;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1906568401"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lun;B)I",
		garbageValue = "81"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) {
			return var1.cleanName == null ? 0 : 1;
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
		}
	}

	@Export("equals")
	@ObfuscatedName("equals")
	public boolean equals(Object var1) {
		if (var1 instanceof Username) {
			Username var2 = (Username)var1;
			if (this.cleanName == null) {
				return var2.cleanName == null;
			} else if (var2.cleanName == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
			}
		} else {
			return false;
		}
	}

	@Export("hashCode")
	@ObfuscatedName("hashCode")
	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode();
	}

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		return this.getName();
	}

	@Export("compareTo")
	@ObfuscatedName("compareTo")
	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}
}
