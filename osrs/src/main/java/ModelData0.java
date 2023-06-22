import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
		super();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZS)I",
		garbageValue = "-9190"
	)
	static int method1384(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = Clock.Client_plane;
			int var9 = (Projectile.localPlayer.field_27 >> 7) + class213.baseX;
			int var5 = (Projectile.localPlayer.field_28 >> 7) + class101.baseY;
			AABB.getWorldMap().method2348(var3, var9, var5, true);
			return 1;
		} else {
			WorldMapArea var11;
			if (var0 == 6601) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				String var16 = "";
				var11 = AABB.getWorldMap().getMapArea(var3);
				if (var11 != null) {
					var16 = var11.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				AABB.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == 6603) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == 6604) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				AABB.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == 6605) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var15;
				if (var0 == 6606) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					AABB.getWorldMap().setWorldMapPositionTarget(var15.field_46, var15.field_47);
					return 1;
				} else if (var0 == 6607) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					AABB.getWorldMap().setWorldMapPositionTargetInstant(var15.field_46, var15.field_47);
					return 1;
				} else if (var0 == 6608) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					AABB.getWorldMap().jumpToSourceCoord(var15.plane, var15.field_46, var15.field_47);
					return 1;
				} else if (var0 == 6609) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					AABB.getWorldMap().jumpToSourceCoordInstant(var15.plane, var15.field_46, var15.field_47);
					return 1;
				} else if (var0 == 6610) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var13;
					if (var0 == 6611) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var13 = AABB.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getOrigin().packed();
						}

						return 1;
					} else if (var0 == 6612) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var13 = AABB.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var13.getRegionHighX() - var13.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var13.getRegionHighY() - var13.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == 6613) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var13 = AABB.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == 6614) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var13 = AABB.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = AABB.getWorldMap().getDisplayCoord();
						if (var15 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var15.field_46;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var15.field_47;
						}

						return 1;
					} else if (var0 == 6616) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == 6617) {
						var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
						var13 = AABB.getWorldMap().getCurrentMapArea();
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var14 = var13.position(var15.plane, var15.field_46, var15.field_47);
							if (var14 == null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14[0];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14[1];
							}

							return 1;
						}
					} else {
						Coord var7;
						if (var0 == 6618) {
							var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							var13 = AABB.getWorldMap().getCurrentMapArea();
							if (var13 == null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var7 = var13.coord(var15.field_46, var15.field_47);
								if (var7 == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.packed();
								}

								return 1;
							}
						} else {
							Coord var12;
							if (var0 == 6619) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								class304.method1621(var3, var12, false);
								return 1;
							} else if (var0 == 6620) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								class304.method1621(var3, var12, true);
								return 1;
							} else if (var0 == 6621) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								var11 = AABB.getWorldMap().getMapArea(var3);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.containsCoord(var12.plane, var12.field_46, var12.field_47) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var15 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								var13 = AABB.getWorldMap().mapAreaAtCoord(var15.plane, var15.field_46, var15.field_47);
								if (var13 == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								AABB.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								AABB.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								AABB.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								AABB.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var10;
								if (var0 == 6628) {
									var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
									AABB.getWorldMap().setPerpetualFlash(var10);
									return 1;
								} else if (var0 == 6629) {
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									AABB.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == 6630) {
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									AABB.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == 6631) {
									AABB.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == 6632) {
									var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
									AABB.getWorldMap().setElementsDisabled(var10);
									return 1;
								} else {
									boolean var4;
									if (var0 == 6633) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
										AABB.getWorldMap().disableElement(var3, var4);
										return 1;
									} else if (var0 == 6634) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
										AABB.getWorldMap().setCategoryDisabled(var3, var4);
										return 1;
									} else if (var0 == 6635) {
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AABB.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var12 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
										var7 = AABB.getWorldMap().method2392(var3, var12);
										if (var7 == null) {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var8;
										if (var0 == 6639) {
											var8 = AABB.getWorldMap().iconStart();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else if (var0 == 6640) {
											var8 = AABB.getWorldMap().iconNext();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var6;
											if (var0 == 6693) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var6 = class147.WorldMapElement_get(var3);
												if (var6.name == null) {
													Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var6.name;
												}

												return 1;
											} else if (var0 == 6694) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var6 = class147.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.textSize;
												return 1;
											} else if (var0 == 6695) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var6 = class147.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.category;
												}

												return 1;
											} else if (var0 == 6696) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var6 = class147.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.sprite1 * -961459711;
												}

												return 1;
											} else if (var0 == 6697) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class183.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class183.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == 6699) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class183.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
