import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	// $FF: renamed from: RC GameBuild
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("RC")
	static final GameBuild field_38;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static StudioGame field3110;
	@ObfuscatedName("ax")
	@Export("name")
	public final String name;
	@ObfuscatedName("ap")
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		field_38 = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		super();
		this.name = var1;
		this.buildId = var2;
	}
}
