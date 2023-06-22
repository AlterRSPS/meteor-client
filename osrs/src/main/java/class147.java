import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class147 extends class142 {
	@ObfuscatedName("at")
	int field1327;
	@ObfuscatedName("an")
	int field1325;
	@ObfuscatedName("av")
	int field1328;
	@ObfuscatedName("as")
	int field1326;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class147(class145 var1) {
		super();
		this.this$0 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		this.field1327 = var1.readInt();
		this.field1326 = var1.readInt();
		this.field1325 = var1.readUnsignedByte();
		this.field1328 = var1.readUnsignedByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.method805(this.field1327, this.field1326, this.field1325, this.field1328);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "-1850954136"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(Lmb;II)Ljava/lang/String;",
		garbageValue = "-1101437538"
	)
	static String method770(Widget var0, int var1) {
		if (!class60.method315(StudioGame.getWidgetFlags(var0), var1) && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}
