import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ax")
	public static int field180;
	@ObfuscatedName("ak")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("gg")
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("gf")
	static String field182;
	@ObfuscatedName("ad")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ag")
	int field188;
	@ObfuscatedName("ar")
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ah")
	@Export("capacity")
	int capacity;
	@ObfuscatedName("az")
	int field194;
	@ObfuscatedName("au")
	int field191;
	@ObfuscatedName("ai")
	long field196;
	@ObfuscatedName("aq")
	int field190;
	@ObfuscatedName("aw")
	int field192;
	@ObfuscatedName("ay")
	int field193;
	@ObfuscatedName("al")
	long field197;
	@ObfuscatedName("am")
	boolean field184;
	@ObfuscatedName("bg")
	int field195;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field187;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field186;

	protected PcmPlayer() {
		super();
		this.field188 = 32;
		this.timeMs = BoundaryObject.clockNow();
		this.field196 = 0L;
		this.field190 = 0;
		this.field192 = 0;
		this.field193 = 0;
		this.field197 = 0L;
		this.field184 = true;
		this.field195 = 0;
		this.field187 = new PcmStream[8];
		this.field186 = new PcmStream[8];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2056298902"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "713594557"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-253109735"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("as")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1964455949"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-56642635"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lby;I)V",
		garbageValue = "-677421630"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "11509345"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = BoundaryObject.clockNow();

			try {
				if (this.field196 != 0L) {
					if (var1 < this.field196) {
						return;
					}

					this.open(this.capacity);
					this.field196 = 0L;
					this.field184 = true;
				}

				int var3 = this.position();
				if (this.field193 - var3 > this.field190) {
					this.field190 = this.field193 - var3;
				}

				int var4 = this.field194 + this.field191;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field184 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field191 = var4 - this.field194;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field197) {
					if (!this.field184) {
						if (this.field190 == 0 && this.field192 == 0) {
							this.close();
							this.field196 = 2000L + var1;
							return;
						}

						this.field191 = Math.min(this.field192, this.field190);
						this.field192 = this.field190;
					} else {
						this.field184 = false;
					}

					this.field190 = 0;
					this.field197 = var1 + 2000L;
				}

				this.field193 = var3;
			} catch (Exception var7) {
				this.close();
				this.field196 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field180);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1748985134"
	)
	public final void method190() {
		this.field184 = true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "372572905"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field184 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field196 = BoundaryObject.clockNow() + 2000L;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1737411385"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class382.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class382.soundSystem.players[var2]) {
					class382.soundSystem.players[var2] = null;
				}

				if (class382.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				class382.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1763828606"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field195 -= var1;
		if (this.field195 < 0) {
			this.field195 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bs")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (class347.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class397.clearIntArray(var1, 0, var3);
		this.field195 -= var2;
		if (this.stream != null && this.field195 <= 0) {
			this.field195 += field180 >> 4;
			InterfaceParent.PcmStream_disable(this.stream);
			this.method195(this.stream, this.stream.vmethod1019());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label105:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field187[var7];

						label99:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label99;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod5648();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field188) {
										break label105;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field245; var14 != null; var14 = var11.nextSubStream()) {
											this.method195(var14, var15 * var14.vmethod1019() >> 8);
										}
									}

									PcmStream var16 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field187[var7] = var16;
									} else {
										var10.after = var16;
									}

									if (var16 == null) {
										this.field186[var7] = var10;
									}

									var11 = var16;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var17 = this.field187[var6];
				PcmStream[] var18 = this.field187;
				this.field186[var6] = null;

				for (var18[var6] = null; var17 != null; var17 = var10) {
					var10 = var17.after;
					var17.after = null;
				}
			}
		}

		if (this.field195 < 0) {
			this.field195 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = BoundaryObject.clockNow();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lby;II)V",
		garbageValue = "-666866184"
	)
	final void method195(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field186[var3];
		if (var4 == null) {
			this.field187[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field186[var3] = var1;
		var1.field245 = var2;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ldi;B)V",
		garbageValue = "-39"
	)
	static final void method202(Actor var0) {
		int var2;
		int var3;
		int var4;
		if (var0.targetIndex != -1) {
			Object var1 = null;
			var2 = 65536;
			if (var0.targetIndex < var2) {
				var1 = Client.npcs[var0.targetIndex];
			} else {
				var1 = Client.players[var0.targetIndex - var2];
			}

			if (var1 != null) {
				var3 = var0.field_27 - ((Actor)var1).field_27;
				var4 = var0.field_28 - ((Actor)var1).field_28;
				if (var3 != 0 || var4 != 0) {
					var0.orientation = class398.method2106(var3, var4);
				}
			} else if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1003 > 0) {
			var7 = -1;
			if (var0.field978 != -1 && var0.field972 != -1) {
				var2 = var0.field978 * 128 - class213.baseX * 128 + 64;
				var3 = var0.field972 * 128 - class101.baseY * 128 + 64;
				var4 = var0.field_27 - var2;
				int var5 = var0.field_28 - var3;
				if (var4 != 0 || var5 != 0) {
					var7 = class398.method2106(var4, var5);
				}
			} else if (var0.movingOrientation != -1) {
				var7 = var0.movingOrientation;
			}

			if (var7 != -1) {
				var0.orientation = var7;
				if (var0.field941) {
					var0.rotation = var0.orientation;
				}
			}

			var0.method502();
		}

		var7 = var0.orientation - var0.rotation & 2047;
		if (var7 != 0) {
			boolean var8 = true;
			boolean var9 = true;
			++var0.field986;
			var4 = var7 > 1024 ? -1 : 1;
			var0.rotation += var0.field997 * var4;
			boolean var10 = true;
			if (var7 < var0.field997 || var7 > 2048 - var0.field997) {
				var0.rotation = var0.orientation;
				var10 = false;
			}

			if (var0.field997 > 0 && var0.idleSequence * 794059635 == var0.movementSequence && (var0.field986 > 25 || var10)) {
				if (var4 == -1 && var0.turnLeftSequence * 1524655211 != -1) {
					var0.movementSequence = var0.turnLeftSequence * 1524655211;
				} else if (var4 == 1 && var0.turnRightSequence * 1228215405 != -1) {
					var0.movementSequence = var0.turnRightSequence * 1228215405;
				} else {
					var0.movementSequence = var0.walkSequence * -1750832729;
				}
			}

			var0.rotation &= 2047;
		} else {
			if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			var0.field986 = 0;
		}

	}
}
