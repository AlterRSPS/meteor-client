import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class149 extends class142 {
	@ObfuscatedName("ao")
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("aj")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("at")
	boolean field1336;
	@ObfuscatedName("an")
	byte field1337;
	@ObfuscatedName("av")
	byte field1339;
	@ObfuscatedName("as")
	byte field1338;
	@ObfuscatedName("ax")
	byte field1340;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class149(class145 var1) {
		super();
		this.this$0 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	@Export("vmethod3254")
	void vmethod3254(Buffer var1) {
		this.field1336 = var1.readUnsignedByte() == 1;
		this.field1337 = var1.readByte();
		this.field1339 = var1.readByte();
		this.field1338 = var1.readByte();
		this.field1340 = var1.readByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	@Export("vmethod3248")
	void vmethod3248(ClanSettings var1) {
		var1.allowGuests = this.field1336;
		var1.field1360 = this.field1337;
		var1.field1361 = this.field1339;
		var1.field1362 = this.field1338;
		var1.field1359 = this.field1340;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-75"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (Client.loadInterface(var0)) {
				Widget[] var1 = class16.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						SoundSystem.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(ZLtl;I)V",
		garbageValue = "1237028886"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field489 = 0;
		Client.field447 = 0;
		class92.method485(var1);

		int var3;
		while (true) {
			byte var2 = 16;
			var3 = 1 << var2;
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) {
				break;
			}

			int var4 = var1.readBits(var2);
			if (var4 == var3 - 1) {
				break;
			}

			boolean var5 = false;
			if (Client.npcs[var4] == null) {
				Client.npcs[var4] = new NPC();
				var5 = true;
			}

			NPC var6 = Client.npcs[var4];
			Client.npcIndices[++Client.npcCount - 1] = var4;
			var6.npcCycle = Client.cycle;
			var6.definition = Bounds.getNpcDefinition(var1.readBits(14));
			int var7 = var1.readBits(1);
			int var10 = Client.field566[var1.readBits(3)];
			if (var5) {
				var6.orientation = var6.rotation = var10;
			}

			int var8;
			if (var0) {
				var8 = var1.readBits(8);
				if (var8 > 127) {
					var8 -= 256;
				}
			} else {
				var8 = var1.readBits(5);
				if (var8 > 15) {
					var8 -= 32;
				}
			}

			boolean var11 = var1.readBits(1) == 1;
			if (var11) {
				var1.readBits(32);
			}

			int var9;
			if (var0) {
				var9 = var1.readBits(8);
				if (var9 > 127) {
					var9 -= 256;
				}
			} else {
				var9 = var1.readBits(5);
				if (var9 > 15) {
					var9 -= 32;
				}
			}

			int var12 = var1.readBits(1);
			if (var12 == 1) {
				Client.field552[++Client.field447 - 1] = var4;
			}

			class381.method2001(var6);
			if (var6.field997 == 0) {
				var6.rotation = 0;
			}

			var6.method564(Projectile.localPlayer.pathX[0] + var8, Projectile.localPlayer.pathY[0] + var9, var7 == 1);
		}

		var1.exportIndex();
		class166.method864(var1);

		int var13;
		for (var13 = 0; var13 < Client.field489; ++var13) {
			var3 = Client.field565[var13];
			if (Client.npcs[var3].npcCycle != Client.cycle) {
				Client.npcs[var3].definition = null;
				Client.npcs[var3] = null;
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var13 = 0; var13 < Client.npcCount; ++var13) {
				if (Client.npcs[Client.npcIndices[var13]] == null) {
					throw new RuntimeException(var13 + "," + Client.npcCount);
				}
			}

		}
	}
}
