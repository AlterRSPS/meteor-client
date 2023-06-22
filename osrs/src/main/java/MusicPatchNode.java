import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("is")
	static long field2814;
	@ObfuscatedName("kt")
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("at")
	int field2831;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	MusicPatchNode2 field2834;
	@ObfuscatedName("ax")
	int field2833;
	@ObfuscatedName("ap")
	int field2828;
	@ObfuscatedName("ab")
	int field2818;
	@ObfuscatedName("ak")
	int field2826;
	@ObfuscatedName("ae")
	int field2821;
	@ObfuscatedName("af")
	int field2822;
	@ObfuscatedName("ao")
	int field2827;
	@ObfuscatedName("aa")
	int field2817;
	@ObfuscatedName("aj")
	int field2825;
	@ObfuscatedName("ad")
	int field2820;
	@ObfuscatedName("ac")
	int field2819;
	@ObfuscatedName("ag")
	int field2823;
	@ObfuscatedName("ar")
	int field2830;
	@ObfuscatedName("ah")
	int field2824;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("au")
	int field2832;
	@ObfuscatedName("aq")
	int field2829;

	MusicPatchNode() {
		super();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "106225511"
	)
	void method1693() {
		this.table = null;
		this.rawSound = null;
		this.field2834 = null;
		this.stream = null;
	}
}
