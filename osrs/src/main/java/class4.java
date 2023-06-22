import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public final class class4 {
	@ObfuscatedName("gx")
	static String field4;

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-473760193"
	)
	static int method7(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3903) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == 3904) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].field_30;
			return 1;
		} else if (var0 == 3905) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == 3906) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == 3907) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == 3908) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var12;
			if (var0 == 3910) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var13;
				if (var0 == 3914) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var13);
					}

					return 1;
				} else if (var0 == 3915) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var13);
					}

					return 1;
				} else if (var0 == 3916) {
					Interpreter.Interpreter_intStackSize -= 2;
					var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
					boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var4;
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var13);
					}

					return 1;
				} else if (var0 == 3917) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var13);
					}

					return 1;
				} else if (var0 == 3918) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (GrandExchangeOfferUnitPriceComparator.grandExchangeEvents != null) {
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var13);
					}

					return 1;
				} else if (var0 == 3919) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.grandExchangeEvents == null ? 0 : GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var11;
					if (var0 == 3920) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.world;
						return 1;
					} else if (var0 == 3921) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var11.getOfferName();
						return 1;
					} else if (var0 == 3922) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var11.getPreviousOfferName();
						return 1;
					} else if (var0 == 3923) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
						long var5 = BoundaryObject.clockNow() - ParamComposition.field1651 - var11.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == 3924) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == 3925) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == 3926) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)GrandExchangeOfferUnitPriceComparator.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.field_30;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "497826254"
	)
	static Object method8(int var0) {
		return class490.method2454((class490)GameObject.findEnumerated(class490.method2447(), var0));
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "34"
	)
	static final void method9(boolean var0) {
		WorldMapSectionType.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field2519, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
