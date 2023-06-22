import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class139 extends class142 {
	@ObfuscatedName("at")
	int field1308;
	@ObfuscatedName("an")
	int field1306;
	@ObfuscatedName("av")
	int field1309;
	@ObfuscatedName("as")
	int field1307;
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
	class139(class145 var1) {
		super();
		this.this$0 = var1;
		this.field1308 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		this.field1308 = var1.readUnsignedShort();
		this.field1306 = var1.readInt();
		this.field1309 = var1.readUnsignedByte();
		this.field1307 = var1.readUnsignedByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.method803(this.field1308, this.field1306, this.field1309, this.field1307);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhr;",
		garbageValue = "-2123064978"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
