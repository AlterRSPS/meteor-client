import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("BoundaryObject")
public final class BoundaryObject {
	// $FF: renamed from: z int
	@ObfuscatedName("at")
	@Export("z")
	int field_62;
	// $FF: renamed from: x int
	@ObfuscatedName("an")
	@Export("x")
	int field_63;
	// $FF: renamed from: y int
	@ObfuscatedName("av")
	@Export("y")
	int field_64;
	@ObfuscatedName("as")
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ax")
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ak")
	@Export("tag")
	public long tag;
	@ObfuscatedName("ae")
	@Export("flags")
	int flags;

	BoundaryObject() {
		super();
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-149818697"
	)
	@Export("clockNow")
	public static final synchronized long clockNow() {
		long var0 = System.currentTimeMillis();
		if (var0 < class300.field2726) {
			class300.field2725 += class300.field2726 - var0;
		}

		class300.field2726 = var0;
		return var0 + class300.field2725;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)V",
		garbageValue = "190093423"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null;

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var11.plane && var11.field_3 == var1 && var2 == var11.field_4 && var3 == var11.type) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new PendingSpawn();
			var10.plane = var0;
			var10.type = var3;
			var10.field_3 = var1;
			var10.field_4 = var2;
			var10.field932 = -1;
			DirectByteArrayCopier.method1862(var10);
			Client.pendingSpawns.addFirst(var10);
		}

		var10.field_5 = var4;
		var10.objectType = var5;
		var10.rotation = var6;
		var10.startCycle = var8;
		var10.endCycle = var9;
		var10.method486(var7);
	}
}
