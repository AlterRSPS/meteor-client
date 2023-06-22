import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("av")
	static int field3472;
	@ObfuscatedName("as")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("ax")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3472 = 0;
		ArchiveDiskActionHandler_lock = new Object();
	}

	ArchiveDiskActionHandler() {
		super();
	}

	@Export("run")
	@ObfuscatedName("run")
	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3472 <= 1) {
							field3472 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3472 = 600;
					}
				} else {
					FloorDecoration.method1176(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3472 <= 1) {
							field3472 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3472;
					}
				}
			}
		} catch (Exception var13) {
			class260.RunException_sendStackTrace((String)null, var13);
		}
	}
}
