import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("av")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("as")
	@Export("width")
	public int width;
	@ObfuscatedName("ax")
	@Export("height")
	public int height;
	@ObfuscatedName("ap")
	protected float[] field4130;

	protected AbstractRasterProvider() {
		super();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "500"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-494525788"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1370361703"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method2577(this.pixels, this.width, this.height, this.field4130);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1054168130"
	)
	public final void method2603(boolean var1) {
		this.field4130 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
