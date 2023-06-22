import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ax")
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ap")
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ab")
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("ak")
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ae")
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("af")
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ao")
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("aa")
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("aj")
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ad")
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ac")
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ag")
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ar")
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ah")
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("az")
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("au")
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ai")
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("varcs")
	static Varcs varcs;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
		super();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-1407367231"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	@Export("mousePressed")
	@ObfuscatedName("mousePressed")
	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = BoundaryObject.clockNow();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@Export("mouseReleased")
	@ObfuscatedName("mouseReleased")
	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@Export("mouseClicked")
	@ObfuscatedName("mouseClicked")
	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-3257"
	)
	static int method156() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1002209752"
	)
	public static int method157(int var0) {
		return class452.field3847[var0 & 16383];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "54"
	)
	public static int method158(int var0, int var1, int var2) {
		int var3 = class155.method813(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	static final void method160() {
		class4.method9(false);
		Client.field451 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < WorldMapLabelSize.regionLandArchives.length; ++var1) {
			if (WorldMapCacheName.regionMapArchiveIds[var1] != -1 && WorldMapLabelSize.regionLandArchives[var1] == null) {
				WorldMapLabelSize.regionLandArchives[var1] = class305.archive9.takeFile(WorldMapCacheName.regionMapArchiveIds[var1], 0);
				if (WorldMapLabelSize.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field451;
				}
			}

			if (class130.regionLandArchiveIds[var1] != -1 && class74.regionMapArchives[var1] == null) {
				class74.regionMapArchives[var1] = class305.archive9.takeFileEncrypted(class130.regionLandArchiveIds[var1], 0, SpotAnimationDefinition.xteaKeys[var1]);
				if (class74.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field451;
				}
			}
		}

		if (!var0) {
			Client.field453 = 1;
		} else {
			Client.field455 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < WorldMapLabelSize.regionLandArchives.length; ++var1) {
				byte[] var2 = class74.regionMapArchives[var1];
				if (var2 != null) {
					var3 = (SceneTilePaint.regions[var1] >> 8) * 64 - class213.baseX;
					var4 = (SceneTilePaint.regions[var1] & 255) * 64 - class101.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class305.method1622(var2, var3, var4);
				}
			}

			if (!var0) {
				Client.field453 = 2;
			} else {
				if (Client.field453 != 0) {
					AABB.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				WorldMapSectionType.playPcmPlayers();
				class36.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var15;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var15 = 0; var15 < 104; ++var15) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var15][var3] = 0;
						}
					}
				}

				WorldMapSectionType.playPcmPlayers();
				class269.method1535();
				var1 = WorldMapLabelSize.regionLandArchives.length;
				class145.method761();
				class4.method9(true);
				int var17;
				if (!Client.isInInstance) {
					byte[] var5;
					for (var15 = 0; var15 < var1; ++var15) {
						var3 = (SceneTilePaint.regions[var15] >> 8) * 64 - class213.baseX;
						var4 = (SceneTilePaint.regions[var15] & 255) * 64 - class101.baseY;
						var5 = WorldMapLabelSize.regionLandArchives[var15];
						if (var5 != null) {
							WorldMapSectionType.playPcmPlayers();
							WorldMapData_0.method1395(var5, var3, var4, class208.timeOfPreviousKeyPress * 8 - 48, ObjTypeCustomisation.field1471 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var15 = 0; var15 < var1; ++var15) {
						var3 = (SceneTilePaint.regions[var15] >> 8) * 64 - class213.baseX;
						var4 = (SceneTilePaint.regions[var15] & 255) * 64 - class101.baseY;
						var5 = WorldMapLabelSize.regionLandArchives[var15];
						if (var5 == null && ObjTypeCustomisation.field1471 < 800) {
							WorldMapSectionType.playPcmPlayers();
							MilliClock.method913(var3, var4, 64, 64);
						}
					}

					class4.method9(true);

					for (var15 = 0; var15 < var1; ++var15) {
						byte[] var16 = class74.regionMapArchives[var15];
						if (var16 != null) {
							var4 = (SceneTilePaint.regions[var15] >> 8) * 64 - class213.baseX;
							var17 = (SceneTilePaint.regions[var15] & 255) * 64 - class101.baseY;
							WorldMapSectionType.playPcmPlayers();
							UserComparator6.method673(var16, var4, var17, class36.scene, Client.collisionMaps);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var15 = 0; var15 < 4; ++var15) {
						WorldMapSectionType.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var19 = false;
								var6 = Client.instanceChunkTemplates[var15][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < SceneTilePaint.regions.length; ++var12) {
										if (SceneTilePaint.regions[var12] == var11 && WorldMapLabelSize.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											AABB.method1284(WorldMapLabelSize.regionLandArchives[var12], var15, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
											var19 = true;
											break;
										}
									}
								}

								if (!var19) {
									Message.method335(var15, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var15 = 0; var15 < 13; ++var15) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var15][var3];
							if (var4 == -1) {
								MilliClock.method913(var15 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class4.method9(true);

					for (var15 = 0; var15 < 4; ++var15) {
						WorldMapSectionType.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var17 = Client.instanceChunkTemplates[var15][var3][var4];
								if (var17 != -1) {
									var6 = var17 >> 24 & 3;
									var7 = var17 >> 1 & 3;
									var8 = var17 >> 14 & 1023;
									var9 = var17 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < SceneTilePaint.regions.length; ++var11) {
										if (SceneTilePaint.regions[var11] == var10 && class74.regionMapArchives[var11] != null) {
											Tiles.method442(class74.regionMapArchives[var11], var15, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class36.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				class4.method9(true);
				WorldMapSectionType.playPcmPlayers();
				VarpDefinition.method935(class36.scene, Client.collisionMaps);
				class4.method9(true);
				var15 = Tiles.Tiles_minPlane;
				if (var15 > Clock.Client_plane) {
					var15 = Clock.Client_plane;
				}

				if (var15 < Clock.Client_plane - 1) {
					var15 = Clock.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					class36.scene.init(Tiles.Tiles_minPlane);
				} else {
					class36.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class128.updateItemPile(var3, var4);
					}
				}

				WorldMapSectionType.playPcmPlayers();
				VertexNormal.method1353();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var18;
				if (class347.client.hasFrame()) {
					var18 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
					var18.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var18);
				}

				if (!Client.isInInstance) {
					var3 = (class208.timeOfPreviousKeyPress - 6) / 8;
					var4 = (class208.timeOfPreviousKeyPress + 6) / 8;
					var17 = (ObjTypeCustomisation.field1471 - 6) / 8;
					var6 = (ObjTypeCustomisation.field1471 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var17 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var17 || var8 > var6) {
								class305.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class305.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				UserComparator8.updateGameState(30);
				WorldMapSectionType.playPcmPlayers();
				class161.method835();
				var18 = ObjectComposition.getPacketBufferNode(ClientPacket.field2535, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var18);
				class125.method676();
			}
		}
	}
}
