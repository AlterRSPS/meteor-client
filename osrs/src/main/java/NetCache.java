import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("an")
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("ax")
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("ab")
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("NetCache_pendingWrites")
	static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("af")
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("aa")
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("ar")
	public static int field3514;
	@ObfuscatedName("az")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("aq")
	static int field3524;
	@ObfuscatedName("aw")
	static int field3525;
	@ObfuscatedName("ay")
	public static byte field3507;
	@ObfuscatedName("al")
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("am")
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;

	static {
		NetCache_loadTime = 0;
		NetCache_pendingPriorityWrites = new NodeHashTable(4096);
		NetCache_pendingPriorityWritesCount = 0;
		NetCache_pendingPriorityResponses = new NodeHashTable(32);
		NetCache_pendingPriorityResponsesCount = 0;
		NetCache_pendingWritesQueue = new DualNodeDeque();
		NetCache_pendingWrites = new NodeHashTable(4096);
		NetCache_pendingWritesCount = 0;
		NetCache_pendingResponses = new NodeHashTable(4096);
		NetCache_pendingResponsesCount = 0;
		NetCache_responseHeaderBuffer = new Buffer(8);
		field3514 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3524 = -1;
		field3525 = 255;
		field3507 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}
}
