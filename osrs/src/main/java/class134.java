import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class134 {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("gy")
	static int field1272;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "[Lmb;"
	)
	static Widget[] field1273;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-50"
	)
	public static int method713(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 14 & 3L);
		return var1;
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	static final void method714(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class10.clientPreferences.setAreaSoundEffectsVolume(var0);
	}
}
