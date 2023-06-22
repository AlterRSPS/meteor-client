import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("av")
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ak")
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ae")
	boolean field1131;
	@ObfuscatedName("af")
	int field1132;
	@ObfuscatedName("ao")
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	ServerPacket field1136;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	ServerPacket field1139;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	ServerPacket field1138;

	PacketWriter() {
		super();
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1131 = true;
		this.field1132 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16711935"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "254951931"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)V",
		garbageValue = "-792658230"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqz;I)V",
		garbageValue = "-325785679"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1129024542"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-220432815"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lqz;",
		garbageValue = "31"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}
}
