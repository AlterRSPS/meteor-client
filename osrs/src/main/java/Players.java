import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("Players")
public class Players {
	@ObfuscatedName("av")
	@Export("activityFlags")
	static byte[] activityFlags;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lie;"
	)
	@Export("playerMovementSpeeds")
	static MoveSpeed[] playerMovementSpeeds;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Ltz;"
	)
	@Export("cachedAppearanceBuffer")
	static Buffer[] cachedAppearanceBuffer;
	@ObfuscatedName("ap")
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("ab")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("ak")
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("ae")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("af")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ao")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("aa")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("aj")
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ad")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static Buffer field1100;

	static {
		activityFlags = new byte[2048];
		playerMovementSpeeds = new MoveSpeed[2048];
		cachedAppearanceBuffer = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1100 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "2142252006"
	)
	static int method603(int var0, Script var1, boolean var2) {
		if (var0 == 5000) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == 5001) {
			Interpreter.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			SpotAnimationDefinition.privateChatMode = class404.method2116(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (SpotAnimationDefinition.privateChatMode == null) {
				SpotAnimationDefinition.privateChatMode = PrivateChatMode.field4180;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			PacketBufferNode var11 = ObjectComposition.getPacketBufferNode(ClientPacket.field2488, Client.packetWriter.isaacCipher);
			var11.packetBuffer.writeByte(Client.publicChatMode);
			var11.packetBuffer.writeByte(SpotAnimationDefinition.privateChatMode.field_65);
			var11.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var11);
			return 1;
		} else {
			String var3;
			int var4;
			int var5;
			PacketBufferNode var6;
			if (var0 == 5002) {
				var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
				Interpreter.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var6 = ObjectComposition.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var3) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var3);
				var6.packetBuffer.writeByte(var4 - 1);
				var6.packetBuffer.writeByte(var5);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var7;
				Message var8;
				if (var0 == 5003) {
					Interpreter.Interpreter_intStackSize -= 2;
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var8 = UserComparator5.Messages_getByChannelAndID(var7, var4);
					if (var8 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.count;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.cycle;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.sender != null ? var8.sender : "";
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.prefix != null ? var8.prefix : "";
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.text != null ? var8.text : "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.isFromFriend() ? 1 : (var8.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var9;
					if (var0 == 5004) {
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var9 = class166.Messages_getMessage(var7);
						if (var9 != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.type;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.cycle;
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.sender != null ? var9.sender : "";
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.prefix != null ? var9.prefix : "";
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.text != null ? var9.text : "";
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.isFromFriend() ? 1 : (var9.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 5005) {
						if (SpotAnimationDefinition.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SpotAnimationDefinition.privateChatMode.field_65;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == 5008) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var12 = SpotAnimationDefinition.method991(var4, var3, TriBool.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == 5009) {
							class149.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
							String var13 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
							var12 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var3);
							class324.method1712(var12.packetBuffer, var13);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == 5010) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var6 = SpotAnimationDefinition.method991(var4, var3, TriBool.clientLanguage, var5);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == 5017) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.Messages_getHistorySize(var7);
								return 1;
							} else if (var0 == 5018) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class104.Messages_getLastChatID(var7);
								return 1;
							} else if (var0 == 5019) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginPacket.method1613(var7);
								return 1;
							} else if (var0 == 5020) {
								var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
								class324.doCheat(var3);
								return 1;
							} else if (var0 == 5021) {
								Client.field599 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Client.field599;
								return 1;
							} else if (var0 == 5023) {
								var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
								System.out.println(var3);
								return 1;
							} else if (var0 == 5030) {
								Interpreter.Interpreter_intStackSize -= 2;
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								var8 = UserComparator5.Messages_getByChannelAndID(var7, var4);
								if (var8 != null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.count;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.cycle;
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.sender != null ? var8.sender : "";
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.prefix != null ? var8.prefix : "";
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8.text != null ? var8.text : "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.isFromFriend() ? 1 : (var8.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var9 = class166.Messages_getMessage(var7);
								if (var9 != null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.type;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.cycle;
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.sender != null ? var9.sender : "";
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.prefix != null ? var9.prefix : "";
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.text != null ? var9.text : "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.isFromFriend() ? 1 : (var9.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (Projectile.localPlayer != null && Projectile.localPlayer.username != null) {
								var3 = Projectile.localPlayer.username.getName();
							} else {
								var3 = "";
							}

							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3;
							return 1;
						}
					}
				}
			}
		}
	}
}
