import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("at")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("as")
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1127;
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnn;",
		garbageValue = "1346140648"
	)
	static class343[] method619() {
		return new class343[]{class343.field3107, class343.field3106};
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	static void method620() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class10.clientPreferences.getUsernameToRemember() != null) {
				Login.Login_username = class10.clientPreferences.getUsernameToRemember();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "-648264388"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field529) {
			Client.field404[var0.rootIndex] = true;
		}

	}
}
