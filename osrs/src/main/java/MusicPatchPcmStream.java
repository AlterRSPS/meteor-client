import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Llb;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		super();
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lma;[IIIII)V",
		garbageValue = "1003390215"
	)
	void method1688(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2773[var1.field2831] & 4) != 0 && var1.field2819 < 0) {
			int var6 = this.superStream.field2768[var1.field2831] / PcmPlayer.field180;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2829) / var6;
				if (var7 > var4) {
					var1.field2829 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2829 += var6 * var7 - 1048576;
				int var8 = PcmPlayer.field180 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2774[var1.field2831] == 0) {
					var1.stream = RawPcmStream.method226(var1.rawSound, var10.method241(), var10.method232(), var10.method233());
				} else {
					var1.stream = RawPcmStream.method226(var1.rawSound, var10.method241(), 0, var10.method233());
					this.superStream.method1636(var1, var1.table.field2807[var1.field2828] < 0);
					var1.stream.method237(var8, var10.method232());
				}

				if (var1.table.field2807[var1.field2828] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method239(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method243()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lma;IS)V",
		garbageValue = "19357"
	)
	void method1689(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2773[var1.field2831] & 4) != 0 && var1.field2819 < 0) {
			int var3 = this.superStream.field2768[var1.field2831] / PcmPlayer.field180;
			int var4 = (var3 + 1048575 - var1.field2829) / var3;
			var1.field2829 = var3 * var2 + var1.field2829 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2774[var1.field2831] == 0) {
					var1.stream = RawPcmStream.method226(var1.rawSound, var1.stream.method241(), var1.stream.method232(), var1.stream.method233());
				} else {
					var1.stream = RawPcmStream.method226(var1.rawSound, var1.stream.method241(), 0, var1.stream.method233());
					this.superStream.method1636(var1, var1.table.field2807[var1.field2828] < 0);
				}

				if (var1.table.field2807[var1.field2828] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2829 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("ak")
	@Export("vmethod5648")
	protected int vmethod5648() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method1658(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2832) {
						this.method1688(var6, var1, var4, var5, var4 + var5);
						var6.field2832 -= var5;
						break;
					}

					this.method1688(var6, var1, var4, var6.field2832, var5 + var4);
					var4 += var6.field2832;
					var5 -= var6.field2832;
				} while(!this.superStream.method1659(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ao")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method1658(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2832) {
						this.method1689(var3, var2);
						var3.field2832 -= var2;
						break;
					}

					this.method1689(var3, var3.field2832);
					var2 -= var3.field2832;
				} while(!this.superStream.method1659(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("an")
	public static String method1683(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class386.base37Table[(int)(var6 - var0 * 37L)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("av")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class386.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "113"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field3673) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field3674) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field3676) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.field3675 < ByteArrayPool.field3671) {
			ByteArrayPool.field3669[++ByteArrayPool.field3675 - 1] = var0;
		} else {
			if (JagexCache.ByteArrayPool_arrays != null) {
				for (int var1 = 0; var1 < class152.ByteArrayPool_alternativeSizes.length; ++var1) {
					if (var0.length == class152.ByteArrayPool_alternativeSizes[var1] && PendingSpawn.ByteArrayPool_altSizeArrayCounts[var1] < JagexCache.ByteArrayPool_arrays[var1].length) {
						JagexCache.ByteArrayPool_arrays[var1][PendingSpawn.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
						return;
					}
				}
			}

		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lmb;IIB)V",
		garbageValue = "-111"
	)
	public static void method1691(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3058;
		boolean var4 = var2 != var3.field2875;
		var3.field2875 = var2;
		if (var4) {
			int var5;
			int var7;
			if (var3.field2875 == var1) {
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) {
					var7 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
						var3.equipment[var7] = var3.field2869[var7];
					}
				}
			} else {
				label62: {
					if (var3.equipment[0] >= 512) {
						boolean var8;
						if (var3.equipment[0] < 512) {
							var8 = false;
						} else {
							ItemComposition var6 = class300.ItemDefinition_get(var3.equipment[0] - 512);
							var8 = var6.maleModel1 != class208.field1833.field1849 && var6.maleModel2 != class208.field1833.field1849;
						}

						if (!var8) {
							break label62;
						}
					}

					var3.equipment[class208.field1833.field1849] = 1;
				}

				for (var5 = 0; var5 < 7; ++var5) {
					var7 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
						class59.method311(var2, var3.equipment, var5);
					}
				}
			}
		}

		var3.method1728();
	}
}
