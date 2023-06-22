import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4008;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4011;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4010;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4012;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4009;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4006;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4007;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	public static final LoginType field4004;
	@ObfuscatedName("af")
	final int field4013;
	@ObfuscatedName("ao")
	final String field4014;

	static {
		oldscape = new LoginType(1, 0, "", "");
		field4008 = new LoginType(7, 1, "", "");
		field4011 = new LoginType(0, 2, "", "");
		field4010 = new LoginType(5, 3, "", "");
		field4012 = new LoginType(8, 4, "", "");
		field4009 = new LoginType(6, 5, "", "");
		field4006 = new LoginType(2, 6, "", "");
		field4007 = new LoginType(4, 7, "", "");
		field4004 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4008, field4011, field4012, field4010});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		super();
		this.field4013 = var1;
		this.field4014 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lsj;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		super();
		this.field4013 = var1;
		this.field4014 = var4;
	}

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		return this.field4014;
	}
}
