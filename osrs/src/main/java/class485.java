import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
public class class485 extends class443 implements class282 {
	@ObfuscatedName("aw")
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	final AbstractArchive field4037;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	final DemotingHashTable field4036;
	@ObfuscatedName("as")
	final int field4035;

	@ObfuscatedSignature(
		descriptor = "(Lng;ILoj;Lnq;)V"
	)
	public class485(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4036 = new DemotingHashTable(64);
		this.field4037 = var4;
		this.field4035 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lrg;",
		garbageValue = "-1481275551"
	)
	@Export("vmethod8207")
	protected class445 vmethod8207(int var1) {
		synchronized(this.field4036) {
			class444 var2 = (class444)this.field4036.get((long)var1);
			if (var2 == null) {
				var2 = this.method2436(var1);
				this.field4036.method1589(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lrs;",
		garbageValue = "2033867333"
	)
	class444 method2436(int var1) {
		byte[] var2 = this.field4037.takeFile(this.field4035, var1);
		class444 var3 = new class444(var1);
		if (var2 != null) {
			var3.method2289(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2049322638"
	)
	public void method2437() {
		synchronized(this.field4036) {
			this.field4036.clear();
		}
	}

	@Export("iterator")
	@ObfuscatedName("iterator")
	public Iterator iterator() {
		return new class484(this);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-115"
	)
	public static int method2434(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
