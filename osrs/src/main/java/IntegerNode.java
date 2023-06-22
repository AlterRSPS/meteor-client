import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rd")
@Implements("IntegerNode")
public class IntegerNode extends Node {
	@ObfuscatedName("at")
	@Export("integer")
	public int integer;

	public IntegerNode(int var1) {
		super();
		this.integer = var1;
	}
}
