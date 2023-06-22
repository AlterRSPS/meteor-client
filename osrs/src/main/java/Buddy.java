import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ax")
	@Export("world")
	public int world;
	@ObfuscatedName("ap")
	@Export("int2")
	public int int2;
	@ObfuscatedName("ab")
	@Export("rank")
	public int rank;

	Buddy() {
		super();
		this.world = -1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-288484565"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2 * -1981175651;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1081684215"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1206486735"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
