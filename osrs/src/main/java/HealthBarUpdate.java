import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ue")
	static int field1016;
	@ObfuscatedName("at")
	@Export("cycle")
	int cycle;
	@ObfuscatedName("an")
	@Export("health")
	int health;
	@ObfuscatedName("av")
	@Export("health2")
	int health2;
	@ObfuscatedName("as")
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		super();
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "33"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2067901217"
	)
	@Export("playJingle")
	static void playJingle(int var0, int var1) {
		if (class10.clientPreferences.getCurrentMusicVolume() != 0 && var0 != -1) {
			class368.method1948(ViewportMouse.field2233, var0, 0, class10.clientPreferences.getCurrentMusicVolume(), false);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Ldh;ZI)V",
		garbageValue = "-1885589665"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence * 794059635 == var0.movementSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.field_27 >> 7;
			int var3 = var0.field_28 >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = class394.calculateTag(0, 0, 0, false, var0.index);
				if (var0.attachedModel != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = Renderable.getTileHeight(var0.field_27, var0.field_28, Clock.Client_plane);
					var0.playerCycle = Client.cycle;
					class36.scene.addNullableObject(Clock.Client_plane, var0.field_27, var0.field_28, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.field_27 & 127) == 64 && (var0.field_28 & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = Renderable.getTileHeight(var0.field_27, var0.field_28, Clock.Client_plane);
					var0.playerCycle = Client.cycle;
					class36.scene.drawEntity(Clock.Client_plane, var0.field_27, var0.field_28, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lmb;IIIB)V",
		garbageValue = "-55"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class304.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
