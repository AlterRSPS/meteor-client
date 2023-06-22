import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("an")
	@Export("crc")
	public int crc;
	@ObfuscatedName("av")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
		super();
	}
}
