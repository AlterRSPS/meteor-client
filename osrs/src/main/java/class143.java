import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class143 extends class142 {
	@ObfuscatedName("bs")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("at")
	int field1315;
	@ObfuscatedName("an")
	boolean field1314;
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
	class143(class145 var1) {
		super();
		this.this$0 = var1;
		this.field1315 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		this.field1315 = var1.readUnsignedShort();
		this.field1314 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.method802(this.field1315, this.field1314);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "790907813"
	)
	public static void method751() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "60"
	)
	static final void method752(String var0) {
		ParamComposition.method1010("Please remove " + var0 + " from your ignore list first");
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltb;",
		garbageValue = "-2"
	)
	static class494 method755(int var0) {
		class494 var1 = (class494)Client.Widget_cachedFonts.get((long)var0);
		if (var1 == null) {
			var1 = new class494(Messages.field1127, var0);
		}

		return var1;
	}
}
