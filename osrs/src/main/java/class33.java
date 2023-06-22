import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class33 {
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ab")
	int field90;
	@ObfuscatedName("ak")
	int field91;

	class33(int var1, int var2) {
		super();
		this.field90 = var1;
		this.field91 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbo;I)Z",
		garbageValue = "671391142"
	)
	boolean method118(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field90) {
			case 1:
				return var1.vmethod3949(this.field91);
			case 2:
				return var1.vmethod3989(this.field91);
			case 3:
				return var1.vmethod3951((char)this.field91);
			case 4:
				return var1.vmethod3953(this.field91 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4095"
	)
	public static void method119() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}
}
