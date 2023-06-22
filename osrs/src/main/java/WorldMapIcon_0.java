import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("jq")
	static int field2374;
	@ObfuscatedName("at")
	@Export("element")
	final int element;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("av")
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("as")
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;ILks;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = class147.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1876430815"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lks;",
		garbageValue = "1263568545"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-44"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-755698376"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		Player var9;
		PacketBufferNode var10;
		if (var2 == 45) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var10.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 44) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByteAdd(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var10.packetBuffer.writeIntME(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 50) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2495, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var10.packetBuffer.method2539(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 15) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2551, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeShort(var3);
				var10.packetBuffer.writeIntLE(ScriptFrame.selectedSpellWidget);
				var10.packetBuffer.writeShort(Client.selectedSpellItemId);
				var10.packetBuffer.method2537(Client.selectedSpellChildIndex);
				var10.packetBuffer.method2528(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 26) {
			class36.method162();
		}

		if (var2 == 49) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2553, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method2529(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var10.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		int var11;
		PacketBufferNode var14;
		Widget var16;
		if (var2 == 29) {
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2504, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeInt(var1);
			Client.packetWriter.addNode(var14);
			var16 = FriendSystem.getWidget(var1);
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) {
				var11 = var16.cs1Instructions[0][1];
				if (Varps.Varps_main[var11] != var16.cs1ComparisonValues[0]) {
					Varps.Varps_main[var11] = var16.cs1ComparisonValues[0];
					class393.changeGameOptions(var11);
				}
			}
		}

		if (var2 == 19) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2496, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method2537(var3);
			var14.packetBuffer.method2539(class101.baseY + var1);
			var14.packetBuffer.method2539(var0 + class213.baseX);
			var14.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			Client.packetWriter.addNode(var14);
		}

		NPC var15;
		if (var2 == 10) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2509, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method2529(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var10.packetBuffer.method2537(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 13) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method2537(var3);
				var10.packetBuffer.method2528(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 47) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2522, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method2537(var3);
				var10.packetBuffer.method2528(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
			ScriptFrame.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
		}

		if (var2 == 16) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeShortAdd(ScriptFrame.field343);
			var14.packetBuffer.writeShort(var0 + class213.baseX);
			var14.packetBuffer.writeIntME(TaskHandler.field1427);
			var14.packetBuffer.method2528(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			var14.packetBuffer.writeShort(class101.baseY + var1);
			var14.packetBuffer.writeIntME(var3);
			var14.packetBuffer.method2539(Renderable.field2094);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 7) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2503, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method2529(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var10.packetBuffer.writeIntLE(ScriptFrame.field343);
				var10.packetBuffer.writeIntME(TaskHandler.field1427);
				var10.packetBuffer.writeShort(Renderable.field2094);
				var10.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 4) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2568, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeIntME(var0 + class213.baseX);
			var14.packetBuffer.writeIntME(class101.baseY + var1);
			var14.packetBuffer.method2529(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			var14.packetBuffer.method2539(var3);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 22) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2564, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method2537(var3);
			var14.packetBuffer.writeByteAdd(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			var14.packetBuffer.method2539(class101.baseY + var1);
			var14.packetBuffer.method2539(var0 + class213.baseX);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 23) {
			if (Client.isMenuOpen) {
				class36.scene.setViewportWalking();
			} else {
				class36.scene.menuOpen(Clock.Client_plane, var0, var1, true);
			}
		}

		if (var2 == 11) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2525, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method2529(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var10.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		PacketBufferNode var13;
		Widget var17;
		if (var2 == 24) {
			var17 = FriendSystem.getWidget(var1);
			if (var17 != null) {
				boolean var12 = true;
				if (var17.contentType > 0) {
					var12 = FloorOverlayDefinition.method1072(var17);
				}

				if (var12) {
					var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field2504, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeInt(var1);
					Client.packetWriter.addNode(var13);
				}
			}
		}

		if (var2 == 57 || var2 == 1007) {
			var17 = class158.getWidgetChild(var1, var0);
			if (var17 != null) {
				InvDefinition.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
			}
		}

		if (var2 == 21) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method2539(var0 + class213.baseX);
			var14.packetBuffer.writeByteAdd(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			var14.packetBuffer.method2537(var3);
			var14.packetBuffer.method2539(class101.baseY + var1);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 2) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2494, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeShort(Client.selectedSpellChildIndex);
			var14.packetBuffer.method2539(Client.selectedSpellItemId);
			var14.packetBuffer.writeShort(var3);
			var14.packetBuffer.method2539(class101.baseY + var1);
			var14.packetBuffer.method2528(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			var14.packetBuffer.method2539(var0 + class213.baseX);
			var14.packetBuffer.writeIntLE(ScriptFrame.selectedSpellWidget);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 1002) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2556, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeIntME(var3);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 51) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeIntME(var3);
				var10.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 12) {
			var15 = Client.npcs[var3];
			if (var15 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2537, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method2528(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var10.packetBuffer.method2537(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 3) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2546, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeIntME(var3);
			var14.packetBuffer.method2539(class101.baseY + var1);
			var14.packetBuffer.writeByteAdd(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			var14.packetBuffer.method2539(var0 + class213.baseX);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 14) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeByteAdd(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var10.packetBuffer.writeShortAdd(ScriptFrame.field343);
				var10.packetBuffer.writeIntME(Renderable.field2094);
				var10.packetBuffer.writeIntME(TaskHandler.field1427);
				var10.packetBuffer.method2539(var3);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 46) {
			var9 = Client.players[var3];
			if (var9 != null) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.CLICK, Client.packetWriter.isaacCipher);
				var10.packetBuffer.writeIntME(var3);
				var10.packetBuffer.method2529(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 1) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2505, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method2552(ScriptFrame.field343);
			var14.packetBuffer.method2539(Renderable.field2094);
			var14.packetBuffer.method2537(class101.baseY + var1);
			var14.packetBuffer.method2537(var3);
			var14.packetBuffer.writeIntME(TaskHandler.field1427);
			var14.packetBuffer.method2539(var0 + class213.baseX);
			var14.packetBuffer.method2529(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 18) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2540, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeIntME(var3);
			var14.packetBuffer.method2539(class101.baseY + var1);
			var14.packetBuffer.method2537(var0 + class213.baseX);
			var14.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 20) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2492, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method2539(var3);
			var14.packetBuffer.method2537(class101.baseY + var1);
			var14.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			var14.packetBuffer.writeShort(var0 + class213.baseX);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 28) {
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2504, Client.packetWriter.isaacCipher);
			var14.packetBuffer.writeInt(var1);
			Client.packetWriter.addNode(var14);
			var16 = FriendSystem.getWidget(var1);
			if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) {
				var11 = var16.cs1Instructions[0][1];
				Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
				class393.changeGameOptions(var11);
			}
		}

		if (var2 == 58) {
			var17 = class158.getWidgetChild(var1, var0);
			if (var17 != null) {
				if (var17.field3019 != null) {
					ScriptEvent var18 = new ScriptEvent();
					var18.widget = var17;
					var18.opIndex = var3;
					var18.targetName = var6;
					var18.args = var17.field3019;
					Clock.runScriptEvent(var18);
				}

				var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2529, Client.packetWriter.isaacCipher);
				var10.packetBuffer.method2537(Client.selectedSpellChildIndex);
				var10.packetBuffer.method2539(var0);
				var10.packetBuffer.method2537(Client.selectedSpellItemId);
				var10.packetBuffer.method2539(var4);
				var10.packetBuffer.writeIntLE(var1);
				var10.packetBuffer.writeShortAdd(ScriptFrame.selectedSpellWidget);
				Client.packetWriter.addNode(var10);
			}
		}

		if (var2 == 6) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2542, Client.packetWriter.isaacCipher);
			var14.packetBuffer.method2539(class101.baseY + var1);
			var14.packetBuffer.writeIntME(var0 + class213.baseX);
			var14.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
			var14.packetBuffer.method2537(var3);
			Client.packetWriter.addNode(var14);
		}

		if (var2 == 25) {
			var17 = class158.getWidgetChild(var1, var0);
			if (var17 != null) {
				FriendsList.Widget_runOnTargetLeave();
				FriendLoginUpdate.selectSpell(var1, var0, LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var17)), var4);
				Client.isItemSelected = 0;
				Client.field597 = BuddyRankComparator.Widget_getSpellActionName(var17);
				if (Client.field597 == null) {
					Client.field597 = "null";
				}

				if (var17.isIf3) {
					Client.field598 = var17.dataText + Strings.colorStartTag(16777215);
				} else {
					Client.field598 = Strings.colorStartTag(65280) + var17.field3053 + Strings.colorStartTag(16777215);
				}
			}

		} else {
			if (var2 == 1003) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var15 = Client.npcs[var3];
				if (var15 != null) {
					NPCComposition var19 = var15.definition;
					if (var19.transforms != null) {
						var19 = var19.transform();
					}

					if (var19 != null) {
						var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field2499, Client.packetWriter.isaacCipher);
						var13.packetBuffer.method2537(var19.field_12);
						Client.packetWriter.addNode(var13);
					}
				}
			}

			if (var2 == 1001) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2513, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method2528(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var14.packetBuffer.method2539(class101.baseY + var1);
				var14.packetBuffer.writeShort(var0 + class213.baseX);
				var14.packetBuffer.writeIntME(var3);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) {
				FloorDecoration.resumePauseWidget(var1, var0);
				Client.meslayerContinueWidget = class158.getWidgetChild(var1, var0);
				Messages.invalidateWidget(Client.meslayerContinueWidget);
			}

			if (var2 == 1004) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2482, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method2537(var3);
				var14.packetBuffer.writeIntME(class101.baseY + var1);
				var14.packetBuffer.method2539(var0 + class213.baseX);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 17) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2497, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeShort(class101.baseY + var1);
				var14.packetBuffer.writeIntME(Client.selectedSpellChildIndex);
				var14.packetBuffer.writeShortAdd(ScriptFrame.selectedSpellWidget);
				var14.packetBuffer.method2537(Client.selectedSpellItemId);
				var14.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var14.packetBuffer.method2537(var3);
				var14.packetBuffer.writeIntME(var0 + class213.baseX);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 48) {
				var9 = Client.players[var3];
				if (var9 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2483, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method2539(var3);
					var10.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 8) {
				var15 = Client.npcs[var3];
				if (var15 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = ObjectComposition.getPacketBufferNode(ClientPacket.field2480, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method2537(var3);
					var10.packetBuffer.method2552(ScriptFrame.selectedSpellWidget);
					var10.packetBuffer.method2529(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
					var10.packetBuffer.writeIntME(Client.selectedSpellItemId);
					var10.packetBuffer.method2537(Client.selectedSpellChildIndex);
					Client.packetWriter.addNode(var10);
				}
			}

			if (var2 == 5) {
				Client.mouseCrossX = var7;
				Client.mouseCrossY = var8;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var14 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
				var14.packetBuffer.method2539(var3);
				var14.packetBuffer.method2539(var0 + class213.baseX);
				var14.packetBuffer.method2529(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
				var14.packetBuffer.method2537(class101.baseY + var1);
				Client.packetWriter.addNode(var14);
			}

			if (var2 == 9) {
				var15 = Client.npcs[var3];
				if (var15 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = ObjectComposition.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeByte(Client.keyHandlerInstance.getKeyPressed(82) ? 1 : 0);
					var10.packetBuffer.writeIntME(var3);
					Client.packetWriter.addNode(var10);
				}
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				Messages.invalidateWidget(FriendSystem.getWidget(ScriptFrame.field343));
			}

			if (Client.isSpellSelected) {
				FriendsList.Widget_runOnTargetLeave();
			}

		}
	}
}
