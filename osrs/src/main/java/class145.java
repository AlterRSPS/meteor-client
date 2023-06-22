import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class145 {
	@ObfuscatedName("at")
	long field1321;
	@ObfuscatedName("an")
	int field1320;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	IterableNodeDeque field1322;

	@ObfuscatedSignature(
		descriptor = "(Ltz;)V"
	)
	public class145(Buffer var1) {
		super();
		this.field1320 = -1;
		this.field1322 = new IterableNodeDeque();
		this.method762(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "-112"
	)
	void method762(Buffer var1) {
		this.field1321 = var1.readLong();
		this.field1320 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class164(this);
			} else if (var2 == 1) {
				var3 = new class140(this);
			} else if (var2 == 13) {
				var3 = new class157(this);
			} else if (var2 == 4) {
				var3 = new class149(this);
			} else if (var2 == 6) {
				var3 = new class156(this);
			} else if (var2 == 5) {
				var3 = new class141(this);
			} else if (var2 == 2) {
				var3 = new class146(this);
			} else if (var2 == 7) {
				var3 = new class139(this);
			} else if (var2 == 14) {
				var3 = new class143(this);
			} else if (var2 == 8) {
				var3 = new class160(this);
			} else if (var2 == 9) {
				var3 = new class166(this);
			} else if (var2 == 10) {
				var3 = new class152(this);
			} else if (var2 == 11) {
				var3 = new class147(this);
			} else if (var2 == 12) {
				var3 = new class151(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class161(this);
			}

			((class142)var3).vmethod3254(var1);
			this.field1322.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;I)V",
		garbageValue = "376498717"
	)
	public void method763(ClanSettings var1) {
		if (this.field1321 == var1.field1353 && this.field1320 == var1.field1350) {
			for (class142 var2 = (class142)this.field1322.last(); var2 != null; var2 = (class142)this.field1322.previous()) {
				var2.vmethod3248(var1);
			}

			++var1.field1350;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1123792033"
	)
	static void method761() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				KitDefinition.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				KitDefinition.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "59"
	)
	public static boolean method760(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
