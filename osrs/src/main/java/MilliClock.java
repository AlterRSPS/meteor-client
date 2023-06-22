import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("at")
	long[] field1457;
	@ObfuscatedName("an")
	int field1452;
	@ObfuscatedName("av")
	int field1454;
	@ObfuscatedName("as")
	long field1456;
	@ObfuscatedName("ax")
	int field1455;
	@ObfuscatedName("ap")
	int field1453;

	public MilliClock() {
		super();
		this.field1457 = new long[10];
		this.field1452 = 256;
		this.field1454 = 1;
		this.field1455 = 0;
		this.field1456 = BoundaryObject.clockNow();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1457[var1] = this.field1456;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1909200559"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1457[var1] = 0L;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-4"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1452;
		int var4 = this.field1454;
		this.field1452 = 300;
		this.field1454 = 1;
		this.field1456 = BoundaryObject.clockNow();
		if (this.field1457[this.field1453] == 0L) {
			this.field1452 = var3;
			this.field1454 = var4;
		} else if (this.field1456 > this.field1457[this.field1453]) {
			this.field1452 = (int)((long)(var1 * 2560) / (this.field1456 - this.field1457[this.field1453]));
		}

		if (this.field1452 < 25) {
			this.field1452 = 25;
		}

		if (this.field1452 > 256) {
			this.field1452 = 256;
			this.field1454 = (int)((long)var1 - (this.field1456 - this.field1457[this.field1453]) / 10L);
		}

		if (this.field1454 > var1) {
			this.field1454 = var1;
		}

		this.field1457[this.field1453] = this.field1456;
		this.field1453 = (this.field1453 + 1) % 10;
		int var5;
		if (this.field1454 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1457[var5]) {
					this.field1457[var5] += (long)this.field1454;
				}
			}
		}

		if (this.field1454 < var2) {
			this.field1454 = var2;
		}

		FloorDecoration.method1176((long)this.field1454);

		for (var5 = 0; this.field1455 < 256; this.field1455 += this.field1452) {
			++var5;
		}

		this.field1455 &= 255;
		return var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1523541011"
	)
	static int method914(int var0) {
		return class28.KeyHandler_keyCodes[var0];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-9"
	)
	static final void method913(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					class305.field2754[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}
}
