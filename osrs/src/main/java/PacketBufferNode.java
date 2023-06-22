import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ap")
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("an")
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("as")
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
		super();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1162232203"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1844218282"
	)
	static int method1609(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		return ApproximateRouteStrategy.NetCache_currentResponse != null && ApproximateRouteStrategy.NetCache_currentResponse.key == var2 ? ModeWhere.NetCache_responseArchiveBuffer.offset * 99 / (ModeWhere.NetCache_responseArchiveBuffer.array.length - ApproximateRouteStrategy.NetCache_currentResponse.padding) + 1 : 0;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1194868259"
	)
	static final void method1610() {
		Client.field522 = Client.cycleCntr;
	}
}
