import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ad")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("wp")
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("aa")
	public static short[][] field37;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("this$1")
	@ObfuscatedName("this$1")
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	class13(class12 var1) {
		super();
		this.this$1 = var1;
	}

	@Export("getClientExtensions")
	@ObfuscatedName("getClientExtensions")
	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (var1 == null) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	@Export("getAuthentication")
	@ObfuscatedName("getAuthentication")
	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1260252109"
	)
	static int method44(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		int var11;
		if (var0 == 1300) {
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class149.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == 1301) {
				Interpreter.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var4.parent = class158.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == 1302) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1303) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == 1304) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == 1305) {
				var4.dataText = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == 1306) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == 1307) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--Interpreter.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var9;
				if (var0 != 1350) {
					byte var5;
					if (var0 == 1351) {
						Interpreter.Interpreter_intStackSize -= 2;
						var5 = 10;
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
						byte[] var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
						Login.Widget_setKey(var4, var5, var9, var10);
						return 1;
					} else if (var0 == 1352) {
						Interpreter.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							JagexCache.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						JagexCache.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == 1354) {
						--Interpreter.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							SceneTilePaint.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var5 = 10;
						SceneTilePaint.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var8 = null;
					var9 = null;
					if (var3) {
						Interpreter.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var8 = new byte[var7 / 2];
							var9 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize];
								var9[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1];
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						Login.Widget_setKey(var4, var7, var8, var9);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1982471719"
	)
	static int method45(int var0, Script var1, boolean var2) {
		if (var0 == 3300) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == 3301) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapIcon_1.method1400(var3, var4);
				return 1;
			} else if (var0 == 3302) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class215.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == 3303) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class316.method1694(var3, var4);
				return 1;
			} else if (var0 == 3304) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class381.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == 3305) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == 3306) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == 3307) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == 3308) {
					var3 = Clock.Client_plane;
					var4 = (Projectile.localPlayer.field_27 >> 7) + class213.baseX;
					var5 = (Projectile.localPlayer.field_28 >> 7) + class101.baseY;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == 3309) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == 3310) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == 3311) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == 3312) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == 3313) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapIcon_1.method1400(var3, var4);
					return 1;
				} else if (var0 == 3314) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class215.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == 3315) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class316.method1694(var3, var4);
					return 1;
				} else if (var0 == 3316) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 3317) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == 3318) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == 3321) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == 3322) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == 3323) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == 3325) {
					Interpreter.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.lastMouseRecordX;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.lastMouseRecordY;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "350235403"
	)
	static final void method46(int var0, int var1, int var2, boolean var3) {
		if (Client.loadInterface(var0)) {
			class104.resizeInterface(class16.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
