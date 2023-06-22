import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bt")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("at")
	int field248;
	@ObfuscatedName("an")
	int field247;
	@ObfuscatedName("av")
	int[] field250;
	@ObfuscatedName("as")
	int[] field249;

	VorbisMapping() {
		super();
		class60 var1 = VorbisSample.field266;
		var1.method314(16);
		this.field248 = var1.method316() != 0 ? var1.method314(4) + 1 : 1;
		if (var1.method316() != 0) {
			var1.method314(8);
		}

		var1.method314(2);
		if (this.field248 > 1) {
			this.field247 = var1.method314(4);
		}

		this.field250 = new int[this.field248];
		this.field249 = new int[this.field248];

		for (int var2 = 0; var2 < this.field248; ++var2) {
			var1.method314(8);
			this.field250[var2] = var1.method314(8);
			this.field249[var2] = var1.method314(8);
		}

	}
}
