import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bf")
	int field3872;
	@ObfuscatedName("bd")
	boolean field3867;
	@ObfuscatedName("ba")
	int field3869;
	@ObfuscatedName("bn")
	int field3875;
	@ObfuscatedName("bb")
	int field3870;
	@ObfuscatedName("bx")
	int field3880;
	@ObfuscatedName("be")
	int field3871;
	@ObfuscatedName("bh")
	boolean field3868;
	@ObfuscatedName("bp")
	int field3876;
	@ObfuscatedName("bw")
	int field3879;
	@ObfuscatedName("bk")
	int field3873;
	@ObfuscatedName("bv")
	int field3878;
	@ObfuscatedName("bz")
	String field3888;
	@ObfuscatedName("bm")
	String field3885;
	@ObfuscatedName("br")
	String field3886;
	@ObfuscatedName("bu")
	String field3887;
	@ObfuscatedName("by")
	int field3881;
	@ObfuscatedName("bt")
	int field3877;
	@ObfuscatedName("bl")
	int field3874;
	@ObfuscatedName("cs")
	int field3882;
	@ObfuscatedName("cu")
	String field3892;
	@ObfuscatedName("ca")
	String field3889;
	@ObfuscatedName("cf")
	int[] field3884;
	@ObfuscatedName("cw")
	int field3883;
	@ObfuscatedName("ch")
	String field3890;
	@ObfuscatedName("cp")
	String field3891;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		super();
		this.field3884 = new int[3];
		this.field3872 = var1;
		this.field3867 = var2;
		this.field3869 = var3;
		this.field3875 = var4;
		this.field3870 = var5;
		this.field3880 = var6;
		this.field3871 = var7;
		this.field3868 = var8;
		this.field3876 = var9;
		this.field3879 = var10;
		this.field3873 = var11;
		this.field3878 = var12;
		this.field3888 = var13;
		this.field3885 = var14;
		this.field3886 = var15;
		this.field3887 = var16;
		this.field3881 = var17;
		this.field3877 = var18;
		this.field3874 = var19;
		this.field3882 = var20;
		this.field3892 = var21;
		this.field3889 = var22;
		this.field3884 = var23;
		this.field3883 = var24;
		this.field3890 = var25;
		this.field3891 = var26;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "559305271"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9);
		var1.writeByte(this.field3872);
		var1.writeByte(this.field3867 ? 1 : 0);
		var1.writeShort(this.field3869);
		var1.writeByte(this.field3875);
		var1.writeByte(this.field3870);
		var1.writeByte(this.field3880);
		var1.writeByte(this.field3871);
		var1.writeByte(this.field3868 ? 1 : 0);
		var1.writeShort(this.field3876);
		var1.writeByte(this.field3879);
		var1.writeMedium(this.field3873);
		var1.writeShort(this.field3878);
		var1.writeStringCp1252NullCircumfixed(this.field3888);
		var1.writeStringCp1252NullCircumfixed(this.field3885);
		var1.writeStringCp1252NullCircumfixed(this.field3886);
		var1.writeStringCp1252NullCircumfixed(this.field3887);
		var1.writeByte(this.field3877);
		var1.writeShort(this.field3881);
		var1.writeStringCp1252NullCircumfixed(this.field3892);
		var1.writeStringCp1252NullCircumfixed(this.field3889);
		var1.writeByte(this.field3874);
		var1.writeByte(this.field3882);

		for (int var2 = 0; var2 < this.field3884.length; ++var2) {
			var1.writeInt(this.field3884[var2]);
		}

		var1.writeInt(this.field3883);
		var1.writeStringCp1252NullCircumfixed(this.field3890);
		var1.writeStringCp1252NullCircumfixed(this.field3891);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1243632731"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + VarcInt.method946(this.field3888);
		var2 += VarcInt.method946(this.field3885);
		var2 += VarcInt.method946(this.field3886);
		var2 += VarcInt.method946(this.field3887);
		var2 += VarcInt.method946(this.field3892);
		var2 += VarcInt.method946(this.field3889);
		var2 += VarcInt.method946(this.field3890);
		var2 += VarcInt.method946(this.field3891);
		return var2;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	static final void method2317() {
		if (Clock.Client_plane != Client.field532) {
			Client.field532 = Clock.Client_plane;
			ItemContainer.method450(Clock.Client_plane);
		}

	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-167178637"
	)
	@Export("process")
	static void process() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (Client.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class16.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = FriendSystem.getWidget(var4);
					if (var5 != null) {
						Messages.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
