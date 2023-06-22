import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("at")
	long field3688;
	@ObfuscatedName("an")
	long field3685;
	@ObfuscatedName("av")
	public boolean field3690;
	@ObfuscatedName("as")
	long field3687;
	@ObfuscatedName("ax")
	long field3689;
	@ObfuscatedName("ap")
	long field3686;
	@ObfuscatedName("ab")
	int field3681;
	@ObfuscatedName("ak")
	int field3684;
	@ObfuscatedName("ae")
	int field3682;
	@ObfuscatedName("af")
	int field3683;

	public Timer() {
		super();
		this.field3688 = -1L;
		this.field3685 = -1L;
		this.field3690 = false;
		this.field3687 = 0L;
		this.field3689 = 0L;
		this.field3686 = 0L;
		this.field3681 = 0;
		this.field3684 = 0;
		this.field3682 = 0;
		this.field3683 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2089124905"
	)
	public void method2109() {
		this.field3688 = BoundaryObject.clockNow();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1927932111"
	)
	public void method2110() {
		if (-1L != this.field3688) {
			this.field3689 = BoundaryObject.clockNow() - this.field3688;
			this.field3688 = -1L;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1221021078"
	)
	public void method2111(int var1) {
		this.field3685 = BoundaryObject.clockNow();
		this.field3681 = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1737596077"
	)
	public void method2112() {
		if (this.field3685 != -1L) {
			this.field3687 = BoundaryObject.clockNow() - this.field3685;
			this.field3685 = -1L;
		}

		++this.field3682;
		this.field3690 = true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "431404039"
	)
	public void method2113() {
		this.field3690 = false;
		this.field3684 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-613072356"
	)
	public void method2114() {
		this.method2112();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "801850388"
	)
	@Export("write")
	public void write(Buffer var1) {
		class280.method1584(var1, this.field3689);
		class280.method1584(var1, this.field3687);
		class280.method1584(var1, this.field3686);
		var1.writeShort(this.field3681);
		var1.writeShort(this.field3684);
		var1.writeShort(this.field3682);
		var1.writeShort(this.field3683);
	}
}
