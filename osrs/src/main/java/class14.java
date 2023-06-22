import java.applet.Applet;
import java.net.URL;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ac")
public class class14 {
	@ObfuscatedName("sa")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("at")
	final int field41;
	@ObfuscatedName("an")
	final String field42;
	@ObfuscatedName("av")
	final ThreadFactory field43;
	@ObfuscatedName("as")
	final ThreadPoolExecutor field44;

	public class14(String var1, int var2, int var3) {
		super();
		this.field42 = var1;
		this.field41 = var2;
		this.field43 = new class16(this);
		this.field44 = this.method47(var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-112"
	)
	final ThreadPoolExecutor method47(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field41), this.field43);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lao;S)Laz;",
		garbageValue = "2477"
	)
	public class18 method49(class10 var1) {
		if (this.field44.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field44.getCorePoolSize() + " Queue capacity " + this.field41);
			return new class18("Queue full");
		} else {
			class18 var2 = new class18(this.field44.submit(new class19(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "144144800"
	)
	public final void method50() {
		try {
			this.field44.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	public static void method48() {
		class36.reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-25"
	)
	public static int method51(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 0 & 127L);
		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-407265950"
	)
	static boolean method52(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field85.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var13.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class31.field84;
				Object[] var5 = new Object[]{(new URL(class31.field84.getCodeBase(), var0)).toString()};
				Object var3 = JSObject.getWindow(var7).call(var2, var5);
				return var3 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field84.getAppletContext().showDocument(new URL(class31.field84.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class26.method93(class31.field84, "loggedout");
			} catch (Throwable var12) {
			}

			try {
				class31.field84.getAppletContext().showDocument(new URL(class31.field84.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lcc;I)V",
		garbageValue = "-2085858081"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			class211.method1111(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = class180.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var2 & 256) != 0) {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		class17.worldHost = var0.host;
		Client.worldId = var0.field_72;
		Client.worldProperties = var0.properties;
		PcmPlayer.worldPort = Client.gameBuild == 0 ? 43594 : var0.field_72 + 40000;
		SecureRandomFuture.js5Port = Client.gameBuild == 0 ? 443 : var0.field_72 + 50000;
		UserComparator8.currentPort = PcmPlayer.worldPort;
	}
}
