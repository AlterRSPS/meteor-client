import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("MoveSpeed")
public enum MoveSpeed implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("STATIONARY")
	STATIONARY((byte)-1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("CRAWL")
	CRAWL((byte)0),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("WALK")
	WALK((byte)1),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("RUN")
	RUN((byte)2);

	@ObfuscatedName("ax")
	@Export("speed")
	public byte speed;

	MoveSpeed(byte var3) {
		this.speed = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.speed;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "294559986"
	)
	static final boolean method1148(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class209.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class481.field4017;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class481.field4016;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}
}
