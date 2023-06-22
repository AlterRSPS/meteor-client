import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class485 HitSplatDefinition_cachedSprites;
	// $FF: renamed from: id int
	@ObfuscatedName("at")
	@Export("id")
	int field_20;
	@ObfuscatedName("an")
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("av")
	@Export("plane")
	int plane;
	// $FF: renamed from: x int
	@ObfuscatedName("as")
	@Export("x")
	int field_21;
	// $FF: renamed from: y int
	@ObfuscatedName("ax")
	@Export("y")
	int field_22;
	// $FF: renamed from: z int
	@ObfuscatedName("ap")
	@Export("z")
	int field_23;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ak")
	@Export("frame")
	int frame;
	@ObfuscatedName("ae")
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("af")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		super();
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.field_20 = var1;
		this.plane = var2;
		this.field_21 = var3;
		this.field_22 = var4;
		this.field_23 = var5;
		this.cycleStart = var7 + var6;
		int var8 = class53.SpotAnimationDefinition_get(this.field_20).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = WorldMapLabelSize.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-20"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.method1083()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class53.SpotAnimationDefinition_get(this.field_20);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lmb;Lmk;ZI)V",
		garbageValue = "1991291892"
	)
	public static void method417(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7;
		var0.field3058 = new PlayerComposition(var1);
		if (!var2) {
			var0.field3058.equipment = Arrays.copyOf(var0.field3058.field2869, var0.field3058.field2869.length);
			var0.field3058.method1728();
		}

	}

	public GraphicsObject() {
		super();
	}
}
