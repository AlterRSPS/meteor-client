import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class8 {
	@ObfuscatedName("at")
	final int field14;
	@ObfuscatedName("an")
	final int field13;
	@ObfuscatedName("av")
	final String field15;

	@ObfuscatedSignature(
		descriptor = "(Ltz;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		super();
		this.field14 = var1;
		this.field13 = var2;
		this.field15 = var3;
	}

	@ObfuscatedName("at")
	String method25() {
		return Integer.toHexString(this.field14) + Integer.toHexString(this.field13) + this.field15;
	}

	@ObfuscatedName("an")
	int method26() {
		return this.field13;
	}
}
