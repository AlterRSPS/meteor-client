import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ul")
	static int field2269;
	// $FF: renamed from: z int
	@ObfuscatedName("at")
	@Export("z")
	int field_53;
	@ObfuscatedName("an")
	@Export("xOffset")
	int xOffset;
	// $FF: renamed from: x int
	@ObfuscatedName("av")
	@Export("x")
	int field_54;
	// $FF: renamed from: y int
	@ObfuscatedName("as")
	@Export("y")
	int field_55;
	@ObfuscatedName("ax")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ap")
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ab")
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("af")
	@Export("tag")
	public long tag;
	@ObfuscatedName("ao")
	@Export("flags")
	int flags;

	WallDecoration() {
		super();
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lhx;I)Z",
		garbageValue = "-300819598"
	)
	static boolean method1391(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class175.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}
}
