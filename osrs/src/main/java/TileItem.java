import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("TileItem")
public final class TileItem extends Renderable {
	// $FF: renamed from: id int
	@ObfuscatedName("at")
	@Export("id")
	int field_29;
	@ObfuscatedName("an")
	@Export("quantity")
	int quantity;
	@ObfuscatedName("as")
	int field1085;

	TileItem() {
		super();
		this.field1085 = 31;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1751557649"
	)
	void method589(int var1) {
		this.field1085 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class300.ItemDefinition_get(this.field_29).getModel(this.quantity);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-52"
	)
	boolean method591(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1085 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	static void method593() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}
}
