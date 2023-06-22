import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cr")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("ap")
	@Export("position")
	int position;

	AbstractSound() {
		super();
	}
}
