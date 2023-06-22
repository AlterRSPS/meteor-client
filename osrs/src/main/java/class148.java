import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class148 extends class158 {
	@ObfuscatedName("aw")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("at")
	int field1331;
	@ObfuscatedName("an")
	byte field1330;
	@ObfuscatedName("av")
	int field1332;
	@ObfuscatedName("as")
	String field1333;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class159 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgh;)V"
	)
	class148(class159 var1) {
		super();
		this.this$0 = var1;
		this.field1331 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-986564571"
	)
	@Export("vmethod3238")
	void vmethod3238(Buffer var1) {
		this.field1331 = var1.readUnsignedShort();
		this.field1330 = var1.readByte();
		this.field1332 = var1.readUnsignedShort();
		var1.readLong();
		this.field1333 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "1284013379"
	)
	@Export("vmethod3239")
	void vmethod3239(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1331);
		var2.rank = this.field1330;
		var2.world = this.field1332;
		var2.username = new Username(this.field1333);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-535468247"
	)
	public static int method771(CharSequence var0, int var1) {
		return class211.method1105(var0, var1, true);
	}
}
