import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("at")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
		super();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lod;Lod;B)I",
		garbageValue = "-2"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	@Export("compare")
	@ObfuscatedName("compare")
	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@Export("equals")
	@ObfuscatedName("equals")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-353159038"
	)
	static int method341(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 100) {
			Interpreter.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = FriendSystem.getWidget(var3);
				if (var6.children == null) {
					var6.children = new Widget[var5 + 1];
				}

				if (var6.children.length <= var5) {
					Widget[] var7 = new Widget[var5 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var5 > 0 && var6.children[var5 - 1] == null) {
					throw new RuntimeException("" + (var5 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = (var12.field_9 = var6.field_9) * 1486786309;
					var12.childIndex = var5 * 341335557;
					var12.isIf3 = true;
					if (var4 == 12) {
						var12.method1846();
						var12.method1847().method1778(new class104(var12));
						var12.method1847().method1777(new class105(var12));
					}

					var6.children[var5] = var12;
					if (var2) {
						class53.scriptDotWidget = var12;
					} else {
						Interpreter.scriptActiveWidget = var12;
					}

					Messages.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var9;
			if (var0 == 101) {
				var9 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
				Widget var10 = FriendSystem.getWidget(var9.field_9 * 1486786309);
				var10.children[var9.childIndex * 112312013] = null;
				Messages.invalidateWidget(var10);
				return 1;
			} else if (var0 == 102) {
				var9 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				var9.children = null;
				Messages.invalidateWidget(var9);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var9 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					if (var9 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class53.scriptDotWidget = var9;
						} else {
							Interpreter.scriptActiveWidget = var9;
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Widget var11 = class158.getWidgetChild(var3, var4);
				if (var11 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						class53.scriptDotWidget = var11;
					} else {
						Interpreter.scriptActiveWidget = var11;
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "50"
	)
	static final void method342(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method842()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field2545, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + Widget.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
