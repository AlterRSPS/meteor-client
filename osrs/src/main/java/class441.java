import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public enum class441 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	field3831(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	field3829(3, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	field3832(2, 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	field3830(0, 10);

	@ObfuscatedName("ax")
	final int field3834;
	@ObfuscatedName("ap")
	final int field3833;

	class441(int var3, int var4) {
		this.field3834 = var3;
		this.field3833 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3833;
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1069312243"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field2515, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
