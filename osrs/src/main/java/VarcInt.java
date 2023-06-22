import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("av")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		super();
		this.persist = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "-30"
	)
	public void method944(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method945(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-1843921437"
	)
	void method945(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2100829638"
	)
	public static void method947() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-3"
	)
	public static int method946(String var0) {
		return var0.length() + 2;
	}
}
