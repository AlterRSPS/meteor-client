import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("at")
	@Export("plane")
	int plane;
	// $FF: renamed from: x int
	@ObfuscatedName("an")
	@Export("x")
	int field_1;
	// $FF: renamed from: y int
	@ObfuscatedName("av")
	@Export("y")
	int field_2;
	@ObfuscatedName("as")
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ao")
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Ljj;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("aj")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ad")
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ac")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ag")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ar")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ah")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("az")
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("au")
	int field2000;
	@ObfuscatedName("ai")
	int field1994;
	@ObfuscatedName("aq")
	int field1997;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		super();
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.field_1 = var2;
		this.field_2 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1287745138"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}
}
