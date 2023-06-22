import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("cy")
	static int field2281;
	@ObfuscatedName("at")
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@Export("startX")
	int startX;
	// $FF: renamed from: z int
	@ObfuscatedName("av")
	@Export("z")
	int field_49;
	@ObfuscatedName("as")
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ax")
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ab")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ak")
	@Export("endX")
	int endX;
	@ObfuscatedName("ae")
	@Export("startY")
	int startY;
	@ObfuscatedName("af")
	@Export("endY")
	int endY;
	@ObfuscatedName("ao")
	int field2289;
	@ObfuscatedName("aa")
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("aj")
	@Export("tag")
	public long tag;
	@ObfuscatedName("ad")
	@Export("flags")
	int flags;

	GameObject() {
		super();
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Lob;II)Lob;",
		garbageValue = "285155448"
	)
	@Export("findEnumerated")
	public static class369 findEnumerated(class369[] var0, int var1) {
		class369[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class369 var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}
}
