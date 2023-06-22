import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class155 extends class158 {
	@ObfuscatedName("st")
	static boolean field1375;
	@ObfuscatedName("at")
	int field1377;
	@ObfuscatedName("an")
	byte field1376;
	@ObfuscatedName("av")
	int field1378;
	@ObfuscatedName("as")
	String field1379;
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
	class155(class159 var1) {
		super();
		this.this$0 = var1;
		this.field1377 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-986564571"
	)
	@Export("vmethod3238")
	void vmethod3238(Buffer var1) {
		var1.readUnsignedByte();
		this.field1377 = var1.readUnsignedShort();
		this.field1376 = var1.readByte();
		this.field1378 = var1.readUnsignedShort();
		var1.readLong();
		this.field1379 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "1284013379"
	)
	@Export("vmethod3239")
	void vmethod3239(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1377);
		var2.rank = this.field1376;
		var2.world = this.field1378;
		var2.username = new Username(this.field1379);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-768750236"
	)
	public static int method813(int var0) {
		return class302.field2727[var0];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "486411013"
	)
	public static void method814() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}
}
