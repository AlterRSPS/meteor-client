import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class166 extends class142 {
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("at")
	int field1411;
	@ObfuscatedName("an")
	long field1412;
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
	class166(class145 var1) {
		super();
		this.this$0 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		this.field1411 = var1.readInt();
		this.field1412 = var1.readLong();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.method806(this.field1411, this.field1412);
	}

	@ObfuscatedName("av")
	public static int method861(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lcg;",
		garbageValue = "-1307291801"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfg;",
		garbageValue = "-27"
	)
	static class130[] method859() {
		return new class130[]{class130.field1244, class130.field1241, class130.field1245, class130.field1243, class130.field1246, class130.field1242};
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "1746629784"
	)
	static final void method864(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field447; ++var1) {
			int var2 = Client.field552[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			if ((var4 & 8) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 8;
			}

			if ((var4 & 2048) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 16;
			}

			if ((var4 & 256) != 0) {
				var3.recolourStartCycle = Client.cycle + var0.readUnsignedShortLE();
				var3.recolourEndCycle = Client.cycle + var0.readUnsignedShortAdd();
				var3.recolourHue = var0.method2534();
				var3.recolourSaturation = var0.method2535();
				var3.recolourLuminance = var0.method2534();
				var3.recolourAmount = (byte)var0._readUnsignedByteSub();
			}

			if ((var4 & 1024) != 0) {
				var3.field992 = var0.method2536();
				var3.field987 = var0.method2535();
				var3.field999 = var0.method2535();
				var3.field1000 = var0.method2535();
				var3.spotAnimation = var0.readUnsignedShort() + Client.cycle;
				var3.exactMoveArrive1Cycle = var0.readUnsignedShortAdd() + Client.cycle;
				var3.exactMoveDirection = var0.readUnsignedShort();
				var3.pathLength = 1;
				var3.field1002 = 0;
				var3.field992 += var3.pathX[0];
				var3.field987 += var3.pathY[0];
				var3.field999 += var3.pathX[0];
				var3.field1000 += var3.pathY[0];
			}

			int var6;
			int var7;
			int var8;
			if ((var4 & 1) != 0) {
				var5 = var0.readUnsignedShortAdd();
				var6 = var0.readUnsignedByteNeg();
				var3.field941 = var0.readUnsignedByteAdd() == 1;
				if (Client.param25 >= 212) {
					var3.field978 = var5;
					var3.field972 = var6;
				} else {
					var7 = var3.field_27 - (var5 - class213.baseX - class213.baseX) * 64;
					var8 = var3.field_28 - (var6 - class101.baseY - class101.baseY) * 64;
					if (var7 != 0 || var8 != 0) {
						var3.movingOrientation = class398.method2106(var7, var8);
					}
				}
			}

			if ((var4 & 128) != 0) {
				var3.definition = Bounds.getNpcDefinition(var0.readUnsignedShortAdd());
				class381.method2001(var3);
				var3.method571();
			}

			int var9;
			if ((var4 & 262144) != 0) {
				var5 = var0.readUnsignedByteAdd();

				for (var6 = 0; var6 < var5; ++var6) {
					var7 = var0.readUnsignedByte();
					var8 = var0.readUnsignedShortLE();
					var9 = var0.readInt();
					var3.method498(var7, var8, var9 >> 16, var9 & 65535);
				}
			}

			if ((var4 & 16) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			if ((var4 & 16384) != 0) {
				var3.field1004 = var0.readInt() * 1233162511;
			}

			int var10;
			if ((var4 & 2) != 0) {
				var5 = var0._readUnsignedByteSub();
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.readUnsignedByte();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByte();
							int var12 = var9 > 0 ? var0._readUnsignedByteSub() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((var4 & 64) != 0) {
				var3.targetIndex = var0.readUnsignedByteNeg();
				var3.targetIndex += var0.readUnsignedByte() << 16;
				var5 = 16777215;
				if (var5 == var3.targetIndex) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 32) != 0) {
				var0.readUnsignedShortLE();
				var0.readInt();
			}

			int[] var13;
			short[] var14;
			if ((var4 & 131072) != 0) {
				var5 = var0.method2531();
				var13 = new int[8];
				var14 = new short[8];

				for (var8 = 0; var8 < 8; ++var8) {
					if ((var5 & 1 << var8) != 0) {
						var13[var8] = var0.method2518();
						var14[var8] = (short)var0.method2515();
					} else {
						var13[var8] = -1;
						var14[var8] = -1;
					}
				}

				var3.method570(var13, var14);
			}

			if ((var4 & 65536) != 0) {
				var5 = var0.method2553();
				var3.turnLeftSequence = ((var5 & 1) != 0 ? var0.readUnsignedShortAdd() : var3.definition.turnLeftSequence * 1524655211) * -1543559101;
				var3.turnRightSequence = ((var5 & 2) != 0 ? var0.readUnsignedShortAdd() : 1228215405 * var3.definition.turnRightSequence) * 531240293;
				var3.walkSequence = ((var5 & 4) != 0 ? var0.readUnsignedByteNeg() : var3.definition.walkSequence * -1750832729) * 597536279;
				var3.walkBackSequence = ((var5 & 8) != 0 ? var0.readUnsignedShortAdd() : var3.definition.walkBackSequence * -1413662117) * -2105973293;
				var3.walkLeftSequence = ((var5 & 16) != 0 ? var0.readUnsignedShortAdd() : 869678791 * var3.definition.walkLeftSequence) * 1903502071;
				var3.walkRightSequence = ((var5 & 32) != 0 ? var0.readUnsignedShort() : var3.definition.walkRightSequence * -1883673513) * 363085671;
				var3.runSequence = ((var5 & 64) != 0 ? var0.readUnsignedByteNeg() : var3.definition.runSequence * -918440347) * -452785299;
				var3.runBackSequence = ((var5 & 128) != 0 ? var0.readUnsignedShortLE() : 2104873647 * var3.definition.runBackSequence) * -812989361;
				var3.runLeftSequence = ((var5 & 256) != 0 ? var0.readUnsignedByteNeg() : -2065983661 * var3.definition.runLeftSequence) * -816921381;
				var3.runRightSequence = ((var5 & 512) != 0 ? var0.readUnsignedShortAdd() : var3.definition.runRightSequence * 542922035) * 1183297019;
				var3.crawlSequence = ((var5 & 1024) != 0 ? var0.readUnsignedShortLE() : var3.definition.crawlSequence * 10611111) * 432549399;
				var3.crawlBackSequence = ((var5 & 2048) != 0 ? var0.readUnsignedShortAdd() : -1835981853 * var3.definition.crawlBackSequence) * -732350005;
				var3.crawlLeftSequence = ((var5 & 4096) != 0 ? var0.readUnsignedShort() : -848741867 * var3.definition.crawlLeftSequence) * 957334845;
				var3.crawlRightSequence = ((var5 & 8192) != 0 ? var0.readUnsignedShortAdd() : var3.definition.crawlRightSequence * 1057863331) * 987737355;
				var3.idleSequence = ((var5 & 16384) != 0 ? var0.readUnsignedByteNeg() : 794059635 * var3.definition.idleSequence) * -1715570245;
			}

			if ((var4 & 4) != 0) {
				var5 = var0.readUnsignedByteNeg();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.method2531();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = WorldMapLabelSize.SequenceDefinition_get(var5).replyMode;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.currentSequenceFrameIndex = 0;
					}

					if (var7 == 2) {
						var3.currentSequenceFrameIndex = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || WorldMapLabelSize.SequenceDefinition_get(var5).forcedPriority >= WorldMapLabelSize.SequenceDefinition_get(var3.sequence).forcedPriority) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.currentSequenceFrameIndex = 0;
					var3.field1002 = var3.pathLength;
				}
			}

			if ((var4 & 4096) != 0) {
				var3.method560(var0.readUnsignedByteAdd());
			}

			short[] var15;
			long var16;
			boolean var18;
			if ((var4 & 512) != 0) {
				var5 = var0._readUnsignedByteSub();
				if ((var5 & 1) == 1) {
					var3.method575();
				} else {
					var13 = null;
					if ((var5 & 2) == 2) {
						var7 = var0._readUnsignedByteSub();
						var13 = new int[var7];

						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var0.readUnsignedByteNeg();
							var9 = var9 == 65535 ? -1 : var9;
							var13[var8] = var9;
						}
					}

					var14 = null;
					if ((var5 & 4) == 4) {
						var8 = 0;
						if (var3.definition.recolorTo != null) {
							var8 = var3.definition.recolorTo.length;
						}

						var14 = new short[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var14[var9] = (short)var0.readUnsignedShortAdd();
						}
					}

					var15 = null;
					if ((var5 & 8) == 8) {
						var9 = 0;
						if (var3.definition.retextureTo != null) {
							var9 = var3.definition.retextureTo.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.readUnsignedShortAdd();
						}
					}

					var18 = false;
					if ((var5 & 16) != 0) {
						var18 = var0._readUnsignedByteSub() == 1;
					}

					var16 = (long)(++NPC.field1056 - 1);
					var3.method572(new NewShit(var16, var13, var14, var15, var18));
				}
			}

			if ((var4 & 8192) != 0) {
				var5 = var0.readUnsignedByteAdd();
				if ((var5 & 1) == 1) {
					var3.method576();
				} else {
					var13 = null;
					if ((var5 & 2) == 2) {
						var7 = var0.readUnsignedByte();
						var13 = new int[var7];

						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var0.readUnsignedByteNeg();
							var9 = var9 == 65535 ? -1 : var9;
							var13[var8] = var9;
						}
					}

					var14 = null;
					if ((var5 & 4) == 4) {
						var8 = 0;
						if (var3.definition.recolorTo != null) {
							var8 = var3.definition.recolorTo.length;
						}

						var14 = new short[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var14[var9] = (short)var0.readUnsignedShortLE();
						}
					}

					var15 = null;
					if ((var5 & 8) == 8) {
						var9 = 0;
						if (var3.definition.retextureTo != null) {
							var9 = var3.definition.retextureTo.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.readUnsignedByteNeg();
						}
					}

					var18 = false;
					if ((var5 & 16) != 0) {
						var18 = var0.readUnsignedByte() == 1;
					}

					var16 = (long)(++NPC.field1057 - 1);
					var3.method574(new NewShit(var16, var13, var14, var15, var18));
				}
			}

			if ((var4 & 32768) != 0) {
				var3.method559(var0.readStringCp1252NullTerminated());
			}
		}

	}
}
