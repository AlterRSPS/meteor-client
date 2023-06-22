import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("at")
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("an")
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("av")
	@Export("highX")
	public int highX;
	@ObfuscatedName("as")
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		super();
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1777965878"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1 * -1656344771;
		this.lowY = var2 * -1680696291;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "773996379"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1 * -1656344771;
		this.highY = var2 * -1680696291;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "84"
	)
	public boolean method2243(int var1, int var2) {
		return var1 >= this.lowX * -434593771 && var1 < this.highX * -434593771 + this.lowX * -434593771 && var2 >= this.lowY * 102827573 && var2 < this.highY * 102827573 + this.lowY * 102827573;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqs;Lqs;I)V",
		garbageValue = "999176632"
	)
	public void method2244(Bounds var1, Bounds var2) {
		this.method2245(var1, var2);
		this.method2246(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqs;Lqs;I)V",
		garbageValue = "-1949887580"
	)
	void method2245(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX * -434593771 < var1.lowX * -434593771) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method2247() > var1.method2247()) {
			var2.highX = (var2.highX * -434593771 - (var2.method2247() - var1.method2247())) * -1656344771;
		}

		if (var2.highX * -434593771 < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqs;Lqs;B)V",
		garbageValue = "-34"
	)
	void method2246(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY * 102827573 < var1.lowY * 102827573) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method2250() > var1.method2250()) {
			var2.highY = (var2.highY * 102827573 - (var2.method2250() - var1.method2250())) * -1680696291;
		}

		if (var2.highY * 102827573 < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "533041581"
	)
	int method2247() {
		return this.lowX * -434593771 + this.highX * -434593771;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "960024041"
	)
	int method2250() {
		return this.highY * 102827573 + this.lowY * 102827573;
	}

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		return null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhd;",
		garbageValue = "-1510147109"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.field_12 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;III)Lph;",
		garbageValue = "1029940745"
	)
	public static Font method2248(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			UserComparator2.SpriteBuffer_decode(var5);
			var4 = true;
		}

		if (!var4) {
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3);
			Font var8;
			if (var6 == null) {
				var8 = null;
			} else {
				Font var7 = new Font(var6, class515.SpriteBuffer_xOffsets, class402.SpriteBuffer_yOffsets, class515.SpriteBuffer_spriteWidths, class515.SpriteBuffer_spriteHeights, class515.SpriteBuffer_spritePalette, class515.SpriteBuffer_pixels);
				TextureProvider.method1309();
				var8 = var7;
			}

			return var8;
		}
	}
}
