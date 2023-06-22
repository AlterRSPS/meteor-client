import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("at")
	@Export("compass")
	public int compass;
	@ObfuscatedName("an")
	public int field3789;
	@ObfuscatedName("av")
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("as")
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("ax")
	public int field3795;
	@ObfuscatedName("ap")
	public int field3791;
	@ObfuscatedName("ab")
	public int field3785;
	@ObfuscatedName("ak")
	public int field3788;
	@ObfuscatedName("ae")
	public int field3786;
	@ObfuscatedName("af")
	public int field3787;
	@ObfuscatedName("ao")
	public int field3790;

	public GraphicsDefaults() {
		super();
		this.compass = -1;
		this.field3789 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field3795 = -1;
		this.field3791 = -1;
		this.field3785 = -1;
		this.field3788 = -1;
		this.field3786 = -1;
		this.field3787 = -1;
		this.field3790 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V",
		garbageValue = "757040442"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3783.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.compass = var3.method2518();
				this.field3789 = var3.method2518();
				this.mapScenes = var3.method2518();
				this.headIconsPk = var3.method2518();
				this.field3795 = var3.method2518();
				this.field3791 = var3.method2518();
				this.field3785 = var3.method2518();
				this.field3788 = var3.method2518();
				this.field3786 = var3.method2518();
				this.field3787 = var3.method2518();
				this.field3790 = var3.method2518();
			}
		}
	}
}
