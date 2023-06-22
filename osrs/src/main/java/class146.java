import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class146 extends class142 {
	@ObfuscatedName("at")
	int field1324;
	@ObfuscatedName("an")
	byte field1323;
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
	class146(class145 var1) {
		super();
		this.this$0 = var1;
		this.field1324 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		this.field1324 = var1.readUnsignedShort();
		this.field1323 = var1.readByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.method800(this.field1324, this.field1323);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1616025757"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class160.method830(var0, 10, true);
	}
}
