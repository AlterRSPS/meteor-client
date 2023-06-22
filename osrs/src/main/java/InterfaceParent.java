import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("at")
	@Export("group")
	int group;
	@ObfuscatedName("an")
	@Export("type")
	int type;
	@ObfuscatedName("av")
	boolean field855;

	InterfaceParent() {
		super();
		this.field855 = false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)I",
		garbageValue = "1730686990"
	)
	static int method452(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lby;B)V",
		garbageValue = "1"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	static void method454() {
		if (ScriptFrame.worldMap != null) {
			ScriptFrame.worldMap.method2348(Clock.Client_plane, (Projectile.localPlayer.field_27 >> 7) + class213.baseX, (Projectile.localPlayer.field_28 >> 7) + class101.baseY, false);
			ScriptFrame.worldMap.loadCache();
		}

	}
}
