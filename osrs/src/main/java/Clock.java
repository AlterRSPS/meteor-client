import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("ug")
	static int field1468;
	@ObfuscatedName("uy")
	static int field1469;
	@ObfuscatedName("al")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("mh")
	@Export("Client_plane")
	static int Client_plane;

	Clock() {
		super();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1909200559"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-4"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldz;S)V",
		garbageValue = "-20398"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		SoundSystem.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lny;IB)V",
		garbageValue = "-118"
	)
	static void method921(Archive var0, int var1) {
		if (var0.field3478) {
			if (var1 <= NetCache.field3524) {
				throw new RuntimeException("");
			}

			if (var1 < NetCache.field3525) {
				NetCache.field3525 = var1;
			}
		} else {
			if (var1 >= NetCache.field3525) {
				throw new RuntimeException("");
			}

			if (var1 > NetCache.field3524) {
				NetCache.field3524 = var1;
			}
		}

		if (class411.field3706 != null) {
			Fonts.method2397(var0, var1);
		} else {
			class341.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ldi;B)V",
		garbageValue = "54"
	)
	static final void method922(Actor var0) {
		var0.movementSequence = var0.idleSequence * 794059635;
		if (var0.pathLength == 0) {
			var0.field1003 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = WorldMapLabelSize.SequenceDefinition_get(var0.sequence);
				if (var0.field1002 > 0 && var1.precedenceAnimating == 0) {
					++var0.field1003;
					return;
				}

				if (var0.field1002 <= 0 && var1.priority == 0) {
					++var0.field1003;
					return;
				}
			}

			int var10 = var0.field_27;
			int var2 = var0.field_28;
			int var3 = var0.field950 * 64 + var0.pathX[var0.pathLength - 1] * 128;
			int var4 = var0.field950 * 64 + var0.pathY[var0.pathLength - 1] * 128;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			MoveSpeed var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence * -1413662117;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence * -1750832729;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence * -1883673513;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence * 869678791;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence * -1750832729;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field997 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1003 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1003;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1003 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1003;
					}
				}

				if (var5 == MoveSpeed.RUN) {
					var8 <<= 1;
				} else if (var5 == MoveSpeed.CRAWL) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var0.walkSequence * -1750832729 == var0.movementSequence && var0.runSequence * -918440347 != -1) {
						var0.movementSequence = var0.runSequence * -918440347;
					} else if (var0.movementSequence == var0.walkBackSequence * -1413662117 && var0.runBackSequence * 2104873647 != -1) {
						var0.movementSequence = var0.runBackSequence * 2104873647;
					} else if (var0.movementSequence == var0.walkLeftSequence * 869678791 && var0.runLeftSequence * -2065983661 != -1) {
						var0.movementSequence = var0.runLeftSequence * -2065983661;
					} else if (var0.walkRightSequence * -1883673513 == var0.movementSequence && var0.runRightSequence * 542922035 != -1) {
						var0.movementSequence = var0.runRightSequence * 542922035;
					}
				} else if (var8 <= 1) {
					if (var0.walkSequence * -1750832729 == var0.movementSequence && var0.crawlSequence * 10611111 != -1) {
						var0.movementSequence = var0.crawlSequence * 10611111;
					} else if (var0.movementSequence == var0.walkBackSequence * -1413662117 && var0.crawlBackSequence * -1835981853 != -1) {
						var0.movementSequence = var0.crawlBackSequence * -1835981853;
					} else if (var0.movementSequence == var0.walkLeftSequence * 869678791 && var0.crawlLeftSequence * -848741867 != -1) {
						var0.movementSequence = var0.crawlLeftSequence * -848741867;
					} else if (var0.walkRightSequence * -1883673513 == var0.movementSequence && var0.crawlRightSequence * 1057863331 != -1) {
						var0.movementSequence = var0.crawlRightSequence * 1057863331;
					}
				}

				if (var3 != var10 || var2 != var4) {
					if (var10 < var3) {
						var0.field_27 += var8;
						if (var0.field_27 > var3) {
							var0.field_27 = var3;
						}
					} else if (var10 > var3) {
						var0.field_27 -= var8;
						if (var0.field_27 < var3) {
							var0.field_27 = var3;
						}
					}

					if (var2 < var4) {
						var0.field_28 += var8;
						if (var0.field_28 > var4) {
							var0.field_28 = var4;
						}
					} else if (var2 > var4) {
						var0.field_28 -= var8;
						if (var0.field_28 < var4) {
							var0.field_28 = var4;
						}
					}
				}

				if (var3 == var0.field_27 && var4 == var0.field_28) {
					--var0.pathLength;
					if (var0.field1002 > 0) {
						--var0.field1002;
					}
				}

			} else {
				var0.field_27 = var3;
				var0.field_28 = var4;
				--var0.pathLength;
				if (var0.field1002 > 0) {
					--var0.field1002;
				}

			}
		}
	}
}
