import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class136 extends DualNode {
	@ObfuscatedName("aj")
	static int field1277;
	@ObfuscatedName("bx")
	protected static String field1276;
	@ObfuscatedName("at")
	int field1280;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Leq;"
	)
	public class129[][] field1284;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[Leq;"
	)
	class129[][] field1279;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public Skeleton field1285;
	@ObfuscatedName("ax")
	int field1281;
	@ObfuscatedName("ap")
	boolean field1278;
	@ObfuscatedName("ae")
	Future field1283;
	@ObfuscatedName("af")
	List field1282;

	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;IZ)V",
		garbageValue = "0"
	)
	public class136(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		super();
		this.field1284 = null;
		this.field1279 = null;
		this.field1281 = 0;
		this.field1280 = var3;
		byte[] var5 = var1.takeFile(this.field1280 >> 16 & 65535, this.field1280 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.getFile(var8, 0);
		this.field1285 = new Skeleton(var8, var9);
		this.field1282 = new ArrayList();
		this.field1283 = class125.field1182.submit(new class133(this, var6, var7));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IB)V",
		garbageValue = "4"
	)
	void method719(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1281 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1279 = new class129[this.field1285.method1226().method1209()][];
		this.field1284 = new class129[this.field1285.method1225()][];
		class128[] var4 = new class128[var3];

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) {
			class130 var6 = Varps.method1700(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			class131 var8 = class177.method908(var1.readUnsignedByte());
			class129 var9 = new class129();
			var9.method693(var1, var2);
			var4[var5] = new class128(this, var9, var6, var8, var7);
			int var10 = var6.method704();
			class129[][] var11;
			if (var6 == class130.field1241) {
				var11 = this.field1279;
			} else {
				var11 = this.field1284;
			}

			if (var11[var7] == null) {
				var11[var7] = new class129[var10];
			}

			if (var6 == class130.field1246) {
				this.field1278 = true;
			}
		}

		var5 = var3 / AccessFile.field4018;
		int var12 = var3 % AccessFile.field4018;
		int var13 = 0;

		for (int var14 = 0; var14 < AccessFile.field4018; ++var14) {
			var7 = var13;
			var13 += var5;
			if (var12 > 0) {
				++var13;
				--var12;
			}

			if (var7 == var13) {
				break;
			}

			this.field1282.add(class125.field1182.submit(new class135(this, var7, var13, var4)));
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-5"
	)
	public boolean method720() {
		if (this.field1283 == null && this.field1282 == null) {
			return true;
		} else {
			if (this.field1283 != null) {
				if (!this.field1283.isDone()) {
					return false;
				}

				this.field1283 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1282.size(); ++var2) {
				if (!((Future)this.field1282.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1282.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1282 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "619897416"
	)
	public int method721() {
		return this.field1281;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	public boolean method722() {
		return this.field1278;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILej;III)V",
		garbageValue = "-666610798"
	)
	public void method723(int var1, class126 var2, int var3, int var4) {
		class438 var5 = class396.method2097();
		this.method724(var5, var3, var2, var1);
		this.method726(var5, var3, var2, var1);
		this.method725(var5, var3, var2, var1);
		var2.method682(var5);
		var5.method2257();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqp;ILej;II)V",
		garbageValue = "1698958692"
	)
	void method724(class438 var1, int var2, class126 var3, int var4) {
		float[] var5 = var3.method686(this.field1281);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1279[var2] != null) {
			class129 var9 = this.field1279[var2][0];
			class129 var10 = this.field1279[var2][1];
			class129 var11 = this.field1279[var2][2];
			if (var9 != null) {
				var6 = var9.method695(var4);
			}

			if (var10 != null) {
				var7 = var10.method695(var4);
			}

			if (var11 != null) {
				var8 = var11.method695(var4);
			}
		}

		class437 var22;
		synchronized(class437.field3805) {
			if (class437.field3804 == 0) {
				var22 = new class437();
			} else {
				class437.field3805[--class437.field3804].method2255();
				var22 = class437.field3805[class437.field3804];
			}
		}

		var22.method2254(1.0F, 0.0F, 0.0F, var6);
		class437 var23;
		synchronized(class437.field3805) {
			if (class437.field3804 == 0) {
				var23 = new class437();
			} else {
				class437.field3805[--class437.field3804].method2255();
				var23 = class437.field3805[class437.field3804];
			}
		}

		var23.method2254(0.0F, 1.0F, 0.0F, var7);
		class437 var13;
		synchronized(class437.field3805) {
			if (class437.field3804 == 0) {
				var13 = new class437();
			} else {
				class437.field3805[--class437.field3804].method2255();
				var13 = class437.field3805[class437.field3804];
			}
		}

		var13.method2254(0.0F, 0.0F, 1.0F, var8);
		class437 var15;
		synchronized(class437.field3805) {
			if (class437.field3804 == 0) {
				var15 = new class437();
			} else {
				class437.field3805[--class437.field3804].method2255();
				var15 = class437.field3805[class437.field3804];
			}
		}

		var15.method2256(var13);
		var15.method2256(var22);
		var15.method2256(var23);
		class438 var17 = class396.method2097();
		var17.method2268(var15);
		var1.method2267(var17);
		var22.method2252();
		var23.method2252();
		var13.method2252();
		var15.method2252();
		var17.method2257();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqp;ILej;II)V",
		garbageValue = "1814069017"
	)
	void method725(class438 var1, int var2, class126 var3, int var4) {
		float[] var5 = var3.method687(this.field1281);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1279[var2] != null) {
			class129 var9 = this.field1279[var2][3];
			class129 var10 = this.field1279[var2][4];
			class129 var11 = this.field1279[var2][5];
			if (var9 != null) {
				var6 = var9.method695(var4);
			}

			if (var10 != null) {
				var7 = var10.method695(var4);
			}

			if (var11 != null) {
				var8 = var11.method695(var4);
			}
		}

		var1.field3814[12] = var6;
		var1.field3814[13] = var7;
		var1.field3814[14] = var8;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqp;ILej;IS)V",
		garbageValue = "16384"
	)
	void method726(class438 var1, int var2, class126 var3, int var4) {
		float[] var5 = var3.method688(this.field1281);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1279[var2] != null) {
			class129 var9 = this.field1279[var2][6];
			class129 var10 = this.field1279[var2][7];
			class129 var11 = this.field1279[var2][8];
			if (var9 != null) {
				var6 = var9.method695(var4);
			}

			if (var10 != null) {
				var7 = var10.method695(var4);
			}

			if (var11 != null) {
				var8 = var11.method695(var4);
			}
		}

		class438 var12 = class396.method2097();
		var12.method2265(var6, var7, var8);
		var1.method2267(var12);
		var12.method2257();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1970905733"
	)
	static int method729(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 4000) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var3;
			return 1;
		} else if (var0 == 4001) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == 4002) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == 4003) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == 4004) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == 4005) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == 4006) {
				Interpreter.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == 4007) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
				return 1;
			} else if (var0 == 4008) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == 4009) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == 4010) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == 4011) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == 4012) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
				}

				return 1;
			} else if (var0 == 4013) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
						break;
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == 4014) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == 4015) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == 4016) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 < var4 ? var3 : var4;
				return 1;
			} else if (var0 == 4017) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 > var4 ? var3 : var4;
				return 1;
			} else if (var0 == 4018) {
				Interpreter.Interpreter_intStackSize -= 3;
				long var9 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				long var11 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				long var13 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11);
				return 1;
			} else if (var0 == 4025) {
				var3 = FloorOverlayDefinition.method1067(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == 4026) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == 4027) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseHandler.method158(var3, var4, var5);
				return 1;
			} else if (var0 == 4028) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PlayerComposition.method1715(var3, var4, var5);
				return 1;
			} else if (var0 == 4029) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				Interpreter.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
				var3 = PlayerComposition.method1715(var3, var5, var6);
				var7 = class155.method813(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = MouseHandler.method157(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.method1933(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = UserComparator7.method652(var3, var4);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var15 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
				var4 = -1;
				if (class146.isNumber(var15)) {
					var4 = TextureProvider.method1301(var15);
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Lny;Ljava/lang/String;I)V",
		garbageValue = "2030574471"
	)
	static void method727(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field550 += var2.groupCount;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-860479964"
	)
	@Export("load")
	static void load() {
		int var0;
		if (Client.titleLoadingStage == 0) {
			class36.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var0 = 0; var0 < 4; ++var0) {
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			class33.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			class466.field3907 = FriendSystem.newArchive(0, false, true, true, false);
			Actor.archive7 = FriendSystem.newArchive(1, false, true, true, false);
			MouseRecorder.archive2 = FriendSystem.newArchive(2, true, false, true, false);
			BuddyRankComparator.archive4 = FriendSystem.newArchive(3, false, true, true, false);
			LoginScreenAnimation.field1022 = FriendSystem.newArchive(4, false, true, true, false);
			class305.archive9 = FriendSystem.newArchive(5, true, true, true, false);
			ReflectionCheck.archive6 = FriendSystem.newArchive(6, true, true, true, false);
			FontName.archive11 = FriendSystem.newArchive(7, false, true, true, false);
			class180.archive8 = FriendSystem.newArchive(8, false, true, true, false);
			Language.field3561 = FriendSystem.newArchive(9, false, true, true, false);
			class53.archive10 = FriendSystem.newArchive(10, false, true, true, false);
			ViewportMouse.field2233 = FriendSystem.newArchive(11, false, true, true, false);
			class33.archive12 = FriendSystem.newArchive(12, false, true, true, false);
			class310.archive13 = FriendSystem.newArchive(13, true, false, true, false);
			GrandExchangeOffer.archive14 = FriendSystem.newArchive(14, false, true, true, false);
			class17.archive15 = FriendSystem.newArchive(15, false, true, true, false);
			Language.archive17 = FriendSystem.newArchive(17, true, true, true, false);
			class350.archive18 = FriendSystem.newArchive(18, false, true, true, false);
			ChatChannel.archive19 = FriendSystem.newArchive(19, false, true, true, false);
			class291.archive20 = FriendSystem.newArchive(20, false, true, true, false);
			Messages.field1127 = FriendSystem.newArchive(21, false, true, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var32 = 0;
			var0 = var32 + class466.field3907.percentage() * 4 / 100;
			var0 += Actor.archive7.percentage() * 4 / 100;
			var0 += MouseRecorder.archive2.percentage() * 2 / 100;
			var0 += BuddyRankComparator.archive4.percentage() * 2 / 100;
			var0 += LoginScreenAnimation.field1022.percentage() * 6 / 100;
			var0 += class305.archive9.percentage() * 4 / 100;
			var0 += ReflectionCheck.archive6.percentage() * 2 / 100;
			var0 += FontName.archive11.percentage() * 55 / 100;
			var0 += class180.archive8.percentage() * 2 / 100;
			var0 += Language.field3561.percentage() * 2 / 100;
			var0 += class53.archive10.percentage() * 2 / 100;
			var0 += ViewportMouse.field2233.percentage() * 2 / 100;
			var0 += class33.archive12.percentage() * 2 / 100;
			var0 += class310.archive13.percentage() * 2 / 100;
			var0 += GrandExchangeOffer.archive14.percentage() * 2 / 100;
			var0 += class17.archive15.percentage() * 2 / 100;
			var0 += ChatChannel.archive19.percentage() / 100;
			var0 += class350.archive18.percentage() / 100;
			var0 += class291.archive20.percentage() / 100;
			var0 += Messages.field1127.percentage() / 100;
			var0 += Language.archive17.method1881() && Language.archive17.isFullyLoaded() ? 1 : 0;
			if (var0 != 100) {
				if (var0 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var0 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				method727(class466.field3907, "Animations");
				method727(Actor.archive7, "Skeletons");
				method727(LoginScreenAnimation.field1022, "Sound FX");
				method727(class305.archive9, "Maps");
				method727(ReflectionCheck.archive6, "Music Tracks");
				method727(FontName.archive11, "Models");
				method727(class180.archive8, "Sprites");
				method727(ViewportMouse.field2233, "Music Jingles");
				method727(GrandExchangeOffer.archive14, "Music Samples");
				method727(class17.archive15, "Music Patches");
				method727(ChatChannel.archive19, "World Map");
				method727(class350.archive18, "World Map Geography");
				method727(class291.archive20, "World Map Ground");
				FontName.spriteIds = new GraphicsDefaults();
				FontName.spriteIds.decode(Language.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else {
			Archive var2;
			Archive var39;
			if (Client.titleLoadingStage == 45) {
				WorldMapScaleHandler.method1571(22050, !Client.isLowDetail, 2);
				MidiPcmStream var37 = new MidiPcmStream();
				var37.method1632(9, 128);
				MouseRecorder.pcmPlayer0 = ObjectComposition.method1028(GameEngine.taskHandler, 0, 22050);
				MouseRecorder.pcmPlayer0.setStream(var37);
				var39 = class17.archive15;
				var2 = GrandExchangeOffer.archive14;
				Archive var28 = LoginScreenAnimation.field1022;
				class304.field2746 = var39;
				class304.musicSamplesArchive = var2;
				class304.soundEffectsArchive = var28;
				class304.midiPcmStream = var37;
				class290.pcmPlayer1 = ObjectComposition.method1028(GameEngine.taskHandler, 1, 2048);
				KitDefinition.pcmStreamMixer = new PcmStreamMixer();
				class290.pcmPlayer1.setStream(KitDefinition.pcmStreamMixer);
				FloorOverlayDefinition.field1795 = new Decimator(22050, PcmPlayer.field180);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				class490.WorldMapElement_fonts = new Fonts(class180.archive8, class310.archive13);
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) {
					FontName[] var36 = new FontName[]{FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain11};
					var1 = var36.length;
					Fonts var26 = class490.WorldMapElement_fonts;
					FontName[] var27 = new FontName[]{FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain11};
					Client.fontsMap = var26.createMap(var27);
					if (Client.fontsMap.size() < var1) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						MouseHandler.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class404.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						class166.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						ChatChannel.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else {
					int var19;
					if (Client.titleLoadingStage == 60) {
						var0 = WorldMapScaleHandler.method1574(class53.archive10, class180.archive8);
						var2 = class180.archive8;
						var19 = Login.field772.length + Login.field771.length;
						String[] var29 = Login.field770;

						for (int var5 = 0; var5 < var29.length; ++var5) {
							String var31 = var29[var5];
							if (var2.getGroupId(var31) != -1) {
								++var19;
							}
						}

						if (var0 < var19) {
							Login.Login_loadingText = "Loading title screen - " + var0 * 100 / var19 + "%";
							Login.Login_loadingPercent = 50;
						} else {
							Login.Login_loadingText = "Loaded title screen";
							Login.Login_loadingPercent = 50;
							UserComparator8.updateGameState(5);
							Client.titleLoadingStage = 70;
						}
					} else if (Client.titleLoadingStage == 70) {
						if (!MouseRecorder.archive2.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + MouseRecorder.archive2.loadPercent() + "%";
							Login.Login_loadingPercent = 60;
						} else if (!Messages.field1127.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + (80 + class33.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 60;
						} else {
							class164.method849(MouseRecorder.archive2);
							class323.method1709(MouseRecorder.archive2);
							UserComparator9.method661(MouseRecorder.archive2, FontName.archive11);
							ScriptFrame.method326(MouseRecorder.archive2, FontName.archive11, Client.isLowDetail);
							UserComparator4.method645(MouseRecorder.archive2, FontName.archive11);
							class17.method57(MouseRecorder.archive2);
							Archive var35 = MouseRecorder.archive2;
							var39 = FontName.archive11;
							boolean var38 = Client.isMembersWorld;
							Font var3 = MouseHandler.fontPlain11;
							ItemComposition.ItemDefinition_archive = var35;
							ItemComposition.ItemDefinition_modelArchive = var39;
							ItemComposition.ItemDefinition_inMembersWorld = var38;
							class435.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
							class259.ItemDefinition_fontPlain11 = var3;
							FriendLoginUpdate.method2167(MouseRecorder.archive2, class466.field3907, Actor.archive7);
							ObjectSound.method408(MouseRecorder.archive2, FontName.archive11);
							Archive var4 = MouseRecorder.archive2;
							VarbitComposition.VarbitDefinition_archive = var4;
							Archive var40 = MouseRecorder.archive2;
							class305.VarpDefinition_archive = var40;
							VarpDefinition.field1479 = class305.VarpDefinition_archive.getGroupFileCount(16);
							Archive var30 = BuddyRankComparator.archive4;
							Archive var7 = FontName.archive11;
							Archive var33 = class180.archive8;
							Archive var9 = class310.archive13;
							int var10 = 0;
							if (var30 != null) {
								Widget.Widget_archive = var30;
								class309.field2794 = var7;
								MenuAction.Widget_spritesArchive = var33;
								class13.Widget_fontsArchive = var9;
								var10 = Widget.Widget_archive.getGroupCount();
							}

							class16.Widget_interfaceComponents = new Widget[var10][];
							class143.Widget_loadedInterfaces = new boolean[var10];
							WorldMapSection1.method1537(MouseRecorder.archive2);
							class140.method740(MouseRecorder.archive2);
							Archive var23 = MouseRecorder.archive2;
							VarcInt.VarcInt_archive = var23;
							class133.method711(MouseRecorder.archive2);
							Archive var11 = MouseRecorder.archive2;
							ParamComposition.ParamDefinition_archive = var11;
							class386.method2004(MouseRecorder.archive2);
							Archive var12 = MouseRecorder.archive2;
							DbRowType.field4054 = var12;
							GraphicsObject.HitSplatDefinition_cachedSprites = new class485(GameBuild.field3110, 54, TriBool.clientLanguage, MouseRecorder.archive2);
							HealthBar.HitSplatDefinition_cached = new class485(GameBuild.field3110, 47, TriBool.clientLanguage, MouseRecorder.archive2);
							MouseHandler.varcs = new Varcs();
							Archive var13 = MouseRecorder.archive2;
							Archive var14 = class180.archive8;
							Archive var15 = class310.archive13;
							HitSplatDefinition.HitSplatDefinition_archive = var13;
							HitSplatDefinition.field1661 = var14;
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var15;
							Archive var16 = MouseRecorder.archive2;
							Archive var17 = class180.archive8;
							HealthBarDefinition.HealthBarDefinition_archive = var16;
							HealthBarDefinition.field1522 = var17;
							World.method379(MouseRecorder.archive2, class180.archive8);
							Login.Login_loadingText = "Loaded config";
							Login.Login_loadingPercent = 60;
							Client.titleLoadingStage = 80;
						}
					} else if (Client.titleLoadingStage == 80) {
						var0 = 0;
						if (class304.compass == null) {
							class304.compass = class107.SpriteBuffer_getSprite(class180.archive8, FontName.spriteIds.compass, 0);
						} else {
							++var0;
						}

						if (class404.redHintArrowSprite == null) {
							class404.redHintArrowSprite = class107.SpriteBuffer_getSprite(class180.archive8, FontName.spriteIds.field3789, 0);
						} else {
							++var0;
						}

						IndexedSprite[] var6;
						IndexedSprite var8;
						IndexedSprite[] var20;
						byte[] var22;
						boolean var24;
						int var25;
						if (class47.mapSceneSprites == null) {
							var2 = class180.archive8;
							var19 = FontName.spriteIds.mapScenes;
							var22 = var2.takeFile(var19, 0);
							if (var22 == null) {
								var24 = false;
							} else {
								UserComparator2.SpriteBuffer_decode(var22);
								var24 = true;
							}

							if (!var24) {
								var20 = null;
							} else {
								var6 = new IndexedSprite[class515.SpriteBuffer_spriteCount];

								for (var25 = 0; var25 < class515.SpriteBuffer_spriteCount; ++var25) {
									var8 = var6[var25] = new IndexedSprite();
									var8.width = class330.SpriteBuffer_spriteWidth;
									var8.height = class489.SpriteBuffer_spriteHeight;
									var8.xOffset = class515.SpriteBuffer_xOffsets[var25];
									var8.yOffset = class402.SpriteBuffer_yOffsets[var25];
									var8.subWidth = class515.SpriteBuffer_spriteWidths[var25];
									var8.subHeight = class515.SpriteBuffer_spriteHeights[var25];
									var8.palette = class515.SpriteBuffer_spritePalette;
									var8.pixels = class515.SpriteBuffer_pixels[var25];
								}

								TextureProvider.method1309();
								var20 = var6;
							}

							class47.mapSceneSprites = var20;
						} else {
							++var0;
						}

						if (NPCComposition.headIconPkSprites == null) {
							NPCComposition.headIconPkSprites = WorldMapScaleHandler.method1567(class180.archive8, FontName.spriteIds.headIconsPk, 0);
						} else {
							++var0;
						}

						if (class157.headIconPrayerSprites == null) {
							class157.headIconPrayerSprites = WorldMapScaleHandler.method1567(class180.archive8, FontName.spriteIds.field3795, 0);
						} else {
							++var0;
						}

						if (ReflectionCheck.headIconHintSprites == null) {
							ReflectionCheck.headIconHintSprites = WorldMapScaleHandler.method1567(class180.archive8, FontName.spriteIds.field3791, 0);
						} else {
							++var0;
						}

						if (LoginScreenAnimation.mapMarkerSprites == null) {
							LoginScreenAnimation.mapMarkerSprites = WorldMapScaleHandler.method1567(class180.archive8, FontName.spriteIds.field3785, 0);
						} else {
							++var0;
						}

						if (class12.crossSprites == null) {
							class12.crossSprites = WorldMapScaleHandler.method1567(class180.archive8, FontName.spriteIds.field3788, 0);
						} else {
							++var0;
						}

						if (class19.mapDotSprites == null) {
							class19.mapDotSprites = WorldMapScaleHandler.method1567(class180.archive8, FontName.spriteIds.field3786, 0);
						} else {
							++var0;
						}

						if (class411.scrollBarSprites == null) {
							var2 = class180.archive8;
							var19 = FontName.spriteIds.field3787;
							var22 = var2.takeFile(var19, 0);
							if (var22 == null) {
								var24 = false;
							} else {
								UserComparator2.SpriteBuffer_decode(var22);
								var24 = true;
							}

							if (!var24) {
								var20 = null;
							} else {
								var6 = new IndexedSprite[class515.SpriteBuffer_spriteCount];

								for (var25 = 0; var25 < class515.SpriteBuffer_spriteCount; ++var25) {
									var8 = var6[var25] = new IndexedSprite();
									var8.width = class330.SpriteBuffer_spriteWidth;
									var8.height = class489.SpriteBuffer_spriteHeight;
									var8.xOffset = class515.SpriteBuffer_xOffsets[var25];
									var8.yOffset = class402.SpriteBuffer_yOffsets[var25];
									var8.subWidth = class515.SpriteBuffer_spriteWidths[var25];
									var8.subHeight = class515.SpriteBuffer_spriteHeights[var25];
									var8.palette = class515.SpriteBuffer_spritePalette;
									var8.pixels = class515.SpriteBuffer_pixels[var25];
								}

								TextureProvider.method1309();
								var20 = var6;
							}

							class411.scrollBarSprites = var20;
						} else {
							++var0;
						}

						if (class195.modIconSprites == null) {
							var2 = class180.archive8;
							var19 = FontName.spriteIds.field3790;
							var22 = var2.takeFile(var19, 0);
							if (var22 == null) {
								var24 = false;
							} else {
								UserComparator2.SpriteBuffer_decode(var22);
								var24 = true;
							}

							if (!var24) {
								var20 = null;
							} else {
								var6 = new IndexedSprite[class515.SpriteBuffer_spriteCount];

								for (var25 = 0; var25 < class515.SpriteBuffer_spriteCount; ++var25) {
									var8 = var6[var25] = new IndexedSprite();
									var8.width = class330.SpriteBuffer_spriteWidth;
									var8.height = class489.SpriteBuffer_spriteHeight;
									var8.xOffset = class515.SpriteBuffer_xOffsets[var25];
									var8.yOffset = class402.SpriteBuffer_yOffsets[var25];
									var8.subWidth = class515.SpriteBuffer_spriteWidths[var25];
									var8.subHeight = class515.SpriteBuffer_spriteHeights[var25];
									var8.palette = class515.SpriteBuffer_spritePalette;
									var8.pixels = class515.SpriteBuffer_pixels[var25];
								}

								TextureProvider.method1309();
								var20 = var6;
							}

							class195.modIconSprites = var20;
						} else {
							++var0;
						}

						if (var0 < 11) {
							Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%";
							Login.Login_loadingPercent = 70;
						} else {
							AbstractFont.AbstractFont_modIconSprites = class195.modIconSprites;
							class404.redHintArrowSprite.normalize();
							var1 = (int)(Math.random() * 21.0D) - 10;
							int var21 = (int)(Math.random() * 21.0D) - 10;
							var19 = (int)(Math.random() * 21.0D) - 10;
							int var41 = (int)(Math.random() * 41.0D) - 20;
							class47.mapSceneSprites[0].shiftColors(var41 + var1, var41 + var21, var19 + var41);
							Login.Login_loadingText = "Loaded sprites";
							Login.Login_loadingPercent = 70;
							Client.titleLoadingStage = 90;
						}
					} else if (Client.titleLoadingStage == 90) {
						if (!Language.field3561.isFullyLoaded()) {
							Login.Login_loadingText = "Loading textures - " + "0%";
							Login.Login_loadingPercent = 90;
						} else {
							Messages.textureProvider = new TextureProvider(Language.field3561, class180.archive8, 20, class10.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
							Rasterizer3D.method1183(Messages.textureProvider);
							Rasterizer3D.method1184(class10.clientPreferences.getBrightness());
							Client.titleLoadingStage = 100;
						}
					} else if (Client.titleLoadingStage == 100) {
						var0 = Messages.textureProvider.getLoadedPercentage();
						if (var0 < 100) {
							Login.Login_loadingText = "Loading textures - " + var0 + "%";
							Login.Login_loadingPercent = 90;
						} else {
							Login.Login_loadingText = "Loaded textures";
							Login.Login_loadingPercent = 90;
							Client.titleLoadingStage = 110;
						}
					} else if (Client.titleLoadingStage == 110) {
						class85.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(class85.mouseRecorder, 10);
						Login.Login_loadingText = "Loaded input handler";
						Login.Login_loadingPercent = 92;
						Client.titleLoadingStage = 120;
					} else if (Client.titleLoadingStage == 120) {
						if (!class53.archive10.tryLoadFileByNames("huffman", "")) {
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
							Login.Login_loadingPercent = 94;
						} else {
							Huffman var34 = new Huffman(class53.archive10.takeFileByNames("huffman", ""));
							class332.huffman = var34;
							Login.Login_loadingText = "Loaded wordpack";
							Login.Login_loadingPercent = 94;
							Client.titleLoadingStage = 130;
						}
					} else if (Client.titleLoadingStage == 130) {
						if (!BuddyRankComparator.archive4.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + BuddyRankComparator.archive4.loadPercent() * 4 / 5 + "%";
							Login.Login_loadingPercent = 96;
						} else if (!class33.archive12.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (80 + class33.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 96;
						} else if (!class310.archive13.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (96 + class310.archive13.loadPercent() / 50) + "%";
							Login.Login_loadingPercent = 96;
						} else {
							Login.Login_loadingText = "Loaded interfaces";
							Login.Login_loadingPercent = 98;
							if (class33.archive12.isValidFileName("version.dat", "")) {
								Buffer var18 = new Buffer(class33.archive12.takeFileByNames("version.dat", ""));
								var18.readUnsignedShort();
							}

							Client.titleLoadingStage = 140;
						}
					} else if (Client.titleLoadingStage == 140) {
						Login.Login_loadingPercent = 100;
						if (ChatChannel.archive19.getGroupCount() > 0 && !ChatChannel.archive19.tryLoadGroupByName(WorldMapCacheName.field2447.name)) {
							Login.Login_loadingText = "Loading world map - " + ChatChannel.archive19.groupLoadPercentByName(WorldMapCacheName.field2447.name) / 10 + "%";
						} else {
							if (ScriptFrame.worldMap == null) {
								ScriptFrame.worldMap = new WorldMap();
								ScriptFrame.worldMap.init(ChatChannel.archive19, class350.archive18, class291.archive20, class166.fontBold12, Client.fontsMap, class47.mapSceneSprites);
							}

							Login.Login_loadingText = "Loaded world map";
							Client.titleLoadingStage = 150;
						}
					} else if (Client.titleLoadingStage == 150) {
						UserComparator8.updateGameState(10);
					}
				}
			}
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (Client.loadInterface(var0)) {
			Widget[] var1 = class16.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(IIIILtm;Lmc;B)V",
		garbageValue = "-72"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class404.redHintArrowSprite.method2643(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			class59.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
