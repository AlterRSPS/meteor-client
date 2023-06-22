import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ax")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ap")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("ab")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ak")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ae")
	int field1047;
	@ObfuscatedName("af")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ao")
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("aa")
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("aj")
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ad")
	int field1046;
	@ObfuscatedName("ac")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("ag")
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ar")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		super();
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1046 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method520(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Ltz;)V"
	)
	ClientPreferences(Buffer var1) {
		super();
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1046 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1046 = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.displayFps = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field1047 = var1.readInt();
				}
			} else {
				this.method520(true);
			}
		} else {
			this.method520(true);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1462329422"
	)
	void method520(boolean var1) {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ltz;",
		garbageValue = "-348625760"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(417, true);
		var1.writeByte(10);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(100.0D * this.brightness));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1046);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1047);
		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "88"
	)
	@Export("setRoofsHidden")
	void setRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-159985790"
	)
	@Export("getRoofsHidden")
	boolean getRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2020795504"
	)
	@Export("setIsUsernameHidden")
	void setIsUsernameHidden(boolean var1) {
		this.hideUsername = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-241151903"
	)
	@Export("getIsUsernameHidden")
	boolean getIsUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1777922060"
	)
	@Export("getTitleMusicDisabled")
	void getTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "916898062"
	)
	@Export("getTitleMusicDisabled")
	boolean getTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-802422956"
	)
	void method528(boolean var1) {
		this.displayFps = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1463973224"
	)
	void method529() {
		this.method528(!this.displayFps);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1058971500"
	)
	boolean method530() {
		return this.displayFps;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	void method531(int var1) {
		this.field1047 = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "50"
	)
	int method532() {
		return this.field1047;
	}

	@ObfuscatedName("ac")
	@Export("setBrightness")
	void setBrightness(double var1) {
		this.brightness = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "2139719352"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-785495624"
	)
	@Export("setCurrentMusicVolume")
	void setCurrentMusicVolume(int var1) {
		this.musicVolume = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-114"
	)
	@Export("getCurrentMusicVolume")
	int getCurrentMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "119052956"
	)
	@Export("setCurrentSoundEffectVolume")
	void setCurrentSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "100000"
	)
	@Export("getCurrentSoundEffectsVolume")
	int getCurrentSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-530057745"
	)
	@Export("setAreaSoundEffectsVolume")
	void setAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1910006932"
	)
	@Export("getAreaSoundEffectsVolume")
	int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1306932180"
	)
	@Export("setUsernameToRemember")
	void setUsernameToRemember(String var1) {
		this.rememberedUsername = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "55347313"
	)
	@Export("getUsernameToRemember")
	String getUsernameToRemember() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-149482019"
	)
	void method543(int var1) {
		this.field1046 = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1091864789"
	)
	int method544() {
		return this.field1046;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1420446119"
	)
	void method545(int var1) {
		this.windowMode = var1;
		class100.savePreferences();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1841437351"
	)
	int method546() {
		return this.windowMode;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "678280572"
	)
	void method547(String var1, int var2) {
		int var3 = this.method550(var1);
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
			Iterator var4 = this.parameters.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.parameters.put(var3, var2);
		class100.savePreferences();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "57"
	)
	boolean method548(String var1) {
		int var2 = this.method550(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1511870766"
	)
	int method549(String var1) {
		int var2 = this.method550(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-463731062"
	)
	int method550(String var1) {
		return class226.method1214(var1.toLowerCase());
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "894800838"
	)
	static final int method519(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;I)V",
		garbageValue = "-2033054867"
	)
	static void method551(Font var0, Font var1) {
		if (class16.worldSelectBackSprites == null) {
			class16.worldSelectBackSprites = CollisionMap.method1116(class180.archive8, "sl_back", "");
		}

		if (class134.worldSelectFlagSprites == null) {
			class134.worldSelectFlagSprites = WorldMapRectangle.method1530(class180.archive8, "sl_flags", "");
		}

		if (class1.worldSelectArrows == null) {
			class1.worldSelectArrows = WorldMapRectangle.method1530(class180.archive8, "sl_arrows", "");
		}

		if (class342.worldSelectStars == null) {
			class342.worldSelectStars = WorldMapRectangle.method1530(class180.archive8, "sl_stars", "");
		}

		if (class299.worldSelectLeftSprite == null) {
			class299.worldSelectLeftSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(class180.archive8, "leftarrow", "");
		}

		if (class128.worldSelectRightSprite == null) {
			class128.worldSelectRightSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(class180.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class342.worldSelectStars != null) {
			class342.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class342.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (class1.worldSelectArrows != null) {
			int var2 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				class1.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				class1.worldSelectArrows[0].drawAt(var2, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				class1.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				class1.worldSelectArrows[1].drawAt(var2 + 15, 4);
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1);
			int var3 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				class1.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				class1.worldSelectArrows[0].drawAt(var3, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				class1.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				class1.worldSelectArrows[1].drawAt(var3 + 15, 4);
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				class1.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class1.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				class1.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class1.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				class1.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class1.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				class1.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class1.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (class16.worldSelectBackSprites != null) {
			byte var23 = 88;
			byte var24 = 19;
			var4 = 765 / (var23 + 1) - 1;
			var5 = 480 / (var24 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var5 != var6 || var7 != var4);

			var6 = (765 - var4 * var23) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var24 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var4 * var23 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class299.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class299.worldSelectLeftSprite.drawAt(8, class270.canvasHeight / 2 - class299.worldSelectLeftSprite.subHeight / 2);
			}

			if (class128.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				class128.worldSelectRightSprite.drawAt(class448.canvasWidth - class128.worldSelectRightSprite.subWidth - 8, class270.canvasHeight / 2 - class128.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = World.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				class107 var20 = null;
				int var21 = 0;
				if (var17.isBeta()) {
					var20 = var17.isMembersOnly() ? class107.field1110 : class107.field1103;
				} else if (var17.isDeadman()) {
					var20 = var17.isMembersOnly() ? class107.field1108 : class107.field1104;
				} else if (var17.method385()) {
					var21 = 16711680;
					var20 = var17.isMembersOnly() ? class107.field1113 : class107.field1117;
				} else if (var17.method387()) {
					var20 = var17.isMembersOnly() ? class107.field1107 : class107.field1106;
				} else if (var17.isPvp()) {
					var20 = var17.isMembersOnly() ? class107.field1114 : class107.field1116;
				} else if (var17.method388()) {
					var20 = var17.isMembersOnly() ? class107.field1102 : class107.field1112;
				} else if (var17.method389()) {
					var20 = var17.isMembersOnly() ? class107.field1105 : class107.field1109;
				}

				if (var20 == null || var20.field1118 >= class16.worldSelectBackSprites.length) {
					var20 = var17.isMembersOnly() ? class107.field1111 : class107.field1115;
				}

				if (MouseHandler.MouseHandler_x * -1367600295 >= var12 && MouseHandler.MouseHandler_y * -808246845 >= var11 && MouseHandler.MouseHandler_x * -1367600295 < var23 + var12 && MouseHandler.MouseHandler_y * -808246845 < var24 + var11 && var18) {
					Login.hoveredWorldIndex = var16;
					class16.worldSelectBackSprites[var20.field1118].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					class16.worldSelectBackSprites[var20.field1118].drawAt(var12, var11);
				}

				if (class134.worldSelectFlagSprites != null) {
					class134.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.field_72), var12 + 15, var24 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var7 + var24;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var23 + var6;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var22 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y * -808246845 + 25;
				if (var25 + var22 > 480) {
					var25 = MouseHandler.MouseHandler_y * -808246845 - 25 - var22;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x * -1367600295 - var16 / 2, var25, var16, var22, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x * -1367600295 - var16 / 2, var25, var16, var22, 0);
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x * -1367600295, var25 + var1.ascent + 4, 0, -1);
			}
		}

		WorldMapSectionType.rasterProvider.drawFull(0, 0);
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-160449783"
	)
	static void method552(int var0, int var1, int var2) {
		if (var0 != 0) {
			int var3 = var0 >> 8;
			int var4 = var0 >> 4 & 7;
			int var5 = var0 & 15;
			Client.soundEffectIds[Client.soundEffectCount] = var3;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
			Client.soundEffects[Client.soundEffectCount] = null;
			int var6 = (var1 - 64) / 128;
			int var7 = (var2 - 64) / 128;
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16);
			++Client.soundEffectCount;
		}
	}
}
