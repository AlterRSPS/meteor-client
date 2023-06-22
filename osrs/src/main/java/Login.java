import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Login")
public class Login {
	@ObfuscatedName("an")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("av")
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("aq")
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ay")
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("al")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bz")
	static int field751;
	@ObfuscatedName("bu")
	static int field750;
	@ObfuscatedName("cs")
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cu")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ca")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cf")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cw")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ch")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cp")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cd")
	static int field752;
	@ObfuscatedName("cv")
	static String[] field769;
	@ObfuscatedName("cb")
	static String field761;
	@ObfuscatedName("cn")
	static boolean field743;
	@ObfuscatedName("ct")
	static boolean field744;
	@ObfuscatedName("cz")
	static boolean field745;
	@ObfuscatedName("dd")
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dt")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dq")
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dh")
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dp")
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("di")
	static long field773;
	@ObfuscatedName("dj")
	static long field774;
	@ObfuscatedName("dk")
	static String[] field771;
	@ObfuscatedName("dy")
	static String[] field772;
	@ObfuscatedName("dg")
	static String[] field770;
	@ObfuscatedName("lx")
	static int field758;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field751 = -1;
		field750 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field752 = 0;
		field769 = new String[8];
		field761 = "";
		field743 = false;
		field744 = false;
		field745 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class132();
		field773 = -1L;
		field774 = -1L;
		field771 = new String[]{"title.jpg"};
		field772 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field770 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I[B[BI)V",
		garbageValue = "-1847692125"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2935 == null) {
			if (var2 == null) {
				return;
			}

			var0.field2935 = new byte[11][];
			var0.field2934 = new byte[11][];
			var0.field3003 = new int[11];
			var0.field3004 = new int[11];
		}

		var0.field2935[var1] = var2;
		if (var2 != null) {
			var0.field2925 = true;
		} else {
			var0.field2925 = false;

			for (int var4 = 0; var4 < var0.field2935.length; ++var4) {
				if (var0.field2935[var4] != null) {
					var0.field2925 = true;
					break;
				}
			}
		}

		var0.field2934[var1] = var3;
	}
}
