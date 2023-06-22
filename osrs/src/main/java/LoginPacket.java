import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("LoginPacket")
public class LoginPacket implements class292 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	public static final LoginPacket field2716;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	static final LoginPacket field2719;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("NEW_LOGIN_CONNECTION")
	public static final LoginPacket NEW_LOGIN_CONNECTION;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("RECONNECT_LOGIN_CONNECTION")
	public static final LoginPacket RECONNECT_LOGIN_CONNECTION;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	public static final LoginPacket field2718;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	static final LoginPacket field2720;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	static final LoginPacket[] field2721;
	// $FF: renamed from: id int
	@ObfuscatedName("ab")
	@Export("id")
	public final int field_61;

	static {
		field2716 = new LoginPacket(14, 0);
		field2719 = new LoginPacket(15, 4);
		NEW_LOGIN_CONNECTION = new LoginPacket(16, -2);
		RECONNECT_LOGIN_CONNECTION = new LoginPacket(18, -2);
		field2718 = new LoginPacket(19, -2);
		field2720 = new LoginPacket(27, 0);
		field2721 = new LoginPacket[32];
		LoginPacket[] var0 = Decimator.method295();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field2721[var0[var1].field_61] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		super();
		this.field_61 = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILnq;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "1686859753"
	)
	public static void method1612(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		if (var1.isValidFileName(var2, var3)) {
			int var6 = var1.getGroupId(var2);
			int var7 = var1.getFileId(var6, var3);
			class304.musicPlayerStatus = 1;
			UserComparator9.musicTrackArchive = var1;
			VarbitComposition.musicTrackGroupId = var6;
			class304.musicTrackFileId = var7;
			class304.musicTrackVolume = var4;
			class132.musicTrackBoolean = var5;
			class157.pcmSampleLength = var0;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1885482155"
	)
	static int method1613(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}
}
