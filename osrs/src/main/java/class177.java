import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class177 extends class180 {
	@ObfuscatedName("ax")
	static int field1449;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("at")
	int field1451;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class169 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;Ljava/lang/String;I)V"
	)
	class177(class169 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1451 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1756234342"
	)
	public int vmethod3379() {
		return 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16858419"
	)
	@Export("vmethod3378")
	public int vmethod3378() {
		return this.field1451;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lnt;",
		garbageValue = "1150408327"
	)
	public static GameBuild method907(int var0) {
		GameBuild[] var1 = class280.method1582();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfa;",
		garbageValue = "1200"
	)
	static class131 method908(int var0) {
		class131 var1 = (class131)GameObject.findEnumerated(Widget.method1814(), var0);
		if (var1 == null) {
			var1 = class131.field1264;
		}

		return var1;
	}
}
