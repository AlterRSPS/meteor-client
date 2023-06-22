import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ol
@mn
@ObfuscatedName("oj")
@Implements("Language")
public class Language implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static final Language field3564;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static final Language field3565;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static final Language field3566;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static final Language field3563;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Loj;"
	)
	public static final Language[] field3560;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field3561;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("ak")
	final String field3569;
	@ObfuscatedName("ae")
	@Export("language")
	final String language;
	// $FF: renamed from: id int
	@ObfuscatedName("af")
	@Export("id")
	final int field_37;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3582, 0, "GB");
		field3564 = new Language("DE", "de", "German", ModeWhere.field3582, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3582, 2, "FR");
		field3565 = new Language("PT", "pt", "Portuguese", ModeWhere.field3582, 3, "BR");
		field3566 = new Language("NL", "nl", "Dutch", ModeWhere.field3581, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3581, 5, "ES");
		field3563 = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3582, 6, "MX");
		Language[] var0 = new Language[]{Language_ES, field3564, Language_FR, field3563, field3566, field3565, Language_EN};
		field3560 = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			field3560[var4.field_37] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loo;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		super();
		this.field3569 = var1;
		this.language = var2;
		this.field_37 = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field_37;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-333567172"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "55"
	)
	public static String method1951(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		int var5 = var1;

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
			int var7 = var0[var5++] & 255;
			if (var7 < 128) {
				if (var7 == 0) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < 192) {
				var8 = 65533;
			} else if (var7 < 224) {
				if (var5 < var6 && (var0[var5] & 192) == 128) {
					var8 = (var7 & 31) << 6 | var0[var5++] & 63;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 240) {
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 248) {
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 >= 65536 && var8 <= 1114111) {
						var8 = 65533;
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else {
				var8 = 65533;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIB)V",
		garbageValue = "-21"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition;
		if (Client.menuOptionsCount < 400) {
			if (var4.transforms != null) {
				var4 = var4.transform();
			}

			if (var4 != null) {
				if (var4.isInteractable) {
					if (!var4.isFollower || Client.followerIndex == var1) {
						String var5 = var0.method562();
						int var6;
						int var9;
						if (var4.combatLevel * -1963450049 != 0 && var0.field1004 * -1961345553 != 0) {
							var6 = var0.field1004 * -1961345553 != -1 ? var0.field1004 * -1961345553 : var4.combatLevel * -1963450049;
							var9 = Projectile.localPlayer.combatLevel;
							int var10 = var9 - var6;
							String var8;
							if (var10 < -9) {
								var8 = Strings.colorStartTag(16711680);
							} else if (var10 < -6) {
								var8 = Strings.colorStartTag(16723968);
							} else if (var10 < -3) {
								var8 = Strings.colorStartTag(16740352);
							} else if (var10 < 0) {
								var8 = Strings.colorStartTag(16756736);
							} else if (var10 > 9) {
								var8 = Strings.colorStartTag(65280);
							} else if (var10 > 6) {
								var8 = Strings.colorStartTag(4259584);
							} else if (var10 > 3) {
								var8 = Strings.colorStartTag(8453888);
							} else if (var10 > 0) {
								var8 = Strings.colorStartTag(12648192);
							} else {
								var8 = Strings.colorStartTag(16776960);
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							class138.insertMenuItemNoShift("Examine", Strings.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							class138.insertMenuItemNoShift("Use", Client.field596 + " " + "->" + " " + Strings.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((class125.selectedSpellFlags & 2) == 2) {
								class138.insertMenuItemNoShift(Client.field597, Client.field598 + " " + "->" + " " + Strings.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var7 = var4.actions;
							int var11;
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var0.method561(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) {
										var9 = 0;
										if (var11 == 0) {
											var9 = var6 + 9;
										}

										if (var11 == 1) {
											var9 = var6 + 10;
										}

										if (var11 == 2) {
											var9 = var6 + 11;
										}

										if (var11 == 3) {
											var9 = var6 + 12;
										}

										if (var11 == 4) {
											var9 = var6 + 13;
										}

										class138.insertMenuItemNoShift(var7[var11], Strings.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var0.method561(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel * -1963450049 > Projectile.localPlayer.combatLevel) {
												var12 = 2000;
											}

											var9 = 0;
											if (var11 == 0) {
												var9 = var12 + 9;
											}

											if (var11 == 1) {
												var9 = var12 + 10;
											}

											if (var11 == 2) {
												var9 = var12 + 11;
											}

											if (var11 == 3) {
												var9 = var12 + 12;
											}

											if (var11 == 4) {
												var9 = var12 + 13;
											}

											class138.insertMenuItemNoShift(var7[var11], Strings.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								class138.insertMenuItemNoShift("Examine", Strings.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
