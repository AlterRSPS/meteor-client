import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("at")
	@Export("text")
	String text;
	@ObfuscatedName("an")
	@Export("width")
	int width;
	@ObfuscatedName("av")
	@Export("height")
	int height;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILjt;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		super();
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}
}
