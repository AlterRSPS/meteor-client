import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ix")
	static int field343;
	@ObfuscatedName("oq")
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("script")
	Script script;
	// $FF: renamed from: pc int
	@ObfuscatedName("an")
	@Export("pc")
	int field_33;
	@ObfuscatedName("av")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("as")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		super();
		this.field_33 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;ZI)V",
		garbageValue = "-1693429746"
	)
	public static void method326(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-722096780"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		ClanChannel.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}
}
