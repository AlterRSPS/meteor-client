import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("jk")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("at")
	@Export("swColor")
	int swColor;
	@ObfuscatedName("an")
	@Export("seColor")
	int seColor;
	@ObfuscatedName("av")
	@Export("neColor")
	int neColor;
	@ObfuscatedName("as")
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ax")
	@Export("texture")
	int texture;
	@ObfuscatedName("ap")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ab")
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		super();
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmb;II)V",
		garbageValue = "-1277532143"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2935 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3012 == null) {
				var0.field3012 = new int[var0.field2935.length];
			}

			var0.field3012[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-24"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
