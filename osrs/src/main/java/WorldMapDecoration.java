import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("at")
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("an")
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("av")
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		super();
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lig;",
		garbageValue = "-122"
	)
	static RouteStrategy method1532(int var0, int var1) {
		Client.field648.approxDestinationX = var0;
		Client.field648.approxDestinationY = var1;
		Client.field648.approxDestinationSizeX = 1;
		Client.field648.approxDestinationSizeY = 1;
		return Client.field648;
	}
}
