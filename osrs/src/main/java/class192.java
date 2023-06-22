import java.io.IOException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
public enum class192 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field1546(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field1545(2, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field1547(1, 2);

	@ObfuscatedName("as")
	public final int field1549;
	@ObfuscatedName("ax")
	final int field1548;

	class192(int var3, int var4) {
		this.field1549 = var3;
		this.field1548 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1548;
	}

	@ObfuscatedName("at")
	public static String method965(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;ZIB)V",
		garbageValue = "-22"
	)
	static void method966(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				class390.method2013(4);
			}

		} else {
			if (var3 == 0) {
				class164.method852(var2);
			} else {
				class390.method2013(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Decimator.leftTitleSprite = Interpreter.method412(var4);
			Login.rightTitleSprite = Decimator.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var5 & 256) != 0) {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			class481.titleboxSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			ParamComposition.field1652 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			UserComparator8.field1162 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = WorldMapRectangle.method1530(var1, "runes", "");
			SpriteMask.title_muteSprite = WorldMapRectangle.method1530(var1, "title_mute", "");
			class104.options_buttons_0Sprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			DynamicObject.field817 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class177.options_buttons_2Sprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			NPC.field1058 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class251.field2296 = class104.options_buttons_0Sprite.subWidth;
			class60.field312 = class104.options_buttons_0Sprite.subHeight;
			class237.field2150 = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field769 = new String[8];
				Login.field752 = 0;
			}

			class322.field2850 = 0;
			SoundSystem.otp = "";
			Login.field745 = true;
			Login.worldSelectOpen = false;
			if (!class10.clientPreferences.getTitleMusicDisabled()) {
				LoginPacket.method1612(2, ReflectionCheck.archive6, "scape main", "", 255, false);
			} else {
				class304.musicPlayerStatus = 1;
				UserComparator9.musicTrackArchive = null;
				VarbitComposition.musicTrackGroupId = -1;
				class304.musicTrackFileId = -1;
				class304.musicTrackVolume = 0;
				class132.musicTrackBoolean = false;
				class157.pcmSampleLength = 2;
			}

			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var6 = new Buffer(4);
					var6.writeByte(3);
					var6.writeMedium(0);
					NetCache.NetCache_socket.write(var6.array, 0, 4);
				} catch (IOException var9) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var8) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = true;
			Login.xPadding = (class448.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class485.loginBoxCenter = Login.loginBoxX + 180;
			Decimator.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class13.logoSprite.drawAt(Login.xPadding + 382 - class13.logoSprite.subWidth / 2, 18);
		}
	}
}
