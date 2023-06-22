import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class16 implements ThreadFactory {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[[Lmb;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("at")
	final ThreadGroup field49;
	@ObfuscatedName("an")
	final AtomicInteger field50;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lac;)V"
	)
	class16(class14 var1) {
		super();
		this.this$0 = var1;
		this.field50 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field49 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	@Export("newThread")
	@ObfuscatedName("newThread")
	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field49, var1, this.this$0.field42 + "-rest-request-" + this.field50.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)Ljava/lang/String;",
		garbageValue = "100"
	)
	@Export("readString")
	public static String readString(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class332.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = MusicPatchNode2.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}
}
