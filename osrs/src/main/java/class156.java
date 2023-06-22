import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class156 extends class142 {
	@ObfuscatedName("cr")
	static int field1380;
	@ObfuscatedName("at")
	int field1381;
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
	class156(class145 var1) {
		super();
		this.this$0 = var1;
		this.field1381 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		this.field1381 = var1.readUnsignedShort();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.method799(this.field1381);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "123"
	)
	static int method819(int var0, Script var1, boolean var2) {
		if (var0 == 3200) {
			Interpreter.Interpreter_intStackSize -= 3;
			SpriteMask.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == 3201) {
			MusicPatch.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == 3202) {
			Interpreter.Interpreter_intStackSize -= 2;
			HealthBarUpdate.playJingle(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var6;
			class90 var8;
			class89 var9;
			int var10;
			String var12;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
				boolean var15;
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
					if (var0 == 3211) {
						return 1;
					} else {
						int var3;
						int var4;
						if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var4 = 0;
							class90 var13 = (class90)GameObject.findEnumerated(SoundSystem.method207(), var3);
							if (var13 != null) {
								var4 = var13 != class90.field888 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var4 = 0;
							class89 var5 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method1865(), var3);
							if (var5 != null) {
								var4 = var5 != class89.field880 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							return 2;
						} else {
							var8 = class90.field888;
							var9 = class89.field880;
							var15 = true;
							boolean var14 = true;
							int var7;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var8 = (class90)GameObject.findEnumerated(SoundSystem.method207(), var7);
								if (var8 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var9 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method1865(), var7);
								if (var9 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var11;
							byte var16;
							if (var9 == class89.field880) {
								switch(var8.field891) {
								case 1:
								case 2:
								case 3:
									var16 = 0;
									var6 = 1;
									break;
								case 4:
									var16 = 0;
									var6 = Integer.MAX_VALUE;
									break;
								case 5:
									var16 = 0;
									var6 = 100;
									break;
								default:
									var11 = String.format("Unkown device option: %s.", var8.toString());
									throw new RuntimeException(var11);
								}
							} else {
								switch(var9.field884) {
								case 1:
									var16 = 0;
									var6 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var16 = 0;
									var6 = 100;
									break;
								default:
									var11 = String.format("Unkown game option: %s.", var9.toString());
									throw new RuntimeException(var11);
								}
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					}
				} else {
					var8 = class90.field888;
					var9 = class89.field880;
					var15 = false;
					if (var0 == 3214) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var8 = (class90)GameObject.findEnumerated(SoundSystem.method207(), var6);
						if (var8 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3215) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var9 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method1865(), var6);
						if (var9 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3210) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var8 = (class90)GameObject.findEnumerated(SoundSystem.method207(), var6);
						if (var8 == null) {
							var9 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method1865(), var6);
							if (var9 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3182) {
						var8 = class90.field886;
					} else if (var0 == 3204) {
						var9 = class89.field881;
					} else if (var0 == 3206) {
						var9 = class89.field879;
					} else if (var0 == 3208) {
						var9 = class89.field882;
					}

					if (var9 == class89.field880) {
						switch(var8.field891) {
						case 1:
							var10 = class10.clientPreferences.getIsUsernameHidden() ? 1 : 0;
							break;
						case 2:
							var10 = class10.clientPreferences.getTitleMusicDisabled() ? 1 : 0;
							break;
						case 3:
							var10 = class10.clientPreferences.method530() ? 1 : 0;
							break;
						case 4:
							var10 = class10.clientPreferences.method532();
							break;
						case 5:
							var10 = class60.method320();
							break;
						default:
							var12 = String.format("Unkown device option: %s.", var8.toString());
							throw new RuntimeException(var12);
						}
					} else {
						switch(var9.field884) {
						case 1:
							var10 = class10.clientPreferences.getRoofsHidden() ? 1 : 0;
							break;
						case 2:
							var6 = class10.clientPreferences.getCurrentMusicVolume();
							var10 = Math.round((float)(var6 * 100) / 255.0F);
							break;
						case 3:
							var6 = class10.clientPreferences.getCurrentSoundEffectsVolume();
							var10 = Math.round((float)(var6 * 100) / 127.0F);
							break;
						case 4:
							var6 = class10.clientPreferences.getAreaSoundEffectsVolume();
							var10 = Math.round((float)(var6 * 100) / 127.0F);
							break;
						default:
							var12 = String.format("Unkown game option: %s.", var9.toString());
							throw new RuntimeException(var12);
						}
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10;
					return 1;
				}
			} else {
				var8 = class90.field888;
				var9 = class89.field880;
				var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var0 == 3212) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var8 = (class90)GameObject.findEnumerated(SoundSystem.method207(), var6);
					if (var8 == null) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var6));
					}
				}

				if (var0 == 3213) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var9 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method1865(), var6);
					if (var9 == null) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var6));
					}
				}

				if (var0 == 3209) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var8 = (class90)GameObject.findEnumerated(SoundSystem.method207(), var6);
					if (var8 == null) {
						var9 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method1865(), var6);
						if (var9 == null) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var6));
						}
					}
				} else if (var0 == 3181) {
					var8 = class90.field886;
				} else if (var0 == 3203) {
					var9 = class89.field881;
				} else if (var0 == 3205) {
					var9 = class89.field879;
				} else if (var0 == 3207) {
					var9 = class89.field882;
				}

				if (var9 == class89.field880) {
					switch(var8.field891) {
					case 1:
						class10.clientPreferences.setIsUsernameHidden(var10 == 1);
						break;
					case 2:
						class10.clientPreferences.getTitleMusicDisabled(var10 == 1);
						break;
					case 3:
						class10.clientPreferences.method528(var10 == 1);
						break;
					case 4:
						if (var10 < 0) {
							var10 = 0;
						}

						class10.clientPreferences.method531(var10);
						break;
					case 5:
						class164.method853(var10);
						break;
					default:
						var12 = String.format("Unkown device option: %s.", var8.toString());
						throw new RuntimeException(var12);
					}
				} else {
					switch(var9.field884) {
					case 1:
						class10.clientPreferences.setRoofsHidden(var10 == 1);
						break;
					case 2:
						var10 = Math.min(Math.max(var10, 0), 100);
						var6 = Math.round((float)(var10 * 255) / 100.0F);
						class209.method1095(var6);
						break;
					case 3:
						var10 = Math.min(Math.max(var10, 0), 100);
						var6 = Math.round((float)(var10 * 127) / 100.0F);
						ClanChannelMember.method759(var6);
						break;
					case 4:
						var10 = Math.min(Math.max(var10, 0), 100);
						var6 = Math.round((float)(var10 * 127) / 100.0F);
						class134.method714(var6);
						break;
					default:
						var12 = String.format("Unkown game option: %s.", var9.toString());
						throw new RuntimeException(var12);
					}
				}

				return 1;
			}
		}
	}
}
