import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		super();
		this.reversed = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;I)I",
		garbageValue = "1689179887"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	@Export("compare")
	@ObfuscatedName("compare")
	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "455985244"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "([Lmb;IIIIIIII)V",
		garbageValue = "-1666219635"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method1829() || StudioGame.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (UserComparator9.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != ClanChannel.mousedOverWidgetIf1 && UserComparator9.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method1844(class47.urlRequester)) {
						if (var9.method1837()) {
							Messages.invalidateWidget(var9);
							Projectile.revalidateWidgetScroll(var9.children, var9, true);
						}

						if (var9.field3039 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3039;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method1852()) {
					Messages.invalidateWidget(var9);
				}

				int var26 = var9.field_10 + var6;
				int var11 = var7 + var9.field_11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) {
					var16 = var26;
					var17 = var11;
					var18 = var26 + var9.width * 1387970291;
					int var19 = var11 + var9.height * -175088023;
					if (var18 < var26) {
						var16 = var18;
						var18 = var26;
					}

					if (var19 < var11) {
						var17 = var19;
						var19 = var11;
					}

					++var18;
					++var19;
					var12 = var16 > var2 ? var16 : var2;
					var13 = var17 > var3 ? var17 : var3;
					var14 = var18 < var4 ? var18 : var4;
					var15 = var19 < var5 ? var19 : var5;
				} else {
					var16 = var26 + var9.width * 1387970291;
					var17 = var11 + var9.height * -175088023;
					var12 = var26 > var2 ? var26 : var2;
					var13 = var11 > var3 ? var11 : var3;
					var14 = var16 < var4 ? var16 : var4;
					var15 = var17 < var5 ? var17 : var5;
				}

				if (var9 == Client.clickedWidget) {
					Client.field391 = true;
					Client.field502 = var26;
					Client.field507 = var11;
				}

				boolean var34 = false;
				if (var9.field2925) {
					switch(Client.field506) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (var9.field_9 * 1486786309 >>> 16 == Client.field510 * 1486786309) {
							var34 = true;
						}
						break;
					case 3:
						if (Client.field510 * 1486786309 == var9.field_9 * 1486786309) {
							var34 = true;
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x * -1367600295 >= var12 && MouseHandler.MouseHandler_y * -808246845 >= var13 && MouseHandler.MouseHandler_x * -1367600295 < var14 && MouseHandler.MouseHandler_y * -808246845 < var15) {
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var27.field858) {
										var27.remove();
										var27.widget.field2930 = false;
									}
								}

								ChatChannel.method439();
								if (class348.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									class442.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x * -1367600295 >= var12 && MouseHandler.MouseHandler_y * -808246845 >= var13 && MouseHandler.MouseHandler_x * -1367600295 < var14 && MouseHandler.MouseHandler_y * -808246845 < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field858 && var27.widget.onScroll == var27.args) {
									var27.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x * -1367600295;
					var18 = MouseHandler.MouseHandler_y * -808246845;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var35) {
							class163.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						Friend.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							ScriptFrame.worldMap.onCycle(MouseHandler.MouseHandler_x * -1367600295, MouseHandler.MouseHandler_y * -808246845, var35, var26, var11, var9.width * 1387970291, var9.height * -175088023);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								ScriptFrame.worldMap.addElementMenuOptions(var26, var11, var9.width * 1387970291, var9.height * -175088023, var17, var18);
							} else {
								ModeWhere.method1963(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field2935.length; ++var20) {
								var21 = false;
								boolean var22 = false;
								if (!var21 && var9.field2935[var20] != null) {
									for (var23 = 0; var23 < var9.field2935[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3012 != null) {
											var24 = Client.keyHandlerInstance.getKeyPressed(var9.field2935[var20][var23]);
										}

										if (FaceNormal.method1294(var9.field2935[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3012 != null && var9.field3012[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field2934[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.keyHandlerInstance.getKeyPressed(86) && !Client.keyHandlerInstance.getKeyPressed(82) && !Client.keyHandlerInstance.getKeyPressed(81)) && ((var33 & 2) == 0 || Client.keyHandlerInstance.getKeyPressed(86)) && ((var33 & 1) == 0 || Client.keyHandlerInstance.getKeyPressed(82)) && ((var33 & 4) == 0 || Client.keyHandlerInstance.getKeyPressed(81))) {
												var22 = true;
												break;
											}
										}
									}
								}

								if (var22) {
									if (var20 < 10) {
										InvDefinition.widgetDefaultMenuAction(var20 + 1, var9.field_9 * 1486786309, var9.childIndex * 112312013, var9.itemId, "");
									} else if (var20 == 10) {
										FriendsList.Widget_runOnTargetLeave();
										FriendLoginUpdate.selectSpell(var9.field_9 * 1486786309, var9.childIndex * 112312013, LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var9)), var9.itemId);
										Client.field597 = BuddyRankComparator.Widget_getSpellActionName(var9);
										if (Client.field597 == null) {
											Client.field597 = "null";
										}

										Client.field598 = var9.dataText + Strings.colorStartTag(16777215);
									}

									var23 = var9.field3003[var20];
									if (var9.field3012 == null) {
										var9.field3012 = new int[var9.field2935.length];
									}

									if (var9.field3004 == null) {
										var9.field3004 = new int[var9.field2935.length];
									}

									if (var23 != 0) {
										if (var9.field3012[var20] == 0) {
											var9.field3012[var20] = var23 + Client.cycle + var9.field3004[var20];
										} else {
											var9.field3012[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3012[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3012 != null) {
									var9.field3012[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x * -1367600295 >= var12 && MouseHandler.MouseHandler_y * -808246845 >= var13 && MouseHandler.MouseHandler_x * -1367600295 < var14 && MouseHandler.MouseHandler_y * -808246845 < var15) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								UserComparator10.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method1830()) {
								if (var21) {
									Client.field627.addFirst(new class210(0, MouseHandler.MouseHandler_x * -1367600295 - var26, MouseHandler.MouseHandler_y * -808246845 - var11, var9));
								}

								if (var36) {
									Client.field627.addFirst(new class210(1, MouseHandler.MouseHandler_x * -1367600295 - var26, MouseHandler.MouseHandler_y * -808246845 - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								ScriptFrame.worldMap.method2340(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class145.method760(StudioGame.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field392 = true;
								Client.field500 = var26;
								Client.field504 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var28;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var28 = new ScriptEvent();
									var28.field858 = true;
									var28.widget = var9;
									var28.mouseY = Client.mouseWheelRotation;
									var28.args = var9.onScroll;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if (!var9.field2929 && var21) {
									var9.field2929 = true;
									if (var9.onClick != null) {
										var28 = new ScriptEvent();
										var28.field858 = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var28.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var28.args = var9.onClick;
										Client.scriptEvents.addFirst(var28);
									}
								}

								if (var9.field2929 && var36 && var9.onClickRepeat != null) {
									var28 = new ScriptEvent();
									var28.field858 = true;
									var28.widget = var9;
									var28.mouseX = MouseHandler.MouseHandler_x * -1367600295 - var26;
									var28.mouseY = MouseHandler.MouseHandler_y * -808246845 - var11;
									var28.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var28);
								}

								if (var9.field2929 && !var36) {
									var9.field2929 = false;
									if (var9.onRelease != null) {
										var28 = new ScriptEvent();
										var28.field858 = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_x * -1367600295 - var26;
										var28.mouseY = MouseHandler.MouseHandler_y * -808246845 - var11;
										var28.args = var9.onRelease;
										Client.field626.addFirst(var28);
									}
								}

								if (var36 && var9.onHold != null) {
									var28 = new ScriptEvent();
									var28.field858 = true;
									var28.widget = var9;
									var28.mouseX = MouseHandler.MouseHandler_x * -1367600295 - var26;
									var28.mouseY = MouseHandler.MouseHandler_y * -808246845 - var11;
									var28.args = var9.onHold;
									Client.scriptEvents.addFirst(var28);
								}

								if (!var9.field2930 && var35) {
									var9.field2930 = true;
									if (var9.onMouseOver != null) {
										var28 = new ScriptEvent();
										var28.field858 = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_x * -1367600295 - var26;
										var28.mouseY = MouseHandler.MouseHandler_y * -808246845 - var11;
										var28.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var28);
									}
								}

								if (var9.field2930 && var35 && var9.onMouseRepeat != null) {
									var28 = new ScriptEvent();
									var28.field858 = true;
									var28.widget = var9;
									var28.mouseX = MouseHandler.MouseHandler_x * -1367600295 - var26;
									var28.mouseY = MouseHandler.MouseHandler_y * -808246845 - var11;
									var28.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var28);
								}

								if (var9.field2930 && !var35) {
									var9.field2930 = false;
									if (var9.onMouseLeave != null) {
										var28 = new ScriptEvent();
										var28.field858 = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_x * -1367600295 - var26;
										var28.mouseY = MouseHandler.MouseHandler_y * -808246845 - var11;
										var28.args = var9.onMouseLeave;
										Client.field626.addFirst(var28);
									}
								}

								if (var9.onTimer != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onTimer;
									Client.field625.addFirst(var28);
								}

								ScriptEvent var25;
								int var37;
								int var38;
								if (var9.onVarTransmit != null && Client.field514 > var9.field2999) {
									if (var9.varTransmitTriggers != null && Client.field514 - var9.field2999 <= 32) {
										label648:
										for (var37 = var9.field2999; var37 < Client.field514; ++var37) {
											var23 = Client.field572[var37 & 31];

											for (var38 = 0; var38 < var9.varTransmitTriggers.length; ++var38) {
												if (var23 == var9.varTransmitTriggers[var38]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label648;
												}
											}
										}
									} else {
										var28 = new ScriptEvent();
										var28.widget = var9;
										var28.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var28);
									}

									var9.field2999 = Client.field514;
								}

								if (var9.onInvTransmit != null && Client.field525 > var9.field3001) {
									if (var9.invTransmitTriggers != null && Client.field525 - var9.field3001 <= 32) {
										label624:
										for (var37 = var9.field3001; var37 < Client.field525; ++var37) {
											var23 = Client.field573[var37 & 31];

											for (var38 = 0; var38 < var9.invTransmitTriggers.length; ++var38) {
												if (var23 == var9.invTransmitTriggers[var38]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label624;
												}
											}
										}
									} else {
										var28 = new ScriptEvent();
										var28.widget = var9;
										var28.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var28);
									}

									var9.field3001 = Client.field525;
								}

								if (var9.onStatTransmit != null && Client.field519 > var9.field2997) {
									if (var9.statTransmitTriggers != null && Client.field519 - var9.field2997 <= 32) {
										label600:
										for (var37 = var9.field2997; var37 < Client.field519; ++var37) {
											var23 = Client.field570[var37 & 31];

											for (var38 = 0; var38 < var9.statTransmitTriggers.length; ++var38) {
												if (var23 == var9.statTransmitTriggers[var38]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label600;
												}
											}
										}
									} else {
										var28 = new ScriptEvent();
										var28.widget = var9;
										var28.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var28);
									}

									var9.field2997 = Client.field519;
								}

								if (Client.chatCycle > var9.field2998 && var9.onChatTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field522 > var9.field2998 && var9.onFriendTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field518 > var9.field2998 && var9.onClanTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field517 > var9.field2998 && var9.field3038 != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.field3038;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field524 > var9.field2998 && var9.field3036 != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.field3036;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field516 > var9.field2998 && var9.onStockTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field520 > var9.field2998 && var9.field3042 != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.field3042;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field523 > var9.field2998 && var9.onMiscTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								var9.field2998 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var37 = 0; var37 < Client.field533; ++var37) {
										ScriptEvent var29 = new ScriptEvent();
										var29.widget = var9;
										var29.keyTyped = Client.field580[var37];
										var29.keyPressed = Client.field578[var37];
										var29.args = var9.onKey;
										Client.scriptEvents.addFirst(var29);
									}
								}

								ScriptEvent var30;
								int[] var39;
								if (var9.field3046 != null) {
									var39 = Client.keyHandlerInstance.method1109();

									for (var23 = 0; var23 < var39.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var39[var23];
										var30.args = var9.field3046;
										Client.scriptEvents.addFirst(var30);
									}
								}

								if (var9.field3037 != null) {
									var39 = Client.keyHandlerInstance.method1110();

									for (var23 = 0; var23 < var39.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var39[var23];
										var30.args = var9.field3037;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x * -1367600295 >= var12 && MouseHandler.MouseHandler_y * -808246845 >= var13 && MouseHandler.MouseHandler_x * -1367600295 < var14 && MouseHandler.MouseHandler_y * -808246845 < var15) {
								if (var9.mouseOverRedirect >= 0) {
									ClanChannel.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									ClanChannel.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x * -1367600295 >= var12 && MouseHandler.MouseHandler_y * -808246845 >= var13 && MouseHandler.MouseHandler_x * -1367600295 < var14 && MouseHandler.MouseHandler_y * -808246845 < var15) {
								class19.field58 = var9;
							}

							if (var9.scrollHeight * 2136913233 > var9.height * -175088023) {
								class20.method70(var9, var26 + var9.width * 1387970291, var11, var9.height * -175088023, var9.scrollHeight * 2136913233, MouseHandler.MouseHandler_x * -1367600295, MouseHandler.MouseHandler_y * -808246845);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.field_9 * 1486786309, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.field_9 * 1486786309, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var31 = (InterfaceParent)Client.interfaceParents.get((long)var9.field_9 * 6060303756424023813L);
							if (var31 != null) {
								if (var31.type == 0 && MouseHandler.MouseHandler_x * -1367600295 >= var12 && MouseHandler.MouseHandler_y * -808246845 >= var13 && MouseHandler.MouseHandler_x * -1367600295 < var14 && MouseHandler.MouseHandler_y * -808246845 < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var32 = (ScriptEvent)Client.scriptEvents.last(); var32 != null; var32 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var32.field858) {
											var32.remove();
											var32.widget.field2930 = false;
										}
									}

									if (class348.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										class442.addCancelMenuEntry();
									}
								}

								RouteStrategy.updateRootInterface(var31.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
