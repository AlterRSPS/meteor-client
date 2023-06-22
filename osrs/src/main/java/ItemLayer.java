import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("ItemLayer")
public final class ItemLayer {
	// $FF: renamed from: z int
	@ObfuscatedName("at")
	@Export("z")
	int field_69;
	// $FF: renamed from: x int
	@ObfuscatedName("an")
	@Export("x")
	int field_70;
	// $FF: renamed from: y int
	@ObfuscatedName("av")
	@Export("y")
	int field_71;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ab")
	@Export("tag")
	long tag;
	@ObfuscatedName("ak")
	@Export("height")
	int height;

	ItemLayer() {
		super();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Lqz;",
		garbageValue = "-1830401415"
	)
	public static AbstractSocket method1150(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}
}
