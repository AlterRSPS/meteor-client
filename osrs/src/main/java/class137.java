import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public enum class137 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1294(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1291(1, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1295(2, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1293(3, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1296(4, 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1292(5, 5),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1288(6, 6),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1290(7, 7),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1289(8, 8);

	@ObfuscatedName("ux")
	static int field1286;
	@ObfuscatedName("hj")
	static SecureRandom field1287;
	@ObfuscatedName("af")
	final int field1297;
	@ObfuscatedName("ao")
	final int field1298;

	class137(int var3, int var4) {
		this.field1297 = var3;
		this.field1298 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1298;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "959853468"
	)
	static final float method732(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (1.0075567F * var1 - 75.56675F) / var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltl;ILdh;II)V",
		garbageValue = "-1720676100"
	)
	static final void method734(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = MoveSpeed.STATIONARY.speed;
		int var5;
		int var6;
		if ((var3 & 32) != 0) {
			var5 = var0.readUnsignedShortLE();
			if (var5 == 65535) {
				var5 = -1;
			}

			var6 = var0.method2531();
			ServerPacket.performPlayerAnimation(var2, var5, var6);
		}

		int var7;
		int var10;
		int var11;
		if ((var3 & 256) != 0) {
			var5 = var0.readUnsignedShortAdd();
			var6 = var5 >> 8;
			var7 = var6 >= 13 && var6 <= 20 ? var6 - 12 : 0;
			PlayerType var8 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var0.method2531());
			boolean var9 = var0.readUnsignedByte() == 1;
			var10 = var0.method2531();
			var11 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var12 = false;
				if (var8.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(var2.username)) {
					var12 = true;
				}

				if (!var12 && Client.field488 == 0 && !var2.isHidden) {
					Players.field1100.offset = 0;
					var0.method2556(Players.field1100.array, 0, var10);
					Players.field1100.offset = 0;
					String var13 = AbstractFont.escapeBrackets(class290.method1603(class16.readString(Players.field1100)));
					var2.overheadText = var13.trim();
					var2.field973 = var5 >> 8;
					var2.field980 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					byte[] var14 = null;
					int var15;
					if (var7 > 0 && var7 <= 8) {
						var14 = new byte[var7];

						for (var15 = 0; var15 < var7; ++var15) {
							var14[var15] = var0.method2535();
						}
					}

					var2.field1007 = class169.method886(var14);
					var2.isAutoChatting = var9;
					var2.showPublicPlayerChat = var2 != Projectile.localPlayer && var8.isUser && "" != Client.field599 && var13.toLowerCase().indexOf(Client.field599) == -1;
					if (var8.isPrivileged) {
						var15 = var9 ? 91 : 1;
					} else {
						var15 = var9 ? 90 : 2;
					}

					if (var8.modIcon != -1) {
						class59.addGameMessage(var15, class100.addImageTag(var8.modIcon) + var2.username.getName(), var13);
					} else {
						class59.addGameMessage(var15, var2.username.getName(), var13);
					}
				}
			}

			var0.offset = var11 + var10 + var7;
		}

		if ((var3 & 16384) != 0) {
			var4 = var0.method2534();
		}

		int var16;
		int var22;
		if ((var3 & 65536) != 0) {
			var5 = var0.readUnsignedByteAdd();

			for (var6 = 0; var6 < var5; ++var6) {
				var7 = var0.readUnsignedByte();
				var16 = var0.readUnsignedShortAdd();
				var22 = var0.method2555();
				var2.method498(var7, var16, var22 >> 16, var22 & 65535);
			}
		}

		if ((var3 & 4096) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 2048) != 0) {
			MoveSpeed[] var17 = Players.playerMovementSpeeds;
			MoveSpeed[] var18 = new MoveSpeed[]{MoveSpeed.CRAWL, MoveSpeed.WALK, MoveSpeed.RUN, MoveSpeed.STATIONARY};
			var17[var1] = (MoveSpeed)GameObject.findEnumerated(var18, var0.method2535());
		}

		int var24;
		if ((var3 & 64) != 0) {
			var5 = var0.readUnsignedShort();
			PlayerType var19 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var0.method2531());
			boolean var21 = var0._readUnsignedByteSub() == 1;
			var16 = var0.readUnsignedByte();
			var22 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var23 = false;
				if (var19.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(var2.username)) {
					var23 = true;
				}

				if (!var23 && Client.field488 == 0 && !var2.isHidden) {
					Players.field1100.offset = 0;
					var0.method2556(Players.field1100.array, 0, var16);
					Players.field1100.offset = 0;
					String var20 = AbstractFont.escapeBrackets(class290.method1603(class16.readString(Players.field1100)));
					var2.overheadText = var20.trim();
					var2.field973 = var5 >> 8;
					var2.field980 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.field1007 = null;
					var2.isAutoChatting = var21;
					var2.showPublicPlayerChat = var2 != Projectile.localPlayer && var19.isUser && "" != Client.field599 && var20.toLowerCase().indexOf(Client.field599) == -1;
					if (var19.isPrivileged) {
						var24 = var21 ? 91 : 1;
					} else {
						var24 = var21 ? 90 : 2;
					}

					if (var19.modIcon != -1) {
						class59.addGameMessage(var24, class100.addImageTag(var19.modIcon) + var2.username.getName(), var20);
					} else {
						class59.addGameMessage(var24, var2.username.getName(), var20);
					}
				}
			}

			var0.offset = var22 + var16;
		}

		if ((var3 & 1) != 0) {
			var5 = var0.method2531();
			if (var5 > 0) {
				for (var6 = 0; var6 < var5; ++var6) {
					var16 = -1;
					var22 = -1;
					var10 = -1;
					var7 = var0.readUShortSmart();
					if (var7 == 32767) {
						var7 = var0.readUShortSmart();
						var22 = var0.readUShortSmart();
						var16 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
					} else if (var7 != 32766) {
						var22 = var0.readUShortSmart();
					} else {
						var7 = -1;
					}

					var11 = var0.readUShortSmart();
					var2.addHitSplat(var7, var22, var16, var10, Client.cycle, var11);
				}
			}

			var6 = var0._readUnsignedByteSub();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var16 = var0.readUShortSmart();
					var22 = var0.readUShortSmart();
					if (var22 != 32767) {
						var10 = var0.readUShortSmart();
						var11 = var0.readUnsignedByteAdd();
						var24 = var22 > 0 ? var0.readUnsignedByteAdd() : var11;
						var2.addHealthBar(var16, Client.cycle, var22, var10, var11, var24);
					} else {
						var2.removeHealthBar(var16);
					}
				}
			}
		}

		if ((var3 & 16) != 0) {
			var2.targetIndex = var0.readUnsignedShortAdd();
			var2.targetIndex += var0.method2531() << 16;
			var5 = 16777215;
			if (var2.targetIndex == var5) {
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 1024) != 0) {
			var2.field992 = var0.method2535();
			var2.field987 = var0.method2534();
			var2.field999 = var0.method2535();
			var2.field1000 = var0.readByte();
			var2.spotAnimation = var0.readUnsignedByteNeg() + Client.cycle;
			var2.exactMoveArrive1Cycle = var0.readUnsignedShort() + Client.cycle;
			var2.exactMoveDirection = var0.readUnsignedShortAdd();
			if (var2.hasMovementPending) {
				var2.field992 += var2.tileX;
				var2.field987 += var2.tileY;
				var2.field999 += var2.tileX;
				var2.field1000 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field992 += var2.pathX[0];
				var2.field987 += var2.pathY[0];
				var2.field999 += var2.pathX[0];
				var2.field1000 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1002 = 0;
		}

		if ((var3 & 128) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				class59.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == Projectile.localPlayer) {
				class59.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.isAutoChatting = false;
			var2.field973 = 0;
			var2.field980 = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByteAdd();
			byte[] var27 = new byte[var5];
			Buffer var26 = new Buffer(var27);
			var0.method2557(var27, 0, var5);
			Players.cachedAppearanceBuffer[var1] = var26;
			var2.read(var26);
		}

		if ((var3 & 2) != 0) {
			var2.movingOrientation = var0.readUnsignedShortLE();
			if (var2.pathLength == 0) {
				var2.orientation = var2.movingOrientation;
				var2.method502();
			}
		}

		if ((var3 & 32768) != 0) {
			var2.recolourStartCycle = Client.cycle + var0.readUnsignedShort();
			var2.recolourEndCycle = Client.cycle + var0.readUnsignedShort();
			var2.recolourHue = var0.readByte();
			var2.recolourSaturation = var0.method2534();
			var2.recolourLuminance = var0.readByte();
			var2.recolourAmount = (byte)var0.readUnsignedByte();
		}

		if (var2.hasMovementPending) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				MoveSpeed var25;
				if (var4 != MoveSpeed.STATIONARY.speed) {
					MoveSpeed[] var28 = new MoveSpeed[]{MoveSpeed.CRAWL, MoveSpeed.WALK, MoveSpeed.RUN, MoveSpeed.STATIONARY};
					var25 = (MoveSpeed)GameObject.findEnumerated(var28, var4);
				} else {
					var25 = Players.playerMovementSpeeds[var1];
				}

				var2.move(var2.tileX, var2.tileY, var25);
			}
		}

	}
}
