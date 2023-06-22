import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ac")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("at")
	int[] field2869;
	@ObfuscatedName("an")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("av")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("as")
	public int field2874;
	@ObfuscatedName("ax")
	public int field2875;
	@ObfuscatedName("ap")
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ab")
	@Export("hash")
	long hash;
	@ObfuscatedName("ak")
	long field2872;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lhe;"
	)
	@Export("customisations")
	ObjTypeCustomisation[] customisations;
	@ObfuscatedName("af")
	@Export("isFemale")
	boolean isFemale;

	static {
		equipmentIndices = new int[]{class208.field1835.field1849, class208.field1833.field1849, class208.field1839.field1849, class208.field1834.field1849, class208.field1836.field1849, class208.field1837.field1849, class208.field1838.field1849};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		super();
		this.field2874 = -1;
		this.field2875 = 0;
		this.isFemale = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lmk;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		super();
		this.field2874 = -1;
		this.field2875 = 0;
		this.isFemale = false;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field2869, var1.field2869.length);
		ObjTypeCustomisation[] var4 = (ObjTypeCustomisation[])(var1.customisations != null ? (ObjTypeCustomisation[])Arrays.copyOf(var1.customisations, var1.customisations.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method1716(var3, var2, var4, false, var5, var1.field2875, var1.npcTransformId, var1.field2874);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lhe;Z[IIIII)V",
		garbageValue = "-2103200697"
	)
	public void method1716(int[] var1, int[] var2, ObjTypeCustomisation[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.customisations = var3;
		this.isFemale = var4;
		this.field2874 = var8;
		this.method1718(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "-89"
	)
	public void method1718(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method1719(var4);
		}

		if (var2 == null) {
			var2 = this.method1719(var4);
		}

		this.field2869 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.field2875 = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "2008088858"
	)
	int[] method1719(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			class59.method311(var1, var2, var3);
		}

		return var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1483080455"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[equipmentIndices[var1]];
		if (var3 != 0) {
			var3 -= 256;

			KitDefinition var4;
			do {
				if (!var2) {
					--var3;
					if (var3 < 0) {
						var3 = KitDefinition.KitDefinition_fileCount - 1;
					}
				} else {
					++var3;
					if (var3 >= KitDefinition.KitDefinition_fileCount) {
						var3 = 0;
					}
				}

				var4 = class154.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.field2875 == 1 ? 7 : 0) + var1);

			this.equipment[equipmentIndices[var1]] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-19"
	)
	public void method1721(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class13.field37[var1].length - 1;
				}
			} while(!UserComparator8.method648(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= class13.field37[var1].length) {
					var3 = 0;
				}
			} while(!UserComparator8.method648(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "6519"
	)
	public void method1722(int var1) {
		if (this.field2875 != var1) {
			this.method1718((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "217742493"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field2875);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[equipmentIndices[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "214405957"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		int var3 = this.equipment[5];
		int var4 = this.equipment[9];
		this.equipment[5] = var4;
		this.equipment[9] = var3;
		this.hash = 0L;

		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			this.hash <<= 4;
			if (this.equipment[var5] >= 256) {
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) {
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) {
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += (long)this.bodyColors[var5];
		}

		this.hash <<= 1;
		this.hash += (long)this.field2875;
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (var1 != 0L && var1 != this.hash || this.isFemale) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lhy;ILhy;IB)Ljd;",
		garbageValue = "0"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return Bounds.getNpcDefinition(this.npcTransformId).method971(var1, var2, var3, var4, (NewShit)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) {
					var5 += (long)(var1.shield - this.equipment[5] << 40);
					var7[5] = var1.shield;
				}

				if (var1.weapon >= 0) {
					var5 += (long)(var1.weapon - this.equipment[3] << 48);
					var7[3] = var1.weapon;
				}
			}

			Model var18 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var18 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !class154.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !class300.ItemDefinition_get(var11 - 512).method1055(this.field2875)) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field2872 != -1L) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field2872);
					}

					if (var18 == null) {
						return null;
					}
				}

				if (var18 == null) {
					ModelData[] var19 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						if (var13 >= 256 && var13 < 512) {
							ModelData var14 = class154.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = class300.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method1056(this.field2875);
							if (var15 != null) {
								if (this.customisations != null) {
									ObjTypeCustomisation var16 = this.customisations[var12];
									if (var16 != null) {
										int var17;
										if (var16.recol != null && var22.recolorFrom != null && var22.recolorTo.length == var16.recol.length) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.recol[var17]);
											}
										}

										if (var16.retex != null && var22.retextureFrom != null && var16.retex.length == var22.retextureTo.length) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.retex[var17]);
											}
										}
									}
								}

								var19[var11++] = var15;
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class13.field37[var13].length) {
							var20.recolor(WorldMapSection1.field2435[var13], class13.field37[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class209.field1850[var13].length) {
							var20.recolor(GrandExchangeEvent.field3533[var13], class209.field1850[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field2872 = var5;
				}
			}

			Model var21;
			if (var1 == null && var3 == null) {
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) {
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) {
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4);
			}

			return var21;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "4"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return Bounds.getNpcDefinition(this.npcTransformId).method972((NewShit)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !class154.KitDefinition_get(var3 - 256).method952()) {
					var1 = true;
				}

				if (var3 >= 512 && !class300.ItemDefinition_get(var3 - 512).method1057(this.field2875)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var7 = new ModelData[12];
				var3 = 0;

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var6;
					if (var5 >= 256 && var5 < 512) {
						var6 = class154.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = class300.ItemDefinition_get(var5 - 512).method1058(this.field2875);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class13.field37[var5].length) {
						var8.recolor(WorldMapSection1.field2435[var5], class13.field37[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class209.field1850[var5].length) {
						var8.recolor(GrandExchangeEvent.field3533[var5], class209.field1850[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "766034284"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + Bounds.getNpcDefinition(this.npcTransformId).field_12;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-611812075"
	)
	void method1728() {
		this.method1718(this.field2869, this.equipment, this.bodyColors, this.field2875, this.npcTransformId);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhl;",
		garbageValue = "-2145601729"
	)
	public static HitSplatDefinition method1717(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2031134679"
	)
	public static int method1715(int var0, int var1, int var2) {
		int var3 = class155.method813(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IILie;I)V",
		garbageValue = "115389205"
	)
	static final void method1729(Player var0, int var1, int var2, MoveSpeed var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var8 = var0.transformedSize();
				RouteStrategy var9 = WorldMapDecoration.method1532(var1, var2);
				CollisionMap var10 = Client.collisionMaps[var0.plane];
				int[] var11 = Client.field591;
				int[] var12 = Client.field592;
				int var7 = class328.method1813(var4, var5, var8, var9, var10, true, var11, var12, class135.field1275[0]);
				int var13 = var7;
				if (var7 >= 1) {
					for (int var14 = 0; var14 < var13 - 1; ++var14) {
						var0.method480(Client.field591[var14], Client.field592[var14], var3);
					}

				}
			}
		}
	}
}
