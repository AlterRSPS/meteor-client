import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class393 {
	@ObfuscatedName("ao")
	static int field3632;
	@ObfuscatedName("at")
	int field3633;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class393(int var1, boolean var2) {
		super();
		this.field3633 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2065900127"
	)
	public int method2058() {
		return this.field3633;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-26"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		PlatformInfo.process();
		TileItem.method593();
		int var1 = class100.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					class392.method2057(0.9D);
				}

				if (var2 == 2) {
					class392.method2057(0.8D);
				}

				if (var2 == 3) {
					class392.method2057(0.7D);
				}

				if (var2 == 4) {
					class392.method2057(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					class209.method1095(255);
				}

				if (var2 == 1) {
					class209.method1095(192);
				}

				if (var2 == 2) {
					class209.method1095(128);
				}

				if (var2 == 3) {
					class209.method1095(64);
				}

				if (var2 == 4) {
					class209.method1095(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					ClanChannelMember.method759(127);
				}

				if (var2 == 1) {
					ClanChannelMember.method759(96);
				}

				if (var2 == 2) {
					ClanChannelMember.method759(64);
				}

				if (var2 == 3) {
					ClanChannelMember.method759(32);
				}

				if (var2 == 4) {
					ClanChannelMember.method759(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
			}

			if (var1 == 10) {
				if (var2 == 0) {
					class134.method714(127);
				}

				if (var2 == 1) {
					class134.method714(96);
				}

				if (var2 == 2) {
					class134.method714(64);
				}

				if (var2 == 3) {
					class134.method714(32);
				}

				if (var2 == 4) {
					class134.method714(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)GameObject.findEnumerated(class404.method2117(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				Client.npcAttackOption = (AttackOption)GameObject.findEnumerated(class404.method2117(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
