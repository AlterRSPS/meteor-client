import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class125 {
	@ObfuscatedName("as")
	public static final float field1183;
	@ObfuscatedName("ax")
	public static final float field1184;
	@ObfuscatedName("ap")
	static float[] field1186;
	@ObfuscatedName("ab")
	static float[] field1185;
	@ObfuscatedName("ak")
	public static ThreadPoolExecutor field1182;
	@ObfuscatedName("oz")
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	static {
		field1183 = Math.ulp(1.0F);
		field1184 = 2.0F * field1183;
		field1186 = new float[4];
		field1185 = new float[5];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Ldd;III)V",
		garbageValue = "2074139136"
	)
	static void method675(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		Interpreter.Interpreter_intStackSize = 0;
		class149.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field696 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label860: {
			label861: {
				try {
					int var13;
					try {
						var29 = true;
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						Interpreter.Interpreter_stringLocals = new String[var1.localStringCount];
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) {
							if (var4[var13] instanceof Integer) {
								var14 = (Integer)var4[var13];
								if (var14 == -2147483647) {
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) {
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) {
									var14 = var0.widget != null ? var0.widget.field_9 * 1486786309 : -1;
								}

								if (var14 == -2147483644) {
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) {
									var14 = var0.widget != null ? var0.widget.childIndex * 112312013 : -1;
								}

								if (var14 == -2147483642) {
									var14 = var0.dragTarget != null ? var0.dragTarget.field_9 * 1486786309 : -1;
								}

								if (var14 == -2147483641) {
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * 112312013 : -1;
								}

								if (var14 == -2147483640) {
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) {
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field704 = var0.field862;

						label841:
						while (true) {
							++var10;
							if (var10 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var32 = var6[var5];
							if (var32 >= 100) {
								boolean var34;
								if (var1.intOperands[var5] == 1) {
									var34 = true;
								} else {
									var34 = false;
								}

								var14 = class388.method2008(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label841;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								class393.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 21) {
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label861;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
								var1 = var39.script;
								var6 = var1.opcodes;
								var7 = var1.intOperands;
								var5 = var39.field_33;
								Interpreter.Interpreter_intLocals = var39.intLocals;
								Interpreter.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class343.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								Buffer.method2480(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class149.Interpreter_stringStackSize -= var13;
								var20 = JagexCache.method901(Interpreter.Interpreter_stringStack, class149.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--Interpreter.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class149.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseHandler.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										MouseHandler.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										if (var23 < 0 || var23 > 5000) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23;
										byte var24 = -1;
										if (var14 == 105) {
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) {
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) {
										var13 = var7[var5];
										var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										Interpreter.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = MouseHandler.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											MouseHandler.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = MouseHandler.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											MouseHandler.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = class309.field2795.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = class127.varclan.method2282(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = class190.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class149.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									Interpreter.Interpreter_intStackSize -= var35.intArgumentCount;
									class149.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.field_33 = var5;
									var22.intLocals = Interpreter.Interpreter_intLocals;
									var22.stringLocals = Interpreter.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var15;
									Interpreter.Interpreter_stringLocals = var16;
								}
							}
						}
					} catch (Exception var30) {
						var9 = true;
						StringBuilder var26 = new StringBuilder(30);
						var26.append("").append(var1.key).append(" ");

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8);
						class260.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label860;
					}
				} finally {
					if (var29) {
						while (Interpreter.field711.size() > 0) {
							class101 var19 = (class101)Interpreter.field711.remove(0);
							InvDefinition.widgetDefaultMenuAction(var19.method583(), var19.method584(), var19.method585(), var19.method586(), "");
						}

						if (Interpreter.field696) {
							Interpreter.field696 = false;
							class36.method162();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class260.RunException_sendStackTrace("Warning: Script " + var1.field814 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field711.size() > 0) {
					class101 var33 = (class101)Interpreter.field711.remove(0);
					InvDefinition.widgetDefaultMenuAction(var33.method583(), var33.method584(), var33.method585(), var33.method586(), "");
				}

				if (Interpreter.field696) {
					Interpreter.field696 = false;
					class36.method162();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class260.RunException_sendStackTrace("Warning: Script " + var1.field814 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field711.size() > 0) {
				class101 var40 = (class101)Interpreter.field711.remove(0);
				InvDefinition.widgetDefaultMenuAction(var40.method583(), var40.method584(), var40.method585(), var40.method586(), "");
			}

			if (Interpreter.field696) {
				Interpreter.field696 = false;
				class36.method162();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class260.RunException_sendStackTrace("Warning: Script " + var1.field814 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field711.size() > 0) {
			class101 var25 = (class101)Interpreter.field711.remove(0);
			InvDefinition.widgetDefaultMenuAction(var25.method583(), var25.method584(), var25.method585(), var25.method586(), "");
		}

		if (Interpreter.field696) {
			Interpreter.field696 = false;
			class36.method162();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class260.RunException_sendStackTrace("Warning: Script " + var1.field814 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1160250297"
	)
	protected static final void method676() {
		BufferedNetSocket.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0;
	}
}
