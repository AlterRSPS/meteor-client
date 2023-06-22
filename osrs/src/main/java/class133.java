import java.awt.FontMetrics;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
class class133 implements Callable {
	@ObfuscatedName("bj")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class136 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("val$p")
	@ObfuscatedName("val$p")
	final Buffer val$p;
	// $FF: synthetic field
	@Export("val$version")
	@ObfuscatedName("val$version")
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Ltz;I)V"
	)
	class133(class136 var1, Buffer var2, int var3) {
		super();
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	@Export("call")
	@ObfuscatedName("call")
	public Object call() {
		this.this$0.method719(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V",
		garbageValue = "-1175904330"
	)
	public static void method711(AbstractArchive var0) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "619467586"
	)
	public static boolean method712(int var0) {
		return var0 >= WorldMapDecorationType.field3078.field_66 && var0 <= WorldMapDecorationType.field3077.field_66 || var0 == WorldMapDecorationType.field3080.field_66;
	}
}
