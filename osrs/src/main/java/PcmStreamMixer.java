import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	NodeDeque field161;
	@ObfuscatedName("av")
	int field160;
	@ObfuscatedName("as")
	int field159;

	public PcmStreamMixer() {
		super();
		this.subStreams = new NodeDeque();
		this.field161 = new NodeDeque();
		this.field160 = 0;
		this.field159 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("av")
	void method168() {
		if (this.field160 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field161.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field161.previous()) {
				var1.field293 -= this.field160;
			}

			this.field159 -= this.field160;
			this.field160 = 0;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrz;Lcw;)V"
	)
	void method169(Node var1, PcmStreamMixerListener var2) {
		while (this.field161.sentinel != var1 && ((PcmStreamMixerListener)var1).field293 <= var2.field293) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field159 = ((PcmStreamMixerListener)this.field161.sentinel.previous).field293;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lcw;)V"
	)
	void method170(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field161.sentinel.previous;
		if (var2 == this.field161.sentinel) {
			this.field159 = -1;
		} else {
			this.field159 = ((PcmStreamMixerListener)var2).field293;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("ak")
	@Export("vmethod5648")
	protected int vmethod5648() {
		return 0;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field159 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field160 < this.field159) {
				this.field160 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field159 - this.field160;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field160 += var4;
			this.method168();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field161.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field293 = 0;
					this.method170(var5);
				} else {
					var5.field293 = var7;
					this.method169(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("af")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ao")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field159 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field160 + var1 < this.field159) {
				this.field160 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field159 - this.field160;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field160 += var2;
			this.method168();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field161.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field293 = 0;
					this.method170(var3);
				} else {
					var3.field293 = var5;
					this.method169(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("aa")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
