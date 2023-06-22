import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class36 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("scene")
	static Scene scene;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "-1"
	)
	static final void method161(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field542 == -1) {
				Client.field542 = var0.spriteId2 * 712819103;
				Client.field545 = var0.spriteId * 86335445;
			}

			if (Client.playerAppearance.field2875 == 1) {
				var0.spriteId2 = Client.field542 * 2008423007;
			} else {
				var0.spriteId2 = Client.field545 * 2008423007;
			}

		} else if (var1 == 325) {
			if (Client.field542 == -1) {
				Client.field542 = var0.spriteId2 * 712819103;
				Client.field545 = var0.spriteId * 86335445;
			}

			if (Client.playerAppearance.field2875 == 1) {
				var0.spriteId2 = Client.field545 * 2008423007;
			} else {
				var0.spriteId2 = Client.field542 * 2008423007;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1961721798"
	)
	static final void method162() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field2479, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field697 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				SoundCache.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			Messages.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field697 = false;
	}
}
