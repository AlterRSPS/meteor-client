import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public abstract class class142 extends Node {
	class142() {
		super();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	abstract void vmethod3254(Buffer var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	abstract void vmethod3248(ClanSettings var1);

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1403198759"
	)
	static boolean method747() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
