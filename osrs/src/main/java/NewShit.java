import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hs")
@Implements("NewShit")
public class NewShit {
	@ObfuscatedName("nq")
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("at")
	public long field1555;
	@ObfuscatedName("an")
	int[] field1551;
	@ObfuscatedName("av")
	short[] field1553;
	@ObfuscatedName("as")
	short[] field1552;
	@ObfuscatedName("ax")
	public boolean field1554;

	public NewShit(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		super();
		this.field1554 = false;
		this.field1555 = var1;
		this.field1551 = var3;
		this.field1553 = var4;
		this.field1552 = var5;
		this.field1554 = var6;
	}
}
