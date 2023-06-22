import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
class class135 implements Callable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lis;"
	)
	public static class215[] field1275;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class136 this$0;
	// $FF: synthetic field
	@Export("val$workStart")
	@ObfuscatedName("val$workStart")
	final int val$workStart;
	// $FF: synthetic field
	@Export("val$workEnd")
	@ObfuscatedName("val$workEnd")
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Leg;"
	)
	@Export("val$curveLoadJobs")
	@ObfuscatedName("val$curveLoadJobs")
	final class128[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfz;II[Leg;)V"
	)
	class135(class136 var1, int var2, int var3, class128[] var4) {
		super();
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	@Export("call")
	@ObfuscatedName("call")
	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Llj;",
		garbageValue = "1017659250"
	)
	public static ZoneOperation[] method715() {
		return new ZoneOperation[]{ZoneOperation.field2586, ZoneOperation.field2582, ZoneOperation.field2587, ZoneOperation.field2585, ZoneOperation.field2588, ZoneOperation.field2584, ZoneOperation.field2578, ZoneOperation.field2581, ZoneOperation.field2579, ZoneOperation.field2580, ZoneOperation.field2583};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "36"
	)
	static int method716(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "844519050"
	)
	static int method717() {
		return Login.loginIndex;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "49"
	)
	static int method718(int var0, Script var1, boolean var2) {
		return 2;
	}
}
