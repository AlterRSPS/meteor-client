import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("at")
	int field240;
	@ObfuscatedName("an")
	int field237;
	@ObfuscatedName("av")
	int field241;
	@ObfuscatedName("as")
	int field239;
	@ObfuscatedName("ax")
	int field242;
	@ObfuscatedName("ap")
	int field238;
	@ObfuscatedName("ab")
	int field230;
	@ObfuscatedName("ak")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ae")
	@Export("start")
	int start;
	@ObfuscatedName("af")
	@Export("end")
	int end;
	@ObfuscatedName("ao")
	boolean field228;
	@ObfuscatedName("aa")
	int field229;
	@ObfuscatedName("aj")
	int field235;
	@ObfuscatedName("ad")
	int field232;
	@ObfuscatedName("ac")
	int field231;

	@ObfuscatedSignature(
		descriptor = "(Lbp;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super();
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field228 = var1.field167;
		this.field237 = var2;
		this.field241 = var3;
		this.field239 = var4;
		this.field240 = 0;
		this.method227();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbp;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super();
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field228 = var1.field167;
		this.field237 = var2;
		this.field241 = var3;
		this.field239 = 8192;
		this.field240 = 0;
		this.method227();
	}

	@ObfuscatedName("ax")
	void method227() {
		this.field242 = this.field241;
		this.field238 = method222(this.field241, this.field239);
		this.field230 = method223(this.field241, this.field239);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ak")
	@Export("vmethod5648")
	protected int vmethod5648() {
		return this.field241 == 0 && this.field229 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field241 == 0 && this.field229 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field240 < 0) {
				if (this.field237 <= 0) {
					this.method236();
					this.remove();
					return;
				}

				this.field240 = 0;
			}

			if (this.field240 >= var7) {
				if (this.field237 >= 0) {
					this.method236();
					this.remove();
					return;
				}

				this.field240 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field228) {
					if (this.field237 < 0) {
						var9 = this.method250(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field240 >= var5) {
							return;
						}

						this.field240 = var5 + var5 - 1 - this.field240;
						this.field237 = -this.field237;
					}

					while (true) {
						var9 = this.method249(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field240 < var6) {
							return;
						}

						this.field240 = var6 + var6 - 1 - this.field240;
						this.field237 = -this.field237;
						var9 = this.method250(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field240 >= var5) {
							return;
						}

						this.field240 = var5 + var5 - 1 - this.field240;
						this.field237 = -this.field237;
					}
				} else if (this.field237 < 0) {
					while (true) {
						var9 = this.method250(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field240 >= var5) {
							return;
						}

						this.field240 = var6 - 1 - (var6 - 1 - this.field240) % var8;
					}
				} else {
					while (true) {
						var9 = this.method249(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field240 < var6) {
							return;
						}

						this.field240 = var5 + (this.field240 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field228) {
						label133: {
							if (this.field237 < 0) {
								var9 = this.method250(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field240 >= var5) {
									return;
								}

								this.field240 = var5 + var5 - 1 - this.field240;
								this.field237 = -this.field237;
								if (--this.numLoops == 0) {
									break label133;
								}
							}

							do {
								var9 = this.method249(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field240 < var6) {
									return;
								}

								this.field240 = var6 + var6 - 1 - this.field240;
								this.field237 = -this.field237;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method250(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field240 >= var5) {
									return;
								}

								this.field240 = var5 + var5 - 1 - this.field240;
								this.field237 = -this.field237;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field237 < 0) {
							while (true) {
								var9 = this.method250(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field240 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field240) / var8;
								if (var10 >= this.numLoops) {
									this.field240 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field240 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method249(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field240 < var6) {
									return;
								}

								var10 = (this.field240 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field240 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field240 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field237 < 0) {
					this.method250(var1, var9, 0, var3, 0);
					if (this.field240 < 0) {
						this.field240 = -1;
						this.method236();
						this.remove();
					}
				} else {
					this.method249(var1, var9, var7, var3, 0);
					if (this.field240 >= var7) {
						this.field240 = var7;
						this.method236();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("af")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("ao")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field229 > 0) {
			if (var1 >= this.field229) {
				if (this.field241 == Integer.MIN_VALUE) {
					this.field241 = 0;
					this.field230 = 0;
					this.field238 = 0;
					this.field242 = 0;
					this.remove();
					var1 = this.field229;
				}

				this.field229 = 0;
				this.method227();
			} else {
				this.field242 += this.field235 * var1;
				this.field238 += this.field232 * var1;
				this.field230 += this.field231 * var1;
				this.field229 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field240 < 0) {
			if (this.field237 <= 0) {
				this.method236();
				this.remove();
				return;
			}

			this.field240 = 0;
		}

		if (this.field240 >= var5) {
			if (this.field237 >= 0) {
				this.method236();
				this.remove();
				return;
			}

			this.field240 = var5 - 1;
		}

		this.field240 += this.field237 * var1;
		if (this.numLoops < 0) {
			if (!this.field228) {
				if (this.field237 < 0) {
					if (this.field240 >= var3) {
						return;
					}

					this.field240 = var4 - 1 - (var4 - 1 - this.field240) % var6;
				} else {
					if (this.field240 < var4) {
						return;
					}

					this.field240 = var3 + (this.field240 - var3) % var6;
				}

			} else {
				if (this.field237 < 0) {
					if (this.field240 >= var3) {
						return;
					}

					this.field240 = var3 + var3 - 1 - this.field240;
					this.field237 = -this.field237;
				}

				while (this.field240 >= var4) {
					this.field240 = var4 + var4 - 1 - this.field240;
					this.field237 = -this.field237;
					if (this.field240 >= var3) {
						return;
					}

					this.field240 = var3 + var3 - 1 - this.field240;
					this.field237 = -this.field237;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field228) {
					label121: {
						if (this.field237 < 0) {
							if (this.field240 >= var3) {
								return;
							}

							this.field240 = var3 + var3 - 1 - this.field240;
							this.field237 = -this.field237;
							if (--this.numLoops == 0) {
								break label121;
							}
						}

						do {
							if (this.field240 < var4) {
								return;
							}

							this.field240 = var4 + var4 - 1 - this.field240;
							this.field237 = -this.field237;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field240 >= var3) {
								return;
							}

							this.field240 = var3 + var3 - 1 - this.field240;
							this.field237 = -this.field237;
						} while(--this.numLoops != 0);
					}
				} else {
					label153: {
						int var7;
						if (this.field237 < 0) {
							if (this.field240 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field240) / var6;
							if (var7 >= this.numLoops) {
								this.field240 += var6 * this.numLoops;
								this.numLoops = 0;
								break label153;
							}

							this.field240 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field240 < var4) {
								return;
							}

							var7 = (this.field240 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field240 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label153;
							}

							this.field240 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field237 < 0) {
				if (this.field240 < 0) {
					this.field240 = -1;
					this.method236();
					this.remove();
				}
			} else if (this.field240 >= var5) {
				this.field240 = var5;
				this.method236();
				this.remove();
			}

		}
	}

	@ObfuscatedName("aa")
	public synchronized void method229(int var1) {
		this.method231(var1 << 6, this.method233());
	}

	@ObfuscatedName("aj")
	synchronized void method230(int var1) {
		this.method231(var1, this.method233());
	}

	@ObfuscatedName("ad")
	synchronized void method231(int var1, int var2) {
		this.field241 = var1;
		this.field239 = var2;
		this.field229 = 0;
		this.method227();
	}

	@ObfuscatedName("ac")
	public synchronized int method232() {
		return this.field241 == Integer.MIN_VALUE ? 0 : this.field241;
	}

	@ObfuscatedName("ag")
	public synchronized int method233() {
		return this.field239 < 0 ? -1 : this.field239;
	}

	@ObfuscatedName("ar")
	public synchronized void method234(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field240 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method235() {
		this.field237 = (this.field237 ^ this.field237 >> 31) + (this.field237 >>> 31);
		this.field237 = -this.field237;
	}

	@ObfuscatedName("az")
	void method236() {
		if (this.field229 != 0) {
			if (this.field241 == Integer.MIN_VALUE) {
				this.field241 = 0;
			}

			this.field229 = 0;
			this.method227();
		}

	}

	@ObfuscatedName("au")
	public synchronized void method237(int var1, int var2) {
		this.method238(var1, var2, this.method233());
	}

	@ObfuscatedName("ai")
	public synchronized void method238(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method231(var2, var3);
		} else {
			int var4 = method222(var2, var3);
			int var5 = method223(var2, var3);
			if (var4 == this.field238 && var5 == this.field230) {
				this.field229 = 0;
			} else {
				int var6 = var2 - this.field242;
				if (this.field242 - var2 > var6) {
					var6 = this.field242 - var2;
				}

				if (var4 - this.field238 > var6) {
					var6 = var4 - this.field238;
				}

				if (this.field238 - var4 > var6) {
					var6 = this.field238 - var4;
				}

				if (var5 - this.field230 > var6) {
					var6 = var5 - this.field230;
				}

				if (this.field230 - var5 > var6) {
					var6 = this.field230 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field229 = var1;
				this.field241 = var2;
				this.field239 = var3;
				this.field235 = (var2 - this.field242) / var1;
				this.field232 = (var4 - this.field238) / var1;
				this.field231 = (var5 - this.field230) / var1;
			}
		}
	}

	@ObfuscatedName("aq")
	public synchronized void method239(int var1) {
		if (var1 == 0) {
			this.method230(0);
			this.remove();
		} else if (this.field238 == 0 && this.field230 == 0) {
			this.field229 = 0;
			this.field241 = 0;
			this.field242 = 0;
			this.remove();
		} else {
			int var2 = -this.field242;
			if (this.field242 > var2) {
				var2 = this.field242;
			}

			if (-this.field238 > var2) {
				var2 = -this.field238;
			}

			if (this.field238 > var2) {
				var2 = this.field238;
			}

			if (-this.field230 > var2) {
				var2 = -this.field230;
			}

			if (this.field230 > var2) {
				var2 = this.field230;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field229 = var1;
			this.field241 = Integer.MIN_VALUE;
			this.field235 = -this.field242 / var1;
			this.field232 = -this.field238 / var1;
			this.field231 = -this.field230 / var1;
		}
	}

	@ObfuscatedName("aw")
	public synchronized void method240(int var1) {
		if (this.field237 < 0) {
			this.field237 = -var1;
		} else {
			this.field237 = var1;
		}

	}

	@ObfuscatedName("ay")
	public synchronized int method241() {
		return this.field237 < 0 ? -this.field237 : this.field237;
	}

	@ObfuscatedName("al")
	public boolean method242() {
		return this.field240 < 0 || this.field240 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("am")
	public boolean method243() {
		return this.field229 != 0;
	}

	@ObfuscatedName("bp")
	int method249(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field229 > 0) {
				int var6 = var2 + this.field229;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field229 += var2;
				if (this.field237 == 256 && (this.field240 & 255) == 0) {
					if (class347.PcmPlayer_stereo) {
						var2 = method261(0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field238, this.field230, this.field232, this.field231, 0, var6, var3, this);
					} else {
						var2 = method260(((RawSound)super.sound).samples, var1, this.field240, var2, this.field242, this.field235, 0, var6, var3, this);
					}
				} else if (class347.PcmPlayer_stereo) {
					var2 = method265(0, 0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field238, this.field230, this.field232, this.field231, 0, var6, var3, this, this.field237, var5);
				} else {
					var2 = method264(0, 0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field242, this.field235, 0, var6, var3, this, this.field237, var5);
				}

				this.field229 -= var2;
				if (this.field229 != 0) {
					return var2;
				}

				if (!this.method251()) {
					continue;
				}

				return var4;
			}

			if (this.field237 == 256 && (this.field240 & 255) == 0) {
				if (class347.PcmPlayer_stereo) {
					return method253(0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field238, this.field230, 0, var4, var3, this);
				}

				return method252(((RawSound)super.sound).samples, var1, this.field240, var2, this.field242, 0, var4, var3, this);
			}

			if (class347.PcmPlayer_stereo) {
				return method257(0, 0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field238, this.field230, 0, var4, var3, this, this.field237, var5);
			}

			return method256(0, 0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field242, 0, var4, var3, this, this.field237, var5);
		}
	}

	@ObfuscatedName("bw")
	int method250(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field229 > 0) {
				int var6 = var2 + this.field229;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field229 += var2;
				if (this.field237 == -256 && (this.field240 & 255) == 0) {
					if (class347.PcmPlayer_stereo) {
						var2 = method263(0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field238, this.field230, this.field232, this.field231, 0, var6, var3, this);
					} else {
						var2 = method262(((RawSound)super.sound).samples, var1, this.field240, var2, this.field242, this.field235, 0, var6, var3, this);
					}
				} else if (class347.PcmPlayer_stereo) {
					var2 = method267(0, 0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field238, this.field230, this.field232, this.field231, 0, var6, var3, this, this.field237, var5);
				} else {
					var2 = method266(0, 0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field242, this.field235, 0, var6, var3, this, this.field237, var5);
				}

				this.field229 -= var2;
				if (this.field229 != 0) {
					return var2;
				}

				if (!this.method251()) {
					continue;
				}

				return var4;
			}

			if (this.field237 == -256 && (this.field240 & 255) == 0) {
				if (class347.PcmPlayer_stereo) {
					return method255(0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field238, this.field230, 0, var4, var3, this);
				}

				return method254(((RawSound)super.sound).samples, var1, this.field240, var2, this.field242, 0, var4, var3, this);
			}

			if (class347.PcmPlayer_stereo) {
				return method259(0, 0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field238, this.field230, 0, var4, var3, this, this.field237, var5);
			}

			return method258(0, 0, ((RawSound)super.sound).samples, var1, this.field240, var2, this.field242, 0, var4, var3, this, this.field237, var5);
		}
	}

	@ObfuscatedName("bk")
	boolean method251() {
		int var1 = this.field241;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method222(var1, this.field239);
			var3 = method223(var1, this.field239);
		}

		if (var1 == this.field242 && var2 == this.field238 && var3 == this.field230) {
			if (this.field241 == Integer.MIN_VALUE) {
				this.field241 = 0;
				this.field230 = 0;
				this.field238 = 0;
				this.field242 = 0;
				this.remove();
				return true;
			} else {
				this.method227();
				return false;
			}
		} else {
			if (this.field242 < var1) {
				this.field235 = 1;
				this.field229 = var1 - this.field242;
			} else if (this.field242 > var1) {
				this.field235 = -1;
				this.field229 = this.field242 - var1;
			} else {
				this.field235 = 0;
			}

			if (this.field238 < var2) {
				this.field232 = 1;
				if (this.field229 == 0 || this.field229 > var2 - this.field238) {
					this.field229 = var2 - this.field238;
				}
			} else if (this.field238 > var2) {
				this.field232 = -1;
				if (this.field229 == 0 || this.field229 > this.field238 - var2) {
					this.field229 = this.field238 - var2;
				}
			} else {
				this.field232 = 0;
			}

			if (this.field230 < var3) {
				this.field231 = 1;
				if (this.field229 == 0 || this.field229 > var3 - this.field230) {
					this.field229 = var3 - this.field230;
				}
			} else if (this.field230 > var3) {
				this.field231 = -1;
				if (this.field229 == 0 || this.field229 > this.field230 - var3) {
					this.field229 = this.field230 - var3;
				}
			} else {
				this.field231 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("bz")
	@Export("vmethod1019")
	int vmethod1019() {
		int var1 = this.field242 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field240 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("at")
	static int method222(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("an")
	static int method223(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbp;II)Lbu;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field180 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lbp;III)Lbu;"
	)
	public static RawPcmStream method226(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbu;)I"
	)
	static int method252(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field240 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbu;)I"
	)
	static int method253(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field240 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbu;)I"
	)
	static int method254(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field240 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbu;)I"
	)
	static int method255(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field240 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbu;II)I"
	)
	static int method256(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field240 = var4;
		return var5;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbu;II)I"
	)
	static int method257(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field240 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbu;II)I"
	)
	static int method258(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field240 = var4;
		return var5;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbu;II)I"
	)
	static int method259(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field240 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbu;)I"
	)
	static int method260(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field238 += var9.field232 * (var6 - var3);
		var9.field230 += var9.field231 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field242 = var4 >> 2;
		var9.field240 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbu;)I"
	)
	static int method261(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field242 += var12.field235 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field238 = var5 >> 2;
		var12.field230 = var6 >> 2;
		var12.field240 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbu;)I"
	)
	static int method262(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field238 += var9.field232 * (var6 - var3);
		var9.field230 += var9.field231 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field242 = var4 >> 2;
		var9.field240 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbu;)I"
	)
	static int method263(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field242 += var12.field235 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field238 = var5 >> 2;
		var12.field230 = var6 >> 2;
		var12.field240 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbu;II)I"
	)
	static int method264(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field238 -= var11.field232 * var5;
		var11.field230 -= var11.field231 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field238 += var11.field232 * var5;
		var11.field230 += var11.field231 * var5;
		var11.field242 = var6;
		var11.field240 = var4;
		return var5;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbu;II)I"
	)
	static int method265(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field242 -= var5 * var13.field235;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field242 += var13.field235 * var5;
		var13.field238 = var6;
		var13.field230 = var7;
		var13.field240 = var4;
		return var5;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbu;II)I"
	)
	static int method266(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field238 -= var11.field232 * var5;
		var11.field230 -= var11.field231 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field238 += var11.field232 * var5;
		var11.field230 += var11.field231 * var5;
		var11.field242 = var6;
		var11.field240 = var4;
		return var5;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbu;II)I"
	)
	static int method267(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field242 -= var5 * var13.field235;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field242 += var13.field235 * var5;
		var13.field238 = var6;
		var13.field230 = var7;
		var13.field240 = var4;
		return var5;
	}
}
