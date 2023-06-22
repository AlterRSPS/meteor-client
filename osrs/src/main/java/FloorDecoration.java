import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("FloorDecoration")
public final class FloorDecoration {
	// $FF: renamed from: z int
	@ObfuscatedName("at")
	@Export("z")
	int field_39;
	// $FF: renamed from: x int
	@ObfuscatedName("an")
	@Export("x")
	int field_40;
	// $FF: renamed from: y int
	@ObfuscatedName("av")
	@Export("y")
	int field_41;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ax")
	@Export("tag")
	public long tag;
	@ObfuscatedName("ap")
	@Export("flags")
	int flags;

	FloorDecoration() {
		super();
	}

	@ObfuscatedName("at")
	public static final void method1176(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				Skeleton.method1224(var0 - 1L);
				Skeleton.method1224(1L);
			} else {
				Skeleton.method1224(var0);
			}

		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "3841"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.CONTINUE, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeInt(var0);
		var2.packetBuffer.writeIntME(var1);
		Client.packetWriter.addNode(var2);
	}
}
