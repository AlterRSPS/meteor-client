import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class140 extends class142 {
	@ObfuscatedName("at")
	long field1311;
	@ObfuscatedName("an")
	String field1310;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class140(class145 var1) {
		super();
		this.this$0 = var1;
		this.field1311 = -1L;
		this.field1310 = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1311 = var1.readLong();
		}

		this.field1310 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.method795(this.field1311, this.field1310, 0);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;B)V",
		garbageValue = "37"
	)
	public static void method740(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lmb;III)V",
		garbageValue = "-1010047426"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.field_10 = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.field_10 = var0.rawX + (var1 - var0.width * 1387970291) / 2;
		} else if (var0.xAlignment == 2) {
			var0.field_10 = var1 - var0.width * 1387970291 - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.field_10 = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.field_10 = (var0.rawX * var1 >> 14) + (var1 - var0.width * 1387970291) / 2;
		} else {
			var0.field_10 = var1 - var0.width * 1387970291 - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.field_11 = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.field_11 = (var2 - var0.height * -175088023) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.field_11 = var2 - var0.height * -175088023 - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.field_11 = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.field_11 = (var2 - var0.height * -175088023) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.field_11 = var2 - var0.height * -175088023 - (var2 * var0.rawY >> 14);
		}

	}
}
