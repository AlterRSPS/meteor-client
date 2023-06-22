import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("VertexNormal")
public class VertexNormal {
	// $FF: renamed from: x int
	@ObfuscatedName("at")
	@Export("x")
	int field_42;
	// $FF: renamed from: y int
	@ObfuscatedName("an")
	@Export("y")
	int field_43;
	// $FF: renamed from: z int
	@ObfuscatedName("av")
	@Export("z")
	int field_44;
	@ObfuscatedName("as")
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
		super();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljx;)V"
	)
	VertexNormal(VertexNormal var1) {
		super();
		this.field_42 = var1.field_42;
		this.field_43 = var1.field_43;
		this.field_44 = var1.field_44;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(DDIS)[D",
		garbageValue = "512"
	)
	public static double[] method1350(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = ((double)var7 - var0) / var2;
			double var13 = Math.exp(-var15 * var15 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var11 = var13 / var2;
			var6[var8] = var11;
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1596696575"
	)
	static final int method1351() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1251567358"
	)
	static int method1352(int var0, Script var1, boolean var2) {
		if (var0 == 3800) {
			if (class389.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
				class309.field2795 = class389.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == 3801) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					class309.field2795 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class309.field2795.name;
				return 1;
			} else if (var0 == 3803) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.field1360;
				return 1;
			} else if (var0 == 3805) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.field1361;
				return 1;
			} else if (var0 == 3806) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.field1362;
				return 1;
			} else if (var0 == 3807) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.field1359;
				return 1;
			} else if (var0 == 3809) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.memberCount;
				return 1;
			} else if (var0 == 3810) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class309.field2795.memberNames[var3];
				return 1;
			} else if (var0 == 3811) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.memberRanks[var3];
				return 1;
			} else if (var0 == 3812) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.bannedMemberCount;
				return 1;
			} else if (var0 == 3813) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class309.field2795.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == 3814) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.method792(var3, var6, var5);
					return 1;
				} else if (var0 == 3815) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.currentOwner;
					return 1;
				} else if (var0 == 3816) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.field1364;
					return 1;
				} else if (var0 == 3817) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.method791(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == 3818) {
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class309.field2795.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == 3819) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					ChatChannel.method440(var6, var3);
					return 1;
				} else if (var0 == 3820) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.field1368[var3];
					return 1;
				} else {
					if (var0 == 3821) {
						Interpreter.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						GrandExchangeOfferOwnWorldComparator.method342(var5, var3, var4);
					}

					if (var0 == 3822) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class309.field2795.field1358[var3] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (class195.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							Interpreter.field700 = class195.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							Interpreter.field700 = Client.currentClanChannels[var3];
							Interpreter.field703 = var3;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Interpreter.field700.name;
						return 1;
					} else if (var0 == 3853) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field700.field1401;
						return 1;
					} else if (var0 == 3854) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field700.field1400;
						return 1;
					} else if (var0 == 3855) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field700.method842();
						return 1;
					} else if (var0 == 3856) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ((ClanChannelMember)Interpreter.field700.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == 3857) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field700.members.get(var3)).rank;
						return 1;
					} else if (var0 == 3858) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field700.members.get(var3)).world;
						return 1;
					} else if (var0 == 3859) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						class300.method1619(Interpreter.field703, var3);
						return 1;
					} else if (var0 == 3860) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field700.method843(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == 3861) {
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Interpreter.field700.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == 3890) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class127.varclan != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2021351329"
	)
	static final void method1353() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.endCycle == -1) {
				var0.startCycle = 0;
				DirectByteArrayCopier.method1862(var0);
			} else {
				var0.remove();
			}
		}

	}
}
