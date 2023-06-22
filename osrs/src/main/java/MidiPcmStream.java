import java.util.Iterator;
import java.util.PriorityQueue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("an")
	int field2758;
	@ObfuscatedName("av")
	int field2759;
	@ObfuscatedName("as")
	int[] field2772;
	@ObfuscatedName("ax")
	int[] field2775;
	@ObfuscatedName("ap")
	int[] field2770;
	@ObfuscatedName("ab")
	int[] field2763;
	@ObfuscatedName("ak")
	int[] field2767;
	@ObfuscatedName("ae")
	int[] field2764;
	@ObfuscatedName("af")
	int[] field2765;
	@ObfuscatedName("ao")
	int[] field2769;
	@ObfuscatedName("aa")
	int[] field2762;
	@ObfuscatedName("au")
	int[] field2773;
	@ObfuscatedName("ai")
	int[] field2766;
	@ObfuscatedName("aq")
	int[] field2771;
	@ObfuscatedName("aw")
	int[] field2774;
	@ObfuscatedName("ay")
	int[] field2776;
	@ObfuscatedName("al")
	int[] field2768;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[[Lma;"
	)
	MusicPatchNode[][] field2780;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[[Lma;"
	)
	MusicPatchNode[][] field2781;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bj")
	boolean field2757;
	@ObfuscatedName("bo")
	@Export("track")
	int track;
	@ObfuscatedName("bq")
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bg")
	long field2778;
	@ObfuscatedName("bf")
	long field2777;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("ba")
	public PriorityQueue field2784;

	public MidiPcmStream() {
		super();
		this.field2758 = 256;
		this.field2759 = 1000000;
		this.field2772 = new int[16];
		this.field2775 = new int[16];
		this.field2770 = new int[16];
		this.field2763 = new int[16];
		this.field2767 = new int[16];
		this.field2764 = new int[16];
		this.field2765 = new int[16];
		this.field2769 = new int[16];
		this.field2762 = new int[16];
		this.field2773 = new int[16];
		this.field2766 = new int[16];
		this.field2771 = new int[16];
		this.field2774 = new int[16];
		this.field2776 = new int[16];
		this.field2768 = new int[16];
		this.field2780 = new MusicPatchNode[16][128];
		this.field2781 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field2784 = new PriorityQueue(5, new class306());
		this.musicPatches = new NodeHashTable(128);
		this.method1644();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2758 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-111377530"
	)
	public int method1625() {
		return this.field2758;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lnq;Lbz;B)Z",
		garbageValue = "6"
	)
	synchronized boolean method1626(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true;

		for (class316 var5 = (class316)var1.field2812.first(); var5 != null; var5 = (class316)var1.field2812.next()) {
			int var6 = (int)var5.key;
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var6);
			if (var7 == null) {
				byte[] var9 = var2.takeFileFlat(var6);
				MusicPatch var8;
				if (var9 == null) {
					var8 = null;
				} else {
					var8 = new MusicPatch(var9);
				}

				var7 = var8;
				if (var8 == null) {
					var4 = false;
					continue;
				}

				this.musicPatches.put(var8, (long)var6);
			}

			if (!var7.method1677(var3, var5.field2837)) {
				var4 = false;
			} else if (this.field2784 != null) {
				Iterator var10 = var7.field2805.iterator();

				while (var10.hasNext()) {
					class53 var11 = (class53)var10.next();
					this.field2784.add(new class310(var5.field2836, var11));
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	synchronized void method1627() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "923743711"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ak")
	protected synchronized int vmethod5648() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2759 / PcmPlayer.field180;

			do {
				long var5 = this.field2778 + (long)var4 * (long)var3;
				if (this.field2777 - var5 >= 0L) {
					this.field2778 = var5;
					break;
				}

				int var7 = (int)((this.field2777 - this.field2778 + (long)var4 - 1L) / (long)var4);
				this.field2778 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method1657();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmv;ZI)V",
		garbageValue = "-907641791"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2757 = var2;
		this.field2778 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2777 = this.midiFile.method1672(this.trackLength);
	}

	@ObfuscatedName("ao")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2759 / PcmPlayer.field180;

			do {
				long var3 = this.field2778 + (long)var2 * (long)var1;
				if (this.field2777 - var3 >= 0L) {
					this.field2778 = var3;
					break;
				}

				int var5 = (int)((this.field2777 - this.field2778 + (long)var2 - 1L) / (long)var2);
				this.field2778 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method1657();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1496424318"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method1644();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-4147255"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1457303388"
	)
	public synchronized void method1632(int var1, int var2) {
		this.method1633(var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-15"
	)
	void method1633(int var1, int var2) {
		this.field2763[var1] = var2;
		this.field2764[var1] = var2 & -128;
		this.method1634(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "326324678"
	)
	void method1634(int var1, int var2) {
		if (var2 != this.field2767[var1]) {
			this.field2767[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2781[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2066005019"
	)
	void method1635(int var1, int var2, int var3) {
		this.method1637(var1, var2, 64);
		if ((this.field2773[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2831 == var1 && var4.field2819 < 0) {
					this.field2780[var1][var4.field2828] = null;
					this.field2780[var1][var2] = var4;
					int var5 = (var4.field2827 * var4.field2822 >> 12) + var4.field2821;
					var4.field2821 += var2 - var4.field2828 << 8;
					var4.field2822 = var5 - var4.field2821;
					var4.field2827 = 4096;
					var4.field2828 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2767[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var8 = var9.rawSounds[var2].method282();
				if (var8 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field2831 = var1;
					var6.table = var9;
					var6.rawSound = var8;
					var6.field2834 = var9.field2806[var2];
					var6.field2833 = var9.field2799[var2];
					var6.field2828 = var2;
					var6.field2818 = var3 * var3 * var9.field2801[var2] * var9.field2803 + 1024 >> 11;
					var6.field2826 = var9.field2800[var2] & 255;
					var6.field2821 = (var2 << 8) - (var9.field2807[var2] & 32767);
					var6.field2817 = 0;
					var6.field2825 = 0;
					var6.field2820 = 0;
					var6.field2819 = -1;
					var6.field2823 = 0;
					if (this.field2774[var1] == 0) {
						var6.stream = RawPcmStream.method226(var8, this.method1649(var6), this.method1650(var6), this.method1651(var6));
					} else {
						var6.stream = RawPcmStream.method226(var8, this.method1649(var6), 0, this.method1651(var6));
						this.method1636(var6, var9.field2807[var2] < 0);
					}

					if (var9.field2807[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field2833 >= 0) {
						MusicPatchNode var7 = this.field2781[var1][var6.field2833];
						if (var7 != null && var7.field2819 < 0) {
							this.field2780[var1][var7.field2828] = null;
							var7.field2819 = 0;
						}

						this.field2781[var1][var6.field2833] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field2780[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lma;ZB)V",
		garbageValue = "-18"
	)
	void method1636(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field167) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field2774[var1.field2831] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method235();
			}
		} else {
			var4 = (int)((long)this.field2774[var1.field2831] * (long)var3 >> 6);
		}

		var1.stream.method234(var4);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1654252881"
	)
	void method1637(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2780[var1][var2];
		if (var4 != null) {
			this.field2780[var1][var2] = null;
			if ((this.field2773[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field2831 == var5.field2831 && var5.field2819 < 0 && var5 != var4) {
						var4.field2819 = 0;
						break;
					}
				}
			} else {
				var4.field2819 = 0;
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-733972794"
	)
	void method1638(int var1, int var2, int var3) {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2133532598"
	)
	void method1639(int var1, int var2) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "688083182"
	)
	void method1640(int var1, int var2) {
		this.field2765[var1] = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method1641(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2831 == var1) {
				if (var2.stream != null) {
					var2.stream.method239(PcmPlayer.field180 / 100);
					if (var2.stream.method243()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method1693();
				}

				if (var2.field2819 < 0) {
					this.field2780[var2.field2831][var2.field2828] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "13497"
	)
	void method1642(int var1) {
		if (var1 >= 0) {
			this.field2772[var1] = 12800;
			this.field2775[var1] = 8192;
			this.field2770[var1] = 16383;
			this.field2765[var1] = 8192;
			this.field2769[var1] = 0;
			this.field2762[var1] = 8192;
			this.method1645(var1);
			this.method1646(var1);
			this.field2773[var1] = 0;
			this.field2766[var1] = 32767;
			this.field2771[var1] = 256;
			this.field2774[var1] = 0;
			this.method1648(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method1642(var1);
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1903106973"
	)
	void method1643(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2831 == var1) && var2.field2819 < 0) {
				this.field2780[var2.field2831][var2.field2828] = null;
				var2.field2819 = 0;
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1073460150"
	)
	void method1644() {
		this.method1641(-1);
		this.method1642(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2767[var1] = this.field2763[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2764[var1] = this.field2763[var1] & -128;
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1165288902"
	)
	void method1645(int var1) {
		if ((this.field2773[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2831 == var1 && this.field2780[var1][var2.field2828] == null && var2.field2819 < 0) {
					var2.field2819 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1448952082"
	)
	void method1646(int var1) {
		if ((this.field2773[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2831 == var1) {
					var2.field2829 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1513062170"
	)
	void method1647(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method1637(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method1635(var3, var4, var5);
			} else {
				this.method1637(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method1638(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2764[var3] = (var5 << 14) + (this.field2764[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2764[var3] = (var5 << 7) + (this.field2764[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2769[var3] = (var5 << 7) + (this.field2769[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2769[var3] = var5 + (this.field2769[var3] & -128);
			}

			if (var4 == 5) {
				this.field2762[var3] = (var5 << 7) + (this.field2762[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2762[var3] = var5 + (this.field2762[var3] & -128);
			}

			if (var4 == 7) {
				this.field2772[var3] = (var5 << 7) + (this.field2772[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2772[var3] = var5 + (this.field2772[var3] & -128);
			}

			if (var4 == 10) {
				this.field2775[var3] = (var5 << 7) + (this.field2775[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2775[var3] = var5 + (this.field2775[var3] & -128);
			}

			if (var4 == 11) {
				this.field2770[var3] = (var5 << 7) + (this.field2770[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2770[var3] = var5 + (this.field2770[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2773;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2773;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2773;
					var10000[var3] |= 2;
				} else {
					this.method1645(var3);
					var10000 = this.field2773;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2766[var3] = (var5 << 7) + (this.field2766[var3] & 127);
			}

			if (var4 == 98) {
				this.field2766[var3] = (this.field2766[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2766[var3] = (var5 << 7) + (this.field2766[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2766[var3] = (this.field2766[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method1641(var3);
			}

			if (var4 == 121) {
				this.method1642(var3);
			}

			if (var4 == 123) {
				this.method1643(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2766[var3];
				if (var6 == 16384) {
					this.field2771[var3] = (var5 << 7) + (this.field2771[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2766[var3];
				if (var6 == 16384) {
					this.field2771[var3] = var5 + (this.field2771[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2774[var3] = (var5 << 7) + (this.field2774[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2774[var3] = var5 + (this.field2774[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2773;
					var10000[var3] |= 4;
				} else {
					this.method1646(var3);
					var10000 = this.field2773;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method1648(var3, (var5 << 7) + (this.field2776[var3] & -16257));
			}

			if (var4 == 49) {
				this.method1648(var3, var5 + (this.field2776[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method1634(var3, var4 + this.field2764[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method1639(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method1640(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method1644();
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "37"
	)
	void method1648(int var1, int var2) {
		this.field2776[var1] = var2;
		this.field2768[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lma;B)I",
		garbageValue = "1"
	)
	int method1649(MusicPatchNode var1) {
		int var2 = (var1.field2822 * var1.field2827 >> 12) + var1.field2821;
		var2 += (this.field2765[var1.field2831] - 8192) * this.field2771[var1.field2831] >> 12;
		MusicPatchNode2 var3 = var1.field2834;
		int var4;
		if (var3.field2733 > 0 && (var3.field2731 > 0 || this.field2769[var1.field2831] > 0)) {
			var4 = var3.field2731 << 2;
			int var5 = var3.field2732 << 1;
			if (var1.field2830 < var5) {
				var4 = var4 * var1.field2830 / var5;
			}

			var4 += this.field2769[var1.field2831] >> 7;
			double var6 = Math.sin((double)(var1.field2824 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field180 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lma;I)I",
		garbageValue = "-305726576"
	)
	int method1650(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2834;
		int var3 = this.field2772[var1.field2831] * this.field2770[var1.field2831] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2818 + 16384 >> 15;
		var3 = var3 * this.field2758 + 128 >> 8;
		if (var2.field2736 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2736 * 1.953125E-5D * (double)var1.field2817) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2730 != null) {
			var4 = var1.field2825;
			var5 = var2.field2730[var1.field2820 + 1];
			if (var1.field2820 < var2.field2730.length - 2) {
				var6 = (var2.field2730[var1.field2820] & 255) << 8;
				var7 = (var2.field2730[var1.field2820 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2730[var1.field2820 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field2819 > 0 && var2.field2729 != null) {
			var4 = var1.field2819;
			var5 = var2.field2729[var1.field2823 + 1];
			if (var1.field2823 < var2.field2729.length - 2) {
				var6 = (var2.field2729[var1.field2823] & 255) << 8;
				var7 = (var2.field2729[var1.field2823 + 2] & 255) << 8;
				var5 += (var2.field2729[var1.field2823 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lma;B)I",
		garbageValue = "9"
	)
	int method1651(MusicPatchNode var1) {
		int var2 = this.field2775[var1.field2831];
		return var2 < 8192 ? var2 * var1.field2826 + 32 >> 6 : 16384 - ((128 - var1.field2826) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method1657() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2777; var2 == this.trackLength; var3 = this.midiFile.method1672(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2757 || var2 == 0) {
							this.method1644();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method1647(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2777 = var3;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lma;I)Z",
		garbageValue = "1523753941"
	)
	boolean method1658(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2819 >= 0) {
				var1.remove();
				if (var1.field2833 > 0 && var1 == this.field2781[var1.field2831][var1.field2833]) {
					this.field2781[var1.field2831][var1.field2833] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lma;[IIIB)Z",
		garbageValue = "-108"
	)
	boolean method1659(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2832 = PcmPlayer.field180 / 100;
		if (var1.field2819 < 0 || var1.stream != null && !var1.stream.method242()) {
			int var5 = var1.field2827;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2762[var1.field2831] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2827 = var5;
			}

			var1.stream.method240(this.method1649(var1));
			MusicPatchNode2 var6 = var1.field2834;
			boolean var7 = false;
			++var1.field2830;
			var1.field2824 += var6.field2733;
			double var8 = (double)((var1.field2828 - 60 << 8) + (var1.field2827 * var1.field2822 >> 12)) * 5.086263020833333E-6D;
			if (var6.field2736 > 0) {
				if (var6.field2734 > 0) {
					var1.field2817 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2734 * var8) + 0.5D);
				} else {
					var1.field2817 += 128;
				}
			}

			if (var6.field2730 != null) {
				if (var6.field2735 > 0) {
					var1.field2825 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2735 * var8) + 0.5D);
				} else {
					var1.field2825 += 128;
				}

				while (var1.field2820 < var6.field2730.length - 2 && var1.field2825 > (var6.field2730[var1.field2820 + 2] & 255) << 8) {
					var1.field2820 += 2;
				}

				if (var6.field2730.length - 2 == var1.field2820 && var6.field2730[var1.field2820 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2819 >= 0 && var6.field2729 != null && (this.field2773[var1.field2831] & 1) == 0 && (var1.field2833 < 0 || var1 != this.field2781[var1.field2831][var1.field2833])) {
				if (var6.field2737 > 0) {
					var1.field2819 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2737) + 0.5D);
				} else {
					var1.field2819 += 128;
				}

				while (var1.field2823 < var6.field2729.length - 2 && var1.field2819 > (var6.field2729[var1.field2823 + 2] & 255) << 8) {
					var1.field2823 += 2;
				}

				if (var6.field2729.length - 2 == var1.field2823) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method239(var1.field2832);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method243()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method1693();
				if (var1.field2819 >= 0) {
					var1.remove();
					if (var1.field2833 > 0 && var1 == this.field2781[var1.field2831][var1.field2833]) {
						this.field2781[var1.field2831][var1.field2833] = null;
					}
				}

				return true;
			} else {
				var1.stream.method238(var1.field2832, this.method1650(var1), this.method1651(var1));
				return false;
			}
		} else {
			var1.method1693();
			var1.remove();
			if (var1.field2833 > 0 && var1 == this.field2781[var1.field2831][var1.field2833]) {
				this.field2781[var1.field2831][var1.field2833] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1033246315"
	)
	static int method1660(int var0, Script var1, boolean var2) {
		return 2;
	}
}
